package t0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;

/* loaded from: classes3.dex */
public final class au implements vf.ab {
    public final View alpha;
    public final I0.ab purple;
    public final vf.ab red;
    public final AtomicReference silver = new AtomicReference(null);

    public au(View view, I0.ab abVar, vf.ab abVar2) {
        this.alpha = view;
        this.purple = abVar;
        this.red = abVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void alpha(w.u uVar, Pd.c cVar) {
        ar arVar;
        int i4;
        if (cVar instanceof ar) {
            arVar = (ar) cVar;
            int i5 = arVar.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                arVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = arVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = arVar.red;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    AtomicReference atomicReference = this.silver;
                    B2.ap apVar = new B2.ap(29, uVar, this);
                    at atVar = new at(this, null);
                    arVar.red = 1;
                    if (vf.ad.mike(new T.v(apVar, atomicReference, atVar, null), arVar) == aVar) {
                        return;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }
        arVar = new ar(this, cVar);
        Object obj2 = arVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = arVar.red;
        if (i4 == 0) {
        }
        throw new KotlinNothingValueException();
    }

    @Override // vf.ab
    public final Nd.h charlie() {
        return this.red.charlie();
    }
}
