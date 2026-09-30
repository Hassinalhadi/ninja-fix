package com.google.android.gms.location;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new k(1);
    public final long alpha;
    public final int purple;
    public final boolean red;
    public final ClientIdentity silver;

    public LastLocationRequest(long j5, int i4, boolean z2, ClientIdentity clientIdentity) {
        this.alpha = j5;
        this.purple = i4;
        this.red = z2;
        this.silver = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        if (this.alpha != lastLocationRequest.alpha || this.purple != lastLocationRequest.purple || this.red != lastLocationRequest.red || !x.lima(this.silver, lastLocationRequest.silver)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.alpha), Integer.valueOf(this.purple), Boolean.valueOf(this.red)});
    }

    public final String toString() {
        StringBuilder tango = Q0.c.tango("LastLocationRequest[");
        long j5 = this.alpha;
        if (j5 != Long.MAX_VALUE) {
            tango.append("maxAge=");
            p6.r.alpha(j5, tango);
        }
        int i4 = this.purple;
        if (i4 != 0) {
            tango.append(", ");
            tango.append(n.charlie(i4));
        }
        if (this.red) {
            tango.append(", bypass");
        }
        ClientIdentity clientIdentity = this.silver;
        if (clientIdentity != null) {
            tango.append(", impersonation=");
            tango.append(clientIdentity);
        }
        tango.append(']');
        return tango.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 8);
        parcel.writeLong(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red ? 1 : 0);
        AbstractC3043q.kilo(parcel, 5, this.silver, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
