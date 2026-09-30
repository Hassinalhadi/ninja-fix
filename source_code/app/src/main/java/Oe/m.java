package Oe;

/* loaded from: classes2.dex */
public final class m implements Comparable {
    public final int alpha;
    public final ap purple;
    public final boolean red;

    public m(int i4, ap apVar, boolean z2) {
        this.alpha = i4;
        this.purple = apVar;
        this.red = z2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.alpha - ((m) obj).alpha;
    }
}
