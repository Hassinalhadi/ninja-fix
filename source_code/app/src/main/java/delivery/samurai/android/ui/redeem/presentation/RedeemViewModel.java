package delivery.samurai.android.ui.redeem.presentation;

import Cf.d;
import Cf.e;
import V1.a;
import androidx.lifecycle.T;
import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import kc.InterfaceC2031a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.C2173f;
import org.jetbrains.annotations.NotNull;
import vf.ad;
import vf.ao;
import yf.AbstractC3428A;
import yf.N;
import yf.av;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldelivery/samurai/android/ui/redeem/presentation/RedeemViewModel;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "Lkc/a;", "repository", "<init>", "(Ldelivery/samurai/android/AndroidApp;Lkc/a;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RedeemViewModel extends BaseViewModel {
    public final InterfaceC2031a alpha;
    public final N bravo;
    public final av charlie;
    public final N delta;
    public final av echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedeemViewModel(@NotNull AndroidApp app, @NotNull InterfaceC2031a repository) {
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
    }

    public final void alpha(int i4) {
        a hotel = T.hotel(this);
        e eVar = ao.alpha;
        ad.zulu(hotel, d.purple, null, new C2173f(this, i4, null), 2);
    }
}
