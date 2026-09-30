package bz;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class I implements aa {
    public final float alpha;
    public final float bravo;
    public final Object charlie;

    public I(float f5, float f10, Object obj) {
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = obj;
    }

    @Override // bz.InterfaceC0787l
    public final i0 alpha(g0 g0Var) {
        r rVar;
        Object obj = this.charlie;
        if (obj == null) {
            rVar = null;
        } else {
            rVar = (r) g0Var.alpha.invoke(obj);
        }
        return new av.ah(this.alpha, this.bravo, rVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof I) {
            I i4 = (I) obj;
            if (i4.alpha == this.alpha && i4.bravo == this.bravo && Intrinsics.areEqual(i4.charlie, this.charlie)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        Object obj = this.charlie;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        return Float.floatToIntBits(this.bravo) + ao.ad.sierra(this.alpha, i4 * 31, 31);
    }

    public /* synthetic */ I(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
