package com.luoshihai.xxutils;

import android.content.Intent;

/**
 * Created by lsh on 2017/3/19.
 */

public class ActivityUtils {
    private ActivityUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 判断是否存在Activity
     *
     * @param packageName 包名
     * @param className   activity全路径类名
     * @return {@code true}: 是<br>{@code false}: 否
     */
    public static boolean isActivityExists(String packageName, String className) {
        Intent intent = new Intent();
        intent.setClassName(packageName, className);
        return !(Utils.getContext().getPackageManager().resolveActivity(intent, 0) == null ||
                intent.resolveActivity(Utils.getContext().getPackageManager()) == null ||
                Utils.getContext().getPackageManager().queryIntentActivities(intent, 0).size() == 0);
    }

}
