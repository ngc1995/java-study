package com.ngc.javastudy.设计模式.观察者;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.观察者
 * @date 2020/3/9 5:53 下午
 */
public class MumListener implements Listener {

    @Override
    public void handle(Event event) {
        Child child = (Child) event.getSource();
        if (child.isCry) {
            System.out.println("妈妈听到小孩在哭，开始哄小孩。");
        }else {
            System.out.println("妈妈看到小孩在笑，开始逗小孩。");
        }
    }

}
