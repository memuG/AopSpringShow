package com.przemo.aopSpringShow.service;

import com.przemo.aopSpringShow.domain.SimpleBean;
import com.przemo.aopSpringShow.domain.SimpleBeanImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    private final SimpleBean simpleBean;

    @Autowired
    public SimpleService() {
        this.simpleBean = new SimpleBeanImpl();
    }

    public void doServiceThings() {
        simpleBean.doSomething();
    }
}
