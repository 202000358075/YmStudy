package observers;

public class Application{
	   public static void main(String args[]){
	      SeekJobCenter center=new SeekJobCenter();           
	      UniversityStudent zhangLin=new UniversityStudent(center,"A.txt");
	      HaiGui wangHao=new HaiGui(center,"B.txt");          
	      center.giveNewMess("�ڻԹ�˾��Ҫ10��java����Ա��");   
	      center.notifyObservers();  
	      System.out.println("---------------------------------");
	      center.giveNewMess("������˾��Ҫ8���������ʦ��");
	      center.notifyObservers();
	      System.out.println("---------------------------------");
	      center.giveNewMess("�ʺ���˾��Ҫ9���繤��");
	      center.notifyObservers();
	      System.out.println("---------------------------------");
	      center.giveNewMess("�ʺ���˾��Ҫ9���繤��"); //��������Ϣһ�²���ʾ   
	      center.notifyObservers();                       
	}
}