package Wb;

import delivery.samurai.android.ui.orders.note.ui.AddressNoteActivity;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final class h extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ AddressNoteActivity purple;
    public final /* synthetic */ Ref.ObjectRef red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AddressNoteActivity addressNoteActivity, Ref.ObjectRef objectRef, Nd.c cVar) {
        super(2, cVar);
        this.purple = addressNoteActivity;
        this.red = objectRef;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new h(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        E9.b bVar = this.purple.f12349I;
        if (bVar != null) {
            File file = (File) this.red.alpha;
            this.alpha = 1;
            Object oscar = ((J2.n) bVar).oscar(file, this);
            if (oscar == aVar) {
                return aVar;
            }
            return oscar;
        }
        Intrinsics.lima("imagePreparer");
        throw null;
    }
}
