package androidx.compose.foundation.text.contextmenu.modifier;

import T.r;
import kotlin.Metadata;
import s0.F;
import t.C2880f;
import t0.C2915g0;
import y.as;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;", "Ls0/F;", "Lt/f;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextContextMenuGestureElement extends F {
    public final as alpha;

    public TextContextMenuGestureElement(as asVar) {
        this.alpha = asVar;
    }

    @Override // s0.F
    public final r create() {
        return new C2880f(this.alpha);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextContextMenuGestureElement) {
                if (this.alpha != ((TextContextMenuGestureElement) obj).alpha) {
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
        c2915g0.alpha = "TextContextMenuGestures";
        c2915g0.charlie.bravo(this.alpha, "onPreShowContextMenu");
    }

    @Override // s0.F
    public final void update(r rVar) {
        ((C2880f) rVar).red = this.alpha;
    }
}
