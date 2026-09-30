package com.google.android.gms.internal.measurement;

import a0.C0366t;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import f.InterfaceC1673j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r7.AbstractC2500b;

/* renamed from: com.google.android.gms.internal.measurement.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1295b1 {
    public static volatile AbstractC2500b alpha;

    public static final T.s alpha(T.s appClickable, Function0 onClick, InterfaceC0581m interfaceC0581m) {
        Intrinsics.echo(appClickable, "$this$appClickable");
        Intrinsics.echo(onClick, "onClick");
        C0366t.bravo(0.12f, ((F.O) ((C0585q) interfaceC0581m).kilo(F.Q.alpha)).alpha);
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        if (jade == C0580l.alpha) {
            jade = ao.ad.xray(c0585q);
        }
        androidx.compose.runtime.E0 e02 = F.L1.alpha;
        return androidx.compose.foundation.a.charlie(appClickable, (InterfaceC1673j) jade, F.L1.alpha(Float.NaN, C0366t.kilo, true), true, null, onClick, 24);
    }

    public static double bravo(double d4) {
        int i4;
        if (Double.isNaN(d4)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d4) && d4 != 0.0d && d4 != 0.0d) {
            if (d4 > 0.0d) {
                i4 = 1;
            } else {
                i4 = -1;
            }
            return i4 * Math.floor(Math.abs(d4));
        }
        return d4;
    }

    public static int charlie(double d4) {
        int i4;
        if (!Double.isNaN(d4) && !Double.isInfinite(d4) && d4 != 0.0d) {
            if (d4 > 0.0d) {
                i4 = 1;
            } else {
                i4 = -1;
            }
            return (int) ((i4 * Math.floor(Math.abs(d4))) % 4.294967296E9d);
        }
        return 0;
    }

    public static void delta(J2.i iVar) {
        int charlie = charlie(iVar.lima("runtime.counter").alpha().doubleValue() + 1.0d);
        if (charlie <= 1000000) {
            iVar.november("runtime.counter", new C1323h(Double.valueOf(charlie)));
            return;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static EnumC1390x echo(String str) {
        EnumC1390x enumC1390x = null;
        if (str != null && !str.isEmpty()) {
            enumC1390x = (EnumC1390x) EnumC1390x.f6726e0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (enumC1390x != null) {
            return enumC1390x;
        }
        throw new IllegalArgumentException(av.q.echo("Unsupported commandId ", str));
    }

    public static Object foxtrot(InterfaceC1355o interfaceC1355o) {
        if (InterfaceC1355o.gray.equals(interfaceC1355o)) {
            return null;
        }
        if (InterfaceC1355o.gold.equals(interfaceC1355o)) {
            return "";
        }
        if (interfaceC1355o instanceof C1343l) {
            return golf((C1343l) interfaceC1355o);
        }
        if (interfaceC1355o instanceof C1308e) {
            ArrayList arrayList = new ArrayList();
            C1308e c1308e = (C1308e) interfaceC1355o;
            c1308e.getClass();
            int i4 = 0;
            while (i4 < c1308e.november()) {
                if (i4 < c1308e.november()) {
                    int i5 = i4 + 1;
                    Object foxtrot = foxtrot(c1308e.oscar(i4));
                    if (foxtrot != null) {
                        arrayList.add(foxtrot);
                    }
                    i4 = i5;
                } else {
                    throw new NoSuchElementException(ao.ad.zulu(i4, "Out of bounds index: "));
                }
            }
            return arrayList;
        }
        if (!interfaceC1355o.alpha().isNaN()) {
            return interfaceC1355o.alpha();
        }
        return interfaceC1355o.bravo();
    }

    public static HashMap golf(C1343l c1343l) {
        HashMap hashMap = new HashMap();
        Iterator it = new ArrayList(c1343l.alpha.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object foxtrot = foxtrot(c1343l.mike(str));
            if (foxtrot != null) {
                hashMap.put(str, foxtrot);
            }
        }
        return hashMap;
    }

    public static void hotel(List list, int i4, String str) {
        if (list.size() == i4) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i4 + " parameters found " + list.size());
    }

    public static void india(List list, int i4, String str) {
        if (list.size() >= i4) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i4 + " parameters found " + list.size());
    }

    public static void juliet(int i4, String str, ArrayList arrayList) {
        if (arrayList.size() <= i4) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i4 + " parameters found " + arrayList.size());
    }

    public static boolean kilo(InterfaceC1355o interfaceC1355o) {
        if (interfaceC1355o == null) {
            return false;
        }
        Double alpha2 = interfaceC1355o.alpha();
        if (alpha2.isNaN() || alpha2.doubleValue() < 0.0d || !alpha2.equals(Double.valueOf(Math.floor(alpha2.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static boolean lima(InterfaceC1355o interfaceC1355o, InterfaceC1355o interfaceC1355o2) {
        if (!interfaceC1355o.getClass().equals(interfaceC1355o2.getClass())) {
            return false;
        }
        if ((interfaceC1355o instanceof C1370s) || (interfaceC1355o instanceof C1347m)) {
            return true;
        }
        if (interfaceC1355o instanceof C1323h) {
            if (Double.isNaN(interfaceC1355o.alpha().doubleValue()) || Double.isNaN(interfaceC1355o2.alpha().doubleValue())) {
                return false;
            }
            return interfaceC1355o.alpha().equals(interfaceC1355o2.alpha());
        }
        if (interfaceC1355o instanceof r) {
            return interfaceC1355o.bravo().equals(interfaceC1355o2.bravo());
        }
        if (interfaceC1355o instanceof C1313f) {
            return interfaceC1355o.kilo().equals(interfaceC1355o2.kilo());
        }
        if (interfaceC1355o != interfaceC1355o2) {
            return false;
        }
        return true;
    }
}
