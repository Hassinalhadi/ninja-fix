package Ec;

import Lb.AbstractC0220c;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.OrderTask;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.view.common.ContainerFooterViewKt;
import com.checkout.components.rememberme.AbstractC0979s0;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.rememberme.model.RememberMeScreen;
import com.checkout.components.rememberme.utils.NavControllerWrapper;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.view.StyledImageViewKt;
import db.C1602b;
import db.C1603c;
import f0.AbstractC1680b;
import g0.C1726f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n.h0;
import s.AbstractC2533l;
import s.AbstractC2534m;
import s6.AbstractC2617b6;
import t6.AbstractC3032n3;
import t6.AbstractC3055s2;
import t6.AbstractC3065u2;
import u.InterfaceC3132f;
import y.InterfaceC3372l;

/* loaded from: classes2.dex */
public final /* synthetic */ class al implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ al(int i4, String str, String str2, T.s sVar, int i5) {
        this.alpha = 0;
        this.purple = i4;
        this.red = str;
        this.silver = str2;
        this.teal = sVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit ContainerFooterView$lambda$3;
        int i4 = this.purple;
        Object obj3 = this.teal;
        Object obj4 = this.silver;
        Object obj5 = this.red;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(7);
                int i5 = this.purple;
                String str = (String) obj5;
                ap.oscar(i5, str, (String) obj4, (T.s) obj3, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0220c.papa((Lb.aj) obj5, (Function1) obj4, (Function0) obj3, (InterfaceC0581m) obj, C0564b.cyan(i4 | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).intValue();
                ((P.d) obj5).foxtrot(obj4, obj3, (InterfaceC0581m) obj, C0564b.cyan(i4) | 1);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(i4 | 1);
                String str2 = (String) obj5;
                Qa.a.delta(str2, (Function1) obj4, (T.p) obj3, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(i4 | 1);
                R.e eVar = (R.e) obj5;
                eVar.alpha(obj4, (P.d) obj3, (InterfaceC0581m) obj, cyan3);
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                Sb.d.alpha((Sb.c) obj5, (Function0) obj4, (T.s) obj3, (InterfaceC0581m) obj, C0564b.cyan(i4 | 1));
                return Unit.INSTANCE;
            case 6:
                int intValue = ((Integer) obj2).intValue();
                ContainerFooterView$lambda$3 = ContainerFooterViewKt.ContainerFooterView$lambda$3((DesignTokens) obj5, (ResourceProvider) obj4, (Function1) obj3, this.purple, (InterfaceC0581m) obj, intValue);
                return ContainerFooterView$lambda$3;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC3065u2.alpha((OrderTask) obj4, (String) obj5, (T.p) obj3, (InterfaceC0581m) obj, C0564b.cyan(i4 | 1));
                return Unit.INSTANCE;
            case 8:
                int intValue2 = ((Integer) obj2).intValue();
                return AbstractC0979s0.a((TextLabelViewItem) obj5, (RememberMeScreen) obj4, (NavControllerWrapper) obj3, this.purple, (InterfaceC0581m) obj, intValue2);
            case 9:
                int intValue3 = ((Integer) obj2).intValue();
                return AbstractC0979s0.a((T.s) obj3, (DiComponent) obj5, (Function0) obj4, this.purple, (InterfaceC0581m) obj, intValue3);
            case 10:
                ((Integer) obj2).getClass();
                int cyan4 = C0564b.cyan(i4 | 1);
                C0537c c0537c = AbstractC0542h.alpha;
                C0537c c0537c2 = AbstractC0542h.alpha;
                T.s sVar = (T.s) obj3;
                androidx.compose.foundation.layout.ar arVar = (androidx.compose.foundation.layout.ar) obj5;
                androidx.compose.foundation.layout.aj.bravo(sVar, arVar, (P.d) obj4, (InterfaceC0581m) obj, cyan4);
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                int cyan5 = C0564b.cyan(1);
                int i10 = this.purple;
                Object obj6 = this.teal;
                androidx.compose.foundation.lazy.layout.j.delta((androidx.compose.foundation.lazy.layout.w) obj5, this.silver, i10, obj6, (InterfaceC0581m) obj, cyan5);
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                int cyan6 = C0564b.cyan(i4 | 1);
                androidx.compose.foundation.lazy.layout.ar arVar2 = (androidx.compose.foundation.lazy.layout.ar) obj5;
                arVar2.alpha(obj4, (P.d) obj3, (InterfaceC0581m) obj, cyan6);
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                T.s sVar2 = (T.s) obj3;
                c.c cVar = (c.c) obj5;
                c.g.bravo(sVar2, cVar, (Function1) obj4, (InterfaceC0581m) obj, C0564b.cyan(1), this.purple);
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                c.c cVar2 = (c.c) obj5;
                T.s sVar3 = (T.s) obj3;
                c.g.alpha(cVar2, sVar3, (P.d) obj4, (InterfaceC0581m) obj, C0564b.cyan(i4 | 1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                C1603c c1603c = (C1603c) obj4;
                db.l.alpha(c1603c, (C1602b) obj3, (String) obj5, (InterfaceC0581m) obj, C0564b.cyan(1), this.purple);
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                db.q.alpha((String) obj5, (Function1) obj4, (T.s) obj3, (InterfaceC0581m) obj, C0564b.cyan(i4 | 1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).intValue();
                ga.e.alpha((ga.f) obj5, (Function0) obj4, (Function0) obj3, (InterfaceC0581m) obj, C0564b.cyan(i4 | 1));
                return Unit.INSTANCE;
            case 18:
                int intValue4 = ((Integer) obj2).intValue();
                return StyledImageViewKt.charlie((T.s) obj3, (AbstractC1680b) obj5, (ImageStyle) obj4, this.purple, (InterfaceC0581m) obj, intValue4);
            case 19:
                ((Integer) obj2).getClass();
                String str3 = (String) obj5;
                AbstractC2617b6.alpha(str3, (T.p) obj4, (C1726f) obj3, (InterfaceC0581m) obj, C0564b.cyan(i4 | 1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).intValue();
                ((h0) obj5).bravo((Object[]) obj4, (Function1) obj3, (InterfaceC0581m) obj, C0564b.cyan(i4 | 1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).intValue();
                AbstractC2534m.charlie((q.g) obj5, (InterfaceC3132f) obj4, (Function0) obj3, (InterfaceC0581m) obj, C0564b.cyan(i4 | 1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                int cyan7 = C0564b.cyan(i4 | 1);
                P.d dVar = AbstractC2533l.alpha;
                T.s sVar4 = (T.s) obj3;
                androidx.compose.runtime.aa aaVar = (androidx.compose.runtime.aa) obj5;
                AbstractC3055s2.alpha(sVar4, aaVar, (P.d) obj4, (InterfaceC0581m) obj, cyan7);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                InterfaceC3372l interfaceC3372l = (InterfaceC3372l) obj5;
                AbstractC3032n3.alpha(interfaceC3372l, (T.f) obj4, (P.d) obj3, (InterfaceC0581m) obj, C0564b.cyan(i4 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ al(T.s sVar, androidx.compose.foundation.layout.ar arVar, P.d dVar, int i4) {
        this.alpha = 10;
        C0537c c0537c = AbstractC0542h.alpha;
        C0537c c0537c2 = AbstractC0542h.alpha;
        this.teal = sVar;
        this.red = arVar;
        this.silver = dVar;
        this.purple = i4;
    }

    public /* synthetic */ al(T.s sVar, androidx.compose.runtime.aa aaVar, P.d dVar, int i4) {
        this.alpha = 22;
        P.d dVar2 = AbstractC2533l.alpha;
        this.teal = sVar;
        this.red = aaVar;
        this.silver = dVar;
        this.purple = i4;
    }

    public /* synthetic */ al(T.s sVar, c.c cVar, Function1 function1, int i4, int i5) {
        this.alpha = 13;
        this.teal = sVar;
        this.red = cVar;
        this.silver = function1;
        this.purple = i5;
    }

    public /* synthetic */ al(T.s sVar, Object obj, Object obj2, int i4, int i5) {
        this.alpha = i5;
        this.teal = sVar;
        this.red = obj;
        this.silver = obj2;
        this.purple = i4;
    }

    public /* synthetic */ al(androidx.compose.foundation.lazy.layout.w wVar, Object obj, int i4, Object obj2, int i5) {
        this.alpha = 11;
        this.red = wVar;
        this.silver = obj;
        this.purple = i4;
        this.teal = obj2;
    }

    public /* synthetic */ al(c.c cVar, T.s sVar, P.d dVar, int i4) {
        this.alpha = 14;
        this.red = cVar;
        this.teal = sVar;
        this.silver = dVar;
        this.purple = i4;
    }

    public /* synthetic */ al(OrderTask orderTask, String str, T.p pVar, int i4) {
        this.alpha = 7;
        this.silver = orderTask;
        this.red = str;
        this.teal = pVar;
        this.purple = i4;
    }

    public /* synthetic */ al(C1603c c1603c, C1602b c1602b, String str, int i4, int i5) {
        this.alpha = 15;
        this.silver = c1603c;
        this.teal = c1602b;
        this.red = str;
        this.purple = i5;
    }

    public /* synthetic */ al(Object obj, Object obj2, Object obj3, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.silver = obj2;
        this.teal = obj3;
        this.purple = i4;
    }
}
