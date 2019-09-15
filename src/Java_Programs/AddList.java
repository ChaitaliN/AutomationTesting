package Java_Programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AddList {

	public static void main(String[] args) {
		// arraylist
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("chaitali");
		al.add("nevagi");
		al.add("pratz");
		
		System.out.println("by for each loop");
		for(String name:al)
		{
			System.out.println(name);
		}
		
		System.out.println("by iterator method");
		
		Iterator <String> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("by listIterator");
		
		ListIterator name1=al.listIterator(al.size());
		
		while(name1.hasPrevious())
		{
			System.out.println(name1.previous());
		}
	}

}
