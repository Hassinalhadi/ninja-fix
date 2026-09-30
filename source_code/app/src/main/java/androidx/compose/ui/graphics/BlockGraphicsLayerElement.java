package androidx.compose.ui.graphics;

import T.r;
import a0.C0361o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import s0.AbstractC2555o;
import s0.F;
import s0.L;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Ls0/F;", "La0/o;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BlockGraphicsLayerElement extends F {
    public final Function1 alpha;

    public BlockGraphicsLayerElement(Function1 function1) {
        this.alpha = function1;
    }

    @Override // s0.F
    public final r create() {
        return new C0361o(this.alpha);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockGraphicsLayerElement)) {
            return false;
        }
        if (this.alpha == ((BlockGraphicsLayerElement) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "graphicsLayer";
        c2915g0.charlie.bravo(this.alpha, "block");
    }

    @Override // s0.F
    public final void update(r rVar) {
        C0361o c0361o = (C0361o) rVar;
        c0361o.alpha = this.alpha;
        L l10 = AbstractC2555o.echo(c0361o, 2).f13252j;
        if (l10 != null) {
            l10.X(c0361o.alpha, true);
        }
    }
}
