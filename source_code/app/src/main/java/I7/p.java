package I7;

/* loaded from: classes2.dex */
public final class p {
    public final Class alpha;
    public final Class bravo;

    public p(Class cls, Class cls2) {
        this.alpha = cls;
        this.bravo = cls2;
    }

    public static p alpha(Class cls) {
        return new p(o.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.bravo.equals(pVar.bravo)) {
            return false;
        }
        return this.alpha.equals(pVar.alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode() + (this.bravo.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.bravo;
        Class cls2 = this.alpha;
        if (cls2 == o.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
