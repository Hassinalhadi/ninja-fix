package E3;

import android.text.TextUtils;
import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class h {
    public static final g8.d echo = new g8.d(2);
    public final Object alpha;
    public final g bravo;
    public final String charlie;
    public volatile byte[] delta;

    public h(String str, Object obj, g gVar) {
        if (!TextUtils.isEmpty(str)) {
            this.charlie = str;
            this.alpha = obj;
            this.bravo = gVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static h alpha(Object obj, String str) {
        return new h(str, obj, echo);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.charlie.equals(((h) obj).charlie);
        }
        return false;
    }

    public final int hashCode() {
        return this.charlie.hashCode();
    }

    public final String toString() {
        return P0.gold(new StringBuilder("Option{key='"), this.charlie, "'}");
    }
}
