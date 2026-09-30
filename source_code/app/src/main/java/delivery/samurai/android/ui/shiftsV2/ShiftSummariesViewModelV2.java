package delivery.samurai.android.ui.shiftsV2;

import Dc.i;
import Dc.k;
import Dc.l;
import androidx.lifecycle.T;
import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t3.f;
import vf.Y;
import vf.ad;
import yf.AbstractC3428A;
import yf.N;
import yf.au;
import yf.av;
import yf.az;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldelivery/samurai/android/ui/shiftsV2/ShiftSummariesViewModelV2;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "Lt3/f;", "shiftsService", "<init>", "(Ldelivery/samurai/android/AndroidApp;Lt3/f;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShiftSummariesViewModelV2 extends BaseViewModel {
    public final f alpha;
    public final N bravo;
    public final av charlie;
    public final N delta;
    public final av echo;
    public final az foxtrot;
    public final au golf;
    public int hotel;
    public boolean india;
    public boolean juliet;
    public final ArrayList kilo;
    public Y lima;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShiftSummariesViewModelV2(@NotNull AndroidApp app, @NotNull f shiftsService) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(shiftsService, "shiftsService");
        this.alpha = shiftsService;
        N charlie = AbstractC3428A.charlie(i.alpha);
        this.bravo = charlie;
        this.charlie = new av(charlie);
        N charlie2 = AbstractC3428A.charlie(Boolean.FALSE);
        this.delta = charlie2;
        this.echo = new av(charlie2);
        az bravo = AbstractC3428A.bravo(0, 1, null, 5);
        this.foxtrot = bravo;
        this.golf = new au(bravo);
        this.kilo = new ArrayList();
        alpha(true);
    }

    public final void alpha(boolean z2) {
        if (z2) {
            Y y10 = this.lima;
            if (y10 != null) {
                y10.foxtrot(null);
            }
            this.hotel = 0;
            this.india = false;
            this.juliet = false;
            N n5 = this.bravo;
            if ((((k) n5.getValue()) instanceof i) && this.kilo.isEmpty()) {
                i iVar = i.alpha;
                n5.getClass();
                n5.juliet(null, iVar);
            } else {
                Boolean bool = Boolean.TRUE;
                N n10 = this.delta;
                n10.getClass();
                n10.juliet(null, bool);
            }
        }
        this.lima = ad.zulu(T.hotel(this), null, null, new l(this, z2, null), 3);
    }
}
