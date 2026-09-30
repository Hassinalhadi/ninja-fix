package Xb;

import Fb.j;
import Xd.l;
import androidx.lifecycle.az;
import com.app.network.network.models.OwnerType;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import io.reactivex.Single;
import kotlin.ResultKt;
import kotlin.Unit;
import okhttp3.ResponseBody;
import t3.InterfaceC2957b;
import vf.ab;

/* loaded from: classes2.dex */
public final class h extends Pd.i implements l {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ AllAddressNoteViewModel purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ OwnerType silver;
    public final /* synthetic */ az teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z2, AllAddressNoteViewModel allAddressNoteViewModel, int i4, OwnerType ownerType, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.alpha = z2;
        this.purple = allAddressNoteViewModel;
        this.red = i4;
        this.silver = ownerType;
        this.teal = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new h(this.alpha, this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Single<ResponseBody> coral;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AllAddressNoteViewModel allAddressNoteViewModel = this.purple;
        boolean z2 = this.alpha;
        OwnerType ownerType = this.silver;
        int i4 = this.red;
        InterfaceC2957b interfaceC2957b = allAddressNoteViewModel.alpha;
        if (z2) {
            coral = interfaceC2957b.india(i4, ownerType.getValue());
        } else {
            coral = interfaceC2957b.coral(i4, ownerType.getValue());
        }
        az azVar = this.teal;
        coral.subscribe(new X9.f(7, new j(azVar, 20)), new X9.f(8, new a(azVar, allAddressNoteViewModel, 2)));
        return Unit.INSTANCE;
    }
}
