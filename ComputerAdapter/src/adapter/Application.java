package adapter;

public class Application {


	public static void main(String[] args) {
		NewComputer newComputer=new NewComputer();
		turnOn(newComputer);
		
		OldComputer oldComputer=new OldComputer();//旧代码
		HDMIAdapter adapter=new HDMIAdapter(oldComputer);
		turnOn(adapter);
	}
	
    public static void turnOn(HDMI_Interface hi) {//目前的核心业务
		
		hi.connectHDMI();
		
	}
}
