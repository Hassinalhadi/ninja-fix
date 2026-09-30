package ka;

import Xd.l;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.ui.about.viewmodel.TrophiesCollectionsViewModel;
import ia.InterfaceC1908a;
import ja.C1955a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Ref;
import vf.ab;

/* loaded from: classes2.dex */
public final class e extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ TrophiesCollectionsViewModel purple;
    public final /* synthetic */ Ref.ObjectRef red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TrophiesCollectionsViewModel trophiesCollectionsViewModel, Ref.ObjectRef objectRef, Nd.c cVar) {
        super(2, cVar);
        this.purple = trophiesCollectionsViewModel;
        this.red = objectRef;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new e(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        TrophiesCollectionsViewModel trophiesCollectionsViewModel = this.purple;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                InterfaceC1908a interfaceC1908a = trophiesCollectionsViewModel.alpha;
                this.alpha = 1;
                obj = ((C1955a) interfaceC1908a).alpha.delta(0, 3, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (DataResponse) obj;
        } catch (Exception e) {
            this.red.alpha = trophiesCollectionsViewModel.onHandleError(e);
            DataResponse dataResponse = new DataResponse();
            dataResponse.setItems(CollectionsKt.emptyList());
            return dataResponse;
        }
    }
}
