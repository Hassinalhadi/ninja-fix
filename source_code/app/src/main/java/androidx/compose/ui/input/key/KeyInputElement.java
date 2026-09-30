package androidx.compose.ui.input.key;

import T.r;
import k0.e;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Ls0/F;", "Lk0/e;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KeyInputElement extends F {
    public final Function1 alpha;
    public final Function1 purple;

    public KeyInputElement(Function1 function1, Function1 function12) {
        this.alpha = function1;
        this.purple = function12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.r, k0.e] */
    @Override // s0.F
    public final r create() {
        ?? rVar = new r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        if (this.alpha == keyInputElement.alpha && this.purple == keyInputElement.purple) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5 = 0;
        Function1 function1 = this.alpha;
        if (function1 != null) {
            i4 = function1.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * 31;
        Function1 function12 = this.purple;
        if (function12 != null) {
            i5 = function12.hashCode();
        }
        return i10 + i5;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        o oVar = c2915g0.charlie;
        Function1 function1 = this.alpha;
        if (function1 != null) {
            c2915g0.alpha = "onKeyEvent";
            oVar.bravo(function1, "onKeyEvent");
        }
        Function1 function12 = this.purple;
        if (function12 != null) {
            c2915g0.alpha = "onPreviewKeyEvent";
            oVar.bravo(function12, "onPreviewKeyEvent");
        }
    }

    @Override // s0.F
    public final void update(r rVar) {
        e eVar = (e) rVar;
        eVar.alpha = this.alpha;
        eVar.purple = this.purple;
    }
}
