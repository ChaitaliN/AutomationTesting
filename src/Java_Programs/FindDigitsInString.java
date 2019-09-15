package Java_Programs;

public class FindDigitsInString {

	public static void main(String[] args) {
		// find digits in string
		
		String str="chai1890";
		
		//boolean flag=str.matches("([A-Za-z]+[0-9]|[0-9]+[A-Za-z])[A-Za-z0-9]*");
		
		//if(str.)
		 String flag=" ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=97 && str.charAt(i)<=102 || str.charAt(i)>=0 && str.charAt(i)<=9)
				 flag="true";
		}
		
		if(flag=="true")
		{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(Character.isDigit(ch))
				{
					int digit=Character.getNumericValue(ch);
					System.out.println("digit is present "+digit);
				}
			}
		}

	}

}
