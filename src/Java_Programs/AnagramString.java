package Java_Programs;

public class AnagramString {
	
	public static void  equal(String str1,String str2)
	{
		if(str1.length()==str2.length() )
		{
				if(str1.contains(str2))
				{
					System.out.println("string is anagram");
				}
			
		}
		else
		{
			System.out.println("string is not anagram");
		}
	}

	public static void main(String[] args) {
		// string with equal length and same character ,( not sequence )is anagram string , GRAB, BRAG
		
		String str1="grab";
		String str2="brag";
		
		equal(str1,str2);

	}

}
