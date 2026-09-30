package com.clevertap.android.sdk.inapp.fragment;

import Yb.F;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.camera.core.impl.I;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import com.app.network.network.models.CsatRatingRequest;
import com.app.network.network.models.CsatResponse;
import com.app.network.network.models.ResetPasswordRequest;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.i;
import com.google.android.material.textfield.t;
import d3.k;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.AccountQrCodeActivity;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import delivery.samurai.android.ui.areasV2.AreaListingActivityV2;
import delivery.samurai.android.ui.assets.AssetsListActivity;
import delivery.samurai.android.ui.attendanceRegistry.AttendanceRegistryFragment;
import delivery.samurai.android.ui.auth.signin.presentation.NafathVerificationActivity;
import delivery.samurai.android.ui.auth.signin.presentation.SignInActivity;
import delivery.samurai.android.ui.auth.signup.ApplicationSubmittedFragment;
import delivery.samurai.android.ui.redeem.presentation.RedeemFragment;
import delivery.samurai.android.ui.referralProgram.ReferYourFriendFragment;
import delivery.samurai.android.ui.resetPassword.ResetPasswordActivity;
import delivery.samurai.android.ui.scanner.ScannerActivity;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingListingActivityV2;
import delivery.samurai.android.ui.splash.AuthViewModel;
import ga.ac;
import ja.burhanrashid52.photoeditor.Graphic;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import n.Y;
import oc.C2219b;
import pc.C2301b;
import r3.C2492a;
import t6.C2;
import t6.S2;
import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt;
import va.p;
import wa.C3248d;
import x9.AbstractC3307a;
import x9.AbstractC3309c;
import xa.C3315b;
import zendesk.classic.messaging.MessagingActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ a(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object m206constructorimpl;
        int i4;
        I i5;
        Object obj = null;
        Object obj2 = this.purple;
        switch (this.alpha) {
            case 0:
                CTInAppNativeCoverImageFragment.juliet((CTInAppNativeCoverImageFragment) obj2, view);
                return;
            case 1:
                CTInAppNativeHalfInterstitialFragment.juliet((CTInAppNativeHalfInterstitialFragment) obj2, view);
                return;
            case 2:
                CTInAppNativeHalfInterstitialImageFragment.juliet((CTInAppNativeHalfInterstitialImageFragment) obj2, view);
                return;
            case 3:
                CTInAppNativeInterstitialImageFragment.juliet((CTInAppNativeInterstitialImageFragment) obj2, view);
                return;
            case 4:
                com.google.android.material.textfield.c cVar = (com.google.android.material.textfield.c) obj2;
                EditText editText = cVar.india;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    cVar.quebec();
                    return;
                }
                return;
            case 5:
                ((i) obj2).uniform();
                return;
            case 6:
                t tVar = (t) obj2;
                EditText editText2 = tVar.foxtrot;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = tVar.foxtrot;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        tVar.foxtrot.setTransformationMethod(null);
                    } else {
                        tVar.foxtrot.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        tVar.foxtrot.setSelection(selectionEnd);
                    }
                    tVar.quebec();
                    return;
                }
                return;
            case 7:
                ac acVar = (ac) obj2;
                String str = acVar.f12677j;
                if (str != null && !StringsKt.gray(str)) {
                    int i10 = AccountQrCodeActivity.f12107I;
                    Context requireContext = acVar.requireContext();
                    Intrinsics.delta(requireContext, "requireContext(...)");
                    Intent putExtra = new Intent(requireContext, (Class<?>) AccountQrCodeActivity.class).putExtra("extra_qr_text", str);
                    Intrinsics.delta(putExtra, "putExtra(...)");
                    acVar.startActivity(putExtra);
                    return;
                }
                k kilo = acVar.kilo();
                String string = acVar.getString(R.string.error_something_went_wrong);
                Intrinsics.delta(string, "getString(...)");
                L9.d.pink(kilo, string);
                return;
            case 8:
                Graphic.alpha((Graphic) obj2, view);
                return;
            case 9:
                ((mc.c) obj2).juliet();
                return;
            case 10:
                RedeemFragment redeemFragment = (RedeemFragment) obj2;
                redeemFragment.f12445i = 0;
                redeemFragment.quebec().alpha(redeemFragment.f12445i);
                return;
            case 11:
                int i11 = AreaListingActivityV2.f12135U;
                ((AreaListingActivityV2) obj2).onBackPressed();
                return;
            case 12:
                C2219b c2219b = (C2219b) obj2;
                F f5 = c2219b.f13131w;
                if (f5 != null) {
                    f5.invoke();
                }
                c2219b.juliet();
                return;
            case 13:
                ReferYourFriendFragment referYourFriendFragment = (ReferYourFriendFragment) obj2;
                Context context = referYourFriendFragment.getContext();
                if (context != null) {
                    obj = context.getSystemService("clipboard");
                }
                Intrinsics.charlie(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText("", ((TextView) referYourFriendFragment.quebec().teal).getText()));
                L9.d.peach(R.string.content_copied, referYourFriendFragment.kilo());
                return;
            case 14:
                int i12 = AssetsListActivity.Q;
                ((AssetsListActivity) obj2).onBackPressed();
                return;
            case 15:
                AttendanceRegistryFragment attendanceRegistryFragment = (AttendanceRegistryFragment) obj2;
                attendanceRegistryFragment.startActivityForResult(new Intent(attendanceRegistryFragment.getContext(), (Class<?>) ScannerActivity.class), attendanceRegistryFragment.f12163f);
                return;
            case 16:
                int i13 = ResetPasswordActivity.f12449K;
                ResetPasswordActivity resetPasswordActivity = (ResetPasswordActivity) obj2;
                ((TextInputLayout) resetPasswordActivity.gold().red).setError("");
                ((TextInputLayout) resetPasswordActivity.gold().silver).setError("");
                if (StringsKt.gray(S2.bravo((TextInputLayout) resetPasswordActivity.gold().red))) {
                    ((TextInputLayout) resetPasswordActivity.gold().red).setError(resetPasswordActivity.getString(R.string.invalid_id_number));
                    return;
                } else if (StringsKt.gray(S2.bravo((TextInputLayout) resetPasswordActivity.gold().silver))) {
                    ((TextInputLayout) resetPasswordActivity.gold().silver).setError(resetPasswordActivity.getString(R.string.invalid_four_digits));
                    return;
                } else {
                    ((AuthViewModel) resetPasswordActivity.f12452J.getValue()).resetPassword(new ResetPasswordRequest(S2.bravo((TextInputLayout) resetPasswordActivity.gold().silver), S2.bravo((TextInputLayout) resetPasswordActivity.gold().red))).observe(resetPasswordActivity, new C2301b(4, new Y(19, resetPasswordActivity)));
                    return;
                }
            case 17:
                ((MaterialTapTargetPrompt.PromptView) obj2).lambda$setupAccessibilityClickListener$0(view);
                return;
            case 18:
                NafathVerificationActivity nafathVerificationActivity = (NafathVerificationActivity) obj2;
                String str2 = nafathVerificationActivity.f12170L;
                if (str2 != null && !StringsKt.gray(str2)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        m206constructorimpl = Result.m206constructorimpl(Uri.parse(str2));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                    }
                    if (!(m206constructorimpl instanceof kotlin.k)) {
                        obj = m206constructorimpl;
                    }
                    Uri uri = (Uri) obj;
                    if (uri != null) {
                        boolean hotel = r.hotel(uri.getScheme(), "nic", true);
                        boolean hotel2 = r.hotel(uri.getHost(), "nafath", true);
                        if (hotel && hotel2 && new Intent("android.intent.action.VIEW", uri).resolveActivity(nafathVerificationActivity.getPackageManager()) != null) {
                            Intrinsics.checkNotNull(str2);
                            nafathVerificationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                            return;
                        }
                    }
                }
                nafathVerificationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=sa.gov.nic.myid&hl=ar&pli=1")));
                return;
            case 19:
                ScannerActivity scannerActivity = (ScannerActivity) obj2;
                boolean z2 = !scannerActivity.f12455L;
                scannerActivity.f12455L = z2;
                bo.b bVar = scannerActivity.f12456M;
                if (bVar != null && (i5 = bVar.red.f3380i) != null) {
                    i5.purple(z2);
                }
                Intrinsics.charlie(view, "null cannot be cast to non-null type android.widget.ImageButton");
                ImageButton imageButton = (ImageButton) view;
                if (scannerActivity.f12455L) {
                    i4 = R.drawable.ic_flash_on;
                } else {
                    i4 = R.drawable.ic_flash_off;
                }
                imageButton.setImageResource(i4);
                return;
            case 20:
                int i14 = SignInActivity.f12172P;
                ApplicationSubmittedFragment applicationSubmittedFragment = (ApplicationSubmittedFragment) obj2;
                applicationSubmittedFragment.startActivity(C2.bravo(applicationSubmittedFragment.getContext()));
                return;
            case 21:
                C3248d c3248d = (C3248d) obj2;
                if (!c3248d.f14036z) {
                    c3248d.f14036z = true;
                    c3248d.bronze().f379f.setEnabled(false);
                    OrdersViewModel ordersViewModel = (OrdersViewModel) c3248d.f14033w.getValue();
                    CsatResponse csatResponse = c3248d.f14035y;
                    if (csatResponse != null) {
                        int id2 = csatResponse.getId();
                        int i15 = c3248d.f14031u;
                        TextInputLayout ilFeedback = c3248d.bronze().f380g;
                        Intrinsics.delta(ilFeedback, "ilFeedback");
                        CsatRatingRequest csatRatingRequest = new CsatRatingRequest(i15, S2.bravo(ilFeedback));
                        ?? auVar = new au(new C2492a(2, "loading"));
                        BaseViewModel.launchApi$default(ordersViewModel, null, new na.r(ordersViewModel, id2, csatRatingRequest, auVar, null), 1, null);
                        auVar.observe(c3248d.getViewLifecycleOwner(), new C2301b(6, new Y(22, c3248d)));
                        return;
                    }
                    Intrinsics.lima("csat");
                    throw null;
                }
                return;
            case 22:
                ((AbstractC3307a) obj2).juliet();
                return;
            case 23:
                ((AbstractC3309c) obj2).lima(false, false);
                return;
            case 24:
                C3315b c3315b = (C3315b) obj2;
                p pVar = c3315b.f14112u;
                if (pVar != null) {
                    pVar.invoke();
                }
                c3315b.juliet();
                return;
            case 25:
                ((zc.c) obj2).juliet();
                return;
            case 26:
                int i16 = ShiftBookingListingActivityV2.f12464X;
                ((ShiftBookingListingActivityV2) obj2).onBackPressed();
                return;
            default:
                MessagingActivity.foxtrot((MessagingActivity) obj2, view);
                return;
        }
    }
}
