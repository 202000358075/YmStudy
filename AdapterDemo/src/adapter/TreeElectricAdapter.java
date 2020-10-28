package adapter;

public class TreeElectricAdapter implements ThreeElectricOutlet {

	TwoElectricOutlet outlet;

	TreeElectricAdapter(TwoElectricOutlet outlet) {
		this.outlet = outlet;
	}

	@Override
	public void connectElectricCurrent3() {
		// TODO Auto-generated method stub
		outlet.connectElectricCurrent2();

	}

}
