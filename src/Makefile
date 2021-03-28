JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	client\CustomerClient.java \
	client\CustomerView.java \
	common\Administrator.java \
	common\Customer.java \
	common\Employee.java \
	common\IReservation.java \
	common\Person.java \
	common\Room.java \
	hotel\CustomerController.java \
	hotel\RemoteReservation.java \
	hotel\ReservationImpl.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class