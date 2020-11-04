package observers;

public class Velocity implements Observer{
	Subject subject;
	Velocity(Subject subject){
	      this.subject=subject;
	      subject.addObserver(this);     //使当前实例成为subject所引用的具体主题的观察者
	   }
	@Override
	public void hearTelephone(String heardMess) {
		// TODO Auto-generated method stub
		boolean boo=heardMess.contains("流速");
		 if(boo){ 

            System.out.print("我是流速测量"); 
            System.out.println("接受到的信息："+heardMess);
          }
          else{
             System.out.println("我是流速,这次的信息中没有需要我反馈");
          } 
	
	}

}
