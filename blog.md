---
title: "A tiny Spring Boot 'profile' microservice — Stage‑0 HNG backend"
published: false
tags: [java, spring, spring-boot, hng, backend, tutorial]
---

I built a minimal Spring Boot service for my HNG Stage‑0 backend task that returns a profile object plus a fun cat fact. The goal was to deliver a clear, runnable microservice in a few files so reviewers can quickly run and inspect the code.

What it does

- Exposes GET /me
- Returns a JSON payload with status, a small user profile (name, role, links), a timestamp, and a cat fact fetched from https://catfact.ninja/fact

Architecture (short)

- `ProfileController` — handles /me and returns a `ProfileResponse` DTO.
- `ProfileService` — builds the profile and fetches the external cat fact using Java HttpClient.
- `Profile` (domain) and `ProfileResponse` (DTO) — simple POJOs for shape and serialization.
- Spring Boot entrypoint and a single minimal unit test to ensure application context loads.

Why this shape?

- Minimal surface area: reviewers can audit the domain, controller, and service quickly.
- External call isolated in the service so it’s easy to mock or replace.
- Small codebase is ideal for early-stage tasks and focused feedback.

How to run locally

- From the project root (uses the included Maven wrapper):

```bash
./mvnw spring-boot:run
```

- Then open: http://localhost:8080/me

What I learned / next steps

- Keep services focused and small for fast review cycles.
- Inject HttpClient (or a wrapper) to make the external API call testable and mockable.
- Add structured error handling and logging for robustness.
- Add unit tests that mock the cat-fact API and an integration test for the controller.

