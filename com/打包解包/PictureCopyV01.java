package com.������;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;


import java.util.List;

import javax.imageio.ImageIO;

import com.sx.conf.SysConfig;

/**
 * 
 * <p>Title:PictureCopy</p>
 * <p>Description:ͼƬcopy</p>
 * <p>Copyright: Copyright (c) 2019</p>
 * <p>Company:bksx</p>
 * <p>CreateDate:2019��3��21��</p>
 * @author Administrator
 * @version 1.0
 */
public class PictureCopyV01 {
	
	// �ؼ���
	static String pType01 = ".jpg", pType02 = ".png";
	// ��ű������ļ�  �����ȫ���ļ�
	static List fileList = new ArrayList();
	
	/**
	 * 
	 * @param unRarFilePath ��ѹ���ļ�·��
	 * @throws Exception
	 */
	public void pCopy(String unRarFilePath) throws Exception{
		
		
		// ԴĿ¼
		String srcFile = unRarFilePath;
		// E:\workspace\myeclipse2014\bjldlsc\root\\\sysfiles\rlzyfwxk\fb33a3b3651800\
		
		ArrayList fileList02 = new ArrayList();
		
		File file = new File(srcFile);
		File[] listFiles = file.listFiles();
		for (int i = 0; i < listFiles.length; i++) {
			fileList02.add(listFiles[i]);
		}
		
		// �������ļ����������ļ�
		searchDir(fileList02);
		
		// �ٴ���һ����ͼƬ���ļ���
		// ͼƬcopy��Ŀ¼
		String dstDirPath = unRarFilePath + "tpyl" + SysConfig.getFILESEPARATOR();
		File dstDir = new File(dstDirPath);
		if (!dstDir.exists() && !dstDir.isDirectory()) {
			dstDir.mkdirs();
		}
		readAndWritePicture(fileList, pType01, pType02, dstDirPath);
		
	}
	
	/**
	 * ����unRarFilePath�����ļ�
	 * @param fileList02 ָ����unRarFilePath�������ļ��������ļ����Լ��ļ���
	 */
	public void searchDir(List fileList02){
		// һ��Ŀ¼
		List dirList01 = new ArrayList();
		// һ��Ŀ¼����Ŀ¼
		List dirList02 = new ArrayList();
		// �����ļ��У����ļ��к��ļ�����
		int size = fileList02.size();
		for (int i = 0; i < size; i++) {
			File file = (File) fileList02.get(i);
			if (file.isDirectory()) {
				dirList01.add(file);
			} else {
				fileList.add(file);
			}
		}
		
		if (dirList01.size() > 0 || !dirList01.isEmpty()) {
			int size02 = dirList01.size();
			for (int i = 0; i < size02; i++) {
				File file = (File) dirList01.get(i);
				File[] listFiles = file.listFiles();
				for (int j = 0; j < listFiles.length; j++) {
					dirList02.add(listFiles[j]);
				}
			}
			searchDir(dirList02);
		}
		return;
	}
	
	/**
	 * ��дͼƬ
	 * @param fileList �ļ������ļ��б�
	 * @param pType01 ͼƬ����01 .jpg
	 * @param pType02 ͼƬ����02 .png
	 * @param dstDirPath Ŀ��·��
	 */
	public void readAndWritePicture(List fileList, String pType01, String pType02, String dstDirPath){
		int size = fileList.size();
		for (int i = 0; i < size; i++) {
			File file = (File)fileList.get(i);
			if (file.isFile()) {
				// �ж��Ƿ�ͼƬ
				boolean isJpg = file.toString().toLowerCase().endsWith(pType01);
				boolean isPng = file.toString().toLowerCase().endsWith(pType02);
				if (isJpg || isPng) {
					// ���ļ�д��ָ���ļ���
					try {
						BufferedImage img = ImageIO.read(new File(file.toString()));
						ImageIO.write(img, isJpg ? "jpg" : "png", new File(dstDirPath + file.getName()));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
