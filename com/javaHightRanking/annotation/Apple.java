package com.javaHightRanking.annotation;

import com.javaHightRanking.annotation.FruitColor.Color;

/**
 * 
 * <p>Title:ע��ʹ��</p>
 * <p>Description:</p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company:bksx</p>
 * <p>CreateDate:2018��3��26��</p>
 * @author zohn
 * @version 1.0
 */
public class Apple {
	
	 // @FruitName(value = "Apple")
	@FruitName("Apple")
	private String appleName;
	
	@FruitColor(fruitcolor = Color.RED)
	private String appleColor;
	
	@FruitProvider(id = 1, name = "�����츻ʿ����", address = "�����г�������ͨ���һ��Ժ����SOHO����A������")
	private String appleProvider;

	public String getAppleName() {
		return appleName;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleColor() {
		return appleColor;
	}

	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}

	public String getAppleProvider() {
		return appleProvider;
	}

	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}
	
	public void displayName() {
		System.out.println("ˮ��������: ƻ��~~");
	}
}
