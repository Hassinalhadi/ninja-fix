package ve;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: ve.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3191c extends Lambda implements Function1 {
    public static final C3191c alpha = new Lambda(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ParameterizedType it = (ParameterizedType) obj;
        Intrinsics.echo(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        Intrinsics.delta(actualTypeArguments, "it.actualTypeArguments");
        return ArraysKt.tango(actualTypeArguments);
    }
}
