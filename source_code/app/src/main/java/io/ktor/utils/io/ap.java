package io.ktor.utils.io;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes2.dex */
public final class ap {
    public static final List bravo = CollectionsKt.listOf(new ap(1), new ap(2), new ap(4));
    public final int alpha;

    public /* synthetic */ ap(int i4) {
        this.alpha = i4;
    }

    public static String alpha(int i4) {
        if (i4 == 1) {
            return "CR";
        }
        if (i4 == 2) {
            return "LF";
        }
        if (i4 == 4) {
            return "CRLF";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : bravo) {
            if ((((ap) obj).alpha | i4) == i4) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ap) {
            if (this.alpha != ((ap) obj).alpha) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha;
    }

    public final String toString() {
        return alpha(this.alpha);
    }
}
