package s6;

import com.checkout.components.kmp.rememberme.utils.Constants;
import com.google.maps.android.BuildConfig;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.l7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2708l7 {
    public static String alpha(String str, Object... objArr) {
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

    public static final Qd.b bravo(Enum[] entries) {
        Intrinsics.echo(entries, "entries");
        return new Qd.b(entries);
    }
}
