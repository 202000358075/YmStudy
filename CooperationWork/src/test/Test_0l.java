package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import main.Ave_Max;
import main.Ave_Max_Interface;
import main.Person;

import main.Sort_Interface;

class Test_0l {

	
	@Test
	void test() {
		ArrayList<Person> ar=new ArrayList<Person>();
		Person person=new Person();
		person.setNo(1);
		person.setName("ll");
		person.setMath(78);
		person.setChinese(67);
		person.setEnglish(76);
		  
		ar.add(person);
		Person person2=new Person();
	    person2.setNo(2);
		person2.setName("12");
		person2.setMath(67);
		person2.setChinese(99);
		person2.setEnglish(66);
		ar.add(person2);
		Ave_Max am=new Ave_Max();
		//am.getAve(ar);
		float[] f1= new float[3];
		f1[0]=(float) ((78.0+67)/2);
		f1[1]=(float) ((67.0+99)/2);
		f1[2]=(float) ((76.0+66)/2);
		
		Ave_Max_Interface si=EasyMock.createMock(Ave_Max_Interface.class);
		Ave_Max_Interface si_real=new Ave_Max();
    	EasyMock.expect(si.getAve(ar)).andReturn(si_real.getAve(ar));
    	EasyMock.replay(si);
    	assertArrayEquals(f1, si.getAve(ar));
		
	
		
		float[] f2=new float[3];
		f2[0]=78;
		f2[1]=99;
		f2[2]=76;
		
		assertArrayEquals(f2, am.getMax(ar));
		
		Ave_Max_Interface si2=EasyMock.createMock(Ave_Max_Interface.class);
		Ave_Max_Interface si_real2=new Ave_Max();
    	EasyMock.expect(si2.getMax(ar)).andReturn(si_real2.getMax(ar));
    	EasyMock.replay(si2);
    	assertArrayEquals(f2, si2.getMax(ar));
		
		
	}

}
