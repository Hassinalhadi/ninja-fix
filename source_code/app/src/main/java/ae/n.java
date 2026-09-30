package ae;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class n extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ o purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Bundle bundle;
        switch (this.alpha) {
            case 0:
                o oVar = this.purple;
                Application application = oVar.getApplication();
                if (oVar.getIntent() != null) {
                    bundle = oVar.getIntent().getExtras();
                } else {
                    bundle = null;
                }
                return new V(application, oVar, bundle);
            case 1:
                this.purple.reportFullyDrawn();
                return Unit.INSTANCE;
            case 2:
                o oVar2 = this.purple;
                return new w(o.access$getReportFullyDrawnExecutor$p(oVar2), new n(oVar2, 1));
            default:
                o oVar3 = this.purple;
                ai aiVar = new ai(new RunnableC0425d(oVar3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new A8.g(21, oVar3, aiVar));
                    } else {
                        o.access$addObserverForBackInvoker(oVar3, aiVar);
                    }
                }
                return aiVar;
        }
    }
}
