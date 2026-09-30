package je;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2328d;

/* renamed from: je.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1978q extends Lambda implements Function0 {
    public final /* synthetic */ InterfaceC2328d alpha;
    public final /* synthetic */ int purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1978q(InterfaceC2328d interfaceC2328d, int i4) {
        super(0);
        this.alpha = interfaceC2328d;
        this.purple = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.alpha.peach().get(this.purple);
        Intrinsics.delta(obj, "descriptor.valueParameters[i]");
        return (pe.aj) obj;
    }
}
