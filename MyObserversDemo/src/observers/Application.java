package observers;

public class Application {
	 public static void main(String args[]){
		  SeekStation center=new SeekStation();
		  Flow flow=new Flow(center);
		  Velocity velocity=new Velocity(center);
		  center.giveNewMess("水文站需测量流量");   
	      center.notifyObservers();  
	      System.out.println("---------------------------------");
	      center.giveNewMess("水文站需测量流速");
	      center.notifyObservers();
	      System.out.println("---------------------------------");
	      center.giveNewMess("水文站需测量流速");
	      center.notifyObservers();
			
	 }
}
