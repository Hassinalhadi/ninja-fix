package tc;

import delivery.samurai.android.ui.reposition.presentation.RepositionViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import qc.C2462d;
import rc.InterfaceC2515a;
import sc.C2847b;
import sc.EnumC2848c;
import vf.ab;
import yf.N;

/* renamed from: tc.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3114s extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ RepositionViewModel purple;
    public final /* synthetic */ long red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3114s(RepositionViewModel repositionViewModel, long j5, Nd.c cVar) {
        super(2, cVar);
        this.purple = repositionViewModel;
        this.red = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3114s(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3114s) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        boolean z2 = true;
        RepositionViewModel repositionViewModel = this.purple;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                InterfaceC2515a interfaceC2515a = repositionViewModel.alpha;
                long j5 = this.red;
                this.alpha = 1;
                obj = ((C2462d) interfaceC2515a).bravo(j5, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            C2847b c2847b = (C2847b) obj;
            if (c2847b.bravo != EnumC2848c.purple) {
                z2 = false;
            }
            if (!z2) {
                N n5 = repositionViewModel.bravo;
                C3108m c3108m = C3108m.alpha;
                n5.getClass();
                n5.juliet(null, c3108m);
            } else {
                N n10 = repositionViewModel.bravo;
                C3110o c3110o = new C3110o(c2847b);
                n10.getClass();
                n10.juliet(null, c3110o);
            }
        } catch (Exception e) {
            N n11 = repositionViewModel.bravo;
            C3109n c3109n = new C3109n(repositionViewModel.onHandleError(e));
            n11.getClass();
            n11.juliet(null, c3109n);
        }
        return Unit.INSTANCE;
    }
}
