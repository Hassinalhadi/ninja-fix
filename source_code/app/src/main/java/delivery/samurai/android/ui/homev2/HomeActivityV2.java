package delivery.samurai.android.ui.homev2;

import B9.ab;
import Eb.b;
import J2.t;
import Jb.A;
import Jb.ao;
import Jb.ap;
import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import N9.m;
import Y1.r;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import com.app.base.BaseViewModel;
import com.app.feature.location.LocationBroadcastConfig;
import com.bumptech.glide.load.engine.h;
import com.google.android.material.navigation.NavigationView;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.ui.agreement.viewmodel.AgreementViewModel;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import delivery.samurai.android.ui.splash.AuthViewModel;
import id.C1915c;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import o2.C2191a;
import q3.g;
import z3.C3462a;

/* compiled from: Dex2C */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Ldelivery/samurai/android/ui/homev2/HomeActivityV2;", "Ld3/k;", "<init>", "()V", "LJb/aj;", "drawerState", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes.dex */
public final class HomeActivityV2 extends k {

    /* renamed from: k0, reason: collision with root package name */
    public static final int f12269k0 = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12270H = false;

    /* renamed from: I, reason: collision with root package name */
    public LocationBroadcastConfig f12271I;

    /* renamed from: J, reason: collision with root package name */
    public m f12272J;

    /* renamed from: K, reason: collision with root package name */
    public g f12273K;

    /* renamed from: L, reason: collision with root package name */
    public h f12274L;

    /* renamed from: M, reason: collision with root package name */
    public final ax f12275M;

    /* renamed from: N, reason: collision with root package name */
    public C1915c f12276N;

    /* renamed from: O, reason: collision with root package name */
    public NavigationView f12277O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f12278P;
    public final ab Q;

    /* renamed from: R, reason: collision with root package name */
    public final ab f12279R;

    /* renamed from: S, reason: collision with root package name */
    public final ab f12280S;

    /* renamed from: T, reason: collision with root package name */
    public t f12281T;

    /* renamed from: U, reason: collision with root package name */
    public r f12282U;

    /* renamed from: V, reason: collision with root package name */
    public final Lazy f12283V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f12284W;

    /* renamed from: X, reason: collision with root package name */
    public C2191a f12285X;

    /* renamed from: Y, reason: collision with root package name */
    public final Handler f12286Y;

    /* renamed from: Z, reason: collision with root package name */
    public final ap f12287Z;

    /* renamed from: a0, reason: collision with root package name */
    public final ap f12288a0;

    /* renamed from: b0, reason: collision with root package name */
    public final ap f12289b0;

    /* renamed from: c0, reason: collision with root package name */
    public long f12290c0;

    /* renamed from: d0, reason: collision with root package name */
    public final long f12291d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Jb.ax f12292e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Jb.ax f12293f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Jb.ax f12294g0;

