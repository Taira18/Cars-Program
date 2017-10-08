
public class UsedCar extends Car{
	private int mileage;
	public UsedCar(double pri, int mi) {
		super(pri);
		mileage = mi;
	
	}
	
	
	
	public int mi() {
		return mileage;
	}
	
	
	public boolean equals(UsedCar used2) {
		if (this.getPrice() == used2.getPrice()&&this.mi() == used2.mi()) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	public void display() {
		System.out.println("price = "+this.getPrice()+", color = "+mileage);
		
	}

}
