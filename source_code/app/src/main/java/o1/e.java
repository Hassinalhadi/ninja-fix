package o1;

import android.os.Build;
import com.clevertap.android.sdk.Constants;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class e {
    public static final e bravo = alpha(new Locale[0]);
    public final g alpha;

    public e(g gVar) {
        this.alpha = gVar;
    }

    public static e alpha(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new e(new h(E2.d.alpha(localeArr)));
        }
        return new e(new f(localeArr));
    }

    public static e bravo(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(Constants.SEPARATOR_COMMA, -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i4 = 0; i4 < length; i4++) {
                String str2 = split[i4];
                int i5 = d.alpha;
                localeArr[i4] = Locale.forLanguageTag(str2);
            }
            return alpha(localeArr);
        }
        return bravo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (this.alpha.equals(((e) obj).alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return this.alpha.toString();
    }
}
