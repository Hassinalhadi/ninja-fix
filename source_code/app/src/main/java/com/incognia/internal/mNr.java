package com.incognia.internal;

import android.telephony.PhoneStateListener;

/* loaded from: classes2.dex */
public final class mNr extends PhoneStateListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G5G f10901b;

    public mNr(G5G g5g) {
        this.f10901b = g5g;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i4, String str) {
        this.f10901b.b(i4);
    }
}
