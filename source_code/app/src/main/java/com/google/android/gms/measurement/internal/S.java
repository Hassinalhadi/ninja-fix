package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public enum S {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    public final String alpha;

    S(String str) {
        this.alpha = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.alpha;
    }
}
