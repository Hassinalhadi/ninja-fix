package com.google.android.gms.location;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new k(3);
    public final boolean alpha;
    public final ClientIdentity purple;

    public zzad(boolean z2, ClientIdentity clientIdentity) {
        this.alpha = z2;
        this.purple = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj;
        if (this.alpha != zzadVar.alpha || !x.lima(this.purple, zzadVar.purple)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.alpha)});
    }

    public final String toString() {
        StringBuilder tango = Q0.c.tango("LocationAvailabilityRequest[");
        if (this.alpha) {
            tango.append("bypass, ");
        }
        ClientIdentity clientIdentity = this.purple;
        if (clientIdentity != null) {
            tango.append("impersonation=");
            tango.append(clientIdentity);
            tango.append(", ");
        }
        tango.setLength(tango.length() - 2);
        tango.append(']');
        return tango.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha ? 1 : 0);
        AbstractC3043q.kilo(parcel, 2, this.purple, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
