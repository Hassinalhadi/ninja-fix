package androidx.compose.runtime.tooling;

import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3086y3;

/* loaded from: classes3.dex */
public final class a {
    public final Integer alpha;

    public a(AbstractC3086y3 abstractC3086y3, Integer num) {
        this.alpha = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.alpha, aVar.alpha);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + ((Object) null) + ", groupOffset=" + this.alpha + ')';
    }
}
