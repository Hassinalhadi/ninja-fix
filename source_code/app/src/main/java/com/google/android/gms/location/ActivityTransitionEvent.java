package com.google.android.gms.location;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new k(16);
    public final int alpha;
    public final int purple;
    public final long red;

    public ActivityTransitionEvent(int i4, int i5, long j5) {
        ActivityTransition.zza(i5);
        this.alpha = i4;
        this.purple = i5;
        this.red = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        if (this.alpha == activityTransitionEvent.alpha && this.purple == activityTransitionEvent.purple && this.red == activityTransitionEvent.red) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.alpha), Integer.valueOf(this.purple), Long.valueOf(this.red)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i4 = this.alpha;
        StringBuilder sb3 = new StringBuilder(String.valueOf(i4).length() + 13);
        sb3.append("ActivityType ");
        sb3.append(i4);
        sb2.append(sb3.toString());
        sb2.append(" ");
        int i5 = this.purple;
        StringBuilder sb4 = new StringBuilder(String.valueOf(i5).length() + 15);
        sb4.append("TransitionType ");
        sb4.append(i5);
        sb2.append(sb4.toString());
        sb2.append(" ");
        long j5 = this.red;
        StringBuilder sb5 = new StringBuilder(String.valueOf(j5).length() + 21);
        sb5.append("ElapsedRealTimeNanos ");
        sb5.append(j5);
        sb2.append(sb5.toString());
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
        AbstractC3043q.sierra(parcel, 3, 8);
        parcel.writeLong(this.red);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
