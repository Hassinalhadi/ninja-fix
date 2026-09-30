package Jb;

import a0.InterfaceC0342ab;
import android.content.Context;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.app.network.network.models.AttributeGroup;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import ge.InterfaceC1772d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import s6.AbstractC2644e6;
import s6.T5;

/* loaded from: classes2.dex */
public final /* synthetic */ class aw implements Function1 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ aw(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Y1.av, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2 = true;
        switch (this.alpha) {
            case 0:
                Y1.ak navOptions = (Y1.ak) obj;
                int i4 = HomeActivityV2.f12269k0;
                Intrinsics.echo(navOptions, "$this$navOptions");
                navOptions.delta = R.id.nav_orders;
                navOptions.echo = false;
                ?? obj2 = new Object();
                int i5 = HomeActivityV2.f12269k0;
                obj2.alpha = false;
                navOptions.echo = obj2.alpha;
                navOptions.foxtrot = obj2.bravo;
                navOptions.bravo = true;
                return Unit.INSTANCE;
            case 1:
                g3.u it = (g3.u) obj;
                Intrinsics.echo(it, "it");
                return it.name();
            case 2:
                Context ctx = (Context) obj;
                Intrinsics.echo(ctx, "ctx");
                LottieAnimationView lottieAnimationView = new LottieAnimationView(ctx);
                lottieAnimationView.setAnimation(R.raw.no_data);
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                lottieAnimationView.playAnimation();
                return lottieAnimationView;
            case 3:
                InterfaceC1772d it2 = (InterfaceC1772d) obj;
                Intrinsics.echo(it2, "it");
                KSerializer delta = T5.delta(it2);
                if (delta == null) {
                    if (!Nf.az.golf(it2)) {
                        return null;
                    }
                    return new Jf.b(it2);
                }
                return delta;
            case 4:
                InterfaceC1772d it3 = (InterfaceC1772d) obj;
                Intrinsics.echo(it3, "it");
                KSerializer delta2 = T5.delta(it3);
                if (delta2 == null) {
                    if (Nf.az.golf(it3)) {
                        delta2 = new Jf.b(it3);
                    } else {
                        delta2 = null;
                    }
                }
                if (delta2 == null) {
                    return null;
                }
                return AbstractC2644e6.bravo(delta2);
            case 5:
                float floatValue = ((Float) obj).floatValue();
                if (Float.isNaN(floatValue) || Float.isInfinite(floatValue) || floatValue > 150.0f) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 6:
                float floatValue2 = ((Float) obj).floatValue();
                if (!Float.isNaN(floatValue2) && !Float.isInfinite(floatValue2) && floatValue2 <= 150.0f) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 7:
                Intrinsics.echo((AttributeGroup) obj, "it");
                return Unit.INSTANCE;
            case 8:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 9:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 10:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 11:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 12:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 13:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 14:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 15:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 16:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 17:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 18:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 19:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 20:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 21:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 22:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 23:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 24:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 25:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 26:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 27:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 28:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            default:
                InterfaceC0342ab graphicsLayer = (InterfaceC0342ab) obj;
                Intrinsics.echo(graphicsLayer, "$this$graphicsLayer");
                ((a0.ap) graphicsLayer).hotel(1.0f);
                return Unit.INSTANCE;
        }
    }
}
