package androidx.compose.foundation.gestures;

import T.r;
import com.clevertap.android.sdk.Constants;
import d.C1530f0;
import d.K;
import f.InterfaceC1673j;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import n.a0;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Ls0/F;", "Ld/f0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrollableElement extends F {
    public final a0 alpha;
    public final K purple;
    public final boolean red;
    public final boolean silver;
    public final InterfaceC1673j teal;

    public ScrollableElement(a0 a0Var, K k6, boolean z2, boolean z10, InterfaceC1673j interfaceC1673j) {
        this.alpha = a0Var;
        this.purple = k6;
        this.red = z2;
        this.silver = z10;
        this.teal = interfaceC1673j;
    }

    @Override // s0.F
    public final r create() {
        return new C1530f0(null, null, this.purple, this.alpha, this.teal, this.red, this.silver);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ScrollableElement) {
                ScrollableElement scrollableElement = (ScrollableElement) obj;
                if (!Intrinsics.areEqual(this.alpha, scrollableElement.alpha) || this.purple != scrollableElement.purple || !Intrinsics.areEqual(null, null) || this.red != scrollableElement.red || this.silver != scrollableElement.silver || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.teal, scrollableElement.teal) || !Intrinsics.areEqual(null, null)) {
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
        int i5;
        int hashCode = (this.purple.hashCode() + (this.alpha.hashCode() * 31)) * 961;
        int i10 = 1237;
        if (this.red) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i11 = (hashCode + i4) * 31;
        if (this.silver) {
            i10 = 1231;
        }
        int i12 = (i11 + i10) * 961;
        InterfaceC1673j interfaceC1673j = this.teal;
        if (interfaceC1673j != null) {
            i5 = interfaceC1673j.hashCode();
        } else {
            i5 = 0;
        }
        return (i12 + i5) * 31;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "scrollable";
        o oVar = c2915g0.charlie;
        oVar.bravo(this.purple, Constants.KEY_ORIENTATION);
        oVar.bravo(this.alpha, "state");
        oVar.bravo(null, "overscrollEffect");
        oVar.bravo(Boolean.valueOf(this.red), "enabled");
        oVar.bravo(Boolean.valueOf(this.silver), "reverseDirection");
        oVar.bravo(null, "flingBehavior");
        oVar.bravo(this.teal, "interactionSource");
        oVar.bravo(null, "bringIntoViewSpec");
    }

    @Override // s0.F
    public final void update(r rVar) {
        boolean z2 = this.red;
        InterfaceC1673j interfaceC1673j = this.teal;
        ((C1530f0) rVar).n(null, null, this.purple, this.alpha, interfaceC1673j, z2, this.silver);
    }
}
