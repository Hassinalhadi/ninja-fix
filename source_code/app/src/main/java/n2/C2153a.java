package n2;

import androidx.appcompat.widget.P0;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s6.H6;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2153a {
    public final String alpha;
    public final String bravo;
    public final boolean charlie;
    public final int delta;
    public final String echo;
    public final int foxtrot;
    public final int golf;

    public C2153a(String str, String str2, boolean z2, int i4, String str3, int i5) {
        int i10;
        this.alpha = str;
        this.bravo = str2;
        this.charlie = z2;
        this.delta = i4;
        this.echo = str3;
        this.foxtrot = i5;
        Locale US = Locale.US;
        Intrinsics.delta(US, "US");
        String upperCase = str2.toUpperCase(US);
        Intrinsics.delta(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (StringsKt.beige(upperCase, "INT", false)) {
            i10 = 3;
        } else if (!StringsKt.beige(upperCase, "CHAR", false) && !StringsKt.beige(upperCase, "CLOB", false) && !StringsKt.beige(upperCase, "TEXT", false)) {
            if (StringsKt.beige(upperCase, "BLOB", false)) {
                i10 = 5;
            } else if (!StringsKt.beige(upperCase, "REAL", false) && !StringsKt.beige(upperCase, "FLOA", false) && !StringsKt.beige(upperCase, "DOUB", false)) {
                i10 = 1;
            } else {
                i10 = 4;
            }
        } else {
            i10 = 2;
        }
        this.golf = i10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2153a) {
                C2153a c2153a = (C2153a) obj;
                if (this.delta == c2153a.delta) {
                    if (Intrinsics.areEqual(this.alpha, c2153a.alpha) && this.charlie == c2153a.charlie) {
                        int i4 = c2153a.foxtrot;
                        String str = c2153a.echo;
                        String str2 = this.echo;
                        int i5 = this.foxtrot;
                        if (i5 != 1 || i4 != 2 || str2 == null || H6.alpha(str2, str)) {
                            if (i5 != 2 || i4 != 1 || str == null || H6.alpha(str, str2)) {
                                if (i5 != 0 && i5 == i4) {
                                    if (str2 != null) {
                                        if (!H6.alpha(str2, str)) {
                                            return false;
                                        }
                                    } else if (str != null) {
                                        return false;
                                    }
                                }
                                if (this.golf != c2153a.golf) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode = ((this.alpha.hashCode() * 31) + this.golf) * 31;
        if (this.charlie) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return ((hashCode + i4) * 31) + this.delta;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Column{name='");
        sb2.append(this.alpha);
        sb2.append("', type='");
        sb2.append(this.bravo);
        sb2.append("', affinity='");
        sb2.append(this.golf);
        sb2.append("', notNull=");
        sb2.append(this.charlie);
        sb2.append(", primaryKeyPosition=");
        sb2.append(this.delta);
        sb2.append(", defaultValue='");
        String str = this.echo;
        if (str == null) {
            str = "undefined";
        }
        return P0.gold(sb2, str, "'}");
    }
}
