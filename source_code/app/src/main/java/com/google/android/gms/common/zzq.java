package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import bd.AbstractC0754g;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new k(3);
    public final boolean alpha;
    public final String purple;
    public final int red;
    public final int silver;

    public zzq(String str, int i4, int i5, boolean z2) {
        this.alpha = z2;
        this.purple = str;
        this.red = AbstractC0754g.foxtrot(i4) - 1;
        this.silver = bc.e.bravo(i5) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha ? 1 : 0);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
