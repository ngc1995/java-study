package com.ngc.javastudy.netty.two;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.netty.two
 * @date 2020/3/25 11:12 上午
 */
public class MyClient {
    public static void main(String[] args) throws Exception{
        EventLoopGroup eventExecutors = new NioEventLoopGroup();

        try{
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(eventExecutors).channel(NioSocketChannel.class).handler(new MyClientInitializer());
            ChannelFuture channelFuture = bootstrap.connect("localhost", 8899).sync();
            channelFuture.channel().closeFuture().sync();
        }finally {
            eventExecutors.shutdownGracefully();
        }
    }
}
