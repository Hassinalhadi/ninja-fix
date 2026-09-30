package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzpe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpe> CREATOR = new Y5.a(18);
    public final List alpha;

    public zzpe(List list) {
        this.alpha = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.papa(parcel, 1, this.alpha);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
