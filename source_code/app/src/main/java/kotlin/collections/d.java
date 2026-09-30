package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class d extends e implements RandomAccess {
    public final /* synthetic */ int alpha = 1;
    public int purple;
    public int red;
    public final List silver;

    public d(List list) {
        this.silver = list;
    }

    @Override // kotlin.collections.a
    public final int alpha() {
        switch (this.alpha) {
            case 0:
                return this.red;
            default:
                return this.red;
        }
    }

    @Override // java.util.List
    public final Object get(int i4) {
        switch (this.alpha) {
            case 0:
                int i5 = this.red;
                if (i4 >= 0 && i4 < i5) {
                    return ((e) this.silver).get(this.purple + i4);
                }
                throw new IndexOutOfBoundsException(A0.z.juliet("index: ", i4, i5, ", size: "));
            default:
                int i10 = this.red;
                if (i4 >= 0 && i4 < i10) {
                    return this.silver.get(this.purple + i4);
                }
                throw new IndexOutOfBoundsException(A0.z.juliet("index: ", i4, i10, ", size: "));
        }
    }

    @Override // kotlin.collections.e, java.util.List
    public List subList(int i4, int i5) {
        switch (this.alpha) {
            case 0:
                ab.delta(i4, i5, this.red);
                int i10 = this.purple;
                return new d((e) this.silver, i4 + i10, i10 + i5);
            default:
                return super.subList(i4, i5);
        }
    }

    public d(e eVar, int i4, int i5) {
        this.silver = eVar;
        this.purple = i4;
        ab.delta(i4, i5, eVar.alpha());
        this.red = i5 - i4;
    }
}
