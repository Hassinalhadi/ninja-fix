package com.google.android.gms.location;

import V5.x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new k(18);
    private final List zza;
    private Bundle zzb;

    public ActivityTransitionResult(List<ActivityTransitionEvent> list) {
        this.zzb = null;
        x.india(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i4 = 1; i4 < list.size(); i4++) {
                int i5 = i4 - 1;
                x.charlie(list.get(i4).red >= list.get(i5).red, "Transition out of order: ts1=%d, ts2=%d", Long.valueOf(list.get(i4).red), Long.valueOf(list.get(i5).red));
            }
        }
        this.zza = Collections.unmodifiableList(list);
    }

    public static ActivityTransitionResult extractResult(Intent intent) {
        SafeParcelable safeParcelable = null;
        if (!hasResult(intent)) {
            return null;
        }
        Parcelable.Creator<ActivityTransitionResult> creator = CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
        if (byteArrayExtra != null) {
            safeParcelable = t6.r.bravo(byteArrayExtra, creator);
        }
        return (ActivityTransitionResult) safeParcelable;
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.zza.equals(((ActivityTransitionResult) obj).zza);
        }
        return false;
    }

    public List<ActivityTransitionEvent> getTransitionEvents() {
        return this.zza;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        x.hotel(parcel);
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.papa(parcel, 1, getTransitionEvents());
        AbstractC3043q.bravo(parcel, 2, this.zzb);
        AbstractC3043q.romeo(parcel, quebec);
    }

    public ActivityTransitionResult(List list, Bundle bundle) {
        this(list);
        this.zzb = bundle;
    }
}
