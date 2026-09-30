package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzay> CREATOR = new C1412f(1);

    /* renamed from: a, reason: collision with root package name */
    public final zzau f7443a;
    public final int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final zzav f7444b;

    /* renamed from: c, reason: collision with root package name */
    public final zzax f7445c;

    /* renamed from: d, reason: collision with root package name */
    public final zzaw f7446d;
    public final zzas e;

    /* renamed from: f, reason: collision with root package name */
    public final zzao f7447f;

    /* renamed from: g, reason: collision with root package name */
    public final zzap f7448g;

    /* renamed from: h, reason: collision with root package name */
    public final zzaq f7449h;
    public final String purple;
    public final String red;
    public final byte[] silver;
    public final Point[] teal;
    public final int white;
    public final zzar yellow;

    public zzay(int i4, String str, String str2, byte[] bArr, Point[] pointArr, int i5, zzar zzarVar, zzau zzauVar, zzav zzavVar, zzax zzaxVar, zzaw zzawVar, zzas zzasVar, zzao zzaoVar, zzap zzapVar, zzaq zzaqVar) {
        this.alpha = i4;
        this.purple = str;
        this.red = str2;
        this.silver = bArr;
        this.teal = pointArr;
        this.white = i5;
        this.yellow = zzarVar;
        this.f7443a = zzauVar;
        this.f7444b = zzavVar;
        this.f7445c = zzaxVar;
        this.f7446d = zzawVar;
        this.e = zzasVar;
        this.f7447f = zzaoVar;
        this.f7448g = zzapVar;
        this.f7449h = zzaqVar;
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
        AbstractC3043q.kilo(parcel, 8, this.f7443a, i4);
        AbstractC3043q.kilo(parcel, 9, this.f7444b, i4);
        AbstractC3043q.kilo(parcel, 10, this.f7445c, i4);
        AbstractC3043q.kilo(parcel, 11, this.f7446d, i4);
        AbstractC3043q.kilo(parcel, 12, this.e, i4);
        AbstractC3043q.kilo(parcel, 13, this.f7447f, i4);
        AbstractC3043q.kilo(parcel, 14, this.f7448g, i4);
        AbstractC3043q.kilo(parcel, 15, this.f7449h, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
