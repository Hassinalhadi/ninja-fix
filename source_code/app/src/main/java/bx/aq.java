package bx;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class aq extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aq(int i4, Function1 function1) {
        super(1);
        this.alpha = i4;
        this.purple = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                long j5 = ((Q0.m) obj).alpha;
                return new Q0.m((((int) (j5 >> 32)) << 32) | (4294967295L & ((Number) this.purple.invoke(Integer.valueOf((int) (j5 & 4294967295L)))).intValue()));
            case 1:
                long j6 = ((Q0.m) obj).alpha;
                return new Q0.m((((int) (j6 >> 32)) << 32) | (4294967295L & ((Number) this.purple.invoke(Integer.valueOf((int) (j6 & 4294967295L)))).intValue()));
            default:
                kotlin.reflect.jvm.internal.impl.types.y it = (kotlin.reflect.jvm.internal.impl.types.y) obj;
                Intrinsics.delta(it, "it");
                return this.purple.invoke(it).toString();
        }
    }
}
