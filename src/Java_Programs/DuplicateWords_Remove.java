package Java_Programs;

public class DuplicateWords_Remove {

	public static void main(String[] args) {
		// remove duplicate words from string
		
		String str="this is my book this is my bat";
		
		String arr[]=str.split(" ");
		//System.out.println();
		
		System.out.println("duplicate words are: ");
		for(int i=0;i<arr.length;i++)
		{
			int cnt[]=new int[arr.length];
			cnt[i]=1;
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equalsIgnoreCase(arr[j]))
				{
					cnt[i]++;
					arr[j]="0";
				}
			}
			if(cnt[i]>1 && arr[i]!="0")
				System.out.println("frequency of "+arr[i]+" "+cnt[i] );
		}

		char c='4';
		System.out.println(Character.getNumericValue(c));
	}

}
