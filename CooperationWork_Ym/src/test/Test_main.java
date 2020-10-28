package test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import main.Ave_Max;
import main.Ave_Max_Interface;
import main.Person;
import main.Select;
import main.Select_Interface;

public class Test_main {
	@Test
	public void test_main() {
		ArrayList<Person> list=new ArrayList<Person>();
		Person p1=new Person(1,"Ô¬Ã·",67,89,79);
		Person p2=new Person(2,"ÁºÏþÃô",57,89,79);
		Person p3=new Person(1,"»ªÏþÃ·",67,90,89);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Select_Interface si=EasyMock.createMock(Select_Interface.class);
		Select_Interface si_real=new Select();
    	EasyMock.expect(si.select(list)).andReturn(si_real.select(list));
    	EasyMock.replay(si);
    	assertEquals(p1, si.select(list));
		
    	Ave_Max am=new Ave_Max();
		float[] f1= new float[3];
		f1[0]=(float) ((67+57+67.0)/2);
		f1[1]=(float) ((89+89+90.0)/2);
		f1[2]=(float) ((79+79+89.0)/2);
		/*
		Ave_Max_Interface ami=EasyMock.createMock(Ave_Max_Interface.class);
		Ave_Max_Interface ami_real=new Ave_Max();
    	EasyMock.expect(ami.getAve(list)).andReturn(ami_real.getAve(list));
    	EasyMock.replay(ami);
    	assertArrayEquals(f1, ami.getAve(list));
		*/
		
		
	}
}
