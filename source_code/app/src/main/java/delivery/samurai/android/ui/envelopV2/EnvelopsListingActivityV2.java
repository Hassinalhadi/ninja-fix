package delivery.samurai.android.ui.envelopV2;

import A9.a;
import Aa.e;
import Aa.f;
import B2.s;
import B9.ab;
import D8.c;
import Eb.b;
import Gb.l;
import Gb.m;
import Gb.n;
import Gb.o;
import P.d;
import X9.g;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import av.ao;
import com.app.base.BaseViewModel;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import t6.S3;
import w9.j;
import w9.p;
import x9.AbstractC3311e;
import y9.C3403a;
import y9.C3404b;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Ldelivery/samurai/android/ui/envelopV2/EnvelopsListingActivityV2;", "Ld3/k;", "<init>", "()V", "Gb/m", "u8/b", "selected", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class EnvelopsListingActivityV2 extends k {
    public static final /* synthetic */ int Q = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12260H = false;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f12261I;

    /* renamed from: J, reason: collision with root package name */
    public final ax f12262J;

    /* renamed from: K, reason: collision with root package name */
    public final ab f12263K;

    /* renamed from: L, reason: collision with root package name */
    public ao f12264L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f12265M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f12266N;

    /* renamed from: O, reason: collision with root package name */
    public m f12267O;

    /* renamed from: P, reason: collision with root package name */
    public final l f12268P;

    /* JADX WARN: Type inference failed for: r0v8, types: [Gb.l, x9.e] */
    public EnvelopsListingActivityV2() {
        addOnContextAvailableListener(new b(this, 5));
        this.f12261I = new ArrayList();
        this.f12262J = C0564b.zulu(Boolean.FALSE);
        this.f12263K = new ab(u.alpha.bravo(EnvelopsViewModelV2.class), new n(this, 1), new n(this, 0), new n(this, 2));
        this.f12266N = true;
        this.f12267O = m.alpha;
        this.f12268P = new AbstractC3311e();
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return green();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12260H) {
            this.f12260H = true;
            o oVar = (o) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            EnvelopsListingActivityV2 envelopsListingActivityV2 = (EnvelopsListingActivityV2) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) oVar).alpha;
            envelopsListingActivityV2.teal = (C3403a) pVar.sierra.get();
            envelopsListingActivityV2.f12038c = (C3490g) pVar.uniform.get();
            envelopsListingActivityV2.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            envelopsListingActivityV2.e = (InterfaceC2960e) pVar.xray.get();
            envelopsListingActivityV2.f12040f = (InterfaceC2956a) pVar.yankee.get();
            envelopsListingActivityV2.f12041g = (InterfaceC1628b) pVar.zulu.get();
            envelopsListingActivityV2.f12042h = (z9.l) pVar.amber.get();
            envelopsListingActivityV2.f12043i = (a) pVar.azure.get();
            envelopsListingActivityV2.f12044j = (InterfaceC1627a) pVar.black.get();
            envelopsListingActivityV2.f12045k = (C3488e) pVar.bronze.get();
            envelopsListingActivityV2.f12046l = (C3484a) pVar.coral.get();
            envelopsListingActivityV2.f12047m = (i) pVar.crimson.get();
            envelopsListingActivityV2.f12048n = (z9.k) pVar.cyan.get();
            envelopsListingActivityV2.f12049o = (C3404b) pVar.emerald.get();
            envelopsListingActivityV2.f12050p = (g) pVar.gold.get();
        }
    }

    public final void gold(m mVar) {
        this.f12266N = true;
        this.f12265M = false;
        int ordinal = mVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    green().alpha("ALERT");
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
            green().alpha("MESSAGE");
            return;
        }
        green().alpha(null);
    }

    public final ao gray() {
        ao aoVar = this.f12264L;
        if (aoVar != null) {
            return aoVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final EnvelopsViewModelV2 green() {
        return (EnvelopsViewModelV2) this.f12263K.getValue();
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_envelops_listing_v2, (ViewGroup) null, false);
        int i4 = R.id.emptyView;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) S3.bravo(R.id.emptyView, inflate);
        if (linearLayoutCompat != null) {
            i4 = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.recyclerView, inflate);
            if (recyclerView != null) {
                i4 = R.id.swipeRefresh;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) S3.bravo(R.id.swipeRefresh, inflate);
                if (swipeRefreshLayout != null) {
                    i4 = R.id.tabsView;
                    ComposeView composeView = (ComposeView) S3.bravo(R.id.tabsView, inflate);
                    if (composeView != null) {
                        i4 = R.id.toolbar;
                        Toolbar toolbar = (Toolbar) S3.bravo(R.id.toolbar, inflate);
                        if (toolbar != null) {
                            this.f12264L = new ao((ConstraintLayout) inflate, linearLayoutCompat, recyclerView, swipeRefreshLayout, composeView, toolbar);
                            setContentView((ConstraintLayout) gray().alpha);
                            ((RecyclerView) gray().red).setBackgroundColor(-1);
                            ao gray = gray();
                            ((ComposeView) gray.teal).setContent(new d(new Ac.k(5, this), 2068895957, true));
                            RecyclerView recyclerView2 = (RecyclerView) gray().red;
                            l lVar = this.f12268P;
                            recyclerView2.setAdapter(lVar);
                            ao gray2 = gray();
                            ((RecyclerView) gray2.red).addOnScrollListener(new e(2, this));
                            green().charlie.observe(this, new f(8, new Aa.l(9, this)));
                            gold(this.f12267O);
                            ao gray3 = gray();
                            ((SwipeRefreshLayout) gray3.silver).setOnRefreshListener(new s(4, this));
                            ao gray4 = gray();
                            ((Toolbar) gray4.white).setNavigationOnClickListener(new Fb.b(this, 2));
                            lVar.bravo = new c(11, this);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }
}
