package com.ngc.javastudy.设计模式.策略;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.策略
 * @date 2020/3/6 10:06 上午
 */

/**
 * 提供下载调用
 */
public class Download {

    private DownLoadStrategy downLoadStrategy;

    public Download(DownLoadStrategy downLoadStrategy){
        this.downLoadStrategy = downLoadStrategy;
    }

    public Object getReport(String userId,String downloadType){
        return downLoadStrategy.chooseDownloadWay(userId,downloadType);
    }

}
