package na;

import androidx.lifecycle.az;
import com.app.network.network.models.CsatRatingRequest;
import com.checkout.components.kmp.rememberme.logging.LogMessages;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.checkout.components.redirecthandler.utils.RedirectionConstants;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import java.io.IOException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.y;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import r3.C2492a;
import retrofit2.HttpException;
import t3.InterfaceC2958c;
import vf.ab;
import vg.aq;

/* loaded from: classes2.dex */
public final class r extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ OrdersViewModel purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ CsatRatingRequest silver;
    public final /* synthetic */ az teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(OrdersViewModel ordersViewModel, int i4, CsatRatingRequest csatRatingRequest, az azVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = ordersViewModel;
        this.red = i4;
        this.silver = csatRatingRequest;
        this.teal = azVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new r(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r14 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
    
        if (r5 == null) goto L49;
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
        String str3 = "Error parsing response";
        String str4 = "{}";
        String str5 = null;
        int i5 = this.red;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                InterfaceC2958c interfaceC2958c = this.purple.bravo;
                CsatRatingRequest csatRatingRequest = this.silver;
                this.alpha = 1;
                obj = interfaceC2958c.echo(i5, csatRatingRequest, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            aq aqVar = (aq) obj;
            if (aqVar.alpha.getIsSuccessful()) {
                Integer num = new Integer(aqVar.alpha.code());
                C2492a c2492a = new C2492a(1, RedirectionConstants.REDIRECT_SUCCESS_VALUE);
                c2492a.charlie = num;
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
            new Integer(i5);
            y.sierra(new Pair("method", "rateCsat"), new Pair("error_type", th.getClass().getSimpleName()));
            if (th instanceof HttpException) {
                aq<?> response = ((HttpException) th).response();
                if (response != null && (responseBody = response.charlie) != null) {
                    str5 = responseBody.string();
                }
                try {
                    if (str5 != null) {
                        str4 = str5;
                    }
                    JSONObject optJSONObject2 = new JSONObject(str4).optJSONObject("errors");
                    if (optJSONObject2 != null) {
                        str3 = optJSONObject2.optString(RedirectCustomTabEventLogger.RESULT_ERROR);
                    }
                    str3 = LogMessages.UNKNOWN_ERROR;
                } catch (Exception unused2) {
                }
            } else if (th instanceof IOException) {
                str3 = ((IOException) th).getLocalizedMessage();
                if (str3 == null) {
                    str3 = "Network error";
                }
            } else {
                str3 = th.getLocalizedMessage();
                if (str3 == null) {
                    str3 = "Unexpected error occurred";
                }
            }
            azVar.postValue(new C2492a(0, str3));
        }
        return Unit.INSTANCE;
    }
}
