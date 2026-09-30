package ke;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: ke.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2035c extends Lambda implements Function1 {
    public static final C2035c alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String obj2;
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.echo(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            obj2 = Arrays.toString((boolean[]) value);
            Intrinsics.delta(obj2, "toString(this)");
        } else if (value instanceof char[]) {
            obj2 = Arrays.toString((char[]) value);
            Intrinsics.delta(obj2, "toString(this)");
        } else if (value instanceof byte[]) {
            obj2 = Arrays.toString((byte[]) value);
            Intrinsics.delta(obj2, "toString(this)");
        } else if (value instanceof short[]) {
            obj2 = Arrays.toString((short[]) value);
            Intrinsics.delta(obj2, "toString(this)");
        } else if (value instanceof int[]) {
            obj2 = Arrays.toString((int[]) value);
            Intrinsics.delta(obj2, "toString(this)");
        } else if (value instanceof float[]) {
            obj2 = Arrays.toString((float[]) value);
            Intrinsics.delta(obj2, "toString(this)");
        } else if (value instanceof long[]) {
            obj2 = Arrays.toString((long[]) value);
            Intrinsics.delta(obj2, "toString(this)");
        } else if (value instanceof double[]) {
            obj2 = Arrays.toString((double[]) value);
            Intrinsics.delta(obj2, "toString(this)");
        } else if (value instanceof Object[]) {
            obj2 = Arrays.toString((Object[]) value);
            Intrinsics.delta(obj2, "toString(this)");
        } else {
            obj2 = value.toString();
        }
        return str + '=' + obj2;
    }
}
