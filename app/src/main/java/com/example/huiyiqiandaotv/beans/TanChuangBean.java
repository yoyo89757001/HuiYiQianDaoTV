package com.example.huiyiqiandaotv.beans;

/**
 * Created by chenjun on 2017/5/16.
 */

public class TanChuangBean {
    private String name;
    private String touxiang;
    private String remark;
    private byte[] bytes;
    private int type;
    private long idid;
    private String bumen;

    public String getBumen() {
        return bumen;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen;
    }

    public long getIdid() {
        return idid;
    }

    public void setIdid(long idid) {
        this.idid = idid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTouxiang() {
        return touxiang;
    }

    public void setTouxiang(String touxiang) {
        this.touxiang = touxiang;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
