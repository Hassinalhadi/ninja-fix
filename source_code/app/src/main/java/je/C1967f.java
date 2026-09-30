package je;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: je.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1967f extends V {
    public final List purple;

    public C1967f(Class jClass) {
        Intrinsics.echo(jClass, "jClass");
        Method[] declaredMethods = jClass.getDeclaredMethods();
        Intrinsics.delta(declaredMethods, "jClass.declaredMethods");
        this.purple = ArraysKt.purple(declaredMethods, new Sb.k(17));
    }

    @Override // je.V
    public final String foxtrot() {
        return CollectionsKt.maroon(this.purple, "", "<init>(", ")V", C1963b.yellow, 24);
    }
}
