package ga;

import androidx.lifecycle.az;
import com.app.network.network.models.UrPayUpdateRequest;
import com.checkout.components.kmp.rememberme.logging.LogMessages;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import r3.C2492a;
import retrofit2.HttpException;
import t3.InterfaceC2957b;

/* loaded from: classes2.dex */
public final class al extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ MyAccountViewModel purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ az teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(MyAccountViewModel myAccountViewModel, String str, String str2, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = myAccountViewModel;
        this.red = str;
        this.silver = str2;
        this.teal = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new al(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((al) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r14 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a9, code lost:
    
        if (r4 == null) goto L49;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ResponseBody responseBody;
        String str;
        String str2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        az azVar = this.teal;
        String msg = "Error parsing response";
        String str3 = "{}";
        String str4 = null;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                InterfaceC2957b interfaceC2957b = this.purple.alpha;
                UrPayUpdateRequest urPayUpdateRequest = new UrPayUpdateRequest(this.red, this.silver);
                this.alpha = 1;
                obj = interfaceC2957b.amber(urPayUpdateRequest, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            vg.aq aqVar = (vg.aq) obj;
            if (aqVar.alpha.getIsSuccessful()) {
                Unit unit = Unit.INSTANCE;
                C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a.charlie = unit;
                azVar.postValue(c2492a);
            } else {
                ResponseBody responseBody2 = aqVar.charlie;
                if (responseBody2 != null) {
                    str = responseBody2.string();
                } else {
                    str = null;
                }
                try {
                    if (str == null) {
                        str = "{}";
                    }
                    JSONObject optJSONObject = new JSONObject(str).optJSONObject("errors");
                    if (optJSONObject != null) {
                        str2 = optJSONObject.optString(RedirectCustomTabEventLogger.RESULT_ERROR);
                    }
                    str2 = LogMessages.UNKNOWN_ERROR;
                } catch (Exception unused) {
                    str2 = "Error parsing response";
                }
                azVar.postValue(new C2492a(0, str2));
            }
        } catch (Throwable th) {
            if (th instanceof HttpException) {
                vg.aq<?> response = ((HttpException) th).response();
                if (response != null && (responseBody = response.charlie) != null) {
                    str4 = responseBody.string();
                }
                try {
                    if (str4 != null) {
                        str3 = str4;
                    }
                    JSONObject optJSONObject2 = new JSONObject(str3).optJSONObject("errors");
                    if (optJSONObject2 != null) {
                        msg = optJSONObject2.optString(RedirectCustomTabEventLogger.RESULT_ERROR);
                    }
                    msg = LogMessages.UNKNOWN_ERROR;
                } catch (Exception unused2) {
                }
            } else if (th instanceof IOException) {
                msg = ((IOException) th).getLocalizedMessage();
            } else {
                msg = th.getLocalizedMessage();
                if (msg == null) {
                    msg = "Unexpected error occurred";
                }
            }
            Intrinsics.checkNotNull(msg);
            Intrinsics.echo(msg, "msg");
            azVar.postValue(new C2492a(0, msg));
        }
        return Unit.INSTANCE;
    }
}
