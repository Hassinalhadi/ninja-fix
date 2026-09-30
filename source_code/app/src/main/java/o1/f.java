package o1;

import av.q;
import com.checkout.address.utils.NumberOnlyZipVisualTransformation;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class f implements g {
    public static final Locale[] charlie = new Locale[0];
    public final Locale[] alpha;
    public final String bravo;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length == 1) {
                new Locale(split[0]);
                return;
            }
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public f(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.alpha = charlie;
            this.bravo = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < localeArr.length; i4++) {
            Locale locale = localeArr[i4];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    sb2.append(locale2.getLanguage());
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        sb2.append(NumberOnlyZipVisualTransformation.HYPHEN);
                        sb2.append(locale2.getCountry());
                    }
                    if (i4 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(q.delta(i4, "list[", "] is null"));
            }
        }
        this.alpha = (Locale[]) arrayList.toArray(new Locale[0]);
        this.bravo = sb2.toString();
    }

    @Override // o1.g
    public final String alpha() {
        return this.bravo;
    }

    @Override // o1.g
    public final Object bravo() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Locale[] localeArr = ((f) obj).alpha;
        Locale[] localeArr2 = this.alpha;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < localeArr2.length; i4++) {
            if (!localeArr2[i4].equals(localeArr[i4])) {
                return false;
            }
        }
        return true;
    }

    @Override // o1.g
    public final Locale get(int i4) {
        if (i4 >= 0) {
            Locale[] localeArr = this.alpha;
            if (i4 < localeArr.length) {
                return localeArr[i4];
            }
            return null;
        }
        return null;
    }

    public final int hashCode() {
        int i4 = 1;
        for (Locale locale : this.alpha) {
            i4 = (i4 * 31) + locale.hashCode();
        }
        return i4;
    }

    @Override // o1.g
    public final boolean isEmpty() {
        if (this.alpha.length == 0) {
            return true;
        }
        return false;
    }

    @Override // o1.g
    public final int size() {
        return this.alpha.length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Constants.AES_PREFIX);
        int i4 = 0;
        while (true) {
            Locale[] localeArr = this.alpha;
            if (i4 < localeArr.length) {
                sb2.append(localeArr[i4]);
                if (i4 < localeArr.length - 1) {
                    sb2.append(',');
                }
                i4++;
            } else {
                sb2.append(Constants.AES_SUFFIX);
                return sb2.toString();
            }
        }
    }
}
