
abstract class Compartment 
{
    public abstract String notice();
}

class FirstClass extends Compartment {

    @Override
    public String notice() {
        return "First Class Compartment";
    }
}

class Ladies extends Compartment {

    @Override
    public String notice() {
        return "Ladies Compartment";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment";
    }
}

class Luggage extends Compartment {

    @Override
    public String notice() {
        return "Luggage Compartment";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] c = new Compartment[10] ;
    }
}
