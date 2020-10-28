package adapter;

public class NewComputer implements HDMI_Interface{
	
	
	String name;
	NewComputer(){
       name="新电脑";
    }
	NewComputer(String s){
       name=s;
    }
	
    public void turnOn(){
        System.out.println(name+"已连接。");
     }


	@Override
	public void connectHDMI() {
		// TODO Auto-generated method stub
		turnOn();
	}

}
