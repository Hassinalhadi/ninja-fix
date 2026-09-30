package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;

/* loaded from: classes2.dex */
public final class Z0 extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        C1320g1.india.incrementAndGet();
    }
}
