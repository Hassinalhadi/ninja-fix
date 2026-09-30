package m0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class aa implements PointerInputEventHandler, kotlin.jvm.internal.f {
    public final /* synthetic */ Xd.l alpha;

    public aa(Xd.l lVar) {
        this.alpha = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof kotlin.jvm.internal.f)) {
            return false;
        }
        return Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.f) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.f
    public final kotlin.e getFunctionDelegate() {
        return this.alpha;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(u uVar, Nd.c cVar) {
        return this.alpha.invoke(uVar, cVar);
    }
}
