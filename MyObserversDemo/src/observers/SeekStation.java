package observers;

import java.util.ArrayList;

public class SeekStation implements Subject{
	  String mess;
	  boolean changed;
	  ArrayList<Observer> personList; 
	  SeekStation(){
	     personList=new ArrayList<Observer>();
	     mess=""; 
	     changed=false; 
	  }
	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
	     if(!(personList.contains(o)))
	         personList.add(o);
	}

	@Override
	public void deleteObserver(Observer o) {
		// TODO Auto-generated method stub
	     if(personList.contains(o))
	         personList.remove(o); 
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
	    if(changed){for(int i=0;i<personList.size();i++){
	        Observer observer=personList.get(i);
	        observer.hearTelephone(mess); }
	      changed=false; 
	   }
	}
	public void giveNewMess(String str){
		   if(str.equals(mess))
		         changed=false;
		   else{
		         mess=str;
		         changed=true;
		   }
	}
}
