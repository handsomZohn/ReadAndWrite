package com.array;
/*һ����ȷ����Ŀ����ȷ������˳����ַ������飬��֪�������ĸ�Ԫ�� "admin" "viewer" "operator" "designer", 
��������һ����ȷ����С��˳��������(�����������ĸ��ַ�������һ���ͼ�����Ԫ�ز��ظ�) ���㷨�ᰴ�� 
"admin" "viewer" "operator" "designer"���˳�������������飬�磺 
String[] a={ "viewer" ,"admin"} ---> String[] b={"admin", "viewer" } 
designer operator --->operator designer 
operator  viewer admin --->admin viewer  operator  
viewer designer operator admin  --->admin  viewer operator designer 
���ǽ��������ĸ�string����� �µ�+��ȷ�������飨Ԫ�ؾ�����ĸ��е�һ�������������������������ĸ����Ҳ��ظ���������*/

import java.util.Arrays;
import java.util.List;

public class SortStingArray {

	//���ձ�׼ ����
	private List<String> referList=Arrays.asList("admin", "viewer", "operator", "designer");
	private String[] lscpvb = {"admin","viewer","operator","designer"};
	//����������
	private List<String> targetList;
	
	//���췽��
	public SortStingArray(String[] array){
		this.targetList=Arrays.asList(array);
	}	
	//����
	public String[] sort(){
		for(int i=this.referList.size()-1; i>=0 ;--i){
			if(this.targetList.contains(this.referList.get(i))){
				continue;
			}
		}
		return (String[])this.referList.toArray();
	}
	//��ӡ����
	public void print(){
		for(String temp:this.targetList){
			System.out.println(temp);
		}
	}
	//���Դ���
	public static void main(String[] args) {
		SortStingArray s=new SortStingArray(new String[]{"operator","viewer","admin"});
		s.sort();
		s.print();
	}
}
