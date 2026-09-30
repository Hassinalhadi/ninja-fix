package delivery.samurai.android.ui.shiftsV2;

import Cc.a;
import Dc.aa;
import Dc.ab;
import Dc.c;
import Dc.e;
import androidx.lifecycle.T;
import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldelivery/samurai/android/ui/shiftsV2/ShiftsViewModelV2;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "Lt3/f;", "shiftsService", "LCc/a;", "repository", "<init>", "(Ldelivery/samurai/android/AndroidApp;Lt3/f;LCc/a;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShiftsViewModelV2 extends BaseViewModel {
    public final f alpha;
    public final N bravo;
    public final av charlie;
    public final N delta;
    public final av echo;
    public final az foxtrot;
    public final au golf;
    public List hotel;
    public final ArrayList india;
    public int juliet;
    public boolean kilo;
    public boolean lima;
    public Y mike;
    public final androidx.lifecycle.az november;
    public final androidx.lifecycle.az oscar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public ShiftsViewModelV2(@NotNull AndroidApp app, @NotNull f shiftsService, @NotNull a repository) {
        super(app);
        Intrinsics.echo(app, "app");
        Intrinsics.echo(shiftsService, "shiftsService");
        Intrinsics.echo(repository, "repository");
        this.alpha = shiftsService;
        N charlie = AbstractC3428A.charlie(c.alpha);
        this.bravo = charlie;
        this.charlie = new av(charlie);
        N charlie2 = AbstractC3428A.charlie(Boolean.FALSE);
        this.delta = charlie2;
        this.echo = new av(charlie2);
        az bravo = AbstractC3428A.bravo(0, 1, null, 5);
        this.foxtrot = bravo;
        this.golf = new au(bravo);
        this.hotel = CollectionsKt.emptyList();
        this.india = new ArrayList();
        this.november = new androidx.lifecycle.au();
        this.oscar = new androidx.lifecycle.au();
        ad.zulu(T.hotel(this), null, null, new aa(this, null), 3);
    }

    public final void alpha(boolean z2) {
        if (z2) {
            Y y10 = this.mike;
            if (y10 != null) {
                y10.foxtrot(null);
            }
            this.juliet = 0;
            this.kilo = false;
            this.lima = false;
            N n5 = this.bravo;
            if ((((e) n5.getValue()) instanceof c) && this.india.isEmpty()) {
                c cVar = c.alpha;
                n5.getClass();
                n5.juliet(null, cVar);
            } else {
                Boolean bool = Boolean.TRUE;
                N n10 = this.delta;
                n10.getClass();
                n10.juliet(null, bool);
            }
        }
        this.mike = ad.zulu(T.hotel(this), null, null, new ab(this, z2, null), 3);
    }
}
