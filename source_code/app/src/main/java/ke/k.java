package ke;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class k extends t {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(Field field, boolean z2) {
        super(field, r0, r4, new Type[0]);
        Class<?> cls;
        Type genericType = field.getGenericType();
        Intrinsics.delta(genericType, "field.genericType");
        if (z2) {
            cls = field.getDeclaringClass();
        } else {
            cls = null;
        }
    }

    @Override // ke.InterfaceC2037e
    public Object call(Object[] args) {
        Object obj;
        Intrinsics.echo(args, "args");
        charlie(args);
        Field field = (Field) this.alpha;
        if (this.charlie != null) {
            obj = ArraysKt.fuchsia(args);
        } else {
            obj = null;
        }
        return field.get(obj);
    }
}
