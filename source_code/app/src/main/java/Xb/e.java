package Xb;

import androidx.lifecycle.az;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AllAddressNoteViewModel purple;

    public /* synthetic */ e(AllAddressNoteViewModel allAddressNoteViewModel, int i4) {
        this.alpha = i4;
        this.purple = allAddressNoteViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                az azVar = this.purple.golf;
                C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a.charlie = (List) obj;
                azVar.postValue(c2492a);
                return Unit.INSTANCE;
            default:
                Throwable th = (Throwable) obj;
                AllAddressNoteViewModel allAddressNoteViewModel = this.purple;
                az azVar2 = allAddressNoteViewModel.golf;
                Intrinsics.checkNotNull(th);
                String msg = allAddressNoteViewModel.onHandleError(th);
                Intrinsics.echo(msg, "msg");
                azVar2.postValue(new C2492a(0, msg));
                return Unit.INSTANCE;
        }
    }
}
