package delivery.samurai.android.ui.suspension.viewmodel;

import Kc.c;
import Kc.g;
import Kc.i;
import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t3.InterfaceC2957b;
import yf.AbstractC3428A;
import yf.N;
import yf.au;
import yf.av;
import yf.az;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldelivery/samurai/android/ui/suspension/viewmodel/SuspensionViewModel;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "Lt3/b;", "captainService", "<init>", "(Ldelivery/samurai/android/AndroidApp;Lt3/b;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SuspensionViewModel extends BaseViewModel {
    public final InterfaceC2957b alpha;
    public final N bravo;
    public final av charlie;
    public final N delta;
    public final av echo;
    public final N foxtrot;
    public final av golf;
    public final az hotel;
    public final au india;
    public int juliet;
    public boolean kilo;
    public boolean lima;
    public final ArrayList mike;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspensionViewModel(@NotNull AndroidApp app, @NotNull InterfaceC2957b captainService) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(captainService, "captainService");
        this.alpha = captainService;
        N charlie = AbstractC3428A.charlie(null);
        this.bravo = charlie;
        this.charlie = new av(charlie);
        N charlie2 = AbstractC3428A.charlie(c.alpha);
        this.delta = charlie2;
        this.echo = new av(charlie2);
        N charlie3 = AbstractC3428A.charlie(Boolean.FALSE);
        this.foxtrot = charlie3;
        this.golf = new av(charlie3);
        az bravo = AbstractC3428A.bravo(0, 1, null, 5);
        this.hotel = bravo;
        this.india = new au(bravo);
        this.mike = new ArrayList();
        BaseViewModel.launchApi$default(this, null, new g(this, null), 1, null);
        alpha(true);
    }

    public final void alpha(boolean z2) {
        if (z2) {
            this.juliet = 0;
            this.kilo = false;
            this.lima = false;
            N n5 = this.delta;
            if ((n5.getValue() instanceof c) && this.mike.isEmpty()) {
                c cVar = c.alpha;
                n5.getClass();
                n5.juliet(null, cVar);
            } else {
                Boolean bool = Boolean.TRUE;
                N n10 = this.foxtrot;
                n10.getClass();
                n10.juliet(null, bool);
            }
        }
        BaseViewModel.launchApi$default(this, null, new i(this, z2, null), 1, null);
    }
}
