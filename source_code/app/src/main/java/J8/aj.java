package J8;

import android.util.Log;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class aj extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ak purple;
    public final /* synthetic */ String red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ak akVar, String str, Nd.c cVar) {
        super(2, cVar);
        this.purple = akVar;
        this.red = str;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new aj(this.purple, this.red, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((aj) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                C1.h hVar = this.purple.bravo;
                ai aiVar = new ai(this.red, null);
                this.alpha = 1;
                if (hVar.bravo(new G1.h(aiVar, null), this) == aVar) {
                    return aVar;
                }
            }
        } catch (IOException e) {
            Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e);
        }
        return Unit.INSTANCE;
    }
}
