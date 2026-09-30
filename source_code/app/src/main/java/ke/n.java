package ke;

import java.lang.reflect.Field;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n extends o {
    public final /* synthetic */ int golf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Field field, boolean z2, boolean z10, int i4) {
        super(field, z2, z10);
        this.golf = i4;
    }

    @Override // ke.o, ke.t
    public void charlie(Object[] args) {
        switch (this.golf) {
            case 1:
                Intrinsics.echo(args, "args");
                super.charlie(args);
                delta(ArraysKt.gold(args));
                return;
            default:
                super.charlie(args);
                return;
        }
    }
}
