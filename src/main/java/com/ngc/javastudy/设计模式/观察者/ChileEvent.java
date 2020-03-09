package com.ngc.javastudy.设计模式.观察者;

/**
 * @author nie.gc
 * @version V1.0
 * @Package com.ngc.javastudy.设计模式.观察者
 * @date 2020/3/9 6:02 下午
 */
public class ChileEvent extends Event<Child> {

    private Child child;

    ChileEvent(Child c,Boolean flag){
        this.child = c;
        child.isCry = flag;
        if (flag){
            child.cry();
        }else {
            child.smile();
        }
    }

    @Override
    public Child getSource() {
        return child;
    }
}
