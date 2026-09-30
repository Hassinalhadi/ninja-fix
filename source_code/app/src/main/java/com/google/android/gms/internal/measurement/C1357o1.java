package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1357o1 extends C1343l {
    public final C1298c purple;

    public C1357o1(C1298c c1298c) {
        this.purple = c1298c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.C1343l, com.google.android.gms.internal.measurement.InterfaceC1355o
    public final InterfaceC1355o hotel(String str, J2.i iVar, ArrayList arrayList) {
        char c3;
        C1357o1 c1357o1;
        Object obj;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c3 = 0;
                    c1357o1 = this;
                    break;
                }
                c3 = 65535;
                c1357o1 = this;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c1357o1 = this;
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                c1357o1 = this;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c1357o1 = this;
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                c1357o1 = this;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c1357o1 = this;
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                c1357o1 = this;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c3 = 5;
                    c1357o1 = this;
                    break;
                }
                c3 = 65535;
                c1357o1 = this;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c1357o1 = this;
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                c1357o1 = this;
                break;
            default:
                c3 = 65535;
                c1357o1 = this;
                break;
        }
        C1298c c1298c = c1357o1.purple;
        if (c3 != 0) {
            if (c3 != 1) {
                if (c3 != 2) {
                    if (c3 != 3) {
                        if (c3 != 4) {
                            if (c3 != 5) {
                                return super.hotel(str, iVar, arrayList);
                            }
                            AbstractC1295b1.hotel(arrayList, 2, "setParamValue");
                            String bravo = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).bravo();
                            InterfaceC1355o alpha = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1));
                            C1293b c1293b = (C1293b) c1298c.red;
                            Object foxtrot = AbstractC1295b1.foxtrot(alpha);
                            HashMap hashMap = c1293b.charlie;
                            if (foxtrot == null) {
                                hashMap.remove(bravo);
                                return alpha;
                            }
                            hashMap.put(bravo, C1293b.bravo(hashMap.get(bravo), foxtrot, bravo));
                            return alpha;
                        }
                        AbstractC1295b1.hotel(arrayList, 1, "setEventName");
                        InterfaceC1355o alpha2 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                        if (!InterfaceC1355o.gold.equals(alpha2) && !InterfaceC1355o.gray.equals(alpha2)) {
                            ((C1293b) c1298c.red).alpha = alpha2.bravo();
                            return new r(alpha2.bravo());
                        }
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    AbstractC1295b1.hotel(arrayList, 0, "getTimestamp");
                    return new C1323h(Double.valueOf(((C1293b) c1298c.red).bravo));
                }
                AbstractC1295b1.hotel(arrayList, 0, "getParams");
                HashMap hashMap2 = ((C1293b) c1298c.red).charlie;
                C1343l c1343l = new C1343l();
                for (String str2 : hashMap2.keySet()) {
                    c1343l.india(str2, AbstractC1380u1.delta(hashMap2.get(str2)));
                }
                return c1343l;
            }
            AbstractC1295b1.hotel(arrayList, 1, "getParamValue");
            String bravo2 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).bravo();
            HashMap hashMap3 = ((C1293b) c1298c.red).charlie;
            if (hashMap3.containsKey(bravo2)) {
                obj = hashMap3.get(bravo2);
            } else {
                obj = null;
            }
            return AbstractC1380u1.delta(obj);
        }
        AbstractC1295b1.hotel(arrayList, 0, "getEventName");
        return new r(((C1293b) c1298c.red).alpha);
    }
}
