package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h6.BinderC1814d;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new k(2);
    public final String alpha;
    public final boolean purple;
    public final boolean red;
    public final Context silver;
    public final boolean teal;
    public final boolean white;

    public zzo(String str, boolean z2, boolean z10, IBinder iBinder, boolean z11, boolean z12) {
        this.alpha = str;
        this.purple = z2;
        this.red = z10;
        this.silver = (Context) BinderC1814d.magenta(BinderC1814d.lime(iBinder));
        this.teal = z11;
        this.white = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 1, this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple ? 1 : 0);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red ? 1 : 0);
        AbstractC3043q.foxtrot(parcel, 4, new BinderC1814d(this.silver));
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.teal ? 1 : 0);
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(this.white ? 1 : 0);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
