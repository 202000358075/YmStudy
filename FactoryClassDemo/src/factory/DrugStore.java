package factory;

public abstract class DrugStore {
	DrugStore(){
		  System.out.println("生产了"+getDrug().name+"药");
	}
	 public abstract Drug getDrug(); //工厂方法
}
