package com;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class IdCardTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sfzhm = "142201199805213064";

		Object obj = new Object(); // ǿ����
		SoftReference softReference = new SoftReference(obj); // ������
		WeakReference weakReference = new WeakReference(obj); // ������
		ReferenceQueue q = null;
		PhantomReference phantomReference = new PhantomReference(obj, q); // ������

	}

	//�������֤��ȡ����
	public static String getNlBySfzhm(String sfzhm) throws Exception {
		String year = IDCardHelper.getYear(sfzhm);
		String mouth = IDCardHelper.getMonth(sfzhm);
		return "";
	}

}