    /* renamed from: h0, reason: collision with root package name */
    public androidx.appcompat.app.g f12295h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f12296i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Jb.ax f12297j0;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(127, HomeActivityV2.class);
        Hidden0.special_clinit_127_00(HomeActivityV2.class);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [Jb.ap] */
    /* JADX WARN: Type inference failed for: r1v11, types: [Jb.ap] */
    /* JADX WARN: Type inference failed for: r1v9, types: [Jb.ap] */
    public HomeActivityV2() {
        final int i4 = 0;
        int i5 = 8;
        addOnContextAvailableListener(new b(this, i5));
        this.f12275M = C0564b.zulu(Boolean.TRUE);
        A a6 = new A(this, i4);
        v vVar = u.alpha;
        final int i10 = 1;
        final int i11 = 2;
        this.Q = new ab(vVar.bravo(AgreementViewModel.class), new A(this, i10), a6, new A(this, i11));
        int i12 = 3;
        this.f12279R = new ab(vVar.bravo(AuthViewModel.class), new A(this, 4), new A(this, i12), new A(this, 5));
        this.f12280S = new ab(vVar.bravo(HomeViewModelV2.class), new A(this, 7), new A(this, 6), new A(this, i5));
        this.f12283V = LazyKt.lazy(new ao(this, i4));
        this.f12286Y = new Handler(Looper.getMainLooper());
        this.f12287Z = new Runnable(this) { // from class: Jb.ap
            public final /* synthetic */ HomeActivityV2 purple;

            {
                this.purple = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d3.k kVar = this.purple;
                switch (i4) {
                    case 0:
                        int i13 = HomeActivityV2.f12269k0;
                        kVar.november().echo(kVar);
                        C3462a.alpha("LocationFlow", 12, "Location service started and monitoring active", null);
                        return;
                    case 1:
                        int i14 = HomeActivityV2.f12269k0;
                        kVar.november().echo(kVar);
                        return;
                    default:
                        int i15 = HomeActivityV2.f12269k0;
                        Log.i("LocationFlow", "[ACTIVITY_RESULT_RETRY] Retrying location monitoring after user cancelled settings popup");
                        C3462a.alpha("LocationFlow", 12, "[ACTIVITY_RESULT_RETRY] Retrying location monitoring after user cancelled settings popup", null);
                        kVar.november().echo(kVar);
                        return;
                }
            }
        };
        this.f12288a0 = new Runnable(this) { // from class: Jb.ap
            public final /* synthetic */ HomeActivityV2 purple;

            {
                this.purple = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d3.k kVar = this.purple;
                switch (i10) {
                    case 0:
                        int i13 = HomeActivityV2.f12269k0;
                        kVar.november().echo(kVar);
                        C3462a.alpha("LocationFlow", 12, "Location service started and monitoring active", null);
                        return;
                    case 1:
                        int i14 = HomeActivityV2.f12269k0;
                        kVar.november().echo(kVar);
                        return;
                    default:
                        int i15 = HomeActivityV2.f12269k0;
                        Log.i("LocationFlow", "[ACTIVITY_RESULT_RETRY] Retrying location monitoring after user cancelled settings popup");
                        C3462a.alpha("LocationFlow", 12, "[ACTIVITY_RESULT_RETRY] Retrying location monitoring after user cancelled settings popup", null);
                        kVar.november().echo(kVar);
                        return;
                }
            }
        };
        this.f12289b0 = new Runnable(this) { // from class: Jb.ap
            public final /* synthetic */ HomeActivityV2 purple;

            {
                this.purple = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d3.k kVar = this.purple;
                switch (i11) {
                    case 0:
                        int i13 = HomeActivityV2.f12269k0;
                        kVar.november().echo(kVar);
                        C3462a.alpha("LocationFlow", 12, "Location service started and monitoring active", null);
                        return;
                    case 1:
                        int i14 = HomeActivityV2.f12269k0;
                        kVar.november().echo(kVar);
                        return;
                    default:
                        int i15 = HomeActivityV2.f12269k0;
                        Log.i("LocationFlow", "[ACTIVITY_RESULT_RETRY] Retrying location monitoring after user cancelled settings popup");
                        C3462a.alpha("LocationFlow", 12, "[ACTIVITY_RESULT_RETRY] Retrying location monitoring after user cancelled settings popup", null);
                        kVar.november().echo(kVar);
                        return;
                }
            }
        };
        this.f12291d0 = 300L;
        this.f12292e0 = new Jb.ax(this, i10);
        this.f12293f0 = new Jb.ax(this, i4);
        this.f12294g0 = new Jb.ax(this, i11);
        this.f12297j0 = new Jb.ax(this, i12);
    }

    public static final native void gold(HomeActivityV2 homeActivityV2);

    public static native void lime(HomeActivityV2 homeActivityV2);

    public static native void orange(HomeActivityV2 homeActivityV2);

    @Override // d3.k
    public final native BaseViewModel black();

    @Override // d3.k
    public final native boolean blue();

    @Override // d3.q
    public final native void foxtrot();

    public final native ArrayList gray();

    public final native boolean green();

    public final native String indigo();

    public final native void ivory();

    public final native t jade();

    public final native LocationBroadcastConfig lavender();

    public final native void magenta(Bundle bundle);

    public final native boolean maroon(int i4, Bundle bundle);

    public final native boolean navy(Function0 function0);

    public final native void ochre(L9.h hVar);

    public final native void olive();

    @Override // androidx.fragment.app.an, ae.o, android.app.Activity
    public final native void onActivityResult(int i4, int i5, Intent intent);

    public native void onClickFacebook(View view);

    public native void onClickInstagram(View view);

    public native void onClickTelegram(View view);

    public native void onClickWhatsApp(View view);

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // d3.k, d3.q, androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public final native void onDestroy();

    @Override // androidx.appcompat.app.i, android.app.Activity, android.view.KeyEvent.Callback
    public native boolean onKeyDown(int i4, KeyEvent keyEvent);

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final native boolean onKeyUp(int i4, KeyEvent keyEvent);

    @Override // ae.o, android.app.Activity
    public final native void onNewIntent(Intent intent);

    @Override // androidx.fragment.app.an, ae.o, android.app.Activity
    public final native void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr);

    @Override // d3.k, androidx.fragment.app.an, android.app.Activity
    public final native void onResume();

    @Override // androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public final native void onStop();

    @Override // androidx.appcompat.app.i
    public final native boolean onSupportNavigateUp();

    public final native void peach();

    public final native void pink();

    public final native void plum();

    @Override // d3.k
    public final native void zulu(int i4);
}
