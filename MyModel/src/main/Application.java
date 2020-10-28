package main;

public class Application {
 public static void main(String[] args) {

		Light light = new Light();
		Command command1 = new LightCommand(light);
		
		Camera Camera = new Camera();
		Command command2 = new CameraCommand(Camera);
		
		Person p = new Person();
		
		
		p.setCommand(command1);
		p.open();
		p.close();
		
		p.setCommand(command2);
		p.open();
		p.close();
 } 
}
