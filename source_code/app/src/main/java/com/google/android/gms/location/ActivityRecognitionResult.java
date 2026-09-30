package com.google.android.gms.location;

import V5.x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new k(14);
    List zza;
    long zzb;
    long zzc;
    int zzd;
    Bundle zze;

    public ActivityRecognitionResult(List list, long j5, long j6, int i4, Bundle bundle) {
        x.alpha("Must have at least 1 detected activity", (list == null || list.isEmpty()) ? false : true);
        x.alpha("Must set times", j5 > 0 && j6 > 0);
        this.zza = list;
        this.zzb = j5;
        this.zzc = j6;
        this.zzd = i4;
        this.zze = bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ActivityRecognitionResult extractResult(Intent intent) {
        Bundle extras;
        ActivityRecognitionResult activityRecognitionResult;
        if (hasResult(intent) && (extras = intent.getExtras()) != null) {
            Object obj = extras.get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
            if (obj instanceof byte[]) {
                activityRecognitionResult = (ActivityRecognitionResult) t6.r.bravo((byte[]) obj, CREATOR);
            } else if (obj instanceof ActivityRecognitionResult) {
                activityRecognitionResult = (ActivityRecognitionResult) obj;
            }
            if (activityRecognitionResult == null) {
                return activityRecognitionResult;
            }
            List zza = zza(intent);
            if (zza == null || zza.isEmpty()) {
                return null;
            }
            return (ActivityRecognitionResult) zza.get(zza.size() - 1);
        }
        activityRecognitionResult = null;
        if (activityRecognitionResult == null) {
        }
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List zza = zza(intent);
        if (zza == null || zza.isEmpty()) {
            return false;
        }
        return true;
    }

    public static List zza(Intent intent) {
        ArrayList arrayList = null;
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            Parcelable.Creator<ActivityRecognitionResult> creator = CREATOR;
            ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST");
            if (arrayList2 == null) {
                return null;
            }
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(t6.r.bravo((byte[]) arrayList2.get(i4), creator));
            }
        }
        return arrayList;
    }

    private static boolean zzb(Bundle bundle, Bundle bundle2) {
        int length;
        if (bundle == null) {
            if (bundle2 == null) {
                return true;
            }
            return false;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!zzb(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i4 = 0; i4 < length; i4++) {
                            if (x.lima(Array.get(obj, i4), Array.get(obj2, i4))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.zzb == activityRecognitionResult.zzb && this.zzc == activityRecognitionResult.zzc && this.zzd == activityRecognitionResult.zzd && x.lima(this.zza, activityRecognitionResult.zza) && zzb(this.zze, activityRecognitionResult.zze)) {
                return true;
            }
        }
        return false;
    }

    public int getActivityConfidence(int i4) {
        for (DetectedActivity detectedActivity : this.zza) {
            int i5 = detectedActivity.alpha;
            if (i5 > 22 || i5 < 0) {
                i5 = 4;
            }
            if (i5 == i4) {
                return detectedActivity.purple;
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.zzc;
    }

    public DetectedActivity getMostProbableActivity() {
        return (DetectedActivity) this.zza.get(0);
    }

    public List<DetectedActivity> getProbableActivities() {
        return this.zza;
    }

    public long getTime() {
        return this.zzb;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zza, this.zze});
    }

    public String toString() {
        String valueOf = String.valueOf(this.zza);
        long j5 = this.zzb;
        long j6 = this.zzc;
        int length = valueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 59 + String.valueOf(j5).length() + 24 + String.valueOf(j6).length() + 1);
        sb2.append("ActivityRecognitionResult [probableActivities=");
        sb2.append(valueOf);
        sb2.append(", timeMillis=");
        sb2.append(j5);
        sb2.append(", elapsedRealtimeMillis=");
        sb2.append(j6);
        sb2.append(Constants.AES_SUFFIX);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.papa(parcel, 1, this.zza);
        long j5 = this.zzb;
        AbstractC3043q.sierra(parcel, 2, 8);
        parcel.writeLong(j5);
        long j6 = this.zzc;
        AbstractC3043q.sierra(parcel, 3, 8);
        parcel.writeLong(j6);
        int i5 = this.zzd;
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(i5);
        AbstractC3043q.bravo(parcel, 5, this.zze);
        AbstractC3043q.romeo(parcel, quebec);
    }

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j5, long j6) {
        this(Collections.singletonList(detectedActivity), j5, j6, 0, null);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j5, long j6) {
        this(list, j5, j6, 0, null);
    }
}
