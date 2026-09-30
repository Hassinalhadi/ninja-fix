package androidx.compose.foundation.text.contextmenu.modifier;

import T.r;
import kotlin.Metadata;
import n.C2149y;
import s0.F;
import s1.C2576i;
import t.C2882h;
import t0.C2915g0;
import y.at;
import y.au;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;", "Ls0/F;", "Lt/h;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextContextMenuToolbarHandlerElement extends F {
    public final C2576i alpha;
    public final at purple;
    public final au red;
    public final C2149y silver;

    public TextContextMenuToolbarHandlerElement(C2576i c2576i, at atVar, au auVar, C2149y c2149y) {
        this.alpha = c2576i;
        this.purple = atVar;
        this.red = auVar;
        this.silver = c2149y;
    }

    @Override // s0.F
    public final r create() {
        return new C2882h(this.alpha, this.purple, this.red, this.silver);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextContextMenuToolbarHandlerElement) {
                TextContextMenuToolbarHandlerElement textContextMenuToolbarHandlerElement = (TextContextMenuToolbarHandlerElement) obj;
                if (this.alpha != textContextMenuToolbarHandlerElement.alpha || this.purple != textContextMenuToolbarHandlerElement.purple || this.red != textContextMenuToolbarHandlerElement.red || this.silver != textContextMenuToolbarHandlerElement.silver) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.silver.hashCode() + ((this.red.hashCode() + ((this.purple.hashCode() + (this.alpha.hashCode() * 31)) * 31)) * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
    }

    @Override // s0.F
    public final void update(r rVar) {
        C2882h c2882h = (C2882h) rVar;
        c2882h.red.alpha = null;
        C2576i c2576i = this.alpha;
        c2882h.red = c2576i;
        c2576i.alpha = c2882h;
        c2882h.silver = this.purple;
        c2882h.teal = this.red;
        c2882h.white = this.silver;
    }
}
