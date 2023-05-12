package day11.inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger =new Tiger();
		
		Animal[] animals = {dog, cat, tiger};
		for(Animal ani : animals) {
			ani.eat(); //Animal의 기능
		}
		
		//dog, cat은 인터페이스 타입으로 형변환이 됩니다.
		//dog, cat, goldfish를 저장하고, IPet의 기능을 사용
		IPet[] pets = new IPet[3];
		
		pets[0] = (IPet)dog;
		pets[1] = (IPet)cat;
		pets[2] = new GoldFish();
		
//		IPet fish= new GoldFish();
//		IPet d = (Dog)dog;
//		IPet c = (Cat)cat;
//		
//		pets[0] = fish;
//		pets[1] = d;
//		pets[2] = c;
		
		for(IPet p: pets) {
			p.play();
		}
		
		System.out.println("----------------------");
		
		PetHouse.carePet( (IPet)dog );
		PetHouse.carePet( (IPet)cat );
		PetHouse.carePet( pets[2] );
		
		
		
		
	}
}
