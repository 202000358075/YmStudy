package factory;

public class Paracetamol extends Drug{
	Paracetamol(){
		name="���ӻ���";
		component="111";
		content="aaa";
      }
	@Override
	public void writeComponent() {
			// TODO Auto-generated method stub
		System.out.println("�ɷ�Ϊ��"+component+"����Ϊ:"+content);
	}

/*	@Override
	public void writeComponent(String s) {
		// TODO Auto-generated method stub
		  System.out.println("������"+name+"ҩ"+component+"�ĳɷ�:"+content+s);
	}
*/
	/*
	 * @Override public void writeContent(String s) { // TODO Auto-generated method
	 * stub System.out.println("����"+content+""+s); }
	 */
}
