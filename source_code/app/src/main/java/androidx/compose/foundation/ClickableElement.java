package androidx.compose.foundation;

import A0.h;
import T.r;
import b.AbstractC0701p;
import b.H;
import b.ac;
import f.InterfaceC1673j;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Ls0/F;", "Lb/ac;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClickableElement extends F {
    public final InterfaceC1673j alpha;
    public final H purple;
    public final boolean red;
    public final boolean silver;
    public final String teal;
    public final h white;
    public final Function0 yellow;

    public ClickableElement(InterfaceC1673j interfaceC1673j, H h4, boolean z2, boolean z10, String str, h hVar, Function0 function0) {
        this.alpha = interfaceC1673j;
        this.purple = h4;
        this.red = z2;
        this.silver = z10;
        this.teal = str;
        this.white = hVar;
        this.yellow = function0;
    }

    @Override // s0.F
    public final r create() {
        return new AbstractC0701p(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ClickableElement.class == obj.getClass()) {
                ClickableElement clickableElement = (ClickableElement) obj;
                if (!Intrinsics.areEqual(this.alpha, clickableElement.alpha) || !Intrinsics.areEqual(this.purple, clickableElement.purple) || this.red != clickableElement.red || this.silver != clickableElement.silver || !Intrinsics.areEqual(this.teal, clickableElement.teal) || !Intrinsics.areEqual(this.white, clickableElement.white) || this.yellow != clickableElement.yellow) {
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
        int i11;
        int i12 = 0;
        InterfaceC1673j interfaceC1673j = this.alpha;
        if (interfaceC1673j != null) {
            i4 = interfaceC1673j.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = i4 * 31;
        H h4 = this.purple;
        if (h4 != null) {
            i5 = h4.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 31;
        int i15 = 1237;
        if (this.red) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i16 = (i14 + i10) * 31;
        if (this.silver) {
            i15 = 1231;
        }
        int i17 = (i16 + i15) * 31;
        String str = this.teal;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i18 = (i17 + i11) * 31;
        h hVar = this.white;
        if (hVar != null) {
            i12 = hVar.alpha;
        }
        return this.yellow.hashCode() + ((i18 + i12) * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "clickable";
        Boolean valueOf = Boolean.valueOf(this.silver);
        o oVar = c2915g0.charlie;
        oVar.bravo(valueOf, "enabled");
        oVar.bravo(this.yellow, "onClick");
        oVar.bravo(this.teal, "onClickLabel");
        oVar.bravo(this.white, "role");
        oVar.bravo(this.alpha, "interactionSource");
        oVar.bravo(this.purple, "indicationNodeFactory");
    }

    @Override // s0.F
    public final void update(r rVar) {
        ((ac) rVar).n(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow);
    }
}
