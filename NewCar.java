
public class NewCar extends Car {
	private String color;
	public NewCar(double pri, String col) {
		super(pri);
		color = col;
	}
	
	public boolean equals(NewCar car2) {
		if (this.getPrice() == car2.getPrice()&&this.color == car2.color) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public String color() {
		return color;
	}
	
	public void display() {
		System.out.println("price = "+this.getPrice()+", mileage = "+color);
		
	}

}
