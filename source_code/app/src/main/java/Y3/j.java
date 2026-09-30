package Y3;

/* loaded from: classes3.dex */
public final class j {
    public Class alpha;
    public Class bravo;
    public Class charlie;

    public j(Class cls, Class cls2, Class cls3) {
        this.alpha = cls;
        this.bravo = cls2;
        this.charlie = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.alpha.equals(jVar.alpha) && this.bravo.equals(jVar.bravo) && l.bravo(this.charlie, jVar.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31;
        Class cls = this.charlie;
        if (cls != null) {
            i4 = cls.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.alpha + ", second=" + this.bravo + '}';
    }
}
