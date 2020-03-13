package com.tools.zipUnzip;

import java.io.File;
import java.io.FileOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.github.junrar.Archive;
import com.github.junrar.rarfile.FileHeader;
import com.tools.helper.stringhelper.StringHelper;
import com.sx.conf.SysConfig;
import com.sx.conf.UploadConfig;


/**
 * 
 * <p>Title:UnRar</p>
 * <p>Description:rar�ļ���ѹ��</p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company:bksx</p>
 * <p>CreateDate:2019��3��21��</p>
 * @author Administrator
 * @version 1.0
 */
public class UnRarV02 {
	
	/**
	 * ��ѹ�� 
	 * @param scclfwqwjmc �ϴ����Ϸ������ļ�����
	 */
	public void unRar(String scclfwqwjmc) {
		if (StringHelper.isNotEmpty(scclfwqwjmc) && scclfwqwjmc.toLowerCase().endsWith(".rar")) {
			String filePath = SysConfig.getROOT_REAL_PATH() + SysConfig.getFILESEPARATOR()
					+ UploadConfig.getFILE_PATH() + SysConfig.getFILESEPARATOR()
					+ "rlzyfwxk" + SysConfig.getFILESEPARATOR();
			// rar�ļ�����ǰ׺
			String prefix = "";
			// ��ѹ�����ļ����·��=filePath + rar�ļ�ǰ׺ 
			String unRARFilePath = "";
			try {
				if (scclfwqwjmc.lastIndexOf(".") != -1) {
					prefix = scclfwqwjmc.substring(0, scclfwqwjmc.indexOf("."));
					unRARFilePath = filePath + prefix + SysConfig.getFILESEPARATOR();
					// unRar(filePath + scclfwqwjmc, unRARFilePath);
					// ��ѹ��
					// unRARFilePath==E:\workspace\myeclipse2014\bjldlsc\root\\\sysfiles\rlzyfwxk\fb33a3b3651800\
					boolean unZip = new ZipTools().unZip(filePath + scclfwqwjmc, unRARFilePath);
					// ������ѹ�����ļ��е�ͼƬ��ȡ�������뵥���ļ��У���ͼƬԤ���ļ���ͳһ����Ϊ��tpyl��
					if (unZip) {
						new PictureCopyV01().pCopy(unRARFilePath);
					}
				}
			} catch (Exception e) {
				System.out.println("=============�ļ������쳣==============");
				e.printStackTrace();
			}
		}
	}
	

	/**
	 * ����Ҫ����com.github.junrar������
	 * �˷�������
	 * ��ѹ��
	 * @param srcRarPath Դ�ļ�·�� e.g.E:\workspace\myeclipse2014\bjldlsc\root\sysfiles\rlzyfwxk\fb33a37aa9c900.rar
	 * @param dstDirectoryPath ��ѹ��Ŀ¼ e.g.E:\workspace\myeclipse2014\bjldlsc\root\sysfiles\rlzyfwxk\fb33a37aa9c900\
	 * @throws Exception
	 */
	public void unRar(String srcRarPath, String dstDirectoryPath) throws Exception{
		// ��֤�Ƿ�rar�ļ�
		if (!srcRarPath.toLowerCase().endsWith(".rar")) {
			throw new Exception("��rar�ļ���");
		}
		
		// ������ѹ��Ŀ¼
		File file = new File(dstDirectoryPath);
		if (!file.exists() && !file.isDirectory()) {
			file.mkdirs();
		}
		
		// ��ѹ����
		File fol = null, out = null;
		Archive archive = null;
		try {
			archive = new Archive(new File(srcRarPath));
			if (archive != null) {
				// ��ӡ�ļ���Ϣ
				// archive.getMainHeader().print();
				FileHeader nextFileHeader = archive.nextFileHeader();
				while(nextFileHeader != null){
					// ���ļ���
					if (nextFileHeader.isDirectory()) {
						if (existsZH(nextFileHeader.getFileNameW())) {
							fol = new File(dstDirectoryPath + SysConfig.getFILESEPARATOR() + nextFileHeader.getFileNameW());
						} else {
							fol = new File(dstDirectoryPath + SysConfig.getFILESEPARATOR() + nextFileHeader.getFileNameString());
						}
						fol.mkdirs();
					// �ļ�
					} else {
						if (existsZH(nextFileHeader.getFileNameW())) {
							out = new File(dstDirectoryPath + SysConfig.getFILESEPARATOR() + nextFileHeader.getFileNameW());
						} else {
							out = new File(dstDirectoryPath + SysConfig.getFILESEPARATOR() + nextFileHeader.getFileNameString());
						}
					}
					
					// ��������쳣֮�󲻻������ѹ
					FileOutputStream fileOutputStream = null;
					try {
						if (!out.exists()) {
							if (!out.getParentFile().exists()) {
								out.getParentFile().mkdirs();
							}
							out.createNewFile();
						}
						fileOutputStream = new FileOutputStream(out);
						archive.extractFile(nextFileHeader, fileOutputStream);
						
					} catch (Exception e) {
						// ����: exception in archive constructor maybe file is encrypted or currupt
						// e.printStackTrace();
					} finally {
						fileOutputStream.close();
					}
				}
				nextFileHeader = archive.nextFileHeader();
			}
		} catch (Exception e) {
			// ����: exception in archive constructor maybe file is encrypted or currupt
			// e.printStackTrace();
		} finally {
			archive.close();
		}
	}
	
	
	/**
	 * �Ƿ�������
	 * @param str Ҫ�жϵ��ַ���
	 * @return flaseû������
	 */
	private static boolean existsZH(String str) {
		String regStr = "[\\u4e00-\\u9fa5]";
		Pattern pattern = Pattern.compile(regStr);
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			return true;
		}
		return false;
	}
}