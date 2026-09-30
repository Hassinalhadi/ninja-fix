package va;

import android.content.Intent;
import android.widget.TextView;
import com.app.network.network.models.RequestData;
import com.app.network.network.models.UserIdentityRequestResponse;
import com.app.network.network.models.UserIdentityStatus;
import delivery.samurai.android.ui.auth.signin.presentation.NafathVerificationActivity;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class f implements InterfaceC3440j {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ NafathVerificationActivity purple;

    public /* synthetic */ f(NafathVerificationActivity nafathVerificationActivity, int i4) {
        this.alpha = i4;
        this.purple = nafathVerificationActivity;
    }

    @Override // yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        Integer random;
        NafathVerificationActivity nafathVerificationActivity = this.purple;
        switch (this.alpha) {
            case 0:
                UserIdentityRequestResponse userIdentityRequestResponse = (UserIdentityRequestResponse) obj;
                if (userIdentityRequestResponse == null) {
                    return Unit.INSTANCE;
                }
                J2.l lVar = nafathVerificationActivity.f12171M;
                String str = null;
                if (lVar != null) {
                    RequestData data = userIdentityRequestResponse.getData();
                    if (data != null && (random = data.getRandom()) != null) {
                        str = random.toString();
                    }
                    if (str == null) {
                        str = "";
                    }
                    ((TextView) lVar.purple).setText(str);
                    return Unit.INSTANCE;
                }
                Intrinsics.lima("binding");
                throw null;
            case 1:
                int i4 = h.$EnumSwitchMapping$0[((UserIdentityStatus) obj).ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 4) {
                                NafathVerificationActivity.gold(nafathVerificationActivity, UserIdentityStatus.EXPIRED, new C3183d(nafathVerificationActivity, 4));
                            }
                        } else {
                            NafathVerificationActivity.gold(nafathVerificationActivity, UserIdentityStatus.FAILED, new C3183d(nafathVerificationActivity, 3));
                        }
                    } else {
                        NafathVerificationActivity.gold(nafathVerificationActivity, UserIdentityStatus.REJECTED, new C3183d(nafathVerificationActivity, 2));
                    }
                } else {
                    int i5 = NafathVerificationActivity.f12165N;
                    nafathVerificationActivity.gray().stopNafathPolling();
                    nafathVerificationActivity.setResult(-1, new Intent().putExtra("EXTRA_SIGN_IN_RESPONSE", nafathVerificationActivity.f12169K));
                    nafathVerificationActivity.finish();
                }
                return Unit.INSTANCE;
            default:
                NafathVerificationActivity.gold(nafathVerificationActivity, UserIdentityStatus.UNKNOWN, new C3183d(nafathVerificationActivity, 5));
                return Unit.INSTANCE;
        }
    }
}
