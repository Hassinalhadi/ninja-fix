package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzcc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcc> CREATOR = new C1412f(19);
    public final int alpha;
    public final int purple;
    public final int red;
    public final int silver;
    public final long teal;

    public zzcc(int i4, int i5, int i10, int i11, long j5) {
        this.alpha = i4;
        this.purple = i5;
        this.red = i10;
        this.silver = i11;
        this.teal = j5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver);
        AbstractC3043q.sierra(parcel, 5, 8);
        parcel.writeLong(this.teal);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
