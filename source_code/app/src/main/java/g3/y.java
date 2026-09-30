package g3;

import android.location.Location;
import kotlin.jvm.internal.Intrinsics;
import s6.M4;

/* loaded from: classes3.dex */
public final class y extends M4 {
    public final Location bravo;

    public y(Location location) {
        Intrinsics.echo(location, "location");
        this.bravo = location;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y) && Intrinsics.areEqual(this.bravo, ((y) obj).bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode();
    }

    public final String toString() {
        return "Valid(location=" + this.bravo + ")";
    }
}
