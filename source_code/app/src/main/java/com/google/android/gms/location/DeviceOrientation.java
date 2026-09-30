package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class DeviceOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientation> CREATOR = new k(21);
    public final float[] alpha;
    public final float purple;
    public final float red;
    public final long silver;
    public final byte teal;
    public final float white;
    public final float yellow;

    public DeviceOrientation(float[] fArr, float f5, float f10, long j5, byte b2, float f11, float f12) {
        boolean z2;
        if (fArr != null && fArr.length == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if ((Float.isNaN(fArr[0]) || Float.isNaN(fArr[1]) || Float.isNaN(fArr[2]) || Float.isNaN(fArr[3])) ? false : true) {
                if (f5 >= 0.0f && f5 < 360.0f) {
                    if (f10 >= 0.0f && f10 <= 180.0f) {
                        if (f12 >= 0.0f && f12 <= 180.0f) {
                            if (j5 >= 0) {
                                this.alpha = fArr;
                                this.purple = f5;
                                this.red = f10;
                                this.white = f11;
                                this.yellow = f12;
                                this.silver = j5;
                                this.teal = (byte) (((byte) (((byte) (b2 | 16)) | 4)) | 8);
                                return;
                            }
                            throw new IllegalArgumentException();
                        }
                        throw new IllegalArgumentException();
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Input attitude cannot contain NaNs.");
        }
        throw new IllegalArgumentException("Input attitude array should be of length 4.");
    }

    public final boolean equals(Object obj) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this != obj) {
            if (obj instanceof DeviceOrientation) {
                DeviceOrientation deviceOrientation = (DeviceOrientation) obj;
                byte b2 = this.teal;
                if ((b2 & 32) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((deviceOrientation.teal & 32) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z2 == z10 && ((b2 & 32) == 0 || Float.compare(this.white, deviceOrientation.white) == 0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((b2 & 64) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((deviceOrientation.teal & 64) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 == z13 && ((b2 & 64) == 0 || Float.compare(this.yellow, deviceOrientation.yellow) == 0)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (Float.compare(this.purple, deviceOrientation.purple) != 0 || Float.compare(this.red, deviceOrientation.red) != 0 || !z11 || !z14 || this.silver != deviceOrientation.silver || !Arrays.equals(this.alpha, deviceOrientation.alpha)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.purple), Float.valueOf(this.red), Float.valueOf(this.yellow), Long.valueOf(this.silver), this.alpha, Byte.valueOf(this.teal)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceOrientation[attitude=");
        sb2.append(Arrays.toString(this.alpha));
        sb2.append(", headingDegrees=");
        sb2.append(this.purple);
        sb2.append(", headingErrorDegrees=");
        sb2.append(this.red);
        if ((this.teal & 64) != 0) {
            sb2.append(", conservativeHeadingErrorDegrees=");
            sb2.append(this.yellow);
        }
        sb2.append(", elapsedRealtimeNs=");
        sb2.append(this.silver);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.delta(parcel, (float[]) this.alpha.clone());
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeFloat(this.purple);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeFloat(this.red);
        AbstractC3043q.sierra(parcel, 6, 8);
        parcel.writeLong(this.silver);
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeInt(this.teal);
        AbstractC3043q.sierra(parcel, 8, 4);
        parcel.writeFloat(this.white);
        AbstractC3043q.sierra(parcel, 9, 4);
        parcel.writeFloat(this.yellow);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
