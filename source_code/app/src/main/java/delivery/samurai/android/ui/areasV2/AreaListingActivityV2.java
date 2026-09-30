package delivery.samurai.android.ui.areasV2;

import B9.ab;
import Eb.b;
import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import U7.c;
import android.os.Bundle;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import com.app.base.BaseViewModel;
import com.app.feature.location.store.LastSentLocationStore;
import com.google.android.material.internal.s;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.u;
import oa.C2205d;

/* compiled from: Dex2C */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Ldelivery/samurai/android/ui/areasV2/AreaListingActivityV2;", "Ld3/k;", "<init>", "()V", "", "query", "", "visible", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes.dex */
public final class AreaListingActivityV2 extends k {

    /* renamed from: U, reason: collision with root package name */
    public static final int f12135U = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12136H = false;

    /* renamed from: I, reason: collision with root package name */
    public LastSentLocationStore f12137I;

    /* renamed from: J, reason: collision with root package name */
    public final ab f12138J;

    /* renamed from: K, reason: collision with root package name */
    public int f12139K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f12140L;

    /* renamed from: M, reason: collision with root package name */
    public int f12141M;

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f12142N;

    /* renamed from: O, reason: collision with root package name */
    public final ArrayList f12143O;

    /* renamed from: P, reason: collision with root package name */
    public final ax f12144P;
    public final ax Q;

    /* renamed from: R, reason: collision with root package name */
    public c f12145R;

    /* renamed from: S, reason: collision with root package name */
    public final Ca.c f12146S;

    /* renamed from: T, reason: collision with root package name */
    public final s f12147T;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(125, AreaListingActivityV2.class);
        Hidden0.special_clinit_125_00(AreaListingActivityV2.class);
    }

    public AreaListingActivityV2() {
        addOnContextAvailableListener(new b(this, 26));
        this.f12138J = new ab(u.alpha.bravo(AreaViewModelV2.class), new C2205d(this, 1), new C2205d(this, 0), new C2205d(this, 2));
        this.f12142N = new ArrayList();
        this.f12143O = new ArrayList();
        this.f12144P = C0564b.zulu("");
        this.Q = C0564b.zulu(Boolean.FALSE);
        this.f12146S = new Ca.c(17);
        this.f12147T = new s(20, this);
    }

    public final native void ArchersAreaRefreshing();

    public final native void ArchersRemoveEmptyBranch(String str);

    @Override // d3.k
    public final native BaseViewModel black();

    @Override // d3.q
    public final native void foxtrot();

    public final native void gold(String str);

    public final native void gray();

    public final native c green();

    public final native Pair indigo();

    public final native void ivory(int i4);

    public final native void jade(int i4);

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // d3.k, androidx.fragment.app.an, android.app.Activity
    public final native void onResume();
}
