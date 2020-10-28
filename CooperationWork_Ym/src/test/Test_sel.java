package test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import main.Person;
import main.Select;
import main.Select_Interface;
import main.Sort_Interface;

public class Test_sel {
  @Test
  public void testSelect() {

			Select_Interface si=EasyMock.createMock(Select_Interface.class);
			Select_Interface si_real=new Select();
			ArrayList<Person> list=new ArrayList<Person>();
			Person p=new Person(1,"Àî¿¨",67,89,79);
			list.add(p);
	    	EasyMock.expect(si.select(list)).andReturn(si_real.select(list));
	    	EasyMock.replay(si);
	    	assertEquals(p, si.select(list));
	    	
		
  }
}
