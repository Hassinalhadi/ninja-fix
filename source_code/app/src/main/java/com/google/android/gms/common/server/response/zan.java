package com.google.android.gms.common.server.response;

import V5.x;
import Y5.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new b(11);
    public final int alpha;
    public final HashMap purple;
    public final String red;

    public zan(int i4, String str, ArrayList arrayList) {
        this.alpha = i4;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            zal zalVar = (zal) arrayList.get(i5);
            String str2 = zalVar.purple;
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList2 = zalVar.red;
            x.hotel(arrayList2);
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                zam zamVar = (zam) arrayList2.get(i10);
                hashMap2.put(zamVar.purple, zamVar.red);
            }
            hashMap.put(str2, hashMap2);
        }
        this.purple = hashMap;
        x.hotel(str);
        this.red = str;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) hashMap.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse$Field) map.get((String) it2.next())).f6654c = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        HashMap hashMap = this.purple;
        for (String str : hashMap.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map = (Map) hashMap.get(str);
            for (String str2 : map.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map.get(str2));
            }
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.purple;
        for (String str : hashMap.keySet()) {
            arrayList.add(new zal(str, (Map) hashMap.get(str)));
        }
        AbstractC3043q.papa(parcel, 2, arrayList);
        AbstractC3043q.lima(parcel, 3, this.red);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
