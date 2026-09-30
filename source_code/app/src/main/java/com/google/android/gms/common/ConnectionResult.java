package com.google.android.gms.common;

import V5.x;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public final int alpha;
    public final int purple;
    public final PendingIntent red;
    public final String silver;
    public static final ConnectionResult teal = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new k(0);

    public ConnectionResult(int i4, int i5, PendingIntent pendingIntent, String str) {
        this.alpha = i4;
        this.purple = i5;
        this.red = pendingIntent;
        this.silver = str;
    }

    public static String E(int i4) {
        if (i4 != 99) {
            if (i4 != 1500) {
                switch (i4) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i4) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            case 25:
                                return "API_INSTALL_REQUIRED";
                            default:
                                return av.q.delta(i4, "UNKNOWN_ERROR_CODE(", ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.purple == connectionResult.purple && x.lima(this.red, connectionResult.red) && x.lima(this.silver, connectionResult.silver)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.purple), this.red, this.silver});
    }

    public final boolean o() {
        return this.purple == 0;
    }

    public final String toString() {
        J2.e eVar = new J2.e(this);
        eVar.y(E(this.purple), "statusCode");
        eVar.y(this.red, "resolution");
        eVar.y(this.silver, Constants.KEY_MESSAGE);
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.kilo(parcel, 3, this.red, i4);
        AbstractC3043q.lima(parcel, 4, this.silver);
        AbstractC3043q.romeo(parcel, quebec);
    }

    public ConnectionResult(int i4) {
        this(1, i4, null, null);
    }

    public ConnectionResult(int i4, PendingIntent pendingIntent) {
        this(1, i4, pendingIntent, null);
    }
}
