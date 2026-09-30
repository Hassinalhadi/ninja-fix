package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s6.C2601a;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzxt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxt> CREATOR = new C2601a(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f6767a;
    public final String alpha;

    /* renamed from: b, reason: collision with root package name */
    public final String f6768b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6769c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6770d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6771f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6772g;
    public final String purple;
    public final String red;
    public final String silver;
    public final String teal;
    public final String white;
    public final String yellow;

    public zzxt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.alpha = str;
        this.purple = str2;
        this.red = str3;
        this.silver = str4;
        this.teal = str5;
        this.white = str6;
        this.yellow = str7;
        this.f6767a = str8;
        this.f6768b = str9;
        this.f6769c = str10;
        this.f6770d = str11;
        this.e = str12;
        this.f6771f = str13;
        this.f6772g = str14;
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
        AbstractC3043q.lima(parcel, 8, this.f6767a);
        AbstractC3043q.lima(parcel, 9, this.f6768b);
        AbstractC3043q.lima(parcel, 10, this.f6769c);
        AbstractC3043q.lima(parcel, 11, this.f6770d);
        AbstractC3043q.lima(parcel, 12, this.e);
        AbstractC3043q.lima(parcel, 13, this.f6771f);
        AbstractC3043q.lima(parcel, 14, this.f6772g);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
