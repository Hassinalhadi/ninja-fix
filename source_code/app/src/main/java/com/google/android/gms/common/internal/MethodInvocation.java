package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new e(25);

    /* renamed from: a, reason: collision with root package name */
    public final int f6650a;
    public final int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final int f6651b;
    public final int purple;
    public final int red;
    public final long silver;
    public final long teal;
    public final String white;
    public final String yellow;

    public MethodInvocation(int i4, int i5, int i10, long j5, long j6, String str, String str2, int i11, int i12) {
        this.alpha = i4;
        this.purple = i5;
        this.red = i10;
        this.silver = j5;
        this.teal = j6;
        this.white = str;
        this.yellow = str2;
        this.f6650a = i11;
        this.f6651b = i12;
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
        AbstractC3043q.sierra(parcel, 4, 8);
        parcel.writeLong(this.silver);
        AbstractC3043q.sierra(parcel, 5, 8);
        parcel.writeLong(this.teal);
        AbstractC3043q.lima(parcel, 6, this.white);
        AbstractC3043q.lima(parcel, 7, this.yellow);
        AbstractC3043q.sierra(parcel, 8, 4);
        parcel.writeInt(this.f6650a);
        AbstractC3043q.sierra(parcel, 9, 4);
        parcel.writeInt(this.f6651b);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
