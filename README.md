# spring-boot-security-awareness-workshop

This sample project contains several potential security issues. This sample project is for training purpose. 

> Do not run this app in production.

## Prerequisites

* Java 8
* Apache Maven

## Build

    mvn verify

## Run

    mvn spring-boot:run 

## Test

The following examples use httpie, you can also use curl or postman.

Create patient as User

    http --auth user POST :8080/patients bsn=123456782 birthDate=1981-11-09 firstName=Albert lastName=Hart
    
List patients as User

    http --auth user :8080/patients
    
Open patient summary in browser as User

    open http://localhost:8080/patients/1/summary
    
Update BSN as Admin

    http --auth admin POST :8080/admin/patients/1/modify-bsn bsn=123456782

Export patient ids as Admin

    http --auth admin :8080/admin/export-ids Accept:text/plain

## Docker

Build Docker Image

    docker build -t spring-boot-security-awareness-workshop .

Run Docker Image

    docker run --rm -p 8080:8080 spring-boot-security-awareness-workshop
