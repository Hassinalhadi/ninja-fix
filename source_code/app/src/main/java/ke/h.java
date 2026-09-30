package ke;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2653f6;

/* loaded from: classes2.dex */
public final class h extends k implements InterfaceC2036d {
    public final Object echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Field field, Object obj) {
        super(field, false);
        Intrinsics.echo(field, "field");
        this.echo = obj;
    }

    @Override // ke.k, ke.InterfaceC2037e
    public final Object call(Object[] args) {
        Intrinsics.echo(args, "args");
        AbstractC2653f6.alpha(this, args);
        return ((Field) this.alpha).get(this.echo);
    }
}
