package com.ngc.javastudy.netty.four;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.netty.four
 * @date 2020/3/25 4:45 下午
 */
public class MyServerInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {

        ChannelPipeline pipeline = ch.pipeline();

        pipeline.addLast(new IdleStateHandler(5,5,5, TimeUnit.SECONDS));
        pipeline.addLast(new MyServerHandler());
    }
}
