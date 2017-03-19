package com.luoshihai.xxutils.constant;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by lsh on 2017/3/19.
 */

public class MemoryConstants {

    /**
     * Byte与Byte的倍数
     */
    public static final int BYTE = 1;
    /**
     * KB与Byte的倍数
     */
    public static final int KB = 1024;
    /**
     * MB与Byte的倍数
     */
    public static final int MB = 1048576;
    /**
     * GB与Byte的倍数
     */
    public static final int GB = 1073741824;

    @IntDef({BYTE, KB, MB, GB})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Unit {
    }
}
