package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import t6.AbstractC3043q;
import z6.k;

/* loaded from: classes2.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new k(24);
    public final int alpha;
    public List purple;

    public TelemetryData(int i4, List list) {
        this.alpha = i4;
        this.purple = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.papa(parcel, 2, this.purple);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
