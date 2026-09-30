package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new Y5.a(16);
    public final String alpha;
    public final zzbf purple;
    public final String red;
    public final long silver;

    public zzbh(zzbh zzbhVar, long j5) {
        V5.x.hotel(zzbhVar);
        this.alpha = zzbhVar.alpha;
        this.purple = zzbhVar.purple;
        this.red = zzbhVar.red;
        this.silver = j5;
    }

    public final String toString() {
        return "origin=" + this.red + ",name=" + this.alpha + ",params=" + String.valueOf(this.purple);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Y5.a.alpha(this, parcel, i4);
    }

    public zzbh(String str, zzbf zzbfVar, String str2, long j5) {
        this.alpha = str;
        this.purple = zzbfVar;
        this.red = str2;
        this.silver = j5;
    }
}
