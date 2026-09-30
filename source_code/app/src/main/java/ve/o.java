package ve;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class o extends Lambda implements Function1 {
    public static final o alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String simpleName = ((Class) obj).getSimpleName();
        if (!Ne.f.foxtrot(simpleName)) {
            simpleName = null;
        }
        if (simpleName == null) {
            return null;
        }
        return Ne.f.echo(simpleName);
    }
}
