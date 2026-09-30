package sf;

import java.util.List;
import kotlin.collections.e;
import t6.A2;
import tf.AbstractC3119a;

/* loaded from: classes2.dex */
public final class a extends e implements b {
    public final AbstractC3119a alpha;
    public final int purple;
    public final int red;

    public a(AbstractC3119a abstractC3119a, int i4, int i5) {
        this.alpha = abstractC3119a;
        this.purple = i4;
        A2.charlie(i4, i5, abstractC3119a.alpha());
        this.red = i5 - i4;
    }

    @Override // kotlin.collections.a
    public final int alpha() {
        return this.red;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        A2.alpha(i4, this.red);
        return this.alpha.get(this.purple + i4);
    }

    @Override // kotlin.collections.e, java.util.List
    public final List subList(int i4, int i5) {
        A2.charlie(i4, i5, this.red);
        int i10 = this.purple;
        return new a(this.alpha, i4 + i10, i10 + i5);
    }
}
