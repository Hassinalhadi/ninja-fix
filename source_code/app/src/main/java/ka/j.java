package ka;

import Xd.l;
import androidx.lifecycle.az;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import delivery.samurai.android.ui.about.viewmodel.TrophyMilestonesViewModel;
import ia.InterfaceC1908a;
import ja.C1955a;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import vf.ab;

/* loaded from: classes2.dex */
public final class j extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ TrophyMilestonesViewModel purple;
    public final /* synthetic */ int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TrophyMilestonesViewModel trophyMilestonesViewModel, int i4, Nd.c cVar) {
        super(2, cVar);
        this.purple = trophyMilestonesViewModel;
        this.red = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new j(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        TrophyMilestonesViewModel trophyMilestonesViewModel = this.purple;
        az azVar = trophyMilestonesViewModel.bravo;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                azVar.postValue(new C2492a(2, "loading"));
                InterfaceC1908a interfaceC1908a = trophyMilestonesViewModel.alpha;
                int i5 = this.red;
                this.alpha = 1;
                obj = ((C1955a) interfaceC1908a).alpha.lavender(i5, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
            c2492a.charlie = (List) obj;
            azVar.postValue(c2492a);
        } catch (Exception e) {
            String msg = trophyMilestonesViewModel.onHandleError(e);
            Intrinsics.echo(msg, "msg");
            azVar.postValue(new C2492a(0, msg));
        }
        return Unit.INSTANCE;
    }
}
