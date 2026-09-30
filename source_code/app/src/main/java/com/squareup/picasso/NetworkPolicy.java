package com.squareup.picasso;

/* loaded from: classes2.dex */
public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    final int index;

    NetworkPolicy(int i4) {
        this.index = i4;
    }

    public static boolean isOfflineOnly(int i4) {
        if ((i4 & OFFLINE.index) != 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldReadFromDiskCache(int i4) {
        if ((i4 & NO_CACHE.index) == 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldWriteToDiskCache(int i4) {
        if ((i4 & NO_STORE.index) == 0) {
            return true;
        }
        return false;
    }
}
