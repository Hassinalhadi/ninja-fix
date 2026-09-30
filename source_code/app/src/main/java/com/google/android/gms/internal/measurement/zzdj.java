package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Objects;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzdj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdj> CREATOR = new av(1);
    public final int alpha;
    public final String purple;
    public final Intent red;

    public zzdj(int i4, String str, Intent intent) {
        this.alpha = i4;
        this.purple = str;
        this.red = intent;
    }

    public static zzdj o(Activity activity) {
        return new zzdj(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdj)) {
            return false;
        }
        zzdj zzdjVar = (zzdj) obj;
        if (this.alpha == zzdjVar.alpha && Objects.equals(this.purple, zzdjVar.purple) && Objects.equals(this.red, zzdjVar.red)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.kilo(parcel, 3, this.red, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
