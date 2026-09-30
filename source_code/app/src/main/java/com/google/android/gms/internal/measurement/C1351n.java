package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1351n extends AbstractC1328i {
    public final ArrayList red;
    public final ArrayList silver;
    public final J2.i teal;

    public C1351n(C1351n c1351n) {
        super(c1351n.alpha);
        ArrayList arrayList = new ArrayList(c1351n.red.size());
        this.red = arrayList;
        arrayList.addAll(c1351n.red);
        ArrayList arrayList2 = new ArrayList(c1351n.silver.size());
        this.silver = arrayList2;
        arrayList2.addAll(c1351n.silver);
        this.teal = c1351n.teal;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1328i
    public final InterfaceC1355o charlie(J2.i iVar, List list) {
        C1370s c1370s;
        J2.i hotel = this.teal.hotel();
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.red;
            int size = arrayList.size();
            c1370s = InterfaceC1355o.gold;
            if (i4 >= size) {
                break;
            }
            if (i4 < list.size()) {
                hotel.mike((String) arrayList.get(i4), ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) list.get(i4)));
            } else {
                hotel.mike((String) arrayList.get(i4), c1370s);
            }
            i4++;
        }
        Iterator it = this.silver.iterator();
        while (it.hasNext()) {
            InterfaceC1355o interfaceC1355o = (InterfaceC1355o) it.next();
            C1378u c1378u = (C1378u) hotel.purple;
            InterfaceC1355o alpha = c1378u.alpha(hotel, interfaceC1355o);
            if (alpha instanceof C1359p) {
                alpha = c1378u.alpha(hotel, interfaceC1355o);
            }
            if (alpha instanceof C1318g) {
                return ((C1318g) alpha).alpha;
            }
        }
        return c1370s;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1328i, com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o zzd() {
        return new C1351n(this);
    }

    public C1351n(String str, ArrayList arrayList, List list, J2.i iVar) {
        super(str);
        this.red = new ArrayList();
        this.teal = iVar;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.red.add(((InterfaceC1355o) it.next()).bravo());
            }
        }
        this.silver = new ArrayList(list);
    }
}
