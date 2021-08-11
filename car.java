import jdk.javadoc.internal.tool.Start;

public class car {
    
    // first we define fields. this is the state of the class and might become the state of an object when this class is used.
    
    boolean started;
    int currentSpeed;
    int currentGear;

    // than we define methods (behavior). This is the behaviour of the class and might used as behavior of the object (= instance) of this class.
    // goal -> when we call these methods, the state of the car changes.

    public void StartCar()
    public void StopCar()
    public void break()
    public void changeGear()

}

// this car class as it looks here is a blueprint for objects.
// and an object is an instance of a class
// based on this template, on this class, we can make many instances of cars: (car 1, car 2, car 3, car 4, etc...) 