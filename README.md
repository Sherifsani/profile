# profile — HNG Stage‑0 backend

A minimal Spring Boot microservice that returns a small user profile along with a cat fact fetched from an external API.

## What it is

- Small Spring Boot application (Java 21) that exposes a single endpoint:
  - GET `/me`
  - Returns a JSON object with: `status`, `profile` (email, name, bio), `timestamp`, and `fact` (from catfact.ninja).

## Quickstart

Requirements: Java 21+ and internet access (the service fetches a cat fact).

From the project root run (Unix/macOS):

```bash
./mvnw spring-boot:run
```

Open: http://localhost:8080/me

## Project structure (key files)

- `src/main/java/com/sherif/profile/ProfileApplication.java` — Spring Boot entrypoint
- `src/main/java/com/sherif/profile/ProfileController.java` — REST controller mapping `/me`
- `src/main/java/com/sherif/profile/ProfileService.java` — builds the profile and fetches cat fact
- `src/main/java/com/sherif/profile/Profile.java` — domain model for the profile
- `src/main/java/com/sherif/profile/ProfileResponse.java` — response DTO
- `src/test/java/com/sherif/profile/ProfileApplicationTests.java` — basic Spring context test
- `pom.xml` — Maven config (Java 21, Spring Boot starter web, org.json)
- `blog-cover.svg` — suggested blog cover image (1200x630)
- `blog.md` — dev.to-ready blog post draft

## Notes & TODOs

- The external call is made with Java HttpClient inside `ProfileService`. For testability consider injecting an HttpClient bean or wrapper and mocking it in tests.
- `ProfileService` currently swallows exceptions and returns a friendly message when cat-fact fails; consider adding logging and structured error responses.
- There is an unused import (`netscape.javascript.JSObject`) in `ProfileService.java` that can be removed.

## License

This repository is provided as a small demo for HNG Stage‑0. Use as you like.
