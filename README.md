##maven+docker


>1.docker 插件集成,配置docker相关插件
```
//添加properties
<properties>
	<docker.image.prefix>springboot</docker.image.prefix>
</properties>

//添加插件
<build>
	<plugins>
		<plugin>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-maven-plugin</artifactId>
		</plugin>
		<!-- Docker maven plugin -->
		<plugin>
			<groupId>com.spotify</groupId>
			<artifactId>docker-maven-plugin</artifactId>
			<version>1.0.0</version>
			<configuration>
				<imageName>${docker.image.prefix}/${project.artifactId}</imageName>
				<dockerDirectory>src/main/docker</dockerDirectory>
				<resources>
					<resource>
						<targetPath>/</targetPath>
						<directory>${project.build.directory}</directory>
						<include>${project.build.finalName}.jar</include>
					</resource>
				</resources>
			</configuration>
		</plugin>
		<!-- Docker maven plugin -->
	</plugins>
</build>



```

>2.Dockerfile 文件
``` 
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD spring-boot-docker-1.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]


```

>3.打包部署
``` 
clean package  -Dmaven.test.skip=true -Puat dockerfile:build
```

>4.运行容器
``` 
docker run -d --name demo -p 8086[win]:8080[docker] springboot/demo
```