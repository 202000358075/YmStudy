package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import main.Person;
import main.Sort;
import main.Sort_Interface;

public class Test_sort {
	@Test
	public void test_read_sort() {
		ArrayList<Person> list1=new ArrayList<Person>();
		
		Person person1=new Person(0,"张三",80,90,55);
		Person person2=new Person(1,"lisi",50,10,60);
		Person person3=new Person(2,"三",90,80,60);
		ArrayList<Person> p=new ArrayList<Person>();
		p.add(person1);
		p.add(person2);
		p.add(person3);
		
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(person2);
		list.add(person1);
		list.add(person3);
		
		Sort_Interface soi=EasyMock.createMock(Sort_Interface.class);
		Sort_Interface soi_real=new Sort();
		EasyMock.expect(soi.sort(p)).andReturn(soi_real.sort(p));
    	EasyMock.replay(soi);
    	list1=soi.sort(p);//排序没有发生任何变化
    	System.out.println(list1);
    	
		
		  for(int i=0;i<p.size();i++) { 
			  Person p1=list.get(i);
		      Person p2=soi.sort(p).get(i);
		      assertEquals(p1, p2); 
		      }
		 
	}

}
