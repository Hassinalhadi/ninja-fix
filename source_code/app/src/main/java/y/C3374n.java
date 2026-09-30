package y;

import android.view.textclassifier.TextClassifier;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: y.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3374n extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ C3379s red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ long teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3374n(C3379s c3379s, String str, long j5, Nd.c cVar) {
        super(2, cVar);
        this.red = c3379s;
        this.silver = str;
        this.teal = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C3374n c3374n = new C3374n(this.red, this.silver, this.teal, cVar);
        c3374n.purple = obj;
        return c3374n;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3374n) create(vg.al.kilo(obj), (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            TextClassifier kilo = vg.al.kilo(this.purple);
            this.alpha = 1;
            if (C3379s.alpha(this.red, this.silver, this.teal, kilo, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }
}
