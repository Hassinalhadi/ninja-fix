package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import q6.r;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class FeatureLayerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FeatureLayerOptions> CREATOR = new w6.b(12);
    public final String alpha;
    public final String purple;

    static {
        int i4 = r.red;
        Object[] objArr = new Object[7];
        objArr[0] = "ADMINISTRATIVE_AREA_LEVEL_1";
        objArr[1] = "ADMINISTRATIVE_AREA_LEVEL_2";
        objArr[2] = "COUNTRY";
        objArr[3] = "LOCALITY";
        objArr[4] = "POSTAL_CODE";
        objArr[5] = "SCHOOL_DISTRICT";
        System.arraycopy(new String[]{"DATASET"}, 0, objArr, 6, 1);
        r.kilo(7, objArr);
    }

    public FeatureLayerOptions(String str, String str2) {
        this.alpha = str;
        this.purple = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 1, this.alpha);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
