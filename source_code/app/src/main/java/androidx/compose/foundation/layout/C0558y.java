package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.foundation.layout.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0558y extends AbstractC0538d {
    public final T.i india;

    public C0558y(T.i iVar) {
        this.india = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0558y) && Intrinsics.areEqual(this.india, ((C0558y) obj).india);
    }

    @Override // androidx.compose.foundation.layout.AbstractC0538d
    public final int foxtrot(int i4, Q0.n nVar) {
        return this.india.alpha(0, i4, nVar);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.india.alpha);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.india + ')';
    }
}
