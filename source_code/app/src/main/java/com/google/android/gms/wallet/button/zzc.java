package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z6.k;

/* loaded from: classes2.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new k(15);

    /* renamed from: a, reason: collision with root package name */
    public String f7750a;
    public String alpha;

    /* renamed from: b, reason: collision with root package name */
    public String f7751b;
    public int purple;
    public boolean red;
    public String silver;
    public String teal;
    public String white;
    public String yellow;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 1, this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red ? 1 : 0);
        AbstractC3043q.lima(parcel, 4, this.silver);
        AbstractC3043q.lima(parcel, 5, this.teal);
        AbstractC3043q.lima(parcel, 6, this.white);
        AbstractC3043q.lima(parcel, 7, this.yellow);
        AbstractC3043q.lima(parcel, 8, this.f7750a);
        AbstractC3043q.lima(parcel, 9, this.f7751b);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
