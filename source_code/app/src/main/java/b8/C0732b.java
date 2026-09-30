package b8;

import J2.l;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* renamed from: b8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0732b {
    public final String alpha;
    public final Map bravo;

    public C0732b(String str, Map map) {
        this.alpha = str;
        this.bravo = map;
    }

    public static l alpha(String str) {
        return new l(str);
    }

    public static C0732b charlie(String str) {
        return new C0732b(str, Collections.EMPTY_MAP);
    }

    public final Annotation bravo(Class cls) {
        return (Annotation) this.bravo.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0732b)) {
            return false;
        }
        C0732b c0732b = (C0732b) obj;
        if (this.alpha.equals(c0732b.alpha) && this.bravo.equals(c0732b.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.alpha + ", properties=" + this.bravo.values() + "}";
    }
}
