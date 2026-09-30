package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class K3 extends AbstractC1328i {
    public final J1 red;
    public final HashMap silver;

    public K3(J1 j12) {
        super("require");
        this.silver = new HashMap();
        this.red = j12;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1328i
    public final InterfaceC1355o charlie(J2.i iVar, List list) {
        InterfaceC1355o interfaceC1355o;
        AbstractC1295b1.hotel(list, 1, "require");
        String bravo = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) list.get(0)).bravo();
        HashMap hashMap = this.silver;
        if (hashMap.containsKey(bravo)) {
            return (InterfaceC1355o) hashMap.get(bravo);
        }
        HashMap hashMap2 = (HashMap) this.red.alpha;
        if (hashMap2.containsKey(bravo)) {
            try {
                interfaceC1355o = (InterfaceC1355o) ((Callable) hashMap2.get(bravo)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(bravo)));
            }
        } else {
            interfaceC1355o = InterfaceC1355o.gold;
        }
        if (interfaceC1355o instanceof AbstractC1328i) {
            hashMap.put(bravo, (AbstractC1328i) interfaceC1355o);
        }
        return interfaceC1355o;
    }
}
