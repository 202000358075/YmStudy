package factory;

public abstract class DrugStore {
	DrugStore(){
		  System.out.println("������"+getDrug().name+"ҩ");
	}
	 public abstract Drug getDrug(); //��������
}
