package Se;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import se.z;

/* loaded from: classes2.dex */
public final class h {
    public static final h alpha = new Object();

    public final b alpha(List list, z zVar, me.j jVar) {
        List z2 = CollectionsKt.z(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = z2.iterator();
        while (it.hasNext()) {
            g bravo = bravo(it.next(), null);
            if (bravo != null) {
                arrayList.add(bravo);
            }
        }
        if (zVar != null) {
            return new w(arrayList, zVar.silver.papa(jVar));
        }
        return new b(arrayList, new A0.p(16, jVar));
    }

    public final g bravo(Object obj, z zVar) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new u(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new k(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new s(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            ch.getClass();
            return new g(ch);
        }
        if (obj instanceof Float) {
            return new c(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new c(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            return new c(bool);
        }
        if (obj instanceof String) {
            String value = (String) obj;
            Intrinsics.echo(value, "value");
            return new g(value);
        }
        if (obj instanceof byte[]) {
            return alpha(ArraysKt.red((byte[]) obj), zVar, me.j.BYTE);
        }
        if (obj instanceof short[]) {
            return alpha(ArraysKt.c((short[]) obj), zVar, me.j.SHORT);
        }
        if (obj instanceof int[]) {
            return alpha(ArraysKt.yellow((int[]) obj), zVar, me.j.INT);
        }
        if (obj instanceof long[]) {
            return alpha(ArraysKt.a((long[]) obj), zVar, me.j.LONG);
        }
        if (obj instanceof char[]) {
            return alpha(ArraysKt.silver((char[]) obj), zVar, me.j.CHAR);
        }
        if (obj instanceof float[]) {
            return alpha(ArraysKt.white((float[]) obj), zVar, me.j.FLOAT);
        }
        if (obj instanceof double[]) {
            return alpha(ArraysKt.teal((double[]) obj), zVar, me.j.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return alpha(ArraysKt.d((boolean[]) obj), zVar, me.j.BOOLEAN);
        }
        if (obj != null) {
            return null;
        }
        return new g(null);
    }
}
