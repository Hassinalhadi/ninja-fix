package delivery.samurai.android.ui.assets;

import A9.a;
import B9.C0036e;
import B9.ab;
import Ca.c;
import Eb.b;
import F8.q;
import X9.g;
import android.content.Intent;
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
import com.google.android.material.internal.s;
import com.google.gson.l;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.assets.viewmodel.AssetViewModel;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import g.C1718a;
import h9.aq;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import n.Y;
import okhttp3.internal.ws.WebSocketProtocol;
import pc.C2301b;
import qa.e;
import qa.f;
import r3.C2492a;
import ra.C2511a;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import t6.S3;
import w9.j;
import w9.p;
import y9.C3403a;
import y9.C3404b;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/assets/AssetsListActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class AssetsListActivity extends k {
    public static final /* synthetic */ int Q = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12154H = false;

    /* renamed from: I, reason: collision with root package name */
    public final ab f12155I;

    /* renamed from: J, reason: collision with root package name */
    public int f12156J;

    /* renamed from: K, reason: collision with root package name */
    public final l f12157K;

    /* renamed from: L, reason: collision with root package name */
    public final int f12158L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f12159M;

    /* renamed from: N, reason: collision with root package name */
    public final c f12160N;

    /* renamed from: O, reason: collision with root package name */
    public C0036e f12161O;

    /* renamed from: P, reason: collision with root package name */
    public final s f12162P;

    public AssetsListActivity() {
        addOnContextAvailableListener(new b(this, 28));
        this.f12155I = new ab(u.alpha.bravo(AssetViewModel.class), new e(this, 1), new e(this, 0), new e(this, 2));
        this.f12157K = new l();
        this.f12158L = WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY;
        this.f12160N = new c(18);
        this.f12162P = new s(27, this);
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return (AssetViewModel) this.f12155I.getValue();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12154H) {
            this.f12154H = true;
            f fVar = (f) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            AssetsListActivity assetsListActivity = (AssetsListActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) fVar).alpha;
            assetsListActivity.teal = (C3403a) pVar.sierra.get();
            assetsListActivity.f12038c = (C3490g) pVar.uniform.get();
            assetsListActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            assetsListActivity.e = (InterfaceC2960e) pVar.xray.get();
            assetsListActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            assetsListActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            assetsListActivity.f12042h = (z9.l) pVar.amber.get();
            assetsListActivity.f12043i = (a) pVar.azure.get();
            assetsListActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            assetsListActivity.f12045k = (C3488e) pVar.bronze.get();
            assetsListActivity.f12046l = (C3484a) pVar.coral.get();
            assetsListActivity.f12047m = (i) pVar.crimson.get();
            assetsListActivity.f12048n = (z9.k) pVar.cyan.get();
            assetsListActivity.f12049o = (C3404b) pVar.emerald.get();
            assetsListActivity.f12050p = (g) pVar.gold.get();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    public final void gold() {
        AssetViewModel assetViewModel = (AssetViewModel) this.f12155I.getValue();
        int i4 = this.f12156J;
        ?? auVar = new au(new C2492a(2, "loading"));
        BaseViewModel.launchApi$default(assetViewModel, null, new C2511a(assetViewModel, i4, auVar, null), 1, null);
        auVar.observe(this, new C2301b(1, new Y(9, this)));
    }

    public final C0036e gray() {
        C0036e c0036e = this.f12161O;
        if (c0036e != null) {
            return c0036e;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // androidx.fragment.app.an, ae.o, android.app.Activity
    public final void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i5 == -1) {
            this.f12156J = 0;
            c cVar = this.f12160N;
            ArrayList arrayList = cVar.alpha;
            int size = arrayList.size();
            arrayList.clear();
            cVar.notifyItemRangeRemoved(0, size);
            cVar.notifyDataSetChanged();
            gold();
        }
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_assets, (ViewGroup) null, false);
        int i4 = R.id.emptyViewAssets;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) S3.bravo(R.id.emptyViewAssets, inflate);
        if (linearLayoutCompat != null) {
            i4 = R.id.recyclerViewAssets;
            RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.recyclerViewAssets, inflate);
            if (recyclerView != null) {
                i4 = R.id.swipeRefreshAssets;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) S3.bravo(R.id.swipeRefreshAssets, inflate);
                if (swipeRefreshLayout != null) {
                    i4 = R.id.toolbarAssets;
                    Toolbar toolbar = (Toolbar) S3.bravo(R.id.toolbarAssets, inflate);
                    if (toolbar != null) {
                        this.f12161O = new C0036e((ConstraintLayout) inflate, linearLayoutCompat, recyclerView, swipeRefreshLayout, toolbar);
                        setContentView(gray().alpha);
                        gray().delta.setRefreshing(true);
                        this.f12156J = 0;
                        gold();
                        RecyclerView recyclerView2 = gray().charlie;
                        c cVar = this.f12160N;
                        recyclerView2.setAdapter(cVar);
                        C0036e gray = gray();
                        gray.delta.setOnRefreshListener(new aq(11, this));
                        C0036e gray2 = gray();
                        gray2.echo.setNavigationOnClickListener(new com.clevertap.android.sdk.inapp.fragment.a(14, this));
                        RecyclerView recyclerView3 = gray().charlie;
                        if (recyclerView3.getAdapter() != null) {
                            if (recyclerView3.getLayoutManager() != null) {
                                new S5.k(recyclerView3, this.f12162P, 2, false, new q(recyclerView3.getLayoutManager()));
                                cVar.bravo = new C1718a(19, this);
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
