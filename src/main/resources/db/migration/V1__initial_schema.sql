CREATE TABLE sessions (
	id uuid NOT NULL,
	name text NOT NULL DEFAULT 'Unknown Device',
	created timestamptz NOT NULL,
	updated timestamptz NOT NULL,
	CONSTRAINT sessions_pkey PRIMARY KEY (id)
);

-- The primary key for this table is also foreign key, which means a session token will have the same id as the session it references.
-- If a session is deleted and a session token references it, the session token will be deleted as well.
CREATE TABLE session_tokens (
	id uuid NOT NULL,
	value char(43) NOT NULL,
	created timestamptz NOT NULL,
	updated timestamptz NOT NULL,
	version smallint DEFAULT 1,
	CONSTRAINT session_tokens_pkey PRIMARY KEY (id),
	CONSTRAINT session_tokens_id_fkey
		FOREIGN KEY (id)
		REFERENCES sessions(id)
		ON UPDATE NO ACTION
		ON DELETE CASCADE,
	CONSTRAINT session_tokens_value_key UNIQUE (value)
);

CREATE TABLE accounts (
	id uuid NOT NULL,
	name text NOT NULL,
	email text NOT NULL,
	password text NOT NULL,
	created timestamptz NOT NULL,
	updated timestamptz NOT NULL,
	CONSTRAINT accounts_pkey PRIMARY KEY (id),
	CONSTRAINT accounts_email_key UNIQUE (email)
);

-- If an account is deleted, any account sessions that reference it will be deleted as well.
-- If a session is deleted, any account sessions that reference it will be deleted as well.
CREATE TABLE account_sessions (
	id uuid NOT NULL,
	account_id uuid NOT NULL,
	session_id uuid NOT NULL,
	created timestamptz NOT NULL,
	CONSTRAINT account_sessions_pkey PRIMARY KEY (id),
	CONSTRAINT account_sessions_account_id_session_id_key UNIQUE (account_id, session_id),
	CONSTRAINT account_sessions_account_id_fkey
		FOREIGN KEY (account_id)
		REFERENCES accounts(id)
		ON UPDATE NO ACTION
		ON DELETE CASCADE,
	CONSTRAINT account_sessions_session_id_fkey
		FOREIGN KEY (session_id)
		REFERENCES sessions(id)
		ON UPDATE NO ACTION
		ON DELETE CASCADE
);

-- The primary key for this table is also a foreign key, which means an account refresh token will have the same id as the account session it references.
-- If an account session is deleted and an account refresh token references it, the account refresh token will be deleted as well.
CREATE TABLE account_refresh_tokens (
	id uuid NOT NULL,
	value char(43) NOT NULL,
	created timestamptz NOT NULL,
	updated timestamptz NOT NULL,
	expires timestamptz NOT NULL,
	version smallint DEFAULT 1,
	CONSTRAINT account_refresh_tokens_pkey PRIMARY KEY (id),
	CONSTRAINT account_refresh_tokens_id_fkey
		FOREIGN KEY (id)
		REFERENCES account_sessions(id)
		ON UPDATE NO ACTION
		ON DELETE CASCADE,
	CONSTRAINT account_refresh_tokens_value_key UNIQUE (value)
);

-- Any attempt to delete an account will fail if that account is referenced by at least one profile.
CREATE TABLE profiles (
	id uuid NOT NULL,
	account_id uuid NOT NULL,
	name text NOT NULL,
	username text NOT NULL,
	password text NOT NULL,
	created timestamptz NOT NULL,
	updated timestamptz NOT NULL,
	CONSTRAINT profiles_pkey PRIMARY KEY (id),
	CONSTRAINT profiles_account_id_fkey
		FOREIGN KEY (account_id)
		REFERENCES accounts(id)
		ON UPDATE NO ACTION
		ON DELETE RESTRICT,
	CONSTRAINT profiles_username_key UNIQUE (username)
);

-- If a profile is deleted, any profile sessions that reference it will be deleted as well.
-- If a session is deleted, any profile sessions that reference it will be deleted as well.
CREATE TABLE profile_sessions (
	id uuid NOT NULL,
	profile_id uuid NOT NULL,
	session_id uuid NOT NULL,
	created timestamptz NOT NULL,
	CONSTRAINT profile_sessions_pkey PRIMARY KEY (id),
	CONSTRAINT profile_sessions_profile_id_session_id_key UNIQUE (profile_id, session_id),
	CONSTRAINT profile_sessions_profile_id_fkey
		FOREIGN KEY (profile_id)
		REFERENCES profiles(id)
		ON UPDATE NO ACTION
		ON DELETE CASCADE,
	CONSTRAINT profile_sessions_session_id_fkey
		FOREIGN KEY (session_id)
		REFERENCES sessions(id)
		ON UPDATE NO ACTION
		ON DELETE CASCADE
);

-- The primary key for this table is also a foreign key, which means a profile refresh token will have the same id as the profile session it references.
-- If a profile session is deleted and a profile refresh token references it, the profile refresh token will be deleted as well.
CREATE TABLE profile_refresh_tokens (
	id uuid NOT NULL,
	value char(43) NOT NULL,
	created timestamptz NOT NULL,
	updated timestamptz NOT NULL,
	expires timestamptz NOT NULL,
	version smallint DEFAULT 1,
	CONSTRAINT profile_refresh_tokens_pkey PRIMARY KEY (id),
	CONSTRAINT profile_refresh_tokens_id_fkey
		FOREIGN KEY (id)
		REFERENCES profile_sessions(id)
		ON UPDATE NO ACTION
		ON DELETE CASCADE,
	CONSTRAINT profile_refresh_tokens_value_key UNIQUE (value)
);
