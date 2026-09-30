package com.google.android.gms.location;

import V5.x;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new k(17);
    public static final Comparator<ActivityTransition> IS_SAME_TRANSITION = new Object();
    private final List zza;
    private final String zzb;
    private final List zzc;
    private String zzd;

    public ActivityTransitionRequest(List list, String str, List list2, String str2) {
        List unmodifiableList;
        x.india(list, "transitions can't be null");
        x.alpha("transitions can't be empty.", !list.isEmpty());
        TreeSet treeSet = new TreeSet(IS_SAME_TRANSITION);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            x.alpha(String.format("Found duplicated transition: %s.", activityTransition), treeSet.add(activityTransition));
        }
        this.zza = Collections.unmodifiableList(list);
        this.zzb = str;
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(list2);
        }
        this.zzc = unmodifiableList;
        this.zzd = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (x.lima(this.zza, activityTransitionRequest.zza) && x.lima(this.zzb, activityTransitionRequest.zzb) && x.lima(this.zzd, activityTransitionRequest.zzd) && x.lima(this.zzc, activityTransitionRequest.zzc)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i4;
        int i5;
        int hashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int i10 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (hashCode + i4) * 31;
        List list = this.zzc;
        if (list != null) {
            i5 = list.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        String str2 = this.zzd;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i12 + i10;
    }

    public void serializeToIntentExtra(Intent intent) {
        x.hotel(intent);
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST", marshall);
    }

    public String toString() {
        List list = this.zzc;
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(list);
        String str = this.zzd;
        int length = valueOf.length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 12 + valueOf2.length() + 18 + String.valueOf(str).length() + 1);
        Q0.c.azure(sb2, "ActivityTransitionRequest [mTransitions=", valueOf, ", mTag='", str2);
        Q0.c.azure(sb2, "', mClients=", valueOf2, ", mAttributionTag=", str);
        sb2.append(Constants.AES_SUFFIX);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        x.hotel(parcel);
        List list = this.zza;
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.papa(parcel, 1, list);
        AbstractC3043q.lima(parcel, 2, this.zzb);
        AbstractC3043q.papa(parcel, 3, this.zzc);
        AbstractC3043q.lima(parcel, 4, this.zzd);
        AbstractC3043q.romeo(parcel, quebec);
    }

    public final ActivityTransitionRequest zza(String str) {
        this.zzd = str;
        return this;
    }

    public ActivityTransitionRequest(List<ActivityTransition> list) {
        this(list, null, null, null);
    }
}
