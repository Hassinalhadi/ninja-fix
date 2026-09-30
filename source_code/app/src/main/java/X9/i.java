package X9;

import A0.ad;
import Y1.ac;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.lifecycle.T;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.compose.BackStackEntryIdViewModel;
import bx.ar;
import bz.AbstractC0779d;
import com.app.network.network.models.OrderTask;
import com.checkout.components.rememberme.H1;
import com.clevertap.android.sdk.leanplum.Constants;
import delivery.samurai.android.R;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ob.AbstractC2210c;
import org.w3c.dom.Node;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Function1 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ i(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ContextWrapper contextWrapper;
        switch (this.alpha) {
            case 0:
                Byte b2 = (Byte) obj;
                b2.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b2}, 1));
            case 1:
                Context it = (Context) obj;
                Intrinsics.echo(it, "it");
                if (!(it instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) it).getBaseContext();
            case 2:
                Context it2 = (Context) obj;
                Intrinsics.echo(it2, "it");
                if (!(it2 instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) it2).getBaseContext();
            case 3:
                T1.c initializer = (T1.c) obj;
                Intrinsics.echo(initializer, "$this$initializer");
                return new NavControllerViewModel();
            case 4:
                Context it3 = (Context) obj;
                Intrinsics.echo(it3, "it");
                if (it3 instanceof ContextWrapper) {
                    contextWrapper = (ContextWrapper) it3;
                } else {
                    contextWrapper = null;
                }
                if (contextWrapper == null) {
                    return null;
                }
                return contextWrapper.getBaseContext();
            case 5:
                Context it4 = (Context) obj;
                Intrinsics.echo(it4, "it");
                if (!(it4 instanceof Activity)) {
                    return null;
                }
                return (Activity) it4;
            case 6:
                Y1.aa it5 = (Y1.aa) obj;
                Intrinsics.echo(it5, "it");
                return it5.red;
            case 7:
                Y1.aa it6 = (Y1.aa) obj;
                Intrinsics.echo(it6, "it");
                if (!(it6 instanceof ac)) {
                    return null;
                }
                Be.e eVar = ((ac) it6).yellow;
                return eVar.charlie(eVar.alpha);
            case 8:
                View it7 = (View) obj;
                Intrinsics.echo(it7, "it");
                Object parent = it7.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                return (View) parent;
            case 9:
                View it8 = (View) obj;
                Intrinsics.echo(it8, "it");
                Object tag = it8.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (Y1.r) ((WeakReference) tag).get();
                }
                if (!(tag instanceof Y1.r)) {
                    return null;
                }
                return (Y1.r) tag;
            case 10:
                g3.u it9 = (g3.u) obj;
                boolean z2 = CaptainLocationMonitoringService.f12066D;
                Intrinsics.echo(it9, "it");
                return it9.name();
            case 11:
                g3.u it10 = (g3.u) obj;
                boolean z10 = CaptainLocationMonitoringService.f12066D;
                Intrinsics.echo(it10, "it");
                return it10.name();
            case 12:
                g3.u it11 = (g3.u) obj;
                Intrinsics.echo(it11, "it");
                return it11.name();
            case 13:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 14:
                ad semantics = (ad) obj;
                Intrinsics.echo(semantics, "$this$semantics");
                A0.aa.echo(semantics, 0);
                return Unit.INSTANCE;
            case 15:
                ad semantics2 = (ad) obj;
                Intrinsics.echo(semantics2, "$this$semantics");
                A0.aa.echo(semantics2, 0);
                return Unit.INSTANCE;
            case 16:
                ad semantics3 = (ad) obj;
                Intrinsics.echo(semantics3, "$this$semantics");
                A0.aa.echo(semantics3, 0);
                return Unit.INSTANCE;
            case 17:
                Intrinsics.echo((OrderTask) obj, "it");
                return Unit.INSTANCE;
            case 18:
                Zf.a it12 = (Zf.a) obj;
                Intrinsics.echo(it12, "it");
                String nodeName = ((Node) it12.purple).getNodeName();
                Intrinsics.delta(nodeName, "getNodeName(...)");
                return Boolean.valueOf(Intrinsics.areEqual(nodeName, Constants.IAP_ITEM_PARAM));
            case 19:
                String it13 = (String) obj;
                Intrinsics.echo(it13, "it");
                return it13;
            case 20:
                ad semantics4 = (ad) obj;
                Intrinsics.echo(semantics4, "$this$semantics");
                A0.aa.echo(semantics4, 0);
                return Unit.INSTANCE;
            case 21:
                c0.d drawBehind = (c0.d) obj;
                Intrinsics.echo(drawBehind, "$this$drawBehind");
                float lavender = drawBehind.lavender(2);
                float charlie = (Z.e.charlie(drawBehind.bravo()) / 2.0f) - (lavender / 2.0f);
                float f5 = ob.p.alpha;
                ao.ad.golf(drawBehind, AbstractC2210c.alpha, charlie, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.bravo() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.bravo() & 4294967295L)) / 2.0f) & 4294967295L), new c0.h(lavender, 0.0f, 0, 0, null, 30), 104);
                return Unit.INSTANCE;
            case 22:
                ad semantics5 = (ad) obj;
                Intrinsics.echo(semantics5, "$this$semantics");
                A0.aa.echo(semantics5, 0);
                return Unit.INSTANCE;
            case 23:
                return new BackStackEntryIdViewModel(T.bravo((T1.c) obj));
            case 24:
                return ar.bravo(AbstractC0779d.kilo(700, 0, null, 6), 2);
            case 25:
                return ar.charlie(AbstractC0779d.kilo(700, 0, null, 6), 2);
            case 26:
                return ar.bravo(AbstractC0779d.kilo(700, 0, null, 6), 2);
            case 27:
                return ar.charlie(AbstractC0779d.kilo(700, 0, null, 6), 2);
            case 28:
                return ((Y1.l) obj).white;
            default:
                return H1.a((ad) obj);
        }
    }
}
