package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z6.k;

/* loaded from: classes2.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new k(28);
    public Bundle alpha;
    public Feature[] purple;
    public int red;
    public ConnectionTelemetryConfiguration silver;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.bravo(parcel, 1, this.alpha);
        AbstractC3043q.oscar(parcel, 2, this.purple, i4);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.kilo(parcel, 4, this.silver, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
