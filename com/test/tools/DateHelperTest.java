package com.test.tools;

import com.tools.helper.datehelper.DateHelper;
import org.junit.Test;

import java.util.Date;

/**
 *@Description DateHelper������
 *@CreateDate 2020\3\13 0013 10:23
 *@Author zohn
 *@Version 1.0
 */
public class DateHelperTest {

    @Test
    public void testDateHelper() {
        // ��������
        int rqzl = 1;
        // ��ȡ��ǰʱ��
        String dqsj = DateHelper.getNow("yyyyMMdd");
        // ��ȡ��ǰʱ��ĺ�һ��
        String rq = DateHelper.getBeforDate(dqsj, -rqzl * 24);

        System.out.println("��ǰ���ڣ�" + dqsj + "��ǰ���ڵĺ�һ�죺" + rq);
    }

    @Test
    public void getBeforeOrAfterDay(){
        String after2Days = DateHelper.getBeforeOrAfterDay(-2);
        System.out.println("======^_^======����after2DaysֵΪ: " + after2Days + ", " + "��ǰ���Լ�����������: DateHelperTest.getBeforeOrAfterDay()");
    }
}
