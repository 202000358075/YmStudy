package factory;

public class Amorolfine extends Drug{
	Amorolfine(){
		name="���ᰢĪ�޷�";
		component="222";
		content="bbb";
	}
	@Override
	public void writeComponent() {
		// TODO Auto-generated method stub
		 System.out.println("�ɷ�Ϊ��"+component+"����Ϊ:"+content);
	}
	/*
	 * @Override public void writeComponent(String s) { // TODO Auto-generated
	 * method stub System.out.println("������"+name+"ҩ"+component+"�ĳɷ�:"+content+s); }
	 */

	/*
	 * @Override public void writeContent(String s) { // TODO Auto-generated method
	 * stub System.out.println("����"+component+"�ĳɷ�:"+content+s); }
	 */

}
