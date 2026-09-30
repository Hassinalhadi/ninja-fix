package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new w6.b(13);

    /* renamed from: a, reason: collision with root package name */
    public boolean f7473a;
    public z6.b alpha;

    /* renamed from: b, reason: collision with root package name */
    public float f7474b;

    /* renamed from: c, reason: collision with root package name */
    public float f7475c;

    /* renamed from: d, reason: collision with root package name */
    public float f7476d;
    public boolean e;
    public LatLng purple;
    public float red;
    public float silver;
    public LatLngBounds teal;
    public float white;
    public float yellow;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.foxtrot(parcel, 2, this.alpha.alpha.asBinder());
        AbstractC3043q.kilo(parcel, 3, this.purple, i4);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeFloat(this.red);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeFloat(this.silver);
        AbstractC3043q.kilo(parcel, 6, this.teal, i4);
        float f5 = this.white;
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeFloat(f5);
        float f10 = this.yellow;
        AbstractC3043q.sierra(parcel, 8, 4);
        parcel.writeFloat(f10);
        boolean z2 = this.f7473a;
        AbstractC3043q.sierra(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC3043q.sierra(parcel, 10, 4);
        parcel.writeFloat(this.f7474b);
        AbstractC3043q.sierra(parcel, 11, 4);
        parcel.writeFloat(this.f7475c);
        AbstractC3043q.sierra(parcel, 12, 4);
        parcel.writeFloat(this.f7476d);
        AbstractC3043q.sierra(parcel, 13, 4);
        parcel.writeInt(this.e ? 1 : 0);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
