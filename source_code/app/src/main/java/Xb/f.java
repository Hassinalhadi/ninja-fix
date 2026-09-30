package Xb;

import Xd.l;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes2.dex */
public final class f extends Pd.i implements l {
    public final /* synthetic */ AllAddressNoteViewModel alpha;
    public final /* synthetic */ int purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AllAddressNoteViewModel allAddressNoteViewModel, int i4, Nd.c cVar) {
        super(2, cVar);
        this.alpha = allAddressNoteViewModel;
        this.purple = i4;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        AllAddressNoteViewModel allAddressNoteViewModel = this.alpha;
        allAddressNoteViewModel.alpha.bronze(this.purple).subscribe(new X9.f(3, new e(allAddressNoteViewModel, 0)), new X9.f(4, new e(allAddressNoteViewModel, 1)));
        return Unit.INSTANCE;
    }
}
