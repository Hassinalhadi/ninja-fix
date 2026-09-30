package Yc;

import L9.d;
import N9.i;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.fragment.app.an;
import com.app.network.network.models.UserInfo;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import d3.k;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.areasV2.AreaListingActivityV2;
import delivery.samurai.android.ui.assets.AssetsListActivity;
import delivery.samurai.android.ui.auth.signin.presentation.SignInActivity;
import delivery.samurai.android.ui.auth.signup.RegisterActivity;
import delivery.samurai.android.ui.changePassword.ChangePasswordActivity;
import delivery.samurai.android.ui.chat.ChatActivity;
import delivery.samurai.android.ui.envelop.EnvelopsListingActivity;
import delivery.samurai.android.ui.envelopV2.EnvelopsListingActivityV2;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import delivery.samurai.android.ui.resetPassword.ResetPasswordActivity;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingListingActivityV2;
import delivery.samurai.android.ui.support.AddSupportTicketActivity;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import delivery.samurai.android.ui.transfer.TransferCardListActivity;
import delivery.samurai.android.ui.withdraw.WithdrawDetailActivity;
import delivery.samurai.android.ui.zones.ZonesActivity;
import f3.AbstractC1691a;
import java.net.URLDecoder;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import q3.g;
import t6.AbstractC2966a2;
import t6.C2;

/* loaded from: classes2.dex */
public final class a {
    public final an alpha;
    public final g bravo;

    public a(an activity, g featureFlagProvider) {
        Intrinsics.echo(activity, "activity");
        Intrinsics.echo(featureFlagProvider, "featureFlagProvider");
        this.alpha = activity;
        this.bravo = featureFlagProvider;
    }

