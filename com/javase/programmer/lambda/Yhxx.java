package com.javase.programmer.lambda;

/**
 * @Description �û���Ϣʵ����
 * @Author zohn
 * @Date 2020\1\14 0014 13:59
 * @Param
 * @Return 
 */
public class Yhxx {
    // ����
    private String xm;

    // ���֤����
    private String sfzhm;

    // �ֻ�����
    private Integer sjgs;


    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getSfzhm() {
        return sfzhm;
    }

    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm;
    }

    public Integer getSjgs() {
        return sjgs;
    }

    public void setSjgs(Integer sjgs) {
        this.sjgs = sjgs;
    }

    @Override
    public String toString() {
        return "Yhxx{" +
                "xm='" + xm + '\'' +
                ", sfzhm='" + sfzhm + '\'' +
                ", sjgs='" + sjgs + '\'' +
                '}';
    }

    public Yhxx(String xm, String sfzhm, Integer sjgs) {
        this.xm = xm;
        this.sfzhm = sfzhm;
        this.sjgs = sjgs;
    }
}
