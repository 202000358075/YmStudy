package observers;

import java.io.File;
import java.io.RandomAccessFile;

public class Flow implements Observer{
	Subject subject;
	Flow(Subject subject){
	      this.subject=subject;
	      subject.addObserver(this);     //使当前实例成为subject所引用的具体主题的观察者
	   }
	@Override
	public void hearTelephone(String heardMess) {
		// TODO Auto-generated method stub
		boolean boo=heardMess.contains("流量");
		 if(boo){ 

             System.out.print("我是流量测量"); 
             System.out.println("接受到的信息："+heardMess);
           }
           else{
              System.out.println("我是流量,这次的信息中没有需要我反馈");
           } 
	}

}
