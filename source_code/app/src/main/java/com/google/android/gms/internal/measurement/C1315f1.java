package com.google.android.gms.internal.measurement;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1315f1 extends AbstractC1328i {
    public final /* synthetic */ int red = 1;
    public final Object silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1315f1(J2.c cVar) {
        super("getValue");
        this.silver = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1328i
    public final InterfaceC1355o charlie(J2.i iVar, List list) {
        HashMap hashMap;
        Object obj;
        String str;
        int i4;
        TreeMap treeMap;
        switch (this.red) {
            case 0:
                AbstractC1295b1.hotel(list, 3, this.alpha);
                String bravo = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) list.get(0)).bravo();
                InterfaceC1355o interfaceC1355o = (InterfaceC1355o) list.get(1);
                C1378u c1378u = (C1378u) iVar.purple;
                long bravo2 = (long) AbstractC1295b1.bravo(c1378u.alpha(iVar, interfaceC1355o).alpha().doubleValue());
                InterfaceC1355o alpha = c1378u.alpha(iVar, (InterfaceC1355o) list.get(2));
                if (alpha instanceof C1343l) {
                    hashMap = AbstractC1295b1.golf((C1343l) alpha);
                } else {
                    hashMap = new HashMap();
                }
                C1298c c1298c = (C1298c) this.silver;
                c1298c.getClass();
                HashMap hashMap2 = new HashMap();
                for (String str2 : hashMap.keySet()) {
                    HashMap hashMap3 = ((C1293b) c1298c.purple).charlie;
                    if (hashMap3.containsKey(str2)) {
                        obj = hashMap3.get(str2);
                    } else {
                        obj = null;
                    }
                    hashMap2.put(str2, C1293b.bravo(obj, hashMap.get(str2), str2));
                }
                ((ArrayList) c1298c.silver).add(new C1293b(bravo, bravo2, hashMap2));
                return InterfaceC1355o.gold;
            case 1:
                AbstractC1295b1.hotel(list, 2, "getValue");
                InterfaceC1355o alpha2 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) list.get(0));
                InterfaceC1355o alpha3 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) list.get(1));
                String bravo3 = alpha2.bravo();
                J2.c cVar = (J2.c) this.silver;
                Map map = (Map) ((com.google.android.gms.measurement.internal.A) cVar.red).silver.get((String) cVar.purple);
                if (map != null && map.containsKey(bravo3)) {
                    str = (String) map.get(bravo3);
                } else {
                    str = null;
                }
                if (str != null) {
                    return new r(str);
                }
                return alpha3;
            case 2:
                return InterfaceC1355o.gold;
            case 3:
                try {
                    return AbstractC1380u1.delta(((com.google.android.gms.measurement.internal.az) this.silver).call());
                } catch (Exception unused) {
                    return InterfaceC1355o.gold;
                }
            default:
                AbstractC1295b1.hotel(list, 3, this.alpha);
                ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) list.get(0)).bravo();
                InterfaceC1355o interfaceC1355o2 = (InterfaceC1355o) list.get(1);
                C1378u c1378u2 = (C1378u) iVar.purple;
                InterfaceC1355o alpha4 = c1378u2.alpha(iVar, interfaceC1355o2);
                if (alpha4 instanceof C1351n) {
                    InterfaceC1355o alpha5 = c1378u2.alpha(iVar, (InterfaceC1355o) list.get(2));
                    if (alpha5 instanceof C1343l) {
                        C1343l c1343l = (C1343l) alpha5;
                        if (c1343l.alpha.containsKey(Constants.KEY_TYPE)) {
                            String bravo4 = c1343l.mike(Constants.KEY_TYPE).bravo();
                            if (c1343l.alpha.containsKey(Constants.INAPP_PRIORITY)) {
                                i4 = AbstractC1295b1.charlie(c1343l.mike(Constants.INAPP_PRIORITY).alpha().doubleValue());
                            } else {
                                i4 = 1000;
                            }
                            C1351n c1351n = (C1351n) alpha4;
                            C1378u c1378u3 = (C1378u) this.silver;
                            c1378u3.getClass();
                            if ("create".equals(bravo4)) {
                                treeMap = (TreeMap) c1378u3.bravo;
                            } else if ("edit".equals(bravo4)) {
                                treeMap = (TreeMap) c1378u3.alpha;
                            } else {
                                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(bravo4)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(i4))) {
                                i4 = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(i4), c1351n);
                            return InterfaceC1355o.gold;
                        }
                        throw new IllegalArgumentException("Undefined rule type");
                    }
                    throw new IllegalArgumentException("Invalid callback params");
                }
                throw new IllegalArgumentException("Invalid callback type");
        }
    }

    public C1315f1(av.ah ahVar) {
        super("internal.logger");
        this.silver = ahVar;
        this.purple.put("log", new J3(this, false, true));
        this.purple.put("silent", new K1("silent", 1));
        ((AbstractC1328i) this.purple.get("silent")).india("log", new J3(this, true, true));
        this.purple.put("unmonitored", new K1("unmonitored", 2));
        ((AbstractC1328i) this.purple.get("unmonitored")).india("log", new J3(this, false, false));
    }

    public C1315f1(C1298c c1298c) {
        super("internal.eventLogger");
        this.silver = c1298c;
    }

    public C1315f1(C1378u c1378u) {
        super("internal.registerCallback");
        this.silver = c1378u;
    }

    public C1315f1(com.google.android.gms.measurement.internal.az azVar) {
        super("internal.appMetadata");
        this.silver = azVar;
    }
}
