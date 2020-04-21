package com.example.util;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class BCryptImpl implements EncryptHelper {

    @Override
    public String encrypt(String password) { return BCrypt.hashpw(password, BCrypt.gensalt()); }

    @Override
    public Boolean isMatch(String password, String hashed) { return BCrypt.checkpw(password, hashed); }
}
