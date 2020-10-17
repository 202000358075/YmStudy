package test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.Person;
import main.Read_Sort;
import main.Sort;


public class Test_01 {
	@Test
	public void test_read_sort() {
		
		Read_Sort read=new Read_Sort();
		Person person1=new Person(0,"ÕÅÈý",80,90,55);
		Person person2=new Person(1,"lisi",50,10,60);
		Person person3=new Person(2,"Èý",90,80,60);
		ArrayList<Person> p=new ArrayList<Person>();
		p.add(person1);
		p.add(person2);
		p.add(person3);
		int[] f1={230,225,120};
		read.set_Sort_Interface(new Sort());
		assertArrayEquals(f1,read.readsort(p));
		
		
		
	}

}
