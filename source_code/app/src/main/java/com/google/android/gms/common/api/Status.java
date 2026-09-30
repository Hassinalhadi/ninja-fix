package com.google.android.gms.common.api;

import V5.x;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import ao.ad;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable {
    public final int alpha;
    public final String purple;
    public final PendingIntent red;
    public final ConnectionResult silver;
    public static final Status teal = new Status(0, null, null, null);
    public static final Status white = new Status(8, null, null, null);
    public static final Status yellow = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new m(3);

    public Status(int i4, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.alpha = i4;
        this.purple = str;
        this.red = pendingIntent;
        this.silver = connectionResult;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.alpha != status.alpha || !x.lima(this.purple, status.purple) || !x.lima(this.red, status.red) || !x.lima(this.silver, status.silver)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.alpha), this.purple, this.red, this.silver});
    }

    public final String toString() {
        J2.e eVar = new J2.e(this);
        String str = this.purple;
        if (str == null) {
            int i4 = this.alpha;
            switch (i4) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = ad.zulu(i4, "unknown status code: ");
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        eVar.y(str, "statusCode");
        eVar.y(this.red, "resolution");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.kilo(parcel, 3, this.red, i4);
        AbstractC3043q.kilo(parcel, 4, this.silver, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
