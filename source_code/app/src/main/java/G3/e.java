package G3;

/* loaded from: classes3.dex */
public final class e implements i {
    public final f alpha;
    public int bravo;
    public Class charlie;

    public e(f fVar) {
        this.alpha = fVar;
    }

    @Override // G3.i
    public final void alpha() {
        this.alpha.O(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.bravo == eVar.bravo && this.charlie == eVar.charlie) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5 = this.bravo * 31;
        Class cls = this.charlie;
        if (cls != null) {
            i4 = cls.hashCode();
        } else {
            i4 = 0;
        }
        return i5 + i4;
    }

    public final String toString() {
        return "Key{size=" + this.bravo + "array=" + this.charlie + '}';
    }
}
