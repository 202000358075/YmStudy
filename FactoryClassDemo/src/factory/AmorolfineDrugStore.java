package factory;

public class AmorolfineDrugStore extends DrugStore{

	@Override
	public Drug getDrug() {
		// TODO Auto-generated method stub
		return new Amorolfine();
	}
}
