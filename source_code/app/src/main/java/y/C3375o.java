package y;

import android.view.textclassifier.TextClassifier;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: y.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3375o extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ TextClassifier purple;
    public final /* synthetic */ Pd.i red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3375o(TextClassifier textClassifier, Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = textClassifier;
        this.red = (Pd.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.l, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3375o(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3375o) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Xd.l, Pd.i] */
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
        TextClassifier textClassifier = this.purple;
        if (textClassifier != null) {
            this.alpha = 1;
            Object invoke = this.red.invoke(textClassifier, this);
            if (invoke == aVar) {
                return aVar;
            }
            return invoke;
        }
        return null;
    }
}
