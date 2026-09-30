package ke;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y implements InterfaceC2037e {
    public static final y alpha = new Object();

    @Override // ke.InterfaceC2037e
    public final List alpha() {
        return CollectionsKt.emptyList();
    }

    @Override // ke.InterfaceC2037e
    public final /* bridge */ /* synthetic */ Member bravo() {
        return null;
    }

    @Override // ke.InterfaceC2037e
    public final Object call(Object[] args) {
        Intrinsics.echo(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // ke.InterfaceC2037e
    public final Type getReturnType() {
        Class TYPE = Void.TYPE;
        Intrinsics.delta(TYPE, "TYPE");
        return TYPE;
    }
}
