package com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GregorianCalendarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 *��ͬ��ʼ������201503
		 *��ͬ��һ���� 201602
		 *�걨�ڿ�ʼ��
		 *�걨�ڽ����� 
		 */
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMM");
		Date htksrq=sdf.parse("20150301".substring(0,6));//���Date�ͺ�ͬ��ʼ����
		System.out.println("201503" + "��ͬ��ʼ����");
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(htksrq);
		cal.add(GregorianCalendar.MONTH, 11);
		String time1 = sdf.format(cal.getTime());//�Ӻ�ͬ��ʼ��ĵ�12���µ����£���ͬ��һ�꣩
		System.out.println(time1 + "��ͬ��һ��");
		
		cal.setTime(htksrq);
		cal.add(GregorianCalendar.MONTH, 12);
		String sbqksny = sdf.format(cal.getTime()); //�걨��-��ʼ����
		
		System.out.println(sbqksny + "�걨�ڿ�ʼ");
		
		
		cal.setTime(htksrq);
		cal.add(GregorianCalendar.MONTH, 23);
		String sbqjsny = sdf.format(cal.getTime()); //�걨��-��������
		
		System.out.println(sbqjsny + "�걨�ڽ���");
		
		
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy");
		String thisMarch = sdf2.format(new Date());
		
		System.out.println(thisMarch + "04");
		
		
		SimpleDateFormat sdf21=new SimpleDateFormat("yyyyMMddHHmmss");
		Date date=sdf21.parse("20160401132121");
		cal.setTime(date);
		//cal.add(Calendar.MONTH, 11);
		cal.add(Calendar.MONTH, 13);
		String s=sdf21.format(cal.getTime());
		System.out.println("��ͬ��ʼ����" + "201604");
		System.out.println("��ͬ��ʼ�����Ƴ�13����" + s.substring(0, 6));
	}

}
