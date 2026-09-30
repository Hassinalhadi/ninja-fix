package com.google.android.gms.common.server.response;

import Y5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Map;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new a(12);
    public final int alpha;
    public final String purple;
    public final ArrayList red;

    public zal(int i4, String str, ArrayList arrayList) {
        this.alpha = i4;
        this.purple = str;
        this.red = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.papa(parcel, 3, this.red);
        AbstractC3043q.romeo(parcel, quebec);
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.alpha = 1;
        this.purple = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse$Field) map.get(str2)));
            }
        }
        this.red = arrayList;
    }
}
