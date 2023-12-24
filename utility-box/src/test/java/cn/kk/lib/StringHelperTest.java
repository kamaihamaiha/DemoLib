package cn.kk.lib;


import org.junit.Test;

public class StringHelperTest {

    @Test
    public void getHello() {
        assert StringHelperDemo.getHello().equals("Hello");
    }
}