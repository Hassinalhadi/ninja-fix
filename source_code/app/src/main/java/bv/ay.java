package bv;

/* loaded from: classes3.dex */
public final class ay extends kotlin.collections.x {
    public int alpha;
    public final /* synthetic */ ax purple;

    public ay(ax axVar) {
        this.purple = axVar;
    }

    @Override // kotlin.collections.x
    public final int alpha() {
        int i4 = this.alpha;
        this.alpha = i4 + 1;
        return this.purple.echo(i4);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.alpha < this.purple.golf()) {
            return true;
        }
        return false;
    }
}
