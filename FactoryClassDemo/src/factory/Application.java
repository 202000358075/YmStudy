package factory;

public class Application {
	 public static void main(String args[]){
	 
	       Drug drug;
	       DrugStore drugStrore=new AmorolfineDrugStore();
	       drug=drugStrore.getDrug();
	       drug.writeComponent();
	       
	       drugStrore=new ParacetamolDrugStore();
	       drug=drugStrore.getDrug();
	      drug.writeComponent();
	       
	       

		 
		 
	 }
}
