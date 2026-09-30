package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new Y5.a(19);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7697a;
    public final String alpha;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7698b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7699c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7700d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7701f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7702g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7703h;

    /* renamed from: i, reason: collision with root package name */
    public final String f7704i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f7705j;

    /* renamed from: k, reason: collision with root package name */
    public final long f7706k;

    /* renamed from: l, reason: collision with root package name */
    public final List f7707l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7708m;

    /* renamed from: n, reason: collision with root package name */
    public final String f7709n;

    /* renamed from: o, reason: collision with root package name */
    public final String f7710o;

    /* renamed from: p, reason: collision with root package name */
    public final String f7711p;
    public final String purple;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7712q;

    /* renamed from: r, reason: collision with root package name */
    public final long f7713r;
    public final String red;

    /* renamed from: s, reason: collision with root package name */
    public final int f7714s;
    public final String silver;

    /* renamed from: t, reason: collision with root package name */
    public final String f7715t;
    public final long teal;

    /* renamed from: u, reason: collision with root package name */
    public final int f7716u;

    /* renamed from: v, reason: collision with root package name */
    public final long f7717v;

    /* renamed from: w, reason: collision with root package name */
    public final String f7718w;
    public final long white;

    /* renamed from: x, reason: collision with root package name */
    public final String f7719x;

    /* renamed from: y, reason: collision with root package name */
    public final long f7720y;
    public final String yellow;

    /* renamed from: z, reason: collision with root package name */
    public final int f7721z;

    public zzr(String str, String str2, String str3, long j5, String str4, long j6, long j7, String str5, boolean z2, boolean z10, String str6, long j10, int i4, boolean z11, boolean z12, String str7, Boolean bool, long j11, List list, String str8, String str9, String str10, String str11, boolean z13, long j12, int i5, String str12, int i10, long j13, String str13, String str14, long j14, int i11) {
        V5.x.echo(str);
        this.alpha = str;
        this.purple = true == TextUtils.isEmpty(str2) ? null : str2;
        this.red = str3;
        this.f7699c = j5;
        this.silver = str4;
        this.teal = j6;
        this.white = j7;
        this.yellow = str5;
        this.f7697a = z2;
        this.f7698b = z10;
        this.f7700d = str6;
        this.e = j10;
        this.f7701f = i4;
        this.f7702g = z11;
        this.f7703h = z12;
        this.f7704i = str7;
        this.f7705j = bool;
        this.f7706k = j11;
        this.f7707l = list;
        this.f7708m = str8;
        this.f7709n = str9;
        this.f7710o = str10;
        this.f7711p = str11;
        this.f7712q = z13;
        this.f7713r = j12;
        this.f7714s = i5;
        this.f7715t = str12;
        this.f7716u = i10;
        this.f7717v = j13;
        this.f7718w = str13;
        this.f7719x = str14;
        this.f7720y = j14;
        this.f7721z = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, this.alpha);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.lima(parcel, 4, this.red);
        AbstractC3043q.lima(parcel, 5, this.silver);
        AbstractC3043q.sierra(parcel, 6, 8);
        parcel.writeLong(this.teal);
        AbstractC3043q.sierra(parcel, 7, 8);
        parcel.writeLong(this.white);
        AbstractC3043q.lima(parcel, 8, this.yellow);
        AbstractC3043q.sierra(parcel, 9, 4);
        parcel.writeInt(this.f7697a ? 1 : 0);
        AbstractC3043q.sierra(parcel, 10, 4);
        parcel.writeInt(this.f7698b ? 1 : 0);
        AbstractC3043q.sierra(parcel, 11, 8);
        parcel.writeLong(this.f7699c);
        AbstractC3043q.lima(parcel, 12, this.f7700d);
        AbstractC3043q.sierra(parcel, 14, 8);
        parcel.writeLong(this.e);
        AbstractC3043q.sierra(parcel, 15, 4);
        parcel.writeInt(this.f7701f);
        AbstractC3043q.sierra(parcel, 16, 4);
        parcel.writeInt(this.f7702g ? 1 : 0);
        AbstractC3043q.sierra(parcel, 18, 4);
        parcel.writeInt(this.f7703h ? 1 : 0);
        AbstractC3043q.lima(parcel, 19, this.f7704i);
        Boolean bool = this.f7705j;
        if (bool != null) {
            AbstractC3043q.sierra(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        AbstractC3043q.sierra(parcel, 22, 8);
        parcel.writeLong(this.f7706k);
        AbstractC3043q.november(parcel, 23, this.f7707l);
        AbstractC3043q.lima(parcel, 24, this.f7708m);
        AbstractC3043q.lima(parcel, 25, this.f7709n);
        AbstractC3043q.lima(parcel, 26, this.f7710o);
        AbstractC3043q.lima(parcel, 27, this.f7711p);
        AbstractC3043q.sierra(parcel, 28, 4);
        parcel.writeInt(this.f7712q ? 1 : 0);
        AbstractC3043q.sierra(parcel, 29, 8);
        parcel.writeLong(this.f7713r);
        AbstractC3043q.sierra(parcel, 30, 4);
        parcel.writeInt(this.f7714s);
        AbstractC3043q.lima(parcel, 31, this.f7715t);
        AbstractC3043q.sierra(parcel, 32, 4);
        parcel.writeInt(this.f7716u);
        AbstractC3043q.sierra(parcel, 34, 8);
        parcel.writeLong(this.f7717v);
        AbstractC3043q.lima(parcel, 35, this.f7718w);
        AbstractC3043q.lima(parcel, 36, this.f7719x);
        AbstractC3043q.sierra(parcel, 37, 8);
        parcel.writeLong(this.f7720y);
        AbstractC3043q.sierra(parcel, 38, 4);
        parcel.writeInt(this.f7721z);
        AbstractC3043q.romeo(parcel, quebec);
    }

    public zzr(String str, String str2, String str3, String str4, long j5, long j6, String str5, boolean z2, boolean z10, long j7, String str6, long j10, int i4, boolean z11, boolean z12, String str7, Boolean bool, long j11, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z13, long j12, int i5, String str12, int i10, long j13, String str13, String str14, long j14, int i11) {
        this.alpha = str;
        this.purple = str2;
        this.red = str3;
        this.f7699c = j7;
        this.silver = str4;
        this.teal = j5;
        this.white = j6;
        this.yellow = str5;
        this.f7697a = z2;
        this.f7698b = z10;
        this.f7700d = str6;
        this.e = j10;
        this.f7701f = i4;
        this.f7702g = z11;
        this.f7703h = z12;
        this.f7704i = str7;
        this.f7705j = bool;
        this.f7706k = j11;
        this.f7707l = arrayList;
        this.f7708m = str8;
        this.f7709n = str9;
        this.f7710o = str10;
        this.f7711p = str11;
        this.f7712q = z13;
        this.f7713r = j12;
        this.f7714s = i5;
        this.f7715t = str12;
        this.f7716u = i10;
        this.f7717v = j13;
        this.f7718w = str13;
        this.f7719x = str14;
        this.f7720y = j14;
        this.f7721z = i11;
    }
}
