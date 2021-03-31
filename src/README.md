# General Description

All the files contained in this project are skeletal versions.

# Folders: Classes and Interface files related to the codebase
client: *CustomerClient*, *CustomerView*  
common: *Administrator*, *Customer*, *Employee*, *IReservation*, *Person*, *Room*  
hotel: *CustomerController*, *RemoteReservation*, *ReservationImpl*  

# Additional Files:
*Hotel.jar*, *HotelUMLDiagram.png*, *Makefile*


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
java -cp Hotel.jar client.CustomerClient
```

