package androidx.compose.foundation.selection;

import A0.h;
import T.r;
import f.InterfaceC1673j;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.C2042b;
import s0.AbstractC2555o;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Ls0/F;", "Ll/b;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToggleableElement extends F {
    public final boolean alpha;
    public final InterfaceC1673j purple;
    public final boolean red;
    public final h silver;
    public final Function1 teal;

    public ToggleableElement(boolean z2, InterfaceC1673j interfaceC1673j, boolean z10, h hVar, Function1 function1) {
        this.alpha = z2;
        this.purple = interfaceC1673j;
        this.red = z10;
        this.silver = hVar;
        this.teal = function1;
    }

    @Override // s0.F
    public final r create() {
        h hVar = this.silver;
        return new C2042b(this.alpha, this.purple, this.red, hVar, this.teal);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ToggleableElement.class == obj.getClass()) {
                ToggleableElement toggleableElement = (ToggleableElement) obj;
                if (this.alpha != toggleableElement.alpha || !Intrinsics.areEqual(this.purple, toggleableElement.purple) || !Intrinsics.areEqual(null, null) || this.red != toggleableElement.red || !Intrinsics.areEqual(this.silver, toggleableElement.silver) || this.teal != toggleableElement.teal) {
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
        int i10 = 1237;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i11 = i4 * 31;
        InterfaceC1673j interfaceC1673j = this.purple;
        if (interfaceC1673j != null) {
            i5 = interfaceC1673j.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (((i11 + i5) * 961) + 1237) * 31;
        if (this.red) {
            i10 = 1231;
        }
        return this.teal.hashCode() + ((((i12 + i10) * 31) + this.silver.alpha) * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "toggleable";
        Object obj = c2915g0.bravo;
        o oVar = c2915g0.charlie;
        oVar.bravo(obj, "value");
        oVar.bravo(this.purple, "interactionSource");
        oVar.bravo(null, "indicationNodeFactory");
        oVar.bravo(Boolean.valueOf(this.red), "enabled");
        oVar.bravo(this.silver, "role");
        oVar.bravo(this.teal, "onValueChange");
    }

    @Override // s0.F
    public final void update(r rVar) {
        C2042b c2042b = (C2042b) rVar;
        boolean z2 = c2042b.f12939q;
        boolean z10 = this.alpha;
        if (z2 != z10) {
            c2042b.f12939q = z10;
            AbstractC2555o.golf(c2042b).coral();
        }
        c2042b.f12940r = this.teal;
        c2042b.n(this.purple, null, false, this.red, null, this.silver, c2042b.f12941s);
    }
}
