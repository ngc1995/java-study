package com.ngc.javastudy.设计模式.策略;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.策略
 * @date 2020/3/6 10:40 上午
 */
public enum DownloadType {

    CSuspicious("CSuspicious",new DownloadType01()),
    CnSuspicious("CnSuspicious",new DownloadType02()),
    PnSuspicious("PnSuspicious",new DownloadType03()),
    PSuspicious("PSuspicious",new DownloadType04());

    private String downloadType;
    private DownLoadStrategy downLoadStrategy;

    DownloadType(String downloadType, DownLoadStrategy downLoadStrategy) {
        this.downloadType = downloadType;
        this.downLoadStrategy = downLoadStrategy;

    }

    public String getDownloadType() {
        return downloadType;
    }

    public DownLoadStrategy getDownLoadStrategy() {
        return downLoadStrategy;
    }
}
