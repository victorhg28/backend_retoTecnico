# Backend Reto Técnico - Datos
Adjunto algunos datos sobre el proyecto en este readme en caso de que les sea de utilidad.
- version de java: 17
- version de spring: 3.3.5

## endpoints, acceso mediante postman
  - GET: /bus
![postman bus](https://github.com/user-attachments/assets/18cc6208-fdca-4943-adb7-9239f5895247)

- GET: /bus/{id}
![postman bus_id](https://github.com/user-attachments/assets/c2badae3-3ace-49c1-a845-151e475d04aa)


## Base de datos (MySQL)

![buses](https://github.com/user-attachments/assets/c6d8f13b-858f-4c34-b963-c007da000fc1)

![marcas](https://github.com/user-attachments/assets/0d82f707-b7dc-43fd-a4eb-747d66278a7b)

## Dependencias
```
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
</dependencies>
```
