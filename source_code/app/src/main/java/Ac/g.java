package Ac;

import Cb.x;
import D0.z;
import Lb.C0233p;
import Nf.C0265x;
import Nf.C0266y;
import Of.w;
import Yb.ag;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.p0;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.an;
import androidx.lifecycle.T;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import com.app.network.network.models.Action;
import com.app.network.network.models.AttributeGroup;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.WithdrawTransaction;
import com.app.network.network.models.tickets.TicketResponse;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.areasV2.AreaListingActivityV2;
import delivery.samurai.android.ui.envelopV2.EnvelopDetailActivityV2;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import delivery.samurai.android.ui.shiftsV2.ShiftsFragmentV2;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import delivery.samurai.android.ui.wallet.WalletViewModel;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryFragment;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryViewModel;
import e3.InterfaceC1627a;
import f3.AbstractC1691a;
import g3.C1746g;
import g3.C1751l;
import i.C1868q;
import i.C1874w;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonException;
import r3.C2492a;
import s6.AbstractC2707l6;
import t0.InterfaceC2937r0;
import t0.U;
import t6.AbstractC2986e2;
import vf.Y;
import vf.ab;
import vf.ad;
import yf.N;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ g(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013b, code lost:
    
        if (((Tc.l) r0).charlie != false) goto L53;
     */
    /* JADX WARN: Type inference failed for: r1v30, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        String value;
        String[] names;
        String str;
        int i4;
        int i5 = 2;
        boolean z2 = true;
        char c3 = 1;
        int i10 = 0;
        switch (this.alpha) {
            case 0:
                ((Function1) this.purple).invoke((s) this.red);
                return Unit.INSTANCE;
            case 1:
                Gb.g gVar = (Gb.g) this.purple;
                gVar.lima(false, false);
                an activity = gVar.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new A2.q(i5, gVar));
                }
                an activity2 = gVar.getActivity();
                if (activity2 != null) {
                    int i11 = EnvelopDetailActivityV2.f12255N;
                    an activity3 = gVar.getActivity();
                    String str2 = (String) this.red;
                    Intent intent = new Intent(activity3, (Class<?>) EnvelopDetailActivityV2.class);
                    intent.putExtra("ENVELOP_NOTIFICATION_ID", str2);
                    intent.putExtra("ENVELOP_NOTIFICATION", (Serializable) null);
                    intent.addFlags(335544320);
                    activity2.startActivity(intent);
                }
                return Unit.INSTANCE;
            case 2:
                Yc.a aVar = new Yc.a((d3.k) this.purple, ((C9.c) this.red).bravo);
                Set set = AbstractC1691a.alpha;
                aVar.alpha("samuraicaptain://?" + CollectionsKt.maroon(CollectionsKt.white("screen=".concat("points_home")), "&", null, null, null, 62));
                return Unit.INSTANCE;
            case 3:
                ax axVar = (ax) this.red;
                axVar.setValue(Boolean.TRUE);
                ad.zulu((ab) this.purple, null, null, new x(axVar, null), 3);
                return Unit.INSTANCE;
            case 4:
                ((ShiftsFragmentV2) this.purple).startActivity(new Intent(((ComposeView) this.red).getContext(), (Class<?>) AreaListingActivityV2.class));
                return Unit.INSTANCE;
            case 5:
                p0 p0Var = (p0) this.red;
                if (p0Var.juliet() > 0) {
                    ((Function1) this.purple).invoke(Integer.valueOf(p0Var.juliet()));
                }
                return Unit.INSTANCE;
            case 6:
                ((Function1) this.purple).invoke((Gb.m) this.red);
                return Unit.INSTANCE;
            case 7:
                W8.a aVar2 = Gc.q.A;
                Action action = (Action) this.purple;
                if (action != null && (value = action.getValue()) != null) {
                    Gc.q qVar = (Gc.q) this.red;
                    Yc.a aVar3 = qVar.f1391y;
                    if (aVar3 != null) {
                        if (!aVar3.alpha(value)) {
                            Log.w("DeepLink", "Failed to handle URL: ".concat(value));
                            Context requireContext = qVar.requireContext();
                            Intrinsics.delta(requireContext, "requireContext(...)");
                            String string = qVar.getString(R.string.error_failed_to_open_link);
                            Intrinsics.delta(string, "getString(...)");
                            L9.d.pink(requireContext, string);
                        }
                    } else {
                        Intrinsics.lima("deepLinkHandler");
                        throw null;
                    }
                }
                return Unit.INSTANCE;
            case 8:
                int i12 = ZenDeskChatActivity.f12498T;
                kotlin.jvm.internal.s sVar = (kotlin.jvm.internal.s) this.purple;
                int i13 = sVar.alpha;
                ZenDeskChatActivity zenDeskChatActivity = (ZenDeskChatActivity) this.red;
                List list = (List) zenDeskChatActivity.f12501J.getValue();
                if (list != null) {
                    i10 = list.size();
                }
                if (i13 < i10) {
                    int i14 = sVar.alpha;
                    ?? obj = new Object();
                    obj.alpha = 1 + i14;
                    zenDeskChatActivity.f12508R.invoke(Integer.valueOf(i14), new g(8, (Object) obj, zenDeskChatActivity));
                } else {
                    zenDeskChatActivity.green(zenDeskChatActivity.Q);
                }
                return Unit.INSTANCE;
            case 9:
                Y1.r rVar = ((HomeActivityV2) this.purple).f12282U;
                if (rVar != null) {
                    rVar.charlie(((MenuItem) this.red).getItemId(), null, AbstractC2986e2.alpha(new z(29)));
                    return Unit.INSTANCE;
                }
                Intrinsics.lima("navController");
                throw null;
            case 10:
                ((Function1) this.purple).invoke((Jc.p) this.red);
                return Unit.INSTANCE;
            case 11:
                return AbstractC2707l6.charlie((String) this.purple, Lf.c.charlie, new SerialDescriptor[0], new Jf.c((Jf.d) this.red, i10));
            case 12:
                ((Function1) this.purple).invoke((AttributeGroup) this.red);
                return Unit.INSTANCE;
            case 13:
                C0233p c0233p = (C0233p) this.purple;
                HomeViewModelV2 homeViewModelV2 = (HomeViewModelV2) c0233p.f1810v.getValue();
                AttributeGroup attributeGroup = (AttributeGroup) this.red;
                String group = attributeGroup.getGroup();
                String str3 = "";
                if (group == null) {
                    group = "";
                }
                homeViewModelV2.alpha(group);
                InterfaceC1627a interfaceC1627a = c0233p.f1809u;
                if (interfaceC1627a != null) {
                    String group2 = attributeGroup.getGroup();
                    if (group2 != null) {
                        str3 = group2;
                    }
                    ((z9.j) interfaceC1627a).alpha(str3);
                    c0233p.kilo();
                    return Unit.INSTANCE;
                }
                Intrinsics.lima("userManager");
                throw null;
            case 14:
                String str4 = ((Sb.e) this.red).charlie;
                if (str4 != null) {
                    ((Function1) this.purple).invoke(str4);
                }
                return Unit.INSTANCE;
            case 15:
                try {
                    int i15 = Build.VERSION.SDK_INT;
                    ConnectivityManager connectivityManager = (ConnectivityManager) this.purple;
                    Nb.c cVar = (Nb.c) this.red;
                    if (i15 >= 24) {
                        connectivityManager.unregisterNetworkCallback(cVar);
                    } else {
                        connectivityManager.unregisterNetworkCallback(cVar);
                    }
                } catch (Exception unused) {
                }
                return Unit.INSTANCE;
            case 16:
                C0266y c0266y = (C0266y) this.purple;
                C0265x c0265x = (C0265x) c0266y.charlie;
                if (c0265x == null) {
                    Enum[] enumArr = (Enum[]) c0266y.bravo;
                    c0265x = new C0265x((String) this.red, enumArr.length);
                    for (Enum r02 : enumArr) {
                        c0265x.bravo(r02.name(), false);
                    }
                }
                return c0265x;
            case 17:
                return AbstractC2707l6.charlie((String) this.purple, Lf.l.echo, new SerialDescriptor[0], new Aa.l(15, (C0266y) this.red));
            case 18:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Of.d dVar = (Of.d) this.red;
                Of.k kVar = dVar.alpha;
                SerialDescriptor serialDescriptor = (SerialDescriptor) this.purple;
                Pf.r.november(dVar, serialDescriptor);
                int romeo = serialDescriptor.romeo();
                for (int i16 = 0; i16 < romeo; i16++) {
                    List tango = serialDescriptor.tango(i16);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : tango) {
                        if (obj2 instanceof w) {
                            arrayList.add(obj2);
                        }
                    }
                    w wVar = (w) CollectionsKt.m(arrayList);
                    if (wVar != null && (names = wVar.names()) != null) {
                        for (String str5 : names) {
                            if (Intrinsics.areEqual(serialDescriptor.november(), Lf.k.bravo)) {
                                str = "enum value";
                            } else {
                                str = "property";
                            }
                            if (!linkedHashMap.containsKey(str5)) {
                                linkedHashMap.put(str5, Integer.valueOf(i16));
                            } else {
                                throw new JsonException("The suggested name '" + str5 + "' for " + str + ' ' + serialDescriptor.sierra(i16) + " is already one of the names for " + str + ' ' + serialDescriptor.sierra(((Number) y.papa(linkedHashMap, str5)).intValue()) + " in " + serialDescriptor);
                            }
                        }
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return kotlin.collections.t.alpha;
                }
                return linkedHashMap;
            case 19:
                ((Function1) this.purple).invoke((Ma.a) this.red);
                return Unit.INSTANCE;
            case 20:
                Y1.r alpha = J2.f.alpha(((Rc.b) this.purple).delta);
                Bundle bundle = new Bundle();
                bundle.putInt("TICKET_ID", ((TicketResponse) this.red).getId());
                alpha.charlie(R.id.nav_ticket_details, bundle, null);
                return Unit.INSTANCE;
            case 21:
                Y1.r alpha2 = J2.f.alpha(((Rc.b) this.purple).delta);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("TICKET_ID", ((TicketResponse) this.red).getId());
                alpha2.charlie(R.id.nav_ticket_details, bundle2, null);
                return Unit.INSTANCE;
            case 22:
                Y.s.bravo((Y.s) this.purple);
                InterfaceC2937r0 interfaceC2937r0 = (InterfaceC2937r0) this.red;
                if (interfaceC2937r0 != null) {
                    ((U) interfaceC2937r0).bravo();
                }
                return Unit.INSTANCE;
            case 23:
                Function1 function1 = ((C1746g) ((J2.t) this.purple).alpha).kilo;
                if (function1 != null) {
                    function1.invoke(new g3.p(((C1751l) this.red).alpha));
                }
                return Unit.INSTANCE;
            case 24:
                C1874w c1874w = (C1874w) this.purple;
                C1868q c1868q = (C1868q) CollectionsKt.olive(c1874w.golf().kilo);
                if (c1868q != null) {
                    i4 = c1868q.alpha;
                } else {
                    i4 = 0;
                }
                if (i4 >= c1874w.golf().november - 3) {
                    ax axVar2 = (ax) this.red;
                    if (((Tc.m) axVar2.getValue()) instanceof Tc.l) {
                        Tc.m mVar = (Tc.m) axVar2.getValue();
                        Intrinsics.charlie(mVar, "null cannot be cast to non-null type delivery.samurai.android.ui.wallet.WalletViewModel.WalletUiState.Success");
                        break;
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 25:
                long j5 = ((Tc.g) this.red).alpha;
                WalletViewModel walletViewModel = (WalletViewModel) this.purple;
                Tc.f fVar = Tc.f.alpha;
                N n5 = walletViewModel.echo;
                n5.getClass();
                n5.juliet(null, fVar);
                Y y10 = walletViewModel.bravo;
                if (y10 != null) {
                    y10.foxtrot(null);
                }
                walletViewModel.bravo = ad.zulu(T.hotel(walletViewModel), null, null, new Tc.q(walletViewModel, j5, null), 3);
                return Unit.INSTANCE;
            case 26:
                Wb.y yVar = (Wb.y) this.purple;
                Function1 function12 = yVar.f2218v;
                if (function12 != null) {
                    function12.invoke((File) this.red);
                }
                yVar.lima(false, false);
                return Unit.INSTANCE;
            case 27:
                Integer id2 = ((WithdrawTransaction) this.purple).getId();
                if (id2 != null) {
                    int intValue = id2.intValue();
                    WithDrawHistoryFragment withDrawHistoryFragment = (WithDrawHistoryFragment) this.red;
                    WithDrawHistoryViewModel withDrawHistoryViewModel = (WithDrawHistoryViewModel) withDrawHistoryFragment.e.getValue();
                    ?? auVar = new au(new C2492a(2, "loading"));
                    BaseViewModel.launchApi$default(withDrawHistoryViewModel, null, new Wc.t(withDrawHistoryViewModel, intValue, auVar, null), 1, null);
                    auVar.observe(withDrawHistoryFragment.getViewLifecycleOwner(), new Dc.t(11, new Wc.q(withDrawHistoryFragment, c3 == true ? 1 : 0)));
                }
                return Unit.INSTANCE;
            case 28:
                Y1.o oVar = (Y1.o) this.purple;
                Y1.l popUpTo = (Y1.l) this.red;
                Intrinsics.echo(popUpTo, "popUpTo");
                synchronized (oVar.alpha) {
                    try {
                        N n10 = oVar.bravo;
                        Iterable iterable = (Iterable) n10.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : iterable) {
                            if (!Intrinsics.areEqual((Y1.l) obj3, popUpTo)) {
                                arrayList2.add(obj3);
                            } else {
                                n10.getClass();
                                n10.juliet(null, arrayList2);
                            }
                        }
                        n10.getClass();
                        n10.juliet(null, arrayList2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            default:
                ag agVar = (ag) this.purple;
                Y y11 = agVar.golf;
                if (y11 != null) {
                    y11.foxtrot(null);
                }
                agVar.echo = false;
                agVar.alpha();
                w.o oVar2 = agVar.alpha;
                OrderTask task = (OrderTask) this.red;
                Intrinsics.echo(task, "task");
                ((ProcessOrderActivityV2) oVar2.red).magenta(task);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(Sb.e eVar, Function1 function1) {
        this.alpha = 14;
        this.red = eVar;
        this.purple = function1;
    }

    public /* synthetic */ g(Y1.o oVar, Y1.l lVar, boolean z2) {
        this.alpha = 28;
        this.purple = oVar;
        this.red = lVar;
    }
}
