package kotlin.reflect.jvm.internal.impl.types;

import gf.C1791f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import s6.O5;

/* loaded from: classes2.dex */
public final class t extends s implements m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ae lowerBound, ae upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.echo(lowerBound, "lowerBound");
        Intrinsics.echo(upperBound, "upperBound");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    public final ae d() {
        return this.purple;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    public final String f(Pe.t tVar, Pe.t tVar2) {
        boolean november = tVar2.delta.november();
        ae aeVar = this.red;
        ae aeVar2 = this.purple;
        if (november) {
            return "(" + tVar.orange(aeVar2) + ".." + tVar.orange(aeVar) + ')';
        }
        return tVar.bronze(tVar.orange(aeVar2), tVar.orange(aeVar), O5.echo(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    /* renamed from: ivory */
    public final y purple(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        ae type = this.purple;
        Intrinsics.echo(type, "type");
        ae type2 = this.red;
        Intrinsics.echo(type2, "type");
        return new t(type, type2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.B
    public final B pink(boolean z2) {
        return ab.alpha(this.purple.pink(z2), this.red.pink(z2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.B
    public final B purple(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        ae type = this.purple;
        Intrinsics.echo(type, "type");
        ae type2 = this.red;
        Intrinsics.echo(type2, "type");
        return new t(type, type2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m
    public final B sierra(y replacement) {
        B alpha;
        Intrinsics.echo(replacement, "replacement");
        B ochre = replacement.ochre();
        if (ochre instanceof s) {
            alpha = ochre;
        } else if (ochre instanceof ae) {
            ae aeVar = (ae) ochre;
            alpha = ab.alpha(aeVar, aeVar.pink(true));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return c.golf(alpha, ochre);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    public final String toString() {
        return "(" + this.purple + ".." + this.red + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m
    public final boolean victor() {
        ae aeVar = this.purple;
        if ((aeVar.green().kilo() instanceof pe.aq) && Intrinsics.areEqual(aeVar.green(), this.red.green())) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.B
    public final B white(al newAttributes) {
        Intrinsics.echo(newAttributes, "newAttributes");
        return ab.alpha(this.purple.white(newAttributes), this.red.white(newAttributes));
    }
}
