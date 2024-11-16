package deneme1;

public class AbstractClasses {
	abstract class Shape {
	    abstract void draw(); 
	    void display() {
	        System.out.println("şekil "); 
	    }
	}

	class Circle extends Shape {
	    @Override
	    void draw() {
	        System.out.println("daire ciziliyor");
	    }
	}

}
