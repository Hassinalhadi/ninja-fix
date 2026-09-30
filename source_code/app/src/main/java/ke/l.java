package ke;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l extends o implements InterfaceC2036d {
    public final Object golf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Field field, boolean z2, Object obj) {
        super(field, z2, false);
        Intrinsics.echo(field, "field");
        this.golf = obj;
    }

    @Override // ke.o, ke.InterfaceC2037e
    public final Object call(Object[] args) {
        Intrinsics.echo(args, "args");
        charlie(args);
        ((Field) this.alpha).set(this.golf, ArraysKt.fuchsia(args));
        return Unit.INSTANCE;
    }
}
