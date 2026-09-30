package Ac;

import F.G2;
import F.O;
import F.S2;
import F.T2;
import H0.v;
import Jb.ad;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.AddressNoteListItem;
import com.checkout.components.kmp.rememberme.model.AuthenticationViewType;
import com.checkout.components.kmp.rememberme.shared.model.HintType;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.view.authentication.AuthenticationViewKt;
import h.AbstractC1797a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pa.AbstractC2297c;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public /* synthetic */ e(AddressNoteListItem addressNoteListItem, Function1 function1, Xd.m mVar, Function0 function0, T.s sVar, int i4) {
        this.alpha = 4;
        this.red = addressNoteListItem;
        this.purple = function1;
        this.silver = mVar;
        this.teal = function0;
        this.white = sVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit AuthenticationView$lambda$12;
        boolean z2;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(24577);
                q.delta((ArrayList) this.red, (Long) this.silver, (String) this.teal, (Function1) this.purple, (T.s) this.white, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(1);
                Ec.t.alpha((Dc.e) this.red, (Xd.l) this.silver, (Function1) this.purple, (Function1) this.teal, (Function0) this.white, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(1);
                ad.alpha((Jb.r) this.red, (Ld.c) this.silver, (Function0) this.teal, (Function0) this.purple, (T.p) this.white, (InterfaceC0581m) obj, cyan3);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int cyan4 = C0564b.cyan(1);
                Zb.d.charlie((List) this.red, (Map) this.silver, (Function1) this.purple, (Function0) this.teal, (T.s) this.white, (InterfaceC0581m) obj, cyan4);
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                int cyan5 = C0564b.cyan(1);
                cc.g.bravo((AddressNoteListItem) this.red, (Function1) this.purple, (Xd.m) this.silver, (Function0) this.teal, (T.s) this.white, (InterfaceC0581m) obj, cyan5);
                return Unit.INSTANCE;
            case 5:
                int intValue = ((Integer) obj2).intValue();
                AuthenticationView$lambda$12 = AuthenticationViewKt.AuthenticationView$lambda$12((DesignTokens) this.red, (ResourceProvider) this.silver, (HintType) this.teal, (AuthenticationViewType) this.purple, (Function0) this.white, (InterfaceC0581m) obj, intValue);
                return AuthenticationView$lambda$12;
            case 6:
                ((Integer) obj2).getClass();
                int cyan6 = C0564b.cyan(1);
                AbstractC2297c.alpha((String) this.teal, (String) this.red, (Function0) this.silver, (Function0) this.purple, (T.p) this.white, (InterfaceC0581m) obj, cyan6);
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue2 & 1, z2)) {
                    T.s charlie = V.charlie(T.p.alpha, 1.0f);
                    float f5 = Db.f.delta;
                    T.s sierra = AbstractC0538d.sierra(charlie, f5);
                    S alpha = Q.alpha(AbstractC0542h.golf(f5), T.d.f2061d, c0585q, 48);
                    long j5 = c0585q.magenta;
                    int i4 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q.mike();
                    T.s charlie2 = T.a.charlie(sierra, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C2549i c2549i = C2551k.foxtrot;
                    C0564b.blue(c2549i, c0585q, alpha);
                    C2549i c2549i2 = C2551k.echo;
                    C0564b.blue(c2549i2, c0585q, mike);
                    C2549i c2549i3 = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i4))) {
                        ao.ad.blue(i4, c0585q, i4, c2549i3);
                    }
                    C2549i c2549i4 = C2551k.delta;
                    C0564b.blue(c2549i4, c0585q, charlie2);
                    Xd.l lVar = (Xd.l) this.red;
                    if (lVar == null) {
                        c0585q.purple(-1183997216);
                    } else {
                        c0585q.purple(-453835455);
                        lVar.invoke(c0585q, 0);
                    }
                    c0585q.quebec(false);
                    if (1.0f <= 0.0d) {
                        AbstractC1797a.alpha("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(Db.f.alpha), T.d.f2062f, c0585q, 0);
                    long j6 = c0585q.magenta;
                    int i5 = (int) (j6 ^ (j6 >>> 32));
                    I mike2 = c0585q.mike();
                    T.s charlie3 = T.a.charlie(layoutWeightElement, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i, c0585q, alpha2);
                    C0564b.blue(c2549i2, c0585q, mike2);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                        ao.ad.blue(i5, c0585q, i5, c2549i3);
                    }
                    C0564b.blue(c2549i4, c0585q, charlie3);
                    E0 e02 = T2.alpha;
                    G2.bravo((String) this.teal, null, 0L, 0L, v.f1407a, null, 0L, null, 0L, 2, false, 1, 0, null, ((S2) c0585q.kilo(e02)).juliet, c0585q, 196608, 3120, 55262);
                    String str = (String) this.purple;
                    if (str != null) {
                        c0585q.purple(-337046685);
                        G2.bravo(str, null, ((O) c0585q.kilo(F.Q.alpha)).sierra, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((S2) c0585q.kilo(e02)).kilo, c0585q, 0, 3120, 55290);
                    } else {
                        c0585q.purple(-340485825);
                    }
                    c0585q.quebec(false);
                    String str2 = (String) this.white;
                    if (str2 != null) {
                        c0585q.purple(-336639810);
                        G2.bravo(str2, null, ((O) c0585q.kilo(F.Q.alpha)).sierra, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, ((S2) c0585q.kilo(e02)).lima, c0585q, 0, 3120, 55290);
                    } else {
                        c0585q.purple(-340485825);
                    }
                    c0585q.quebec(false);
                    c0585q.quebec(true);
                    Xd.l lVar2 = (Xd.l) this.silver;
                    if (lVar2 == null) {
                        c0585q.purple(-1182619328);
                    } else {
                        c0585q.purple(-453791007);
                        lVar2.invoke(c0585q, 0);
                    }
                    c0585q.quebec(false);
                    c0585q.quebec(true);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(Object obj, Serializable serializable, Object obj2, kotlin.e eVar, T.s sVar, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.silver = serializable;
        this.teal = obj2;
        this.purple = eVar;
        this.white = sVar;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4) {
        this.alpha = i4;
        this.red = obj;
        this.silver = obj2;
        this.teal = obj3;
        this.purple = obj4;
        this.white = obj5;
    }

    public /* synthetic */ e(Object obj, Object obj2, Function1 function1, kotlin.e eVar, Object obj3, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.silver = obj2;
        this.purple = function1;
        this.teal = eVar;
        this.white = obj3;
    }

    public /* synthetic */ e(String str, String str2, Function0 function0, Function0 function02, T.p pVar, int i4) {
        this.alpha = 6;
        this.teal = str;
        this.red = str2;
        this.silver = function0;
        this.purple = function02;
        this.white = pVar;
    }
}
