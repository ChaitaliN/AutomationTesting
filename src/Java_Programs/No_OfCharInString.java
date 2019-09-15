package Java_Programs;

public class No_OfCharInString {

	public static void main(String[] args) {
		// number of characters in string
		int cnt=0;
		String str="this is my book";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				cnt++;
		}
		System.out.println("number of char "+cnt);
	}

}
