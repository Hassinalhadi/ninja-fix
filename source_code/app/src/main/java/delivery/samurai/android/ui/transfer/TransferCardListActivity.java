package delivery.samurai.android.ui.transfer;

import A9.a;
import B2.s;
import B9.C0036e;
import B9.ab;
import Dc.t;
import Eb.b;
import F8.q;
import O7.j;
import Sc.c;
import Sc.d;
import Sc.e;
import Sc.p;
import X9.g;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.au;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.app.base.BaseViewModel;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import r3.C2492a;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import t6.S3;
import y9.C3403a;
import y9.C3404b;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;
import z9.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/transfer/TransferCardListActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class TransferCardListActivity extends k {

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f12528O = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12529H = false;

    /* renamed from: I, reason: collision with root package name */
    public final ab f12530I;

    /* renamed from: J, reason: collision with root package name */
    public int f12531J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f12532K;

    /* renamed from: L, reason: collision with root package name */
    public final p f12533L;

    /* renamed from: M, reason: collision with root package name */
    public C0036e f12534M;

    /* renamed from: N, reason: collision with root package name */
    public final j f12535N;

    public TransferCardListActivity() {
        addOnContextAvailableListener(new b(this, 12));
        this.f12530I = new ab(u.alpha.bravo(TransferCardViewModel.class), new d(this, 1), new d(this, 0), new d(this, 2));
        this.f12533L = new p(0);
        this.f12535N = new j(7, this);
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return (TransferCardViewModel) this.f12530I.getValue();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12529H) {
            this.f12529H = true;
            e eVar = (e) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            TransferCardListActivity transferCardListActivity = (TransferCardListActivity) UnsafeCasts.unsafeCast(this);
            w9.p pVar = ((w9.j) eVar).alpha;
            transferCardListActivity.teal = (C3403a) pVar.sierra.get();
            transferCardListActivity.f12038c = (C3490g) pVar.uniform.get();
            transferCardListActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            transferCardListActivity.e = (InterfaceC2960e) pVar.xray.get();
            transferCardListActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            transferCardListActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            transferCardListActivity.f12042h = (l) pVar.amber.get();
            transferCardListActivity.f12043i = (a) pVar.azure.get();
            transferCardListActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            transferCardListActivity.f12045k = (C3488e) pVar.bronze.get();
            transferCardListActivity.f12046l = (C3484a) pVar.coral.get();
            transferCardListActivity.f12047m = (i) pVar.crimson.get();
            transferCardListActivity.f12048n = (z9.k) pVar.cyan.get();
            transferCardListActivity.f12049o = (C3404b) pVar.emerald.get();
            transferCardListActivity.f12050p = (g) pVar.gold.get();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public final void gold() {
        TransferCardViewModel transferCardViewModel = (TransferCardViewModel) this.f12530I.getValue();
        int i4 = this.f12531J;
        ?? auVar = new au(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(transferCardViewModel, null, new Sc.k(transferCardViewModel, i4, auVar, null), 1, null);
        auVar.observe(this, new t(9, new c(this, 0)));
    }

    public final C0036e gray() {
        C0036e c0036e = this.f12534M;
        if (c0036e != null) {
            return c0036e;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_transfer_card, (ViewGroup) null, false);
        int i4 = R.id.emptyViewCard;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) S3.bravo(R.id.emptyViewCard, inflate);
        if (linearLayoutCompat != null) {
            i4 = R.id.recyclerViewCards;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.recyclerViewCards, inflate);
            if (recyclerView != null) {
                i4 = R.id.swipeRefreshCards;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) S3.bravo(R.id.swipeRefreshCards, inflate);
                if (swipeRefreshLayout != null) {
                    i4 = R.id.toolbarAssets;
                    Toolbar toolbar = (Toolbar) S3.bravo(R.id.toolbarAssets, inflate);
                    if (toolbar != null) {
                        this.f12534M = new C0036e((ConstraintLayout) inflate, linearLayoutCompat, recyclerView, swipeRefreshLayout, toolbar);
                        setContentView(gray().alpha);
                        gray().delta.setRefreshing(true);
                        this.f12531J = 0;
                        gold();
                        RecyclerView recyclerView2 = gray().charlie;
                        p pVar = this.f12533L;
                        recyclerView2.setAdapter(pVar);
                        C0036e gray = gray();
                        gray.delta.setOnRefreshListener(new s(26, this));
                        C0036e gray2 = gray();
                        gray2.echo.setNavigationOnClickListener(new Fb.b(this, 14));
                        pVar.delta = new Sc.b(this, 0);
                        pVar.echo = new Sc.b(this, 1);
                        RecyclerView recyclerView3 = gray().charlie;
                        if (recyclerView3.getAdapter() != null) {
                            if (recyclerView3.getLayoutManager() != null) {
                                new S5.k(recyclerView3, this.f12535N, 2, false, new q(recyclerView3.getLayoutManager()));
                                return;
                            }
                            throw new IllegalStateException("LayoutManager needs to be set on the RecyclerView");
                        }
                        throw new IllegalStateException("Adapter needs to be set!");
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }
}
