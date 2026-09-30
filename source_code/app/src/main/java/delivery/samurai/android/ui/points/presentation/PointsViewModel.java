package delivery.samurai.android.ui.points.presentation;

import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import kc.InterfaceC2031a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yf.AbstractC3428A;
import yf.N;
import yf.av;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldelivery/samurai/android/ui/points/presentation/PointsViewModel;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "Lkc/a;", "repository", "<init>", "(Ldelivery/samurai/android/AndroidApp;Lkc/a;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PointsViewModel extends BaseViewModel {
    public final InterfaceC2031a alpha;
    public final N bravo;
    public final av charlie;
    public final N delta;
    public final av echo;
    public final N foxtrot;
    public final av golf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointsViewModel(@NotNull AndroidApp app, @NotNull InterfaceC2031a repository) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(repository, "repository");
        this.alpha = repository;
        N charlie = AbstractC3428A.charlie(null);
        this.bravo = charlie;
        this.charlie = new av(charlie);
        N charlie2 = AbstractC3428A.charlie(null);
        this.delta = charlie2;
        this.echo = new av(charlie2);
        N charlie3 = AbstractC3428A.charlie(null);
        this.foxtrot = charlie3;
        this.golf = new av(charlie3);
    }
}
