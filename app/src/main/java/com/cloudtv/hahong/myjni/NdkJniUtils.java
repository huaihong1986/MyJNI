package com.cloudtv.hahong.myjni;

/**
 * Created by hahong on 15-10-22.
 */
public class NdkJniUtils {
    public native String generateKey(String name);
    static {
        System.loadLibrary("my-jni");
    }
}
