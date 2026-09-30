package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

@Deprecated
/* loaded from: classes2.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new k(8);
    public final int alpha;
    public final int purple;
    public final long red;
    public final long silver;

    public zzal(int i4, int i5, long j5, long j6) {
        this.alpha = i4;
        this.purple = i5;
        this.red = j5;
        this.silver = j6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzal) {
            zzal zzalVar = (zzal) obj;
            if (this.alpha == zzalVar.alpha && this.purple == zzalVar.purple && this.red == zzalVar.red && this.silver == zzalVar.silver) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.purple), Integer.valueOf(this.alpha), Long.valueOf(this.silver), Long.valueOf(this.red)});
    }

    public final String toString() {
        int i4 = this.alpha;
        int length = String.valueOf(i4).length();
        int i5 = this.purple;
        int length2 = String.valueOf(i5).length();
        long j5 = this.silver;
        int length3 = String.valueOf(j5).length();
        long j6 = this.red;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j6).length());
        sb2.append("NetworkLocationStatus: Wifi status: ");
        sb2.append(i4);
        sb2.append(" Cell status: ");
        sb2.append(i5);
        Q0.c.amber(sb2, " elapsed time NS: ", j5, " system time ms: ");
        sb2.append(j6);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.sierra(parcel, 3, 8);
        parcel.writeLong(this.red);
        AbstractC3043q.sierra(parcel, 4, 8);
        parcel.writeLong(this.silver);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
