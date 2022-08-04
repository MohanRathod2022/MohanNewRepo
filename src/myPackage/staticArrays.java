package myPackage;

import java.util.Arrays;

public class staticArrays {

	public static void main(String[] args) {
		// Static Arrays - Similar type of elements
		// int i=20;
		// int i=40;//the same variable cannot hold different
		// Integer Array
		int i[] = new int[5];
		i[0] = 100;
		i[1] = 200;
		i[2] = 300;
		i[3] = 400;
		i[4] = 500;
		// i[5]=600;//Array index out of box
		// System.out.println(i[0]);
		// System.out.println(i[3]);
		// lenght of an array
		// int len=i.length;
		// System.out.println(len);//5
		// System.out.println("index-->" + (len-1));
		// All values at one shot
		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);
		}
		// for each loop -advanced

		System.out.println("########");
		for (int p : i) {
			System.out.println(p);
		}
		System.out.println("+++++");
		
		System.out.println(Arrays.toString(i));
		
		//double array
		
		 double d[]=new double[4];// 4 elemnts
		 d[0]=10.12;
		 d[1]=20.22;
		 d[2]=30.32;
		 d[3]=40.42;
		 for(double g: d) {
			 System.out.println(g);
		 }
		 
		 //char array
		char c[]=new char[3];
		c[0]='x';
		c[1]='y';
		c[2]='z';
		for(char t: c) {
			System.out.println(t);
		}
		
		//String Array
		String proglng[]=new String[4];
		proglng[0]="Python";
		proglng[1]="Java";
		proglng[2]="PHP";
		proglng[3]="Perl";
		
		for(String mohan: proglng) {
			System.out.println(mohan);
			if(mohan.equals("Python")) {
				//System.out.println("My prog lang");
				break;
			}
		}
		
		//Object Array
		Object obj[]=new Object[5];
		obj[0]="Ayush";
		obj[1]=100;
		obj[2]=true;
		obj[3]=22.23;
		obj[4]='a';
		
	  for(Object e : obj) {
		  System.out.println(e);
	  }
				
		
	}

}
