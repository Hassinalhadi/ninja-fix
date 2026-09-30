package androidx.compose.foundation.layout;

import h.AbstractC1797a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Ls0/F;", "Landroidx/compose/foundation/layout/K;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaddingElement extends s0.F {
    public final float alpha;
    public final float purple;
    public final float red;
    public final float silver;
    public final Function1 teal;

    public PaddingElement(float f5, float f10, float f11, float f12, Function1 function1) {
        boolean z2;
        boolean z10;
        boolean z11;
        this.alpha = f5;
        this.purple = f10;
        this.red = f11;
        this.silver = f12;
        this.teal = function1;
        boolean z12 = true;
        if (f5 < 0.0f && !Float.isNaN(f5)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (f10 < 0.0f && !Float.isNaN(f10)) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z13 = z2 & z10;
        if (f11 < 0.0f && !Float.isNaN(f11)) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z14 = z13 & z11;
        if (f12 < 0.0f && !Float.isNaN(f12)) {
            z12 = false;
        }
        if (!(z14 & z12)) {
            AbstractC1797a.alpha("Padding must be non-negative");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.r, androidx.compose.foundation.layout.K] */
    @Override // s0.F
    public final T.r create() {
        ?? rVar = new T.r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        rVar.red = this.red;
        rVar.silver = this.silver;
        rVar.teal = true;
        return rVar;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement != null && Q0.g.alpha(this.alpha, paddingElement.alpha) && Q0.g.alpha(this.purple, paddingElement.purple) && Q0.g.alpha(this.red, paddingElement.red) && Q0.g.alpha(this.silver, paddingElement.silver)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.silver) + ao.ad.sierra(this.red, ao.ad.sierra(this.purple, Float.floatToIntBits(this.alpha) * 31, 31), 31)) * 31) + 1231;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        this.teal.invoke(c2915g0);
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        K k6 = (K) rVar;
        k6.alpha = this.alpha;
        k6.purple = this.purple;
        k6.red = this.red;
        k6.silver = this.silver;
        k6.teal = true;
    }
}
