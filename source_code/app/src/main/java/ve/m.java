package ve;

import ge.InterfaceC1774f;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.h implements Function1 {
    public static final m alpha = new kotlin.jvm.internal.h(1);

    @Override // kotlin.jvm.internal.c, ge.InterfaceC1771c
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC1774f getOwner() {
        return kotlin.jvm.internal.u.alpha.bravo(w.class);
    }

    @Override // kotlin.jvm.internal.c
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Field p02 = (Field) obj;
        Intrinsics.echo(p02, "p0");
        return new w(p02);
    }
}
