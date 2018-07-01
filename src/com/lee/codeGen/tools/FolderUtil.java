package com.lee.codeGen.tools;

import java.io.File;

import com.lee.codeGen.Generater;
import com.lee.codeGen.model.Config;


/**
 * �ļ���������
 * @author Administrator
 *
 */
public class FolderUtil {
	// �����ļ���
		public static void createCodeFolder(Config config)  {

			if (StringUtils.isBank(config.getPackageName())) {
				createFoloder(Generater.class.getClassLoader().getResource("").getFile());
			} else {
				// ���ݲ���ϵͳ���� �ж�·���Ƿ�Ϊ����·��
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
