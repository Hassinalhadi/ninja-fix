package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzpc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpc> CREATOR = new Y5.b(17);
    public final ArrayList alpha;

    public zzpc(ArrayList arrayList) {
        this.alpha = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.hotel(parcel, 1, this.alpha);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
