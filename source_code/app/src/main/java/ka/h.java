package ka;

import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.response.DataResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import delivery.samurai.android.ui.about.viewmodel.TrophiesListViewModel;
import ia.InterfaceC1908a;
import ja.C1955a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import vf.ab;

/* loaded from: classes2.dex */
public final class h extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ TrophiesListViewModel purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TrophiesListViewModel trophiesListViewModel, boolean z2, int i4, Nd.c cVar) {
        super(2, cVar);
        this.purple = trophiesListViewModel;
        this.red = z2;
        this.silver = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new h(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r8 == r0) goto L24;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DataResponse dataResponse;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        TrophiesListViewModel trophiesListViewModel = this.purple;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        ResultKt.alpha(obj);
                        dataResponse = (DataResponse) obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    dataResponse = (DataResponse) obj;
                }
            } else {
                ResultKt.alpha(obj);
                trophiesListViewModel.bravo.postValue(new C2492a(2, "loading"));
                boolean z2 = this.red;
                InterfaceC1908a interfaceC1908a = trophiesListViewModel.alpha;
                int i5 = this.silver;
                if (z2) {
                    this.alpha = 1;
                    obj = ((C1955a) interfaceC1908a).alpha.foxtrot(i5, 20, this);
                    if (obj == aVar) {
                    }
                    dataResponse = (DataResponse) obj;
                } else {
                    this.alpha = 2;
                    obj = ((C1955a) interfaceC1908a).alpha.delta(i5, 20, this);
                }
                return aVar;
            }
            if (dataResponse.getItems().isEmpty()) {
                trophiesListViewModel.bravo.postValue(new C2492a(3, "no more items exist"));
            } else {
                az azVar = trophiesListViewModel.bravo;
                C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a.charlie = dataResponse;
                azVar.postValue(c2492a);
            }
        } catch (Exception e) {
            az azVar2 = trophiesListViewModel.bravo;
            String msg = trophiesListViewModel.onHandleError(e);
            Intrinsics.echo(msg, "msg");
            azVar2.postValue(new C2492a(0, msg));
        }
        return Unit.INSTANCE;
    }
}
