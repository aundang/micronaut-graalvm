## Micronaut 3.8.1 Documentation

- [User Guide](https://docs.micronaut.io/3.8.1/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.8.1/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.8.1/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature serialization-jackson documentation

- [Micronaut Serialization Jackson Core documentation](https://micronaut-projects.github.io/micronaut-serialization/latest/guide/)


## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)


## Basic Commands

### Create Project

```
mn create-app example.micronaut.micronautguide --features=graalvm,serializationjackson --build=maven --lang=java

```

### To build native image:

```
./mvnw.bat package -Dpackaging=native-image

```

### To build docker image
```
./mvnw.bat package -Dpackaging=docker-native -Pgraalvm
```

### To run programm
```
./mvnw.bat mn:run
```


### To run test
```
./mvnw.bat test
```