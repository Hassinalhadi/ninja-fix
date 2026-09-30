package com.google.android.gms.common.server.converter;

import Y5.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class StringToIntConverter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new a(10);
    public final int alpha;
    public final HashMap purple = new HashMap();
    public final SparseArray red = new SparseArray();

    public StringToIntConverter(int i4, ArrayList arrayList) {
        this.alpha = i4;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            zac zacVar = (zac) arrayList.get(i5);
            String str = zacVar.purple;
            int i10 = zacVar.red;
            this.purple.put(str, Integer.valueOf(i10));
            this.red.put(i10, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.purple;
        for (String str : hashMap.keySet()) {
            arrayList.add(new zac(str, ((Integer) hashMap.get(str)).intValue()));
        }
        AbstractC3043q.papa(parcel, 2, arrayList);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
