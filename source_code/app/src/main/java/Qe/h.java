package Qe;

import ef.s;
import java.util.Comparator;
import pe.InterfaceC2330f;
import pe.InterfaceC2334j;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import pe.al;
import s6.AbstractC2769s6;

/* loaded from: classes2.dex */
public final class h implements Comparator {
    public static final h purple = new h(0);
    public final /* synthetic */ int alpha;

    public /* synthetic */ h(int i4) {
        this.alpha = i4;
    }

    public static int alpha(InterfaceC2335k interfaceC2335k) {
        if (e.mike(interfaceC2335k)) {
            return 8;
        }
        if (interfaceC2335k instanceof InterfaceC2334j) {
            return 7;
        }
        if (interfaceC2335k instanceof al) {
            if (((al) interfaceC2335k).g() == null) {
                return 6;
            }
            return 5;
        }
        if (interfaceC2335k instanceof InterfaceC2345u) {
            if (((InterfaceC2345u) interfaceC2335k).g() == null) {
                return 4;
            }
            return 3;
        }
        if (interfaceC2335k instanceof InterfaceC2330f) {
            return 2;
        }
        if (interfaceC2335k instanceof s) {
            return 1;
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num;
        switch (this.alpha) {
            case 0:
                InterfaceC2335k interfaceC2335k = (InterfaceC2335k) obj;
                InterfaceC2335k interfaceC2335k2 = (InterfaceC2335k) obj2;
                int alpha = alpha(interfaceC2335k2) - alpha(interfaceC2335k);
                if (alpha != 0) {
                    num = Integer.valueOf(alpha);
                } else if (e.november(interfaceC2335k, 4) && e.november(interfaceC2335k2, 4)) {
                    num = 0;
                } else {
                    int compareTo = interfaceC2335k.getName().alpha.compareTo(interfaceC2335k2.getName().alpha);
                    if (compareTo != 0) {
                        num = Integer.valueOf(compareTo);
                    } else {
                        num = null;
                    }
                }
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            default:
                return AbstractC2769s6.bravo(Ue.e.golf((InterfaceC2330f) obj).bravo(), Ue.e.golf((InterfaceC2330f) obj2).bravo());
        }
    }
}
