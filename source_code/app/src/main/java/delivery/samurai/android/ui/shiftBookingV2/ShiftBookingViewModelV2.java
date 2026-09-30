package delivery.samurai.android.ui.shiftBookingV2;

import androidx.lifecycle.au;
import androidx.lifecycle.az;
import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t3.f;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldelivery/samurai/android/ui/shiftBookingV2/ShiftBookingViewModelV2;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "Lt3/f;", "shiftService", "<init>", "(Ldelivery/samurai/android/AndroidApp;Lt3/f;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShiftBookingViewModelV2 extends BaseViewModel {
    public final f alpha;
    public final az bravo;
    public final CompositeDisposable charlie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public ShiftBookingViewModelV2(@NotNull AndroidApp app, @NotNull f shiftService) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(shiftService, "shiftService");
        this.alpha = shiftService;
        this.bravo = new au();
        this.charlie = new CompositeDisposable();
    }

    @Override // androidx.lifecycle.Y
    public final void onCleared() {
        super.onCleared();
        this.charlie.clear();
    }
}
