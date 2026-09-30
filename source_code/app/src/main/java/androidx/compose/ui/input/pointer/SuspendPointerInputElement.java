package androidx.compose.ui.input.pointer;

import T.r;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import m0.ah;
import n.K;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Ls0/F;", "Lm0/ah;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SuspendPointerInputElement extends F {
    public final Object alpha;
    public final Object purple;
    public final PointerInputEventHandler red;

    public SuspendPointerInputElement(Object obj, K k6, PointerInputEventHandler pointerInputEventHandler, int i4) {
        k6 = (i4 & 2) != 0 ? null : k6;
        this.alpha = obj;
        this.purple = k6;
        this.red = pointerInputEventHandler;
    }

    @Override // s0.F
    public final r create() {
        return new ah(this.alpha, this.purple, this.red);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SuspendPointerInputElement) {
                SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
                if (Intrinsics.areEqual(this.alpha, suspendPointerInputElement.alpha) && Intrinsics.areEqual(this.purple, suspendPointerInputElement.purple) && this.red == suspendPointerInputElement.red) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int i5 = 0;
        Object obj = this.alpha;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i4 * 31;
        Object obj2 = this.purple;
        if (obj2 != null) {
            i5 = obj2.hashCode();
        }
        return this.red.hashCode() + ((i10 + i5) * 961);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "pointerInput";
        o oVar = c2915g0.charlie;
        oVar.bravo(this.alpha, "key1");
        oVar.bravo(this.purple, "key2");
        oVar.bravo(null, "keys");
        oVar.bravo(this.red, "pointerInputEventHandler");
    }

    @Override // s0.F
    public final void update(r rVar) {
        ah ahVar = (ah) rVar;
        Object obj = ahVar.alpha;
        Object obj2 = this.alpha;
        boolean z2 = true;
        boolean z10 = !Intrinsics.areEqual(obj, obj2);
        ahVar.alpha = obj2;
        Object obj3 = ahVar.purple;
        Object obj4 = this.purple;
        if (!Intrinsics.areEqual(obj3, obj4)) {
            z10 = true;
        }
        ahVar.purple = obj4;
        Class<?> cls = ahVar.red.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.red;
        if (cls == pointerInputEventHandler.getClass()) {
            z2 = z10;
        }
        if (z2) {
            ahVar.d();
        }
        ahVar.red = pointerInputEventHandler;
    }
}
