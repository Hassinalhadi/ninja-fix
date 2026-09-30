package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1382v implements Comparator {
    public final /* synthetic */ AbstractC1328i alpha;
    public final /* synthetic */ J2.i purple;

    public C1382v(AbstractC1328i abstractC1328i, J2.i iVar) {
        this.alpha = abstractC1328i;
        this.purple = iVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC1355o interfaceC1355o = (InterfaceC1355o) obj;
        InterfaceC1355o interfaceC1355o2 = (InterfaceC1355o) obj2;
        if (interfaceC1355o instanceof C1370s) {
            if (interfaceC1355o2 instanceof C1370s) {
                return 0;
            }
            return 1;
        }
        if (interfaceC1355o2 instanceof C1370s) {
            return -1;
        }
        AbstractC1328i abstractC1328i = this.alpha;
        if (abstractC1328i == null) {
            return interfaceC1355o.bravo().compareTo(interfaceC1355o2.bravo());
        }
        return (int) AbstractC1295b1.bravo(abstractC1328i.charlie(this.purple, Arrays.asList(interfaceC1355o, interfaceC1355o2)).alpha().doubleValue());
    }
}
