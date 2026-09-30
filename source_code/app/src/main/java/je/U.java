package je;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class U extends V {
    public final Lambda purple;
    public volatile Object red = null;

    /* JADX WARN: Multi-variable type inference failed */
    public U(Function0 function0) {
        this.purple = (Lambda) function0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    public final Object invoke() {
        Object obj = this.red;
        Object obj2 = V.alpha;
        if (obj != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object invoke = this.purple.invoke();
        if (invoke != null) {
            obj2 = invoke;
        }
        this.red = obj2;
        return invoke;
    }
}
