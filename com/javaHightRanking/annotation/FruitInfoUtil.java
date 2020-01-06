package com.javaHightRanking.annotation;

import java.lang.reflect.Field;


/**
 * 
 * <p>Title:ע�⴦����</p>
 * <p>Description:</p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company:bksx</p>
 * <p>CreateDate:2018��3��26��</p>
 * @author zohn
 * @version 1.0
 */
public class FruitInfoUtil {
	public static void getFruitInfo(Class<?> clazz) {
		String strFruitName = "ˮ������:";
		String strFruitColor = "ˮ����ɫ:";
		String strFruitProvicer = "ˮ����Ӧ��:";
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(FruitName.class)) {
				FruitName fruitName = field.getAnnotation(FruitName.class);
				strFruitName = strFruitName + fruitName.value();
				System.out.println(strFruitName);
			} else if (field.isAnnotationPresent(FruitColor.class)) {
				FruitColor fruitColor = field.getAnnotation(FruitColor.class);
				strFruitColor = strFruitColor + fruitColor.fruitcolor();
				System.out.println(strFruitColor);
			} else if (field.isAnnotationPresent(FruitProvider.class)) {
			    FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
			    strFruitProvicer = " ��Ӧ�̱��:" + fruitProvider.id() + ", ��Ӧ������:" + fruitProvider.name() + ", ��Ӧ�̵�ַ:" + fruitProvider.address();
			    System.out.println(strFruitProvicer);
			}
		}
	}
}
