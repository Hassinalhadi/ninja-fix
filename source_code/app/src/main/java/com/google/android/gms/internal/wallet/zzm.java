package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import w6.c;

/* loaded from: classes2.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new c(0);
    public String[] alpha;
    public int[] purple;
    public RemoteViews red;
    public byte[] silver;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.mike(parcel, 1, this.alpha);
        AbstractC3043q.golf(parcel, 2, this.purple);
        AbstractC3043q.kilo(parcel, 3, this.red, i4);
        AbstractC3043q.charlie(parcel, 4, this.silver);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
