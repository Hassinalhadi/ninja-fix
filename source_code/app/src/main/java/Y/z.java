package Y;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class z extends Lambda implements Function0 {
    public final /* synthetic */ Ref.ObjectRef alpha;
    public final /* synthetic */ aa purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Ref.ObjectRef objectRef, aa aaVar) {
        super(0);
        this.alpha = objectRef;
        this.purple = aaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.alpha.alpha = this.purple.c();
        return Unit.INSTANCE;
    }
}
