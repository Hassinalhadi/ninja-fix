package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h6.BinderC1814d;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new w6.b(15);
    public LatLng alpha;

    /* renamed from: g, reason: collision with root package name */
    public float f7482g;

    /* renamed from: i, reason: collision with root package name */
    public View f7484i;

    /* renamed from: j, reason: collision with root package name */
    public int f7485j;

    /* renamed from: k, reason: collision with root package name */
    public String f7486k;

    /* renamed from: l, reason: collision with root package name */
    public float f7487l;
    public String purple;
    public String red;
    public z6.b silver;
    public boolean yellow;
    public float teal = 0.5f;
    public float white = 1.0f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7477a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7478b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f7479c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f7480d = 0.5f;
    public float e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f7481f = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f7483h = 0;

    public void E(float f5, float f10) {
        this.teal = f5;
        this.white = f10;
    }

    public void F(boolean z2) {
        this.yellow = z2;
    }

    public void G(boolean z2) {
        this.f7478b = z2;
    }

    public void H(z6.b bVar) {
        this.silver = bVar;
    }

    public void I(float f5, float f10) {
        this.f7480d = f5;
        this.e = f10;
    }

    public void J(LatLng latLng) {
        if (latLng != null) {
            this.alpha = latLng;
            return;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public void K(float f5) {
        this.f7479c = f5;
    }

    public void L(String str) {
        this.red = str;
    }

    public void M(String str) {
        this.purple = str;
    }

    public void N(boolean z2) {
        this.f7477a = z2;
    }

    public void O(float f5) {
        this.f7482g = f5;
    }

    public void o(float f5) {
        this.f7481f = f5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        IBinder asBinder;
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 2, this.alpha, i4);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.lima(parcel, 4, this.red);
        z6.b bVar = this.silver;
        if (bVar == null) {
            asBinder = null;
        } else {
            asBinder = bVar.alpha.asBinder();
        }
        AbstractC3043q.foxtrot(parcel, 5, asBinder);
        float f5 = this.teal;
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeFloat(f5);
        float f10 = this.white;
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z2 = this.yellow;
        AbstractC3043q.sierra(parcel, 8, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z10 = this.f7477a;
        AbstractC3043q.sierra(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f7478b;
        AbstractC3043q.sierra(parcel, 10, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f11 = this.f7479c;
        AbstractC3043q.sierra(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.f7480d;
        AbstractC3043q.sierra(parcel, 12, 4);
        parcel.writeFloat(f12);
        float f13 = this.e;
        AbstractC3043q.sierra(parcel, 13, 4);
        parcel.writeFloat(f13);
        float f14 = this.f7481f;
        AbstractC3043q.sierra(parcel, 14, 4);
        parcel.writeFloat(f14);
        float f15 = this.f7482g;
        AbstractC3043q.sierra(parcel, 15, 4);
        parcel.writeFloat(f15);
        AbstractC3043q.sierra(parcel, 17, 4);
        parcel.writeInt(this.f7483h);
        AbstractC3043q.foxtrot(parcel, 18, new BinderC1814d(this.f7484i));
        int i5 = this.f7485j;
        AbstractC3043q.sierra(parcel, 19, 4);
        parcel.writeInt(i5);
        AbstractC3043q.lima(parcel, 20, this.f7486k);
        AbstractC3043q.sierra(parcel, 21, 4);
        parcel.writeFloat(this.f7487l);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
