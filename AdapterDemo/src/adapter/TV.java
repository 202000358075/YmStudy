package adapter;

public class TV implements TwoElectricOutlet {

    String name;
    TV(){
       name="�������ӻ�";
    }
    TV(String s){
       name=s;
    }
    public void connectElectricCurrent2(){
       turnOn();
    }
    public void turnOn(){
       System.out.println(name+"��ʼ���Ž�Ŀ��");
    }


}
