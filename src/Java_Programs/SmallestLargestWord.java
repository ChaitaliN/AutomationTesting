package Java_Programs;

public class SmallestLargestWord {

	public static void main(String[] args) {
		// smallest and largest word in a string
		
		String s="my my name isi chaitali";
		
		String str[]=s.split(" ");
		System.out.println(str.length);
		int t;
		String temp;
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].length()<str[j].length())
				//t=str[i].compareTo(str[j]);
				//if(t>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
							
				}
			}
		}
	for(int i=0;i<str.length;i++)
	{
		System.out.println(str[i]+" "+" length is "+str[i].length());
	}
		System.out.println("largest string is "+str[0]+ "  smallest string is "+str[4]);
}
}
