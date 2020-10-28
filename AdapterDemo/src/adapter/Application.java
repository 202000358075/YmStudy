package adapter;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wash wash=new Wash();
		
		turnOn(wash);
		
		TV tv=new TV();//�ɴ���
		TreeElectricAdapter adapter=new TreeElectricAdapter(tv);

		turnOn(adapter);
		

	}
	
	
	public static void turnOn(ThreeElectricOutlet tripOutlet) {//Ŀǰ�ĺ���ҵ��
		
		tripOutlet.connectElectricCurrent3();
		
	}

}
