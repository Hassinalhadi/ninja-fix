package com.zendesk.util;

import com.google.maps.android.BuildConfig;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ObjectUtils {
    private ObjectUtils() {
    }

    public static boolean checkNonNull(Object... objArr) {
        for (Object obj : objArr) {
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static <T> T getOrDefault(T t5, T t10) {
        return t5 != null ? t5 : t10;
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static int hashCode(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String toString(Object obj, String str) {
        return obj == null ? str : obj.toString();
    }

    public static <T> T getOrDefault(Callable<T> callable, T t5) {
        T call;
        try {
            call = callable.call();
        } catch (Exception unused) {
        }
        return call != null ? call : t5;
    }

    public static String toString(Object obj) {
        return toString(obj, BuildConfig.TRAVIS);
    }
}
