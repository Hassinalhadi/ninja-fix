package androidx.compose.foundation.layout;

import kotlin.Metadata;
import t0.C2915g0;
import t0.C2932p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "Ls0/F;", "Landroidx/compose/foundation/layout/W;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SizeElement extends s0.F {
    public final float alpha;
    public final float purple;
    public final float red;
    public final float silver;
    public final boolean teal;
    public final C2932p white;

    public SizeElement(float f5, float f10, float f11, float f12, boolean z2, C2932p c2932p) {
        this.alpha = f5;
        this.purple = f10;
        this.red = f11;
        this.silver = f12;
        this.teal = z2;
        this.white = c2932p;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.W, T.r] */
    @Override // s0.F
    public final T.r create() {
        ?? rVar = new T.r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        rVar.red = this.red;
        rVar.silver = this.silver;
        rVar.teal = this.teal;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SizeElement) {
                SizeElement sizeElement = (SizeElement) obj;
                if (!Q0.g.alpha(this.alpha, sizeElement.alpha) || !Q0.g.alpha(this.purple, sizeElement.purple) || !Q0.g.alpha(this.red, sizeElement.red) || !Q0.g.alpha(this.silver, sizeElement.silver) || this.teal != sizeElement.teal) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int sierra = ao.ad.sierra(this.silver, ao.ad.sierra(this.red, ao.ad.sierra(this.purple, Float.floatToIntBits(this.alpha) * 31, 31), 31), 31);
        if (this.teal) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return sierra + i4;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        this.white.getClass();
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        W w4 = (W) rVar;
        w4.alpha = this.alpha;
        w4.purple = this.purple;
        w4.red = this.red;
        w4.silver = this.silver;
        w4.teal = this.teal;
    }

    public /* synthetic */ SizeElement(float f5, float f10, float f11, float f12, C2932p c2932p, int i4) {
        this((i4 & 1) != 0 ? Float.NaN : f5, (i4 & 2) != 0 ? Float.NaN : f10, (i4 & 4) != 0 ? Float.NaN : f11, (i4 & 8) != 0 ? Float.NaN : f12, true, c2932p);
    }
}