    public final boolean alpha(String url) {
        boolean z2;
        String str;
        int i4;
        Integer num;
        Integer tango;
        Integer tango2;
        Long l10;
        k kVar;
        UserInfo userInfo;
        Context lima;
        an context = this.alpha;
        Intrinsics.echo(url, "url");
        try {
            Uri parse = Uri.parse(url);
            if (Intrinsics.areEqual(parse.getScheme(), "samuraicaptain")) {
                String queryParameter = parse.getQueryParameter("screen");
                if (queryParameter != null && AbstractC1691a.alpha.contains(queryParameter)) {
                    if (context instanceof k) {
                        kVar = (k) context;
                    } else {
                        kVar = null;
                    }
                    if (kVar != null && (lima = kVar.lima()) != null) {
                        userInfo = d.sierra(lima);
                    } else {
                        userInfo = null;
                    }
                    if (userInfo == null) {
                        int i5 = SignInActivity.f12172P;
                        Intent bravo = C2.bravo(context);
                        bravo.putExtra("deeplink", url);
                        context.startActivity(bravo);
                        return true;
                    }
                }
                try {
                    if (queryParameter != null) {
                        int hashCode = queryParameter.hashCode();
                        z2 = false;
                        g gVar = this.bravo;
                        switch (hashCode) {
                            case -2143834150:
                                if (!queryParameter.equals("assets_list")) {
                                    break;
                                } else {
                                    context.startActivity(new Intent(context, (Class<?>) AssetsListActivity.class));
                                    return true;
                                }
                            case -2110395297:
                                if (!queryParameter.equals("withdraw_history")) {
                                    break;
                                } else {
                                    bravo(R.id.nav_withdraw_history, url);
                                    return true;
                                }
                            case -1854767153:
                                if (!queryParameter.equals("support")) {
                                    break;
                                } else {
                                    charlie(url, new Y1.a(R.id.action_global_support));
                                    return true;
                                }
                            case -1590110411:
                                if (!queryParameter.equals("envelop")) {
                                    break;
                                } else {
                                    String queryParameter2 = parse.getQueryParameter(Constants.KEY_ID);
                                    if (((i) gVar).bravo(N9.a.hotel)) {
                                        if (queryParameter2 != null && !StringsKt.gray(queryParameter2)) {
                                            int i10 = EnvelopsListingActivityV2.Q;
                                            Intent intent = new Intent(context, (Class<?>) EnvelopsListingActivityV2.class);
                                            intent.putExtra("redirectId", queryParameter2);
                                            context.startActivity(intent);
                                            return true;
                                        }
                                        int i11 = EnvelopsListingActivityV2.Q;
                                        Intent intent2 = new Intent(context, (Class<?>) EnvelopsListingActivityV2.class);
                                        intent2.putExtra("redirectId", (String) null);
                                        context.startActivity(intent2);
                                        return true;
                                    }
                                    if (queryParameter2 != null && !StringsKt.gray(queryParameter2)) {
                                        int i12 = EnvelopsListingActivity.f12251M;
                                        context.startActivity(W8.a.golf(context, queryParameter2));
                                        return true;
                                    }
                                    int i13 = EnvelopsListingActivity.f12251M;
                                    context.startActivity(W8.a.golf(context, null));
                                    return true;
                                }
                                break;
                            case -1325362847:
                                if (!queryParameter.equals("shift_booking_list")) {
                                    break;
                                } else {
                                    context.startActivity(new Intent(context, (Class<?>) ShiftBookingListingActivityV2.class));
                                    return true;
                                }
                            case -1322977561:
                                if (!queryParameter.equals("tickets")) {
                                    break;
                                } else {
                                    bravo(R.id.nav_tickets, url);
                                    return true;
                                }
                            case -958726582:
                                if (!queryParameter.equals("change_password")) {
                                    break;
                                } else {
                                    String queryParameter3 = parse.getQueryParameter("user_id");
                                    String queryParameter4 = parse.getQueryParameter("token");
                                    int i14 = ChangePasswordActivity.f12232K;
                                    Intent intent3 = new Intent(context, (Class<?>) ChangePasswordActivity.class);
                                    intent3.putExtra("userId", queryParameter3);
                                    intent3.putExtra("token", queryParameter4);
                                    Intent addFlags = intent3.addFlags(32768).addFlags(268435456);
                                    Intrinsics.delta(addFlags, "addFlags(...)");
                                    context.startActivity(addFlags);
                                    return true;
                                }
                            case -940242166:
                                if (!queryParameter.equals("withdraw")) {
                                    break;
                                } else {
                                    bravo(R.id.nav_withdraw_history, url);
                                    return true;
                                }
                            case -903338959:
                                if (!queryParameter.equals("shifts")) {
                                    break;
                                } else {
                                    String queryParameter5 = parse.getQueryParameter(Constants.KEY_ID);
                                    if (queryParameter5 != null) {
                                        str = URLDecoder.decode(queryParameter5, "UTF-8");
                                    } else {
                                        str = null;
                                    }
                                    delta(str);
                                    return true;
                                }
                            case -795192327:
                                if (!queryParameter.equals("wallet")) {
                                    break;
                                } else {
                                    bravo(R.id.nav_wallet, url);
                                    return true;
                                }
                            case -525117557:
                                if (!queryParameter.equals("reset_password")) {
                                    break;
                                } else {
                                    context.startActivity(new Intent(context, (Class<?>) ResetPasswordActivity.class));
                                    return true;
                                }
                            case -507530029:
                                if (!queryParameter.equals("attendance_registry")) {
                                    break;
                                } else {
                                    bravo(R.id.attendance_registry, url);
                                    return true;
                                }
                            case -74079112:
                                if (!queryParameter.equals("points_redeem")) {
                                    break;
                                } else {
                                    bravo(R.id.nav_redeem, url);
                                    return true;
                                }
                            case 3052376:
                                if (!queryParameter.equals("chat")) {
                                    break;
                                } else {
                                    String queryParameter6 = parse.getQueryParameter(Constants.KEY_URL);
                                    if (queryParameter6 == null) {
                                        return false;
                                    }
                                    int i15 = ChatActivity.teal;
                                    Intent putExtra = new Intent(context, (Class<?>) ChatActivity.class).putExtra("CHAT_URL", queryParameter6);
                                    Intrinsics.delta(putExtra, "putExtra(...)");
                                    context.startActivity(putExtra);
                                    return true;
                                }
                            case 3357525:
                                if (!queryParameter.equals("more")) {
                                    break;
                                } else {
                                    if (((i) gVar).bravo(N9.a.india)) {
                                        i4 = R.id.nav_trophies_collections;
                                    } else {
                                        i4 = R.id.nav_more;
                                    }
                                    bravo(i4, url);
                                    return true;
                                }
                            case 109264530:
                                if (!queryParameter.equals("score")) {
                                    break;
                                } else {
                                    bravo(R.id.nav_score, url);
                                    return true;
                                }
                            case 116085319:
                                if (!queryParameter.equals("zones")) {
                                    break;
                                } else {
                                    context.startActivity(new Intent(context, (Class<?>) ZonesActivity.class));
                                    return true;
                                }
                            case 746841251:
                                if (!queryParameter.equals("order_history")) {
                                    break;
                                } else {
                                    bravo(R.id.nav_order_history, url);
                                    return true;
                                }
                            case 817037077:
                                if (!queryParameter.equals("zendesk_chat_detail")) {
                                    break;
                                } else {
                                    String queryParameter7 = parse.getQueryParameter(Constants.KEY_ID);
                                    if (queryParameter7 == null) {
                                        return false;
                                    }
                                    int i16 = ZenDeskChatActivity.f12498T;
                                    Intent intent4 = new Intent(context, (Class<?>) ZenDeskChatActivity.class);
                                    intent4.putExtra(Constants.KEY_ID, queryParameter7);
                                    context.startActivity(intent4);
                                    return true;
                                }
                            case 997054715:
                                if (!queryParameter.equals("support_new_ticket")) {
                                    break;
                                } else {
                                    String queryParameter8 = parse.getQueryParameter("order_id");
                                    if (queryParameter8 != null) {
                                        num = r.tango(queryParameter8);
                                    } else {
                                        num = null;
                                    }
                                    int i17 = AddSupportTicketActivity.f12493K;
                                    Intent intent5 = new Intent(context, (Class<?>) AddSupportTicketActivity.class);
                                    if (num != null) {
                                        intent5.putExtra("ORDER_ID", num.intValue());
                                    }
                                    context.startActivity(intent5);
                                    return true;
                                }
                            case 1152706235:
                                if (!queryParameter.equals("points_home")) {
                                    break;
                                } else {
                                    bravo(R.id.nav_points, url);
                                    return true;
                                }
                            case 1276119258:
                                if (!queryParameter.equals("training")) {
                                    break;
                                } else {
                                    echo(url);
                                    return true;
                                }
                            case 1348096994:
                                if (!queryParameter.equals("referral_program")) {
                                    break;
                                } else {
                                    bravo(R.id.nav_referral_program, url);
                                    return true;
                                }
                            case 1386675158:
                                if (!queryParameter.equals("points_vault")) {
                                    break;
                                } else {
                                    bravo(R.id.nav_points, url);
                                    return true;
                                }
                            case 1476291366:
                                if (!queryParameter.equals("withdraw_detail")) {
                                    break;
                                } else {
                                    String queryParameter9 = parse.getQueryParameter(Constants.KEY_ID);
                                    if (queryParameter9 == null || (tango = r.tango(queryParameter9)) == null) {
                                        return false;
                                    }
                                    int intValue = tango.intValue();
                                    int i18 = WithdrawDetailActivity.f12546N;
                                    Intent intent6 = new Intent(context, (Class<?>) WithdrawDetailActivity.class);
                                    intent6.putExtra("withdraw_ID", intValue);
                                    context.startActivity(intent6);
                                    return true;
                                }
                            case 1565253425:
                                if (!queryParameter.equals("points_transactions")) {
                                    break;
                                } else {
                                    bravo(R.id.nav_points, url);
                                    return true;
                                }
                            case 1584878802:
                                if (!queryParameter.equals("area_listing")) {
                                    break;
                                } else {
                                    String queryParameter10 = parse.getQueryParameter("branch_id");
                                    if (queryParameter10 == null && (queryParameter10 = parse.getQueryParameter(Constants.KEY_ID)) == null) {
                                        return false;
                                    }
                                    delta(URLDecoder.decode(queryParameter10, "UTF-8"));
                                    return true;
                                }
                                break;
                            case 1660959102:
                                if (!queryParameter.equals("process_order")) {
                                    break;
                                } else {
                                    String queryParameter11 = parse.getQueryParameter("order_id");
                                    if (queryParameter11 == null || (tango2 = r.tango(queryParameter11)) == null) {
                                        return false;
                                    }
                                    int intValue2 = tango2.intValue();
                                    int i19 = ProcessOrderActivityV2.f12378N0;
                                    context.startActivity(U8.a.golf(context, intValue2, null));
                                    return true;
                                }
                            case 1976116751:
                                if (!queryParameter.equals("transfer_cards")) {
                                    break;
                                } else {
                                    String queryParameter12 = parse.getQueryParameter(Constants.KEY_ID);
                                    if (queryParameter12 != null) {
                                        l10 = r.uniform(queryParameter12);
                                    } else {
                                        l10 = null;
                                    }
                                    int i20 = TransferCardListActivity.f12528O;
                                    Intrinsics.echo(context, "context");
                                    Intent intent7 = new Intent(context, (Class<?>) TransferCardListActivity.class);
                                    if (l10 != null) {
                                        intent7.putExtra("extra_transfer_card_id", l10.longValue());
                                    }
                                    intent7.addFlags(335544320);
                                    context.startActivity(intent7);
                                    return true;
                                }
                            case 2015954888:
                                if (!queryParameter.equals("points_rewards")) {
                                    break;
                                } else {
                                    bravo(R.id.nav_redeem, url);
                                    return true;
                                }
                            case 2088263399:
                                if (!queryParameter.equals("sign_in")) {
                                    break;
                                } else {
                                    int i21 = SignInActivity.f12172P;
                                    context.startActivity(C2.bravo(context));
                                    return true;
                                }
                            case 2088263773:
                                if (!queryParameter.equals("sign_up")) {
                                    break;
                                } else {
                                    String queryParameter13 = parse.getQueryParameter("referral");
                                    String queryParameter14 = parse.getQueryParameter("request_id");
                                    int i22 = RegisterActivity.f12181J;
                                    Intent intent8 = new Intent(context, (Class<?>) RegisterActivity.class);
                                    if (queryParameter14 != null) {
                                        intent8.putExtra("request_id", queryParameter14);
                                    }
                                    if (queryParameter13 != null) {
                                        intent8.putExtra("referral", queryParameter13);
                                    }
                                    context.startActivity(intent8);
                                    return true;
                                }
                        }
                    } else {
                        z2 = false;
                    }
                    d.peach(R.string.error_unknown_screen, context);
                    Log.w("DeepLink", "Unknown screen: " + parse.getQueryParameter("screen"));
                    return z2;
                } catch (Exception e) {
                    e = e;
                    Log.e("DeepLink", "Failed to handle deep link: ".concat(url), e);
                    d.peach(R.string.error_failed_to_open_link, context);
                    return false;
                }
            }
            return false;
        } catch (Exception e4) {
            e = e4;
        }
    }

