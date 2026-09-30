package androidx.compose.foundation.layout;

import kotlin.Metadata;
import s0.AbstractC2555o;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Ls0/F;", "Landroidx/compose/foundation/layout/I;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OffsetElement extends s0.F {
    public final float alpha;
    public final float purple;
    public final H red;

    public OffsetElement(float f5, float f10, H h4) {
        this.alpha = f5;
        this.purple = f10;
        this.red = h4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.I, T.r] */
    @Override // s0.F
    public final T.r create() {
        ?? rVar = new T.r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        rVar.red = true;
        return rVar;
    }

    public final boolean equals(Object obj) {
        OffsetElement offsetElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetElement) {
            offsetElement = (OffsetElement) obj;
        } else {
            offsetElement = null;
        }
        if (offsetElement != null && Q0.g.alpha(this.alpha, offsetElement.alpha) && Q0.g.alpha(this.purple, offsetElement.purple)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.purple) + (Float.floatToIntBits(this.alpha) * 31)) * 31) + 1231;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        this.red.invoke(c2915g0);
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) Q0.g.bravo(this.alpha)) + ", y=" + ((Object) Q0.g.bravo(this.purple)) + ", rtlAware=true)";
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        I i4 = (I) rVar;
        float f5 = i4.alpha;
        float f10 = this.alpha;
        boolean alpha = Q0.g.alpha(f5, f10);
        float f11 = this.purple;
        if (!alpha || !Q0.g.alpha(i4.purple, f11) || !i4.red) {
            s0.al golf = AbstractC2555o.golf(i4);
            s0.af afVar = s0.al.f13273J;
            golf.ochre(false);
        }
        i4.alpha = f10;
        i4.purple = f11;
        i4.red = true;
    }
}
