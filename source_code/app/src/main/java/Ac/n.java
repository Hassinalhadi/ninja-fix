package Ac;

import Cb.ad;
import Ec.ai;
import Ec.ap;
import F.K1;
import Jb.af;
import Jb.e0;
import Lb.AbstractC0220c;
import a2.C0401z;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.au;
import bz.F;
import com.app.base.BaseViewModel;
import com.app.network.network.models.Action;
import com.app.network.network.models.ActionType;
import com.app.network.network.models.AddressNoteListItem;
import com.app.network.network.models.Transaction;
import com.checkout.components.ui.model.PickerViewState;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.picker.PickerContentViewKt;
import com.checkout.components.ui.view.StyledImageViewKt;
import com.clevertap.android.sdk.Constants;
import d.C1542l0;
import d.C1548o0;
import d.C1554s;
import d.aj;
import delivery.samurai.android.ui.support.SupportViewModel;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import f0.AbstractC1680b;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import m.C2093f;
import n.at;
import r3.C2492a;
import s0.AbstractC2555o;
import s6.F6;
import t6.V2;
import vf.ab;
import wc.AbstractC3255a;
import y.C3344D;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        Unit StyledImageView$lambda$7$lambda$5$lambda$4;
        int i4 = 7;
        as asVar = C0580l.alpha;
        boolean z11 = false;
        boolean z12 = false;
        final int i5 = 1;
        Object obj3 = this.silver;
        Object obj4 = this.red;
        Object obj5 = this.purple;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                q.bravo((r) obj5, (List) obj4, (Function1) obj3, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ap.alpha((String) obj5, (String) obj4, (T.s) obj3, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 2:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                W8.a aVar = Gc.q.A;
                if ((3 & intValue) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    final Gc.q qVar = (Gc.q) obj5;
                    ActionType actionType = qVar.f1388v;
                    if (actionType != null) {
                        final ComposeView composeView = (ComposeView) obj4;
                        boolean india = c0585q.india(qVar) | c0585q.india(composeView);
                        Object jade = c0585q.jade();
                        Object obj6 = jade;
                        if (india || jade == asVar) {
                            final int i10 = z11 ? 1 : 0;
                            Function0 function0 = new Function0() { // from class: Gc.o
                                /* JADX WARN: Type inference failed for: r13v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Object obj7;
                                    Integer valueOf;
                                    ComposeView composeView2 = composeView;
                                    Object obj8 = null;
                                    q qVar2 = qVar;
                                    switch (i10) {
                                        case 0:
                                            ActionType actionType2 = qVar2.f1388v;
                                            if (actionType2 != null) {
                                                List<Action> actions = actionType2.getActions();
                                                if (actions != null) {
                                                    Iterator<T> it = actions.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            Object next = it.next();
                                                            Action action = (Action) next;
                                                            if (action.getEnabled() && Intrinsics.areEqual(action.getType(), "COMMENT")) {
                                                                obj8 = next;
                                                            }
                                                        }
                                                    }
                                                    Action action2 = (Action) obj8;
                                                    if (action2 != null) {
                                                        if (qVar2.bronze() == -1) {
                                                            int i11 = ZenDeskChatActivity.f12498T;
                                                            Intent intent = new Intent(composeView2.getContext(), (Class<?>) ZenDeskChatActivity.class);
                                                            intent.putExtra("action_type", action2);
                                                            qVar2.startActivityForResult(intent, 1);
                                                        } else {
                                                            int i12 = ZenDeskChatActivity.f12498T;
                                                            Context context = composeView2.getContext();
                                                            int bronze = qVar2.bronze();
                                                            Intent intent2 = new Intent(context, (Class<?>) ZenDeskChatActivity.class);
                                                            intent2.putExtra("action_type", action2);
                                                            intent2.putExtra("orderId", bronze);
                                                            qVar2.startActivityForResult(intent2, 1);
                                                        }
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            Intrinsics.lima(Constants.KEY_TYPE);
                                            throw null;
                                        default:
                                            ActionType actionType3 = qVar2.f1388v;
                                            if (actionType3 != null) {
                                                List<Action> actions2 = actionType3.getActions();
                                                if (actions2 != null) {
                                                    Iterator<T> it2 = actions2.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            obj7 = it2.next();
                                                            Action action3 = (Action) obj7;
                                                            if (!action3.getEnabled() || !Intrinsics.areEqual(action3.getType(), "NOTIFY")) {
                                                            }
                                                        } else {
                                                            obj7 = null;
                                                        }
                                                    }
                                                    Action action4 = (Action) obj7;
                                                    if (action4 != null) {
                                                        SupportViewModel supportViewModel = (SupportViewModel) qVar2.f1389w.getValue();
                                                        Integer id2 = action4.getId();
                                                        if (qVar2.bronze() == -1) {
                                                            valueOf = null;
                                                        } else {
                                                            valueOf = Integer.valueOf(qVar2.bronze());
                                                        }
                                                        ?? auVar = new au(new C2492a(2, "loading"));
                                                        BaseViewModel.launchApi$default(supportViewModel, null, new k(supportViewModel, id2, null, null, valueOf, auVar, null), 1, null);
                                                        auVar.observe(qVar2.getViewLifecycleOwner(), new Aa.f(10, new ad(6, qVar2, composeView2)));
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            Intrinsics.lima(Constants.KEY_TYPE);
                                            throw null;
                                    }
                                }
                            };
                            c0585q.f(function0);
                            obj6 = function0;
                        }
                        Function0 function02 = (Function0) obj6;
                        boolean india2 = c0585q.india(qVar) | c0585q.india(composeView);
                        Object jade2 = c0585q.jade();
                        Object obj7 = jade2;
                        if (india2 || jade2 == asVar) {
                            Function0 function03 = new Function0() { // from class: Gc.o
                                /* JADX WARN: Type inference failed for: r13v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Object obj72;
                                    Integer valueOf;
                                    ComposeView composeView2 = composeView;
                                    Object obj8 = null;
                                    q qVar2 = qVar;
                                    switch (i5) {
                                        case 0:
                                            ActionType actionType2 = qVar2.f1388v;
                                            if (actionType2 != null) {
                                                List<Action> actions = actionType2.getActions();
                                                if (actions != null) {
                                                    Iterator<T> it = actions.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            Object next = it.next();
                                                            Action action = (Action) next;
                                                            if (action.getEnabled() && Intrinsics.areEqual(action.getType(), "COMMENT")) {
                                                                obj8 = next;
                                                            }
                                                        }
                                                    }
                                                    Action action2 = (Action) obj8;
                                                    if (action2 != null) {
                                                        if (qVar2.bronze() == -1) {
                                                            int i11 = ZenDeskChatActivity.f12498T;
                                                            Intent intent = new Intent(composeView2.getContext(), (Class<?>) ZenDeskChatActivity.class);
                                                            intent.putExtra("action_type", action2);
                                                            qVar2.startActivityForResult(intent, 1);
                                                        } else {
                                                            int i12 = ZenDeskChatActivity.f12498T;
                                                            Context context = composeView2.getContext();
                                                            int bronze = qVar2.bronze();
                                                            Intent intent2 = new Intent(context, (Class<?>) ZenDeskChatActivity.class);
                                                            intent2.putExtra("action_type", action2);
                                                            intent2.putExtra("orderId", bronze);
                                                            qVar2.startActivityForResult(intent2, 1);
                                                        }
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            Intrinsics.lima(Constants.KEY_TYPE);
                                            throw null;
                                        default:
                                            ActionType actionType3 = qVar2.f1388v;
                                            if (actionType3 != null) {
                                                List<Action> actions2 = actionType3.getActions();
                                                if (actions2 != null) {
                                                    Iterator<T> it2 = actions2.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            obj72 = it2.next();
                                                            Action action3 = (Action) obj72;
                                                            if (!action3.getEnabled() || !Intrinsics.areEqual(action3.getType(), "NOTIFY")) {
                                                            }
                                                        } else {
                                                            obj72 = null;
                                                        }
                                                    }
                                                    Action action4 = (Action) obj72;
                                                    if (action4 != null) {
                                                        SupportViewModel supportViewModel = (SupportViewModel) qVar2.f1389w.getValue();
                                                        Integer id2 = action4.getId();
                                                        if (qVar2.bronze() == -1) {
                                                            valueOf = null;
                                                        } else {
                                                            valueOf = Integer.valueOf(qVar2.bronze());
                                                        }
                                                        ?? auVar = new au(new C2492a(2, "loading"));
                                                        BaseViewModel.launchApi$default(supportViewModel, null, new k(supportViewModel, id2, null, null, valueOf, auVar, null), 1, null);
                                                        auVar.observe(qVar2.getViewLifecycleOwner(), new Aa.f(10, new ad(6, qVar2, composeView2)));
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            Intrinsics.lima(Constants.KEY_TYPE);
                                            throw null;
                                    }
                                }
                            };
                            c0585q.f(function03);
                            obj7 = function03;
                        }
                        Function0 function04 = (Function0) obj7;
                        boolean india3 = c0585q.india(qVar);
                        Object jade3 = c0585q.jade();
                        Object obj8 = jade3;
                        if (india3 || jade3 == asVar) {
                            final int i11 = z11 ? 1 : 0;
                            Function0 function05 = new Function0() { // from class: Gc.p
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String value;
                                    q qVar2 = qVar;
                                    switch (i11) {
                                        case 0:
                                            ActionType actionType2 = qVar2.f1388v;
                                            Object obj9 = null;
                                            if (actionType2 != null) {
                                                List<Action> actions = actionType2.getActions();
                                                if (actions != null) {
                                                    Iterator<T> it = actions.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            Object next = it.next();
                                                            Action action = (Action) next;
                                                            if (action.getEnabled() && Intrinsics.areEqual(action.getType(), "CALL")) {
                                                                obj9 = next;
                                                            }
                                                        }
                                                    }
                                                    Action action2 = (Action) obj9;
                                                    if (action2 != null && (value = action2.getValue()) != null) {
                                                        qVar2.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(value))));
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            Intrinsics.lima(Constants.KEY_TYPE);
                                            throw null;
                                        default:
                                            W8.a aVar2 = q.A;
                                            new Handler(Looper.getMainLooper()).post(new n(qVar2, 1));
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            c0585q.f(function05);
                            obj8 = function05;
                        }
                        Function0 function06 = (Function0) obj8;
                        Action action = (Action) obj3;
                        boolean india4 = c0585q.india(action) | c0585q.india(qVar);
                        Object jade4 = c0585q.jade();
                        Object obj9 = jade4;
                        if (india4 || jade4 == asVar) {
                            g gVar = new g(i4, action, qVar);
                            c0585q.f(gVar);
                            obj9 = gVar;
                        }
                        Function0 function07 = (Function0) obj9;
                        boolean india5 = c0585q.india(qVar);
                        Object jade5 = c0585q.jade();
                        Object obj10 = jade5;
                        if (india5 || jade5 == asVar) {
                            Function0 function08 = new Function0() { // from class: Gc.p
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    String value;
                                    q qVar2 = qVar;
                                    switch (i5) {
                                        case 0:
                                            ActionType actionType2 = qVar2.f1388v;
                                            Object obj92 = null;
                                            if (actionType2 != null) {
                                                List<Action> actions = actionType2.getActions();
                                                if (actions != null) {
                                                    Iterator<T> it = actions.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            Object next = it.next();
                                                            Action action2 = (Action) next;
                                                            if (action2.getEnabled() && Intrinsics.areEqual(action2.getType(), "CALL")) {
                                                                obj92 = next;
                                                            }
                                                        }
                                                    }
                                                    Action action22 = (Action) obj92;
                                                    if (action22 != null && (value = action22.getValue()) != null) {
                                                        qVar2.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(value))));
                                                    }
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            Intrinsics.lima(Constants.KEY_TYPE);
                                            throw null;
                                        default:
                                            W8.a aVar2 = q.A;
                                            new Handler(Looper.getMainLooper()).post(new n(qVar2, 1));
                                            return Unit.INSTANCE;
                                    }
                                }
                            };
                            c0585q.f(function08);
                            obj10 = function08;
                        }
                        Pc.d.bravo(actionType, function02, function04, function06, function07, (Function0) obj10, c0585q, 0);
                    } else {
                        Intrinsics.lima(Constants.KEY_TYPE);
                        throw null;
                    }
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                af.charlie((List) obj4, (Function1) obj3, (T.s) obj5, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 4:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    e0 e0Var = (e0) obj5;
                    boolean india6 = c0585q2.india(e0Var);
                    Object jade6 = c0585q2.jade();
                    if (india6 || jade6 == asVar) {
                        jade6 = new B2.q(11, e0Var);
                        c0585q2.f(jade6);
                    }
                    AbstractC0220c.blue(0, c0585q2, (String) obj4, (String) obj3, (Function0) jade6);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                Vc.g.alpha((Transaction) obj5, (String) obj4, (T.p) obj3, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                V2.alpha((Y1.l) obj5, (R.e) obj4, (P.d) obj3, (InterfaceC0581m) obj, C0564b.cyan(385));
                return Unit.INSTANCE;
            case 7:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                vf.ad.zulu((ab) obj5, null, null, new C0401z(floatValue, (F) obj4, (Y1.l) obj3, null), 3);
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                cc.g.foxtrot((AddressNoteListItem) obj5, (Xd.m) obj4, (T.p) obj3, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 9:
                return PickerContentViewKt.alpha((PickerViewState) obj5, (Function0) obj4, (B9.ab) obj3, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 10:
                m0.r rVar = (m0.r) obj;
                Z.b bVar = (Z.b) obj2;
                aj ajVar = (aj) obj5;
                long tango = AbstractC2555o.foxtrot(ajVar).tango(0L);
                kotlin.jvm.internal.t tVar = (kotlin.jvm.internal.t) obj4;
                if (!Z.b.bravo(tango, tVar.alpha)) {
                    ajVar.f11984c = Z.b.golf(ajVar.f11984c, Z.b.foxtrot(tango, tVar.alpha));
                }
                tVar.alpha = tango;
                F6.alpha((bn.g) obj3, rVar, ajVar.f11984c);
                xf.e eVar = ajVar.yellow;
                if (eVar != null) {
                    eVar.mike(new C1554s(bVar.alpha));
                }
                return Unit.INSTANCE;
            case 11:
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                kotlin.jvm.internal.r rVar2 = (kotlin.jvm.internal.r) obj5;
                C1548o0 c1548o0 = (C1548o0) obj4;
                long hotel = c1548o0.hotel(c1548o0.delta(floatValue2 - rVar2.alpha));
                C1548o0 c1548o02 = ((C1542l0) obj3).alpha;
                rVar2.alpha += c1548o0.delta(c1548o0.golf(c1548o02.charlie(c1548o02.kilo, hotel, 1)));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                db.o.bravo(C0564b.cyan(1), (T.s) obj4, (InterfaceC0581m) obj, (String) obj3, (Function0) obj5);
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                db.n.charlie((Function0) obj5, (T.s) obj4, (C2093f) obj3, (InterfaceC0581m) obj, C0564b.cyan(3121));
                return Unit.INSTANCE;
            case 14:
                StyledImageView$lambda$7$lambda$5$lambda$4 = StyledImageViewKt.StyledImageView$lambda$7$lambda$5$lambda$4((Ref.ObjectRef) obj5, (AbstractC1680b) obj4, (ImageStyle) obj3, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return StyledImageView$lambda$7$lambda$5$lambda$4;
            case 15:
                ((Integer) obj2).getClass();
                at.hotel((T.s) obj5, (C3344D) obj4, (P.d) obj3, (InterfaceC0581m) obj, C0564b.cyan(385));
                return Unit.INSTANCE;
            case 16:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((3 & intValue3) != 2) {
                    z11 = true;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    Function0 function09 = (Function0) obj5;
                    Function0 function010 = (Function0) obj4;
                    boolean golf = c0585q3.golf(function09) | c0585q3.golf(function010);
                    Object jade7 = c0585q3.jade();
                    if (golf || jade7 == asVar) {
                        jade7 = new okhttp3.internal.ws.a(5, function09, function010);
                        c0585q3.f(jade7);
                    }
                    K1.juliet((Function0) jade7, null, false, null, null, null, P.e.echo(-584807126, new ai((String) obj3, i4), c0585q3), c0585q3, 805306368, 510);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z12 = true;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z12)) {
                    ax axVar = (ax) obj5;
                    Context context = (Context) obj4;
                    boolean golf2 = c0585q4.golf(axVar) | c0585q4.india(context);
                    Object jade8 = c0585q4.jade();
                    Object obj11 = jade8;
                    if (golf2 || jade8 == asVar) {
                        l lVar = new l((Object) context, (ax) obj3, axVar, 20);
                        c0585q4.f(lVar);
                        obj11 = lVar;
                    }
                    K1.juliet((Function0) obj11, null, false, null, null, null, AbstractC3255a.echo, c0585q4, 805306368, 510);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i4, int i5) {
        this.alpha = i5;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
    }

    public /* synthetic */ n(List list, Function1 function1, T.s sVar, int i4) {
        this.alpha = 3;
        this.red = list;
        this.silver = function1;
        this.purple = sVar;
    }
}
