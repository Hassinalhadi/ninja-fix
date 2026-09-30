package com.SecurityGuardBrige.ShiftArchersMougraph;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import java.util.ArrayList;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class AutoArchersBoockedShift {

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ShiftArchersMougraph.AutoArchersBoockedShift$1, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements Runnable {
        final Activity val$activity;
        final String val$msg;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(72, AnonymousClass1.class);
            Hidden0.special_clinit_72_00(AnonymousClass1.class);
        }

        AnonymousClass1(Activity activity, String str) {
            this.val$activity = activity;
            this.val$msg = str;
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(73, AutoArchersBoockedShift.class);
        Hidden0.special_clinit_73_00(AutoArchersBoockedShift.class);
    }

    public static native void showToast(Activity activity, String str);

    public static native String to24h(String str, String str2, String str3);

    public static native void tryAutoBook(Activity activity, ArrayList arrayList);
}
