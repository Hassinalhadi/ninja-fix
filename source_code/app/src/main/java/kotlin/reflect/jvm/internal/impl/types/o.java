package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o extends p implements m, p000if.d {
    public final ae purple;
    public final boolean red;

    public o(ae aeVar, boolean z2) {
        this.purple = aeVar;
        this.red = z2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: d */
    public final ae pink(boolean z2) {
        if (z2) {
            return this.purple.pink(z2);
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    /* renamed from: f */
    public final ae white(al newAttributes) {
        Intrinsics.echo(newAttributes, "newAttributes");
        return new o(this.purple.white(newAttributes), this.red);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p, kotlin.reflect.jvm.internal.impl.types.y
    public final boolean indigo() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    public final ae m() {
        return this.purple;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m
    public final B sierra(y replacement) {
        Intrinsics.echo(replacement, "replacement");
        return c.lima(replacement.ochre(), this.red);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ae
    public final String toString() {
        return this.purple + " & Any";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    public final p u(ae aeVar) {
        return new o(aeVar, this.red);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m
    public final boolean victor() {
        ae aeVar = this.purple;
        aeVar.green();
        if (aeVar.green().kilo() instanceof pe.aq) {
            return true;
        }
        return false;
    }
}
