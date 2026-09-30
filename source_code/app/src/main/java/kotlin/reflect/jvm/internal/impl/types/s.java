package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class s extends B implements p000if.c {
    public final ae purple;
    public final ae red;

    public s(ae lowerBound, ae upperBound) {
        Intrinsics.echo(lowerBound, "lowerBound");
        Intrinsics.echo(upperBound, "upperBound");
        this.purple = lowerBound;
        this.red = upperBound;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final List cyan() {
        return d().cyan();
    }

    public abstract ae d();

    public abstract String f(Pe.t tVar, Pe.t tVar2);

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final al gold() {
        return d().gold();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final ap green() {
        return d().green();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final boolean indigo() {
        return d().indigo();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public Xe.n olive() {
        return d().olive();
    }

    public String toString() {
        return Pe.o.charlie.orange(this);
    }
}
