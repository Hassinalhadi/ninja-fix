package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import t6.AbstractC3043q;
import w6.c;

/* loaded from: classes2.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CircleOptions> CREATOR = new c(11);

    /* renamed from: a, reason: collision with root package name */
    public boolean f7471a;
    public LatLng alpha;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f7472b;
    public double purple;
    public float red;
    public int silver;
    public int teal;
    public float white;
    public boolean yellow;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 2, this.alpha, i4);
        AbstractC3043q.sierra(parcel, 3, 8);
        parcel.writeDouble(this.purple);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeFloat(this.red);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.silver);
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(this.teal);
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeFloat(this.white);
        AbstractC3043q.sierra(parcel, 8, 4);
        parcel.writeInt(this.yellow ? 1 : 0);
        AbstractC3043q.sierra(parcel, 9, 4);
        parcel.writeInt(this.f7471a ? 1 : 0);
        AbstractC3043q.papa(parcel, 10, this.f7472b);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
