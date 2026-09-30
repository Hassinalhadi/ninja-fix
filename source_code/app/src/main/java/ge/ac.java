package ge;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class ac extends kotlin.jvm.internal.i implements Function1 {
    public static final ac alpha = new kotlin.jvm.internal.i(1, ah.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Type p02 = (Type) obj;
        Intrinsics.echo(p02, "p0");
        return ah.alpha(p02);
    }
}
