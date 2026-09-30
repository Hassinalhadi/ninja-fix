package m0;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;

/* loaded from: classes3.dex */
public final class ae extends Pd.c {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ af purple;
    public int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(af afVar, Pd.a aVar) {
        super(aVar);
        this.purple = afVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ae aeVar;
        int i4;
        this.alpha = obj;
        this.red |= RecyclerView.UNDEFINED_DURATION;
        af afVar = this.purple;
        afVar.getClass();
        try {
            if (this instanceof ae) {
                int i5 = this.red;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    this.red = i5 - RecyclerView.UNDEFINED_DURATION;
                    aeVar = this;
                    Object obj2 = aeVar.alpha;
                    Od.a aVar = Od.a.alpha;
                    i4 = aeVar.red;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            ResultKt.alpha(obj2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj2);
                        aeVar.red = 1;
                        obj2 = afVar.india(0L, null, aeVar);
                        if (obj2 == aVar) {
                            obj2 = aVar;
                        }
                    }
                    return obj2;
                }
            }
            if (i4 == 0) {
            }
            return obj2;
        } catch (PointerEventTimeoutCancellationException unused) {
            return null;
        }
        aeVar = new ae(afVar, this);
        Object obj22 = aeVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = aeVar.red;
    }
}
