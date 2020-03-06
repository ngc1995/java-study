package com.ngc.javastudy.设计模式.策略;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.策略
 * @date 2020/3/6 10:02 上午
 */

/**
 * 下载对私客户的可疑报告
 */
public class DownloadType04 implements DownLoadStrategy {
    @Override
    public Object chooseDownloadWay(String userId, String downloadType) {


        //具体下载实现


        return "对私客户可疑报告";
    }
}
