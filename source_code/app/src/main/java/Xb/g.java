package Xb;

import Fb.j;
import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.models.CustomerPhoneResponse;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class g extends Pd.i implements l {
    public final /* synthetic */ AllAddressNoteViewModel alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ az red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AllAddressNoteViewModel allAddressNoteViewModel, String str, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = allAddressNoteViewModel;
        this.purple = str;
        this.red = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new g(this.alpha, this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AllAddressNoteViewModel allAddressNoteViewModel = this.alpha;
        Single<CustomerPhoneResponse> kilo = allAddressNoteViewModel.bravo.kilo(this.purple, "PHONE_CALL");
        az azVar = this.red;
        kilo.subscribe(new X9.f(5, new j(azVar, 19)), new X9.f(6, new a(azVar, allAddressNoteViewModel, 1)));
        return Unit.INSTANCE;
    }
}
