package com.checkout.components.wallet.common;

import com.squareup.moshi.Moshi;
import dagger.internal.b;
import dagger.internal.d;

/* loaded from: classes3.dex */
public final class GooglePayMapper_Factory implements b {

    /* renamed from: a, reason: collision with root package name */
    private final d f6456a;

    public GooglePayMapper_Factory(d dVar) {
        this.f6456a = dVar;
    }

    public static GooglePayMapper_Factory create(d dVar) {
        return new GooglePayMapper_Factory(dVar);
    }

    public static GooglePayMapper newInstance(Moshi moshi) {
        return new GooglePayMapper(moshi);
    }

    @Override // Kd.a
    public final GooglePayMapper get() {
        return new GooglePayMapper((Moshi) this.f6456a.get());
    }
}
