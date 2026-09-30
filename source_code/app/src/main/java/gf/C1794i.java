package gf;

import ef.C1656d;
import java.util.Collection;
import java.util.List;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.y;
import me.AbstractC2120h;
import pe.InterfaceC2332h;
import pe.aq;
import s6.O5;

/* renamed from: gf.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1794i implements Re.b {
    public final as alpha;
    public Function0 bravo;
    public final C1794i charlie;
    public final aq delta;
    public final Object echo;

    public /* synthetic */ C1794i(as asVar, C1656d c1656d, aq aqVar, int i4) {
        this(asVar, (i4 & 2) != 0 ? null : c1656d, (C1794i) null, (i4 & 8) != 0 ? null : aqVar);
    }

    @Override // Re.b
    public final as alpha() {
        return this.alpha;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(C1794i.class, cls)) {
            return false;
        }
        Intrinsics.charlie(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C1794i c1794i = (C1794i) obj;
        C1794i c1794i2 = this.charlie;
        if (c1794i2 == null) {
            c1794i2 = this;
        }
        C1794i c1794i3 = c1794i.charlie;
        if (c1794i3 != null) {
            c1794i = c1794i3;
        }
        if (c1794i2 == c1794i) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final List getParameters() {
        return CollectionsKt.emptyList();
    }

    public final int hashCode() {
        C1794i c1794i = this.charlie;
        if (c1794i != null) {
            return c1794i.hashCode();
        }
        return super.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final AbstractC2120h juliet() {
        y bravo = this.alpha.bravo();
        Intrinsics.delta(bravo, "projection.type");
        return O5.echo(bravo);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final InterfaceC2332h kilo() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final Collection lima() {
        List list = (List) this.echo.getValue();
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ap
    public final boolean mike() {
        return false;
    }

    public final String toString() {
        return "CapturedType(" + this.alpha + ')';
    }

    public C1794i(as projection, Function0 function0, C1794i c1794i, aq aqVar) {
        Intrinsics.echo(projection, "projection");
        this.alpha = projection;
        this.bravo = function0;
        this.charlie = c1794i;
        this.delta = aqVar;
        this.echo = LazyKt.alpha(kotlin.i.alpha, new Xe.s(28, this));
    }
}
