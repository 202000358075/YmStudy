package adapter;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wash wash=new Wash();
		
		turnOn(wash);
		
		TV tv=new TV();//旧代码
		TreeElectricAdapter adapter=new TreeElectricAdapter(tv);

		turnOn(adapter);
		

	}
	
	
	public static void turnOn(ThreeElectricOutlet tripOutlet) {//目前的核心业务
		
		tripOutlet.connectElectricCurrent3();
		
	}

}
