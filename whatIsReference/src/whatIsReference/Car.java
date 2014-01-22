package whatIsReference;

public class Car {
	private String model;
	private String color;
	private int horsePower;
	public Car (String model, String color){
		this.horsePower = 1500;
		this.setModel (model);
		this.color = color;
	}
	
	public Car(){
		this.horsePower = 0;
		this.model= "Empty Car";
		this.color= "Dirty Black";		
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String toString(){
		return color +" "+ model+" hp:"+ horsePower;
	}
	
	public boolean equals(Object obj){
		
		if(obj instanceof Car){
			
		
		Car givenCar = (Car)obj;
		
		if(givenCar.model.equals(this.model)){
			return true;
		}
		return false;
		
	}
		return false;
	}
		
	public int getHorsePower(){
		return horsePower;
	}
	
		
}
