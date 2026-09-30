package Ba;

import C1.ap;
import C1.aq;
import J8.ak;
import J8.v;
import Jb.C0215x;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.n0;
import androidx.compose.runtime.t0;
import com.app.network.network.models.AttributeGroup;
import com.app.network.network.models.SignUpRequest;
import com.google.maps.android.BuildConfig;
import delivery.samurai.android.R;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import delivery.samurai.android.ui.about.MyAccountViewModel;
import delivery.samurai.android.ui.auth.signup.step2personalinfo.AboutYouFragment;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import ga.ac;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p3.ah;
import q3.AbstractC2410d;
import t0.C2919i0;
import yf.InterfaceC3440j;
import yf.N;
import yf.at;
import z3.C3462a;

/* loaded from: classes2.dex */
public final class e implements InterfaceC3440j {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ e(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        String str;
        boolean z2;
        boolean z10;
        boolean z11;
        switch (this.alpha) {
            case 0:
                ((AboutYouFragment) this.purple).romeo().f408q.setPrefixText(((SignUpRequest) obj).getMobileCountryCode());
                return Unit.INSTANCE;
            case 1:
                ap apVar = (ap) this.purple;
                if (!(apVar.hotel.echo() instanceof aq)) {
                    Object foxtrot = ap.foxtrot(apVar, true, cVar);
                    if (foxtrot != Od.a.alpha) {
                        return Unit.INSTANCE;
                    }
                    return foxtrot;
                }
                return Unit.INSTANCE;
            case 2:
                ((ak) this.purple).charlie.set((v) obj);
                return Unit.INSTANCE;
            case 3:
                if (((ah) obj) == ah.purple) {
                    C0215x c0215x = (C0215x) this.purple;
                    if (!c0215x.isAdded()) {
                        return Unit.INSTANCE;
                    }
                    Context requireContext = c0215x.requireContext();
                    Intrinsics.delta(requireContext, "requireContext(...)");
                    String string = c0215x.getString(R.string.stomp_connected_restored_message);
                    Intrinsics.delta(string, "getString(...)");
                    L9.d.pink(requireContext, string);
                    c0215x.kilo();
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 4:
                ah ahVar = (ah) obj;
                String name = ahVar.name();
                OrdersFragmentV2 ordersFragmentV2 = (OrdersFragmentV2) this.purple;
                boolean xray = ordersFragmentV2.xray();
                ah ahVar2 = ordersFragmentV2.f12318z;
                if (ahVar2 == null || (str = ahVar2.name()) == null) {
                    str = BuildConfig.TRAVIS;
                }
                C3462a.alpha("HomeV2", 12, "evt=STOMP_STATE stompState=" + name + " switchOn=" + xray + " prev=" + str, null);
                ah ahVar3 = ah.red;
                if (ahVar == ahVar3 && ordersFragmentV2.xray()) {
                    C3462a.alpha("HomeV2", 12, "evt=ONLINE_BUT_STOMP_NOT_CONNECTED hasValidatedInternet=" + ((Boolean) ((N) ordersFragmentV2.victor().charlie.alpha).getValue()).booleanValue() + " consecutiveFailures=" + CaptainLocationMonitoringService.f12075M, null);
                }
                ah ahVar4 = ordersFragmentV2.f12318z;
                ah ahVar5 = ah.purple;
                if (ahVar4 == ahVar5 && ahVar == ahVar3 && ordersFragmentV2.xray() && !((Boolean) ((N) ordersFragmentV2.f12314v.silver).getValue()).booleanValue()) {
                    Context requireContext2 = ordersFragmentV2.requireContext();
                    Intrinsics.delta(requireContext2, "requireContext(...)");
                    String string2 = ordersFragmentV2.getString(R.string.stomp_disconnected_message);
                    Intrinsics.delta(string2, "getString(...)");
                    L9.d.pink(requireContext2, string2);
                }
                if (ordersFragmentV2.f12318z == ahVar3 && ahVar == ahVar5 && ordersFragmentV2.xray()) {
                    Context requireContext3 = ordersFragmentV2.requireContext();
                    Intrinsics.delta(requireContext3, "requireContext(...)");
                    String string3 = ordersFragmentV2.getString(R.string.stomp_connected_restored_message);
                    Intrinsics.delta(string3, "getString(...)");
                    L9.d.pink(requireContext3, string3);
                }
                ordersFragmentV2.f12318z = ahVar;
                return Unit.INSTANCE;
            case 5:
                ((N9.c) this.purple).alpha();
                return Unit.INSTANCE;
            case 6:
                N9.i iVar = (N9.i) this.purple;
                for (Map.Entry entry : iVar.charlie.entrySet()) {
                    String str2 = (String) entry.getKey();
                    at atVar = (at) entry.getValue();
                    AbstractC2410d abstractC2410d = (AbstractC2410d) iVar.bravo.get(str2);
                    if (abstractC2410d != null) {
                        Object alpha = iVar.alpha(abstractC2410d);
                        N n5 = (N) atVar;
                        n5.getClass();
                        n5.juliet(null, alpha);
                    }
                }
                return Unit.INSTANCE;
            case 7:
                ((Nb.h) this.purple).alpha(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 8:
                ah ahVar6 = (ah) obj;
                Z9.c cVar2 = (Z9.c) this.purple;
                synchronized (cVar2.delta) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (ahVar6 == ah.purple) {
                        if (cVar2.foxtrot == 0) {
                            cVar2.foxtrot = elapsedRealtime;
                        }
                    } else {
                        long j5 = cVar2.foxtrot;
                        if (j5 != 0) {
                            cVar2.echo += elapsedRealtime - j5;
                            cVar2.foxtrot = 0L;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 9:
                ((Boolean) obj).booleanValue();
                List list = db.l.echo;
                ((ax) this.purple).setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 10:
                List<AttributeGroup> list2 = (List) obj;
                ac acVar = (ac) this.purple;
                MyAccountViewModel quebec = acVar.quebec();
                if (list2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 || !list2.isEmpty()) {
                    for (AttributeGroup attributeGroup : list2) {
                        acVar.quebec();
                        if (MyAccountViewModel.bravo(attributeGroup.getGroup(), "STC_PAY")) {
                            z10 = true;
                            if (list2 != null || !list2.isEmpty()) {
                                for (AttributeGroup attributeGroup2 : list2) {
                                    acVar.quebec();
                                    if (MyAccountViewModel.bravo(attributeGroup2.getGroup(), "UR_PAY")) {
                                        z11 = true;
                                        t0 t0Var = (t0) quebec.bravo;
                                        ga.f updateState = (ga.f) t0Var.getValue();
                                        Intrinsics.echo(updateState, "$this$updateState");
                                        t0Var.setValue(ga.f.alpha(updateState, null, null, null, null, null, false, null, null, null, z10, z11, 511));
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                            z11 = false;
                            t0 t0Var2 = (t0) quebec.bravo;
                            ga.f updateState2 = (ga.f) t0Var2.getValue();
                            Intrinsics.echo(updateState2, "$this$updateState");
                            t0Var2.setValue(ga.f.alpha(updateState2, null, null, null, null, null, false, null, null, null, z10, z11, 511));
                            return Unit.INSTANCE;
                        }
                    }
                }
                z10 = false;
                if (list2 != null) {
                }
                while (r0.hasNext()) {
                }
                z11 = false;
                t0 t0Var22 = (t0) quebec.bravo;
                ga.f updateState22 = (ga.f) t0Var22.getValue();
                Intrinsics.echo(updateState22, "$this$updateState");
                t0Var22.setValue(ga.f.alpha(updateState22, null, null, null, null, null, false, null, null, null, z10, z11, 511));
                return Unit.INSTANCE;
            case 11:
                ((n0) ((C2919i0) this.purple).alpha).kilo(((Number) obj).floatValue());
                return Unit.INSTANCE;
            case 12:
                w.o oVar = (w.o) this.purple;
                if (Build.VERSION.SDK_INT >= 34) {
                    oVar.uniform().startStylusHandwriting((View) oVar.purple);
                }
                return Unit.INSTANCE;
            default:
                ((Ref.ObjectRef) this.purple).alpha = obj;
                throw new AbortFlowException(this);
        }
    }
}
