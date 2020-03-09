package com.ngc.javastudy.设计模式.观察者;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.观察者
 * @date 2020/3/9 6:06 下午
 */
public class ListenerTest {
    public static void main(String[] args) {

        ChileEvent chileEvent = new ChileEvent(new Child(),false);
        MumListener mumListener = new MumListener();
        mumListener.handle(chileEvent);

    }
}
