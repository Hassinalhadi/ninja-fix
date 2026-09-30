package Lb;

import com.app.network.network.models.Order;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.kmp.rememberme.preview.PreviewConstants;
import com.checkout.components.kmp.rememberme.shared.model.ClickTarget;
import com.checkout.components.kmp.rememberme.shared.model.RememberMeConfig;
import delivery.samurai.android.notifications.MyFirebaseMessagingService;
import delivery.samurai.android.ui.orders.note.ui.AddressNoteActivity;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import z3.C3462a;

/* loaded from: classes2.dex */
public final /* synthetic */ class am implements Function1 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ am(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i4 = 0;
        switch (this.alpha) {
            case 0:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 1:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 2:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 3:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 4:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 5:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 6:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 7:
                Order order = (Order) obj;
                Intrinsics.echo(order, "order");
                Integer id2 = order.getId();
                if (id2 == null) {
                    return Integer.valueOf(order.hashCode());
                }
                return id2;
            case 8:
                return Unit.INSTANCE;
            case 9:
                return (N2.h) obj;
            case 10:
                return Unit.INSTANCE;
            case 11:
                return Country.charlie((char[]) obj);
            case 12:
                Lf.a buildSerialDescriptor = (Lf.a) obj;
                Intrinsics.echo(buildSerialDescriptor, "$this$buildSerialDescriptor");
                Lf.a.alpha(buildSerialDescriptor, "JsonPrimitive", new Of.r(new F4.h(26)));
                Lf.a.alpha(buildSerialDescriptor, "JsonNull", new Of.r(new F4.h(27)));
                Lf.a.alpha(buildSerialDescriptor, "JsonLiteral", new Of.r(new F4.h(28)));
                Lf.a.alpha(buildSerialDescriptor, "JsonObject", new Of.r(new F4.h(29)));
                Lf.a.alpha(buildSerialDescriptor, "JsonArray", new Of.r(new Of.p(i4)));
                return Unit.INSTANCE;
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.echo(entry, "<destruct>");
                String str = (String) entry.getKey();
                Of.n nVar = (Of.n) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                Pf.af.alpha(sb2, str);
                sb2.append(':');
                sb2.append(nVar);
                return sb2.toString();
            case 14:
                return new R.e((Map) obj);
            case 15:
                return obj;
            case 16:
                ((Boolean) obj).booleanValue();
                R9.k.bravo.set(false);
                return Unit.INSTANCE;
            case 17:
                synchronized (S.n.charlie) {
                    List list = S.n.india;
                    int size = list.size();
                    while (i4 < size) {
                        ((Function1) list.get(i4)).invoke(obj);
                        i4++;
                    }
                }
                return Unit.INSTANCE;
            case 18:
                return Unit.INSTANCE;
            case 19:
                return PreviewConstants.bravo((ClickTarget) obj);
            case 20:
                return PreviewConstants.alpha((String) obj);
            case 21:
                return RememberMeConfig.alpha((String) obj);
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                Throwable th = (Throwable) obj;
                int i5 = MyFirebaseMessagingService.yellow;
                C3462a.alpha("API", 8, th.getMessage(), th);
                return Unit.INSTANCE;
            case 25:
                ae.ac addCallback = (ae.ac) obj;
                int i10 = AddressNoteActivity.f12347W;
                Intrinsics.echo(addCallback, "$this$addCallback");
                return Unit.INSTANCE;
            case 26:
                Intrinsics.echo((byte[]) obj, "<this>");
                throw new IllegalStateException("Android platform doesn't support SVG format.");
            case 27:
                Wf.v it = (Wf.v) obj;
                Intrinsics.echo(it, "it");
                return it.bravo;
            case 28:
                Byte b2 = (Byte) obj;
                b2.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b2}, 1));
            default:
                Byte b4 = (Byte) obj;
                b4.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b4}, 1));
        }
    }
}
