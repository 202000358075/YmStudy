package observers;

import java.io.File;
import java.io.RandomAccessFile;

public class Flow implements Observer{
	Subject subject;
	Flow(Subject subject){
	      this.subject=subject;
	      subject.addObserver(this);     //ʹ��ǰʵ����Ϊsubject�����õľ�������Ĺ۲���
	   }
	@Override
	public void hearTelephone(String heardMess) {
		// TODO Auto-generated method stub
		boolean boo=heardMess.contains("����");
		 if(boo){ 

             System.out.print("������������"); 
             System.out.println("���ܵ�����Ϣ��"+heardMess);
           }
           else{
              System.out.println("��������,��ε���Ϣ��û����Ҫ�ҷ���");
           } 
	}

}
