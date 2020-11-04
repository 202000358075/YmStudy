package factory;

public class ParacetamolDrugStore extends DrugStore{

	@Override
	public Drug getDrug() {
		// TODO Auto-generated method stub
		return new Paracetamol();
	}

}
