package com.google.android.gms.location;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new k(15);
    private final int zza;
    private final int zzb;

    public ActivityTransition(int i4, int i5) {
        this.zza = i4;
        this.zzb = i5;
    }

    public static void zza(int i4) {
        boolean z2 = false;
        if (i4 >= 0 && i4 <= 1) {
            z2 = true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 30);
        sb2.append("Transition type ");
        sb2.append(i4);
        sb2.append(" is not valid.");
        x.alpha(sb2.toString(), z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        if (this.zza == activityTransition.zza && this.zzb == activityTransition.zzb) {
            return true;
        }
        return false;
    }

    public int getActivityType() {
        return this.zza;
    }

    public int getTransitionType() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb)});
    }

    public String toString() {
        int i4 = this.zza;
        int length = String.valueOf(i4).length();
        int i5 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 52 + String.valueOf(i5).length() + 1);
        sb2.append("ActivityTransition [mActivityType=");
        sb2.append(i4);
        sb2.append(", mTransitionType=");
        sb2.append(i5);
        sb2.append(Constants.AES_SUFFIX);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        x.hotel(parcel);
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        int activityType = getActivityType();
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(activityType);
        int transitionType = getTransitionType();
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(transitionType);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
