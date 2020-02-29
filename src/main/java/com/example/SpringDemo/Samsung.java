package com.example.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

    @Autowired
    @Qualifier(value = "snapDragon")
    MobileProccessor pr;

    public MobileProccessor getPr() {
        return pr;
    }

    public void setPr(MobileProccessor pr) {
        this.pr = pr;
    }

    public  void config(){
        System.out.println("Samsung drive ");
        pr.process();
    }
}
