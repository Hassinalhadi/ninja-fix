package M2;

import Xd.l;
import android.graphics.Bitmap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;

/* loaded from: classes3.dex */
public final class i extends Pd.i implements l {
    public int alpha;
    public final /* synthetic */ X2.h purple;
    public final /* synthetic */ k red;
    public final /* synthetic */ Y2.h silver;
    public final /* synthetic */ c teal;
    public final /* synthetic */ Bitmap white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(X2.h hVar, k kVar, Y2.h hVar2, c cVar, Bitmap bitmap, Nd.c cVar2) {
        super(2, cVar2);
        this.purple = hVar;
        this.red = kVar;
        this.silver = hVar2;
        this.teal = cVar;
        this.white = bitmap;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new i(this.purple, this.red, this.silver, this.teal, this.white, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        boolean z2;
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
        List list = this.red.india;
        if (this.white != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        X2.h hVar = this.purple;
        S2.l lVar = new S2.l(hVar, list, 0, hVar, this.silver, this.teal, z2);
        this.alpha = 1;
        Object juliet = lVar.juliet(hVar, this);
        if (juliet == aVar) {
            return aVar;
        }
        return juliet;
    }
}
