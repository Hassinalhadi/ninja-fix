package Ba;

import B2.ad;
import B9.AbstractC0067u;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageButton;
import com.app.network.network.models.Country;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.auth.signup.SignUpActivity;
import delivery.samurai.android.ui.auth.signup.step2personalinfo.AboutYouFragment;
import delivery.samurai.android.ui.auth.signup.step3documents.ShareDocumentsFragment;
import delivery.samurai.android.ui.auth.signup.step4earnmoney.EarnYourMoneyFragment;
import delivery.samurai.android.ui.splash.AuthViewModel;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsFragment;
import delivery.samurai.android.ui.withdraw.WalletTopUpActivity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;

/* loaded from: classes2.dex */
public final class h implements TextWatcher {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ h(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    private final void alpha(Editable editable) {
    }

    private final void bravo(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void charlie(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void delta(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void echo(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void foxtrot(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void golf(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void hotel(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void india(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void juliet(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void kilo(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void lima(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void mike(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void november(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void oscar(int i4, int i5, int i10, CharSequence charSequence) {
    }

    private final void papa(int i4, int i5, int i10, CharSequence charSequence) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        List list;
        boolean z2;
        String obj;
        int i4;
        String obj2;
        String str2 = null;
        int i5 = 0;
        Object obj3 = this.purple;
        switch (this.alpha) {
            case 0:
                AboutYouFragment aboutYouFragment = (AboutYouFragment) obj3;
                aboutYouFragment.sierra().updateRequest(new a(aboutYouFragment, i5));
                aboutYouFragment.quebec();
                return;
            case 1:
                if (editable != null && (obj = editable.toString()) != null) {
                    str = StringsKt.b(obj).toString();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                n nVar = (n) obj3;
                if (str.length() == 0) {
                    list = nVar.f744y;
                    if (list == null) {
                        Intrinsics.lima("allNationalities");
                        throw null;
                    }
                } else {
                    List list2 = nVar.f744y;
                    if (list2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list2) {
                            String name = ((Country) obj4).getName();
                            if (name != null) {
                                z2 = StringsKt.beige(name, str, true);
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                arrayList.add(obj4);
                            }
                        }
                        list = arrayList;
                    } else {
                        Intrinsics.lima("allNationalities");
                        throw null;
                    }
                }
                nVar.A.bravo(list);
                return;
            case 2:
                ShareDocumentsFragment shareDocumentsFragment = (ShareDocumentsFragment) obj3;
                shareDocumentsFragment.sierra().updateRequest(new Aa.l(2, shareDocumentsFragment));
                shareDocumentsFragment.tango();
                shareDocumentsFragment.uniform((Da.a) shareDocumentsFragment.sierra().getUploadedDocument().getValue());
                return;
            case 3:
                EarnYourMoneyFragment earnYourMoneyFragment = (EarnYourMoneyFragment) obj3;
                ((AuthViewModel) earnYourMoneyFragment.e.getValue()).updateRequest(new Ea.b(earnYourMoneyFragment, i5));
                earnYourMoneyFragment.quebec();
                return;
            case 4:
                if (editable != null && (obj2 = editable.toString()) != null) {
                    str2 = StringsKt.b(obj2).toString();
                }
                if (str2 == null || str2.length() == 0) {
                    i5 = 1;
                }
                ZenDeskChatActivity zenDeskChatActivity = (ZenDeskChatActivity) obj3;
                ((ImageButton) zenDeskChatActivity.gray().delta).setEnabled(i5 ^ 1);
                ad gray = zenDeskChatActivity.gray();
                if (i5 == 0) {
                    i4 = R.drawable.bg_send_button_active;
                } else {
                    i4 = R.drawable.bg_send_button;
                }
                ((ImageButton) gray.delta).setBackgroundResource(i4);
                return;
            case 5:
                ((TicketDetailsFragment) obj3).tango();
                return;
            case 6:
                return;
            default:
                int i10 = SignUpActivity.f12184d0;
                ((SignUpActivity) obj3).ivory();
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        int i11 = this.alpha;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i10) {
        String obj;
        String obj2;
        BigDecimal bigDecimal;
        switch (this.alpha) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                boolean z2 = false;
                if (charSequence != null && (obj = charSequence.toString()) != null && (obj2 = StringsKt.b(obj).toString()) != null) {
                    if (r.juliet(obj2)) {
                        bigDecimal = new BigDecimal(obj2);
                        if (bigDecimal != null && bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
                            z2 = true;
                        }
                    }
                    bigDecimal = null;
                    if (bigDecimal != null) {
                        z2 = true;
                    }
                }
                AbstractC0067u abstractC0067u = ((WalletTopUpActivity) this.purple).f12540K;
                if (abstractC0067u != null) {
                    abstractC0067u.f694f.setEnabled(z2);
                    return;
                } else {
                    Intrinsics.lima("binding");
                    throw null;
                }
            default:
                return;
        }
    }
}
