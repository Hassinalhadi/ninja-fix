package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new Y5.b(14);

    /* renamed from: a, reason: collision with root package name */
    public long f7693a;
    public String alpha;

    /* renamed from: b, reason: collision with root package name */
    public zzbh f7694b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7695c;

    /* renamed from: d, reason: collision with root package name */
    public final zzbh f7696d;
    public String purple;
    public zzqb red;
    public long silver;
    public boolean teal;
    public String white;
    public final zzbh yellow;

    public zzai(zzai zzaiVar) {
        V5.x.hotel(zzaiVar);
        this.alpha = zzaiVar.alpha;
        this.purple = zzaiVar.purple;
        this.red = zzaiVar.red;
        this.silver = zzaiVar.silver;
        this.teal = zzaiVar.teal;
        this.white = zzaiVar.white;
        this.yellow = zzaiVar.yellow;
        this.f7693a = zzaiVar.f7693a;
        this.f7694b = zzaiVar.f7694b;
        this.f7695c = zzaiVar.f7695c;
        this.f7696d = zzaiVar.f7696d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, this.alpha);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.kilo(parcel, 4, this.red, i4);
        long j5 = this.silver;
        AbstractC3043q.sierra(parcel, 5, 8);
        parcel.writeLong(j5);
        boolean z2 = this.teal;
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC3043q.lima(parcel, 7, this.white);
        AbstractC3043q.kilo(parcel, 8, this.yellow, i4);
        long j6 = this.f7693a;
        AbstractC3043q.sierra(parcel, 9, 8);
        parcel.writeLong(j6);
        AbstractC3043q.kilo(parcel, 10, this.f7694b, i4);
        AbstractC3043q.sierra(parcel, 11, 8);
        parcel.writeLong(this.f7695c);
        AbstractC3043q.kilo(parcel, 12, this.f7696d, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }

    public zzai(String str, String str2, zzqb zzqbVar, long j5, boolean z2, String str3, zzbh zzbhVar, long j6, zzbh zzbhVar2, long j7, zzbh zzbhVar3) {
        this.alpha = str;
        this.purple = str2;
        this.red = zzqbVar;
        this.silver = j5;
        this.teal = z2;
        this.white = str3;
        this.yellow = zzbhVar;
        this.f7693a = j6;
        this.f7694b = zzbhVar2;
        this.f7695c = j7;
        this.f7696d = zzbhVar3;
    }
}
