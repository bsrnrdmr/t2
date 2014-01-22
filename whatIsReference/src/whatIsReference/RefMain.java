package whatIsReference;

import java.awt.Point;

public class RefMain {

	public static void main(String [] args){
		Car ford = new Car ("Ford Mustang GT", "Red");
		Car chevrolet = new Car("Chevrolet Impala 69","Black");
		Car ford2 = ford;
		ford.setColor("white");
		Car dumbCar = new Car();
		Car Porshe = new Car("Porshe Cayenne","White");
		Point p = new Point();
		
		System.out.println(dumbCar);
	
		System.out.println(ford.toString());
		System.out.println(chevrolet.toString());
		System.out.println(ford2.toString());
		System.out.println(Porshe);
		
	
	if(ford.equals(p)){
		System.out.println("equal");
	}
	}

}
