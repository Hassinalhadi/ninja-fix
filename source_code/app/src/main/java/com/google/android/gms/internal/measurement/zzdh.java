package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzdh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdh> CREATOR = new av(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f6749a;
    public final long alpha;
    public final long purple;
    public final boolean red;
    public final String silver;
    public final String teal;
    public final String white;
    public final Bundle yellow;

    public zzdh(long j5, long j6, boolean z2, String str, String str2, String str3, Bundle bundle, String str4) {
        this.alpha = j5;
        this.purple = j6;
        this.red = z2;
        this.silver = str;
        this.teal = str2;
        this.white = str3;
        this.yellow = bundle;
        this.f6749a = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 8);
        parcel.writeLong(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 8);
        parcel.writeLong(this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red ? 1 : 0);
        AbstractC3043q.lima(parcel, 4, this.silver);
        AbstractC3043q.lima(parcel, 5, this.teal);
        AbstractC3043q.lima(parcel, 6, this.white);
        AbstractC3043q.bravo(parcel, 7, this.yellow);
        AbstractC3043q.lima(parcel, 8, this.f6749a);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
