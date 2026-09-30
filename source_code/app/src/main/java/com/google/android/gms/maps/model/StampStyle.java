package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h6.BinderC1814d;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class StampStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StampStyle> CREATOR = new w6.b(17);
    public final z6.b alpha;

    public StampStyle(IBinder iBinder) {
        this.alpha = new z6.b(BinderC1814d.lime(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.foxtrot(parcel, 2, this.alpha.alpha.asBinder());
        AbstractC3043q.romeo(parcel, quebec);
    }
}
