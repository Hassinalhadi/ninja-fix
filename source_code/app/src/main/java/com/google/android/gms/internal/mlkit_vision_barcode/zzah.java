package com.google.android.gms.internal.mlkit_vision_barcode;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import s6.C2601a;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new C2601a(7);
    public int alpha;
    public boolean purple;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzah)) {
            return false;
        }
        zzah zzahVar = (zzah) obj;
        if (this.alpha == zzahVar.alpha && x.lima(Boolean.valueOf(this.purple), Boolean.valueOf(zzahVar.purple))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.alpha), Boolean.valueOf(this.purple)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        int i5 = this.alpha;
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(i5);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.purple ? 1 : 0);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
