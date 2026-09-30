package delivery.samurai.android.ui.about;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.lifecycle.au;
import androidx.lifecycle.az;
import com.app.base.BaseViewModel;
import com.clevertap.android.sdk.inapp.images.preload.a;
import com.google.gson.l;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import ga.ai;
import ga.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r3.C2492a;
import t3.InterfaceC2957b;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldelivery/samurai/android/ui/about/MyAccountViewModel;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "Lt3/b;", "captainService", "<init>", "(Ldelivery/samurai/android/AndroidApp;Lt3/b;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MyAccountViewModel extends BaseViewModel {
    public final InterfaceC2957b alpha;
    public final ax bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyAccountViewModel(@NotNull AndroidApp app, @NotNull InterfaceC2957b captainService) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(captainService, "captainService");
        this.alpha = captainService;
        new l();
        this.bravo = C0564b.zulu(new f(null, "", "", "", "-", false, "-", "-", null, false, false));
    }

    public static boolean bravo(String str, String str2) {
        a aVar = new a(21);
        if (str != null && Intrinsics.areEqual(aVar.invoke(str), aVar.invoke(str2))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public final az alpha() {
        ?? auVar = new au(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(this, null, new ai(this, auVar, null), 1, null);
        return auVar;
    }

    public final void charlie(String str) {
        t0 t0Var = (t0) this.bravo;
        f updateState = (f) t0Var.getValue();
        Intrinsics.echo(updateState, "$this$updateState");
        t0Var.setValue(f.alpha(updateState, null, null, null, null, null, false, null, null, str, false, false, 1791));
    }
}
