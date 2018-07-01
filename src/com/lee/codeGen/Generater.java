package com.lee.codeGen;

import java.io.File;

import com.lee.codeGen.model.Config;
import com.lee.codeGen.tools.ConfigBuilder;
import com.lee.codeGen.tools.FolderUtil;
import com.lee.codeGen.tools.StringUtils;

/**
 * 代码生成主类
 * 
 * @author Administrator
 *
 */
public class Generater {

	/**
	 * 代码生成
	 * 
	 * @param config
	 */
	public static void gen(Config config) {
		FolderUtil.createCodeFolder(config);				
		
			
	}

	

	public static void main(String[] args) throws Exception {
		System.out.println(System.getProperty("os.name"));
	}

}
