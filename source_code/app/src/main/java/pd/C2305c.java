package pd;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pd.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2305c {
    public final Ed.a alpha;
    public final Object bravo;

    public C2305c(Ed.a expectedType, Object response) {
        Intrinsics.echo(expectedType, "expectedType");
        Intrinsics.echo(response, "response");
        this.alpha = expectedType;
        this.bravo = response;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2305c)) {
            return false;
        }
        C2305c c2305c = (C2305c) obj;
        if (Intrinsics.areEqual(this.alpha, c2305c.alpha) && Intrinsics.areEqual(this.bravo, c2305c.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "HttpResponseContainer(expectedType=" + this.alpha + ", response=" + this.bravo + ')';
    }
}
