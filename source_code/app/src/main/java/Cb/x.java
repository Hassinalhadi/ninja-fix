package Cb;

import androidx.compose.runtime.ax;
import com.clevertap.android.sdk.Constants;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class x extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ ax purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new x(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
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
            this.alpha = 1;
            if (vf.ad.november(Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS, this) == aVar) {
                return aVar;
            }
        }
        ax axVar = this.purple;
        P.d dVar = y.alpha;
        axVar.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
