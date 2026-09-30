package androidx.compose.foundation.text.input.internal;

import I0.aa;
import I0.ah;
import I0.l;
import I0.t;
import T.r;
import Y.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n.ax;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.F;
import t0.C2915g0;
import w.C3228f;
import w.C3230h;
import y.C3344D;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "Ls0/F;", "Lw/h;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CoreTextFieldSemanticsModifier extends F {

    /* renamed from: a, reason: collision with root package name */
    public final C3344D f2971a;
    public final ah alpha;

    /* renamed from: b, reason: collision with root package name */
    public final l f2972b;

    /* renamed from: c, reason: collision with root package name */
    public final s f2973c;
    public final aa purple;
    public final ax red;
    public final boolean silver;
    public final boolean teal;
    public final boolean white;
    public final t yellow;

    public CoreTextFieldSemanticsModifier(ah ahVar, aa aaVar, ax axVar, boolean z2, boolean z10, boolean z11, t tVar, C3344D c3344d, l lVar, s sVar) {
        this.alpha = ahVar;
        this.purple = aaVar;
        this.red = axVar;
        this.silver = z2;
        this.teal = z10;
        this.white = z11;
        this.yellow = tVar;
        this.f2971a = c3344d;
        this.f2972b = lVar;
        this.f2973c = sVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w.h, T.r, s0.p] */
    @Override // s0.F
    public final r create() {
        ?? abstractC2556p = new AbstractC2556p();
        abstractC2556p.red = this.alpha;
        abstractC2556p.silver = this.purple;
        abstractC2556p.teal = this.red;
        abstractC2556p.white = this.silver;
        abstractC2556p.yellow = this.teal;
        abstractC2556p.f14002a = this.white;
        abstractC2556p.f14003b = this.yellow;
        C3344D c3344d = this.f2971a;
        abstractC2556p.f14004c = c3344d;
        abstractC2556p.f14005d = this.f2972b;
        abstractC2556p.e = this.f2973c;
        c3344d.golf = new C3228f(abstractC2556p, 4);
        return abstractC2556p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return Intrinsics.areEqual(this.alpha, coreTextFieldSemanticsModifier.alpha) && Intrinsics.areEqual(this.purple, coreTextFieldSemanticsModifier.purple) && Intrinsics.areEqual(this.red, coreTextFieldSemanticsModifier.red) && this.silver == coreTextFieldSemanticsModifier.silver && this.teal == coreTextFieldSemanticsModifier.teal && this.white == coreTextFieldSemanticsModifier.white && Intrinsics.areEqual(this.yellow, coreTextFieldSemanticsModifier.yellow) && Intrinsics.areEqual(this.f2971a, coreTextFieldSemanticsModifier.f2971a) && Intrinsics.areEqual(this.f2972b, coreTextFieldSemanticsModifier.f2972b) && Intrinsics.areEqual(this.f2973c, coreTextFieldSemanticsModifier.f2973c);
    }

    public final int hashCode() {
        int i4;
        int i5;
        int hashCode = (this.red.hashCode() + ((this.purple.hashCode() + (this.alpha.hashCode() * 31)) * 31)) * 31;
        int i10 = 1237;
        if (this.silver) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i11 = (hashCode + i4) * 31;
        if (this.teal) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i12 = (i11 + i5) * 31;
        if (this.white) {
            i10 = 1231;
        }
        return this.f2973c.hashCode() + ((this.f2972b.hashCode() + ((this.f2971a.hashCode() + ((this.yellow.hashCode() + ((i12 + i10) * 31)) * 31)) * 31)) * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.alpha + ", value=" + this.purple + ", state=" + this.red + ", readOnly=" + this.silver + ", enabled=" + this.teal + ", isPassword=" + this.white + ", offsetMapping=" + this.yellow + ", manager=" + this.f2971a + ", imeOptions=" + this.f2972b + ", focusRequester=" + this.f2973c + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (D0.am.charlie(r2.bravo) != false) goto L22;
     */
    @Override // s0.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void update(r rVar) {
        boolean z2;
        C3230h c3230h = (C3230h) rVar;
        boolean z10 = c3230h.yellow;
        boolean z11 = false;
        if (z10 && !c3230h.white) {
            z2 = true;
        } else {
            z2 = false;
        }
        l lVar = c3230h.f14005d;
        C3344D c3344d = c3230h.f14004c;
        boolean z12 = this.silver;
        boolean z13 = this.teal;
        if (z13 && !z12) {
            z11 = true;
        }
        c3230h.red = this.alpha;
        aa aaVar = this.purple;
        c3230h.silver = aaVar;
        c3230h.teal = this.red;
        c3230h.white = z12;
        c3230h.yellow = z13;
        c3230h.f14003b = this.yellow;
        C3344D c3344d2 = this.f2971a;
        c3230h.f14004c = c3344d2;
        l lVar2 = this.f2972b;
        c3230h.f14005d = lVar2;
        c3230h.e = this.f2973c;
        if (z13 == z10 && z11 == z2 && Intrinsics.areEqual(lVar2, lVar)) {
            if (this.white == c3230h.f14002a) {
            }
        }
        AbstractC2555o.golf(c3230h).coral();
        if (!Intrinsics.areEqual(c3344d2, c3344d)) {
            c3344d2.golf = new C3228f(c3230h, 0);
        }
    }
}
