package ke;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2653f6;

/* loaded from: classes2.dex */
public final class v extends x implements InterfaceC2036d {
    public final Object delta;

    public v(Method method, Object obj) {
        super(method, CollectionsKt.emptyList());
        this.delta = obj;
    }

    @Override // ke.InterfaceC2037e
    public final Object call(Object[] args) {
        Intrinsics.echo(args, "args");
        AbstractC2653f6.alpha(this, args);
        return this.alpha.invoke(this.delta, Arrays.copyOf(args, args.length));
    }
}
