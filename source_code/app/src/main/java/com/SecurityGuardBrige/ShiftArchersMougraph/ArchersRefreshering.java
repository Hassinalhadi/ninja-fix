package com.SecurityGuardBrige.ShiftArchersMougraph;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import android.os.Handler;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class ArchersRefreshering {
    private static Handler handler;
    private static boolean isRunning;
    private static Runnable refreshRunnable;

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ShiftArchersMougraph.ArchersRefreshering$1, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements Runnable {
        final Activity val$activity;
        final long val$intervalMs;

        /* compiled from: Dex2C */
        /* renamed from: com.SecurityGuardBrige.ShiftArchersMougraph.ArchersRefreshering$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC00021 implements Runnable {
            final AnonymousClass1 this$0;
            final String val$errMsg;

            static {
                AlwaysMougraohSmootihbngmode.registerNativesForClass(67, RunnableC00021.class);
                Hidden0.special_clinit_67_00(RunnableC00021.class);
            }

            RunnableC00021(AnonymousClass1 anonymousClass1, String str) {
                this.this$0 = anonymousClass1;
                this.val$errMsg = str;
            }

            @Override // java.lang.Runnable
            public native void run();
        }

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(68, AnonymousClass1.class);
            Hidden0.special_clinit_68_00(AnonymousClass1.class);
        }

        AnonymousClass1(Activity activity, long j5) {
            this.val$activity = activity;
            this.val$intervalMs = j5;
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(69, ArchersRefreshering.class);
        Hidden0.special_clinit_69_00(ArchersRefreshering.class);
    }

    static native /* synthetic */ Handler access$000();

    static native /* synthetic */ boolean access$100();

    public static native boolean isActive();

    public static native void start(Activity activity);

    public static native void stop();
}
