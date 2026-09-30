package Jb;

import delivery.samurai.android.ui.homev2.ConnectionDiagnosticsViewModelV2;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import m3.C2097a;
import m3.C2099c;

/* loaded from: classes2.dex */
public final class aa extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ ConnectionDiagnosticsViewModelV2 red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(ConnectionDiagnosticsViewModelV2 connectionDiagnosticsViewModelV2, Nd.c cVar) {
        super(2, cVar);
        this.red = connectionDiagnosticsViewModelV2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        aa aaVar = new aa(this.red, cVar);
        aaVar.purple = obj;
        return aaVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aa) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object m206constructorimpl;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        ConnectionDiagnosticsViewModelV2 connectionDiagnosticsViewModelV2 = this.red;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                Result.Companion companion = Result.INSTANCE;
                m3.d dVar = connectionDiagnosticsViewModelV2.alpha;
                this.purple = null;
                this.alpha = 1;
                dVar.getClass();
                Cf.e eVar = vf.ao.alpha;
                obj = vf.ad.blue(Cf.d.purple, new C2099c(dVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            m206constructorimpl = Result.m206constructorimpl((C2097a) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m207exceptionOrNullimpl(m206constructorimpl) != null) {
            m206constructorimpl = connectionDiagnosticsViewModelV2.alpha.bravo();
        }
        connectionDiagnosticsViewModelV2.bravo.postValue(new C0217z((C2097a) m206constructorimpl));
        return Unit.INSTANCE;
    }
}
