package com.example.util;

public interface EncryptHelper {

    String encrypt(String password);

    Boolean isMatch(String password, String hashed);
}
