package a2;

import androidx.compose.runtime.aw;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.n0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import yf.InterfaceC3439i;

/* renamed from: a2.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0399x extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ C0383h red;
    public final /* synthetic */ ax silver;
    public final /* synthetic */ aw teal;
    public final /* synthetic */ ax white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0399x(C0383h c0383h, ax axVar, aw awVar, ax axVar2, Nd.c cVar) {
        super(2, cVar);
        this.red = c0383h;
        this.silver = axVar;
        this.teal = awVar;
        this.white = axVar2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C0399x c0399x = new C0399x(this.red, this.silver, this.teal, this.white, cVar);
        c0399x.purple = obj;
        return c0399x;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0399x) create((InterfaceC3439i) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Y1.l lVar;
        Y1.l lVar2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        C0383h c0383h = this.red;
        ax axVar = this.silver;
        ax axVar2 = this.white;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    lVar2 = (Y1.l) this.purple;
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                InterfaceC3439i interfaceC3439i = (InterfaceC3439i) this.purple;
                int size = ((List) axVar.getValue()).size();
                aw awVar = this.teal;
                if (size > 1) {
                    ((n0) awVar).kilo(0.0f);
                    lVar = (Y1.l) CollectionsKt.olive((List) axVar.getValue());
                    Intrinsics.checkNotNull(lVar);
                    c0383h.bravo().golf(lVar);
                    c0383h.bravo().golf((Y1.l) ((List) axVar.getValue()).get(((List) axVar.getValue()).size() - 2));
                } else {
                    lVar = null;
                }
                C0398w c0398w = new C0398w(axVar, axVar2, awVar, 0);
                this.purple = lVar;
                this.alpha = 1;
                if (interfaceC3439i.collect(c0398w, this) == aVar) {
                    return aVar;
                }
                lVar2 = lVar;
            }
            if (((List) axVar.getValue()).size() > 1) {
                axVar2.setValue(Boolean.FALSE);
                Intrinsics.checkNotNull(lVar2);
                c0383h.india(lVar2, false);
            }
        } catch (CancellationException unused) {
            if (((List) axVar.getValue()).size() > 1) {
                axVar2.setValue(Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }
}
