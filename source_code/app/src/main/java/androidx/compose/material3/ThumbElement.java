package androidx.compose.material3;

import F.L2;
import T.r;
import androidx.appcompat.widget.P0;
import bz.AbstractC0779d;
import f.InterfaceC1673j;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2555o;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/ThumbElement;", "Ls0/F;", "LF/L2;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ThumbElement extends F {
    public final InterfaceC1673j alpha;
    public final boolean purple;

    public ThumbElement(InterfaceC1673j interfaceC1673j, boolean z2) {
        this.alpha = interfaceC1673j;
        this.purple = z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.r, F.L2] */
    @Override // s0.F
    public final r create() {
        ?? rVar = new r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        rVar.white = Float.NaN;
        rVar.yellow = Float.NaN;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return Intrinsics.areEqual(this.alpha, thumbElement.alpha) && this.purple == thumbElement.purple;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        if (this.purple) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return hashCode + i4;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "switchThumb";
        o oVar = c2915g0.charlie;
        oVar.bravo(this.alpha, "interactionSource");
        oVar.bravo(Boolean.valueOf(this.purple), "checked");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThumbElement(interactionSource=");
        sb2.append(this.alpha);
        sb2.append(", checked=");
        return P0.gray(sb2, this.purple, ')');
    }

    @Override // s0.F
    public final void update(r rVar) {
        L2 l22 = (L2) rVar;
        l22.alpha = this.alpha;
        boolean z2 = l22.purple;
        boolean z10 = this.purple;
        if (z2 != z10) {
            AbstractC2555o.golf(l22).blue();
        }
        l22.purple = z10;
        if (l22.teal == null && !Float.isNaN(l22.yellow)) {
            l22.teal = AbstractC0779d.alpha(l22.yellow);
        }
        if (l22.silver == null && !Float.isNaN(l22.white)) {
            l22.silver = AbstractC0779d.alpha(l22.white);
        }
    }
}
