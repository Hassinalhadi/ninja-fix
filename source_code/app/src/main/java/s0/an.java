package s0;

import a0.AbstractC0362p;
import a0.AbstractC0367u;
import a0.C0352f;
import a0.C0354h;
import a0.InterfaceC0364r;
import c0.C0801a;
import d0.C1564b;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2627c7;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class an implements c0.d {
    public final c0.b alpha = new c0.b();
    public InterfaceC2558s purple;

    @Override // Q0.d
    public final float alpha() {
        return this.alpha.alpha();
    }

    @Override // c0.d
    public final void azure(C0352f c0352f, long j5, long j6, long j7, float f5, AbstractC0367u abstractC0367u, int i4) {
        this.alpha.azure(c0352f, j5, j6, j7, f5, abstractC0367u, i4);
    }

    @Override // Q0.d
    public final long beige(float f5) {
        return this.alpha.beige(f5);
    }

    @Override // c0.d
    public final long bravo() {
        return this.alpha.purple.oscar();
    }

    public final void charlie() {
        c0.b bVar = this.alpha;
        InterfaceC0364r mike = bVar.purple.mike();
        InterfaceC2554n interfaceC2554n = this.purple;
        if (interfaceC2554n != null) {
            T.r rVar = (T.r) interfaceC2554n;
            T.r child$ui_release = rVar.getNode().getChild$ui_release();
            if (child$ui_release != null && (child$ui_release.getAggregateChildKindSet$ui_release() & 4) != 0) {
                while (child$ui_release != null && (child$ui_release.getKindSet$ui_release() & 2) == 0) {
                    if ((child$ui_release.getKindSet$ui_release() & 4) != 0) {
                        break;
                    } else {
                        child$ui_release = child$ui_release.getChild$ui_release();
                    }
                }
            }
            child$ui_release = null;
            if (child$ui_release != null) {
                J.e eVar = null;
                while (child$ui_release != null) {
                    if (child$ui_release instanceof InterfaceC2558s) {
                        InterfaceC2558s interfaceC2558s = (InterfaceC2558s) child$ui_release;
                        C1564b c1564b = (C1564b) bVar.purple.purple;
                        L echo = AbstractC2555o.echo(interfaceC2558s, 4);
                        long bravo = AbstractC2627c7.bravo(echo.red);
                        al alVar = echo.f13251i;
                        alVar.getClass();
                        ((C2946x) ao.alpha(alVar)).getSharedDrawScope().delta(mike, bravo, echo, interfaceC2558s, c1564b);
                    } else if ((child$ui_release.getKindSet$ui_release() & 4) != 0 && (child$ui_release instanceof AbstractC2556p)) {
                        int i4 = 0;
                        for (T.r rVar2 = ((AbstractC2556p) child$ui_release).purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                            if ((rVar2.getKindSet$ui_release() & 4) != 0) {
                                i4++;
                                if (i4 == 1) {
                                    child$ui_release = rVar2;
                                } else {
                                    if (eVar == null) {
                                        eVar = new J.e(new T.r[16]);
                                    }
                                    if (child$ui_release != null) {
                                        eVar.bravo(child$ui_release);
                                        child$ui_release = null;
                                    }
                                    eVar.bravo(rVar2);
                                }
                            }
                        }
                        if (i4 == 1) {
                        }
                    }
                    child$ui_release = AbstractC2555o.bravo(eVar);
                }
                return;
            }
            L echo2 = AbstractC2555o.echo(interfaceC2554n, 4);
            if (echo2.A() == rVar.getNode()) {
                echo2 = echo2.f13252j;
                Intrinsics.checkNotNull(echo2);
            }
            echo2.O(mike, (C1564b) bVar.purple.purple);
            return;
        }
        throw Q0.c.xray("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
    }

    @Override // Q0.d
    public final float crimson(int i4) {
        return this.alpha.crimson(i4);
    }

    public final void delta(InterfaceC0364r interfaceC0364r, long j5, L l10, InterfaceC2558s interfaceC2558s, C1564b c1564b) {
        InterfaceC2558s interfaceC2558s2 = this.purple;
        this.purple = interfaceC2558s;
        Q0.n nVar = l10.f13251i.f13299r;
        c0.b bVar = this.alpha;
        J2.t tVar = bVar.purple;
        C0801a c0801a = ((c0.b) tVar.red).alpha;
        Q0.d dVar = c0801a.alpha;
        Q0.n nVar2 = c0801a.bravo;
        InterfaceC0364r mike = tVar.mike();
        J2.t tVar2 = bVar.purple;
        long oscar = tVar2.oscar();
        C1564b c1564b2 = (C1564b) tVar2.purple;
        tVar2.whiskey(l10);
        tVar2.xray(nVar);
        tVar2.victor(interfaceC0364r);
        tVar2.yankee(j5);
        tVar2.purple = c1564b;
        interfaceC0364r.golf();
        try {
            interfaceC2558s.jade(this);
            interfaceC0364r.november();
            tVar2.whiskey(dVar);
            tVar2.xray(nVar2);
            tVar2.victor(mike);
            tVar2.yankee(oscar);
            tVar2.purple = c1564b2;
            this.purple = interfaceC2558s2;
        } catch (Throwable th) {
            interfaceC0364r.november();
            tVar2.whiskey(dVar);
            tVar2.xray(nVar2);
            tVar2.victor(mike);
            tVar2.yankee(oscar);
            tVar2.purple = c1564b2;
            throw th;
        }
    }

    @Override // c0.d
    public final void echo(C0354h c0354h, long j5, float f5, c0.e eVar) {
        this.alpha.echo(c0354h, j5, f5, eVar);
    }

    @Override // c0.d
    public final void emerald(long j5, long j6, long j7, float f5, c0.e eVar, int i4) {
        this.alpha.emerald(j5, j6, j7, f5, eVar, i4);
    }

    public final void foxtrot(AbstractC0362p abstractC0362p, long j5, long j6, float f5, c0.e eVar) {
        c0.b bVar = this.alpha;
        int i4 = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        bVar.alpha.charlie.sierra(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat(i4), Float.intBitsToFloat(i5) + Float.intBitsToFloat((int) (j6 & 4294967295L)), bVar.delta(abstractC0362p, eVar, f5, null, 3, 1));
    }

    @Override // c0.d
    public final Q0.n getLayoutDirection() {
        return this.alpha.alpha.bravo;
    }

    @Override // Q0.d
    public final float gold(float f5) {
        return f5 / this.alpha.alpha();
    }

    public final void golf(AbstractC0362p abstractC0362p, long j5, long j6, long j7, float f5, c0.e eVar) {
        c0.b bVar = this.alpha;
        int i4 = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        bVar.alpha.charlie.charlie(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat(i4), Float.intBitsToFloat((int) (j6 & 4294967295L)) + Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), bVar.delta(abstractC0362p, eVar, f5, null, 3, 1));
    }

    @Override // Q0.d
    public final float indigo() {
        return this.alpha.indigo();
    }

    @Override // Q0.d
    public final float lavender(float f5) {
        return this.alpha.alpha() * f5;
    }

    @Override // c0.d
    public final J2.t lime() {
        return this.alpha.purple;
    }

    @Override // Q0.d
    public final long mike(long j5) {
        c0.b bVar = this.alpha;
        bVar.getClass();
        return Q0.c.echo(j5, bVar);
    }

    @Override // Q0.d
    public final int ochre(float f5) {
        c0.b bVar = this.alpha;
        bVar.getClass();
        return Q0.c.bravo(bVar, f5);
    }

    @Override // c0.d
    public final void olive(C0354h c0354h, AbstractC0362p abstractC0362p, float f5, c0.e eVar, int i4) {
        this.alpha.olive(c0354h, abstractC0362p, f5, eVar, i4);
    }

    @Override // c0.d
    public final long orange() {
        return this.alpha.orange();
    }

    @Override // Q0.d
    public final float quebec(long j5) {
        c0.b bVar = this.alpha;
        bVar.getClass();
        return Q0.c.delta(j5, bVar);
    }

    @Override // Q0.d
    public final long red(long j5) {
        c0.b bVar = this.alpha;
        bVar.getClass();
        return Q0.c.golf(j5, bVar);
    }

    @Override // Q0.d
    public final float teal(long j5) {
        c0.b bVar = this.alpha;
        bVar.getClass();
        return Q0.c.foxtrot(j5, bVar);
    }

    @Override // c0.d
    public final void uniform(long j5, float f5, long j6, c0.e eVar) {
        this.alpha.uniform(j5, f5, j6, eVar);
    }

    @Override // c0.d
    public final void whiskey(long j5, long j6, long j7, float f5, int i4) {
        this.alpha.whiskey(j5, j6, j7, f5, i4);
    }

    @Override // c0.d
    public final void white(long j5, float f5, float f10, long j6, long j7, float f11, c0.h hVar) {
        this.alpha.white(j5, f5, f10, j6, j7, f11, hVar);
    }

    @Override // c0.d
    public final void zulu(long j5, long j6, long j7, long j10, c0.e eVar) {
        this.alpha.zulu(j5, j6, j7, j10, eVar);
    }
}
