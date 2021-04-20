# General Description

All the files contained in this project are skeletal versions.  Both source code and compiled versions are present.  

UPDATE APRIL 19, 2021: Numerous Interfaces and Classes have been added to extend functionality.  New packages have been created for better organization. The Makefile has been modified to support linux only.  

OUTLINE OF HOW AUTHORIZATION FLOW WORKS:  
1. CustomerClient creates an instance of a subclass of Person, such as Administrator, Customer, or Employee, which requires a role to be assigned to the instance upon instantiation.  One of each type of subclass has been created.  
2. Each attempts to login(Person user); the LoginImpl acts as a FrontController by calling user.getRole() to check the user's Role Type;  
3. Based on the user's role type, the login controller creates the appropriate Controller class, and then calls the Controllers' returnView() function.  
4. If a user has no role, the ErrorView is returned by default.
5. LoginImpl, which runs on the server, then returns to the CustomerClient the appropriate view based on the user's role Type.  

# Folders: Classes and Interface files related to the codebase
client.customer: *CustomerClient*  
common.controllers: *AdminController*, *Controller*, *CustomerController*, *EmployeeController*  
common.interfaces: *ILogin*, *IReservation*, *IReturnView*, *IView*  
common.roles: *Admin*, *CUser*, *PowerUser*, *Role*  
common.users: *Administrator*, *Customer*, *Employee*, *Person*  
common.views: *AdminView*, *CustomerView*, *EmployeeView*, *ErrorView*, *UserView*  
common: *Room*  
hotel: *LoginImpl*, *RemoteOperation*, *ReservationImpl*

# Additional Files:
*Hotel.jar*, *HotelUMLDiagram.png*, *Makefile*, *RMI-Demonstration.png*

# About RMI-Demonstration.png:
Shows RMI demonstration of .jar file from two separate locations.

# About Makefile:
Makefile can be used to compile the entire project.  Simply run 'make' while in the same directory as Makefile:
```bash
make
```
or ```make LinuxMakeFile``` for linux.

A source-code only version of the project is available as well for testing.

# Execute Hotel.jar
Note: Default main() in jar file contains a static variable of type Registry that has LocateRegistry.createRegistry(1099) as its value.  
Note: running the Hotel.jar should start the RMI Registry by default.  
To perform example of RMI execution do the following:  

Start the server:
```bash
java -jar Hotel.java
```

Then open up another terminal and type the command to send communication via RMI:  
```bash
java -cp Hotel.jar client.customer.CustomerClient
```

