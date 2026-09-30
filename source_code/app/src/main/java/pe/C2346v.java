package pe;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pe.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2346v extends au {
    public final Ne.f alpha;
    public final p000if.d bravo;

    public C2346v(Ne.f fVar, p000if.d underlyingType) {
        Intrinsics.echo(underlyingType, "underlyingType");
        this.alpha = fVar;
        this.bravo = underlyingType;
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.alpha + ", underlyingType=" + this.bravo + ')';
    }
}
