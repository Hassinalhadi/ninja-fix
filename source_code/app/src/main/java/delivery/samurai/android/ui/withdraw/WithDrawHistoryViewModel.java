package delivery.samurai.android.ui.withdraw;

import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t3.InterfaceC2957b;
import vf.Y;
import yf.AbstractC3428A;
import yf.az;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldelivery/samurai/android/ui/withdraw/WithDrawHistoryViewModel;", "Lcom/app/base/BaseViewModel;", "Lt3/b;", "captainService", "Ldelivery/samurai/android/AndroidApp;", "app", "<init>", "(Lt3/b;Ldelivery/samurai/android/AndroidApp;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WithDrawHistoryViewModel extends BaseViewModel {
    public final InterfaceC2957b alpha;
    public final az bravo;
    public final az charlie;
    public final az delta;
    public final az echo;
    public final az foxtrot;
    public Y golf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithDrawHistoryViewModel(@NotNull InterfaceC2957b captainService, @NotNull AndroidApp app) {
        super(app);
        Intrinsics.echo(captainService, "captainService");
        Intrinsics.echo(app, "app");
        this.alpha = captainService;
        this.bravo = AbstractC3428A.bravo(0, 1, null, 5);
        az bravo = AbstractC3428A.bravo(0, 1, null, 5);
        this.charlie = bravo;
        this.delta = bravo;
        az bravo2 = AbstractC3428A.bravo(0, 1, null, 5);
        this.echo = bravo2;
        this.foxtrot = bravo2;
    }

    public final void alpha() {
        Y y10 = this.golf;
        if (y10 != null) {
            y10.foxtrot(null);
        }
        this.golf = null;
    }
}
