package com.SecurityGuardBrige.ShiftArchersMougraph;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import java.util.LinkedList;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public class ArchersToastQueue {
    public static Toast currentToast;
    public static final Handler handler = null;
    public static final LinkedList<Object[]> queue = null;
    public static boolean showing;

    /* compiled from: Dex2C */
    /* renamed from: com.SecurityGuardBrige.ShiftArchersMougraph.ArchersToastQueue$1, reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements Runnable {
        static {
            AlwaysMougraohSmootihbngmode.registerNativesForClass(70, AnonymousClass1.class);
            Hidden0.special_clinit_70_00(AnonymousClass1.class);
        }

        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(71, ArchersToastQueue.class);
        Hidden0.special_clinit_71_00(ArchersToastQueue.class);
    }

    public static native void enqueue(Context context, String str, int i4);

    public static native void enqueueLong(Context context, String str);

    public static native void enqueueShort(Context context, String str);

    public static native void showNext();
}
