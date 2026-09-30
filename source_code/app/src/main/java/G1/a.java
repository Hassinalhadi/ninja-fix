package G1;

import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class a extends Lambda implements Function1 {
    public static final a alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.echo(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            valueOf = ArraysKt.lime((byte[]) value, ", ", 0, null, 56);
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((f) entry.getKey()).alpha + " = " + valueOf;
    }
}
