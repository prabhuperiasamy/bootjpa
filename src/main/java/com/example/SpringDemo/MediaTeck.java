package com.example.SpringDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTeck implements MobileProccessor {
    @Override
    public void process()
    {
        System.out.println("Mediateck processor");
    }

}
