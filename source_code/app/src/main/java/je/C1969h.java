package je;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: je.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1969h extends V {
    public final Method purple;

    public C1969h(Method method) {
        Intrinsics.echo(method, "method");
        this.purple = method;
    }

    @Override // je.V
    public final String foxtrot() {
        return V.delta(this.purple);
    }
}
