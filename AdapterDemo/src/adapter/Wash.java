package adapter;

public class Wash implements ThreeElectricOutlet {
	
	
	String name;
    Wash(){
       name="�ƺ�ϴ�»�";
    }
    Wash(String s){
       name=s;
    }


	@Override
	public void connectElectricCurrent3() {
		// TODO Auto-generated method stub
		turnOn();


	}
	
    public void turnOn(){
        System.out.println(name+"��ʼϴ���");
     }


}
