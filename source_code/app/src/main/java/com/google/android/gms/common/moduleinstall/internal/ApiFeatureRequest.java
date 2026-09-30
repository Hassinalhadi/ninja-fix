package com.google.android.gms.common.moduleinstall.internal;

import V5.x;
import Z5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new Object();
    public final ArrayList alpha;
    public final boolean purple;
    public final String red;
    public final String silver;

    public ApiFeatureRequest(ArrayList arrayList, boolean z2, String str, String str2) {
        x.hotel(arrayList);
        this.alpha = arrayList;
        this.purple = z2;
        this.red = str;
        this.silver = str2;
    }

    public static ApiFeatureRequest o(List list, boolean z2) {
        TreeSet treeSet = new TreeSet(a.alpha);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((l) it.next()).getOptionalFeatures());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z2, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ApiFeatureRequest)) {
            ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
            if (this.purple == apiFeatureRequest.purple && x.lima(this.alpha, apiFeatureRequest.alpha) && x.lima(this.red, apiFeatureRequest.red) && x.lima(this.silver, apiFeatureRequest.silver)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.purple), this.alpha, this.red, this.silver});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.papa(parcel, 1, this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple ? 1 : 0);
        AbstractC3043q.lima(parcel, 3, this.red);
        AbstractC3043q.lima(parcel, 4, this.silver);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
