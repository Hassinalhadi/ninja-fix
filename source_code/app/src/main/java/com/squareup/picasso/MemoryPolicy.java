package com.squareup.picasso;

/* loaded from: classes2.dex */
public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);

    final int index;

    MemoryPolicy(int i4) {
        this.index = i4;
    }

    public static boolean shouldReadFromMemoryCache(int i4) {
        if ((i4 & NO_CACHE.index) == 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldWriteToMemoryCache(int i4) {
        if ((i4 & NO_STORE.index) == 0) {
            return true;
        }
        return false;
    }
}
