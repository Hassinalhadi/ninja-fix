package jf;

import ef.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.B;
import pe.InterfaceC2332h;
import pe.aq;

/* renamed from: jf.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1988b extends Lambda implements Function1 {
    public static final C1988b alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        B it = (B) obj;
        Intrinsics.echo(it, "it");
        InterfaceC2332h kilo = it.green().kilo();
        boolean z2 = false;
        if (kilo != null && ((kilo instanceof s) || (kilo instanceof aq))) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
