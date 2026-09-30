package delivery.samurai.android.ui.home;

import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t3.InterfaceC2956a;
import t3.InterfaceC2957b;

@HiltViewModel
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldelivery/samurai/android/ui/home/HomeViewModel;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "Lt3/b;", "service", "Lt3/a;", "authService", "<init>", "(Ldelivery/samurai/android/AndroidApp;Lt3/b;Lt3/a;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HomeViewModel extends BaseViewModel {
    public final InterfaceC2957b alpha;
    public final InterfaceC2956a bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel(@NotNull AndroidApp app, @NotNull InterfaceC2957b service, @NotNull InterfaceC2956a authService) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(service, "service");
        Intrinsics.echo(authService, "authService");
        this.alpha = service;
        this.bravo = authService;
        new au().setValue("This is home Fragment");
    }
}
