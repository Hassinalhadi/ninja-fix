package ke;

import java.lang.reflect.Method;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2653f6;

/* loaded from: classes2.dex */
public final class s extends o {
    public final /* synthetic */ int golf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Method method, int i4) {
        super(method, false, 6);
        this.golf = i4;
        switch (i4) {
            case 1:
                Intrinsics.echo(method, "method");
                super(method, true, 4);
                return;
            case 2:
                Intrinsics.echo(method, "method");
                super(method, false, 6);
                return;
            default:
                Intrinsics.echo(method, "method");
                return;
        }
    }

    @Override // ke.o, ke.InterfaceC2037e
    public final Object call(Object[] args) {
        Object[] blue;
        Object[] blue2;
        switch (this.golf) {
            case 0:
                Intrinsics.echo(args, "args");
                AbstractC2653f6.alpha(this, args);
                Object obj = args[0];
                if (args.length <= 1) {
                    blue = new Object[0];
                } else {
                    blue = ArraysKt.blue(1, args, args.length);
                }
                return echo(blue, obj);
            case 1:
                Intrinsics.echo(args, "args");
                AbstractC2653f6.alpha(this, args);
                delta(ArraysKt.gold(args));
                if (args.length <= 1) {
                    blue2 = new Object[0];
                } else {
                    blue2 = ArraysKt.blue(1, args, args.length);
                }
                return echo(blue2, null);
            default:
                Intrinsics.echo(args, "args");
                AbstractC2653f6.alpha(this, args);
                return echo(args, null);
        }
    }
}
