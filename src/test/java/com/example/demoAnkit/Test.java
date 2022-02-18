package com.example.demoAnkit;

import org.mockito.MockedStatic;
import org.mockito.Moockito;

import java.util.Base64;

public class Test {
    @org.junit.Test
    public void demo() {
        Byte [] b = new Byte[10];
        MockedStatic<Base64> m = Mockito.mockStatic(Base64.class);
        Base64.Encoder e = new Base64.Encoder(true,b,2,true);
        m.when(Base64::getEncoder).thenReturn(o);
        Base64.getEncoder().getClass();

    }
}
