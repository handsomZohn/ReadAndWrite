package com.test.tools;

import com.tools.helper.datehelper.DateHelper;
import org.junit.Test;

/**
 *@Description  
 *@CreateDate   18/08/14 11:44
 *@Author        zohn
 *@Version       1.0
 *
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
}
