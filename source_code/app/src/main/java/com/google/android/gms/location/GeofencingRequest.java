package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new k(23);
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    private final List zza;
    private final int zzb;
    private final String zzc;

    public GeofencingRequest(List list, int i4, String str) {
        this.zza = list;
        this.zzb = i4;
        this.zzc = str;
    }

    public List<Geofence> getGeofences() {
        return new ArrayList(this.zza);
    }

    public int getInitialTrigger() {
        return this.zzb;
    }

    public String toString() {
        String valueOf = String.valueOf(this.zza);
        int length = valueOf.length();
        int i4 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 45 + String.valueOf(i4).length() + 1);
        sb2.append("GeofencingRequest[geofences=");
        sb2.append(valueOf);
        sb2.append(", initialTrigger=");
        sb2.append(i4);
        sb2.append(Constants.AES_SUFFIX);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        List list = this.zza;
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.papa(parcel, 1, list);
        int initialTrigger = getInitialTrigger();
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(initialTrigger);
        AbstractC3043q.lima(parcel, 4, this.zzc);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
