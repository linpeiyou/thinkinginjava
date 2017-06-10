package unit11;

import java.util.AbstractCollection;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;

public class CollectionSequence {

	private String[] strs = new String[6];
	{
		strs[0] = "haha";
		strs[1] = "lin";
		strs[2] = "pei";
		strs[3] = "you";
		strs[4] = "Peyton";
		strs[5] = "lin";
	}

	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int index = 0;
			
			@Override
			public String next() {
				return strs[index++];
			}
			
			@Override
			public boolean hasNext() {
				return index < strs.length;
			}
		};
	}

	public static void main(String[] args) {
		
		CollectionSequence cs = new CollectionSequence();
		InterfaceVsIterator.<String>display(cs.iterator());
	}
	
}


















