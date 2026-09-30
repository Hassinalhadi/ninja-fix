package kotlin.reflect.jvm.internal.impl.types;

import gf.C1791f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u extends s implements A {
    public final s silver;
    public final y teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s origin, y enhancement) {
        super(origin.purple, origin.red);
        Intrinsics.echo(origin, "origin");
        Intrinsics.echo(enhancement, "enhancement");
        this.silver = origin;
        this.teal = enhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A
    public final B crimson() {
        return this.silver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    public final ae d() {
        return this.silver.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    public final String f(Pe.t tVar, Pe.t tVar2) {
        Pe.z zVar = tVar2.delta;
        zVar.getClass();
        if (((Boolean) zVar.mike.alpha(Pe.z.ochre[11], zVar)).booleanValue()) {
            return tVar.orange(this.teal);
        }
        return this.silver.f(tVar, tVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A
    public final y foxtrot() {
        return this.teal;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final y ivory(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        s type = this.silver;
        Intrinsics.echo(type, "type");
        y type2 = this.teal;
        Intrinsics.echo(type2, "type");
        return new u(type, type2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.B
    public final B pink(boolean z2) {
        return c.amber(this.silver.pink(z2), this.teal.ochre().pink(z2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.B
    public final B purple(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        s type = this.silver;
        Intrinsics.echo(type, "type");
        y type2 = this.teal;
        Intrinsics.echo(type2, "type");
        return new u(type, type2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.s
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.teal + ")] " + this.silver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.B
    public final B white(al newAttributes) {
        Intrinsics.echo(newAttributes, "newAttributes");
        return c.amber(this.silver.white(newAttributes), this.teal);
    }
}
