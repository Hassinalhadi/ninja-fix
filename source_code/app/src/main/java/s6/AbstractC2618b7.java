package s6;

import com.checkout.components.kmp.rememberme.utils.Constants;
import com.google.maps.android.BuildConfig;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: s6.b7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2618b7 {
    public static final Q0.l alpha(long j5, long j6) {
        int i4 = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        return new Q0.l(i4, i5, ((int) (j6 >> 32)) + i4, ((int) (j6 & 4294967295L)) + i5);
    }

    public static final Q0.l bravo(Z.c cVar) {
        return new Q0.l(Math.round(cVar.alpha), Math.round(cVar.bravo), Math.round(cVar.charlie), Math.round(cVar.delta));
    }

    public static String charlie(Object... objArr) {
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
        StringBuilder sb2 = new StringBuilder((length * 16) + 29);
        int i10 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (indexOf = "expected a non-null reference".indexOf(Constants.EMBOLDEN_PLACEHOLDER, i10)) == -1) {
                break;
            }
            sb2.append((CharSequence) "expected a non-null reference", i10, indexOf);
            sb2.append(objArr[i4]);
            i4++;
            i10 = indexOf + 2;
        }
        sb2.append((CharSequence) "expected a non-null reference", i10, 29);
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
