package Jb;

import android.content.Context;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.base.BaseViewModel;
import com.app.feature.location.store.LastSentLocationStore;
import com.app.network.network.models.UserInfo;
import com.google.mlkit.vision.barcode.common.Barcode;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import i.AbstractC1876y;
import i.C1874w;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import r3.C2492a;
import s6.AbstractC2717m7;
import t6.AbstractC3036o2;
import t6.S3;
import z3.C3462a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJb/p;", "Ld3/n;", "<init>", "()V", "", "hasInternet", "prevHasInternet", "Lcom/app/network/network/models/UserInfo;", "userInfo", "Lr3/a;", "Lna/f;", "orderUIState", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* renamed from: Jb.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0208p extends ak {
    public Nb.h e;

    /* renamed from: f, reason: collision with root package name */
    public LastSentLocationStore f1652f;

    /* renamed from: g, reason: collision with root package name */
    public final B9.ab f1653g;

    /* renamed from: h, reason: collision with root package name */
    public Aa.m f1654h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f1655i;

    /* renamed from: j, reason: collision with root package name */
    public final C0207o f1656j;

    /* renamed from: k, reason: collision with root package name */
    public final C0207o f1657k;

    /* renamed from: l, reason: collision with root package name */
    public final C0207o f1658l;

    public C0208p() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new Aa.g(24, new C0200h(this, 2)));
        this.f1653g = new B9.ab(kotlin.jvm.internal.u.alpha.bravo(OrdersViewModel.class), new Aa.h(alpha, 18), new Aa.i(13, this, alpha), new Aa.h(alpha, 19));
        this.f1656j = new C0207o(this, 1);
        this.f1657k = new C0207o(this, 0);
        this.f1658l = new C0207o(this, 2);
    }

    public static final boolean romeo(androidx.compose.runtime.ax axVar) {
        return ((Boolean) axVar.getValue()).booleanValue();
    }

    @Override // d3.n
    public final void november() {
        super.november();
        C3462a.alpha("FCM_DELIVERY", 12, "fetch source=manual fragment=ActiveOrdersFragmentV2", null);
        sierra();
        kilo().kilo();
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 700 && i5 == -1) {
            if (intent != null) {
                intent.getStringExtra("SCAN_RESULT");
            }
            sierra();
            kilo().kilo();
        }
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_active_orders_v2, viewGroup, false);
        int i4 = R.id.ordersComposeView;
        ComposeView composeView = (ComposeView) S3.bravo(R.id.ordersComposeView, inflate);
        if (composeView != null) {
            i4 = R.id.textView34;
            if (((TextView) S3.bravo(R.id.textView34, inflate)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                this.f1654h = new Aa.m(constraintLayout, composeView, 3);
                return constraintLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.ai
    public final void onPause() {
        super.onPause();
        Context context = getContext();
        if (context != null) {
            W1.b.alpha(context).delta(this.f1656j);
            W1.b.alpha(context).delta(this.f1657k);
            W1.b.alpha(context).delta(this.f1658l);
        }
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onResume() {
        super.onResume();
        C3462a.alpha("FCM_DELIVERY", 12, "fetch source=onResume fragment=ActiveOrdersFragmentV2", null);
        sierra();
        Context context = getContext();
        if (context != null) {
            W1.b.alpha(context).bravo(this.f1656j, d3.k.C);
            W1.b.alpha(context).bravo(this.f1657k, d3.k.f12035F);
            W1.b.alpha(context).bravo(this.f1658l, d3.k.f12034E);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        Aa.m mVar = this.f1654h;
        if (mVar != null) {
            ((ComposeView) mVar.purple).setContent(new P.d(new C0193a(this, 0), 1086721541, true));
            B9.ab abVar = this.f1653g;
            ((OrdersViewModel) abVar.getValue()).golf.observe(getViewLifecycleOwner(), new Dc.t(3, new C0199g(this, 0)));
            OrdersViewModel ordersViewModel = (OrdersViewModel) abVar.getValue();
            ?? auVar = new androidx.lifecycle.au(new C2492a(2, "loading"));
            BaseViewModel.launchApi$default(ordersViewModel, null, new na.q(ordersViewModel, auVar, null), 1, null);
            auVar.observe(getViewLifecycleOwner(), new Dc.t(3, new C0199g(this, 1)));
            return;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // d3.n
    public final void oscar() {
    }

    public final void quebec(OrdersViewModel ordersViewModel, androidx.lifecycle.al alVar, Function1 function1, Function0 function0, Function0 function02, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        C0585q c0585q;
        boolean z10;
        List emptyList;
        boolean z11;
        androidx.compose.runtime.ax axVar;
        boolean z12;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1417662663);
        if (c0585q2.india(ordersViewModel)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i15 = i4 | i5;
        if (c0585q2.india(alVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i16 = i15 | i10;
        if (c0585q2.india(function1)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i17 = i16 | i11;
        if (c0585q2.india(function0)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i18 = i17 | i12;
        if (c0585q2.india(function02)) {
            i13 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i13 = 8192;
        }
        int i19 = i18 | i13;
        if (c0585q2.india(this)) {
            i14 = 131072;
        } else {
            i14 = 65536;
        }
        int i20 = i19 | i14;
        if ((74899 & i20) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i20 & 1, z2)) {
            Context context = (Context) c0585q2.kilo(AndroidCompositionLocals_androidKt.bravo);
            Nb.h hVar = this.e;
            if (hVar != null) {
                androidx.compose.runtime.ax charlie = AbstractC2717m7.charlie(hVar.charlie, Boolean.TRUE, c0585q2, 48);
                Object jade = c0585q2.jade();
                Object obj = C0580l.alpha;
                if (jade == obj) {
                    jade = C0564b.zulu(Boolean.valueOf(romeo(charlie)));
                    c0585q2.f(jade);
                }
                androidx.compose.runtime.ax axVar2 = (androidx.compose.runtime.ax) jade;
                Boolean valueOf = Boolean.valueOf(romeo(charlie));
                boolean golf = c0585q2.golf(charlie);
                if ((i20 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z13 = golf | z10;
                Object jade2 = c0585q2.jade();
                if (z13 || jade2 == obj) {
                    jade2 = new C0202j(function0, axVar2, charlie, null);
                    c0585q2.f(jade2);
                }
                C0564b.foxtrot((Xd.l) jade2, c0585q2, valueOf);
                Object jade3 = c0585q2.jade();
                if (jade3 == obj) {
                    jade3 = C0564b.zulu(kilo().oscar().getValue());
                    c0585q2.f(jade3);
                }
                androidx.compose.runtime.ax axVar3 = (androidx.compose.runtime.ax) jade3;
                UserInfo userInfo = (UserInfo) axVar3.getValue();
                if (userInfo != null) {
                    userInfo.getCaptain();
                }
                androidx.lifecycle.az oscar = kilo().oscar();
                boolean india = c0585q2.india(this) | c0585q2.india(alVar);
                Object jade4 = c0585q2.jade();
                if (india || jade4 == obj) {
                    jade4 = new Cb.ac(this, alVar, axVar3, 1);
                    c0585q2.f(jade4);
                }
                C0564b.charlie(oscar, alVar, (Function1) jade4, c0585q2);
                Object jade5 = c0585q2.jade();
                if (jade5 == obj) {
                    jade5 = C0564b.zulu(new C2492a(2, "loading"));
                    c0585q2.f(jade5);
                }
                androidx.compose.runtime.ax axVar4 = (androidx.compose.runtime.ax) jade5;
                androidx.lifecycle.az azVar = ordersViewModel.golf;
                boolean india2 = c0585q2.india(ordersViewModel) | c0585q2.india(alVar);
                Object jade6 = c0585q2.jade();
                if (india2 || jade6 == obj) {
                    jade6 = new Cb.ac(ordersViewModel, alVar, axVar4, 2);
                    c0585q2.f(jade6);
                }
                C0564b.charlie(azVar, alVar, (Function1) jade6, c0585q2);
                int i21 = ((C2492a) axVar4.getValue()).alpha;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            emptyList = CollectionsKt.emptyList();
                        } else {
                            na.f fVar = (na.f) ((C2492a) axVar4.getValue()).charlie;
                            if (fVar == null || (emptyList = fVar.alpha) == null) {
                                emptyList = CollectionsKt.emptyList();
                            }
                        }
                    } else {
                        na.f fVar2 = (na.f) ((C2492a) axVar4.getValue()).charlie;
                        if (fVar2 == null || (emptyList = fVar2.alpha) == null) {
                            emptyList = CollectionsKt.emptyList();
                        }
                    }
                } else {
                    na.f fVar3 = (na.f) ((C2492a) axVar4.getValue()).charlie;
                    if (fVar3 == null || (emptyList = fVar3.alpha) == null) {
                        emptyList = CollectionsKt.emptyList();
                    }
                }
                if (((C2492a) axVar4.getValue()).alpha == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C1874w alpha = AbstractC1876y.alpha(c0585q2);
                boolean india3 = c0585q2.india(this) | c0585q2.golf(alpha);
                Object jade7 = c0585q2.jade();
                if (!india3 && jade7 != obj) {
                    axVar = axVar4;
                } else {
                    axVar = axVar4;
                    jade7 = new C0203k(this, alpha, null);
                    c0585q2.f(jade7);
                }
                C0564b.foxtrot((Xd.l) jade7, c0585q2, alpha);
                AbstractC3036o2.alpha(z11, function0, androidx.compose.foundation.layout.V.charlie, P.e.echo(1048343633, new C0194b(alpha, charlie, context, this, z11, emptyList, function1, axVar3), c0585q2), c0585q2, ((i20 >> 6) & 112) | 3456, 0);
                c0585q = c0585q2;
                Object jade8 = c0585q.jade();
                if (jade8 == obj) {
                    jade8 = new LinkedHashSet();
                    c0585q.f(jade8);
                }
                Set set = (Set) jade8;
                Integer valueOf2 = Integer.valueOf(((C2492a) axVar.getValue()).alpha);
                if ((57344 & i20) == 16384) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean india4 = c0585q.india(this) | z12 | c0585q.india(context) | c0585q.india(set) | c0585q.india(ordersViewModel);
                Object jade9 = c0585q.jade();
                if (india4 || jade9 == obj) {
                    C0205m c0205m = new C0205m(function02, this, axVar, axVar3, context, set, ordersViewModel, null);
                    c0585q.f(c0205m);
                    jade9 = c0205m;
                }
                C0564b.foxtrot((Xd.l) jade9, c0585q, valueOf2);
            } else {
                Intrinsics.lima("internetRepository");
                throw null;
            }
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0195c(this, ordersViewModel, alVar, function1, function0, function02, i4, 0);
        }
    }

    public final void sierra() {
        OrdersViewModel ordersViewModel = (OrdersViewModel) this.f1653g.getValue();
        BaseViewModel.launchApi$default(ordersViewModel, null, new na.o(ordersViewModel, null), 1, null);
    }
}
