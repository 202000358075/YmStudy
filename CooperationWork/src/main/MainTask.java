package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainTask {
	
  public static void main(String[] arg) {
	    String filePath = "E:/git/repository2/CooperationWork/src/data/data.txt";
	    ArrayList<Person> list_txt=new ArrayList<Person>();
	    Ave_Max_Interface am=new Ave_Max(); 
	    //Ave_Max am=new Ave_Max();
	    Select_Interface select=new Select();
	    list_txt=readTxt(filePath); 
	    Person p=new Person();
	    Read_Sort rs=new Read_Sort();
	    Sort s=new Sort();
	    System.out.println("������ݣ�"+list_txt);//��ȡtxt�е����ݣ���Ϊlist
	    System.out.println("----------------------------------");
	    System.out.println("��������");
	    int[] rds=new int[list_txt.size()];
	    rs.set_Sort_Interface(new Sort());
		rds=rs.readsort(list_txt); 
		for(int i=0;i<rds.length;i++) {
		System.out.println(rds[i]);
		}
		/*int[] sort_num=new int[list_txt.size()];
		sort_num=s.sort(rds); 
		for(int i=0;i<sort_num.length;i++) { 
			 System.out.println(sort_num[i]); 
		}*/		 
	    System.out.println("----------------------------------");
	    float[] avenum = am.getAve(list_txt);
	    float[] maxnum = am.getMax(list_txt);
	    System.out.println("----------------------------------");
		    System.out.println("������ѧ��������ѯ��Ӧ��Ϣ��");
		    p=select.select(list_txt);
		    System.out.println(p);
		    
		 
  }
  public static ArrayList readTxt(String filePath) {

	  ArrayList list=new ArrayList();

	  try {
	    File file = new File(filePath);
	    if(file.isFile() && file.exists()) {//gbk
	      InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "gbk");
	      BufferedReader br = new BufferedReader(isr);
	      String lineTxt = null;
	      int line=0;
	      while ((lineTxt = br.readLine()) != null) {
	    	 String[] person_txt=lineTxt.split("\\s+");		
			if(line>0) {
				
				  Person person=new Person(); person.setNo(Integer.parseInt(person_txt[0]));
				  person.setName(person_txt[1]);
				  person.setMath(Integer.parseInt(person_txt[2]));
				  person.setChinese(Integer.parseInt(person_txt[3]));
				  person.setEnglish(Integer.parseInt(person_txt[4]));
				  
				  list.add(person);

			}
			 line++;
	      }		
	      
	      br.close();
	    } else {
	      System.out.println("�ļ�������!");
	    }
	  } catch (Exception e) {
	    System.out.println("�ļ���ȡ����!");
	  }
	  return list;
	  }

}
