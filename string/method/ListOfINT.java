package com.string.method;

import java.util.ArrayList;
import java.util.Iterator;

public class ListOfINT {

	public static void main(String[] args) {
      ArrayList<Integer> name=new ArrayList<>();
      name.add(23);
      name.add(33);
      name.add(13);
      name.add(232);
name.add(444);
Iterator<Integer>itr=name.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next()%2==0?"evan":"odd");
}
	}

}
