package Na;

import Pd.c;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class b {
    public final La.a alpha;

    public b(La.a aVar) {
        this.alpha = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(c cVar) {
        a aVar;
        int i4;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i5 = aVar.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                aVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = aVar.alpha;
                Od.a aVar2 = Od.a.alpha;
                i4 = aVar.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                        return ((Result) obj).alpha;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                aVar.red = 1;
                Object alpha = ((Ja.b) this.alpha).alpha(aVar);
                if (alpha == aVar2) {
                    return aVar2;
                }
                return alpha;
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.alpha;
        Od.a aVar22 = Od.a.alpha;
        i4 = aVar.red;
        if (i4 == 0) {
        }
    }
}
