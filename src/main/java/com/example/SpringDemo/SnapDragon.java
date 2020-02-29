package com.example.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProccessor {
   public String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public SnapDragon(String str) {
        this.str = str;
    }

    @Override
    public void process()
    {
        System.out.println("Snap processor "+str);
    }

}