    public final void bravo(int i4, String str) {
        HomeActivityV2 homeActivityV2;
        Object m206constructorimpl;
        boolean booleanValue;
        an anVar = this.alpha;
        if (anVar instanceof HomeActivityV2) {
            homeActivityV2 = (HomeActivityV2) anVar;
        } else {
            homeActivityV2 = null;
        }
        if (homeActivityV2 == null) {
            booleanValue = false;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                AbstractC2966a2.alpha(homeActivityV2).charlie(i4, null, null);
                m206constructorimpl = Result.m206constructorimpl(Boolean.TRUE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m207exceptionOrNullimpl(m206constructorimpl) != null) {
                m206constructorimpl = Boolean.FALSE;
            }
            booleanValue = ((Boolean) m206constructorimpl).booleanValue();
        }
        if (!booleanValue) {
            int i5 = HomeActivityV2.f12269k0;
            Intent addFlags = new Intent(anVar, (Class<?>) HomeActivityV2.class).addFlags(32768).addFlags(268435456);
            Intrinsics.delta(addFlags, "addFlags(...)");
            addFlags.putExtra("deeplink", str);
            addFlags.addFlags(335544320);
            anVar.startActivity(addFlags);
        }
    }

    public final void charlie(String str, Y1.a aVar) {
        HomeActivityV2 homeActivityV2;
        Object m206constructorimpl;
        boolean booleanValue;
        an anVar = this.alpha;
        if (anVar instanceof HomeActivityV2) {
            homeActivityV2 = (HomeActivityV2) anVar;
        } else {
            homeActivityV2 = null;
        }
        if (homeActivityV2 == null) {
            booleanValue = false;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                AbstractC2966a2.alpha(homeActivityV2).charlie(aVar.alpha, aVar.bravo, null);
                m206constructorimpl = Result.m206constructorimpl(Boolean.TRUE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m207exceptionOrNullimpl(m206constructorimpl) != null) {
                m206constructorimpl = Boolean.FALSE;
            }
            booleanValue = ((Boolean) m206constructorimpl).booleanValue();
        }
        if (!booleanValue) {
            int i4 = HomeActivityV2.f12269k0;
            Intent addFlags = new Intent(anVar, (Class<?>) HomeActivityV2.class).addFlags(32768).addFlags(268435456);
            Intrinsics.delta(addFlags, "addFlags(...)");
            addFlags.putExtra("deeplink", str);
            addFlags.addFlags(335544320);
            anVar.startActivity(addFlags);
        }
    }

    public final void delta(String str) {
        an context = this.alpha;
        if (str != null) {
            int i4 = AreaListingActivityV2.f12135U;
            Intrinsics.echo(context, "context");
            Intent intent = new Intent(context, (Class<?>) AreaListingActivityV2.class);
            intent.putExtra("branch_id", str);
            context.startActivity(intent);
            return;
        }
        d.peach(R.string.error_invalid_branch_id, context);
    }

    public final void echo(String str) {
        Object m206constructorimpl;
        boolean beige = StringsKt.beige(str, "youtube", false);
        an anVar = this.alpha;
        if (beige) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(Uri.parse(str).getQueryParameter(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            String str2 = null;
            if (m206constructorimpl instanceof kotlin.k) {
                m206constructorimpl = null;
            }
            String str3 = (String) m206constructorimpl;
            if (str3 != null && !StringsKt.gray(str3)) {
                str2 = str3;
            }
            try {
                if (str2 != null) {
                    anVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("vnd.youtube:".concat(str2))));
                } else {
                    anVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                }
                return;
            } catch (ActivityNotFoundException unused) {
                anVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return;
            }
        }
        d.coral(anVar, str);
    }
}
