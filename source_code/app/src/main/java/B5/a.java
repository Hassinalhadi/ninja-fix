package B5;

/* loaded from: classes3.dex */
public final class a {
    public final Object alpha;
    public final d bravo;
    public final b charlie;

    public a(Object obj, d dVar, b bVar) {
        if (obj != null) {
            this.alpha = obj;
            this.bravo = dVar;
            this.charlie = bVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            aVar.getClass();
            if (this.alpha.equals(aVar.alpha) && this.bravo.equals(aVar.bravo)) {
                b bVar = aVar.charlie;
                b bVar2 = this.charlie;
                if (bVar2 != null ? bVar2.equals(bVar) : bVar == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((1000003 * 1000003) ^ this.alpha.hashCode()) * 1000003) ^ this.bravo.hashCode()) * 1000003;
        b bVar = this.charlie;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        return (hashCode2 ^ hashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.alpha + ", priority=" + this.bravo + ", productData=" + this.charlie + ", eventContext=null}";
    }
}
