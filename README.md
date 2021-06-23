# movie-app-ui

##Build and Run
```
mvn install
mvn spring-boot:run -Dspring-boot.run.jvmArguments="-DMOVIE_APP_URL=http://10.224.122.17:30003/api"
```

By default the application runs on localhost:8081

##Swagger
```
http://localhost:8081/swagger-ui.html
```

##Docker

###Run:
```
 docker build -t movie-app-ui-docker . -f docker/Dockerfile
 docker run -d -p 8081:8081 -t movie-app-ui-docker:latest --MOVIE_APP_URL="http://10.224.122.17:30003/api"
```
###Stop:
```
 docker ps -l
 docker stop <CONTAINER ID>
```
###Push to repository:
```
 docker commit -a "Hemanth Siriki" <Container ID> containers.cisco.com/hesiriki/movie-app-ui:latest
 docker push containers.cisco.com/hesiriki/movie-app-ui:latest
```
```
 docker image tag movie-app-docker containers.cisco.com/hesiriki/movie-app-ui:latest
 docker image rm <imageID> -f (force delete image)
 
 pull:
 docker pull containers.cisco.com/hesiriki/movie-app:latest
```
