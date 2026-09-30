package U0;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class j extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ z purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(z zVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Looper looper;
        switch (this.alpha) {
            case 0:
                q0.z amber = ((q0.z) obj).amber();
                Intrinsics.checkNotNull(amber);
                this.purple.mike(amber);
                return Unit.INSTANCE;
            case 1:
                Q0.m mVar = new Q0.m(((Q0.m) obj).alpha);
                z zVar = this.purple;
                zVar.m10setPopupContentSizefhxjrPA(mVar);
                zVar.november();
                return Unit.INSTANCE;
            default:
                Function0 function0 = (Function0) obj;
                z zVar2 = this.purple;
                Handler handler = zVar2.getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                } else {
                    looper = null;
                }
                if (looper == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = zVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new x(function0, 0));
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
