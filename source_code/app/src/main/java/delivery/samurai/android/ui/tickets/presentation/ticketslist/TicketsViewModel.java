package delivery.samurai.android.ui.tickets.presentation.ticketslist;

import Mc.a;
import Qc.k;
import Qc.l;
import Qc.m;
import androidx.lifecycle.T;
import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vf.ad;
import yf.AbstractC3428A;
import yf.N;
import yf.av;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldelivery/samurai/android/ui/tickets/presentation/ticketslist/TicketsViewModel;", "Lcom/app/base/BaseViewModel;", "LMc/a;", "repository", "Ldelivery/samurai/android/AndroidApp;", "app", "<init>", "(LMc/a;Ldelivery/samurai/android/AndroidApp;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TicketsViewModel extends BaseViewModel {
    public final a alpha;
    public final N bravo;
    public final av charlie;
    public final N delta;
    public final av echo;
    public final N foxtrot;
    public final av golf;
    public final N hotel;
    public final av india;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketsViewModel(@NotNull a repository, @NotNull AndroidApp app) {
        super(app);
        Intrinsics.echo(repository, "repository");
        Intrinsics.echo(app, "app");
        this.alpha = repository;
        N charlie = AbstractC3428A.charlie(new k());
        this.bravo = charlie;
        this.charlie = new av(charlie);
        N charlie2 = AbstractC3428A.charlie(new k());
        this.delta = charlie2;
        this.echo = new av(charlie2);
        N charlie3 = AbstractC3428A.charlie(null);
        this.foxtrot = charlie3;
        this.golf = new av(charlie3);
        N charlie4 = AbstractC3428A.charlie(null);
        this.hotel = charlie4;
        this.india = new av(charlie4);
    }

    public final void alpha() {
        N n5 = this.bravo;
        ((k) n5.getValue()).getClass();
        k kVar = new k(0, false, false);
        n5.getClass();
        n5.juliet(null, kVar);
        ad.zulu(T.hotel(this), null, null, new l(this, 0, null), 3);
    }

    public final void bravo() {
        N n5 = this.delta;
        ((k) n5.getValue()).getClass();
        k kVar = new k(0, false, false);
        n5.getClass();
        n5.juliet(null, kVar);
        ad.zulu(T.hotel(this), null, null, new m(this, 0, null), 3);
    }
}
