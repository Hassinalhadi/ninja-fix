package je;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: je.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1973l extends V {
    public final Method purple;
    public final Method red;

    public C1973l(Method getterMethod, Method method) {
        Intrinsics.echo(getterMethod, "getterMethod");
        this.purple = getterMethod;
        this.red = method;
    }

    @Override // je.V
    public final String foxtrot() {
        return V.delta(this.purple);
    }
}
