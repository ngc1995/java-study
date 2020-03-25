package com.ngc.javastudy.netty.three;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.netty.three
 * @date 2020/3/25 2:33 下午
 */
public class MyChatClient02 {
    public static void main(String[] args) throws Exception{

        EventLoopGroup eventExecutors = new NioEventLoopGroup();

        try{
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(eventExecutors).channel(NioSocketChannel.class).handler(new MyChatClientInitializer02());

            Channel channel = bootstrap.connect("localhost", 8899).sync().channel();

            for (;;){
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                channel.writeAndFlush(bufferedReader.readLine()+"\r\n");
            }
        }finally {
            eventExecutors.shutdownGracefully();
        }

    }
}
