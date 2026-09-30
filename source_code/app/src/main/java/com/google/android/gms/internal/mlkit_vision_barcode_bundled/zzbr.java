package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzbr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbr> CREATOR = new C1412f(11);
    public final boolean alpha;
    public final byte[] purple;
    public final boolean red;
    public final float silver;
    public final boolean teal;

    public zzbr(boolean z2, byte[] bArr, boolean z10, float f5, boolean z11) {
        this.alpha = z2;
        this.purple = bArr;
        this.red = z10;
        this.silver = f5;
        this.teal = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha ? 1 : 0);
        AbstractC3043q.charlie(parcel, 2, this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red ? 1 : 0);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeFloat(this.silver);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.teal ? 1 : 0);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
