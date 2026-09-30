package androidx.compose.animation;

import T.r;
import bx.aj;
import bx.aw;
import bx.ax;
import bx.az;
import bz.U;
import bz.a0;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Ls0/F;", "Lbx/aw;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EnterExitTransitionElement extends F {
    public final a0 alpha;
    public final U purple;
    public final U red;
    public final ax silver;
    public final az teal;
    public final Function0 white;
    public final aj yellow;

    public EnterExitTransitionElement(a0 a0Var, U u4, U u10, ax axVar, az azVar, Function0 function0, aj ajVar) {
        this.alpha = a0Var;
        this.purple = u4;
        this.red = u10;
        this.silver = axVar;
        this.teal = azVar;
        this.white = function0;
        this.yellow = ajVar;
    }

    @Override // s0.F
    public final r create() {
        return new aw(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return Intrinsics.areEqual(this.alpha, enterExitTransitionElement.alpha) && Intrinsics.areEqual(this.purple, enterExitTransitionElement.purple) && Intrinsics.areEqual(this.red, enterExitTransitionElement.red) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.silver, enterExitTransitionElement.silver) && Intrinsics.areEqual(this.teal, enterExitTransitionElement.teal) && Intrinsics.areEqual(this.white, enterExitTransitionElement.white) && Intrinsics.areEqual(this.yellow, enterExitTransitionElement.yellow);
    }

    public final int hashCode() {
        int hashCode = this.alpha.hashCode() * 31;
        U u4 = this.purple;
        int hashCode2 = (hashCode + (u4 == null ? 0 : u4.hashCode())) * 31;
        U u10 = this.red;
        return this.yellow.hashCode() + ((this.white.hashCode() + ((this.teal.hashCode() + ((this.silver.hashCode() + ((hashCode2 + (u10 != null ? u10.hashCode() : 0)) * 961)) * 31)) * 31)) * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "enterExitTransition";
        a0 a0Var = this.alpha;
        o oVar = c2915g0.charlie;
        oVar.bravo(a0Var, "transition");
        oVar.bravo(this.purple, "sizeAnimation");
        oVar.bravo(this.red, "offsetAnimation");
        oVar.bravo(null, "slideAnimation");
        oVar.bravo(this.silver, "enter");
        oVar.bravo(this.teal, "exit");
        oVar.bravo(this.yellow, "graphicsLayerBlock");
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.alpha + ", sizeAnimation=" + this.purple + ", offsetAnimation=" + this.red + ", slideAnimation=null, enter=" + this.silver + ", exit=" + this.teal + ", isEnabled=" + this.white + ", graphicsLayerBlock=" + this.yellow + ')';
    }

    @Override // s0.F
    public final void update(r rVar) {
        aw awVar = (aw) rVar;
        awVar.purple = this.alpha;
        awVar.red = this.purple;
        awVar.silver = this.red;
        awVar.teal = this.silver;
        awVar.white = this.teal;
        awVar.yellow = this.white;
        awVar.f3423a = this.yellow;
    }
}
