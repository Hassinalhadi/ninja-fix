package Fb;

import B2.q;
import B9.AbstractC0067u;
import B9.ag;
import Cb.ad;
import Jb.C0211t;
import Qb.r;
import Ua.t;
import Y1.aa;
import Yb.C0313k;
import Yb.L0;
import Yb.T;
import Yb.W;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.I;
import androidx.fragment.app.L;
import androidx.lifecycle.au;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import com.app.base.BaseViewModel;
import com.app.network.network.models.ChangePasswordRequest;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullHtmlFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeCoverFragment;
import com.google.android.material.datepicker.RangeDateSelector;
import com.google.android.material.datepicker.u;
import com.google.android.material.datepicker.v;
import com.google.android.material.textfield.TextInputLayout;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.changePassword.ChangePasswordActivity;
import delivery.samurai.android.ui.envelop.EnvelopDetailActivity;
import delivery.samurai.android.ui.envelop.EnvelopsListingActivity;
import delivery.samurai.android.ui.envelopV2.EnvelopsListingActivityV2;
import delivery.samurai.android.ui.onboarding.TutorialActivity;
import delivery.samurai.android.ui.orders.OrderHistoryFragment;
import delivery.samurai.android.ui.orders.note.ui.AddressNoteActivity;
import delivery.samurai.android.ui.orders.note.ui.AllAddressNoteActivity;
import delivery.samurai.android.ui.splash.AuthViewModel;
import delivery.samurai.android.ui.support.AddSupportTicketActivity;
import delivery.samurai.android.ui.support.SupportFragment;
import delivery.samurai.android.ui.transfer.TransferCardListActivity;
import delivery.samurai.android.ui.withdraw.WalletTopUpActivity;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryFragment;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryViewModel;
import delivery.samurai.android.ui.zones.ZonesActivity;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r1.C2483b;
import r3.C2492a;
import t6.S2;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ View.OnCreateContextMenuListener purple;

    public /* synthetic */ b(View.OnCreateContextMenuListener onCreateContextMenuListener, int i4) {
        this.alpha = i4;
        this.purple = onCreateContextMenuListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a8, code lost:
    
        if (r0.compareTo(java.math.BigDecimal.ZERO) <= 0) goto L41;
     */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        String str;
        BigDecimal bigDecimal;
        String str2 = "";
        Integer num = null;
        int i4 = 1;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.purple;
        switch (this.alpha) {
            case 0:
                int i5 = EnvelopDetailActivity.f12246L;
                ((EnvelopDetailActivity) onCreateContextMenuListener).onBackPressed();
                return;
            case 1:
                int i10 = EnvelopsListingActivity.f12251M;
                ((EnvelopsListingActivity) onCreateContextMenuListener).onBackPressed();
                return;
            case 2:
                int i11 = EnvelopsListingActivityV2.Q;
                ((EnvelopsListingActivityV2) onCreateContextMenuListener).onBackPressed();
                return;
            case 3:
                int i12 = AddSupportTicketActivity.f12493K;
                ((AddSupportTicketActivity) onCreateContextMenuListener).onBackPressed();
                return;
            case 4:
                int i13 = AddSupportTicketActivity.f12493K;
                SupportFragment supportFragment = (SupportFragment) onCreateContextMenuListener;
                supportFragment.startActivity(new Intent(supportFragment.getContext(), (Class<?>) AddSupportTicketActivity.class));
                return;
            case 5:
                ((Kb.h) onCreateContextMenuListener).juliet();
                return;
            case 6:
                L parentFragmentManager = ((Nc.n) onCreateContextMenuListener).getParentFragmentManager();
                parentFragmentManager.getClass();
                parentFragmentManager.xray(new I(parentFragmentManager, null, -1, 0), false);
                return;
            case 7:
                int i14 = TutorialActivity.white;
                TutorialActivity tutorialActivity = (TutorialActivity) onCreateContextMenuListener;
                ((ViewPager) tutorialActivity.foxtrot().silver).setCurrentItem(((ViewPager) tutorialActivity.foxtrot().silver).getCurrentItem() + 1, true);
                return;
            case 8:
                ((Qb.h) onCreateContextMenuListener).lima(false, false);
                return;
            case 9:
                OrderHistoryFragment orderHistoryFragment = (OrderHistoryFragment) onCreateContextMenuListener;
                if (view.isSelected()) {
                    orderHistoryFragment.f12338f = orderHistoryFragment.e;
                    orderHistoryFragment.f12340h = orderHistoryFragment.f12339g;
                    view.setSelected(false);
                    ((SwipeRefreshLayout) orderHistoryFragment.romeo().delta).setRefreshing(true);
                    orderHistoryFragment.f12342j = 0;
                    orderHistoryFragment.quebec();
                    return;
                }
                u uVar = new u(new RangeDateSelector());
                uVar.delta = new C2483b(Long.valueOf(orderHistoryFragment.f12338f.getTime()), Long.valueOf(orderHistoryFragment.f12340h.getTime()));
                v alpha = uVar.alpha();
                alpha.f8005j.add(new Ba.c(1, new ad(17, orderHistoryFragment, view)));
                alpha.romeo(orderHistoryFragment.getParentFragmentManager(), "");
                return;
            case 10:
                ((Qb.n) onCreateContextMenuListener).lima(false, false);
                return;
            case 11:
                ((Qb.p) onCreateContextMenuListener).juliet();
                return;
            case 12:
                ((r) onCreateContextMenuListener).lima(false, false);
                return;
            case 13:
                int i15 = ChangePasswordActivity.f12232K;
                ChangePasswordActivity changePasswordActivity = (ChangePasswordActivity) onCreateContextMenuListener;
                ((TextInputLayout) changePasswordActivity.gold().silver).setError("");
                ((TextInputLayout) changePasswordActivity.gold().red).setError("");
                if (StringsKt.gray(S2.bravo((TextInputLayout) changePasswordActivity.gold().silver))) {
                    ((TextInputLayout) changePasswordActivity.gold().silver).setError(changePasswordActivity.getString(R.string.invalid_credentials));
                    return;
                } else {
                    if (S2.bravo((TextInputLayout) changePasswordActivity.gold().silver).compareTo(S2.bravo((TextInputLayout) changePasswordActivity.gold().red)) != 0) {
                        ((TextInputLayout) changePasswordActivity.gold().red).setError(changePasswordActivity.getString(R.string.confirm_password_not_matches));
                        return;
                    }
                    AuthViewModel authViewModel = (AuthViewModel) changePasswordActivity.f12234I.getValue();
                    String bravo = S2.bravo((TextInputLayout) changePasswordActivity.gold().silver);
                    String stringExtra = changePasswordActivity.getIntent().getStringExtra("userId");
                    if (stringExtra != null) {
                        num = Integer.valueOf(Integer.parseInt(stringExtra));
                    }
                    authViewModel.changePassword(new ChangePasswordRequest(bravo, num, changePasswordActivity.getIntent().getStringExtra("token"))).observe(changePasswordActivity, new Aa.f(14, new Aa.l(22, changePasswordActivity)));
                    return;
                }
            case 14:
                int i16 = TransferCardListActivity.f12528O;
                ((TransferCardListActivity) onCreateContextMenuListener).onBackPressed();
                return;
            case 15:
                Ua.m mVar = (Ua.m) onCreateContextMenuListener;
                mVar.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1000);
                mVar.lima(false, false);
                return;
            case 16:
                ((Ua.o) onCreateContextMenuListener).juliet();
                return;
            case 17:
                ((t) onCreateContextMenuListener).lima(false, false);
                return;
            case 18:
                Wb.m mVar2 = (Wb.m) onCreateContextMenuListener;
                ag agVar = mVar2.purple;
                if (agVar != null) {
                    agVar.f339f.cancelAnimation();
                    q qVar = mVar2.alpha;
                    if (qVar != null) {
                        qVar.invoke();
                    }
                    mVar2.dismiss();
                    return;
                }
                Intrinsics.lima("binding");
                throw null;
            case 19:
                int i17 = AllAddressNoteActivity.f12362R;
                AllAddressNoteActivity allAddressNoteActivity = (AllAddressNoteActivity) onCreateContextMenuListener;
                Intent intent = new Intent(allAddressNoteActivity, (Class<?>) AddressNoteActivity.class);
                intent.putExtra("taskAddressId", allAddressNoteActivity.f12367L);
                intent.putExtra("orderTaskId", allAddressNoteActivity.f12368M);
                intent.putExtra("KEY_HAS_SKIP", allAddressNoteActivity.f12369N);
                intent.putExtra("lat", allAddressNoteActivity.f12370O);
                intent.putExtra("lng", allAddressNoteActivity.f12371P);
                allAddressNoteActivity.Q.alpha(intent);
                return;
            case 20:
                ((Wc.l) onCreateContextMenuListener).juliet();
                return;
            case 21:
                WalletTopUpActivity walletTopUpActivity = (WalletTopUpActivity) onCreateContextMenuListener;
                AbstractC0067u abstractC0067u = walletTopUpActivity.f12540K;
                if (abstractC0067u != null) {
                    Editable text = abstractC0067u.f696h.getText();
                    if (text != null) {
                        str = text.toString();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        str2 = str;
                    }
                    try {
                        String obj = StringsKt.b(str2).toString();
                        if (walletTopUpActivity.f12539J.echo(obj)) {
                            bigDecimal = new BigDecimal(obj);
                            break;
                        }
                    } catch (Exception unused) {
                    }
                    bigDecimal = null;
                    if (bigDecimal == null) {
                        String string = walletTopUpActivity.getString(R.string.invalid_amount);
                        Intrinsics.delta(string, "getString(...)");
                        L9.d.pink(walletTopUpActivity, string);
                        return;
                    } else {
                        double doubleValue = bigDecimal.doubleValue();
                        WithDrawHistoryViewModel withDrawHistoryViewModel = (WithDrawHistoryViewModel) walletTopUpActivity.f12538I.getValue();
                        ?? auVar = new au(new C2492a(2, "loading"));
                        BaseViewModel.launchApi$default(withDrawHistoryViewModel, null, new Wc.u(withDrawHistoryViewModel, doubleValue, auVar, null), 1, null);
                        auVar.observe(walletTopUpActivity, new C0211t(i4, walletTopUpActivity));
                        return;
                    }
                }
                Intrinsics.lima("binding");
                throw null;
            case 22:
                WithDrawHistoryFragment withDrawHistoryFragment = (WithDrawHistoryFragment) onCreateContextMenuListener;
                Y1.r alpha2 = B7.b.alpha(withDrawHistoryFragment);
                aa foxtrot = alpha2.bravo.foxtrot();
                if (foxtrot == null || foxtrot.purple.charlie != R.id.nav_withdraw_history) {
                    alpha2 = null;
                }
                if (alpha2 != null) {
                    alpha2.charlie(R.id.nav_wallet, null, null);
                }
                Context context = withDrawHistoryFragment.getContext();
                if (context != null) {
                    L9.d.plum(context).edit().putBoolean("ShouldShowWithDrawToolTip", true).apply();
                    return;
                }
                return;
            case 23:
                int i18 = ZonesActivity.f12553I;
                ((ZonesActivity) onCreateContextMenuListener).onBackPressed();
                return;
            case 24:
                ((C0313k) onCreateContextMenuListener).juliet();
                return;
            case 25:
                ((T) onCreateContextMenuListener).lima(false, false);
                return;
            case 26:
                ((W) onCreateContextMenuListener).kilo();
                return;
            case 27:
                ((L0) onCreateContextMenuListener).juliet();
                return;
            case 28:
                CTInAppBaseFullHtmlFragment.displayHTMLView$lambda$0((CTInAppBaseFullHtmlFragment) onCreateContextMenuListener, view);
                return;
            default:
                CTInAppNativeCoverFragment.juliet((CTInAppNativeCoverFragment) onCreateContextMenuListener, view);
                return;
        }
    }
}
