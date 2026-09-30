package androidx.compose.ui.draw;

import T.f;
import T.r;
import X.g;
import Z.e;
import a0.AbstractC0367u;
import ao.ad;
import f0.AbstractC1680b;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import q0.InterfaceC2392k;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Ls0/F;", "LX/g;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PainterElement extends F {
    public final AbstractC1680b alpha;
    public final f purple;
    public final InterfaceC2392k red;
    public final float silver;
    public final AbstractC0367u teal;

    public PainterElement(AbstractC1680b abstractC1680b, f fVar, InterfaceC2392k interfaceC2392k, float f5, AbstractC0367u abstractC0367u) {
        this.alpha = abstractC1680b;
        this.purple = fVar;
        this.red = interfaceC2392k;
        this.silver = f5;
        this.teal = abstractC0367u;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.g, T.r] */
    @Override // s0.F
    public final r create() {
        ?? rVar = new r();
        rVar.alpha = this.alpha;
        rVar.purple = true;
        rVar.red = this.purple;
        rVar.silver = this.red;
        rVar.teal = this.silver;
        rVar.white = this.teal;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return Intrinsics.areEqual(this.alpha, painterElement.alpha) && Intrinsics.areEqual(this.purple, painterElement.purple) && Intrinsics.areEqual(this.red, painterElement.red) && Float.compare(this.silver, painterElement.silver) == 0 && Intrinsics.areEqual(this.teal, painterElement.teal);
    }

    public final int hashCode() {
        int hashCode;
        int sierra = ad.sierra(this.silver, (this.red.hashCode() + ((this.purple.hashCode() + (((this.alpha.hashCode() * 31) + 1231) * 31)) * 31)) * 31, 31);
        AbstractC0367u abstractC0367u = this.teal;
        if (abstractC0367u == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC0367u.hashCode();
        }
        return sierra + hashCode;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "paint";
        o oVar = c2915g0.charlie;
        oVar.bravo(this.alpha, "painter");
        oVar.bravo(Boolean.TRUE, "sizeToIntrinsics");
        oVar.bravo(this.purple, "alignment");
        oVar.bravo(this.red, "contentScale");
        oVar.bravo(Float.valueOf(this.silver), "alpha");
        oVar.bravo(this.teal, "colorFilter");
    }

    public final String toString() {
        return "PainterElement(painter=" + this.alpha + ", sizeToIntrinsics=true, alignment=" + this.purple + ", contentScale=" + this.red + ", alpha=" + this.silver + ", colorFilter=" + this.teal + ')';
    }

    @Override // s0.F
    public final void update(r rVar) {
        boolean z2;
        g gVar = (g) rVar;
        boolean z10 = gVar.purple;
        AbstractC1680b abstractC1680b = this.alpha;
        if (z10 && e.alpha(gVar.alpha.mo1getIntrinsicSizeNHjbRc(), abstractC1680b.mo1getIntrinsicSizeNHjbRc())) {
            z2 = false;
        } else {
            z2 = true;
        }
        gVar.alpha = abstractC1680b;
        gVar.purple = true;
        gVar.red = this.purple;
        gVar.silver = this.red;
        gVar.teal = this.silver;
        gVar.white = this.teal;
        if (z2) {
            AbstractC2555o.golf(gVar).blue();
        }
        AbstractC2557q.india(gVar);
    }
}
