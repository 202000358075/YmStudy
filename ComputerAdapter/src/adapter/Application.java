package adapter;

public class Application {


	public static void main(String[] args) {
		NewComputer newComputer=new NewComputer();
		turnOn(newComputer);
		
		OldComputer oldComputer=new OldComputer();//�ɴ���
		HDMIAdapter adapter=new HDMIAdapter(oldComputer);
		turnOn(adapter);
	}
	
    public static void turnOn(HDMI_Interface hi) {//Ŀǰ�ĺ���ҵ��
		
		hi.connectHDMI();
		
	}
}
