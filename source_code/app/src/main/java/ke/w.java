package ke;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2653f6;

/* loaded from: classes2.dex */
public final class w extends x {
    @Override // ke.InterfaceC2037e
    public final Object call(Object[] args) {
        Object[] blue;
        Intrinsics.echo(args, "args");
        AbstractC2653f6.alpha(this, args);
        Object obj = args[0];
        if (args.length <= 1) {
            blue = new Object[0];
        } else {
            blue = ArraysKt.blue(1, args, args.length);
        }
        return this.alpha.invoke(obj, Arrays.copyOf(blue, blue.length));
    }
}
