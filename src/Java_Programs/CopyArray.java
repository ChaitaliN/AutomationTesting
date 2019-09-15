package Java_Programs;

public class CopyArray {

	public static void main(String[] args) {
		// copy one array into another
		
		int a[]= {10,20,30};
		int b[]= new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		for (int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}
