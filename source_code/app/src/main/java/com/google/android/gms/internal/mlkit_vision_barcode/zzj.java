package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s6.C2601a;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C2601a(11);

    /* renamed from: a, reason: collision with root package name */
    public String f6750a;
    public int alpha;
    public int purple;
    public int red;
    public int silver;
    public int teal;
    public int white;
    public boolean yellow;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.silver);
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(this.teal);
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeInt(this.white);
        AbstractC3043q.sierra(parcel, 8, 4);
        parcel.writeInt(this.yellow ? 1 : 0);
        AbstractC3043q.lima(parcel, 9, this.f6750a);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
