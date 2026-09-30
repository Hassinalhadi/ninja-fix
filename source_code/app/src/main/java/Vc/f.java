package Vc;

import Lb.am;
import android.content.Context;
import androidx.compose.runtime.ax;
import com.app.network.network.models.Payment;
import com.app.network.network.models.PaymentSession;
import com.checkout.components.core.CheckoutComponentsFactory;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.api.CheckoutComponents;
import com.checkout.components.interfaces.component.CheckoutComponentConfigurationKt;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.PaymentSessionResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import vf.ab;

/* loaded from: classes2.dex */
public final class f extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ PaymentSession purple;
    public final /* synthetic */ Payment red;
    public final /* synthetic */ Context silver;
    public final /* synthetic */ Function0 teal;
    public final /* synthetic */ Function0 white;
    public final /* synthetic */ ax yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PaymentSession paymentSession, Payment payment, Context context, Function0 function0, Function0 function02, ax axVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = paymentSession;
        this.red = payment;
        this.silver = context;
        this.teal = function0;
        this.white = function02;
        this.yellow = axVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new f(this.purple, this.red, this.silver, this.teal, this.white, this.yellow, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045 A[Catch: Exception -> 0x00cb, TryCatch #0 {Exception -> 0x00cb, blocks: (B:5:0x0010, B:7:0x00ae, B:15:0x0022, B:18:0x0037, B:23:0x0045, B:24:0x004b, B:26:0x0053, B:28:0x005a, B:31:0x0057), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053 A[Catch: Exception -> 0x00cb, TryCatch #0 {Exception -> 0x00cb, blocks: (B:5:0x0010, B:7:0x00ae, B:15:0x0022, B:18:0x0037, B:23:0x0045, B:24:0x004b, B:26:0x0053, B:28:0x005a, B:31:0x0057), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[Catch: Exception -> 0x00cb, TryCatch #0 {Exception -> 0x00cb, blocks: (B:5:0x0010, B:7:0x00ae, B:15:0x0022, B:18:0x0037, B:23:0x0045, B:24:0x004b, B:26:0x0053, B:28:0x005a, B:31:0x0057), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Environment environment;
        Object create;
        PaymentSession paymentSession = this.purple;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        Function0 function0 = this.teal;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                    create = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                PaymentSessionResponse paymentSessionResponse = new PaymentSessionResponse(paymentSession.getId(), paymentSession.getToken(), paymentSession.getSecret());
                Payment payment = this.red;
                if (payment != null) {
                    str = payment.getPublicKey();
                    if (str == null) {
                    }
                    String str3 = str;
                    if (payment == null) {
                        str2 = payment.getEnvironment();
                    } else {
                        str2 = null;
                    }
                    if (!kotlin.text.r.hotel(str2, "SANDBOX", true)) {
                        environment = Environment.SANDBOX;
                    } else {
                        environment = Environment.PRODUCTION;
                    }
                    CheckoutComponentsFactory checkoutComponentsFactory = new CheckoutComponentsFactory(CheckoutComponentConfigurationKt.CheckoutComponentConfiguration$default(this.silver, str3, environment, paymentSessionResponse, null, null, null, null, null, new ComponentCallback(new am(22), null, new am(23), new Ec.l(this.white, 4), new Ec.l(function0, 5), null, null, null, null, 482, null), 496, null));
                    this.alpha = 1;
                    create = checkoutComponentsFactory.create(this);
                    if (create == aVar) {
                        return aVar;
                    }
                }
                str = "";
                String str32 = str;
                if (payment == null) {
                }
                if (!kotlin.text.r.hotel(str2, "SANDBOX", true)) {
                }
                CheckoutComponentsFactory checkoutComponentsFactory2 = new CheckoutComponentsFactory(CheckoutComponentConfigurationKt.CheckoutComponentConfiguration$default(this.silver, str32, environment, paymentSessionResponse, null, null, null, null, null, new ComponentCallback(new am(22), null, new am(23), new Ec.l(this.white, 4), new Ec.l(function0, 5), null, null, null, null, 482, null), 496, null));
                this.alpha = 1;
                create = checkoutComponentsFactory2.create(this);
                if (create == aVar) {
                }
            }
            this.yellow.setValue(new P.d(new F4.c(M4.a.alpha((CheckoutComponents) create, ComponentName.Flow.INSTANCE, null, 2, null), 1), -567462333, true));
        } catch (Exception unused) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
