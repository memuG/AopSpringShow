package com.przemo.aopSpringShow.domain;

import java.util.logging.Logger;

public class SimpleBeanImpl implements SimpleBean {

    @Override
    public void doSomething() {
        Logger.getLogger(this.getClass().getName()).info("Doing something...");
    }
}
