package com.ngc.javastudy.设计模式.策略;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.策略
 * @date 2020/3/6 9:54 上午
 */
public interface DownLoadStrategy {

    /**
     * 根据下载类型下载不同的报告
     * @param userId 用户id
     * @param downloadType 下载类型
     * @return
     */
    Object chooseDownloadWay(String userId,String downloadType);

}
