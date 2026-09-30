package cc;

import com.app.network.network.models.AddressNoteListItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vf.ab;

/* renamed from: cc.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0844a extends Pd.i implements Xd.l {
    public final /* synthetic */ Function1 alpha;
    public final /* synthetic */ AddressNoteListItem purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0844a(Function1 function1, AddressNoteListItem addressNoteListItem, Nd.c cVar) {
        super(2, cVar);
        this.alpha = function1;
        this.purple = addressNoteListItem;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0844a(this.alpha, this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0844a) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        this.alpha.invoke(new Integer(this.purple.getId()));
        return Unit.INSTANCE;
    }
}
