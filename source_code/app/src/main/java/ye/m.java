package ye;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import se.aq;

/* loaded from: classes2.dex */
public final class m extends Lambda implements Function1 {
    public static final m alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((aq) obj).getType();
    }
}
