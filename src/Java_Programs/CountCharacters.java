package Java_Programs;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		// count characters in a string
		
		System.out.println("how many string you want to enter");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String str[]=new String[num];
		char[] ch=new char[str.length];
		int cnt1=0;
		for (int i=0;i<num;i++)
		{	
		System.out.println("enter string");
		Scanner sc1=new Scanner(System.in);
		str[i]=sc1.next();
		
		}
		System.out.println("length of whole string is "+str.length);
		int cnt=0;
		for(int i=0;i<str.length;i++)
		{
			if(str.length!= ' ')
			{
				cnt++;
			}
				
		}
		System.out.println("number of strings " +cnt);
		
		System.out.println("characters of string");
		
		for(int i=0;i<str.length;i++)
		{
			 ch=str[i].toCharArray();
			 for(int j=0;j<ch.length;j++)
			 if(ch[i]!=' ')
			 {
				 cnt1++;
			 }
				 
		}

		System.out.println("no.  characters are "+cnt1);
	}

}
