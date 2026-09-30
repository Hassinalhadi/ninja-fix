package je;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2328d;

/* loaded from: classes2.dex */
public final class T extends V implements Function0 {
    public final Lambda purple;
    public volatile SoftReference red;

    /* JADX WARN: Multi-variable type inference failed */
    public T(InterfaceC2328d interfaceC2328d, Function0 function0) {
        if (function0 != 0) {
            this.red = null;
            this.purple = (Lambda) function0;
            if (interfaceC2328d != null) {
                this.red = new SoftReference(interfaceC2328d);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        SoftReference softReference = this.red;
        Object obj2 = V.alpha;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object invoke = this.purple.invoke();
        if (invoke != null) {
            obj2 = invoke;
        }
        this.red = new SoftReference(obj2);
        return invoke;
    }
}
