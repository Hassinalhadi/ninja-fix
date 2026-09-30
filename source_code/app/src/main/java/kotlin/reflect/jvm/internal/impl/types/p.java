package kotlin.reflect.jvm.internal.impl.types;

import gf.C1791f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class p extends ae {
    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final List cyan() {
        return m().cyan();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public al gold() {
        return m().gold();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final ap green() {
        return m().green();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public boolean indigo() {
        return m().indigo();
    }

    public abstract ae m();

    @Override // kotlin.reflect.jvm.internal.impl.types.y
    public final Xe.n olive() {
        return m().olive();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.B
    /* renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ae purple(C1791f kotlinTypeRefiner) {
        Intrinsics.echo(kotlinTypeRefiner, "kotlinTypeRefiner");
        ae type = m();
        Intrinsics.echo(type, "type");
        return u(type);
    }

    public abstract p u(ae aeVar);
}
