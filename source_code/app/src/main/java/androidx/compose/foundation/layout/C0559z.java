package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.foundation.layout.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0559z extends AbstractC0538d {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0559z)) {
            return false;
        }
        T.j jVar = T.d.f2060c;
        ((C0559z) obj).getClass();
        return Intrinsics.areEqual(jVar, jVar);
    }

    @Override // androidx.compose.foundation.layout.AbstractC0538d
    public final int foxtrot(int i4, Q0.n nVar) {
        return Math.round((1 - 1.0f) * ((i4 + 0) / 2.0f));
    }

    public final int hashCode() {
        return Float.floatToIntBits(-1.0f);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + T.d.f2060c + ')';
    }
}
