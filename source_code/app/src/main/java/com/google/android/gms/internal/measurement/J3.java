package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class J3 extends AbstractC1328i {
    public final boolean red;
    public final boolean silver;
    public final /* synthetic */ C1315f1 teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J3(C1315f1 c1315f1, boolean z2, boolean z10) {
        super("log");
        this.teal = c1315f1;
        this.red = z2;
        this.silver = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    @Override // com.google.android.gms.internal.measurement.AbstractC1328i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1355o charlie(J2.i iVar, List list) {
        int i4;
        int i5;
        AbstractC1295b1.india(list, 1, "log");
        int size = list.size();
        C1370s c1370s = InterfaceC1355o.gold;
        C1315f1 c1315f1 = this.teal;
        if (size == 1) {
            ((av.ah) c1315f1.silver).silver(3, ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) list.get(0)).bravo(), Collections.EMPTY_LIST, this.red, this.silver);
            return c1370s;
        }
        int charlie = AbstractC1295b1.charlie(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) list.get(0)).alpha().doubleValue());
        if (charlie != 2) {
            i4 = 3;
            if (charlie != 3) {
                if (charlie != 5) {
                    if (charlie == 6) {
                        i5 = 2;
                    }
                } else {
                    i5 = 5;
                }
            } else {
                i5 = 1;
            }
            InterfaceC1355o interfaceC1355o = (InterfaceC1355o) list.get(1);
            C1378u c1378u = (C1378u) iVar.purple;
            String bravo = c1378u.alpha(iVar, interfaceC1355o).bravo();
            if (list.size() != 2) {
                ((av.ah) c1315f1.silver).silver(i5, bravo, Collections.EMPTY_LIST, this.red, this.silver);
                return c1370s;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 2; i10 < Math.min(list.size(), 5); i10++) {
                arrayList.add(c1378u.alpha(iVar, (InterfaceC1355o) list.get(i10)).bravo());
            }
            ((av.ah) c1315f1.silver).silver(i5, bravo, arrayList, this.red, this.silver);
            return c1370s;
        }
        i4 = 4;
        i5 = i4;
        InterfaceC1355o interfaceC1355o2 = (InterfaceC1355o) list.get(1);
        C1378u c1378u2 = (C1378u) iVar.purple;
        String bravo2 = c1378u2.alpha(iVar, interfaceC1355o2).bravo();
        if (list.size() != 2) {
        }
    }
}
