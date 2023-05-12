package day08.encap.obj;

public class Hotel {
	
	private Chef chef;
	
	//호텔은 생성될 때 외부에서 chef객체를 받는다.
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	//setter
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	//getter
	public Chef getChef() {
		return chef;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
