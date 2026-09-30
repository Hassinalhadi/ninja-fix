package delivery.samurai.android.ui.splash;

import B9.ab;
import Eb.b;
import Fc.ai;
import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.content.Intent;
import android.os.Bundle;
import com.app.base.BaseViewModel;
import com.google.firebase.messaging.o;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* compiled from: Dex2C */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/splash/SplashActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes.dex */
public final class SplashActivity extends k {

    /* renamed from: L, reason: collision with root package name */
    public static final int f12488L = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12489H = false;

    /* renamed from: I, reason: collision with root package name */
    public final ab f12490I;

    /* renamed from: J, reason: collision with root package name */
    public o f12491J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f12492K;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(132, SplashActivity.class);
        Hidden0.special_clinit_132_00(SplashActivity.class);
    }

    public SplashActivity() {
        addOnContextAvailableListener(new b(this, 3));
        this.f12490I = new ab(u.alpha.bravo(AuthViewModel.class), new ai(this, 1), new ai(this, 0), new ai(this, 2));
    }

    @Override // d3.k
    public final native BaseViewModel black();

    @Override // d3.k
    public final native boolean blue();

    @Override // d3.q
    public final native void foxtrot();

    public final native o gold();

    public final native void gray();

    @Override // androidx.fragment.app.an, ae.o, android.app.Activity
    public final native void onActivityResult(int i4, int i5, Intent intent);

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.an, ae.o, android.app.Activity
    public final native void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr);

    @Override // d3.k, androidx.fragment.app.an, android.app.Activity
    public final native void onResume();
}
