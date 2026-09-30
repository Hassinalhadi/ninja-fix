package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class DeviceOrientationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientationRequest> CREATOR = new k(22);
    public final long alpha;
    public final boolean purple;

    public DeviceOrientationRequest(long j5, boolean z2) {
        this.alpha = j5;
        this.purple = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientationRequest)) {
            return false;
        }
        DeviceOrientationRequest deviceOrientationRequest = (DeviceOrientationRequest) obj;
        if (this.alpha == deviceOrientationRequest.alpha && this.purple == deviceOrientationRequest.purple) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.alpha), Boolean.valueOf(this.purple)});
    }

    public final String toString() {
        String str;
        long j5 = this.alpha;
        int length = String.valueOf(j5).length();
        if (true != this.purple) {
            str = "";
        } else {
            str = ", withVelocity";
        }
        StringBuilder sb2 = new StringBuilder(str.length() + length + 46 + 1);
        sb2.append("DeviceOrientationRequest[samplingPeriodMicros=");
        sb2.append(j5);
        sb2.append(str);
        sb2.append(Constants.AES_SUFFIX);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 2, 8);
        parcel.writeLong(this.alpha);
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(this.purple ? 1 : 0);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
