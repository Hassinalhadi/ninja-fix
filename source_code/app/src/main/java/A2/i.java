package A2;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class i extends Lambda implements Function1 {
    public static final i alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.echo(entry, "<name for destructuring parameter 0>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder beige = ao.ad.beige(str, " : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            Intrinsics.delta(value, "toString(this)");
        }
        beige.append(value);
        return beige.toString();
    }
}
