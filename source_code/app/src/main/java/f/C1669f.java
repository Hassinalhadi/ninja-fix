package f;

import androidx.compose.runtime.ax;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import yf.az;

/* renamed from: f.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1669f extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ InterfaceC1673j purple;
    public final /* synthetic */ ax red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669f(InterfaceC1673j interfaceC1673j, ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = interfaceC1673j;
        this.red = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C1669f(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1669f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        ArrayList arrayList = new ArrayList();
        az azVar = ((C1674k) this.purple).alpha;
        E.e eVar = new E.e(6, arrayList, this.red);
        this.alpha = 1;
        azVar.getClass();
        az.juliet(azVar, eVar, this);
        return aVar;
    }
}
