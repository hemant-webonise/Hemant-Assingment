package Decorator;
/*Concrete Decorators – Extending the base decorator functionality and modifying the component behavior accordingly. We can have concrete decorator classes as LuxuryCar and SportsCar. */
public class LuxuryCar extends CarDecorator {
	 
    public LuxuryCar(Car c) {
        super(c);
    }
     
    @Override
    public void assemble(){
        car.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}