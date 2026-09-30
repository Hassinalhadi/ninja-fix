package delivery.samurai.android.ui.auth.signup;

import A9.a;
import B9.ab;
import Lb.ae;
import android.os.Bundle;
import com.app.base.BaseViewModel;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.splash.AuthViewModel;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt;
import n.Y;
import pc.C2301b;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import va.C3180a;
import w9.j;
import w9.p;
import wa.f;
import wa.g;
import y9.C3403a;
import y9.C3404b;
import z1.d;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;
import z9.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/auth/signup/RegisterActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class RegisterActivity extends k {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f12181J = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12182H = false;

    /* renamed from: I, reason: collision with root package name */
    public final ab f12183I;

    public RegisterActivity() {
        addOnContextAvailableListener(new C3180a(this, 3));
        this.f12183I = new ab(u.alpha.bravo(AuthViewModel.class), new f(this, 1), new f(this, 0), new f(this, 2));
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return (AuthViewModel) this.f12183I.getValue();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12182H) {
            this.f12182H = true;
            g gVar = (g) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            RegisterActivity registerActivity = (RegisterActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) gVar).alpha;
            registerActivity.teal = (C3403a) pVar.sierra.get();
            registerActivity.f12038c = (C3490g) pVar.uniform.get();
            registerActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            registerActivity.e = (InterfaceC2960e) pVar.xray.get();
            registerActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            registerActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            registerActivity.f12042h = (l) pVar.amber.get();
            registerActivity.f12043i = (a) pVar.azure.get();
            registerActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            registerActivity.f12045k = (C3488e) pVar.bronze.get();
            registerActivity.f12046l = (C3484a) pVar.coral.get();
            registerActivity.f12047m = (i) pVar.crimson.get();
            registerActivity.f12048n = (z9.k) pVar.cyan.get();
            registerActivity.f12049o = (C3404b) pVar.emerald.get();
            registerActivity.f12050p = (X9.g) pVar.gold.get();
        }
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z1.g delta = d.delta(this, R.layout.activity_register);
        Intrinsics.delta(delta, "setContentView(...)");
        String stringExtra = getIntent().getStringExtra("request_id");
        String stringExtra2 = getIntent().getStringExtra("referral");
        ab abVar = this.f12183I;
        if (stringExtra != null) {
            ((AuthViewModel) abVar.getValue()).getSignUpRequestDetail(stringExtra).observe(this, new C2301b(7, new Y(23, this)));
        }
        if (L9.d.whiskey(this) && stringExtra2 != null && !StringsKt.gray(stringExtra2)) {
            ((AuthViewModel) abVar.getValue()).updateRequest(new ae(stringExtra2, 11));
        }
    }
}
