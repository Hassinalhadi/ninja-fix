package F4;

import A0.z;
import A2.n;
import B2.ao;
import F.C0103e2;
import J2.p;
import K2.o;
import Y1.r;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.compose.runtime.t0;
import androidx.work.impl.foreground.SystemForegroundService;
import bz.Q;
import bz.ae;
import bz.ag;
import com.checkout.components.core.ui.FlowComponentViewKt;
import com.checkout.components.core.ui.FlowComponentViewModel;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.rememberme.model.PaymentMethod;
import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.picker.PickerBottomSheetScreenKt;
import g1.AbstractC1733b;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.P5;
import vf.ab;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit a6;
        Unit a8;
        switch (this.alpha) {
            case 0:
                a6 = FlowComponentViewKt.a((FlowComponentViewModel) this.purple, (ComponentName) this.red, (Function1) this.silver, (PaymentMethodComponent) this.teal);
                return a6;
            case 1:
                o oVar = (o) this.purple;
                UUID uuid = (UUID) this.red;
                n nVar = (n) this.silver;
                Context context = (Context) this.teal;
                oVar.getClass();
                String uuid2 = uuid.toString();
                p hotel = oVar.charlie.hotel(uuid2);
                if (hotel != null && !z.bravo(hotel.bravo)) {
                    B2.f fVar = oVar.bravo;
                    synchronized (fVar.kilo) {
                        try {
                            A2.z.echo().foxtrot(B2.f.lima, "Moving WorkSpec (" + uuid2 + ") to the foreground");
                            ao aoVar = (ao) fVar.golf.remove(uuid2);
                            if (aoVar != null) {
                                if (fVar.alpha == null) {
                                    PowerManager.WakeLock alpha = K2.k.alpha(fVar.bravo, "ProcessorForegroundLck");
                                    fVar.alpha = alpha;
                                    alpha.acquire();
                                }
                                fVar.foxtrot.put(uuid2, aoVar);
                                Intent alpha2 = I2.a.alpha(fVar.bravo, P5.bravo(aoVar.alpha), nVar);
                                Context context2 = fVar.bravo;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    AbstractC1733b.charlie(context2, alpha2);
                                } else {
                                    context2.startService(alpha2);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    J2.j bravo = P5.bravo(hotel);
                    String str = I2.a.f1415c;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", nVar.alpha);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", nVar.bravo);
                    intent.putExtra("KEY_NOTIFICATION", nVar.charlie);
                    intent.putExtra("KEY_WORKSPEC_ID", bravo.alpha);
                    intent.putExtra("KEY_GENERATION", bravo.bravo);
                    context.startService(intent);
                    return null;
                }
                throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            case 2:
                ag agVar = (ag) this.red;
                Number number = agVar.alpha;
                Number number2 = (Number) this.purple;
                boolean areEqual = Intrinsics.areEqual(number2, number);
                Number number3 = (Number) this.silver;
                if (!areEqual || !Intrinsics.areEqual(number3, agVar.purple)) {
                    agVar.alpha = number2;
                    agVar.purple = number3;
                    agVar.teal = new Q((ae) this.teal, agVar.red, number2, number3, null);
                    ((t0) agVar.f3456b.bravo).setValue(Boolean.TRUE);
                    agVar.white = false;
                    agVar.yellow = true;
                }
                return Unit.INSTANCE;
            case 3:
                return PickerBottomSheetScreenKt.bravo((ab) this.purple, (C0103e2) this.red, (r) this.silver, (Function0) this.teal);
            default:
                a8 = WalletScreenViewModel.a((WalletScreenViewModel) this.purple, (PaymentMethod) this.red, (CardScheme) this.silver, (CardScheme) this.teal);
                return a8;
        }
    }
}
