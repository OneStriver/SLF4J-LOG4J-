package com.sunkaisens.demo3;

import org.apache.log4j.Logger;

public class Demo3Test {

    private static final Logger register = Logger.getLogger("register");
    private static final Logger login = Logger.getLogger("login");
    public static void registerInfo() {
        register.info("[register] 111 " );
    }


    public static void loginInfo() {
        login.info("[login] 222" );
    }

    public static void main(String[] args) {
        registerInfo();
        loginInfo();
    }
}
