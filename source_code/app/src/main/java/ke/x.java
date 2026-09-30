package ke;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class x implements InterfaceC2037e {
    public final Method alpha;
    public final List bravo;
    public final Class charlie;

    public x(Method method, List list) {
        this.alpha = method;
        this.bravo = list;
        Class<?> returnType = method.getReturnType();
        Intrinsics.delta(returnType, "unboxMethod.returnType");
        this.charlie = returnType;
    }

    @Override // ke.InterfaceC2037e
    public final List alpha() {
        return this.bravo;
    }

    @Override // ke.InterfaceC2037e
    public final /* bridge */ /* synthetic */ Member bravo() {
        return null;
    }

    @Override // ke.InterfaceC2037e
    public final Type getReturnType() {
        return this.charlie;
    }
}
