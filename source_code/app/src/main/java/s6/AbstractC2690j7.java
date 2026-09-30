package s6;

import com.checkout.components.kmp.rememberme.utils.Constants;
import com.google.maps.android.BuildConfig;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: s6.j7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2690j7 {
    public static final /* synthetic */ int alpha = 0;

    public static String alpha(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                sb2 = BuildConfig.TRAVIS;
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb3.append(name);
                    sb3.append("@");
                    sb3.append(hexString);
                    String sb4 = sb3.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb4), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb5 = new StringBuilder(name2.length() + sb4.length() + 8 + 1);
                    sb5.append("<");
                    sb5.append(sb4);
                    sb5.append(" threw ");
                    sb5.append(name2);
                    sb5.append(">");
                    sb2 = sb5.toString();
                }
            }
            objArr[i5] = sb2;
            i5++;
        }
        StringBuilder sb6 = new StringBuilder(str.length() + (length * 16));
        int i10 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (indexOf = str.indexOf(Constants.EMBOLDEN_PLACEHOLDER, i10)) == -1) {
                break;
            }
            sb6.append((CharSequence) str, i10, indexOf);
            sb6.append(objArr[i4]);
            i4++;
            i10 = indexOf + 2;
        }
        sb6.append((CharSequence) str, i10, str.length());
        if (i4 < length2) {
            sb6.append(" [");
            sb6.append(objArr[i4]);
            for (int i11 = i4 + 1; i11 < objArr.length; i11++) {
                sb6.append(", ");
                sb6.append(objArr[i11]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }
}
