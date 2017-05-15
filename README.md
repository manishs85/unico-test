# unico-test
unico code assignment
This is the solution for unico code assignment, which can be executed based on following information:

GENERAL
1. An Instance of MySQL DB server must be present for databse instance.
2. Sql scripts provided in this project need to be executed for creating the database and tables.
   script location : /hibernate/sql/CreateScript.sql
3. An application server would be required to host the application. 
4. The solution consites of 3 maven projects with all dependencies needed listed in the respective pom.xml:
  	a. hibernate (common project imported in the build path of other 2 projects) - responsible for Hibernate based actions.
  	b. service (REST service project)
  	c. soap (SOAP service project)

REST Service URL:
PUSH service : server:port/service/push?num1=<>&num2=<>
LIST service : server:port/service/list?
1. For security a MD5 Hash of key=unico@123 (9pWakfy5q1cVQP453yzJQQ==) has to be passed as along with the required parameters.

SOAP Service WSDL :
1. server:port/SOAPWebservice/GcdProcessor?wsdl
2. SOAP services are tested using SOAPUI.
