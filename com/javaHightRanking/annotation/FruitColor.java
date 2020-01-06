package com.javaHightRanking.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * <p>Title:ˮ����ɫ</p>
 * <p>Description:</p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company:bksx</p>
 * <p>CreateDate:2018��3��26��</p>
 * @author zohn
 * @version 1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
	/*
	 * ��ɫö��
	 */
	public enum Color{
		BLUE,
		RED,
		GREEN
	}
	
	/*
	 * ��ɫ����
	 */
	Color fruitcolor() default Color.GREEN;
	
}
