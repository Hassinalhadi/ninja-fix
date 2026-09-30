package com.google.android.gms.location;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new k(20);
    public final int alpha;
    public final int purple;

    public DetectedActivity(int i4, int i5) {
        this.alpha = i4;
        this.purple = i5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.alpha == detectedActivity.alpha && this.purple == detectedActivity.purple) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.alpha), Integer.valueOf(this.purple)});
    }

    public final String toString() {
        String str;
        int i4 = this.alpha;
        if (i4 > 22 || i4 < 0) {
            i4 = 4;
        }
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                if (i4 != 7) {
                                    if (i4 != 8) {
                                        if (i4 != 16) {
                                            if (i4 != 17) {
                                                str = Integer.toString(i4);
                                            } else {
                                                str = "IN_RAIL_VEHICLE";
                                            }
                                        } else {
                                            str = "IN_ROAD_VEHICLE";
                                        }
                                    } else {
                                        str = "RUNNING";
                                    }
                                } else {
                                    str = "WALKING";
                                }
                            } else {
                                str = "TILTING";
                            }
                        } else {
                            str = "UNKNOWN";
                        }
                    } else {
                        str = "STILL";
                    }
                } else {
                    str = "ON_FOOT";
                }
            } else {
                str = "ON_BICYCLE";
            }
        } else {
            str = "IN_VEHICLE";
        }
        int length = String.valueOf(str).length();
        int i5 = this.purple;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + length + 36 + 1);
        sb2.append("DetectedActivity [type=");
        sb2.append(str);
        sb2.append(", confidence=");
        sb2.append(i5);
        sb2.append(Constants.AES_SUFFIX);
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
        AbstractC3043q.romeo(parcel, quebec);
    }
}
