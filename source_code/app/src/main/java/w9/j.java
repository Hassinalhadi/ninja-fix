package w9;

import Fc.ad;
import Jb.AbstractC0210s;
import Jb.P;
import Jb.ac;
import Wc.y;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import ga.an;
import gc.AbstractC1768f;
import java.util.Map;
import ka.AbstractC2024b;
import na.w;
import nc.AbstractC2175h;
import s6.V;
import tc.AbstractC3116u;
import xc.AbstractC3327e;

/* loaded from: classes2.dex */
public final class j extends AbstractC3241b {
    public final p alpha;
    public final l bravo;
    public final j charlie = this;

    public j(p pVar, l lVar) {
        this.alpha = pVar;
        this.bravo = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dagger.hilt.android.internal.builders.FragmentComponentBuilder, java.lang.Object, com.google.firebase.messaging.o] */
    @Override // dagger.hilt.android.internal.managers.FragmentComponentManager.FragmentComponentBuilderEntryPoint
    public final FragmentComponentBuilder fragmentComponentBuilder() {
        p pVar = this.alpha;
        l lVar = this.bravo;
        j jVar = this.charlie;
        ?? obj = new Object();
        obj.alpha = pVar;
        obj.bravo = lVar;
        obj.charlie = jVar;
        return obj;
    }

    @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint
    public final DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new r(this.alpha, this.bravo));
    }

    @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
    public final ViewModelComponentBuilder getViewModelComponentBuilder() {
        return new r(this.alpha, this.bravo);
    }

    @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
    public final Map getViewModelKeys() {
        V.bravo(35, "expectedSize");
        B0.a aVar = new B0.a(35, 5);
        aVar.lima("delivery.samurai.android.ui.agreement.viewmodel.AgreementViewModel", Boolean.valueOf(ma.g.provide()));
        aVar.lima("delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel", Boolean.valueOf(Xb.i.provide()));
        aVar.lima("delivery.samurai.android.ui.areasV2.AreaViewModelV2", Boolean.valueOf(oa.i.provide()));
        aVar.lima("delivery.samurai.android.ui.assets.viewmodel.AssetViewModel", Boolean.valueOf(ra.c.provide()));
        aVar.lima("delivery.samurai.android.ui.attendanceRegistry.AttendanceRegistryViewModel", Boolean.valueOf(sa.e.provide()));
        aVar.lima("delivery.samurai.android.ui.missingAttributes.AttributeMissingViewModel", Boolean.valueOf(Ob.d.provide()));
        aVar.lima("delivery.samurai.android.ui.splash.AuthViewModel", Boolean.valueOf(ad.provide()));
        aVar.lima("delivery.samurai.android.ui.captainsuniforms.viewmodel.CaptainsUniformsViewModel", Boolean.valueOf(Ra.b.provide()));
        int i4 = AbstractC0210s.golf;
        aVar.lima("delivery.samurai.android.ui.homev2.ConnectionDiagnosticsViewModelV2", Boolean.valueOf(ac.provide()));
        int i5 = Gb.a.delta;
        aVar.lima("delivery.samurai.android.ui.envelopV2.EnvelopsViewModelV2", Boolean.valueOf(Gb.v.provide()));
        aVar.lima("delivery.samurai.android.ui.envelop.EnvelopsViewModel", Boolean.valueOf(Fb.o.provide()));
        int i10 = AbstractC0210s.golf;
        aVar.lima("delivery.samurai.android.ui.homev2.HomeViewModelV2", Boolean.valueOf(P.provide()));
        aVar.lima("delivery.samurai.android.ui.home.HomeViewModel", Boolean.valueOf(Hb.c.provide()));
        aVar.lima("delivery.samurai.android.ui.about.viewmodel.MoreViewModel", Boolean.valueOf(AbstractC2024b.provide()));
        int i11 = ga.g.golf;
        aVar.lima("delivery.samurai.android.ui.about.MyAccountViewModel", Boolean.valueOf(an.provide()));
        aVar.lima("delivery.samurai.android.ui.orders.viewmodel.OrdersMainViewModel", Boolean.valueOf(AbstractC1768f.provide()));
        aVar.lima("delivery.samurai.android.ui.allocation.OrdersViewModel", Boolean.valueOf(w.provide()));
        aVar.lima("delivery.samurai.android.ui.points.presentation.PointsViewModel", Boolean.valueOf(lc.m.provide()));
        aVar.lima("delivery.samurai.android.ui.redeem.presentation.RedeemViewModel", Boolean.valueOf(AbstractC2175h.provide()));
        aVar.lima("delivery.samurai.android.ui.reposition.presentation.RepositionViewModel", Boolean.valueOf(AbstractC3116u.provide()));
        aVar.lima("delivery.samurai.android.ui.score.ScoreViewModel", Boolean.valueOf(AbstractC3327e.provide()));
        aVar.lima("delivery.samurai.android.ui.shiftBookingV2.ShiftBookingViewModelV2", Boolean.valueOf(zc.r.provide()));
        aVar.lima("delivery.samurai.android.ui.shiftsV2.ShiftSummariesViewModelV2", Boolean.valueOf(Dc.m.provide()));
        aVar.lima("delivery.samurai.android.ui.shiftsV2.ShiftsViewModelV2", Boolean.valueOf(Dc.ac.provide()));
        aVar.lima("delivery.samurai.android.ui.support.SupportViewModel", Boolean.valueOf(Gc.m.provide()));
        aVar.lima("delivery.samurai.android.ui.suspension.viewmodel.SuspensionViewModel", Boolean.valueOf(Kc.j.provide()));
        aVar.lima("delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsViewModel", Boolean.valueOf(Nc.l.provide()));
        aVar.lima("delivery.samurai.android.ui.tickets.presentation.ticketslist.TicketsViewModel", Boolean.valueOf(Qc.n.provide()));
        aVar.lima("delivery.samurai.android.ui.transfer.TransferCardViewModel", Boolean.valueOf(Sc.m.provide()));
        aVar.lima("delivery.samurai.android.ui.about.viewmodel.TrophiesCollectionsViewModel", Boolean.valueOf(ka.g.provide()));
        aVar.lima("delivery.samurai.android.ui.about.viewmodel.TrophiesListViewModel", Boolean.valueOf(ka.i.provide()));
        aVar.lima("delivery.samurai.android.ui.about.viewmodel.TrophyMilestonesViewModel", Boolean.valueOf(ka.k.provide()));
        aVar.lima("delivery.samurai.android.ui.wallet.WalletViewModel", Boolean.valueOf(Tc.u.provide()));
        aVar.lima("delivery.samurai.android.ui.withdraw.WithDrawHistoryViewModel", Boolean.valueOf(y.provide()));
        aVar.lima("delivery.samurai.android.ui.zones.ZonesViewModel", Boolean.valueOf(Xc.h.provide()));
        return new dagger.internal.c(aVar.bravo());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dagger.hilt.android.internal.builders.ViewComponentBuilder, java.lang.Object] */
    @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewComponentBuilderEntryPoint
    public final ViewComponentBuilder viewComponentBuilder() {
        return new Object();
    }
}
