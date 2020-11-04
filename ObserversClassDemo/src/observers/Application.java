package observers;

public class Application{
	   public static void main(String args[]){
	      SeekJobCenter center=new SeekJobCenter();           
	      UniversityStudent zhangLin=new UniversityStudent(center,"A.txt");
	      HaiGui wangHao=new HaiGui(center,"B.txt");          
	      center.giveNewMess("腾辉公司需要10个java程序员。");   
	      center.notifyObservers();  
	      System.out.println("---------------------------------");
	      center.giveNewMess("海景公司需要8个动画设计师。");
	      center.notifyObservers();
	      System.out.println("---------------------------------");
	      center.giveNewMess("仁海公司需要9个电工。");
	      center.notifyObservers();
	      System.out.println("---------------------------------");
	      center.giveNewMess("仁海公司需要9个电工。"); //与上面信息一致不显示   
	      center.notifyObservers();                       
	}
}