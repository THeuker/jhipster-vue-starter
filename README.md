# JHipster Sample Application

## Node.js and NPM

Before you can build this project, you must install and configure the following dependencies on your machine:

1. [Java](https://nodejs.org/) ^17.0.5: We use java/javac to run & compile the back-end server.
2. [Node.js](https://nodejs.org/) ^18.14.2: We use Node to run a development web server and build the project.

After installing Node, you should be able to run the following command to install development tools.
You will only need to run this command when dependencies change in [package.json](package.json).

```bash
npm install
```

## Local environment

- [Local server](http://localhost:8080)

<!-- jhipster-needle-localEnvironment -->

## Start up

```bash
npm run dev
```

```bash
docker-compose -f src/main/docker/postgresql.yml up -d
```

```bash
./mvnw
```

<!-- jhipster-needle-startupCommand -->

## Documentation

- [Package types](documentation/package-types.md)
- [Assertions](documentation/assertions.md)
- [Logs spy](documentation/logs-spy.md)
- [Postgresql](documentation/postgresql.md)
- [CORS configuration](documentation/cors-configuration.md)
- [Vue](documentation/vue.md)
- [Caffeine](documentation/caffeine.md)
- [Jpa pages](documentation/jpa-pages.md)

<!-- jhipster-needle-documentation -->
