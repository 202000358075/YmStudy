package factory;

public class Amorolfine extends Drug{
	Amorolfine(){
		name="盐酸阿莫罗分";
		component="222";
		content="bbb";
	}
	@Override
	public void writeComponent() {
		// TODO Auto-generated method stub
		 System.out.println("成分为："+component+"分量为:"+content);
	}
	/*
	 * @Override public void writeComponent(String s) { // TODO Auto-generated
	 * method stub System.out.println("制造了"+name+"药"+component+"的成分:"+content+s); }
	 */

	/*
	 * @Override public void writeContent(String s) { // TODO Auto-generated method
	 * stub System.out.println("制造"+component+"的成分:"+content+s); }
	 */

}
