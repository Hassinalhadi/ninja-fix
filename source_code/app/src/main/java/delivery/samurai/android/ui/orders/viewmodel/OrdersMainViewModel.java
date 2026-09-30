package delivery.samurai.android.ui.orders.viewmodel;

import androidx.lifecycle.au;
import androidx.lifecycle.az;
import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import gc.C1763a;
import gc.C1765c;
import gc.C1767e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r3.C2492a;
import t3.InterfaceC2957b;
import t3.InterfaceC2958c;
import yf.AbstractC3428A;

@HiltViewModel
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldelivery/samurai/android/ui/orders/viewmodel/OrdersMainViewModel;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "Lt3/b;", "assetsService", "Lt3/c;", "ordersService", "<init>", "(Ldelivery/samurai/android/AndroidApp;Lt3/b;Lt3/c;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OrdersMainViewModel extends BaseViewModel {
    public final InterfaceC2957b alpha;
    public final InterfaceC2958c bravo;
    public final az charlie;
    public final az delta;
    public final az echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public OrdersMainViewModel(@NotNull AndroidApp app, @NotNull InterfaceC2957b assetsService, @NotNull InterfaceC2958c ordersService) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(assetsService, "assetsService");
        Intrinsics.echo(ordersService, "ordersService");
        this.alpha = assetsService;
        this.bravo = ordersService;
        ?? auVar = new au();
        this.charlie = auVar;
        ?? auVar2 = new au();
        this.delta = auVar2;
        ?? auVar3 = new au();
        this.echo = auVar3;
        AbstractC3428A.charlie(Boolean.FALSE);
        auVar.postValue(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(this, null, new C1765c(this, null), 1, null);
        auVar2.postValue(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(this, null, new C1763a(this, null), 1, null);
        auVar3.postValue(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(this, null, new C1767e(this, null), 1, null);
    }
}
