package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s6.C2601a;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new C2601a(10);

    /* renamed from: a, reason: collision with root package name */
    public zzr f6757a;
    public int alpha;

    /* renamed from: b, reason: collision with root package name */
    public zzt f6758b;

    /* renamed from: c, reason: collision with root package name */
    public zzs f6759c;

    /* renamed from: d, reason: collision with root package name */
    public zzo f6760d;
    public zzk e;

    /* renamed from: f, reason: collision with root package name */
    public zzl f6761f;

    /* renamed from: g, reason: collision with root package name */
    public zzm f6762g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f6763h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6764i;

    /* renamed from: j, reason: collision with root package name */
    public double f6765j;
    public String purple;
    public String red;
    public int silver;
    public Point[] teal;
    public zzn white;
    public zzq yellow;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.lima(parcel, 4, this.red);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.silver);
        AbstractC3043q.oscar(parcel, 6, this.teal, i4);
        AbstractC3043q.kilo(parcel, 7, this.white, i4);
        AbstractC3043q.kilo(parcel, 8, this.yellow, i4);
        AbstractC3043q.kilo(parcel, 9, this.f6757a, i4);
        AbstractC3043q.kilo(parcel, 10, this.f6758b, i4);
        AbstractC3043q.kilo(parcel, 11, this.f6759c, i4);
        AbstractC3043q.kilo(parcel, 12, this.f6760d, i4);
        AbstractC3043q.kilo(parcel, 13, this.e, i4);
        AbstractC3043q.kilo(parcel, 14, this.f6761f, i4);
        AbstractC3043q.kilo(parcel, 15, this.f6762g, i4);
        AbstractC3043q.charlie(parcel, 16, this.f6763h);
        AbstractC3043q.sierra(parcel, 17, 4);
        parcel.writeInt(this.f6764i ? 1 : 0);
        AbstractC3043q.sierra(parcel, 18, 8);
        parcel.writeDouble(this.f6765j);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
