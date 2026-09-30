package Ue;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import of.AbstractC2262q;
import pe.InterfaceC2328d;

/* loaded from: classes2.dex */
public final class c extends AbstractC2262q {
    public final /* synthetic */ Ref.ObjectRef bravo;
    public final /* synthetic */ Lambda charlie;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Ref.ObjectRef objectRef, Function1 function1) {
        this.bravo = objectRef;
        this.charlie = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // of.AbstractC2262q
    public final void bravo(Object obj) {
        InterfaceC2328d current = (InterfaceC2328d) obj;
        Intrinsics.echo(current, "current");
        Ref.ObjectRef objectRef = this.bravo;
        if (objectRef.alpha == null && ((Boolean) this.charlie.invoke(current)).booleanValue()) {
            objectRef.alpha = current;
        }
    }

    @Override // of.AbstractC2262q
    public final boolean charlie(Object obj) {
        InterfaceC2328d current = (InterfaceC2328d) obj;
        Intrinsics.echo(current, "current");
        if (this.bravo.alpha == null) {
            return true;
        }
        return false;
    }

    @Override // of.AbstractC2262q
    public final Object india() {
        return (InterfaceC2328d) this.bravo.alpha;
    }
}
