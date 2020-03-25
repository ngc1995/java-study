package com.ngc.javastudy.netty.one;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.netty.first
 * @date 2020/3/24 3:51 下午
 */
public class ServerInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        //自定义添加处理器
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast("HttpServerCodec",new HttpServerCodec());
        pipeline.addLast("HttpServerHandler",new HttpServerHandler());
    }
}
