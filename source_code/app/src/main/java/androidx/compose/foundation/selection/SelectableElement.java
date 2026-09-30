package androidx.compose.foundation.selection;

import A0.h;
import T.r;
import b.AbstractC0701p;
import b.H;
import f.InterfaceC1673j;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.C2041a;
import s0.AbstractC2555o;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "Ls0/F;", "Ll/a;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectableElement extends F {
    public final boolean alpha;
    public final InterfaceC1673j purple;
    public final H red;
    public final boolean silver;
    public final h teal;
    public final Function0 white;

    public SelectableElement(boolean z2, InterfaceC1673j interfaceC1673j, H h4, boolean z10, h hVar, Function0 function0) {
        this.alpha = z2;
        this.purple = interfaceC1673j;
        this.red = h4;
        this.silver = z10;
        this.teal = hVar;
        this.white = function0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b.p, T.r, l.a] */
    @Override // s0.F
    public final r create() {
        ?? abstractC0701p = new AbstractC0701p(this.purple, this.red, false, this.silver, null, this.teal, this.white);
        abstractC0701p.f12938q = this.alpha;
        return abstractC0701p;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && SelectableElement.class == obj.getClass()) {
                SelectableElement selectableElement = (SelectableElement) obj;
                if (this.alpha != selectableElement.alpha || !Intrinsics.areEqual(this.purple, selectableElement.purple) || !Intrinsics.areEqual(this.red, selectableElement.red) || this.silver != selectableElement.silver || !Intrinsics.areEqual(this.teal, selectableElement.teal) || this.white != selectableElement.white) {
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
        int i10;
        int i11 = 1237;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i12 = i4 * 31;
        int i13 = 0;
        InterfaceC1673j interfaceC1673j = this.purple;
        if (interfaceC1673j != null) {
            i5 = interfaceC1673j.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i12 + i5) * 31;
        H h4 = this.red;
        if (h4 != null) {
            i10 = h4.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (((i14 + i10) * 31) + 1237) * 31;
        if (this.silver) {
            i11 = 1231;
        }
        int i16 = (i15 + i11) * 31;
        h hVar = this.teal;
        if (hVar != null) {
            i13 = hVar.alpha;
        }
        return this.white.hashCode() + ((i16 + i13) * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "selectable";
        Boolean valueOf = Boolean.valueOf(this.alpha);
        o oVar = c2915g0.charlie;
        oVar.bravo(valueOf, "selected");
        oVar.bravo(this.purple, "interactionSource");
        oVar.bravo(this.red, "indicationNodeFactory");
        oVar.bravo(Boolean.valueOf(this.silver), "enabled");
        oVar.bravo(this.teal, "role");
        oVar.bravo(this.white, "onClick");
    }

    @Override // s0.F
    public final void update(r rVar) {
        C2041a c2041a = (C2041a) rVar;
        boolean z2 = c2041a.f12938q;
        boolean z10 = this.alpha;
        if (z2 != z10) {
            c2041a.f12938q = z10;
            AbstractC2555o.golf(c2041a).coral();
        }
        c2041a.n(this.purple, this.red, false, this.silver, null, this.teal, this.white);
    }
}
