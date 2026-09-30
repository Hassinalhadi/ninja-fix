package ye;

import java.util.HashMap;
import pe.AbstractC2340p;
import pe.C2339o;
import pe.InterfaceC2321ad;
import pe.InterfaceC2328d;
import pe.InterfaceC2335k;
import pe.InterfaceC2338n;
import pe.ao;
import te.C3118a;

/* loaded from: classes2.dex */
public abstract class s {
    public static final C2339o alpha;
    public static final C2339o bravo;
    public static final C2339o charlie;
    public static final HashMap delta;

    static {
        C3118a c3118a = C3118a.charlie;
        C2339o c2339o = new C2339o(c3118a, 9);
        alpha = c2339o;
        te.c cVar = te.c.charlie;
        C2339o c2339o2 = new C2339o(cVar, 10);
        bravo = c2339o2;
        te.b bVar = te.b.charlie;
        C2339o c2339o3 = new C2339o(bVar, 11);
        charlie = c2339o3;
        HashMap hashMap = new HashMap();
        delta = hashMap;
        hashMap.put(c3118a, c2339o);
        hashMap.put(cVar, c2339o2);
        hashMap.put(bVar, c2339o3);
    }

    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 5 && i4 != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 5 && i4 != 6) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i4 != 5 && i4 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        if (i4 != 2 && i4 != 3) {
            if (i4 != 4) {
                if (i4 != 5 && i4 != 6) {
                    objArr[2] = "isVisibleForProtectedAndPackage";
                }
            } else {
                objArr[2] = "toDescriptorVisibility";
            }
        } else {
            objArr[2] = "areInSamePackage";
        }
        String format = String.format(str, objArr);
        if (i4 == 5 || i4 == 6) {
            throw new IllegalStateException(format);
        }
    }

    public static boolean bravo(ao aoVar, InterfaceC2338n interfaceC2338n, InterfaceC2335k interfaceC2335k) {
        InterfaceC2338n interfaceC2338n2;
        if (interfaceC2335k != null) {
            int i4 = Qe.e.alpha;
            if (interfaceC2338n instanceof InterfaceC2328d) {
                interfaceC2338n2 = Qe.e.tango((InterfaceC2328d) interfaceC2338n);
            } else {
                interfaceC2338n2 = interfaceC2338n;
            }
            if (charlie(interfaceC2338n2, interfaceC2335k)) {
                return true;
            }
            return AbstractC2340p.charlie.alpha(aoVar, interfaceC2338n, interfaceC2335k);
        }
        alpha(1);
        throw null;
    }

    public static boolean charlie(InterfaceC2338n interfaceC2338n, InterfaceC2335k interfaceC2335k) {
        if (interfaceC2338n != null) {
            if (interfaceC2335k != null) {
                InterfaceC2321ad interfaceC2321ad = (InterfaceC2321ad) Qe.e.india(interfaceC2338n, InterfaceC2321ad.class, false);
                InterfaceC2321ad interfaceC2321ad2 = (InterfaceC2321ad) Qe.e.india(interfaceC2335k, InterfaceC2321ad.class, false);
                if (interfaceC2321ad2 == null || interfaceC2321ad == null || !((se.ab) interfaceC2321ad).teal.equals(((se.ab) interfaceC2321ad2).teal)) {
                    return false;
                }
                return true;
            }
            alpha(3);
            throw null;
        }
        alpha(2);
        throw null;
    }
}
