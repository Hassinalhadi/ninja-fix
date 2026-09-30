package bx;

import androidx.compose.runtime.t0;
import bz.T;
import bz.U;
import bz.a0;
import kotlin.jvm.functions.Function0;
import q0.AbstractC2367C;

/* loaded from: classes3.dex */
public final class aw extends androidx.compose.foundation.layout.C {

    /* renamed from: a, reason: collision with root package name */
    public aj f3423a;

    /* renamed from: b, reason: collision with root package name */
    public long f3424b;

    /* renamed from: c, reason: collision with root package name */
    public T.f f3425c;

    /* renamed from: d, reason: collision with root package name */
    public final av f3426d;
    public a0 purple;
    public U red;
    public U silver;
    public ax teal;
    public az white;
    public Function0 yellow;

    public aw(a0 a0Var, U u4, U u10, ax axVar, az azVar, Function0 function0, aj ajVar) {
        super(1);
        this.purple = a0Var;
        this.red = u4;
        this.silver = u10;
        this.teal = axVar;
        this.white = azVar;
        this.yellow = function0;
        this.f3423a = ajVar;
        this.f3424b = androidx.compose.animation.c.alpha;
        Q0.b.bravo(0, 0, 15);
        this.f3426d = new av(this, 0);
        new av(this, 1);
    }

    public final T.f d() {
        T.f fVar;
        T.f fVar2;
        if (this.purple.foxtrot().bravo(ai.alpha, ai.purple)) {
            ac acVar = ((ay) this.teal).bravo.bravo;
            if (acVar != null && (fVar2 = acVar.alpha) != null) {
                return fVar2;
            }
            ac acVar2 = ((A) this.white).charlie.bravo;
            if (acVar2 == null) {
                return null;
            }
            return acVar2.alpha;
        }
        ac acVar3 = ((A) this.white).charlie.bravo;
        if (acVar3 != null && (fVar = acVar3.alpha) != null) {
            return fVar;
        }
        ac acVar4 = ((ay) this.teal).bravo.bravo;
        if (acVar4 == null) {
            return null;
        }
        return acVar4.alpha;
    }

    @Override // androidx.compose.foundation.layout.C, s0.ab
    /* renamed from: measure-3p2s80s */
    public final q0.aq mo0measure3p2s80s(q0.ar arVar, q0.ao aoVar, long j5) {
        T t5;
        T t10;
        a0.aw awVar;
        T t11;
        long j6;
        T t12;
        long j7;
        long j10;
        if (this.purple.alpha.L() == ((t0) this.purple.delta).getValue()) {
            this.f3425c = null;
        } else if (this.f3425c == null) {
            T.f d4 = d();
            if (d4 == null) {
                d4 = T.d.alpha;
            }
            this.f3425c = d4;
        }
        boolean ivory = arVar.ivory();
        kotlin.collections.t tVar = kotlin.collections.t.alpha;
        if (ivory) {
            AbstractC2367C victor = aoVar.victor(j5);
            long j11 = (victor.alpha << 32) | (victor.purple & 4294967295L);
            this.f3424b = j11;
            return arVar.papa((int) (j11 >> 32), (int) (4294967295L & j11), tVar, new U0.k(victor, 3));
        }
        if (((Boolean) this.yellow.invoke()).booleanValue()) {
            aj ajVar = this.f3423a;
            U u4 = ajVar.alpha;
            ax axVar = ajVar.delta;
            az azVar = ajVar.echo;
            if (u4 != null) {
                t5 = u4.alpha(new ak(axVar, azVar, 0), new ak(axVar, azVar, 1));
            } else {
                t5 = null;
            }
            U u10 = ajVar.bravo;
            if (u10 != null) {
                t10 = u10.alpha(new ak(axVar, azVar, 2), new ak(axVar, azVar, 3));
            } else {
                t10 = null;
            }
            if (ajVar.charlie.alpha.L() == ai.alpha) {
                E e = ((ay) axVar).bravo.charlie;
                if (e != null) {
                    awVar = new a0.aw(e.alpha);
                } else {
                    E e4 = ((A) azVar).charlie.charlie;
                    if (e4 != null) {
                        awVar = new a0.aw(e4.alpha);
                    }
                    awVar = null;
                }
            } else {
                E e5 = ((A) azVar).charlie.charlie;
                if (e5 != null) {
                    awVar = new a0.aw(e5.alpha);
                } else {
                    E e10 = ((ay) axVar).bravo.charlie;
                    if (e10 != null) {
                        awVar = new a0.aw(e10.alpha);
                    }
                    awVar = null;
                }
            }
            U u11 = ajVar.foxtrot;
            if (u11 != null) {
                t11 = u11.alpha(w.f3431d, new C1.av(awVar, axVar, azVar, 10));
            } else {
                t11 = null;
            }
            C1.av avVar = new C1.av(t5, t10, t11, 9);
            AbstractC2367C victor2 = aoVar.victor(j5);
            long j12 = (victor2.alpha << 32) | (victor2.purple & 4294967295L);
            if (!Q0.m.alpha(this.f3424b, androidx.compose.animation.c.alpha)) {
                j6 = this.f3424b;
            } else {
                j6 = j12;
            }
            U u12 = this.red;
            if (u12 != null) {
                t12 = u12.alpha(this.f3426d, new au(this, j6, 0));
            } else {
                t12 = null;
            }
            if (t12 != null) {
                j12 = ((Q0.m) t12.getValue()).alpha;
            }
            long delta = Q0.b.delta(j5, j12);
            U u13 = this.silver;
            if (u13 != null) {
                j7 = ((Q0.k) u13.alpha(w.f3435i, new au(this, j6, 1)).getValue()).alpha;
            } else {
                j7 = 0;
            }
            T.f fVar = this.f3425c;
            if (fVar != null) {
                j10 = fVar.alpha(j6, delta, Q0.n.alpha);
            } else {
                j10 = 0;
            }
            return arVar.papa((int) (delta >> 32), (int) (delta & 4294967295L), tVar, new at(victor2, Q0.k.charlie(j10, 0L), j7, avVar));
        }
        AbstractC2367C victor3 = aoVar.victor(j5);
        return arVar.papa(victor3.alpha, victor3.purple, tVar, new U0.k(victor3, 4));
    }

    @Override // T.r
    public final void onAttach() {
        super.onAttach();
        this.f3424b = androidx.compose.animation.c.alpha;
    }
}
