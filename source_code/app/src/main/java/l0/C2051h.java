package l0;

import T.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import s0.InterfaceC2554n;
import s0.j0;

/* renamed from: l0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2051h extends Lambda implements Function1 {
    public final /* synthetic */ Ref.ObjectRef alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2051h(Ref.ObjectRef objectRef) {
        super(1);
        this.alpha = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        InterfaceC2554n interfaceC2554n = (j0) obj;
        if (((r) interfaceC2554n).getNode().isAttached()) {
            this.alpha.alpha = interfaceC2554n;
            z2 = false;
        } else {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
