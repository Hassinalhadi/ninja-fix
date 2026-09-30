package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1335j1 implements InterfaceC1400z1 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);

    public final int alpha;

    EnumC1335j1(int i4) {
        this.alpha = i4;
    }

    public final int alpha() {
        if (this != UNRECOGNIZED) {
            return this.alpha;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(alpha());
    }
}
