package adapter;

public class OldComputer implements VGA_Interface{

	  String name;
	  OldComputer(){
	       name="旧电脑";
	    }
	  OldComputer(String s){
	       name=s;
	    }


	@Override
	public void connectVGA() {
		// TODO Auto-generated method stub
		turnOn();
	}
    public void turnOn(){
	       System.out.println(name+"已连接。");
	    }
}
