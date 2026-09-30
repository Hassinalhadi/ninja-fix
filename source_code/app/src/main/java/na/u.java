package na;

import androidx.lifecycle.az;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import io.reactivex.functions.Action;
import kotlin.Unit;
import r3.C2492a;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements Action {
    public final /* synthetic */ az alpha;

    @Override // io.reactivex.functions.Action
    public final void run() {
        Unit unit = Unit.INSTANCE;
        C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
        c2492a.charlie = unit;
        this.alpha.postValue(c2492a);
    }
}
