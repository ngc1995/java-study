package com.ngc.javastudy.netty.four;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleStateEvent;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.netty.four
 * @date 2020/3/25 4:47 下午
 */
public class MyServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent){
            IdleStateEvent event = (IdleStateEvent)evt;

            String eventType = null;

            switch (event.state()){
                case ALL_IDLE:
                    eventType = "读写空闲";
                    break;
                case READER_IDLE:
                    eventType = "读空闲";
                    break;
                case WRITER_IDLE:
                    eventType = "写空闲";
                    break;
            }

            System.out.println(ctx.channel().remoteAddress() + " 超时事件 " +eventType);
            ctx.channel().close();
        }
    }
}
