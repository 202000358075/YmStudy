package observers;

public class Application {
	 public static void main(String args[]){
		  SeekStation center=new SeekStation();
		  Flow flow=new Flow(center);
		  Velocity velocity=new Velocity(center);
		  center.giveNewMess("ˮ��վ���������");   
	      center.notifyObservers();  
	      System.out.println("---------------------------------");
	      center.giveNewMess("ˮ��վ���������");
	      center.notifyObservers();
	      System.out.println("---------------------------------");
	      center.giveNewMess("ˮ��վ���������");
	      center.notifyObservers();
			
	 }
}
