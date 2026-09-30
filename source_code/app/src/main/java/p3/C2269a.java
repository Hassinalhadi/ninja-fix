package p3;

import com.google.android.gms.location.LocationRequest;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2269a {
    public LocationRequest alpha;
    public long bravo;
    public long charlie;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2269a)) {
            return false;
        }
        C2269a c2269a = (C2269a) obj;
        if (Intrinsics.areEqual(this.alpha, c2269a.alpha) && this.bravo == c2269a.bravo && this.charlie == c2269a.charlie) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.alpha.hashCode() * 31;
        long j5 = this.bravo;
        int i4 = (hashCode + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.charlie;
        return i4 + ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "AdaptiveRequestHolder(locationRequest=" + this.alpha + ", locationInterval=" + this.bravo + ", locationFastestInterval=" + this.charlie + ")";
    }
}
