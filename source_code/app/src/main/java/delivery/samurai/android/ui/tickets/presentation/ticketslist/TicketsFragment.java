package delivery.samurai.android.ui.tickets.presentation.ticketslist;

import B2.s;
import B9.ab;
import F8.q;
import Lb.C;
import O7.j;
import O7.l;
import P.d;
import Qc.a;
import Qc.f;
import Qc.h;
import Qc.k;
import Rc.b;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.T;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.tabs.TabLayout;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.support.AddSupportTicketActivity;
import delivery.samurai.android.ui.tickets.presentation.ticketslist.TicketsFragment;
import java.util.Iterator;
import java.util.List;
import k7.g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import s6.O6;
import s6.P6;
import t0.A0;
import t6.S3;
import vf.ad;
import yf.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/tickets/presentation/ticketslist/TicketsFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class TicketsFragment extends a {
    public ab e;

    /* renamed from: f, reason: collision with root package name */
    public final ab f12517f;

    /* renamed from: g, reason: collision with root package name */
    public final b f12518g;

    /* renamed from: h, reason: collision with root package name */
    public final b f12519h;

    /* renamed from: i, reason: collision with root package name */
    public int f12520i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12521j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12522k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12523l;

    /* renamed from: m, reason: collision with root package name */
    public final ax f12524m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12525n;

    /* renamed from: o, reason: collision with root package name */
    public final l f12526o;

    /* renamed from: p, reason: collision with root package name */
    public final j f12527p;

    public TicketsFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new C(10, new C(9, this)));
        this.f12517f = new ab(u.alpha.bravo(TicketsViewModel.class), new Qb.l(alpha, 4), new Aa.i(23, this, alpha), new Qb.l(alpha, 5));
        this.f12518g = new b(this, 0);
        this.f12519h = new b(this, 1);
        this.f12524m = C0564b.zulu("");
        this.f12526o = new l(5, this);
        this.f12527p = new j(5, this);
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_tickets, viewGroup, false);
        int i4 = R.id.bottom_bar_compose_view;
        ComposeView composeView = (ComposeView) S3.bravo(R.id.bottom_bar_compose_view, inflate);
        if (composeView != null) {
            i4 = R.id.empty_state_compose_view;
            ComposeView composeView2 = (ComposeView) S3.bravo(R.id.empty_state_compose_view, inflate);
            if (composeView2 != null) {
                i4 = R.id.rv_tickets;
                RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.rv_tickets, inflate);
                if (recyclerView != null) {
                    i4 = R.id.sr_tickets;
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) S3.bravo(R.id.sr_tickets, inflate);
                    if (swipeRefreshLayout != null) {
                        i4 = R.id.tl_tickets_type;
                        TabLayout tabLayout = (TabLayout) S3.bravo(R.id.tl_tickets_type, inflate);
                        if (tabLayout != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            this.e = new ab(constraintLayout, composeView, composeView2, recyclerView, swipeRefreshLayout, tabLayout);
                            Intrinsics.delta(constraintLayout, "getRoot(...)");
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onResume() {
        super.onResume();
        if (!this.f12525n) {
            this.f12525n = true;
            return;
        }
        if (this.f12523l) {
            int i4 = this.f12520i;
            if (i4 != 0) {
                if (i4 == 1) {
                    TicketsViewModel romeo = romeo();
                    k kVar = new k();
                    N n5 = romeo.delta;
                    n5.getClass();
                    n5.juliet(null, kVar);
                    romeo.bravo();
                    return;
                }
                return;
            }
            TicketsViewModel romeo2 = romeo();
            k kVar2 = new k();
            N n10 = romeo2.bravo;
            n10.getClass();
            n10.juliet(null, kVar2);
            romeo2.alpha();
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.echo(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt("selected_tab_position", this.f12520i);
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.f12520i = bundle.getInt("selected_tab_position", 0);
        }
        List listOf = CollectionsKt.listOf(getString(R.string.open_tickets), getString(R.string.resolved_tickets));
        ab abVar = this.e;
        if (abVar != null) {
            ((TabLayout) abVar.teal).kilo();
            Iterator it = listOf.iterator();
            int i4 = 0;
            while (true) {
                boolean z2 = true;
                if (it.hasNext()) {
                    Object next = it.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String str = (String) next;
                    ab abVar2 = this.e;
                    if (abVar2 != null) {
                        g india = ((TabLayout) abVar2.teal).india();
                        LayoutInflater layoutInflater = getLayoutInflater();
                        ab abVar3 = this.e;
                        if (abVar3 != null) {
                            View inflate = layoutInflater.inflate(R.layout.item_area_tab, (ViewGroup) abVar3.teal, false);
                            Intrinsics.charlie(inflate, "null cannot be cast to non-null type android.widget.TextView");
                            TextView textView = (TextView) inflate;
                            textView.setText(str);
                            india.charlie = textView;
                            k7.j jVar = india.echo;
                            if (jVar != null) {
                                jVar.delta();
                            }
                            ab abVar4 = this.e;
                            if (abVar4 != null) {
                                if (i4 != 0) {
                                    z2 = false;
                                }
                                ((TabLayout) abVar4.teal).bravo(india, z2);
                                i4 = i5;
                            } else {
                                Intrinsics.lima("binding");
                                throw null;
                            }
                        } else {
                            Intrinsics.lima("binding");
                            throw null;
                        }
                    } else {
                        Intrinsics.lima("binding");
                        throw null;
                    }
                } else {
                    uniform(this.f12520i);
                    ax axVar = this.f12524m;
                    if (this.f12520i == 0) {
                        string = getString(R.string.open_tickets);
                        Intrinsics.delta(string, "getString(...)");
                    } else {
                        string = getString(R.string.resolved_tickets);
                        Intrinsics.delta(string, "getString(...)");
                    }
                    ((t0) axVar).setValue(string);
                    ab abVar5 = this.e;
                    if (abVar5 != null) {
                        A0 a02 = A0.alpha;
                        final ComposeView composeView = (ComposeView) abVar5.red;
                        composeView.setViewCompositionStrategy(a02);
                        final int i10 = 1;
                        composeView.setContent(new d(new Xd.l(this) { // from class: Qc.b
                            public final /* synthetic */ TicketsFragment purple;

                            {
                                this.purple = this;
                            }

                            @Override // Xd.l
                            public final Object invoke(Object obj, Object obj2) {
                                boolean z10;
                                boolean z11;
                                int i11 = i10;
                                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                                int intValue = ((Integer) obj2).intValue();
                                switch (i11) {
                                    case 0:
                                        if ((intValue & 3) != 2) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        C0585q c0585q = (C0585q) interfaceC0581m;
                                        if (c0585q.magenta(intValue & 1, z10)) {
                                            final TicketsFragment ticketsFragment = this.purple;
                                            boolean india2 = c0585q.india(ticketsFragment);
                                            final ComposeView composeView2 = composeView;
                                            boolean india3 = india2 | c0585q.india(composeView2);
                                            Object jade = c0585q.jade();
                                            if (india3 || jade == C0580l.alpha) {
                                                final int i12 = 0;
                                                jade = new Function0() { // from class: Qc.d
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        TicketsFragment ticketsFragment2 = ticketsFragment;
                                                        ComposeView composeView3 = composeView2;
                                                        switch (i12) {
                                                            case 0:
                                                                int i13 = AddSupportTicketActivity.f12493K;
                                                                ticketsFragment2.startActivity(new Intent(composeView3.getContext(), (Class<?>) AddSupportTicketActivity.class));
                                                                return Unit.INSTANCE;
                                                            default:
                                                                int i14 = AddSupportTicketActivity.f12493K;
                                                                ticketsFragment2.startActivity(new Intent(composeView3.getContext(), (Class<?>) AddSupportTicketActivity.class));
                                                                return Unit.INSTANCE;
                                                        }
                                                    }
                                                };
                                                c0585q.f(jade);
                                            }
                                            O6.alpha((Function0) jade, c0585q, 0);
                                        } else {
                                            c0585q.ochre();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        if ((intValue & 3) != 2) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        C0585q c0585q2 = (C0585q) interfaceC0581m;
                                        if (c0585q2.magenta(intValue & 1, z11)) {
                                            final TicketsFragment ticketsFragment2 = this.purple;
                                            String str2 = (String) ((t0) ticketsFragment2.f12524m).getValue();
                                            boolean india4 = c0585q2.india(ticketsFragment2);
                                            final ComposeView composeView3 = composeView;
                                            boolean india5 = india4 | c0585q2.india(composeView3);
                                            Object jade2 = c0585q2.jade();
                                            if (india5 || jade2 == C0580l.alpha) {
                                                final int i13 = 1;
                                                jade2 = new Function0() { // from class: Qc.d
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        TicketsFragment ticketsFragment22 = ticketsFragment2;
                                                        ComposeView composeView32 = composeView3;
                                                        switch (i13) {
                                                            case 0:
                                                                int i132 = AddSupportTicketActivity.f12493K;
                                                                ticketsFragment22.startActivity(new Intent(composeView32.getContext(), (Class<?>) AddSupportTicketActivity.class));
                                                                return Unit.INSTANCE;
                                                            default:
                                                                int i14 = AddSupportTicketActivity.f12493K;
                                                                ticketsFragment22.startActivity(new Intent(composeView32.getContext(), (Class<?>) AddSupportTicketActivity.class));
                                                                return Unit.INSTANCE;
                                                        }
                                                    }
                                                };
                                                c0585q2.f(jade2);
                                            }
                                            P6.alpha(str2, (Function0) jade2, c0585q2, 0);
                                        } else {
                                            c0585q2.ochre();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, 1203589472, true));
                        ab abVar6 = this.e;
                        if (abVar6 != null) {
                            final ComposeView composeView2 = (ComposeView) abVar6.purple;
                            composeView2.setViewCompositionStrategy(a02);
                            final int i11 = 0;
                            composeView2.setContent(new d(new Xd.l(this) { // from class: Qc.b
                                public final /* synthetic */ TicketsFragment purple;

                                {
                                    this.purple = this;
                                }

                                @Override // Xd.l
                                public final Object invoke(Object obj, Object obj2) {
                                    boolean z10;
                                    boolean z11;
                                    int i112 = i11;
                                    InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    switch (i112) {
                                        case 0:
                                            if ((intValue & 3) != 2) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            C0585q c0585q = (C0585q) interfaceC0581m;
                                            if (c0585q.magenta(intValue & 1, z10)) {
                                                final TicketsFragment ticketsFragment = this.purple;
                                                boolean india2 = c0585q.india(ticketsFragment);
                                                final ComposeView composeView22 = composeView2;
                                                boolean india3 = india2 | c0585q.india(composeView22);
                                                Object jade = c0585q.jade();
                                                if (india3 || jade == C0580l.alpha) {
                                                    final int i12 = 0;
                                                    jade = new Function0() { // from class: Qc.d
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            TicketsFragment ticketsFragment22 = ticketsFragment;
                                                            ComposeView composeView32 = composeView22;
                                                            switch (i12) {
                                                                case 0:
                                                                    int i132 = AddSupportTicketActivity.f12493K;
                                                                    ticketsFragment22.startActivity(new Intent(composeView32.getContext(), (Class<?>) AddSupportTicketActivity.class));
                                                                    return Unit.INSTANCE;
                                                                default:
                                                                    int i14 = AddSupportTicketActivity.f12493K;
                                                                    ticketsFragment22.startActivity(new Intent(composeView32.getContext(), (Class<?>) AddSupportTicketActivity.class));
                                                                    return Unit.INSTANCE;
                                                            }
                                                        }
                                                    };
                                                    c0585q.f(jade);
                                                }
                                                O6.alpha((Function0) jade, c0585q, 0);
                                            } else {
                                                c0585q.ochre();
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            if ((intValue & 3) != 2) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            C0585q c0585q2 = (C0585q) interfaceC0581m;
                                            if (c0585q2.magenta(intValue & 1, z11)) {
                                                final TicketsFragment ticketsFragment2 = this.purple;
                                                String str2 = (String) ((t0) ticketsFragment2.f12524m).getValue();
                                                boolean india4 = c0585q2.india(ticketsFragment2);
                                                final ComposeView composeView3 = composeView2;
                                                boolean india5 = india4 | c0585q2.india(composeView3);
                                                Object jade2 = c0585q2.jade();
                                                if (india5 || jade2 == C0580l.alpha) {
                                                    final int i13 = 1;
                                                    jade2 = new Function0() { // from class: Qc.d
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            TicketsFragment ticketsFragment22 = ticketsFragment2;
                                                            ComposeView composeView32 = composeView3;
                                                            switch (i13) {
                                                                case 0:
                                                                    int i132 = AddSupportTicketActivity.f12493K;
                                                                    ticketsFragment22.startActivity(new Intent(composeView32.getContext(), (Class<?>) AddSupportTicketActivity.class));
                                                                    return Unit.INSTANCE;
                                                                default:
                                                                    int i14 = AddSupportTicketActivity.f12493K;
                                                                    ticketsFragment22.startActivity(new Intent(composeView32.getContext(), (Class<?>) AddSupportTicketActivity.class));
                                                                    return Unit.INSTANCE;
                                                            }
                                                        }
                                                    };
                                                    c0585q2.f(jade2);
                                                }
                                                P6.alpha(str2, (Function0) jade2, c0585q2, 0);
                                            } else {
                                                c0585q2.ochre();
                                            }
                                            return Unit.INSTANCE;
                                    }
                                }
                            }, 1701999258, true));
                            oscar();
                            ad.zulu(T.foxtrot(this), null, null, new f(this, null), 3);
                            ad.zulu(T.foxtrot(this), null, null, new h(this, null), 3);
                            ab abVar7 = this.e;
                            if (abVar7 != null) {
                                g hotel = ((TabLayout) abVar7.teal).hotel(this.f12520i);
                                if (hotel != null) {
                                    hotel.alpha();
                                }
                                quebec();
                                return;
                            }
                            Intrinsics.lima("binding");
                            throw null;
                        }
                        Intrinsics.lima("binding");
                        throw null;
                    }
                    Intrinsics.lima("binding");
                    throw null;
                }
            }
        } else {
            Intrinsics.lima("binding");
            throw null;
        }
    }

    @Override // d3.n
    public final void oscar() {
        ab abVar = this.e;
        if (abVar != null) {
            ((SwipeRefreshLayout) abVar.silver).setOnRefreshListener(new s(23, this));
            ab abVar2 = this.e;
            if (abVar2 != null) {
                ((TabLayout) abVar2.teal).alpha(new Qc.i(0, this));
                return;
            } else {
                Intrinsics.lima("binding");
                throw null;
            }
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final void quebec() {
        if (!this.f12523l) {
            this.f12523l = true;
        }
        int i4 = this.f12520i;
        if (i4 != 0) {
            if (i4 != 1) {
                return;
            }
            ab abVar = this.e;
            if (abVar != null) {
                ((RecyclerView) abVar.white).setAdapter(this.f12519h);
                ab abVar2 = this.e;
                if (abVar2 != null) {
                    final int i5 = 1;
                    ((RecyclerView) abVar2.white).post(new Runnable(this) { // from class: Qc.c
                        public final /* synthetic */ TicketsFragment purple;

                        {
                            this.purple = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i5) {
                                case 0:
                                    TicketsFragment ticketsFragment = this.purple;
                                    if (!ticketsFragment.f12521j) {
                                        ab abVar3 = ticketsFragment.e;
                                        if (abVar3 != null) {
                                            RecyclerView recyclerView = (RecyclerView) abVar3.white;
                                            if (recyclerView.getAdapter() != null) {
                                                if (recyclerView.getLayoutManager() != null) {
                                                    new S5.k(recyclerView, ticketsFragment.f12526o, 5, true, new q(recyclerView.getLayoutManager()));
                                                    ticketsFragment.f12521j = true;
                                                } else {
                                                    throw new IllegalStateException("LayoutManager needs to be set on the RecyclerView");
                                                }
                                            } else {
                                                throw new IllegalStateException("Adapter needs to be set!");
                                            }
                                        } else {
                                            Intrinsics.lima("binding");
                                            throw null;
                                        }
                                    }
                                    ticketsFragment.f12518g.bravo(CollectionsKt.emptyList());
                                    ticketsFragment.romeo().alpha();
                                    return;
                                default:
                                    TicketsFragment ticketsFragment2 = this.purple;
                                    if (!ticketsFragment2.f12522k) {
                                        ab abVar4 = ticketsFragment2.e;
                                        if (abVar4 != null) {
                                            RecyclerView recyclerView2 = (RecyclerView) abVar4.white;
                                            if (recyclerView2.getAdapter() != null) {
                                                if (recyclerView2.getLayoutManager() != null) {
                                                    new S5.k(recyclerView2, ticketsFragment2.f12527p, 5, true, new q(recyclerView2.getLayoutManager()));
                                                    ticketsFragment2.f12522k = true;
                                                } else {
                                                    throw new IllegalStateException("LayoutManager needs to be set on the RecyclerView");
                                                }
                                            } else {
                                                throw new IllegalStateException("Adapter needs to be set!");
                                            }
                                        } else {
                                            Intrinsics.lima("binding");
                                            throw null;
                                        }
                                    }
                                    ticketsFragment2.f12519h.bravo(CollectionsKt.emptyList());
                                    ticketsFragment2.romeo().bravo();
                                    return;
                            }
                        }
                    });
                    return;
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        ab abVar3 = this.e;
        if (abVar3 != null) {
            ((RecyclerView) abVar3.white).setAdapter(this.f12518g);
            ab abVar4 = this.e;
            if (abVar4 != null) {
                final int i10 = 0;
                ((RecyclerView) abVar4.white).post(new Runnable(this) { // from class: Qc.c
                    public final /* synthetic */ TicketsFragment purple;

                    {
                        this.purple = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TicketsFragment ticketsFragment = this.purple;
                                if (!ticketsFragment.f12521j) {
                                    ab abVar32 = ticketsFragment.e;
                                    if (abVar32 != null) {
                                        RecyclerView recyclerView = (RecyclerView) abVar32.white;
                                        if (recyclerView.getAdapter() != null) {
                                            if (recyclerView.getLayoutManager() != null) {
                                                new S5.k(recyclerView, ticketsFragment.f12526o, 5, true, new q(recyclerView.getLayoutManager()));
                                                ticketsFragment.f12521j = true;
                                            } else {
                                                throw new IllegalStateException("LayoutManager needs to be set on the RecyclerView");
                                            }
                                        } else {
                                            throw new IllegalStateException("Adapter needs to be set!");
                                        }
                                    } else {
                                        Intrinsics.lima("binding");
                                        throw null;
                                    }
                                }
                                ticketsFragment.f12518g.bravo(CollectionsKt.emptyList());
                                ticketsFragment.romeo().alpha();
                                return;
                            default:
                                TicketsFragment ticketsFragment2 = this.purple;
                                if (!ticketsFragment2.f12522k) {
                                    ab abVar42 = ticketsFragment2.e;
                                    if (abVar42 != null) {
                                        RecyclerView recyclerView2 = (RecyclerView) abVar42.white;
                                        if (recyclerView2.getAdapter() != null) {
                                            if (recyclerView2.getLayoutManager() != null) {
                                                new S5.k(recyclerView2, ticketsFragment2.f12527p, 5, true, new q(recyclerView2.getLayoutManager()));
                                                ticketsFragment2.f12522k = true;
                                            } else {
                                                throw new IllegalStateException("LayoutManager needs to be set on the RecyclerView");
                                            }
                                        } else {
                                            throw new IllegalStateException("Adapter needs to be set!");
                                        }
                                    } else {
                                        Intrinsics.lima("binding");
                                        throw null;
                                    }
                                }
                                ticketsFragment2.f12519h.bravo(CollectionsKt.emptyList());
                                ticketsFragment2.romeo().bravo();
                                return;
                        }
                    }
                });
                return;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final TicketsViewModel romeo() {
        return (TicketsViewModel) this.f12517f.getValue();
    }

    public final void sierra() {
        String string;
        ab abVar = this.e;
        if (abVar != null) {
            ((RecyclerView) abVar.white).setVisibility(8);
            ab abVar2 = this.e;
            if (abVar2 != null) {
                ((ComposeView) abVar2.red).setVisibility(0);
                ab abVar3 = this.e;
                if (abVar3 != null) {
                    ((ComposeView) abVar3.purple).setVisibility(8);
                    ax axVar = this.f12524m;
                    if (this.f12520i == 0) {
                        string = getString(R.string.open_tickets);
                        Intrinsics.delta(string, "getString(...)");
                    } else {
                        string = getString(R.string.resolved_tickets);
                        Intrinsics.delta(string, "getString(...)");
                    }
                    ((t0) axVar).setValue(string);
                    ab abVar4 = this.e;
                    if (abVar4 != null) {
                        ((SwipeRefreshLayout) abVar4.silver).setRefreshing(false);
                        return;
                    } else {
                        Intrinsics.lima("binding");
                        throw null;
                    }
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final void tango() {
        ab abVar = this.e;
        if (abVar != null) {
            ((RecyclerView) abVar.white).setVisibility(0);
            ab abVar2 = this.e;
            if (abVar2 != null) {
                ((ComposeView) abVar2.red).setVisibility(8);
                ab abVar3 = this.e;
                if (abVar3 != null) {
                    ((ComposeView) abVar3.purple).setVisibility(0);
                    ab abVar4 = this.e;
                    if (abVar4 != null) {
                        ((SwipeRefreshLayout) abVar4.silver).setRefreshing(false);
                        return;
                    } else {
                        Intrinsics.lima("binding");
                        throw null;
                    }
                }
                Intrinsics.lima("binding");
                throw null;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final void uniform(int i4) {
        View view;
        TextView textView;
        ab abVar = this.e;
        if (abVar != null) {
            int tabCount = ((TabLayout) abVar.teal).getTabCount();
            for (int i5 = 0; i5 < tabCount; i5++) {
                ab abVar2 = this.e;
                if (abVar2 != null) {
                    g hotel = ((TabLayout) abVar2.teal).hotel(i5);
                    if (hotel != null) {
                        view = hotel.charlie;
                    } else {
                        view = null;
                    }
                    if (view instanceof TextView) {
                        textView = (TextView) view;
                    } else {
                        textView = null;
                    }
                    if (textView != null) {
                        if (i5 == i4) {
                            textView.setBackgroundResource(R.drawable.bg_area_tab_selected_v2);
                            textView.setTextColor(requireContext().getColor(R.color.coolgray_800));
                        } else {
                            textView.setBackgroundResource(R.drawable.bg_area_tab_unselected);
                            textView.setTextColor(requireContext().getColor(R.color.coolgray_500));
                        }
                    }
                } else {
                    Intrinsics.lima("binding");
                    throw null;
                }
            }
            return;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
