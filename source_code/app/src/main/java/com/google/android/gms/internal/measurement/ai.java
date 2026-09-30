package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class ai extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(Looper looper, int i4) {
        super(looper);
        switch (i4) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                return;
            case 2:
            default:
                Looper.getMainLooper();
                return;
            case 3:
                super(looper);
                Looper.getMainLooper();
                return;
        }
    }
}
