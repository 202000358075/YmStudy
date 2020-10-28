package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Select implements Select_Interface{

	@Override
	public Person select(ArrayList<Person> list_txt) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String in_name=sc.next();
		Person p=new Person();
		for(int i=0;i<list_txt.size();i++) {
		if(in_name.equals(list_txt.get(i).getName())) {
			p=list_txt.get(i);
			//System.out.print(list_txt.get(i));	
			return p;
		}
	  }
		return  null;
	}

}
