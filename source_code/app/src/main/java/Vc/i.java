package Vc;

import Wf.u;
import Wf.w;
import a0.C0352f;
import a0.ao;
import android.content.Context;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.aa;
import b.T;
import b.am;
import com.checkout.components.kmp.rememberme.view.ui.ComposableSingletons$InfoTextViewKt;
import com.checkout.components.redirecthandler.RedirectDelegate;
import com.checkout.components.rememberme.AbstractC0993x;
import com.checkout.components.rememberme.CheckoutRememberMe;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import f0.AbstractC1680b;
import f0.C1679a;
import g0.C1725e;
import g0.C1726f;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.compose.resources.AndroidContextProvider;
import s6.AbstractC2754r0;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Function0 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ i(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                return (C0352f) Wf.m.alpha.getValue();
            case 4:
                return ao.foxtrot(1, 1, 0, 28);
            case 5:
                float f5 = 1;
                return new C1725e("emptyImageVector", f5, f5, 1.0f, 1.0f, 0L, 0, false, 224).echo();
            case 6:
                return new C1679a((C0352f) Wf.m.alpha.getValue());
            case 7:
                return (AbstractC1680b) Wf.m.charlie.getValue();
            case 8:
                return (C1726f) Wf.m.bravo.getValue();
            case 9:
                return u.alpha;
            case 10:
                return w.alpha;
            case 11:
                Context context = AndroidContextProvider.alpha;
                if (context != null) {
                    return context.getAssets();
                }
                throw new IllegalStateException("Android context is not initialized. If it happens in the Preview mode then call PreviewContextConfigurationEffect() function.");
            case 12:
                return "";
            case 13:
                return ComposableSingletons$InfoTextViewKt.bravo();
            case 14:
                return RedirectDelegate.Factory.alpha();
            case 15:
                boolean z2 = CaptainLocationMonitoringService.f12066D;
                return new Object();
            case 16:
                boolean z10 = CaptainLocationMonitoringService.f12066D;
                AbstractC2754r0.bravo("another_device");
                return Unit.INSTANCE;
            case 17:
                return new Pair(CaptainLocationMonitoringService.f12080S, CaptainLocationMonitoringService.f12081T);
            case 18:
                return Unit.INSTANCE;
            case 19:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return CheckoutRememberMe.charlie();
            case 23:
                return AbstractC0993x.a();
            case 24:
                return new Object();
            case 25:
                androidx.compose.runtime.r.delta("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 26:
                E0 e02 = androidx.compose.runtime.tooling.d.alpha;
                return null;
            case 27:
                E0 e03 = androidx.compose.runtime.tooling.e.alpha;
                return null;
            case 28:
                aa aaVar = androidx.compose.foundation.d.alpha;
                return am.alpha;
            default:
                return new T();
        }
    }
}
