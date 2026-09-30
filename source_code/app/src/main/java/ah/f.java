package ah;

import de.AbstractC1618a;
import de.AbstractC1621d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class f extends Lambda implements Function0 {
    public static final f alpha = new Lambda(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC1618a abstractC1618a = AbstractC1621d.alpha;
        return Integer.valueOf(AbstractC1621d.alpha.foxtrot().nextInt(2147418112) + 65536);
    }
}
