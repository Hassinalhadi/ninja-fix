package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new C1412f(8);

    /* renamed from: a, reason: collision with root package name */
    public final String f7437a;
    public final String alpha;

    /* renamed from: b, reason: collision with root package name */
    public final String f7438b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7439c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7440d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7441f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7442g;
    public final String purple;
    public final String red;
    public final String silver;
    public final String teal;
    public final String white;
    public final String yellow;

    public zzaq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.alpha = str;
        this.purple = str2;
        this.red = str3;
        this.silver = str4;
        this.teal = str5;
        this.white = str6;
        this.yellow = str7;
        this.f7437a = str8;
        this.f7438b = str9;
        this.f7439c = str10;
        this.f7440d = str11;
        this.e = str12;
        this.f7441f = str13;
        this.f7442g = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 1, this.alpha);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.lima(parcel, 3, this.red);
        AbstractC3043q.lima(parcel, 4, this.silver);
        AbstractC3043q.lima(parcel, 5, this.teal);
        AbstractC3043q.lima(parcel, 6, this.white);
        AbstractC3043q.lima(parcel, 7, this.yellow);
        AbstractC3043q.lima(parcel, 8, this.f7437a);
        AbstractC3043q.lima(parcel, 9, this.f7438b);
        AbstractC3043q.lima(parcel, 10, this.f7439c);
        AbstractC3043q.lima(parcel, 11, this.f7440d);
        AbstractC3043q.lima(parcel, 12, this.e);
        AbstractC3043q.lima(parcel, 13, this.f7441f);
        AbstractC3043q.lima(parcel, 14, this.f7442g);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
