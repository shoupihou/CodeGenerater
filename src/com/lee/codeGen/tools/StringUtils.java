package com.lee.codeGen.tools;

public class StringUtils {
	
	//�ж��ַ����Ƿ�Ϊ��
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
	//�ж��ַ����Ƿ�Ϊ��
	public static boolean isNotBank(String s)
	{
		return !isBank(s);
	}

}
