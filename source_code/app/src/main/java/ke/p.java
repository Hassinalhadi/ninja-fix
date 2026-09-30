package ke;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2653f6;

/* loaded from: classes2.dex */
public final class p extends o implements InterfaceC2036d {
    public final Object golf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Method method, Object obj) {
        super(method, false, 4);
        Intrinsics.echo(method, "method");
        this.golf = obj;
    }

    @Override // ke.o, ke.InterfaceC2037e
    public final Object call(Object[] args) {
        Intrinsics.echo(args, "args");
        AbstractC2653f6.alpha(this, args);
        return echo(args, this.golf);
    }
}
