11. How to create Eureka client?

Add below dependency in pom.xml
<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>

Apart from this dependency you shall also need to add spring-cloud version and repository details
These details you can extract from the commit.

Note:
By default eureka client tries to register with eureka server by using url
localhost:8761/eureka i.e default port of eureka server is 8761.
We can configure the url and port of eureka server and supply this info. to eureka
client as mentioned in https://stackoverflow.com/questions/45615866/changing-default-port-of-eureka-server-using-spring-cloud
but this is not functioning despite many tries.
So we are using default behavior of eureka client and giving port 8761 to eureka server
by mentioing server.port=8761 in eureka-server spring boot application.

12. We can give name to unique identify our eureka client by specifying name
spring.application.name in application.properties file. This name is then considered/displayed
by eureka-server on UI etc.