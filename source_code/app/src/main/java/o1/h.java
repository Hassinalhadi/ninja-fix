package o1;

import android.os.LocaleList;
import h9.z;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class h implements g {
    public final LocaleList alpha;

    public h(Object obj) {
        this.alpha = z.juliet(obj);
    }

    @Override // o1.g
    public final String alpha() {
        String languageTags;
        languageTags = this.alpha.toLanguageTags();
        return languageTags;
    }

    @Override // o1.g
    public final Object bravo() {
        return this.alpha;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.alpha.equals(((g) obj).bravo());
        return equals;
    }

    @Override // o1.g
    public final Locale get(int i4) {
        Locale locale;
        locale = this.alpha.get(i4);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.alpha.hashCode();
        return hashCode;
    }

    @Override // o1.g
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.alpha.isEmpty();
        return isEmpty;
    }

    @Override // o1.g
    public final int size() {
        int size;
        size = this.alpha.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.alpha.toString();
        return localeList;
    }
}
