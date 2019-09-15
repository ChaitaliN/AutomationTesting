package Java_Programs;

import java.util.Scanner;

public class FloyedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter number of rows");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		sc.close();
		int cnt=1;
		for(int i=0;i<num;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print(cnt);
				cnt++;
			}System.out.println("");
		}
		

	}

}
