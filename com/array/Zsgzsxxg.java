package com.array;

import java.util.Arrays;

public class Zsgzsxxg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//zsgzsxxg();
		ssub();
	}

	/**
	 * չʾ����˳���޸�
	 */
	public static void zsgzsxxg() {
		String lscpvb = "RIA";// �㷨
		String[] ppzyvb = { "IRA", "RIE", "RIE", "RIE", "RIE", "RIE", "RIE",
				"RIE", "RIE", "RIE", "IRA", "IRA", "IRA", "RIE", "RAI", "RAI",
				"RIC", "RIC", "RIC", "RIC", "RIC", "RIC", "RIC", "RIC", "RI",
				"RI", "RIC", "RI", "RIC", "RIC", "RIC", "RIC", "RIC", "RIC",
				"RIC", "RIC", "RIC", "RIC", "RIC", "RIC", "RSI", "IRS", "IRS",
				"ISA", "IRS", "IRS", "IRS", "IRS", "ISA", "SIA" };// ����������
		// �ֵ�˳������
		Arrays.sort(ppzyvb);

		for (int i = 0; i < ppzyvb.length; i++) {
			System.out.println(ppzyvb[i]);
		}

		System.out.println("------------�ָ���------------");

		for (int i = 0; i < ppzyvb.length; i++) {
			if (ppzyvb[i].equals(lscpvb)) {
				//�����ĵ�һ��
				String[] copyOfRange = Arrays.copyOfRange(ppzyvb, i,
						ppzyvb.length);
				//�����ĵڶ���
				String[] copyOfRange2 = Arrays.copyOfRange(ppzyvb, 0, i);
				//����
				copyOfRange = Arrays.copyOf(copyOfRange, ppzyvb.length);
				System.arraycopy(copyOfRange2, 0, copyOfRange, ppzyvb.length-i, copyOfRange2.length);
				for (int j = 0; j < copyOfRange.length; j++) {
					System.out.println(copyOfRange[j]);
				}
				break;
			} else if (ppzyvb[i].equals(lscpvb.substring(0, 2))) {
				//�����ĵ�һ��
				String[] copyOfRange = Arrays.copyOfRange(ppzyvb, i,
						ppzyvb.length);
				//�����ĵڶ���
				String[] copyOfRange2 = Arrays.copyOfRange(ppzyvb, 0, i);
				//����
				copyOfRange = Arrays.copyOf(copyOfRange, ppzyvb.length);
				System.arraycopy(copyOfRange2, 0, copyOfRange, ppzyvb.length-i, copyOfRange2.length);
				
				for (int j = 0; j < copyOfRange.length; j++) {
					System.out.println(copyOfRange[j]);
				}
				break;
			}
		}
		
		char[] charArray = lscpvb.toCharArray();
		String[] strArray = new String[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			System.out.println(c);
		}
		// ����ָ��˳��������������
		/**
		 * RIA RI [ֻ��������ĸ] RI* [*����һ��������ĸ] R** [*����һ��������ĸ] *** [*����һ��������ĸ]
		 */
	}
	
	public static void ssub(){
		String str = "RIA";
		System.out.println(str.substring(0, 1));
		System.out.println(str.substring(1, 2));
		System.out.println(str.substring(2));
	}

}
