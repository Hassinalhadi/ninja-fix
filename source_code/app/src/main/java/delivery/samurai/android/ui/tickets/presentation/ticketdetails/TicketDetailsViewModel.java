package delivery.samurai.android.ui.tickets.presentation.ticketdetails;

import Af.n;
import Cf.e;
import Mc.a;
import Nc.j;
import Nd.i;
import Yb.C0312j0;
import androidx.lifecycle.C0639i;
import androidx.lifecycle.C0649t;
import androidx.lifecycle.T;
import androidx.lifecycle.au;
import androidx.lifecycle.ay;
import androidx.lifecycle.az;
import androidx.lifecycle.r;
import ap.b;
import com.app.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import delivery.samurai.android.AndroidApp;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C3117a;
import vf.J;
import vf.ad;
import vf.ao;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;
import yf.L;
import yf.N;
import yf.av;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldelivery/samurai/android/ui/tickets/presentation/ticketdetails/TicketDetailsViewModel;", "Lcom/app/base/BaseViewModel;", "Ldelivery/samurai/android/AndroidApp;", "app", "LMc/a;", "repository", "<init>", "(Ldelivery/samurai/android/AndroidApp;LMc/a;)V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TicketDetailsViewModel extends BaseViewModel {
    public final a alpha;
    public final N bravo;
    public final av charlie;
    public final N delta;
    public final av echo;
    public final az foxtrot;
    public final C0639i golf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, av.ao] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.au, java.lang.Object, androidx.lifecycle.az, androidx.lifecycle.ay, androidx.lifecycle.i] */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public TicketDetailsViewModel(@NotNull AndroidApp app, @NotNull a repository) {
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
        ?? auVar = new au(new ArrayList());
        this.foxtrot = auVar;
        InterfaceC3439i hotel = AbstractC3428A.hotel(AbstractC3428A.india(new r(auVar, null)), -1);
        i iVar = i.alpha;
        Intrinsics.echo(hotel, "<this>");
        C0649t c0649t = new C0649t(hotel, null);
        ?? ayVar = new ay();
        J j5 = new J(null);
        e eVar = ao.alpha;
        C3117a charlie3 = ad.charlie(n.alpha.teal.plus(iVar).plus(j5));
        C0312j0 c0312j0 = new C0312j0(8, ayVar);
        ?? obj = new Object();
        obj.alpha = ayVar;
        obj.purple = c0649t;
        obj.red = charlie3;
        obj.silver = c0312j0;
        ayVar.bravo = obj;
        if (hotel instanceof L) {
            if (b.charlie().delta()) {
                ayVar.setValue(((L) hotel).getValue());
            } else {
                ayVar.postValue(((L) hotel).getValue());
            }
        }
        this.golf = ayVar;
    }

    public final void alpha(int i4, boolean z2) {
        ad.zulu(T.hotel(this), null, null, new j(z2, this, i4, null), 3);
    }
}
