package com.google.android.gms.location;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class SleepClassifyEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new k(9);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7451a;
    public final int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final int f7452b;
    public final int purple;
    public final int red;
    public final int silver;
    public final int teal;
    public final int white;
    public final int yellow;

    public SleepClassifyEvent(int i4, int i5, int i10, int i11, int i12, int i13, int i14, boolean z2, int i15) {
        this.alpha = i4;
        this.purple = i5;
        this.red = i10;
        this.silver = i11;
        this.teal = i12;
        this.white = i13;
        this.yellow = i14;
        this.f7451a = z2;
        this.f7452b = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        if (this.alpha == sleepClassifyEvent.alpha && this.purple == sleepClassifyEvent.purple) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.alpha), Integer.valueOf(this.purple)});
    }

    public final String toString() {
        int i4 = this.alpha;
        int length = String.valueOf(i4).length();
        int i5 = this.purple;
        int length2 = String.valueOf(i5).length();
        int i10 = this.red;
        int length3 = String.valueOf(i10).length();
        int i11 = this.silver;
        StringBuilder sb2 = new StringBuilder(length + 6 + length2 + 8 + length3 + 7 + String.valueOf(i11).length());
        sb2.append(i4);
        sb2.append(" Conf:");
        sb2.append(i5);
        sb2.append(" Motion:");
        sb2.append(i10);
        sb2.append(" Light:");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        x.hotel(parcel);
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
        parcel.writeInt(this.yellow);
        AbstractC3043q.sierra(parcel, 8, 4);
        parcel.writeInt(this.f7451a ? 1 : 0);
        AbstractC3043q.sierra(parcel, 9, 4);
        parcel.writeInt(this.f7452b);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
