package K0;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public final Locale alpha;

    public a(Locale locale) {
        this.alpha = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return Intrinsics.areEqual(this.alpha.toLanguageTag(), ((a) obj).alpha.toLanguageTag());
    }

    public final int hashCode() {
        return this.alpha.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.alpha.toLanguageTag();
    }
}
