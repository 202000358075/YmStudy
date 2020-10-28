package adapter;

public class TV implements TwoElectricOutlet {

    String name;
    TV(){
       name="长江电视机";
    }
    TV(String s){
       name=s;
    }
    public void connectElectricCurrent2(){
       turnOn();
    }
    public void turnOn(){
       System.out.println(name+"开始播放节目。");
    }


}
