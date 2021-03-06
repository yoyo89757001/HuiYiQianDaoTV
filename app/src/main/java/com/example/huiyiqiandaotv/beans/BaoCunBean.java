package com.example.huiyiqiandaotv.beans;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2017/9/15.
 */
@Entity
public class BaoCunBean {
    @Id
    @NotNull
    private Long id;
    private String shipingIP;
    private String zhujiDiZhi;
    private int moban;
    private String tuisongDiZhi;
    private String gonggao;
    private boolean isShowMoshengren;
    private boolean isShowShiPingLiu;
    private boolean isHengOrShu;
    private int yusu;
    private int yudiao;
    private int boyingren;
    private int zhanghuid;
    private String wenzi;
    private int size;
    private String touxiangzhuji;
    @Generated(hash = 1343371009)
    public BaoCunBean(@NotNull Long id, String shipingIP, String zhujiDiZhi,
            int moban, String tuisongDiZhi, String gonggao,
            boolean isShowMoshengren, boolean isShowShiPingLiu, boolean isHengOrShu,
            int yusu, int yudiao, int boyingren, int zhanghuid, String wenzi,
            int size, String touxiangzhuji) {
        this.id = id;
        this.shipingIP = shipingIP;
        this.zhujiDiZhi = zhujiDiZhi;
        this.moban = moban;
        this.tuisongDiZhi = tuisongDiZhi;
        this.gonggao = gonggao;
        this.isShowMoshengren = isShowMoshengren;
        this.isShowShiPingLiu = isShowShiPingLiu;
        this.isHengOrShu = isHengOrShu;
        this.yusu = yusu;
        this.yudiao = yudiao;
        this.boyingren = boyingren;
        this.zhanghuid = zhanghuid;
        this.wenzi = wenzi;
        this.size = size;
        this.touxiangzhuji = touxiangzhuji;
    }
    @Generated(hash = 1469853663)
    public BaoCunBean() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getShipingIP() {
        return this.shipingIP;
    }
    public void setShipingIP(String shipingIP) {
        this.shipingIP = shipingIP;
    }
    public String getZhujiDiZhi() {
        return this.zhujiDiZhi;
    }
    public void setZhujiDiZhi(String zhujiDiZhi) {
        this.zhujiDiZhi = zhujiDiZhi;
    }
    public int getMoban() {
        return this.moban;
    }
    public void setMoban(int moban) {
        this.moban = moban;
    }
    public String getTuisongDiZhi() {
        return this.tuisongDiZhi;
    }
    public void setTuisongDiZhi(String tuisongDiZhi) {
        this.tuisongDiZhi = tuisongDiZhi;
    }
    public String getGonggao() {
        return this.gonggao;
    }
    public void setGonggao(String gonggao) {
        this.gonggao = gonggao;
    }
    public boolean getIsShowMoshengren() {
        return this.isShowMoshengren;
    }
    public void setIsShowMoshengren(boolean isShowMoshengren) {
        this.isShowMoshengren = isShowMoshengren;
    }
    public boolean getIsShowShiPingLiu() {
        return this.isShowShiPingLiu;
    }
    public void setIsShowShiPingLiu(boolean isShowShiPingLiu) {
        this.isShowShiPingLiu = isShowShiPingLiu;
    }
    public boolean getIsHengOrShu() {
        return this.isHengOrShu;
    }
    public void setIsHengOrShu(boolean isHengOrShu) {
        this.isHengOrShu = isHengOrShu;
    }
    public int getYusu() {
        return this.yusu;
    }
    public void setYusu(int yusu) {
        this.yusu = yusu;
    }
    public int getYudiao() {
        return this.yudiao;
    }
    public void setYudiao(int yudiao) {
        this.yudiao = yudiao;
    }
    public int getBoyingren() {
        return this.boyingren;
    }
    public void setBoyingren(int boyingren) {
        this.boyingren = boyingren;
    }
    public int getZhanghuid() {
        return this.zhanghuid;
    }
    public void setZhanghuid(int zhanghuid) {
        this.zhanghuid = zhanghuid;
    }
    public String getWenzi() {
        return this.wenzi;
    }
    public void setWenzi(String wenzi) {
        this.wenzi = wenzi;
    }
    public int getSize() {
        return this.size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getTouxiangzhuji() {
        return this.touxiangzhuji;
    }
    public void setTouxiangzhuji(String touxiangzhuji) {
        this.touxiangzhuji = touxiangzhuji;
    }






   


}
