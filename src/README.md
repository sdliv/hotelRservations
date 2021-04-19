# General Description

All the files contained in this project are skeletal versions.  Both source code and compiled versions are present.

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

