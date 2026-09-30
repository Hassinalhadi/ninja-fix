package com.google.android.gms.location;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class SleepSegmentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new k(11);
    public final ArrayList alpha;
    public final int purple;

    public SleepSegmentRequest(int i4, ArrayList arrayList) {
        this.alpha = arrayList;
        this.purple = i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SleepSegmentRequest) {
                SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
                if (x.lima(this.alpha, sleepSegmentRequest.alpha) && this.purple == sleepSegmentRequest.purple) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.alpha, Integer.valueOf(this.purple)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        x.hotel(parcel);
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.papa(parcel, 1, this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
