package com.hms;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class B {

    public static void main(String[] args){
        System.out.println(BCrypt.hashpw("aiyan@123A",BCrypt.gensalt(5)
        ));
    }
}
