# **Lynx**

<p>Welcome to Lynx!</p>

---

# **Details**

<p><strong>Name:</strong> Lynx</p>
<p><strong>Owner:</strong> Jack</p>
<p><strong>Created:</strong> 11/02/2025</p>
<p><strong>Description:</strong> This is my first reactive Spring Boot application.</p>

---

# **Spring Initializer**

**Project**
- [ ] Gradle - Groovy
- [ ] Gradle - Kotlin
- [x] Maven

**Language**
- [x] Java
- [ ] Kotlin
- [ ] Groovy

**Spring Boot**
- [ ] 4.0.0 (SNAPSHOT)
- [ ] 4.0.0 (RC1)
- [ ] 3.5.8 (SNAPSHOT)
- [x] 3.5.7
- [ ] 3.4.12 (SNAPSHOT)
- [ ] 3.4.11

**Project Metadata**
- **Group:** com.example
- **Artifact:** lynx
- **Name:** lynx
- **Description:** This is my first reactive Spring Boot application called Lynx.
- **Package name:** com.example.lynx

**Packaging**
- [x] Jar
- [ ] War

**Configuration**
- [ ] Properties
- [x] YAML

**Java**
- [ ] 25
- [x] 21
- [ ] 17

**Dependencies:**
- Spring Boot DevTools
- Spring Configuration Processor
- Docker Compose Support
- Lombok
- Spring Reactive Web
- Spring for GraphQL
- Spring Data R2DBC
- PostgresSQL Driver
- Spring Data Reactive Redis
- Spring Data Reactive MongoDB
- WebSocket
- Spring Boot Actuator

---

<br />

# **Flyway**

### **Flyway Core**

``` xml
<dependency>
  <groupId>org.flywaydb</groupId>
  <artifactId>flyway-core</artifactId>
</dependency>
```

---

### **Flyway PostgresSQL**

``` xml
<dependency>
  <groupId>org.flywaydb</groupId>
  <artifactId>flyway-database-postgresql</artifactId>
</dependency>
```

### **Flyway Plugin**

``` xml
<plugin>
  <groupId>org.flywaydb</groupId>
  <artifactId>flyway-maven-plugin</artifactId>
  <configuration>
    <cleanDisabled>false</cleanDisabled>
    <url>${env.PSQL_URL}</url>
    <user>${env.PSQL_USERNAME}</user>
    <password>${env.PSQL_PASSWORD}</password>
  </configuration>
</plugin>
```

---

# **Comments**

<code><strong>11/02/2025</strong></code>

<p>As of this moment, Lynx is officially in development.</p>

<p>I have a lot of work to do.</p>

<code><strong>11/02/2025 - 11:36 PM</strong></code>

<p>I just finished working on the <code>compose.yaml</code> file. I commented out the stuff for MongoDB since I don't have that set up yet, but PostgresSQL and Redis are set up and functioning properly.</p>

<code><strong>11/03/2025 - 1:41 AM</strong></code>

<p>I just added a core exception package and some core exceptions to go along with it.</p>

<p>I spent more time than I'd like to admit determining the best way to handle the threat of the circular dependency that would arise if I haphazzardly used one of my core exceptions in the core exception package.</p>

<code><strong>11/03/2025 - 5:54 PM</strong></code>

<p>I just added some more stuff to the core package and documented the opaque token value utility.</p>

<code><strong>11/03/2025 - 7:50 PM</strong></code>

<p>I added the <code>Spring Security</code> dependency from the Spring Boot Starters menu in <code>pom.xml</code> because I needed it, specifically for my <code>SecurityConfig.java</code> file.</p>

<p>I'm trying a new project structure with names and numbers. The goal is to eliminate the threat of circular dependencies and make it clear what everything depends on, so that whenever I change something down the line, I'll know what can and can't be affected by that change.</p>

<code><strong>11/04/2025 - 12:36 AM</strong></code>

<p>The new project structure I tried with the names and numbers was a failure. It became extremely difficult to find anything, and moving one thing could mean that I need to move a bunch of things up or down levels. Overall, no bueno. However, I evolved the idea into a new concept... one where I use convential package names, but also use single-letter package names in specific places for the same effect I intended to achieve. I tried nesting the single-letter packages, spacing them beteween the conventional package names, but the same issue as before was the result of that. My new implementation is manifested by using the single-letter package names sparingly, per package that benefits from it, like my <code>core</code> package.</p>

<p>One key realization I've had with this structure is that a file that depends on another file doesn't have to be defined in a new package with an incremented letter... if it makes sense for those files to live together, then they should live together in the same package and never be separated.</p>

<code><strong>11/04/2025 - 2:47 AM</strong></code>

<p>I had to exclude some things in my dependency list to get rid of tomcat so I can use netty. With that, I had to change a few things in my configuration files to support that change. I added Flyway to the project and that's all set up and functional now. I also added some postgres entities.</p>

---

# **The End**

<p>I don't like this reactive stuff.</p>

---
