package factory;

public class Paracetamol extends Drug{
	Paracetamol(){
		name="氨加黄敏";
		component="111";
		content="aaa";
      }
	@Override
	public void writeComponent() {
			// TODO Auto-generated method stub
		System.out.println("成分为："+component+"分量为:"+content);
	}

/*	@Override
	public void writeComponent(String s) {
		// TODO Auto-generated method stub
		  System.out.println("制造了"+name+"药"+component+"的成分:"+content+s);
	}
*/
	/*
	 * @Override public void writeContent(String s) { // TODO Auto-generated method
	 * stub System.out.println("制造"+content+""+s); }
	 */
}
