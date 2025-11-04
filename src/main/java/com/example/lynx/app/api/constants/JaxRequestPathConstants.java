package com.example.lynx.app.api.constants;

import com.example.lynx.core.b.exceptions.JaxForbiddenConstructorException;

public final class JaxRequestPathConstants
{
  private JaxRequestPathConstants() { throw JaxForbiddenConstructorException.create(JaxRequestPathConstants.class); }

  public static final String API = "/api/v" + JaxApiConstants.VERSION;

    public static final String API_AUTH = API + "/auth";

      public static final String API_AUTH_ACCOUNT = API_AUTH + "/account";
        public static final String API_AUTH_ACCOUNT_ACCESS = API_AUTH_ACCOUNT + "/access";
        public static final String API_AUTH_ACCOUNT_REFRESH = API_AUTH_ACCOUNT + "/refresh";

      public static final String API_AUTH_PROFILE = API_AUTH + "/profile";
        public static final String API_AUTH_PROFILE_ACCESS = API_AUTH_PROFILE + "/access";
        public static final String API_AUTH_PROFILE_REFRESH = API_AUTH_PROFILE + "/refresh";

      public static final String API_AUTH_SESSION = API_AUTH + "/session";

        public static final String API_AUTH_SESSION_DESTROY = API_AUTH_SESSION + "/destroy";

        public static final String API_AUTH_SESSION_TOKEN = API_AUTH_SESSION + "/token";
          public static final String API_AUTH_SESSION_TOKEN_EXCHANGE = API_AUTH_SESSION_TOKEN + "/exchange";

    public static final String API_ACCOUNTS = API + "/accounts";
      public static final String API_ACCOUNTS_REGISTER = API_ACCOUNTS + "/register";
        public static final String API_ACCOUNTS_REGISTER_VERIFY_EMAIL = API_ACCOUNTS_REGISTER + "/verify-email";
    
    public static final String API_SESSIONS = API + "/sessions";
}
