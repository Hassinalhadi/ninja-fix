package b;

import g.AbstractC1719b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2557q;
import s0.InterfaceC2554n;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0686a implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AbstractC0701p purple;

    public /* synthetic */ C0686a(AbstractC0701p abstractC0701p, int i4) {
        this.alpha = i4;
        this.purple = abstractC0701p;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC2554n interfaceC2554n;
        switch (this.alpha) {
            case 0:
                androidx.compose.runtime.aa aaVar = androidx.compose.foundation.d.alpha;
                AbstractC0701p abstractC0701p = this.purple;
                D d4 = (D) AbstractC2557q.echo(abstractC0701p, aaVar);
                if (!(d4 instanceof H)) {
                    AbstractC1719b.alpha("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: " + d4);
                }
                H h4 = abstractC0701p.f3310d;
                H h10 = (H) d4;
                abstractC0701p.f3310d = h10;
                if (h4 != null && !Intrinsics.areEqual(h10, h4) && ((interfaceC2554n = abstractC0701p.f3311f) != null || !abstractC0701p.f3317l)) {
                    if (interfaceC2554n != null) {
                        abstractC0701p.c(interfaceC2554n);
                    }
                    abstractC0701p.f3311f = null;
                    abstractC0701p.j();
                }
                return Unit.INSTANCE;
            default:
                this.purple.f3308b.invoke();
                return Boolean.TRUE;
        }
    }
}
