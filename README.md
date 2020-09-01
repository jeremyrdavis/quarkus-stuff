Install the domain with:
```shell

mvn clean install

```

Build and run the app with:

```shell

./mvnw clean package -Pnative -Dquarkus.native.container-build=true
docker build -f src/main/docker/Dockerfile.native -t DOCKERHUB_USERNAME/quarkus-stuff
docker run -p 8080:8080 DOCKERHUB_USERNAME/quarkus-stuff:latest

```
