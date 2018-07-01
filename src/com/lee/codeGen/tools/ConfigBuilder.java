package com.lee.codeGen.tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.lee.codeGen.Generater;
import com.lee.codeGen.model.Config;

/**
 * ���û���������
 * @author Administrator
 *
 */
public class ConfigBuilder {
	
	
	/**
	 * ��ȡPROPERTIES�����ļ�
	 * @return
	 */
	public static Properties loadPropertiesConfig() 
	{
		
		InputStream inStream= Generater.class.getClassLoader().getResourceAsStream("config.properties");
		
		if(inStream == null)
			throw new RuntimeException("Config File No Found");
		
		Properties p =new Properties();
		try {
			p.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;	
	}
	
	/**
	 * ���ݱ��������ļ� ��ȡ���ݿ�ת��bean
	 * @return
	 */
	
	public static Config readFileConfig()
	{
		
		Properties properties =loadPropertiesConfig();
		Config config=new Config();
		config.setSqlDialect(properties.getProperty("sqlDialect", "mysql"));
		config.setSqlCon(properties.getProperty("sqlCon"));
		config.setSqlUser(properties.getProperty("sqlUser"));
		config.setSqlPwd(properties.getProperty("sqlPwd"));
		config.setTabName(properties.getProperty("tabName"));
		config.setSubTable(properties.getProperty("subTable"));
		config.setPackageName(properties.getProperty("packageName"));
		
		
		
		return config;
	}

}
