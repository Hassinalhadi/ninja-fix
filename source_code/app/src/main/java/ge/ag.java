package ge;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class ag extends kotlin.jvm.internal.i implements Function1 {
    public static final ag alpha = new kotlin.jvm.internal.i(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class p02 = (Class) obj;
        Intrinsics.echo(p02, "p0");
        return p02.getComponentType();
    }
}
