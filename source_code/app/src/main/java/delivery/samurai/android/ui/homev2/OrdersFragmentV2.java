package delivery.samurai.android.ui.homev2;

import B9.ab;
import J2.t;
import Jb.Z;
import Jb.al;
import Jb.b0;
import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import Nb.h;
import Nb.i;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.g;
import com.app.feature.location.LocationBroadcastConfig;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import p3.ah;
import u3.InterfaceC3143f;
import yf.AbstractC3428A;
import yf.N;

/* compiled from: Dex2C */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/homev2/OrdersFragmentV2;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes.dex */
public final class OrdersFragmentV2 extends al {
    public h e;

    /* renamed from: f, reason: collision with root package name */
    public LocationBroadcastConfig f12298f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC3143f f12299g;

    /* renamed from: h, reason: collision with root package name */
    public final ab f12300h;

    /* renamed from: i, reason: collision with root package name */
    public final ab f12301i;

    /* renamed from: j, reason: collision with root package name */
    public t f12302j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12303k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12304l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12305m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f12306n;

    /* renamed from: o, reason: collision with root package name */
    public g f12307o;

    /* renamed from: p, reason: collision with root package name */
    public g f12308p;

    /* renamed from: q, reason: collision with root package name */
    public final N f12309q;

    /* renamed from: r, reason: collision with root package name */
    public final N f12310r;

    /* renamed from: s, reason: collision with root package name */
    public final N f12311s;

    /* renamed from: t, reason: collision with root package name */
    public final N f12312t;

    /* renamed from: u, reason: collision with root package name */
    public final N f12313u;

    /* renamed from: v, reason: collision with root package name */
    public final i f12314v;

    /* renamed from: w, reason: collision with root package name */
    public final N f12315w;

    /* renamed from: x, reason: collision with root package name */
    public final Z f12316x;

    /* renamed from: y, reason: collision with root package name */
    public final Z f12317y;

    /* renamed from: z, reason: collision with root package name */
    public ah f12318z;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(128, OrdersFragmentV2.class);
        Hidden0.special_clinit_128_00(OrdersFragmentV2.class);
    }

    public OrdersFragmentV2() {
        v vVar = u.alpha;
        int i4 = 0;
        int i5 = 1;
        this.f12300h = new ab(vVar.bravo(HomeViewModelV2.class), new b0(this, i4), new b0(this, 2), new b0(this, i5));
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new Aa.g(27, new b0(this, 3)));
        this.f12301i = new ab(vVar.bravo(OrdersViewModel.class), new Aa.h(alpha, 22), new Aa.i(15, this, alpha), new Aa.h(alpha, 23));
        this.f12309q = AbstractC3428A.charlie(0);
        this.f12310r = AbstractC3428A.charlie(0);
        this.f12311s = AbstractC3428A.charlie(null);
        N charlie = AbstractC3428A.charlie(Boolean.FALSE);
        this.f12312t = charlie;
        this.f12313u = charlie;
        i iVar = new i();
        this.f12314v = iVar;
        this.f12315w = (N) iVar.silver;
        this.f12316x = new Z(this, i5);
        this.f12317y = new Z(this, i4);
    }

    public final native void amber(boolean z2);

    public final native void azure(boolean z2);

    public final native void beige();

    @Override // d3.n
    public final native void november();

    @Override // androidx.fragment.app.ai
    public final native void onActivityResult(int i4, int i5, Intent intent);

    @Override // androidx.fragment.app.ai
    public final native View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // androidx.fragment.app.ai
    public final native void onDestroyView();

    @Override // d3.n, androidx.fragment.app.ai
    public final native void onResume();

    @Override // d3.n, androidx.fragment.app.ai
    public final native void onViewCreated(View view, Bundle bundle);

    @Override // d3.n
    public final native void oscar();

    public final native void quebec();

    public final native void romeo();

    public final native void sierra();

    public final native void tango();

    public final native LocationBroadcastConfig uniform();

    public final native h victor();

    public final native HomeViewModelV2 whiskey();

    public final native boolean xray();

    public final native void yankee(boolean z2);

    public final native void zulu();
}
