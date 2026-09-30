package delivery.samurai.android.ui.resetPassword;

import A9.a;
import B9.ab;
import Eb.b;
import J2.n;
import X9.g;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.base.BaseViewModel;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
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
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import t6.S3;
import uc.C3151a;
import uc.InterfaceC3152b;
import w9.j;
import w9.p;
import y9.C3403a;
import y9.C3404b;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;
import z9.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/resetPassword/ResetPasswordActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class ResetPasswordActivity extends k {

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f12449K = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12450H = false;

    /* renamed from: I, reason: collision with root package name */
    public n f12451I;

    /* renamed from: J, reason: collision with root package name */
    public final ab f12452J;

    public ResetPasswordActivity() {
        addOnContextAvailableListener(new b(this, 29));
        this.f12452J = new ab(u.alpha.bravo(AuthViewModel.class), new C3151a(this, 1), new C3151a(this, 0), new C3151a(this, 2));
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return (AuthViewModel) this.f12452J.getValue();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12450H) {
            this.f12450H = true;
            InterfaceC3152b interfaceC3152b = (InterfaceC3152b) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            ResetPasswordActivity resetPasswordActivity = (ResetPasswordActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) interfaceC3152b).alpha;
            resetPasswordActivity.teal = (C3403a) pVar.sierra.get();
            resetPasswordActivity.f12038c = (C3490g) pVar.uniform.get();
            resetPasswordActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            resetPasswordActivity.e = (InterfaceC2960e) pVar.xray.get();
            resetPasswordActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            resetPasswordActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            resetPasswordActivity.f12042h = (l) pVar.amber.get();
            resetPasswordActivity.f12043i = (a) pVar.azure.get();
            resetPasswordActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            resetPasswordActivity.f12045k = (C3488e) pVar.bronze.get();
            resetPasswordActivity.f12046l = (C3484a) pVar.coral.get();
            resetPasswordActivity.f12047m = (i) pVar.crimson.get();
            resetPasswordActivity.f12048n = (z9.k) pVar.cyan.get();
            resetPasswordActivity.f12049o = (C3404b) pVar.emerald.get();
            resetPasswordActivity.f12050p = (g) pVar.gold.get();
        }
    }

    public final n gold() {
        n nVar = this.f12451I;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_reset_password, (ViewGroup) null, false);
        int i4 = R.id.btnResetPassword;
        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnResetPassword, inflate);
        if (materialButton != null) {
            i4 = R.id.etIdNumber;
            if (((TextInputEditText) S3.bravo(R.id.etIdNumber, inflate)) != null) {
                i4 = R.id.ilIdNumber;
                TextInputLayout textInputLayout = (TextInputLayout) S3.bravo(R.id.ilIdNumber, inflate);
                if (textInputLayout != null) {
                    i4 = R.id.ilLastFourDigits;
                    TextInputLayout textInputLayout2 = (TextInputLayout) S3.bravo(R.id.ilLastFourDigits, inflate);
                    if (textInputLayout2 != null) {
                        i4 = R.id.linearLayout;
                        if (((LinearLayout) S3.bravo(R.id.linearLayout, inflate)) != null) {
                            i4 = R.id.logo;
                            if (((ImageView) S3.bravo(R.id.logo, inflate)) != null) {
                                this.f12451I = new n((ConstraintLayout) inflate, materialButton, textInputLayout, textInputLayout2);
                                setContentView((ConstraintLayout) gold().alpha);
                                n gold = gold();
                                ((MaterialButton) gold.purple).setOnClickListener(new com.clevertap.android.sdk.inapp.fragment.a(16, this));
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }
}
