package main;

import java.util.ArrayList;
import java.util.Comparator;

public class Sort implements Sort_Interface {
	@Override
	public ArrayList<Person> sort(ArrayList<Person> list_txt) {
		// TODO Auto-generated method stub
		ArrayList<Person> list = new ArrayList<Person>();
		Person min_person = null;
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < list_txt.size() - 1; i++) {
			int k=i;
			Person p1 = (Person) list_txt.get(i);
			sum1 = p1.getMath() + p1.getChinese() + p1.getEnglish();
			min_person = p1;
			//System.out.println("1:"+sum1);
			for (int j = i + 1; j < list_txt.size(); j++) {		
				Person p2 = (Person) list_txt.get(j);				
				sum2 = p2.getMath() + p2.getChinese() + p2.getEnglish();
				//System.out.println("2:"+sum2);
				if (sum1 >sum2) {
				    min_person = p2;
					k=j;
				} 
				if(k!=i) {
					Person p =list_txt.get(i);
					list_txt.set(i,list_txt.get(k));
					list_txt.set(k,p);
				}
			}
			//System.out.println(".............."+min_person);
			//System.out.println(i+".............."+k);
		}
		//System.out.println(".............."+list_txt);
		return list_txt;
	}
	
}
