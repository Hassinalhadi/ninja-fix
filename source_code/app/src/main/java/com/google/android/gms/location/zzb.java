package com.google.android.gms.location;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new k(13);

    /* renamed from: a, reason: collision with root package name */
    public final long f7453a;
    public final long alpha;

    /* renamed from: b, reason: collision with root package name */
    public String f7454b;
    public final boolean purple;
    public final WorkSource red;
    public final String silver;
    public final int[] teal;
    public final boolean white;
    public final String yellow;

    public zzb(long j5, boolean z2, WorkSource workSource, String str, int[] iArr, boolean z10, String str2, long j6, String str3) {
        this.alpha = j5;
        this.purple = z2;
        this.red = workSource;
        this.silver = str;
        this.teal = iArr;
        this.white = z10;
        this.yellow = str2;
        this.f7453a = j6;
        this.f7454b = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        x.hotel(parcel);
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 8);
        parcel.writeLong(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple ? 1 : 0);
        AbstractC3043q.kilo(parcel, 3, this.red, i4);
        AbstractC3043q.lima(parcel, 4, this.silver);
        AbstractC3043q.golf(parcel, 5, this.teal);
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(this.white ? 1 : 0);
        AbstractC3043q.lima(parcel, 7, this.yellow);
        AbstractC3043q.sierra(parcel, 8, 8);
        parcel.writeLong(this.f7453a);
        AbstractC3043q.lima(parcel, 9, this.f7454b);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
