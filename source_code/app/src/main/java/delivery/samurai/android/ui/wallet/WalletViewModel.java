package delivery.samurai.android.ui.wallet;

import Cf.d;
import Tc.e;
import Tc.k;
import Tc.p;
import V1.a;
import androidx.lifecycle.T;
import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t3.InterfaceC2957b;
import vf.Y;
import vf.ad;
import vf.ao;
import yf.AbstractC3428A;
import yf.N;
import yf.av;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Ldelivery/samurai/android/ui/wallet/WalletViewModel;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "Lt3/b;", "captainService", "<init>", "(Ldelivery/samurai/android/AndroidApp;Lt3/b;)V", "Tc/m", "Tc/i", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WalletViewModel extends BaseViewModel {
    public final InterfaceC2957b alpha;
    public Y bravo;
    public final N charlie;
    public final av delta;
    public final N echo;
    public final av foxtrot;
    public int golf;
    public boolean hotel;
    public final ArrayList india;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel(@NotNull AndroidApp app, @NotNull InterfaceC2957b captainService) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(captainService, "captainService");
        this.alpha = captainService;
        N charlie = AbstractC3428A.charlie(k.alpha);
        this.charlie = charlie;
        this.delta = new av(charlie);
        N charlie2 = AbstractC3428A.charlie(e.alpha);
        this.echo = charlie2;
        this.foxtrot = new av(charlie2);
        this.india = new ArrayList();
    }

    public final void alpha() {
        this.golf = 0;
        this.hotel = false;
        k kVar = k.alpha;
        N n5 = this.charlie;
        n5.getClass();
        n5.juliet(null, kVar);
        a hotel = T.hotel(this);
        Cf.e eVar = ao.alpha;
        ad.zulu(hotel, d.purple, null, new p(this, 0, null), 2);
    }

    public final void bravo() {
        Y y10 = this.bravo;
        if (y10 != null) {
            y10.foxtrot(null);
        }
        this.bravo = null;
        e eVar = e.alpha;
        N n5 = this.echo;
        n5.getClass();
        n5.juliet(null, eVar);
    }
}
