package com.google.android.gms.internal.measurement;

import com.clevertap.android.sdk.variables.CTVariableUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1374t {
    public final ArrayList alpha = new ArrayList();
    public final /* synthetic */ int bravo;

    public C1374t(int i4) {
        this.bravo = i4;
    }

    public static C1351n charlie(J2.i iVar, ArrayList arrayList) {
        EnumC1390x enumC1390x = EnumC1390x.ADD;
        AbstractC1295b1.india(arrayList, 2, "FN");
        InterfaceC1355o alpha = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
        InterfaceC1355o alpha2 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1));
        if (alpha2 instanceof C1308e) {
            ArrayList sierra = ((C1308e) alpha2).sierra();
            List arrayList2 = new ArrayList();
            if (arrayList.size() > 2) {
                arrayList2 = arrayList.subList(2, arrayList.size());
            }
            return new C1351n(alpha.bravo(), sierra, arrayList2, iVar);
        }
        throw new IllegalArgumentException(av.q.echo("FN requires an ArrayValue of parameter names found ", alpha2.getClass().getCanonicalName()));
    }

    public static InterfaceC1355o delta(C1386w c1386w, Iterator it, InterfaceC1355o interfaceC1355o) {
        J2.i hotel;
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC1355o interfaceC1355o2 = (InterfaceC1355o) it.next();
                switch (c1386w.alpha) {
                    case 0:
                        hotel = c1386w.bravo.hotel();
                        String str = c1386w.charlie;
                        hotel.mike(str, interfaceC1355o2);
                        ((HashMap) hotel.silver).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        hotel = c1386w.bravo.hotel();
                        hotel.mike(c1386w.charlie, interfaceC1355o2);
                        break;
                    default:
                        String str2 = c1386w.charlie;
                        hotel = c1386w.bravo;
                        hotel.mike(str2, interfaceC1355o2);
                        break;
                }
                InterfaceC1355o kilo = hotel.kilo((C1308e) interfaceC1355o);
                if (kilo instanceof C1318g) {
                    C1318g c1318g = (C1318g) kilo;
                    if ("break".equals(c1318g.purple)) {
                        return InterfaceC1355o.gold;
                    }
                    if ("return".equals(c1318g.purple)) {
                        return c1318g;
                    }
                }
            }
        }
        return InterfaceC1355o.gold;
    }

    public static boolean echo(InterfaceC1355o interfaceC1355o, InterfaceC1355o interfaceC1355o2) {
        if (interfaceC1355o.getClass().equals(interfaceC1355o2.getClass())) {
            if ((interfaceC1355o instanceof C1370s) || (interfaceC1355o instanceof C1347m)) {
                return true;
            }
            if (interfaceC1355o instanceof C1323h) {
                if (Double.isNaN(interfaceC1355o.alpha().doubleValue()) || Double.isNaN(interfaceC1355o2.alpha().doubleValue()) || interfaceC1355o.alpha().doubleValue() != interfaceC1355o2.alpha().doubleValue()) {
                    return false;
                }
                return true;
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
        if (((interfaceC1355o instanceof C1370s) || (interfaceC1355o instanceof C1347m)) && ((interfaceC1355o2 instanceof C1370s) || (interfaceC1355o2 instanceof C1347m))) {
            return true;
        }
        boolean z2 = interfaceC1355o instanceof C1323h;
        if (z2 && (interfaceC1355o2 instanceof r)) {
            return echo(interfaceC1355o, new C1323h(interfaceC1355o2.alpha()));
        }
        boolean z10 = interfaceC1355o instanceof r;
        if (z10 && (interfaceC1355o2 instanceof C1323h)) {
            return echo(new C1323h(interfaceC1355o.alpha()), interfaceC1355o2);
        }
        if (interfaceC1355o instanceof C1313f) {
            return echo(new C1323h(interfaceC1355o.alpha()), interfaceC1355o2);
        }
        if (interfaceC1355o2 instanceof C1313f) {
            return echo(interfaceC1355o, new C1323h(interfaceC1355o2.alpha()));
        }
        if ((!z10 && !z2) || !(interfaceC1355o2 instanceof InterfaceC1338k)) {
            if (!(interfaceC1355o instanceof InterfaceC1338k) || (!(interfaceC1355o2 instanceof r) && !(interfaceC1355o2 instanceof C1323h))) {
                return false;
            }
            return echo(new r(interfaceC1355o.bravo()), interfaceC1355o2);
        }
        return echo(interfaceC1355o, new r(interfaceC1355o2.bravo()));
    }

    public static boolean foxtrot(InterfaceC1355o interfaceC1355o, InterfaceC1355o interfaceC1355o2) {
        if (interfaceC1355o instanceof InterfaceC1338k) {
            interfaceC1355o = new r(interfaceC1355o.bravo());
        }
        if (interfaceC1355o2 instanceof InterfaceC1338k) {
            interfaceC1355o2 = new r(interfaceC1355o2.bravo());
        }
        if ((interfaceC1355o instanceof r) && (interfaceC1355o2 instanceof r)) {
            if (((r) interfaceC1355o).alpha.compareTo(((r) interfaceC1355o2).alpha) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = interfaceC1355o.alpha().doubleValue();
        double doubleValue2 = interfaceC1355o2.alpha().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    public static InterfaceC1355o golf(C1386w c1386w, InterfaceC1355o interfaceC1355o, InterfaceC1355o interfaceC1355o2) {
        if (interfaceC1355o instanceof Iterable) {
            return delta(c1386w, ((Iterable) interfaceC1355o).iterator(), interfaceC1355o2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean hotel(InterfaceC1355o interfaceC1355o, InterfaceC1355o interfaceC1355o2) {
        if (interfaceC1355o instanceof InterfaceC1338k) {
            interfaceC1355o = new r(interfaceC1355o.bravo());
        }
        if (interfaceC1355o2 instanceof InterfaceC1338k) {
            interfaceC1355o2 = new r(interfaceC1355o2.bravo());
        }
        if (((!(interfaceC1355o instanceof r) || !(interfaceC1355o2 instanceof r)) && (Double.isNaN(interfaceC1355o.alpha().doubleValue()) || Double.isNaN(interfaceC1355o2.alpha().doubleValue()))) || foxtrot(interfaceC1355o2, interfaceC1355o)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:361:0x0916, code lost:
    
        if ("return".equals(r4.purple) != false) goto L303;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:533:0x0c8e. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC1355o alpha(String str, J2.i iVar, ArrayList arrayList) {
        boolean echo;
        boolean echo2;
        InterfaceC1355o interfaceC1355o;
        C1318g c1318g;
        C1318g c1318g2;
        InterfaceC1355o rVar;
        InterfaceC1355o alpha;
        InterfaceC1355o alpha2;
        String str2;
        InterfaceC1355o interfaceC1355o2 = null;
        int i4 = 0;
        switch (this.bravo) {
            case 0:
                EnumC1390x enumC1390x = EnumC1390x.ADD;
                switch (AbstractC1295b1.echo(str).ordinal()) {
                    case 4:
                        AbstractC1295b1.hotel(arrayList, 2, "BITWISE_AND");
                        return new C1323h(Double.valueOf(AbstractC1295b1.charlie(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue()) & AbstractC1295b1.charlie(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue())));
                    case 5:
                        AbstractC1295b1.hotel(arrayList, 2, "BITWISE_LEFT_SHIFT");
                        return new C1323h(Double.valueOf(AbstractC1295b1.charlie(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue()) << ((int) (AbstractC1295b1.charlie(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue()) & 31))));
                    case 6:
                        AbstractC1295b1.hotel(arrayList, 1, "BITWISE_NOT");
                        return new C1323h(Double.valueOf(~AbstractC1295b1.charlie(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue())));
                    case 7:
                        AbstractC1295b1.hotel(arrayList, 2, "BITWISE_OR");
                        return new C1323h(Double.valueOf(AbstractC1295b1.charlie(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue()) | AbstractC1295b1.charlie(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue())));
                    case 8:
                        AbstractC1295b1.hotel(arrayList, 2, "BITWISE_RIGHT_SHIFT");
                        return new C1323h(Double.valueOf(AbstractC1295b1.charlie(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue()) >> ((int) (AbstractC1295b1.charlie(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue()) & 31))));
                    case 9:
                        AbstractC1295b1.hotel(arrayList, 2, "BITWISE_UNSIGNED_RIGHT_SHIFT");
                        return new C1323h(Double.valueOf((AbstractC1295b1.charlie(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue()) & 4294967295L) >>> ((int) (AbstractC1295b1.charlie(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue()) & 31))));
                    case 10:
                        AbstractC1295b1.hotel(arrayList, 2, "BITWISE_XOR");
                        return new C1323h(Double.valueOf(AbstractC1295b1.charlie(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue()) ^ AbstractC1295b1.charlie(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue())));
                    default:
                        bravo(str);
                        throw null;
                }
            case 1:
                AbstractC1295b1.hotel(arrayList, 2, AbstractC1295b1.echo(str).name());
                InterfaceC1355o alpha3 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                InterfaceC1355o alpha4 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1));
                int ordinal = AbstractC1295b1.echo(str).ordinal();
                if (ordinal != 23) {
                    if (ordinal != 48) {
                        if (ordinal != 42) {
                            if (ordinal != 43) {
                                switch (ordinal) {
                                    case 37:
                                        echo = foxtrot(alpha4, alpha3);
                                        break;
                                    case 38:
                                        echo = hotel(alpha4, alpha3);
                                        break;
                                    case 39:
                                        echo = AbstractC1295b1.lima(alpha3, alpha4);
                                        break;
                                    case 40:
                                        echo2 = AbstractC1295b1.lima(alpha3, alpha4);
                                        break;
                                    default:
                                        bravo(str);
                                        throw null;
                                }
                            } else {
                                echo = hotel(alpha3, alpha4);
                            }
                        } else {
                            echo = foxtrot(alpha3, alpha4);
                        }
                    } else {
                        echo2 = echo(alpha3, alpha4);
                    }
                    echo = !echo2;
                } else {
                    echo = echo(alpha3, alpha4);
                }
                if (echo) {
                    return InterfaceC1355o.jade;
                }
                return InterfaceC1355o.lavender;
            case 2:
                EnumC1390x enumC1390x2 = EnumC1390x.ADD;
                int ordinal2 = AbstractC1295b1.echo(str).ordinal();
                if (ordinal2 != 2) {
                    if (ordinal2 != 15) {
                        if (ordinal2 != 25) {
                            if (ordinal2 != 41) {
                                if (ordinal2 != 54) {
                                    if (ordinal2 != 57) {
                                        if (ordinal2 != 19) {
                                            if (ordinal2 != 20) {
                                                if (ordinal2 != 60) {
                                                    if (ordinal2 != 61) {
                                                        switch (ordinal2) {
                                                            case 11:
                                                                return iVar.hotel().kilo(new C1308e(arrayList));
                                                            case 12:
                                                                AbstractC1295b1.hotel(arrayList, 0, "BREAK");
                                                                return InterfaceC1355o.indigo;
                                                            case 13:
                                                                break;
                                                            default:
                                                                bravo(str);
                                                                throw null;
                                                        }
                                                    } else {
                                                        AbstractC1295b1.hotel(arrayList, 3, "TERNARY");
                                                        boolean booleanValue = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).kilo().booleanValue();
                                                        C1378u c1378u = (C1378u) iVar.purple;
                                                        if (booleanValue) {
                                                            return c1378u.alpha(iVar, (InterfaceC1355o) arrayList.get(1));
                                                        }
                                                        return c1378u.alpha(iVar, (InterfaceC1355o) arrayList.get(2));
                                                    }
                                                } else {
                                                    AbstractC1295b1.hotel(arrayList, 3, "SWITCH");
                                                    InterfaceC1355o alpha5 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                                    InterfaceC1355o interfaceC1355o3 = (InterfaceC1355o) arrayList.get(1);
                                                    C1378u c1378u2 = (C1378u) iVar.purple;
                                                    InterfaceC1355o alpha6 = c1378u2.alpha(iVar, interfaceC1355o3);
                                                    InterfaceC1355o alpha7 = c1378u2.alpha(iVar, (InterfaceC1355o) arrayList.get(2));
                                                    if (alpha6 instanceof C1308e) {
                                                        if (alpha7 instanceof C1308e) {
                                                            C1308e c1308e = (C1308e) alpha6;
                                                            C1308e c1308e2 = (C1308e) alpha7;
                                                            int i5 = 0;
                                                            boolean z2 = false;
                                                            while (true) {
                                                                if (i5 < c1308e.november()) {
                                                                    if (!z2 && !alpha5.equals(c1378u2.alpha(iVar, c1308e.oscar(i5)))) {
                                                                        z2 = false;
                                                                    } else {
                                                                        InterfaceC1355o alpha8 = c1378u2.alpha(iVar, c1308e2.oscar(i5));
                                                                        if (alpha8 instanceof C1318g) {
                                                                            if (!((C1318g) alpha8).purple.equals("break")) {
                                                                                return alpha8;
                                                                            }
                                                                        } else {
                                                                            z2 = true;
                                                                        }
                                                                    }
                                                                    i5++;
                                                                } else if (c1308e.november() + 1 == c1308e2.november()) {
                                                                    InterfaceC1355o alpha9 = c1378u2.alpha(iVar, c1308e2.oscar(c1308e.november()));
                                                                    if (alpha9 instanceof C1318g) {
                                                                        String str3 = ((C1318g) alpha9).purple;
                                                                        if (str3.equals("return") || str3.equals("continue")) {
                                                                            return alpha9;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                                                        }
                                                    } else {
                                                        throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                                                    }
                                                }
                                            } else {
                                                AbstractC1295b1.india(arrayList, 2, "DEFINE_FUNCTION");
                                                C1351n charlie = charlie(iVar, arrayList);
                                                String str4 = charlie.alpha;
                                                if (str4 == null) {
                                                    iVar.november("", charlie);
                                                    return charlie;
                                                }
                                                iVar.november(str4, charlie);
                                                return charlie;
                                            }
                                        }
                                        if (arrayList.isEmpty()) {
                                            return InterfaceC1355o.gold;
                                        }
                                        InterfaceC1355o alpha10 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                        if (alpha10 instanceof C1308e) {
                                            return iVar.kilo((C1308e) alpha10);
                                        }
                                        return InterfaceC1355o.gold;
                                    }
                                    if (arrayList.isEmpty()) {
                                        return InterfaceC1355o.ivory;
                                    }
                                    AbstractC1295b1.hotel(arrayList, 1, "RETURN");
                                    return new C1318g("return", ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)));
                                }
                                return new C1308e(arrayList);
                            }
                            AbstractC1295b1.india(arrayList, 2, "IF");
                            InterfaceC1355o alpha11 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                            InterfaceC1355o interfaceC1355o4 = (InterfaceC1355o) arrayList.get(1);
                            C1378u c1378u3 = (C1378u) iVar.purple;
                            InterfaceC1355o alpha12 = c1378u3.alpha(iVar, interfaceC1355o4);
                            if (arrayList.size() > 2) {
                                interfaceC1355o2 = c1378u3.alpha(iVar, (InterfaceC1355o) arrayList.get(2));
                            }
                            InterfaceC1355o interfaceC1355o5 = InterfaceC1355o.gold;
                            if (alpha11.kilo().booleanValue()) {
                                interfaceC1355o = iVar.kilo((C1308e) alpha12);
                            } else if (interfaceC1355o2 != null) {
                                interfaceC1355o = iVar.kilo((C1308e) interfaceC1355o2);
                            } else {
                                interfaceC1355o = interfaceC1355o5;
                            }
                            if (interfaceC1355o instanceof C1318g) {
                                return interfaceC1355o;
                            }
                            return InterfaceC1355o.gold;
                        }
                        return charlie(iVar, arrayList);
                    }
                    AbstractC1295b1.hotel(arrayList, 0, "BREAK");
                    return InterfaceC1355o.green;
                }
                AbstractC1295b1.hotel(arrayList, 3, "APPLY");
                InterfaceC1355o alpha13 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                InterfaceC1355o interfaceC1355o6 = (InterfaceC1355o) arrayList.get(1);
                C1378u c1378u4 = (C1378u) iVar.purple;
                String bravo = c1378u4.alpha(iVar, interfaceC1355o6).bravo();
                InterfaceC1355o alpha14 = c1378u4.alpha(iVar, (InterfaceC1355o) arrayList.get(2));
                if (alpha14 instanceof C1308e) {
                    if (!bravo.isEmpty()) {
                        return alpha13.hotel(bravo, iVar, ((C1308e) alpha14).sierra());
                    }
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                throw new IllegalArgumentException(av.q.echo("Function arguments for Apply are not a list found ", alpha14.getClass().getCanonicalName()));
            case 3:
                EnumC1390x enumC1390x3 = EnumC1390x.ADD;
                int ordinal3 = AbstractC1295b1.echo(str).ordinal();
                if (ordinal3 != 1) {
                    if (ordinal3 != 47) {
                        if (ordinal3 == 50) {
                            AbstractC1295b1.hotel(arrayList, 2, "OR");
                            InterfaceC1355o alpha15 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                            if (!alpha15.kilo().booleanValue()) {
                                return ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1));
                            }
                            return alpha15;
                        }
                        bravo(str);
                        throw null;
                    }
                    AbstractC1295b1.hotel(arrayList, 1, "NOT");
                    return new C1313f(Boolean.valueOf(!((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).kilo().booleanValue()));
                }
                AbstractC1295b1.hotel(arrayList, 2, "AND");
                InterfaceC1355o alpha16 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                if (alpha16.kilo().booleanValue()) {
                    return ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1));
                }
                return alpha16;
            case 4:
                EnumC1390x enumC1390x4 = EnumC1390x.ADD;
                int ordinal4 = AbstractC1295b1.echo(str).ordinal();
                if (ordinal4 != 65) {
                    switch (ordinal4) {
                        case 26:
                            AbstractC1295b1.hotel(arrayList, 3, "FOR_IN");
                            if (arrayList.get(0) instanceof r) {
                                String bravo2 = ((InterfaceC1355o) arrayList.get(0)).bravo();
                                InterfaceC1355o alpha17 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1));
                                InterfaceC1355o alpha18 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(2));
                                Iterator lima = alpha17.lima();
                                if (lima != null) {
                                    while (lima.hasNext()) {
                                        iVar.mike(bravo2, (InterfaceC1355o) lima.next());
                                        InterfaceC1355o kilo = iVar.kilo((C1308e) alpha18);
                                        if (kilo instanceof C1318g) {
                                            c1318g2 = (C1318g) kilo;
                                            if ("break".equals(c1318g2.purple)) {
                                                return InterfaceC1355o.gold;
                                            }
                                            if ("return".equals(c1318g2.purple)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                return InterfaceC1355o.gold;
                            }
                            throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                        case 27:
                            AbstractC1295b1.hotel(arrayList, 3, "FOR_IN_CONST");
                            if (arrayList.get(0) instanceof r) {
                                return delta(new C1386w(iVar, ((InterfaceC1355o) arrayList.get(0)).bravo(), 0), ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).lima(), ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                        case 28:
                            AbstractC1295b1.hotel(arrayList, 3, "FOR_IN_LET");
                            if (arrayList.get(0) instanceof r) {
                                String bravo3 = ((InterfaceC1355o) arrayList.get(0)).bravo();
                                InterfaceC1355o alpha19 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1));
                                InterfaceC1355o alpha20 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(2));
                                Iterator lima2 = alpha19.lima();
                                if (lima2 != null) {
                                    while (lima2.hasNext()) {
                                        InterfaceC1355o interfaceC1355o7 = (InterfaceC1355o) lima2.next();
                                        J2.i hotel = iVar.hotel();
                                        hotel.mike(bravo3, interfaceC1355o7);
                                        InterfaceC1355o kilo2 = hotel.kilo((C1308e) alpha20);
                                        if (kilo2 instanceof C1318g) {
                                            c1318g2 = (C1318g) kilo2;
                                            if ("break".equals(c1318g2.purple)) {
                                                return InterfaceC1355o.gold;
                                            }
                                            if ("return".equals(c1318g2.purple)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                return InterfaceC1355o.gold;
                            }
                            throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                        case 29:
                            AbstractC1295b1.hotel(arrayList, 4, "FOR_LET");
                            InterfaceC1355o alpha21 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                            if (alpha21 instanceof C1308e) {
                                C1308e c1308e3 = (C1308e) alpha21;
                                InterfaceC1355o interfaceC1355o8 = (InterfaceC1355o) arrayList.get(1);
                                InterfaceC1355o interfaceC1355o9 = (InterfaceC1355o) arrayList.get(2);
                                InterfaceC1355o interfaceC1355o10 = (InterfaceC1355o) arrayList.get(3);
                                C1378u c1378u5 = (C1378u) iVar.purple;
                                InterfaceC1355o alpha22 = c1378u5.alpha(iVar, interfaceC1355o10);
                                J2.i hotel2 = iVar.hotel();
                                for (int i10 = 0; i10 < c1308e3.november(); i10++) {
                                    String bravo4 = c1308e3.oscar(i10).bravo();
                                    hotel2.november(bravo4, iVar.lima(bravo4));
                                }
                                while (c1378u5.alpha(iVar, interfaceC1355o8).kilo().booleanValue()) {
                                    InterfaceC1355o kilo3 = iVar.kilo((C1308e) alpha22);
                                    if (kilo3 instanceof C1318g) {
                                        C1318g c1318g3 = (C1318g) kilo3;
                                        if ("break".equals(c1318g3.purple)) {
                                            return InterfaceC1355o.gold;
                                        }
                                        if ("return".equals(c1318g3.purple)) {
                                            return c1318g3;
                                        }
                                    }
                                    J2.i hotel3 = iVar.hotel();
                                    for (int i11 = 0; i11 < c1308e3.november(); i11++) {
                                        String bravo5 = c1308e3.oscar(i11).bravo();
                                        hotel3.november(bravo5, hotel2.lima(bravo5));
                                    }
                                    hotel3.juliet(interfaceC1355o9);
                                    hotel2 = hotel3;
                                }
                                return InterfaceC1355o.gold;
                            }
                            throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                        case 30:
                            AbstractC1295b1.hotel(arrayList, 3, "FOR_OF");
                            if (arrayList.get(0) instanceof r) {
                                return golf(new C1386w(iVar, ((InterfaceC1355o) arrayList.get(0)).bravo(), 2), ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)), ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                        case 31:
                            AbstractC1295b1.hotel(arrayList, 3, "FOR_OF_CONST");
                            if (arrayList.get(0) instanceof r) {
                                return golf(new C1386w(iVar, ((InterfaceC1355o) arrayList.get(0)).bravo(), 0), ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)), ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                        case 32:
                            AbstractC1295b1.hotel(arrayList, 3, "FOR_OF_LET");
                            if (arrayList.get(0) instanceof r) {
                                return golf(new C1386w(iVar, ((InterfaceC1355o) arrayList.get(0)).bravo(), 1), ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)), ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(2)));
                            }
                            throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                        default:
                            bravo(str);
                            throw null;
                    }
                    return c1318g2;
                }
                AbstractC1295b1.hotel(arrayList, 4, "WHILE");
                InterfaceC1355o interfaceC1355o11 = (InterfaceC1355o) arrayList.get(0);
                InterfaceC1355o interfaceC1355o12 = (InterfaceC1355o) arrayList.get(1);
                InterfaceC1355o interfaceC1355o13 = (InterfaceC1355o) arrayList.get(2);
                InterfaceC1355o alpha23 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(3));
                C1378u c1378u6 = (C1378u) iVar.purple;
                if (c1378u6.alpha(iVar, interfaceC1355o13).kilo().booleanValue()) {
                    InterfaceC1355o kilo4 = iVar.kilo((C1308e) alpha23);
                    if (kilo4 instanceof C1318g) {
                        c1318g = (C1318g) kilo4;
                        if ("break".equals(c1318g.purple)) {
                            return InterfaceC1355o.gold;
                        }
                        break;
                    }
                }
                while (c1378u6.alpha(iVar, interfaceC1355o11).kilo().booleanValue()) {
                    InterfaceC1355o kilo5 = iVar.kilo((C1308e) alpha23);
                    if (kilo5 instanceof C1318g) {
                        c1318g = (C1318g) kilo5;
                        if ("break".equals(c1318g.purple)) {
                            return InterfaceC1355o.gold;
                        }
                        if ("return".equals(c1318g.purple)) {
                            return c1318g;
                        }
                    }
                    iVar.juliet(interfaceC1355o12);
                }
                return InterfaceC1355o.gold;
            case 5:
                EnumC1390x enumC1390x5 = EnumC1390x.ADD;
                int ordinal5 = AbstractC1295b1.echo(str).ordinal();
                if (ordinal5 != 0) {
                    if (ordinal5 != 21) {
                        if (ordinal5 != 59) {
                            if (ordinal5 != 52 && ordinal5 != 53) {
                                if (ordinal5 != 55 && ordinal5 != 56) {
                                    switch (ordinal5) {
                                        case 44:
                                            AbstractC1295b1.hotel(arrayList, 2, "MODULUS");
                                            return new C1323h(Double.valueOf(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue() % ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue()));
                                        case 45:
                                            AbstractC1295b1.hotel(arrayList, 2, "MULTIPLY");
                                            rVar = new C1323h(Double.valueOf(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue() * ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue()));
                                            break;
                                        case 46:
                                            AbstractC1295b1.hotel(arrayList, 1, "NEGATE");
                                            return new C1323h(Double.valueOf(-((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue()));
                                        default:
                                            bravo(str);
                                            throw null;
                                    }
                                } else {
                                    AbstractC1295b1.hotel(arrayList, 1, str);
                                    return ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                }
                            } else {
                                AbstractC1295b1.hotel(arrayList, 2, str);
                                InterfaceC1355o alpha24 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                iVar.juliet((InterfaceC1355o) arrayList.get(1));
                                return alpha24;
                            }
                        } else {
                            AbstractC1295b1.hotel(arrayList, 2, "SUBTRACT");
                            return new C1323h(Double.valueOf(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue() + (-((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue())));
                        }
                    } else {
                        AbstractC1295b1.hotel(arrayList, 2, "DIVIDE");
                        return new C1323h(Double.valueOf(((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0)).alpha().doubleValue() / ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1)).alpha().doubleValue()));
                    }
                } else {
                    AbstractC1295b1.hotel(arrayList, 2, "ADD");
                    InterfaceC1355o alpha25 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                    InterfaceC1355o alpha26 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1));
                    if (!(alpha25 instanceof InterfaceC1338k) && !(alpha25 instanceof r) && !(alpha26 instanceof InterfaceC1338k) && !(alpha26 instanceof r)) {
                        rVar = new C1323h(Double.valueOf(alpha26.alpha().doubleValue() + alpha25.alpha().doubleValue()));
                    } else {
                        rVar = new r(String.valueOf(alpha25.bravo()).concat(String.valueOf(alpha26.bravo())));
                    }
                }
                return rVar;
            case 6:
                if (str != null && !str.isEmpty() && iVar.oscar(str)) {
                    InterfaceC1355o lima3 = iVar.lima(str);
                    if (lima3 instanceof AbstractC1328i) {
                        return ((AbstractC1328i) lima3).charlie(iVar, arrayList);
                    }
                    throw new IllegalArgumentException(ao.ad.gray("Function ", str, " is not defined"));
                }
                throw new IllegalArgumentException(av.q.echo("Command not found: ", str));
            default:
                EnumC1390x enumC1390x6 = EnumC1390x.ADD;
                int ordinal6 = AbstractC1295b1.echo(str).ordinal();
                if (ordinal6 != 3) {
                    if (ordinal6 != 14) {
                        if (ordinal6 != 24) {
                            if (ordinal6 != 33) {
                                if (ordinal6 != 49) {
                                    if (ordinal6 != 58) {
                                        if (ordinal6 != 17) {
                                            if (ordinal6 != 18) {
                                                if (ordinal6 != 35 && ordinal6 != 36) {
                                                    switch (ordinal6) {
                                                        case 62:
                                                            AbstractC1295b1.hotel(arrayList, 1, "TYPEOF");
                                                            InterfaceC1355o alpha27 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                                            if (alpha27 instanceof C1370s) {
                                                                str2 = "undefined";
                                                            } else if (alpha27 instanceof C1313f) {
                                                                str2 = CTVariableUtils.BOOLEAN;
                                                            } else if (alpha27 instanceof C1323h) {
                                                                str2 = CTVariableUtils.NUMBER;
                                                            } else if (alpha27 instanceof r) {
                                                                str2 = CTVariableUtils.STRING;
                                                            } else if (alpha27 instanceof C1351n) {
                                                                str2 = "function";
                                                            } else if (!(alpha27 instanceof C1359p) && !(alpha27 instanceof C1318g)) {
                                                                str2 = "object";
                                                            } else {
                                                                throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", alpha27));
                                                            }
                                                            alpha2 = new r(str2);
                                                            break;
                                                        case 63:
                                                            AbstractC1295b1.hotel(arrayList, 0, "UNDEFINED");
                                                            return InterfaceC1355o.gold;
                                                        case 64:
                                                            AbstractC1295b1.india(arrayList, 1, "VAR");
                                                            Iterator it = arrayList.iterator();
                                                            while (it.hasNext()) {
                                                                InterfaceC1355o alpha28 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) it.next());
                                                                if (alpha28 instanceof r) {
                                                                    iVar.mike(((r) alpha28).alpha, InterfaceC1355o.gold);
                                                                } else {
                                                                    throw new IllegalArgumentException(av.q.echo("Expected string for var name. got ", alpha28.getClass().getCanonicalName()));
                                                                }
                                                            }
                                                            return InterfaceC1355o.gold;
                                                        default:
                                                            bravo(str);
                                                            throw null;
                                                    }
                                                } else {
                                                    AbstractC1295b1.hotel(arrayList, 2, "GET_PROPERTY");
                                                    InterfaceC1355o alpha29 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                                    InterfaceC1355o alpha30 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1));
                                                    if ((alpha29 instanceof C1308e) && AbstractC1295b1.kilo(alpha30)) {
                                                        return ((C1308e) alpha29).oscar(alpha30.alpha().intValue());
                                                    }
                                                    if (alpha29 instanceof InterfaceC1338k) {
                                                        return ((InterfaceC1338k) alpha29).mike(alpha30.bravo());
                                                    }
                                                    if (alpha29 instanceof r) {
                                                        if ("length".equals(alpha30.bravo())) {
                                                            alpha2 = new C1323h(Double.valueOf(((r) alpha29).alpha.length()));
                                                        } else if (AbstractC1295b1.kilo(alpha30)) {
                                                            r rVar2 = (r) alpha29;
                                                            if (alpha30.alpha().doubleValue() < rVar2.alpha.length()) {
                                                                alpha = new r(String.valueOf(rVar2.alpha.charAt(alpha30.alpha().intValue())));
                                                            }
                                                        }
                                                    }
                                                    return InterfaceC1355o.gold;
                                                }
                                            } else {
                                                if (arrayList.isEmpty()) {
                                                    return new C1343l();
                                                }
                                                if (arrayList.size() % 2 == 0) {
                                                    C1343l c1343l = new C1343l();
                                                    while (i4 < arrayList.size() - 1) {
                                                        InterfaceC1355o alpha31 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(i4));
                                                        InterfaceC1355o alpha32 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(i4 + 1));
                                                        if (!(alpha31 instanceof C1318g) && !(alpha32 instanceof C1318g)) {
                                                            c1343l.india(alpha31.bravo(), alpha32);
                                                            i4 += 2;
                                                        } else {
                                                            throw new IllegalStateException("Failed to evaluate map entry");
                                                        }
                                                    }
                                                    return c1343l;
                                                }
                                                throw new IllegalArgumentException(ao.ad.zulu(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                                            }
                                        } else {
                                            if (arrayList.isEmpty()) {
                                                return new C1308e();
                                            }
                                            C1308e c1308e4 = new C1308e();
                                            Iterator it2 = arrayList.iterator();
                                            while (it2.hasNext()) {
                                                InterfaceC1355o alpha33 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) it2.next());
                                                if (!(alpha33 instanceof C1318g)) {
                                                    c1308e4.uniform(i4, alpha33);
                                                    i4++;
                                                } else {
                                                    throw new IllegalStateException("Failed to evaluate array element");
                                                }
                                            }
                                            return c1308e4;
                                        }
                                    } else {
                                        AbstractC1295b1.hotel(arrayList, 3, "SET_PROPERTY");
                                        InterfaceC1355o alpha34 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                                        InterfaceC1355o interfaceC1355o14 = (InterfaceC1355o) arrayList.get(1);
                                        C1378u c1378u7 = (C1378u) iVar.purple;
                                        InterfaceC1355o alpha35 = c1378u7.alpha(iVar, interfaceC1355o14);
                                        alpha2 = c1378u7.alpha(iVar, (InterfaceC1355o) arrayList.get(2));
                                        if (alpha34 != InterfaceC1355o.gold && alpha34 != InterfaceC1355o.gray) {
                                            if ((alpha34 instanceof C1308e) && (alpha35 instanceof C1323h)) {
                                                ((C1308e) alpha34).uniform(((C1323h) alpha35).alpha.intValue(), alpha2);
                                            } else if (alpha34 instanceof InterfaceC1338k) {
                                                ((InterfaceC1338k) alpha34).india(alpha35.bravo(), alpha2);
                                            }
                                        } else {
                                            throw new IllegalStateException(av.q.foxtrot("Can't set property ", alpha35.bravo(), " of ", alpha34.bravo()));
                                        }
                                    }
                                    return alpha2;
                                }
                                AbstractC1295b1.hotel(arrayList, 0, "NULL");
                                return InterfaceC1355o.gray;
                            }
                            AbstractC1295b1.hotel(arrayList, 1, "GET");
                            InterfaceC1355o alpha36 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                            if (alpha36 instanceof r) {
                                return iVar.lima(((r) alpha36).alpha);
                            }
                            throw new IllegalArgumentException(av.q.echo("Expected string for get var. got ", alpha36.getClass().getCanonicalName()));
                        }
                        AbstractC1295b1.india(arrayList, 1, "EXPRESSION_LIST");
                        InterfaceC1355o interfaceC1355o15 = InterfaceC1355o.gold;
                        while (i4 < arrayList.size()) {
                            interfaceC1355o15 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(i4));
                            if (!(interfaceC1355o15 instanceof C1318g)) {
                                i4++;
                            } else {
                                throw new IllegalStateException("ControlValue cannot be in an expression list");
                            }
                        }
                        return interfaceC1355o15;
                    }
                    AbstractC1295b1.india(arrayList, 2, "CONST");
                    if (arrayList.size() % 2 == 0) {
                        while (i4 < arrayList.size() - 1) {
                            InterfaceC1355o alpha37 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(i4));
                            if (alpha37 instanceof r) {
                                String str5 = ((r) alpha37).alpha;
                                iVar.mike(str5, ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(i4 + 1)));
                                ((HashMap) iVar.silver).put(str5, Boolean.TRUE);
                                i4 += 2;
                            } else {
                                throw new IllegalArgumentException(av.q.echo("Expected string for const name. got ", alpha37.getClass().getCanonicalName()));
                            }
                        }
                        return InterfaceC1355o.gold;
                    }
                    throw new IllegalArgumentException(ao.ad.zulu(arrayList.size(), "CONST requires an even number of arguments, found "));
                }
                AbstractC1295b1.hotel(arrayList, 2, "ASSIGN");
                InterfaceC1355o alpha38 = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(0));
                if (alpha38 instanceof r) {
                    r rVar3 = (r) alpha38;
                    boolean oscar = iVar.oscar(rVar3.alpha);
                    String str6 = rVar3.alpha;
                    if (oscar) {
                        alpha = ((C1378u) iVar.purple).alpha(iVar, (InterfaceC1355o) arrayList.get(1));
                        iVar.november(str6, alpha);
                    } else {
                        throw new IllegalArgumentException(av.q.echo("Attempting to assign undefined value ", str6));
                    }
                } else {
                    throw new IllegalArgumentException(av.q.echo("Expected string for assign var. got ", alpha38.getClass().getCanonicalName()));
                }
                return alpha;
        }
    }

    public final void bravo(String str) {
        if (this.alpha.contains(AbstractC1295b1.echo(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
