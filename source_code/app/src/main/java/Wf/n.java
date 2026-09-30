package Wf;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n implements o {
    public final String alpha;

    public n(String language) {
        Intrinsics.echo(language, "language");
        this.alpha = language;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            return Intrinsics.areEqual(this.alpha, ((n) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return P0.gold(new StringBuilder("LanguageQualifier(language='"), this.alpha, "')");
    }
}
