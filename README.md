# Guia Escalada
Proyecto para la realización de una guia de escalada

## Descripción
La aplicación será una guia de todas las rutas

## Configuration for PostgreSQL

### Without Docker

1. You will need to install *postgres* in your machine and configure it.
2. Update your *application.properties* file according to your local *postgres* configuration

### With Docker

1. Build the *postgresql* image called climbingguide_db

    `docker build -t climbingguide_db src/main/docker`
    
2. Run the container

    `docker run --name climbingguide_postgres -p 5432:5432 -d climbingguide_db`
    
3. Verify if the container is running

    `docker ps`
    
4. Verify that the environment variables in *Dockerfile* are the same in your *application.properties* file 

    * spring.datasource.url= jdbc:postgresql://localhost:5432/climbingguide
    * spring.datasource.username=postgres
    * spring.datasource.password=mysecretpassword
    
5. Execute the sql schema in your database

    * You have the DDL in `src/main/resources/db/db_schema.sql`
    
6. Enjoy coding!

7. If you want to stop your container:

    `docker stop climbingguide_postgres`
    
8. If you want to restart the container:
        
     `docker restart climbingguide_postgres`

