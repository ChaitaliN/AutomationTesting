package Java_Programs;

public class FreqInArray {

	public static void main(String[] args) {
		// to find frequency of element in array
		
		int a[]= {10,20,30,20,30,20};
		int Dup[]=new int[a.length];
		//int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.println(a[j]);
					break;	
			}
		}

		for (int i=0;i<Dup.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<Dup.length;j++)
			{	
			if (Dup[i]==Dup[j])
				cnt++;
			}
			System.out.println("occurance of "+Dup[i]+" is" +cnt);
		}
	}

}
