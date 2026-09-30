package zd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h {
    public final String alpha;
    public final int bravo;

    public h(String content) {
        Intrinsics.echo(content, "content");
        this.alpha = content;
        int length = content.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            i4 = (i4 * 31) + Character.toLowerCase(content.charAt(i5));
        }
        this.bravo = i4;
    }

    public final boolean equals(Object obj) {
        h hVar;
        String str;
        if (obj instanceof h) {
            hVar = (h) obj;
        } else {
            hVar = null;
        }
        if (hVar == null || (str = hVar.alpha) == null || !str.equalsIgnoreCase(this.alpha)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.bravo;
    }

    public final String toString() {
        return this.alpha;
    }
}
