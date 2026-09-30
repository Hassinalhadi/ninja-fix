package pe;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.collections.ArraysKt;

/* renamed from: pe.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2340p {
    public static final C2339o alpha;
    public static final C2339o bravo;
    public static final C2339o charlie;
    public static final C2339o delta;
    public static final C2339o echo;
    public static final C2339o foxtrot;
    public static final C2339o golf;
    public static final C2339o hotel;
    public static final C2339o india;
    public static final C2339o juliet;
    public static final ao kilo;
    public static final ao lima;
    public static final ao mike;
    public static final lf.q november;
    public static final HashMap oscar;

    static {
        lf.q qVar;
        C2310B c2310b = C2310B.charlie;
        C2339o c2339o = new C2339o(c2310b, 0);
        alpha = c2339o;
        C2311C c2311c = C2311C.charlie;
        C2339o c2339o2 = new C2339o(c2311c, 1);
        bravo = c2339o2;
        C2312D c2312d = C2312D.charlie;
        C2339o c2339o3 = new C2339o(c2312d, 2);
        charlie = c2339o3;
        ay ayVar = ay.charlie;
        C2339o c2339o4 = new C2339o(ayVar, 3);
        delta = c2339o4;
        C2313E c2313e = C2313E.charlie;
        C2339o c2339o5 = new C2339o(c2313e, 4);
        echo = c2339o5;
        C2309A c2309a = C2309A.charlie;
        C2339o c2339o6 = new C2339o(c2309a, 5);
        foxtrot = c2339o6;
        ax axVar = ax.charlie;
        C2339o c2339o7 = new C2339o(axVar, 6);
        golf = c2339o7;
        az azVar = az.charlie;
        C2339o c2339o8 = new C2339o(azVar, 7);
        hotel = c2339o8;
        C2314F c2314f = C2314F.charlie;
        C2339o c2339o9 = new C2339o(c2314f, 8);
        india = c2339o9;
        Collections.unmodifiableSet(ArraysKt.g(new C2339o[]{c2339o, c2339o2, c2339o4, c2339o6}));
        HashMap hashMap = new HashMap(6);
        hashMap.put(c2339o2, 0);
        hashMap.put(c2339o, 0);
        hashMap.put(c2339o4, 1);
        hashMap.put(c2339o3, 1);
        hashMap.put(c2339o5, 2);
        Collections.unmodifiableMap(hashMap);
        juliet = c2339o5;
        kilo = new ao(2);
        lima = new ao(3);
        mike = new ao(4);
        try {
            Iterator it = Arrays.asList(new lf.q[0]).iterator();
            if (it.hasNext()) {
                qVar = (lf.q) it.next();
            } else {
                qVar = lf.q.alpha;
            }
            november = qVar;
            HashMap hashMap2 = new HashMap();
            oscar = hashMap2;
            hashMap2.put(c2310b, c2339o);
            hashMap2.put(c2311c, c2339o2);
            hashMap2.put(c2312d, c2339o3);
            hashMap2.put(ayVar, c2339o4);
            hashMap2.put(c2313e, c2339o5);
            hashMap2.put(c2309a, c2339o6);
            hashMap2.put(axVar, c2339o7);
            hashMap2.put(azVar, c2339o8);
            hashMap2.put(c2314f, c2339o9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 16) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 16) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 1 && i4 != 3 && i4 != 5 && i4 != 7) {
            switch (i4) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
            if (i4 == 16) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
            } else {
                objArr[1] = "toDescriptorVisibility";
            }
            switch (i4) {
                case 2:
                case 3:
                    objArr[2] = "isVisibleIgnoringReceiver";
                    break;
                case 4:
                case 5:
                    objArr[2] = "isVisibleWithAnyReceiver";
                    break;
                case 6:
                case 7:
                    objArr[2] = "inSameFile";
                    break;
                case 8:
                case 9:
                    objArr[2] = "findInvisibleMember";
                    break;
                case 10:
                case 11:
                    objArr[2] = "compareLocal";
                    break;
                case 12:
                case 13:
                    objArr[2] = "compare";
                    break;
                case 14:
                    objArr[2] = "isPrivate";
                    break;
                case 15:
                    objArr[2] = "toDescriptorVisibility";
                    break;
                case 16:
                    break;
                default:
                    objArr[2] = "isVisible";
                    break;
            }
            String format = String.format(str, objArr);
            if (i4 == 16) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }
        objArr[0] = "from";
        if (i4 == 16) {
        }
        switch (i4) {
        }
        String format2 = String.format(str, objArr);
        if (i4 == 16) {
        }
    }

    public static Integer bravo(C2339o c2339o, C2339o c2339o2) {
        if (c2339o != null) {
            if (c2339o2 != null) {
                AbstractC2316H abstractC2316H = c2339o.alpha;
                AbstractC2316H abstractC2316H2 = c2339o2.alpha;
                Integer alpha2 = abstractC2316H.alpha(abstractC2316H2);
                if (alpha2 != null) {
                    return alpha2;
                }
                Integer alpha3 = abstractC2316H2.alpha(abstractC2316H);
                if (alpha3 == null) {
                    return null;
                }
                return Integer.valueOf(-alpha3.intValue());
            }
            alpha(13);
            throw null;
        }
        alpha(12);
        throw null;
    }

    public static InterfaceC2338n charlie(ao aoVar, InterfaceC2328d interfaceC2328d, InterfaceC2335k interfaceC2335k) {
        InterfaceC2338n charlie2;
        if (interfaceC2328d != null) {
            if (interfaceC2335k != null) {
                for (InterfaceC2338n interfaceC2338n = (InterfaceC2338n) interfaceC2328d.alpha(); interfaceC2338n != null && interfaceC2338n.getVisibility() != foxtrot; interfaceC2338n = (InterfaceC2338n) Qe.e.india(interfaceC2338n, InterfaceC2338n.class, true)) {
                    if (!interfaceC2338n.getVisibility().alpha(aoVar, interfaceC2338n, interfaceC2335k)) {
                        return interfaceC2338n;
                    }
                }
                if (!(interfaceC2328d instanceof se.am) || (charlie2 = charlie(aoVar, ((se.an) ((se.am) interfaceC2328d)).f13743y, interfaceC2335k)) == null) {
                    return null;
                }
                return charlie2;
            }
            alpha(9);
            throw null;
        }
        alpha(8);
        throw null;
    }

    public static boolean delta(InterfaceC2338n interfaceC2338n, InterfaceC2335k interfaceC2335k) {
        if (interfaceC2335k != null) {
            ao foxtrot2 = Qe.e.foxtrot(interfaceC2335k);
            if (foxtrot2 != ao.purple) {
                return foxtrot2.equals(Qe.e.foxtrot(interfaceC2338n));
            }
            return false;
        }
        alpha(7);
        throw null;
    }

    public static boolean echo(C2339o c2339o) {
        if (c2339o != null) {
            if (c2339o != alpha && c2339o != bravo) {
                return false;
            }
            return true;
        }
        alpha(14);
        throw null;
    }

    public static C2339o foxtrot(AbstractC2316H abstractC2316H) {
        if (abstractC2316H != null) {
            C2339o c2339o = (C2339o) oscar.get(abstractC2316H);
            if (c2339o != null) {
                return c2339o;
            }
            throw new IllegalArgumentException("Inapplicable visibility: " + abstractC2316H);
        }
        alpha(15);
        throw null;
    }
}
