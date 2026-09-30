package s6;

import ke.InterfaceC2037e;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.f6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2653f6 {
    public static void alpha(InterfaceC2037e interfaceC2037e, Object[] args) {
        Intrinsics.echo(args, "args");
        if (AbstractC2662g6.alpha(interfaceC2037e) == args.length) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Callable expects ");
        sb2.append(AbstractC2662g6.alpha(interfaceC2037e));
        sb2.append(" arguments, but ");
        throw new IllegalArgumentException(androidx.appcompat.widget.P0.cyan(sb2, args.length, " were provided."));
    }

    public static final int bravo(int i4, int i5) {
        return (i4 >> i5) & 31;
    }
}
