package com.incognia.internal;

import android.telephony.TelephonyCallback;

/* loaded from: classes2.dex */
public final class DuP extends TelephonyCallback implements TelephonyCallback.CallStateListener {

    /* renamed from: b, reason: collision with root package name */
    public final vfl f8572b;

    public DuP(vfl vflVar) {
        this.f8572b = vflVar;
    }

    public final void onCallStateChanged(int i4) {
        this.f8572b.invoke(Integer.valueOf(i4));
    }
}
