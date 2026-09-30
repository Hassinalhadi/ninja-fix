package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s6.C2601a;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzxq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxq> CREATOR = new C2601a(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f6766a;
    public final int alpha;
    public final int purple;
    public final int red;
    public final int silver;
    public final int teal;
    public final int white;
    public final boolean yellow;

    public zzxq(int i4, int i5, int i10, int i11, int i12, int i13, boolean z2, String str) {
        this.alpha = i4;
        this.purple = i5;
        this.red = i10;
        this.silver = i11;
        this.teal = i12;
        this.white = i13;
        this.yellow = z2;
        this.f6766a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.teal);
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(this.white);
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeInt(this.yellow ? 1 : 0);
        AbstractC3043q.lima(parcel, 8, this.f6766a);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
