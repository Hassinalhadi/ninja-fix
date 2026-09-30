package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzbv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbv> CREATOR = new C1412f(13);
    public final float[] alpha;

    public zzbv(float[] fArr) {
        this.alpha = fArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.delta(parcel, this.alpha);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
