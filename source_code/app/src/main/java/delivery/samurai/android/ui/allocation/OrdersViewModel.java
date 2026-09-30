package delivery.samurai.android.ui.allocation;

import J9.a;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.lifecycle.au;
import androidx.lifecycle.az;
import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t3.InterfaceC2957b;
import t3.InterfaceC2958c;
import t3.f;

@HiltViewModel
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ldelivery/samurai/android/ui/allocation/OrdersViewModel;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "Lt3/c;", "ordersService", "Lt3/b;", "captainService", "Lt3/f;", "shiftService", "LJ9/a;", "uploadRequestValidator", "<init>", "(Ldelivery/samurai/android/AndroidApp;Lt3/c;Lt3/b;Lt3/f;LJ9/a;)V", "na/f", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OrdersViewModel extends BaseViewModel {
    public final AndroidApp alpha;
    public final InterfaceC2958c bravo;
    public final InterfaceC2957b charlie;
    public final f delta;
    public final a echo;
    public final az foxtrot;
    public final az golf;
    public final ax hotel;
    public volatile Integer india;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public OrdersViewModel(@NotNull AndroidApp app, @NotNull InterfaceC2958c ordersService, @NotNull InterfaceC2957b captainService, @NotNull f shiftService, @NotNull a uploadRequestValidator) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(ordersService, "ordersService");
        Intrinsics.echo(captainService, "captainService");
        Intrinsics.echo(shiftService, "shiftService");
        Intrinsics.echo(uploadRequestValidator, "uploadRequestValidator");
        this.alpha = app;
        this.bravo = ordersService;
        this.charlie = captainService;
        this.delta = shiftService;
        this.echo = uploadRequestValidator;
        ?? auVar = new au();
        this.foxtrot = auVar;
        this.golf = auVar;
        this.hotel = C0564b.zulu(null);
    }
}
