package je;

import java.lang.reflect.Constructor;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: je.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1968g extends V {
    public final Constructor purple;

    public C1968g(Constructor constructor) {
        Intrinsics.echo(constructor, "constructor");
        this.purple = constructor;
    }

    @Override // je.V
    public final String foxtrot() {
        Class<?>[] parameterTypes = this.purple.getParameterTypes();
        Intrinsics.delta(parameterTypes, "constructor.parameterTypes");
        return ArraysKt.magenta(parameterTypes, "", "<init>(", ")V", C1963b.f12908c, 24);
    }
}
