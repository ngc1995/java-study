package com.ngc.javastudy.设计模式.策略;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.策略
 * @date 2020/3/6 10:05 上午
 */
public class DownloadController {

    public static void downloadReport(String userId,String downloadType){

        for (DownloadType dt:DownloadType.values()){
            if (downloadType == dt.getDownloadType()){
                Download download = new Download(dt.getDownLoadStrategy());
                Object report = download.getReport(userId, downloadType);
                System.out.println(report.toString());
            }
        }

    }

    public static void main(String[] args) {

        downloadReport("","CSuspicious");
        downloadReport("","CnSuspicious");
        downloadReport("","PnSuspicious");
        downloadReport("","PSuspicious");

    }

}
