package Jb;

import Lb.C0233p;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.app.network.network.models.AttributeGroup;
import com.app.network.network.models.Captain;
import com.app.network.network.models.Order;
import com.app.network.network.models.UserInfo;
import com.app.network.network.response.DataResponse;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import g3.C1743d;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import s6.AbstractC2671h6;
import t6.AbstractC3016k2;
import z3.C3462a;

/* loaded from: classes2.dex */
public final /* synthetic */ class S implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ OrdersFragmentV2 purple;

    public /* synthetic */ S(OrdersFragmentV2 ordersFragmentV2, int i4) {
        this.alpha = i4;
        this.purple = ordersFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool;
        boolean z2;
        Captain captain;
        Captain captain2;
        Boolean bool2;
        int i4 = 0;
        switch (this.alpha) {
            case 0:
                UserInfo userInfo = (UserInfo) obj;
                if (userInfo != null && (captain2 = userInfo.getCaptain()) != null) {
                    bool = captain2.getReadyToWork();
                } else {
                    bool = null;
                }
                OrdersFragmentV2 ordersFragmentV2 = this.purple;
                if (bool != null) {
                    ordersFragmentV2.f12303k = bool.booleanValue();
                    Nb.i iVar = ordersFragmentV2.f12314v;
                    if (((Boolean) iVar.teal) == null) {
                        yf.N n5 = ordersFragmentV2.f12312t;
                        n5.getClass();
                        n5.juliet(null, bool);
                        Boolean bool3 = (Boolean) iVar.teal;
                        if (bool3 != null && Intrinsics.areEqual(bool, bool3)) {
                            Boolean bool4 = Boolean.FALSE;
                            yf.N n10 = (yf.N) iVar.red;
                            n10.getClass();
                            n10.juliet(null, bool4);
                            iVar.teal = null;
                        }
                    }
                }
                Boolean bool5 = Boolean.TRUE;
                if (Intrinsics.areEqual(bool, bool5)) {
                    Context requireContext = ordersFragmentV2.requireContext();
                    Intrinsics.delta(requireContext, "requireContext(...)");
                    if (L9.d.charlie(requireContext).alpha) {
                        boolean z10 = CaptainLocationMonitoringService.f12066D;
                        Context requireContext2 = ordersFragmentV2.requireContext();
                        Intrinsics.delta(requireContext2, "requireContext(...)");
                        AbstractC3016k2.delta(requireContext2, true);
                        ordersFragmentV2.kilo().november().foxtrot();
                        ordersFragmentV2.kilo().november().alpha();
                    } else {
                        Context context = ordersFragmentV2.getContext();
                        if (context == null) {
                            return Unit.INSTANCE;
                        }
                        C1743d charlie = L9.d.charlie(context);
                        if (!charlie.alpha && !ordersFragmentV2.f12304l) {
                            ordersFragmentV2.f12304l = true;
                            L9.j[] jVarArr = L9.j.alpha;
                            AbstractC2671h6.echo(ordersFragmentV2, charlie, new T(ordersFragmentV2, 2));
                        }
                    }
                } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                    ordersFragmentV2.kilo().november().golf();
                    ordersFragmentV2.kilo().november().bravo();
                    boolean z11 = CaptainLocationMonitoringService.f12066D;
                    Context requireContext3 = ordersFragmentV2.requireContext();
                    Intrinsics.delta(requireContext3, "requireContext(...)");
                    AbstractC3016k2.delta(requireContext3, false);
                }
                if (userInfo != null && (captain = userInfo.getCaptain()) != null) {
                    z2 = Intrinsics.areEqual(captain.getSuspended(), bool5);
                } else {
                    z2 = false;
                }
                if (z2) {
                    ordersFragmentV2.amber(false);
                }
                return Unit.INSTANCE;
            case 1:
                C2492a c2492a = (C2492a) obj;
                int i5 = c2492a.alpha;
                OrdersFragmentV2 ordersFragmentV22 = this.purple;
                if (i5 != 0) {
                    if (i5 == 1) {
                        DataResponse dataResponse = (DataResponse) c2492a.charlie;
                        if (dataResponse != null) {
                            i4 = dataResponse.getTotalElements();
                        }
                        yf.N n11 = ordersFragmentV22.f12309q;
                        Integer valueOf = Integer.valueOf(i4);
                        n11.getClass();
                        n11.juliet(null, valueOf);
                    }
                } else {
                    yf.N n12 = ordersFragmentV22.f12309q;
                    n12.getClass();
                    n12.juliet(null, 0);
                }
                return Unit.INSTANCE;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                OrdersFragmentV2 ordersFragmentV23 = this.purple;
                C3462a.alpha("HomeV2", 12, "evt=SWITCH_TOGGLE requested=" + booleanValue + " current=" + ordersFragmentV23.xray(), null);
                ordersFragmentV23.yankee(booleanValue);
                return Unit.INSTANCE;
            case 3:
                OrdersFragmentV2 ordersFragmentV24 = this.purple;
                String link = (String) obj;
                Intrinsics.echo(link, "link");
                try {
                    Result.Companion companion = Result.INSTANCE;
                    ordersFragmentV24.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(link)));
                    Result.m206constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m206constructorimpl(ResultKt.createFailure(th));
                }
                return Unit.INSTANCE;
            case 4:
                Order order = (Order) obj;
                Intrinsics.echo(order, "order");
                String language = Locale.getDefault().getLanguage();
                Intrinsics.delta(language, "getLanguage(...)");
                Order assignLocalizedMetaData = order.assignLocalizedMetaData(language);
                Integer id2 = order.getId();
                if (id2 != null) {
                    int intValue = id2.intValue();
                    int i10 = ProcessOrderActivityV2.f12378N0;
                    OrdersFragmentV2 ordersFragmentV25 = this.purple;
                    ordersFragmentV25.startActivity(U8.a.golf(ordersFragmentV25.requireContext(), intValue, assignLocalizedMetaData));
                }
                return Unit.INSTANCE;
            case 5:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                OrdersFragmentV2 ordersFragmentV26 = this.purple;
                C3462a.alpha("HomeV2", 12, "evt=SWITCH_TOGGLE requested=" + booleanValue2 + " current=" + ordersFragmentV26.xray(), null);
                ordersFragmentV26.yankee(booleanValue2);
                return Unit.INSTANCE;
            case 6:
                OrdersFragmentV2 ordersFragmentV27 = this.purple;
                String link2 = (String) obj;
                Intrinsics.echo(link2, "link");
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    ordersFragmentV27.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(link2)));
                    Result.m206constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m206constructorimpl(ResultKt.createFailure(th2));
                }
                return Unit.INSTANCE;
            case 7:
                UserInfo userInfo2 = (UserInfo) obj;
                OrdersFragmentV2 ordersFragmentV28 = this.purple;
                if (userInfo2 != null) {
                    Captain captain3 = userInfo2.getCaptain();
                    if (captain3 != null) {
                        bool2 = captain3.getReadyToWork();
                    } else {
                        bool2 = null;
                    }
                    if (bool2 != null) {
                        yf.N n13 = ordersFragmentV28.f12312t;
                        n13.getClass();
                        n13.juliet(null, bool2);
                        Nb.i iVar2 = ordersFragmentV28.f12314v;
                        Boolean bool6 = (Boolean) iVar2.teal;
                        if (bool6 != null && Intrinsics.areEqual(bool2, bool6)) {
                            Boolean bool7 = Boolean.FALSE;
                            yf.N n14 = (yf.N) iVar2.red;
                            n14.getClass();
                            n14.juliet(null, bool7);
                            iVar2.teal = null;
                        }
                    }
                } else {
                    Nb.i iVar3 = ordersFragmentV28.f12314v;
                    Boolean bool8 = Boolean.FALSE;
                    yf.N n15 = (yf.N) iVar3.red;
                    n15.getClass();
                    n15.juliet(null, bool8);
                    iVar3.teal = null;
                }
                return Unit.INSTANCE;
            case 8:
                C2492a c2492a2 = (C2492a) obj;
                int i11 = c2492a2.alpha;
                OrdersFragmentV2 ordersFragmentV29 = this.purple;
                if (i11 != 0) {
                    if (i11 == 1) {
                        DataResponse dataResponse2 = (DataResponse) c2492a2.charlie;
                        if (dataResponse2 != null) {
                            i4 = dataResponse2.getTotalElements();
                        }
                        yf.N n16 = ordersFragmentV29.f12310r;
                        Integer valueOf2 = Integer.valueOf(i4);
                        n16.getClass();
                        n16.juliet(null, valueOf2);
                    }
                } else {
                    yf.N n17 = ordersFragmentV29.f12310r;
                    n17.getClass();
                    n17.juliet(null, 0);
                }
                return Unit.INSTANCE;
            default:
                AttributeGroup group = (AttributeGroup) obj;
                Intrinsics.echo(group, "group");
                OrdersFragmentV2 ordersFragmentV210 = this.purple;
                if (!ordersFragmentV210.getChildFragmentManager().jade()) {
                    C0233p c0233p = new C0233p();
                    Bundle bundle = new Bundle();
                    bundle.putString("arg_group", new com.google.gson.l().india(group));
                    c0233p.setArguments(bundle);
                    c0233p.romeo(ordersFragmentV210.getChildFragmentManager(), "missing_attr_sheet");
                }
                return Unit.INSTANCE;
        }
    }
}
