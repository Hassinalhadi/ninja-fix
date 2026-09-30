package k3;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: k3.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2005d extends f {
    public final String alpha;

    public C2005d(String str) {
        this.alpha = str;
    }

    @Override // k3.f
    public final Boolean alpha() {
        return Boolean.FALSE;
    }

    @Override // k3.f
    public final Long bravo() {
        return null;
    }

    @Override // k3.f
    public final String charlie() {
        return "no_location";
    }

    @Override // k3.f
    public final String delta() {
        return this.alpha;
    }

    @Override // k3.f
    public final Boolean echo() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2005d) {
                C2005d c2005d = (C2005d) obj;
                c2005d.getClass();
                if (Intrinsics.areEqual("no_location", "no_location") && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.alpha, c2005d.alpha) && Intrinsics.areEqual(null, null)) {
                    Boolean bool = Boolean.FALSE;
                    if (!Intrinsics.areEqual(bool, bool)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 1557245043 * 31 * 31;
        String str = this.alpha;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.FALSE.hashCode() + ((i4 + hashCode) * 961);
    }

    public final String toString() {
        return "SkippedNoLocation(reason=no_location, lastLocationAgeMs=null, stompState=" + this.alpha + ", topicPresent=null, freshFix=" + Boolean.FALSE + ")";
    }
}
