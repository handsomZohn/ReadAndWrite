package com.javase.string;

public class Jiequweibu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jiequweibu();
	}

	public static void jiequweibu(){
		String str = "����ʯ��ɽ��1����ṫ���Ծ�ҵ��֯����������118�����빫���Ը�λ��������ʾ";
		//System.out.println(str.substring(str.indexOf("��")+1, str.indexOf("��")));
		//System.out.println(str.indexOf("��"));
		if (str.indexOf("��")==-1) {
			//����
			//1����
		}else{
			//����
			System.out.println(str.substring(str.indexOf("��")+1, str.indexOf("��")));
		}
	}
	
	public static void ascii(){
		String str = "����ʯ��ɽ��11101";//7��
		
	}
}

class DwmdVB{
	
	private String xlfs;

	public String getXlfs() {
		return xlfs;
	}

	public void setXlfs(String xlfs) {
		this.xlfs = xlfs;
	}
	
	public static void main(String[] args) {
		System.out.println(new DwmdVB().getXlfs()==null?"yes":"nono");;
	}
}

