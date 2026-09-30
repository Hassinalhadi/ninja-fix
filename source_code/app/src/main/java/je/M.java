package je;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ve.AbstractC3192d;

/* loaded from: classes2.dex */
public final class M extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ N purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(N n5, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = n5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Type type;
        switch (this.alpha) {
            case 0:
                T t5 = this.purple.purple;
                if (t5 != null) {
                    type = (Type) t5.invoke();
                } else {
                    type = null;
                }
                Intrinsics.checkNotNull(type);
                return AbstractC3192d.charlie(type);
            default:
                N n5 = this.purple;
                return n5.golf(n5.alpha);
        }
    }
}
