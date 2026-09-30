package bx;

import a0.InterfaceC0342ab;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ap extends Lambda implements Function1 {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ Function0 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(Function0 function0, boolean z2) {
        super(1);
        this.alpha = z2;
        this.purple = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        InterfaceC0342ab interfaceC0342ab = (InterfaceC0342ab) obj;
        if (!this.alpha && ((Boolean) this.purple.invoke()).booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        ((a0.ap) interfaceC0342ab).foxtrot(z2);
        return Unit.INSTANCE;
    }
}
