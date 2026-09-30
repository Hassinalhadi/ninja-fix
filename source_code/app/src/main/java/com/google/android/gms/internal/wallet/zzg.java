package com.google.android.gms.internal.wallet;

import Y5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new a(29);
    public final byte[] alpha;

    public zzg(byte[] bArr) {
        this.alpha = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.charlie(parcel, 2, this.alpha);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
