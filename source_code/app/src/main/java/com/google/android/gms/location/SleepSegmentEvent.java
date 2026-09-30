package com.google.android.gms.location;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class SleepSegmentEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new k(10);
    public final long alpha;
    public final long purple;
    public final int red;
    public final int silver;
    public final int teal;

    public SleepSegmentEvent(int i4, int i5, int i10, long j5, long j6) {
        boolean z2;
        if (j5 <= j6) {
            z2 = true;
        } else {
            z2 = false;
        }
        x.alpha("endTimeMillis must be greater than or equal to startTimeMillis", z2);
        this.alpha = j5;
        this.purple = j6;
        this.red = i4;
        this.silver = i5;
        this.teal = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.alpha == sleepSegmentEvent.alpha && this.purple == sleepSegmentEvent.purple && this.red == sleepSegmentEvent.red && this.silver == sleepSegmentEvent.silver && this.teal == sleepSegmentEvent.teal) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.alpha), Long.valueOf(this.purple), Integer.valueOf(this.red)});
    }

    public final String toString() {
        long j5 = this.alpha;
        int length = String.valueOf(j5).length();
        long j6 = this.purple;
        int length2 = String.valueOf(j6).length();
        int i4 = this.red;
        StringBuilder sb2 = new StringBuilder(length + 24 + length2 + 9 + String.valueOf(i4).length());
        Q0.c.amber(sb2, "startMillis=", j5, ", endMillis=");
        sb2.append(j6);
        sb2.append(", status=");
        sb2.append(i4);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        x.hotel(parcel);
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 8);
        parcel.writeLong(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 8);
        parcel.writeLong(this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.teal);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
