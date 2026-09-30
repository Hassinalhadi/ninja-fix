package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s6.C2601a;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzyb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzyb> CREATOR = new C2601a(15);

    /* renamed from: a, reason: collision with root package name */
    public final zzxx f6773a;
    public final int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final zzxy f6774b;

    /* renamed from: c, reason: collision with root package name */
    public final zzya f6775c;

    /* renamed from: d, reason: collision with root package name */
    public final zzxz f6776d;
    public final zzxv e;

    /* renamed from: f, reason: collision with root package name */
    public final zzxr f6777f;

    /* renamed from: g, reason: collision with root package name */
    public final zzxs f6778g;

    /* renamed from: h, reason: collision with root package name */
    public final zzxt f6779h;
    public final String purple;
    public final String red;
    public final byte[] silver;
    public final Point[] teal;
    public final int white;
    public final zzxu yellow;

    public zzyb(int i4, String str, String str2, byte[] bArr, Point[] pointArr, int i5, zzxu zzxuVar, zzxx zzxxVar, zzxy zzxyVar, zzya zzyaVar, zzxz zzxzVar, zzxv zzxvVar, zzxr zzxrVar, zzxs zzxsVar, zzxt zzxtVar) {
        this.alpha = i4;
        this.purple = str;
        this.red = str2;
        this.silver = bArr;
        this.teal = pointArr;
        this.white = i5;
        this.yellow = zzxuVar;
        this.f6773a = zzxxVar;
        this.f6774b = zzxyVar;
        this.f6775c = zzyaVar;
        this.f6776d = zzxzVar;
        this.e = zzxvVar;
        this.f6777f = zzxrVar;
        this.f6778g = zzxsVar;
        this.f6779h = zzxtVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.lima(parcel, 3, this.red);
        AbstractC3043q.charlie(parcel, 4, this.silver);
        AbstractC3043q.oscar(parcel, 5, this.teal, i4);
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(this.white);
        AbstractC3043q.kilo(parcel, 7, this.yellow, i4);
        AbstractC3043q.kilo(parcel, 8, this.f6773a, i4);
        AbstractC3043q.kilo(parcel, 9, this.f6774b, i4);
        AbstractC3043q.kilo(parcel, 10, this.f6775c, i4);
        AbstractC3043q.kilo(parcel, 11, this.f6776d, i4);
        AbstractC3043q.kilo(parcel, 12, this.e, i4);
        AbstractC3043q.kilo(parcel, 13, this.f6777f, i4);
        AbstractC3043q.kilo(parcel, 14, this.f6778g, i4);
        AbstractC3043q.kilo(parcel, 15, this.f6779h, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
