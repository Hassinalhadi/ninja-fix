package va;

import android.widget.TextView;
import com.app.network.network.models.RequestData;
import com.app.network.network.models.UserIdentityRequestResponse;
import com.app.network.network.models.UserIdentityStatus;
import delivery.samurai.android.ui.auth.signin.presentation.NafathVerificationActivity;
import delivery.samurai.android.ui.splash.AuthViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.ab;

/* renamed from: va.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3184e extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ NafathVerificationActivity purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3184e(NafathVerificationActivity nafathVerificationActivity, Nd.c cVar) {
        super(2, cVar);
        this.purple = nafathVerificationActivity;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3184e(this.purple, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3184e) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        UserIdentityRequestResponse userIdentityRequestResponse;
        J2.l lVar;
        String str;
        Integer random;
        int i4 = 1;
        Od.a aVar = Od.a.alpha;
        int i5 = this.alpha;
        NafathVerificationActivity nafathVerificationActivity = this.purple;
        try {
            if (i5 != 0) {
                if (i5 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                if (nafathVerificationActivity.f12168J <= 0) {
                    NafathVerificationActivity.gold(nafathVerificationActivity, UserIdentityStatus.UNKNOWN, new C3183d(nafathVerificationActivity, 0));
                    return Unit.INSTANCE;
                }
                AuthViewModel gray = nafathVerificationActivity.gray();
                long j5 = nafathVerificationActivity.f12168J;
                this.alpha = 1;
                obj = gray.getUserIdentityRequest(j5, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            userIdentityRequestResponse = (UserIdentityRequestResponse) obj;
            lVar = nafathVerificationActivity.f12171M;
            str = null;
        } catch (Throwable unused) {
            int i10 = NafathVerificationActivity.f12165N;
            nafathVerificationActivity.gray().stopNafathPolling();
            NafathVerificationActivity.gold(nafathVerificationActivity, UserIdentityStatus.UNKNOWN, new C3183d(nafathVerificationActivity, i4));
        }
        if (lVar != null) {
            TextView textView = (TextView) lVar.purple;
            RequestData data = userIdentityRequestResponse.getData();
            if (data != null && (random = data.getRandom()) != null) {
                str = random.toString();
            }
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            nafathVerificationActivity.f12170L = userIdentityRequestResponse.getClientDeepLink();
            return Unit.INSTANCE;
        }
        Intrinsics.lima("binding");
        throw null;
    }
}
