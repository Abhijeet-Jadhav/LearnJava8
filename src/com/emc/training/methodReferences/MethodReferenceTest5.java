package com.emc.training.methodReferences;

import java.util.Arrays;

interface TT{
	public String getCombinedData(Object...objects);
}

class StringUtil{
	public static String getFirst(Object... a){
		return Arrays.toString(a);
	}
}

public class MethodReferenceTest5 {

	public static void main(String arg[]){
		TT t = StringUtil::getFirst;
		System.out.println(t.getCombinedData(12,33));
		System.out.println(t.getCombinedData(12,"Hello"));
		System.out.println(t.getCombinedData(12,33,23.33F,"test1","test2"));
	}
}
