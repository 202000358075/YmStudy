package factory;

public class BlueBallPen extends BallPen{
    public PenCore getPenCore(){
       return new BluePenCore();
    }
}
