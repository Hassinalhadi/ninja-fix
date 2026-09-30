package delivery.samurai.android.ui.auth.signin.presentation;

import B9.ab;
import B9.r;
import J2.t;
import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import ah.a;
import ah.b;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.activity.result.ActivityResult;
import com.app.base.BaseViewModel;
import com.app.network.network.models.AppUpdate;
import com.app.network.network.models.UpdateActions;
import com.app.network.network.models.UserInfo;
import com.google.android.material.internal.s;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signin.presentation.SignInActivity;
import delivery.samurai.android.ui.common.LocationInfoActivity;
import delivery.samurai.android.ui.splash.AuthViewModel;
import g1.AbstractC1735d;
import g3.C1746g;
import g3.EnumC1747h;
import g3.m;
import g3.n;
import g3.o;
import g3.p;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import sb.C2844c;
import va.C3180a;
import va.x;

/* compiled from: Dex2C */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ldelivery/samurai/android/ui/auth/signin/presentation/SignInActivity;", "Ld3/k;", "<init>", "()V", "t6/C2", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes.dex */
public final class SignInActivity extends k {

    /* renamed from: P, reason: collision with root package name */
    public static final int f12172P = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12173H = false;

    /* renamed from: I, reason: collision with root package name */
    public final ab f12174I;

    /* renamed from: J, reason: collision with root package name */
    public r f12175J;

    /* renamed from: K, reason: collision with root package name */
    public final s f12176K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f12177L;

    /* renamed from: M, reason: collision with root package name */
    public final t f12178M;

    /* renamed from: N, reason: collision with root package name */
    public final b f12179N;

