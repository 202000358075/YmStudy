package adapter;

public class Wash implements ThreeElectricOutlet {
	
	
	String name;
    Wash(){
       name="黄河洗衣机";
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
        System.out.println(name+"开始洗衣物。");
     }


}
