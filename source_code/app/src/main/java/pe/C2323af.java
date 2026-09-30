package pe;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import qe.InterfaceC2472h;

/* renamed from: pe.af, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2323af extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Ne.c purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2323af(Ne.c cVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                Ne.c it = (Ne.c) obj;
                Intrinsics.echo(it, "it");
                if (!it.delta() && Intrinsics.areEqual(it.echo(), this.purple)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                InterfaceC2472h it2 = (InterfaceC2472h) obj;
                Intrinsics.echo(it2, "it");
                return it2.gray(this.purple);
        }
    }
}
