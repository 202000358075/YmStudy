package observers;

public class Velocity implements Observer{
	Subject subject;
	Velocity(Subject subject){
	      this.subject=subject;
	      subject.addObserver(this);     //ʹ��ǰʵ����Ϊsubject�����õľ�������Ĺ۲���
	   }
	@Override
	public void hearTelephone(String heardMess) {
		// TODO Auto-generated method stub
		boolean boo=heardMess.contains("����");
		 if(boo){ 

            System.out.print("�������ٲ���"); 
            System.out.println("���ܵ�����Ϣ��"+heardMess);
          }
          else{
             System.out.println("��������,��ε���Ϣ��û����Ҫ�ҷ���");
          } 
	
	}

}
