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
import l.C2043c;
import s0.AbstractC2555o;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableElement;", "Ls0/F;", "Ll/c;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TriStateToggleableElement extends F {
    public final C0.a alpha;
    public final InterfaceC1673j purple;
    public final H red;
    public final boolean silver;
    public final h teal;
    public final Function0 white;

    public TriStateToggleableElement(C0.a aVar, InterfaceC1673j interfaceC1673j, H h4, boolean z2, h hVar, Function0 function0) {
        this.alpha = aVar;
        this.purple = interfaceC1673j;
        this.red = h4;
        this.silver = z2;
        this.teal = hVar;
        this.white = function0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.c, b.p, T.r] */
    @Override // s0.F
    public final r create() {
        ?? abstractC0701p = new AbstractC0701p(this.purple, this.red, false, this.silver, null, this.teal, this.white);
        abstractC0701p.f12942q = this.alpha;
        return abstractC0701p;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && TriStateToggleableElement.class == obj.getClass()) {
                TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
                if (this.alpha != triStateToggleableElement.alpha || !Intrinsics.areEqual(this.purple, triStateToggleableElement.purple) || !Intrinsics.areEqual(this.red, triStateToggleableElement.red) || this.silver != triStateToggleableElement.silver || !Intrinsics.areEqual(this.teal, triStateToggleableElement.teal) || this.white != triStateToggleableElement.white) {
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
        int hashCode = this.alpha.hashCode() * 31;
        int i5 = 0;
        InterfaceC1673j interfaceC1673j = this.purple;
        if (interfaceC1673j != null) {
            i4 = interfaceC1673j.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (hashCode + i4) * 31;
        H h4 = this.red;
        if (h4 != null) {
            i5 = h4.hashCode();
        }
        int i11 = (i10 + i5) * 31;
        int i12 = 1237;
        int i13 = (i11 + 1237) * 31;
        if (this.silver) {
            i12 = 1231;
        }
        return this.white.hashCode() + ((((i13 + i12) * 31) + this.teal.alpha) * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "triStateToggleable";
        C0.a aVar = this.alpha;
        o oVar = c2915g0.charlie;
        oVar.bravo(aVar, "state");
        oVar.bravo(this.purple, "interactionSource");
        oVar.bravo(this.red, "indicationNodeFactory");
        oVar.bravo(Boolean.valueOf(this.silver), "enabled");
        oVar.bravo(this.teal, "role");
        oVar.bravo(this.white, "onClick");
    }

    @Override // s0.F
    public final void update(r rVar) {
        C2043c c2043c = (C2043c) rVar;
        C0.a aVar = c2043c.f12942q;
        C0.a aVar2 = this.alpha;
        if (aVar != aVar2) {
            c2043c.f12942q = aVar2;
            AbstractC2555o.golf(c2043c).coral();
        }
        h hVar = this.teal;
        c2043c.n(this.purple, this.red, false, this.silver, null, hVar, this.white);
    }
}
