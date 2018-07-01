package com.lee.codeGen.tools;

import java.io.File;

import com.lee.codeGen.Generater;
import com.lee.codeGen.model.Config;


/**
 * 文件管理工具类
 * @author Administrator
 *
 */
public class FolderUtil {
	// 创建文件夹
		public static void createCodeFolder(Config config)  {

			if (StringUtils.isBank(config.getPackageName())) {
				createFoloder(Generater.class.getClassLoader().getResource("").getFile());
			} else {
				// 根据操作系统环境 判定路径是否为绝对路径
				String packageName = config.getPackageName().endsWith("\\") ? config.getPackageName()
						: config.getPackageName() + "\\";
				String osName = System.getProperty("os.name");
				if (osName.toLowerCase().startsWith("win")) {
					if (config.getPackageName().contains(":")) {
						createFoloder(packageName);
					} else {
						createFoloder(Generater.class.getClassLoader().getResource("").getFile() + "\\" + packageName);

					}
				} else {
					if (config.getPackageName().startsWith("/")) {
						createFoloder(packageName);
					} else {
						createFoloder(Generater.class.getClassLoader().getResource("").getFile() + "/" + packageName);

					}
				}

			}
		}

		public static void createFoloder(String parentName)  {
			File f = new File(parentName + "\\dao");
			f.mkdirs();
			f = new File(parentName + "\\entity");
			f.mkdir();
			f = new File(parentName + "\\service");
			f.mkdir();
			f = new File(parentName + "\\service\\impl");
			f.mkdir();
			f = new File(parentName + "\\web");
			f.mkdir();

		}

}
