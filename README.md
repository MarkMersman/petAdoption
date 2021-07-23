Project 2 

Pet Adoption Agency Application
Developers:
Mark Mersman
Emmett Riddle
Sydney Porter
Gregory Diaz

The Pet Adoption Agency Application is a web application designed to provide a fictional pet adoption center with an online catalog for customers to adopt pets in the catalog's inventory. This system also allows employees to review and process adoption applications.

Project Description
Pet Adoption Agency's web application is an online catalog that sells Dogs, Cats, Birds, and Fish. Users can access the home page, which displays pets and categorizes pets by their species, breed, and gender. An employee user has the added capability of an Employee Portal, where they can add new pets to the catalog as well as process applications.

Features
As a user you can login/register for an account 
as a user you can search different species and breeds to adopt 
as a user you can apply for adoption of said animal 
as an employee you can login 
as an employee you can manage available pets
as an employee you can accept or decline adoption aplications
as an employee you can request more information from adopter 


Further Development
In future development, we would like to encorporate the below functionalities:

Customers can submit video introduction for consideration
Employee can add new species


Technologies Used
Java
JavaScript
HTML5
CSS
Bootstrap 5
Spring Boot
Spring Data
Spring MVC
Spring Test
JUnit 5
PostgreSQL
AWS RDS
DBeaver
Git
Eclipse
Maven
Visual Studio Code
Spring Modules
Spring Boot
Spring Data JPA
Spring Web MVC
Required Dependencies
The below depencies are required in te pom.xml file in order to ensure proper execution of application.

<dependencies>
		<!-- https://mvnrepository.com/artifact/org.postgresql/postgresql -->
		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<version>42.2.18</version>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		</dependencies>
© 2021 GitHub, Inc.
