package delivery.samurai.android.ui.changePassword;

import B9.ab;
import Eb.b;
import J2.i;
import Sa.a;
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
import w9.j;
import w9.p;
import y9.C3403a;
import y9.C3404b;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/changePassword/ChangePasswordActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class ChangePasswordActivity extends k {

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f12232K = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12233H = false;

    /* renamed from: I, reason: collision with root package name */
    public final ab f12234I;

    /* renamed from: J, reason: collision with root package name */
    public i f12235J;

    public ChangePasswordActivity() {
        addOnContextAvailableListener(new b(this, 11));
        this.f12234I = new ab(u.alpha.bravo(AuthViewModel.class), new a(this, 1), new a(this, 0), new a(this, 2));
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return (AuthViewModel) this.f12234I.getValue();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12233H) {
            this.f12233H = true;
            Sa.b bVar = (Sa.b) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            ChangePasswordActivity changePasswordActivity = (ChangePasswordActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) bVar).alpha;
            changePasswordActivity.teal = (C3403a) pVar.sierra.get();
            changePasswordActivity.f12038c = (C3490g) pVar.uniform.get();
            changePasswordActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            changePasswordActivity.e = (InterfaceC2960e) pVar.xray.get();
            changePasswordActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            changePasswordActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            changePasswordActivity.f12042h = (l) pVar.amber.get();
            changePasswordActivity.f12043i = (A9.a) pVar.azure.get();
            changePasswordActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            changePasswordActivity.f12045k = (C3488e) pVar.bronze.get();
            changePasswordActivity.f12046l = (C3484a) pVar.coral.get();
            changePasswordActivity.f12047m = (z9.i) pVar.crimson.get();
            changePasswordActivity.f12048n = (z9.k) pVar.cyan.get();
            changePasswordActivity.f12049o = (C3404b) pVar.emerald.get();
            changePasswordActivity.f12050p = (g) pVar.gold.get();
        }
    }

    public final i gold() {
        i iVar = this.f12235J;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_change_password, (ViewGroup) null, false);
        int i4 = R.id.btnChangePassword;
        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnChangePassword, inflate);
        if (materialButton != null) {
            i4 = R.id.etPassword;
            if (((TextInputEditText) S3.bravo(R.id.etPassword, inflate)) != null) {
                i4 = R.id.ilConfirmPassword;
                TextInputLayout textInputLayout = (TextInputLayout) S3.bravo(R.id.ilConfirmPassword, inflate);
                if (textInputLayout != null) {
                    i4 = R.id.ilPassword;
                    TextInputLayout textInputLayout2 = (TextInputLayout) S3.bravo(R.id.ilPassword, inflate);
                    if (textInputLayout2 != null) {
                        i4 = R.id.linearLayout;
                        if (((LinearLayout) S3.bravo(R.id.linearLayout, inflate)) != null) {
                            i4 = R.id.logo;
                            if (((ImageView) S3.bravo(R.id.logo, inflate)) != null) {
                                this.f12235J = new i((ConstraintLayout) inflate, materialButton, textInputLayout, textInputLayout2);
                                setContentView((ConstraintLayout) gold().alpha);
                                i gold = gold();
                                ((MaterialButton) gold.purple).setOnClickListener(new Fb.b(this, 13));
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
