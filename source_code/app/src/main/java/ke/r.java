package ke;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2653f6;

/* loaded from: classes2.dex */
public final class r extends o implements InterfaceC2036d {
    public final Object golf;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(Method method, Object obj) {
        super(method, false, (Type[]) r0);
        Object blue;
        Intrinsics.echo(method, "method");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Intrinsics.delta(genericParameterTypes, "method.genericParameterTypes");
        if (genericParameterTypes.length <= 1) {
            blue = new Type[0];
        } else {
            blue = ArraysKt.blue(1, genericParameterTypes, genericParameterTypes.length);
        }
        this.golf = obj;
    }

    @Override // ke.o, ke.InterfaceC2037e
    public final Object call(Object[] args) {
        Intrinsics.echo(args, "args");
        AbstractC2653f6.alpha(this, args);
        T3.b bVar = new T3.b(2);
        bVar.alpha(this.golf);
        bVar.bravo(args);
        ArrayList arrayList = bVar.alpha;
        return echo(arrayList.toArray(new Object[arrayList.size()]), null);
    }
}
