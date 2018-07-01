package com.lee.codeGen;

import com.lee.codeGen.model.Config;
import com.lee.codeGen.tools.ConfigBuilder;

public class startGen {

static Config config;
	
	public static void main(String[] args) {
		
		//∂¡»°≈‰÷√
		config = ConfigBuilder.readFileConfig();
		if(config==null)
		{
			throw new RuntimeException("cound't load config for generater ,please check it!");
		}
		
		
	}

}
