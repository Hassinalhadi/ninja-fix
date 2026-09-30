package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z6.k;

@Deprecated
/* loaded from: classes2.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new k(7);

    /* renamed from: a, reason: collision with root package name */
    public String f7763a;
    public String alpha;

    /* renamed from: b, reason: collision with root package name */
    public String f7764b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7765c;

    /* renamed from: d, reason: collision with root package name */
    public String f7766d;
    public String purple;
    public String red;
    public String silver;
    public String teal;
    public String white;
    public String yellow;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, this.alpha);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.lima(parcel, 4, this.red);
        AbstractC3043q.lima(parcel, 5, this.silver);
        AbstractC3043q.lima(parcel, 6, this.teal);
        AbstractC3043q.lima(parcel, 7, this.white);
        AbstractC3043q.lima(parcel, 8, this.yellow);
        AbstractC3043q.lima(parcel, 9, this.f7763a);
        AbstractC3043q.lima(parcel, 10, this.f7764b);
        AbstractC3043q.sierra(parcel, 11, 4);
        parcel.writeInt(this.f7765c ? 1 : 0);
        AbstractC3043q.lima(parcel, 12, this.f7766d);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
