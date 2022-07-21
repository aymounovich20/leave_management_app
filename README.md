# Leave Management System
## Simple Application For Managing Employee Leaves.

### Description
Leave Management System is a web application for managing employee leaves. This application provides all the things that a project/team needs. Through this application one can easily manage leaves. Application maintenance is easy.

### Requirements
* Java 7 or higher.
* Maven
* Postgres Database
* Run on Tomcat 7 (you can run on later versions)

### How To Run
* As it's a Maven Project, you can call `mvn install` in terminal(in project directory) to get a war file.(You can find it in **target** folder)
* You need to have Postgres database to import tables from app-DB-Script.sql (`psql -U postgres lms < app-DB-Script.sql`).
* Default username is `manager@email.com` and password is `123456`.
* You can find the file **app-DB-Script.sql**  in **resources** folder.
* Deploy the war file to the tomcat server and visit localhost:8080/leave-management-system

