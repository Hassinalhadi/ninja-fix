package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import q6.m;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new w6.b(10);
    public m alpha;
    public boolean purple;
    public float red;
    public boolean silver;
    public float teal;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        IBinder asBinder;
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        m mVar = this.alpha;
        if (mVar == null) {
            asBinder = null;
        } else {
            asBinder = mVar.asBinder();
        }
        AbstractC3043q.foxtrot(parcel, 2, asBinder);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.purple ? 1 : 0);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeFloat(this.red);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.silver ? 1 : 0);
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeFloat(this.teal);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
