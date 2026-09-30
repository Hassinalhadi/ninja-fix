package kotlin.reflect.jvm.internal.impl.types;

import gf.C1791f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ah extends p implements A {
    public final ae purple;
    public final y red;

    public ah(ae delegate, y enhancement) {
        Intrinsics.echo(delegate, "delegate");
        Intrinsics.echo(enhancement, "enhancement");
        this.purple = delegate;
        this.red = enhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p, kotlin.reflect.jvm.internal.impl.types.B
    /* renamed from: D, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ah purple(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        ae type = this.purple;
        Intrinsics.echo(type, "type");
        y type2 = this.red;
        Intrinsics.echo(type2, "type");
        return new ah(type, type2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A
    public final B crimson() {
        return this.purple;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: d */
    public final ae pink(boolean z2) {
        B amber = c.amber(this.purple.pink(z2), this.red.ochre().pink(z2));
        Intrinsics.charlie(amber, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (ae) amber;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: f */
    public final ae white(al newAttributes) {
        Intrinsics.echo(newAttributes, "newAttributes");
        B amber = c.amber(this.purple.white(newAttributes), this.red);
        Intrinsics.charlie(amber, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (ae) amber;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A
    public final y foxtrot() {
        return this.red;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    public final ae m() {
        return this.purple;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.red + ")] " + this.purple;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    public final p u(ae aeVar) {
        return new ah(aeVar, this.red);
    }
}
