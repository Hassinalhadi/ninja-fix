package t6;

import com.checkout.components.kmp.rememberme.utils.Constants;
import com.google.maps.android.BuildConfig;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: t6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3003i {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [V0.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, V0.m] */
    public static V0.k alpha(V0.i iVar) {
        ?? obj = new Object();
        obj.charlie = new Object();
        V0.k kVar = new V0.k(obj);
        obj.bravo = kVar;
        obj.alpha = iVar.getClass();
        try {
            Object black = iVar.black(obj);
            if (black != null) {
                obj.alpha = black;
                return kVar;
            }
        } catch (Exception e) {
            kVar.purple.kilo(e);
        }
        return kVar;
    }

    public static String bravo(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String golf;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                golf = BuildConfig.TRAVIS;
            } else {
                try {
                    golf = obj.toString();
                } catch (Exception e) {
                    String amber = ao.ad.amber(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(amber), (Throwable) e);
                    golf = av.q.golf("<", amber, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i5] = golf;
            i5++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i10 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (indexOf = str.indexOf(Constants.EMBOLDEN_PLACEHOLDER, i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i10, indexOf);
            sb2.append(objArr[i4]);
            i4++;
            i10 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i4 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i4]);
            for (int i11 = i4 + 1; i11 < objArr.length; i11++) {
                sb2.append(", ");
                sb2.append(objArr[i11]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
