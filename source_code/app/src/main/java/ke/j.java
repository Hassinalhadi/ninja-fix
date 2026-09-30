package ke;

import java.lang.reflect.Field;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2653f6;

/* loaded from: classes2.dex */
public final class j extends k {
    public final /* synthetic */ int echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Field field, boolean z2, int i4) {
        super(field, z2);
        this.echo = i4;
    }

    @Override // ke.t
    public void charlie(Object[] args) {
        switch (this.echo) {
            case 1:
                Intrinsics.echo(args, "args");
                AbstractC2653f6.alpha(this, args);
                delta(ArraysKt.gold(args));
                return;
            default:
                super.charlie(args);
                return;
        }
    }
}
