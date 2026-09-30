package com.google.android.gms.location;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new k(12);
    public final int alpha;
    public final int purple;
    public final int red;
    public final int silver;

    public zzas(int i4, int i5, int i10, int i11) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        if (i4 >= 0 && i4 <= 23) {
            z2 = true;
        } else {
            z2 = false;
        }
        x.juliet("Start hour must be in range [0, 23].", z2);
        if (i5 >= 0 && i5 <= 59) {
            z10 = true;
        } else {
            z10 = false;
        }
        x.juliet("Start minute must be in range [0, 59].", z10);
        if (i10 >= 0 && i10 <= 23) {
            z11 = true;
        } else {
            z11 = false;
        }
        x.juliet("End hour must be in range [0, 23].", z11);
        if (i11 >= 0 && i11 <= 59) {
            z12 = true;
        } else {
            z12 = false;
        }
        x.juliet("End minute must be in range [0, 59].", z12);
        x.juliet("Parameters can't be all 0.", ((i4 + i5) + i10) + i11 > 0);
        this.alpha = i4;
        this.purple = i5;
        this.red = i10;
        this.silver = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzas)) {
            return false;
        }
        zzas zzasVar = (zzas) obj;
        if (this.alpha == zzasVar.alpha && this.purple == zzasVar.purple && this.red == zzasVar.red && this.silver == zzasVar.silver) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.alpha), Integer.valueOf(this.purple), Integer.valueOf(this.red), Integer.valueOf(this.silver)});
    }

    public final String toString() {
        int i4 = this.alpha;
        int length = String.valueOf(i4).length();
        int i5 = this.purple;
        int length2 = String.valueOf(i5).length();
        int i10 = this.red;
        int length3 = String.valueOf(i10).length();
        int i11 = this.silver;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 10 + length3 + 12 + String.valueOf(i11).length() + 1);
        sb2.append("UserPreferredSleepWindow [startHour=");
        sb2.append(i4);
        sb2.append(", startMinute=");
        sb2.append(i5);
        sb2.append(", endHour=");
        sb2.append(i10);
        sb2.append(", endMinute=");
        sb2.append(i11);
        sb2.append(Constants.AES_SUFFIX);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        x.hotel(parcel);
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
