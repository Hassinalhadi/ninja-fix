package com.google.android.gms.location;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new k(19);

    /* renamed from: a, reason: collision with root package name */
    public final ClientIdentity f7450a;
    public final long alpha;
    public final int purple;
    public final int red;
    public final long silver;
    public final boolean teal;
    public final int white;
    public final WorkSource yellow;

    public CurrentLocationRequest(long j5, int i4, int i5, long j6, boolean z2, int i10, WorkSource workSource, ClientIdentity clientIdentity) {
        this.alpha = j5;
        this.purple = i4;
        this.red = i5;
        this.silver = j6;
        this.teal = z2;
        this.white = i10;
        this.yellow = workSource;
        this.f7450a = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        if (this.alpha != currentLocationRequest.alpha || this.purple != currentLocationRequest.purple || this.red != currentLocationRequest.red || this.silver != currentLocationRequest.silver || this.teal != currentLocationRequest.teal || this.white != currentLocationRequest.white || !x.lima(this.yellow, currentLocationRequest.yellow) || !x.lima(this.f7450a, currentLocationRequest.f7450a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.alpha), Integer.valueOf(this.purple), Integer.valueOf(this.red), Long.valueOf(this.silver)});
    }

    public final String toString() {
        String str;
        StringBuilder tango = Q0.c.tango("CurrentLocationRequest[");
        tango.append(n.bravo(this.red));
        long j5 = this.alpha;
        if (j5 != Long.MAX_VALUE) {
            tango.append(", maxAge=");
            p6.r.alpha(j5, tango);
        }
        long j6 = this.silver;
        if (j6 != Long.MAX_VALUE) {
            Q0.c.amber(tango, ", duration=", j6, "ms");
        }
        int i4 = this.purple;
        if (i4 != 0) {
            tango.append(", ");
            tango.append(n.charlie(i4));
        }
        if (this.teal) {
            tango.append(", bypass");
        }
        int i5 = this.white;
        if (i5 != 0) {
            tango.append(", ");
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        str = "THROTTLE_NEVER";
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    str = "THROTTLE_ALWAYS";
                }
            } else {
                str = "THROTTLE_BACKGROUND";
            }
            tango.append(str);
        }
        WorkSource workSource = this.yellow;
        if (!e6.e.charlie(workSource)) {
            tango.append(", workSource=");
            tango.append(workSource);
        }
        ClientIdentity clientIdentity = this.f7450a;
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
        parcel.writeInt(this.red);
        AbstractC3043q.sierra(parcel, 4, 8);
        parcel.writeLong(this.silver);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.teal ? 1 : 0);
        AbstractC3043q.kilo(parcel, 6, this.yellow, i4);
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeInt(this.white);
        AbstractC3043q.kilo(parcel, 9, this.f7450a, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
