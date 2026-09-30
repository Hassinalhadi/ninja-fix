package com.SecurityGuardBrige.ArchersSmoothLoginers;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.content.Context;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public final class FeatureSessionStore {
    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(25, FeatureSessionStore.class);
        Hidden0.special_clinit_25_00(FeatureSessionStore.class);
    }

    private FeatureSessionStore() {
    }

    public static native String addJsonAuth(Context context, String str);

    public static native String appendQuery(Context context, String str);

    public static native String get(Context context);

    public static native String getUsername(Context context);

    public static native boolean hasPersistentSession(Context context);

    public static native boolean persist(Context context, String str);
}
