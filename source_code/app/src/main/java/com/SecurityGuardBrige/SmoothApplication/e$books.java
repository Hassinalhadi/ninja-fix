package com.SecurityGuardBrige.SmoothApplication;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.os.Handler;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class e$books {
    public static long bookBlockUntil;
    public static int bookCount;
    private static long countdownUntil;

    /* compiled from: Dex2C */
    /* loaded from: classes.dex */
    class CountdownRunnable implements Runnable {
        private Handler handler;
        private String msg;
        private int secondsLeft;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(89, CountdownRunnable.class);
            Hidden0.special_clinit_89_00(CountdownRunnable.class);
        }

        CountdownRunnable(String str, int i4, Handler handler) {
            this.msg = str;
            this.secondsLeft = i4;
            this.handler = handler;
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    /* compiled from: Dex2C */
    /* loaded from: classes.dex */
    class ToastRunnable implements Runnable {
        private String msg;

        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(90, ToastRunnable.class);
            Hidden0.special_clinit_90_00(ToastRunnable.class);
        }

        ToastRunnable(String str) {
            this.msg = str;
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(91, e$books.class);
        Hidden0.special_clinit_91_00(e$books.class);
    }

    public static native void showToastFromBg(String str);

    public static native void startCountdown(String str, int i4);
}
