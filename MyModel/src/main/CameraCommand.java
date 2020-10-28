package main;

public class CameraCommand implements Command{
Camera camera;
public CameraCommand(Camera camera){
    this.camera=camera;
 }
@Override
public void open() {
	// TODO Auto-generated method stub
	camera.kai_Camera();
}
@Override
public void close() {
	// TODO Auto-generated method stub
	camera.guan_Camera();
}


}
