package androidx.compose.foundation;

import Q0.g;
import T.r;
import a0.C0366t;
import a0.as;
import a0.au;
import b.aa;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Ls0/F;", "Lb/aa;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BorderModifierNodeElement extends F {
    public final float alpha;
    public final au purple;
    public final as red;

    public BorderModifierNodeElement(float f5, au auVar, as asVar) {
        this.alpha = f5;
        this.purple = auVar;
        this.red = asVar;
    }

    @Override // s0.F
    public final r create() {
        return new aa(this.alpha, this.purple, this.red);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return g.alpha(this.alpha, borderModifierNodeElement.alpha) && Intrinsics.areEqual(this.purple, borderModifierNodeElement.purple) && Intrinsics.areEqual(this.red, borderModifierNodeElement.red);
    }

    public final int hashCode() {
        return this.red.hashCode() + ((this.purple.hashCode() + (Float.floatToIntBits(this.alpha) * 31)) * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = Constants.KEY_BORDER;
        g gVar = new g(this.alpha);
        o oVar = c2915g0.charlie;
        oVar.bravo(gVar, "width");
        long j5 = this.purple.alpha;
        oVar.bravo(new C0366t(j5), Constants.KEY_COLOR);
        c2915g0.bravo = new C0366t(j5);
        oVar.bravo(this.red, "shape");
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) g.bravo(this.alpha)) + ", brush=" + this.purple + ", shape=" + this.red + ')';
    }

    @Override // s0.F
    public final void update(r rVar) {
        aa aaVar = (aa) rVar;
        float f5 = aaVar.silver;
        float f10 = this.alpha;
        boolean alpha = g.alpha(f5, f10);
        X.b bVar = aaVar.yellow;
        if (!alpha) {
            aaVar.silver = f10;
            bVar.b();
        }
        au auVar = aaVar.teal;
        au auVar2 = this.purple;
        if (!Intrinsics.areEqual(auVar, auVar2)) {
            aaVar.teal = auVar2;
            bVar.b();
        }
        as asVar = aaVar.white;
        as asVar2 = this.red;
        if (!Intrinsics.areEqual(asVar, asVar2)) {
            aaVar.white = asVar2;
            bVar.b();
        }
    }
}
