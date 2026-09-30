package io.ktor.utils.io;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class al extends kotlin.jvm.internal.i implements Function1 {
    public static final al alpha = new kotlin.jvm.internal.i(1, ClosedByteChannelException.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new ClosedByteChannelException((Throwable) obj);
    }
}
