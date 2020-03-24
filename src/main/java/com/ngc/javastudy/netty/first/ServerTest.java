package com.ngc.javastudy.netty.first;

import com.ngc.javastudy.设计模式.观察者.Event;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.netty.first
 * @date 2020/3/24 3:38 下午
 */
public class ServerTest {

    public static void main(String[] args) throws InterruptedException {
        //获取请求
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        //处理请求
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            //用于启动服务端
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    //关联处理器
                    .childHandler(new ServerInitializer());

            ChannelFuture channelFuture = serverBootstrap.bind(8899).sync();
            channelFuture.channel().closeFuture().sync();
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

}
