package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbe> CREATOR = new C1412f(4);
    public final zzbr alpha;

    public zzbe(zzbr zzbrVar) {
        this.alpha = zzbrVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 1, this.alpha, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
