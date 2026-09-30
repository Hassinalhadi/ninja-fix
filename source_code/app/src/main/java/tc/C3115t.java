package tc;

import delivery.samurai.android.ui.reposition.presentation.RepositionViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import qc.C2462d;
import rc.InterfaceC2515a;
import vf.ab;
import yf.N;

/* renamed from: tc.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3115t extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ RepositionViewModel purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ AbstractC3112q silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3115t(RepositionViewModel repositionViewModel, long j5, AbstractC3112q abstractC3112q, Nd.c cVar) {
        super(2, cVar);
        this.purple = repositionViewModel;
        this.red = j5;
        this.silver = abstractC3112q;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3115t(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3115t) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
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
                if (((C2462d) interfaceC2515a).charlie(j5, this) == aVar) {
                    return aVar;
                }
            }
            N n5 = repositionViewModel.bravo;
            C3108m c3108m = C3108m.alpha;
            n5.getClass();
            n5.juliet(null, c3108m);
        } catch (Exception e) {
            RepositionViewModel.alpha(repositionViewModel, e, this.silver);
        }
        return Unit.INSTANCE;
    }
}
