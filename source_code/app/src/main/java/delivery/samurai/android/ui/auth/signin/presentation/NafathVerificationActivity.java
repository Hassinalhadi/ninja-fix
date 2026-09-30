package delivery.samurai.android.ui.auth.signin.presentation;

import A9.a;
import B9.ab;
import J2.l;
import X9.g;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.T;
import com.app.base.BaseViewModel;
import com.app.network.network.models.UserIdentityStatus;
import com.google.android.material.button.MaterialButton;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signin.presentation.NafathVerificationActivity;
import delivery.samurai.android.ui.splash.AuthViewModel;
import e3.InterfaceC1627a;
import e3.InterfaceC1628b;
import id.C1915c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import t3.InterfaceC2956a;
import t3.InterfaceC2958c;
import t3.InterfaceC2960e;
import t6.S3;
import va.C3180a;
import va.C3184e;
import va.m;
import va.n;
import vf.ad;
import w9.j;
import w9.p;
import y9.C3403a;
import y9.C3404b;
import z9.C3484a;
import z9.C3488e;
import z9.C3490g;
import z9.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/auth/signin/presentation/NafathVerificationActivity;", "Ld3/k;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class NafathVerificationActivity extends k {

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ int f12165N = 0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12166H = false;

    /* renamed from: I, reason: collision with root package name */
    public final ab f12167I;

    /* renamed from: J, reason: collision with root package name */
    public long f12168J;

    /* renamed from: K, reason: collision with root package name */
    public String f12169K;

    /* renamed from: L, reason: collision with root package name */
    public String f12170L;

    /* renamed from: M, reason: collision with root package name */
    public l f12171M;

    public NafathVerificationActivity() {
        addOnContextAvailableListener(new C3180a(this, 0));
        this.f12167I = new ab(u.alpha.bravo(AuthViewModel.class), new m(this, 1), new m(this, 0), new m(this, 2));
    }

    public static final void gold(final NafathVerificationActivity nafathVerificationActivity, final UserIdentityStatus userIdentityStatus, final Function0 function0) {
        View inflate = nafathVerificationActivity.getLayoutInflater().inflate(R.layout.dialog_nafath_verification, (ViewGroup) null, false);
        int i4 = R.id.btnUpdate;
        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnUpdate, inflate);
        if (materialButton != null) {
            i4 = R.id.message;
            TextView textView = (TextView) S3.bravo(R.id.message, inflate);
            if (textView != null) {
                i4 = R.id.tvTitle;
                if (((TextView) S3.bravo(R.id.tvTitle, inflate)) != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) inflate;
                    final C1915c c1915c = new C1915c(linearLayoutCompat, materialButton, textView, 4);
                    final AlertDialog create = new AlertDialog.Builder(nafathVerificationActivity).setView(linearLayoutCompat).setCancelable(false).create();
                    create.setCanceledOnTouchOutside(false);
                    create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: va.b
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            boolean z2;
                            int i5;
                            int i10;
                            int i11;
                            int i12 = NafathVerificationActivity.f12165N;
                            C1915c c1915c2 = C1915c.this;
                            TextView textView2 = (TextView) ((LinearLayoutCompat) c1915c2.purple).findViewById(R.id.tvTitle);
                            NafathVerificationActivity nafathVerificationActivity2 = nafathVerificationActivity;
                            if (textView2 != null) {
                                textView2.setText(nafathVerificationActivity2.getString(R.string.title_nafath_verification));
                            }
                            UserIdentityStatus userIdentityStatus2 = UserIdentityStatus.APPROVED;
                            UserIdentityStatus userIdentityStatus3 = userIdentityStatus;
                            if (userIdentityStatus3 == userIdentityStatus2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int i13 = AbstractC3182c.$EnumSwitchMapping$0[userIdentityStatus3.ordinal()];
                            if (i13 != 1) {
                                if (i13 != 2) {
                                    if (i13 != 3) {
                                        if (i13 != 4) {
                                            i5 = R.string.error_something_went_wrong;
                                        } else {
                                            i5 = R.string.nafath_expired_msg;
                                        }
                                    } else {
                                        i5 = R.string.nafath_failed_msg;
                                    }
                                } else {
                                    i5 = R.string.nafath_rejected_msg;
                                }
                            } else {
                                i5 = R.string.nafath_verified_success;
                            }
                            String string = nafathVerificationActivity2.getString(i5);
                            TextView textView3 = (TextView) c1915c2.silver;
                            textView3.setText(string);
                            if (z2) {
                                i10 = android.R.color.holo_green_dark;
                            } else {
                                i10 = android.R.color.holo_red_dark;
                            }
                            textView3.setTextColor(nafathVerificationActivity2.getColor(i10));
                            if (z2) {
                                i11 = android.R.string.ok;
                            } else {
                                i11 = R.string.nafath_btn_return_login;
                            }
                            String string2 = nafathVerificationActivity2.getString(i11);
                            MaterialButton materialButton2 = (MaterialButton) c1915c2.red;
                            materialButton2.setText(string2);
                            materialButton2.setOnClickListener(new Kb.k(12, create, function0));
                        }
                    });
                    create.show();
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // d3.k
    public final BaseViewModel black() {
        return gray();
    }

    @Override // d3.q
    public final void foxtrot() {
        if (!this.f12166H) {
            this.f12166H = true;
            n nVar = (n) ((GeneratedComponentManagerHolder) UnsafeCasts.unsafeCast(this)).generatedComponent();
            NafathVerificationActivity nafathVerificationActivity = (NafathVerificationActivity) UnsafeCasts.unsafeCast(this);
            p pVar = ((j) nVar).alpha;
            nafathVerificationActivity.teal = (C3403a) pVar.sierra.get();
            nafathVerificationActivity.f12038c = (C3490g) pVar.uniform.get();
            nafathVerificationActivity.f12039d = (InterfaceC2958c) pVar.whiskey.get();
            nafathVerificationActivity.e = (InterfaceC2960e) pVar.xray.get();
            nafathVerificationActivity.f12040f = (InterfaceC2956a) pVar.yankee.get();
            nafathVerificationActivity.f12041g = (InterfaceC1628b) pVar.zulu.get();
            nafathVerificationActivity.f12042h = (z9.l) pVar.amber.get();
            nafathVerificationActivity.f12043i = (a) pVar.azure.get();
            nafathVerificationActivity.f12044j = (InterfaceC1627a) pVar.black.get();
            nafathVerificationActivity.f12045k = (C3488e) pVar.bronze.get();
            nafathVerificationActivity.f12046l = (C3484a) pVar.coral.get();
            nafathVerificationActivity.f12047m = (i) pVar.crimson.get();
            nafathVerificationActivity.f12048n = (z9.k) pVar.cyan.get();
            nafathVerificationActivity.f12049o = (C3404b) pVar.emerald.get();
            nafathVerificationActivity.f12050p = (g) pVar.gold.get();
        }
    }

    public final AuthViewModel gray() {
        return (AuthViewModel) this.f12167I.getValue();
    }

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_nafath_verification, (ViewGroup) null, false);
        int i4 = R.id.buttonNafath;
        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.buttonNafath, inflate);
        if (materialButton != null) {
            i4 = R.id.circleContainer;
            if (((FrameLayout) S3.bravo(R.id.circleContainer, inflate)) != null) {
                i4 = R.id.tvCode;
                TextView textView = (TextView) S3.bravo(R.id.tvCode, inflate);
                if (textView != null) {
                    i4 = R.id.tvSubtitle;
                    if (((TextView) S3.bravo(R.id.tvSubtitle, inflate)) != null) {
                        i4 = R.id.tvTitle;
                        if (((TextView) S3.bravo(R.id.tvTitle, inflate)) != null) {
                            LinearLayout linearLayout = (LinearLayout) inflate;
                            this.f12171M = new l(linearLayout, materialButton, textView);
                            setContentView(linearLayout);
                            this.f12168J = getIntent().getLongExtra("EXTRA_REQUEST_ID", 0L);
                            this.f12169K = getIntent().getStringExtra("EXTRA_SIGN_IN_RESPONSE");
                            ad.zulu(T.foxtrot(this), null, null, new C3184e(this, null), 3);
                            l lVar = this.f12171M;
                            if (lVar != null) {
                                ((MaterialButton) lVar.alpha).setOnClickListener(new com.clevertap.android.sdk.inapp.fragment.a(18, this));
                                ad.zulu(T.foxtrot(this), null, null, new va.l(this, null), 3);
                                return;
                            }
                            Intrinsics.lima("binding");
                            throw null;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // d3.k, d3.q, androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        gray().stopNafathPolling();
    }
}
