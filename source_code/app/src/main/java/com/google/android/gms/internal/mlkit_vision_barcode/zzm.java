package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s6.C2601a;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new C2601a(29);

    /* renamed from: a, reason: collision with root package name */
    public String f6751a;
    public String alpha;

    /* renamed from: b, reason: collision with root package name */
    public String f6752b;

    /* renamed from: c, reason: collision with root package name */
    public String f6753c;

    /* renamed from: d, reason: collision with root package name */
    public String f6754d;
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public String f6755f;

    /* renamed from: g, reason: collision with root package name */
    public String f6756g;
    public String purple;
    public String red;
    public String silver;
    public String teal;
    public String white;
    public String yellow;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, this.alpha);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.lima(parcel, 4, this.red);
        AbstractC3043q.lima(parcel, 5, this.silver);
        AbstractC3043q.lima(parcel, 6, this.teal);
        AbstractC3043q.lima(parcel, 7, this.white);
        AbstractC3043q.lima(parcel, 8, this.yellow);
        AbstractC3043q.lima(parcel, 9, this.f6751a);
        AbstractC3043q.lima(parcel, 10, this.f6752b);
        AbstractC3043q.lima(parcel, 11, this.f6753c);
        AbstractC3043q.lima(parcel, 12, this.f6754d);
        AbstractC3043q.lima(parcel, 13, this.e);
        AbstractC3043q.lima(parcel, 14, this.f6755f);
        AbstractC3043q.lima(parcel, 15, this.f6756g);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
