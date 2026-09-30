package F;

import bz.C0778c;
import f.InterfaceC1673j;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;

/* loaded from: classes3.dex */
public final class L2 extends T.r implements s0.ab {
    public InterfaceC1673j alpha;
    public boolean purple;
    public boolean red;
    public C0778c silver;
    public C0778c teal;
    public float white;
    public float yellow;

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // s0.ab
    public final /* synthetic */ int maxIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.echo(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    public final /* synthetic */ int maxIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.hotel(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public final q0.aq mo0measure3p2s80s(q0.ar arVar, q0.ao aoVar, long j5) {
        boolean z2;
        float f5;
        float f10;
        boolean z10;
        Float f11;
        Float f12;
        boolean z11 = false;
        if (aoVar.delta(Q0.a.hotel(j5)) != 0 && aoVar.romeo(Q0.a.golf(j5)) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.red) {
            f5 = H.t.alpha;
        } else if (!z2 && !this.purple) {
            f5 = androidx.compose.material3.a.bravo;
        } else {
            f5 = androidx.compose.material3.a.alpha;
        }
        float lavender = arVar.lavender(f5);
        C0778c c0778c = this.teal;
        if (c0778c != null) {
            f10 = ((Number) c0778c.delta()).floatValue();
        } else {
            f10 = lavender;
        }
        int i4 = (int) f10;
        if (i4 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i4 >= 0) {
            z11 = true;
        }
        if (!(z10 & z11)) {
            Q0.j.alpha("width and height must be >= 0");
        }
        AbstractC2367C victor = aoVar.victor(Q0.b.hotel(i4, i4, i4, i4));
        float lavender2 = arVar.lavender((androidx.compose.material3.a.delta - arVar.gold(lavender)) / 2.0f);
        float lavender3 = arVar.lavender((androidx.compose.material3.a.charlie - androidx.compose.material3.a.alpha) - androidx.compose.material3.a.echo);
        boolean z12 = this.red;
        if (z12 && this.purple) {
            lavender2 = lavender3 - arVar.lavender(H.t.echo);
        } else if (z12 && !this.purple) {
            lavender2 = arVar.lavender(H.t.echo);
        } else if (this.purple) {
            lavender2 = lavender3;
        }
        C0778c c0778c2 = this.teal;
        if (c0778c2 != null) {
            f11 = (Float) ((androidx.compose.runtime.t0) c0778c2.echo).getValue();
        } else {
            f11 = null;
        }
        if (!Intrinsics.alpha(f11, lavender)) {
            vf.ad.zulu(getCoroutineScope(), null, null, new H2(this, lavender, null), 3);
        }
        C0778c c0778c3 = this.silver;
        if (c0778c3 != null) {
            f12 = (Float) ((androidx.compose.runtime.t0) c0778c3.echo).getValue();
        } else {
            f12 = null;
        }
        if (!Intrinsics.alpha(f12, lavender2)) {
            vf.ad.zulu(getCoroutineScope(), null, null, new I2(this, lavender2, null), 3);
        }
        if (Float.isNaN(this.yellow) && Float.isNaN(this.white)) {
            this.yellow = lavender;
            this.white = lavender2;
        }
        return arVar.papa(i4, i4, kotlin.collections.t.alpha, new J2(victor, this, lavender2));
    }

    @Override // s0.ab
    public final /* synthetic */ int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.kilo(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    public final /* synthetic */ int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.november(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // T.r
    public final void onAttach() {
        vf.ad.zulu(getCoroutineScope(), null, null, new K2(this, null), 3);
    }
}
