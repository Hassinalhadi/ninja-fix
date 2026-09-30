package A2;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {
    public static final d juliet = new d();
    public final int alpha;
    public final K2.e bravo;
    public final boolean charlie;
    public final boolean delta;
    public final boolean echo;
    public final boolean foxtrot;
    public final long golf;
    public final long hotel;
    public final Set india;

    public d() {
        com.google.android.material.datepicker.j.papa(1, "requiredNetworkType");
        kotlin.collections.u uVar = kotlin.collections.u.alpha;
        this.bravo = new K2.e(null);
        this.alpha = 1;
        this.charlie = false;
        this.delta = false;
        this.echo = false;
        this.foxtrot = false;
        this.golf = -1L;
        this.hotel = -1L;
        this.india = uVar;
    }

    public final boolean alpha() {
        if (Build.VERSION.SDK_INT >= 24 && this.india.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.areEqual(d.class, obj.getClass())) {
            d dVar = (d) obj;
            if (this.charlie == dVar.charlie && this.delta == dVar.delta && this.echo == dVar.echo && this.foxtrot == dVar.foxtrot && this.golf == dVar.golf && this.hotel == dVar.hotel && Intrinsics.areEqual(this.bravo.alpha, dVar.bravo.alpha) && this.alpha == dVar.alpha) {
                return Intrinsics.areEqual(this.india, dVar.india);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int mike = ((((((((av.q.mike(this.alpha) * 31) + (this.charlie ? 1 : 0)) * 31) + (this.delta ? 1 : 0)) * 31) + (this.echo ? 1 : 0)) * 31) + (this.foxtrot ? 1 : 0)) * 31;
        long j5 = this.golf;
        int i5 = (mike + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.hotel;
        int hashCode = (this.india.hashCode() + ((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequest = this.bravo.alpha;
        if (networkRequest != null) {
            i4 = networkRequest.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + A0.z.quebec(this.alpha) + ", requiresCharging=" + this.charlie + ", requiresDeviceIdle=" + this.delta + ", requiresBatteryNotLow=" + this.echo + ", requiresStorageNotLow=" + this.foxtrot + ", contentTriggerUpdateDelayMillis=" + this.golf + ", contentTriggerMaxDelayMillis=" + this.hotel + ", contentUriTriggers=" + this.india + ", }";
    }

    public d(K2.e eVar, int i4, boolean z2, boolean z10, boolean z11, boolean z12, long j5, long j6, Set set) {
        com.google.android.material.datepicker.j.papa(i4, "requiredNetworkType");
        this.bravo = eVar;
        this.alpha = i4;
        this.charlie = z2;
        this.delta = z10;
        this.echo = z11;
        this.foxtrot = z12;
        this.golf = j5;
        this.hotel = j6;
        this.india = set;
    }

    public d(d other) {
        Intrinsics.echo(other, "other");
        this.charlie = other.charlie;
        this.delta = other.delta;
        this.bravo = other.bravo;
        this.alpha = other.alpha;
        this.echo = other.echo;
        this.foxtrot = other.foxtrot;
        this.india = other.india;
        this.golf = other.golf;
        this.hotel = other.hotel;
    }
}
