package com.lee.codeGen.tools;

public class StringUtils {
	
	//判定字符串是否为空
	public static boolean isBank(String s)
	{
		if(s==null)
			return true;
		if(s.equals("")||s.trim().length()<=0)
		{
			return true;
		}
		return false;
	}
	//判定字符串是否不为空
	public static boolean isNotBank(String s)
	{
		return !isBank(s);
	}

}
