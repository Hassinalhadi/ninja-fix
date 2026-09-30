package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s6.C2601a;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new C2601a(8);
    public int alpha;
    public final int purple;
    public final int red;
    public final long silver;
    public final int teal;

    public zzan(int i4, int i5, int i10, int i11, long j5) {
        this.alpha = i4;
        this.purple = i5;
        this.red = i10;
        this.silver = j5;
        this.teal = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        int i5 = this.alpha;
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(i5);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.sierra(parcel, 5, 8);
        parcel.writeLong(this.silver);
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(this.teal);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
