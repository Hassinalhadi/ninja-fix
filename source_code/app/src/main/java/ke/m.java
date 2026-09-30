package ke;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m extends o implements InterfaceC2036d {
    @Override // ke.o, ke.InterfaceC2037e
    public final Object call(Object[] args) {
        Intrinsics.echo(args, "args");
        charlie(args);
        ((Field) this.alpha).set(null, ArraysKt.maroon(args));
        return Unit.INSTANCE;
    }
}