    /* renamed from: O, reason: collision with root package name */
    public final b f12180O;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(126, SignInActivity.class);
        Hidden0.special_clinit_126_00(SignInActivity.class);
    }

    public SignInActivity() {
        final int i4 = 0;
        int i5 = 1;
        addOnContextAvailableListener(new C3180a(this, i5));
        int i10 = 2;
        this.f12174I = new ab(u.alpha.bravo(AuthViewModel.class), new x(this, i5), new x(this, i4), new x(this, i10));
        this.f12176K = new s(8, this);
        EnumC1747h enumC1747h = EnumC1747h.purple;
        C1746g c1746g = new C1746g(y.sierra(new Pair(m.class, enumC1747h), new Pair(n.class, enumC1747h), new Pair(o.class, enumC1747h), new Pair(p.class, EnumC1747h.red)), false, true, true, true, true, null, new C2844c(5), new C2844c(6), new C2844c(7), new va.o(this, i10), null, null);
        t tVar = new t();
        tVar.alpha = c1746g;
        tVar.red = new com.google.firebase.messaging.o(this, c1746g);
        this.f12178M = tVar;
        this.f12179N = registerForActivityResult(new a4.s(6), new a(this) { // from class: va.q
            public final /* synthetic */ SignInActivity purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                String str;
                UserInfo userInfo;
                UpdateActions updateActions;
                int i11;
                int i12 = 3;
                SignInActivity signInActivity = this.purple;
                ActivityResult result = (ActivityResult) obj;
                switch (i4) {
                    case 0:
                        int i13 = SignInActivity.f12172P;
                        Intrinsics.echo(result, "result");
                        if (result.alpha == -1) {
                            signInActivity.gold();
                            return;
                        }
                        return;
                    default:
                        int i14 = SignInActivity.f12172P;
                        Intrinsics.echo(result, "result");
                        if (result.alpha == -1) {
                            Intent intent = result.purple;
                            if (intent != null) {
                                str = intent.getStringExtra("EXTRA_SIGN_IN_RESPONSE");
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                userInfo = (UserInfo) new com.google.gson.l().delta(UserInfo.class, str);
                            } else {
                                userInfo = null;
                            }
                            if (userInfo != null) {
                                ((AuthViewModel) signInActivity.f12174I.getValue()).completeLoginAfterNafathVerified(userInfo);
                                AppUpdate india = L9.d.india(signInActivity.lima());
                                if (india != null) {
                                    updateActions = india.getUpdateAction();
                                } else {
                                    updateActions = null;
                                }
                                if (updateActions == null) {
                                    i11 = -1;
                                } else {
                                    i11 = s.$EnumSwitchMapping$0[updateActions.ordinal()];
                                }
                                if (i11 != -1 && i11 != 1) {
                                    if (i11 != 2) {
                                        if (i11 == 3) {
                                            d3.k.azure(signInActivity, india, null, 4);
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        d3.k.azure(signInActivity, india, new p(signInActivity, i12), 2);
                                    }
                                } else if (AbstractC1735d.alpha(signInActivity, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                                    signInActivity.startActivityForResult(new Intent(signInActivity, (Class<?>) LocationInfoActivity.class), 1002);
                                } else {
                                    int i15 = SignInActivity.f12172P;
                                    signInActivity.uniform(signInActivity.getIntent());
                                }
                                signInActivity.green(userInfo);
                                return;
                            }
                            signInActivity.indigo(signInActivity.getString(R.string.error_something_went_wrong));
                            return;
                        }
                        return;
                }
            }
        });
        final int i11 = 1;
        this.f12180O = registerForActivityResult(new a4.s(5), new a(this) { // from class: va.q
            public final /* synthetic */ SignInActivity purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                String str;
                UserInfo userInfo;
                UpdateActions updateActions;
                int i112;
                int i12 = 3;
                SignInActivity signInActivity = this.purple;
                ActivityResult result = (ActivityResult) obj;
                switch (i11) {
                    case 0:
                        int i13 = SignInActivity.f12172P;
                        Intrinsics.echo(result, "result");
                        if (result.alpha == -1) {
                            signInActivity.gold();
                            return;
                        }
                        return;
                    default:
                        int i14 = SignInActivity.f12172P;
                        Intrinsics.echo(result, "result");
                        if (result.alpha == -1) {
                            Intent intent = result.purple;
                            if (intent != null) {
                                str = intent.getStringExtra("EXTRA_SIGN_IN_RESPONSE");
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                userInfo = (UserInfo) new com.google.gson.l().delta(UserInfo.class, str);
                            } else {
                                userInfo = null;
                            }
                            if (userInfo != null) {
                                ((AuthViewModel) signInActivity.f12174I.getValue()).completeLoginAfterNafathVerified(userInfo);
                                AppUpdate india = L9.d.india(signInActivity.lima());
                                if (india != null) {
                                    updateActions = india.getUpdateAction();
                                } else {
                                    updateActions = null;
                                }
                                if (updateActions == null) {
                                    i112 = -1;
                                } else {
                                    i112 = s.$EnumSwitchMapping$0[updateActions.ordinal()];
                                }
                                if (i112 != -1 && i112 != 1) {
                                    if (i112 != 2) {
                                        if (i112 == 3) {
                                            d3.k.azure(signInActivity, india, null, 4);
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        d3.k.azure(signInActivity, india, new p(signInActivity, i12), 2);
                                    }
                                } else if (AbstractC1735d.alpha(signInActivity, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                                    signInActivity.startActivityForResult(new Intent(signInActivity, (Class<?>) LocationInfoActivity.class), 1002);
                                } else {
                                    int i15 = SignInActivity.f12172P;
                                    signInActivity.uniform(signInActivity.getIntent());
                                }
                                signInActivity.green(userInfo);
                                return;
                            }
                            signInActivity.indigo(signInActivity.getString(R.string.error_something_went_wrong));
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Override // d3.k
    public final native BaseViewModel black();

    @Override // d3.k
    public final native boolean blue();

    @Override // d3.q
    public final native void foxtrot();

    public final native void gold();

    public final native r gray();

    public final native void green(UserInfo userInfo);

    public final native void indigo(String str);

    @Override // androidx.fragment.app.an, ae.o, android.app.Activity
    public final native void onActivityResult(int i4, int i5, Intent intent);

    @Override // ae.o, android.app.Activity
    public final native void onBackPressed();

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // d3.k, d3.q, androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public final native void onDestroy();

    @Override // androidx.appcompat.app.i, android.app.Activity, android.view.KeyEvent.Callback
    public native boolean onKeyDown(int i4, KeyEvent keyEvent);

    @Override // androidx.fragment.app.an, ae.o, android.app.Activity
    public final native void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr);

    @Override // d3.k, androidx.fragment.app.an, android.app.Activity
    public final native void onResume();
}
