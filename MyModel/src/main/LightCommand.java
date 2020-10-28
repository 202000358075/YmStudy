package main;

public class LightCommand implements Command{
Light light;
public LightCommand(Light light){
    this.light=light;
 }
@Override
public void open() {
	// TODO Auto-generated method stub
	light.kai_light();
}
@Override
public void close() {
	// TODO Auto-generated method stub
	light.guan_light();
}



}
