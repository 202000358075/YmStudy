package adapter;

public class NewComputer implements HDMI_Interface{
	
	
	String name;
	NewComputer(){
       name="�µ���";
    }
	NewComputer(String s){
       name=s;
    }
	
    public void turnOn(){
        System.out.println(name+"�����ӡ�");
     }


	@Override
	public void connectHDMI() {
		// TODO Auto-generated method stub
		turnOn();
	}

}
