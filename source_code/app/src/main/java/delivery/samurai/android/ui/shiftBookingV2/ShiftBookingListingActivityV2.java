package delivery.samurai.android.ui.shiftBookingV2;

import Ac.c;
import Ac.r;
import Ac.s;
import B9.ab;
import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.i1;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import com.app.base.BaseViewModel;
import com.app.feature.location.store.LastSentLocationStore;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.ui.agreement.viewmodel.AgreementViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import s1.C2576i;
import va.C3180a;
import zc.i;
import zc.l;

/* compiled from: Dex2C */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/shiftBookingV2/ShiftBookingListingActivityV2;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes.dex */
public final class ShiftBookingListingActivityV2 extends k {

    /* renamed from: X, reason: collision with root package name */
    public static final int f12464X = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12465H = false;

    /* renamed from: I, reason: collision with root package name */
    public LastSentLocationStore f12466I;

    /* renamed from: J, reason: collision with root package name */
    public final ab f12467J;

    /* renamed from: K, reason: collision with root package name */
    public final ab f12468K;

    /* renamed from: L, reason: collision with root package name */
    public int f12469L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f12470M;

    /* renamed from: N, reason: collision with root package name */
    public final ax f12471N;

    /* renamed from: O, reason: collision with root package name */
    public final ax f12472O;

    /* renamed from: P, reason: collision with root package name */
    public int f12473P;
    public Long Q;

    /* renamed from: R, reason: collision with root package name */
    public String f12474R;

    /* renamed from: S, reason: collision with root package name */
    public String f12475S;

    /* renamed from: T, reason: collision with root package name */
    public Long f12476T;

    /* renamed from: U, reason: collision with root package name */
    public i1 f12477U;

    /* renamed from: V, reason: collision with root package name */
    public final i f12478V;

    /* renamed from: W, reason: collision with root package name */
    public final C2576i f12479W;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(130, ShiftBookingListingActivityV2.class);
        Hidden0.special_clinit_130_00(ShiftBookingListingActivityV2.class);
    }

    public ShiftBookingListingActivityV2() {
        addOnContextAvailableListener(new C3180a(this, 6));
        l lVar = new l(this, 0);
        v vVar = u.alpha;
        this.f12467J = new ab(vVar.bravo(ShiftBookingViewModelV2.class), new l(this, 1), lVar, new l(this, 2));
        this.f12468K = new ab(vVar.bravo(AgreementViewModel.class), new l(this, 4), new l(this, 3), new l(this, 5));
        this.f12471N = C0564b.zulu(new r(new c("", null), null, s.alpha));
        this.f12472O = C0564b.zulu(CollectionsKt.emptyList());
        this.f12478V = new i();
        this.f12479W = new C2576i(this);
    }

    public final native ArrayList ArchersGetShifts();

    public final native void ArchersShiftBooks(long j5);

    public final native void ArchersShiftRefreshing();

    @Override // d3.k
    public final native BaseViewModel black();

    @Override // d3.k
    public final native boolean blue();

    @Override // d3.q
    public final native void foxtrot();

    public final native void gold();

    public final native void gray();

    public final native i1 green();

    public final native void indigo();

    @Override // androidx.fragment.app.an, ae.o, android.app.Activity
    public final native void onActivityResult(int i4, int i5, Intent intent);

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // d3.k, d3.q, androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public native void onDestroy();

    @Override // d3.k, androidx.fragment.app.an, android.app.Activity
    public final native void onResume();
}
