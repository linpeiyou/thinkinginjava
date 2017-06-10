package unit11;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Test {

	
	public static void main(String[] args) {
		for(Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}
	
}
