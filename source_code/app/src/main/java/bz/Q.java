package bz;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Q implements InterfaceC0783h {
    public final i0 alpha;
    public final g0 bravo;
    public Object charlie;
    public Object delta;
    public r echo;
    public r foxtrot;
    public final r golf;
    public long hotel;
    public r india;

    public Q(InterfaceC0787l interfaceC0787l, g0 g0Var, Object obj, Object obj2, r rVar) {
        r charlie;
        this.alpha = interfaceC0787l.alpha(g0Var);
        this.bravo = g0Var;
        this.charlie = obj2;
        this.delta = obj;
        this.echo = (r) g0Var.alpha.invoke(obj);
        Function1 function1 = g0Var.alpha;
        this.foxtrot = (r) function1.invoke(obj2);
        if (rVar != null) {
            charlie = AbstractC0779d.echo(rVar);
        } else {
            charlie = ((r) function1.invoke(obj)).charlie();
        }
        this.golf = charlie;
        this.hotel = -1L;
    }

    @Override // bz.InterfaceC0783h
    public final boolean alpha() {
        return this.alpha.alpha();
    }

    @Override // bz.InterfaceC0783h
    public final long bravo() {
        if (this.hotel < 0) {
            this.hotel = this.alpha.amber(this.echo, this.foxtrot, this.golf);
        }
        return this.hotel;
    }

    @Override // bz.InterfaceC0783h
    public final g0 charlie() {
        return this.bravo;
    }

    @Override // bz.InterfaceC0783h
    public final r delta(long j5) {
        if (!ao.ad.charlie(this, j5)) {
            return this.alpha.gray(j5, this.echo, this.foxtrot, this.golf);
        }
        r rVar = this.india;
        if (rVar == null) {
            r delta = this.alpha.delta(this.echo, this.foxtrot, this.golf);
            this.india = delta;
            return delta;
        }
        return rVar;
    }

    @Override // bz.InterfaceC0783h
    public final /* synthetic */ boolean echo(long j5) {
        return ao.ad.charlie(this, j5);
    }

    @Override // bz.InterfaceC0783h
    public final Object foxtrot(long j5) {
        if (!ao.ad.charlie(this, j5)) {
            r foxtrot = this.alpha.foxtrot(j5, this.echo, this.foxtrot, this.golf);
            int bravo = foxtrot.bravo();
            for (int i4 = 0; i4 < bravo; i4++) {
                if (Float.isNaN(foxtrot.alpha(i4))) {
                    as.bravo("AnimationVector cannot contain a NaN. " + foxtrot + ". Animation: " + this + ", playTimeNanos: " + j5);
                }
            }
            return this.bravo.bravo.invoke(foxtrot);
        }
        return this.charlie;
    }

    @Override // bz.InterfaceC0783h
    public final Object golf() {
        return this.charlie;
    }

    public final void hotel(Object obj) {
        if (!Intrinsics.areEqual(obj, this.delta)) {
            this.delta = obj;
            this.echo = (r) this.bravo.alpha.invoke(obj);
            this.india = null;
            this.hotel = -1L;
        }
    }

    public final void india(Object obj) {
        if (!Intrinsics.areEqual(this.charlie, obj)) {
            this.charlie = obj;
            this.foxtrot = (r) this.bravo.alpha.invoke(obj);
            this.india = null;
            this.hotel = -1L;
        }
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.delta + " -> " + this.charlie + ",initial velocity: " + this.golf + ", duration: " + (bravo() / 1000000) + " ms,animationSpec: " + this.alpha;
    }
}
