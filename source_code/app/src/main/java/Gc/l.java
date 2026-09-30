package Gc;

import androidx.lifecycle.az;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import delivery.samurai.android.ui.support.SupportViewModel;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import vf.ab;

/* loaded from: classes2.dex */
public final class l extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ SupportViewModel purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ Integer silver;
    public final /* synthetic */ az teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(SupportViewModel supportViewModel, String str, Integer num, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = supportViewModel;
        this.red = str;
        this.silver = num;
        this.teal = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new l(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object m206constructorimpl;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        SupportViewModel supportViewModel = this.purple;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                String str = this.red;
                Integer num = this.silver;
                Result.Companion companion = Result.INSTANCE;
                t3.g gVar = supportViewModel.alpha;
                this.alpha = 1;
                obj = gVar.bravo(str, num, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            m206constructorimpl = Result.m206constructorimpl((List) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        boolean z2 = m206constructorimpl instanceof kotlin.k;
        az azVar = this.teal;
        if (!z2) {
            C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
            c2492a.charlie = (List) m206constructorimpl;
            azVar.postValue(c2492a);
        }
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
        if (m207exceptionOrNullimpl != null) {
            String msg = supportViewModel.onHandleError(m207exceptionOrNullimpl);
            Intrinsics.echo(msg, "msg");
            azVar.postValue(new C2492a(0, msg));
        }
        return Unit.INSTANCE;
    }
}
