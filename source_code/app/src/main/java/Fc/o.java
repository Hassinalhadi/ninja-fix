package Fc;

import androidx.lifecycle.az;
import com.app.network.network.models.Country;
import com.app.network.network.response.DataResponse;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import delivery.samurai.android.ui.splash.AuthViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import t3.InterfaceC2956a;

/* loaded from: classes2.dex */
public final class o extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ AuthViewModel purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AuthViewModel authViewModel, Nd.c cVar) {
        super(2, cVar);
        this.purple = authViewModel;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new o(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object m206constructorimpl;
        boolean z2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        AuthViewModel authViewModel = this.purple;
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
                InterfaceC2956a access$getAuthService$p = AuthViewModel.access$getAuthService$p(authViewModel);
                int access$getCurrentPage$p = AuthViewModel.access$getCurrentPage$p(authViewModel);
                this.alpha = 1;
                obj = access$getAuthService$p.charlie(access$getCurrentPage$p, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            m206constructorimpl = Result.m206constructorimpl((DataResponse) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (!(m206constructorimpl instanceof kotlin.k)) {
            DataResponse dataResponse = (DataResponse) m206constructorimpl;
            List items = dataResponse.getItems();
            if (items == null) {
                items = CollectionsKt.emptyList();
            }
            if (items.isEmpty()) {
                authViewModel.setLastPage(true);
                az access$get_countriesLiveData$p = AuthViewModel.access$get_countriesLiveData$p(authViewModel);
                DataResponse dataResponse2 = new DataResponse();
                dataResponse2.setItems(CollectionsKt.z(authViewModel.getCountriesList()));
                C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a.charlie = dataResponse2;
                access$get_countriesLiveData$p.postValue(c2492a);
            } else {
                ArrayList a6 = CollectionsKt.a(authViewModel.getCountriesList(), items);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator it = a6.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (hashSet.add(((Country) next).getId())) {
                        arrayList.add(next);
                    }
                }
                authViewModel.setCountriesList(arrayList);
                if (AuthViewModel.access$getCurrentPage$p(authViewModel) < dataResponse.getPageCount() - 1 && items.size() >= dataResponse.getPerPage()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                authViewModel.setLastPage(z2);
                AuthViewModel.access$setCurrentPage$p(authViewModel, AuthViewModel.access$getCurrentPage$p(authViewModel) + 1);
                az access$get_countriesLiveData$p2 = AuthViewModel.access$get_countriesLiveData$p(authViewModel);
                dataResponse.setItems(CollectionsKt.z(authViewModel.getCountriesList()));
                C2492a c2492a2 = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a2.charlie = dataResponse;
                access$get_countriesLiveData$p2.postValue(c2492a2);
            }
        }
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
        if (m207exceptionOrNullimpl != null) {
            az access$get_countriesLiveData$p3 = AuthViewModel.access$get_countriesLiveData$p(authViewModel);
            String msg = authViewModel.onHandleError(m207exceptionOrNullimpl);
            Intrinsics.echo(msg, "msg");
            access$get_countriesLiveData$p3.postValue(new C2492a(0, msg));
        }
        AuthViewModel.access$setLoading$p(authViewModel, false);
        return Unit.INSTANCE;
    }
}
