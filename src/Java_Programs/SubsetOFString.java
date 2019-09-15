package Java_Programs;

public class SubsetOFString {

	public static void main(String[] args) {
		// find all subset of string
		String str="fun";
		int len=str.length();
		String arr[]=new String[len*(len+1)/2];
		int temp=0;
		
		System.out.println("subset of given strings are : ");
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				arr[temp]=(str.substring(i, j+1));
				temp++;
			}
				
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
