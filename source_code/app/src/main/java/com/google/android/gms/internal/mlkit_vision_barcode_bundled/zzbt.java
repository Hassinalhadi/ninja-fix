package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzbt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbt> CREATOR = new C1412f(12);
    public final float[] alpha;
    public final int purple;
    public final boolean red;

    public zzbt(float[] fArr, int i4, boolean z2) {
        this.alpha = fArr;
        this.purple = i4;
        this.red = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.delta(parcel, this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red ? 1 : 0);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
