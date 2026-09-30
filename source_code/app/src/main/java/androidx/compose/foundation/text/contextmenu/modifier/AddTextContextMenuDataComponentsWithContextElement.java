package androidx.compose.foundation.text.contextmenu.modifier;

import T.r;
import k5.C2015h;
import kotlin.Metadata;
import n.Y;
import s0.AbstractC2556p;
import s0.F;
import t.C2876b;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/AddTextContextMenuDataComponentsWithContextElement;", "Ls0/F;", "Lt/b;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddTextContextMenuDataComponentsWithContextElement extends F {
    public final C2015h alpha;

    public AddTextContextMenuDataComponentsWithContextElement(C2015h c2015h) {
        this.alpha = c2015h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t.b, T.r, s0.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [t.a, s0.n, T.r] */
    @Override // s0.F
    public final r create() {
        ?? abstractC2556p = new AbstractC2556p();
        abstractC2556p.red = this.alpha;
        Y y10 = new Y(15, (Object) abstractC2556p);
        ?? rVar = new r();
        rVar.alpha = y10;
        abstractC2556p.b(rVar);
        return abstractC2556p;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AddTextContextMenuDataComponentsWithContextElement) {
                if (this.alpha != ((AddTextContextMenuDataComponentsWithContextElement) obj).alpha) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "addTextContextMenuDataComponentsWithResources";
        c2915g0.charlie.bravo(this.alpha, "builder");
    }

    @Override // s0.F
    public final void update(r rVar) {
        ((C2876b) rVar).red = this.alpha;
    }
}
