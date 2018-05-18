package com.founder.eds.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<Integer,String>();	
		map.put(2,"value"+2);
		map.put(3,"value"+3);
		map.put(1,"value"+1);
		System.out.println(Arrays.asList(map));
		StringBuffer bs=new StringBuffer("qwertyuiop");
		System.out.println(bs.reverse());
		StringBuilder bl=new StringBuilder("poakhfahfksahfk.hjkhkhh");
		String string="poakhfahfksahfk\\hjkhkhh";
		System.out.println(string.split("\\\\.")[1]);
		
	}
}
