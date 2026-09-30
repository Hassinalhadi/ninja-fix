package Gb;

import a0.ao;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.fragment.app.an;
import androidx.recyclerview.widget.f0;
import ao.ad;
import com.app.network.network.models.EnvelopNotification;
import com.app.network.network.models.Image;
import com.app.network.network.models.Shift;
import com.app.network.network.models.TransferCard;
import com.checkout.address.di.AddressDIComponent;
import com.checkout.address.model.AddressEditState;
import com.checkout.address.model.State;
import com.checkout.address.ui.state.StatePickerViewModel;
import com.checkout.components.address.U;
import com.checkout.components.rememberme.AbstractC0927b;
import com.checkout.components.rememberme.F1;
import com.checkout.components.rememberme.H1;
import com.checkout.components.rememberme.webview.BottomSheetWebViewState;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.zones.ZonesActivity;
import ec.C1648a;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.C2093f;
import pa.AbstractC2297c;
import s0.C2549i;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2634d5;
import sb.AbstractC2845d;
import t6.O3;
import x9.AbstractC3311e;
import x9.InterfaceC3312f;
import yf.L;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public /* synthetic */ j(Serializable serializable, Object obj, AbstractC3311e abstractC3311e, int i4, f0 f0Var, int i5) {
        this.alpha = i5;
        this.red = serializable;
        this.silver = obj;
        this.teal = abstractC3311e;
        this.purple = i4;
        this.white = f0Var;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        final Shift shift;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    T.p pVar = T.p.alpha;
                    C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
                    long j5 = c0585q.magenta;
                    int i4 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q.mike();
                    T.s charlie = T.a.charlie(pVar, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    Function0 function0 = C2551k.bravo;
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(function0);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q, alpha);
                    C0564b.blue(C2551k.echo, c0585q, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i4))) {
                        ad.blue(i4, c0585q, i4, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie);
                    EnvelopNotification envelopNotification = (EnvelopNotification) this.red;
                    String title = envelopNotification.getTitle();
                    String str6 = "";
                    if (title == null) {
                        str = "";
                    } else {
                        str = title;
                    }
                    String str7 = null;
                    EnvelopNotification.Tag tag = (EnvelopNotification.Tag) this.silver;
                    if (tag != null) {
                        str2 = tag.getValue();
                    } else {
                        str2 = null;
                    }
                    if (tag != null) {
                        str3 = tag.getColor();
                    } else {
                        str3 = null;
                    }
                    if (tag != null) {
                        str4 = tag.getForegroundColor();
                    } else {
                        str4 = null;
                    }
                    String message = envelopNotification.getMessage();
                    if (message == null) {
                        str5 = "";
                    } else {
                        str5 = message;
                    }
                    Image file = envelopNotification.getFile();
                    if (file != null) {
                        str7 = file.getUrl();
                    }
                    String createdAt = envelopNotification.getCreatedAt();
                    if (createdAt != null) {
                        str6 = AbstractC2634d5.golf(createdAt);
                    }
                    String str8 = str6;
                    Boolean unread = envelopNotification.getUnread();
                    Boolean bool = Boolean.TRUE;
                    boolean areEqual = Intrinsics.areEqual(unread, bool);
                    l lVar = (l) this.teal;
                    boolean india = c0585q.india(lVar) | c0585q.india(envelopNotification);
                    int i5 = this.purple;
                    boolean echo = india | c0585q.echo(i5);
                    k kVar = (k) this.white;
                    boolean india2 = echo | c0585q.india(kVar);
                    Object jade = c0585q.jade();
                    if (india2 || jade == C0580l.alpha) {
                        jade = new C1648a(lVar, envelopNotification, i5, kVar);
                        c0585q.f(jade);
                    }
                    Fb.f.alpha(str, str2, str3, str4, str5, str7, str8, areEqual, (Function0) jade, null, c0585q, 0);
                    if (!Intrinsics.areEqual(envelopNotification.getUnread(), bool)) {
                        c0585q.purple(-557535469);
                        O3.alpha(null, ao.delta(4293190887L), (float) 0.5d, 0.0f, c0585q, 432);
                        z10 = false;
                    } else {
                        z10 = false;
                        c0585q.purple(-559697967);
                    }
                    c0585q.quebec(z10);
                    c0585q.quebec(true);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).intValue();
                ((P.d) this.red).hotel(this.silver, this.teal, this.white, (InterfaceC0581m) obj, C0564b.cyan(this.purple) | 1);
                return Unit.INSTANCE;
            case 2:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z11)) {
                    final TransferCard transferCard = (TransferCard) this.red;
                    String areaName = transferCard.getAreaName();
                    double amount = transferCard.getAmount();
                    final Sc.p pVar2 = (Sc.p) this.white;
                    boolean india3 = c0585q2.india(pVar2) | c0585q2.india(transferCard);
                    final int i10 = this.purple;
                    boolean echo2 = india3 | c0585q2.echo(i10);
                    Object jade2 = c0585q2.jade();
                    as asVar = C0580l.alpha;
                    if (echo2 || jade2 == asVar) {
                        final int i11 = 0;
                        jade2 = new Function0() { // from class: Sc.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        b bVar = (b) pVar2.delta;
                                        if (bVar != null) {
                                            bVar.invoke(transferCard, Integer.valueOf(i10));
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        b bVar2 = (b) pVar2.echo;
                                        if (bVar2 != null) {
                                            bVar2.invoke(transferCard, Integer.valueOf(i10));
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q2.f(jade2);
                    }
                    Function0 function02 = (Function0) jade2;
                    boolean india4 = c0585q2.india(pVar2) | c0585q2.india(transferCard) | c0585q2.echo(i10);
                    Object jade3 = c0585q2.jade();
                    if (india4 || jade3 == asVar) {
                        final int i12 = 1;
                        jade3 = new Function0() { // from class: Sc.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        b bVar = (b) pVar2.delta;
                                        if (bVar != null) {
                                            bVar.invoke(transferCard, Integer.valueOf(i10));
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        b bVar2 = (b) pVar2.echo;
                                        if (bVar2 != null) {
                                            bVar2.invoke(transferCard, Integer.valueOf(i10));
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q2.f(jade3);
                    }
                    Sc.a.bravo(areaName, amount, (String) this.silver, (String) this.teal, function02, (Function0) jade3, c0585q2, 0);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 3:
                return F1.a((InternalButtonViewStyle) this.red, (InternalButtonState) this.silver, (Function0) this.teal, (L) this.white, this.purple, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 4:
                return H1.a((TextLabelViewItem) this.red, (TextLabelViewItem) this.silver, (ImageStyle) this.teal, (Function0) this.white, this.purple, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 5:
                return AbstractC0927b.a((String) this.red, (Function0) this.silver, (BottomSheetWebViewState) this.teal, (Context) this.white, this.purple, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 6:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(24961);
                db.n.delta((String) this.red, (Function0) this.silver, (T.s) this.teal, (C2093f) this.white, this.purple, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            case 7:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z12)) {
                    Context context = (Context) this.silver;
                    boolean india5 = c0585q3.india(context);
                    int i13 = this.purple;
                    boolean echo3 = india5 | c0585q3.echo(i13);
                    Integer num = (Integer) this.teal;
                    boolean golf = echo3 | c0585q3.golf(num);
                    ax axVar = (ax) this.white;
                    boolean golf2 = golf | c0585q3.golf(axVar);
                    Object jade4 = c0585q3.jade();
                    if (golf2 || jade4 == C0580l.alpha) {
                        C1648a c1648a = new C1648a(context, i13, num, axVar, 1);
                        c0585q3.f(c1648a);
                        jade4 = c1648a;
                    }
                    db.n.delta((String) this.red, (Function0) jade4, AbstractC0538d.uniform(V.charlie(T.p.alpha, 1.0f), 24, 0.0f, 2), null, 10, c0585q3, 24960);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 8:
                return com.checkout.address.ui.navigation.a.a((AddressEditState) this.red, (AddressDIComponent) this.silver, (Function1) this.teal, (String) this.white, this.purple, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 9:
                return U.a((StatePickerViewModel) this.red, (Y1.r) this.silver, (State) this.teal, (Function1) this.white, this.purple, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 10:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.purple | 1);
                AbstractC2297c.charlie((String) this.red, (Function0) this.silver, (T.s) this.teal, (P.d) this.white, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(this.purple | 1);
                AbstractC2845d.delta((String) this.red, (String) this.silver, (Function0) this.teal, (Function0) this.white, (InterfaceC0581m) obj, cyan3);
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(intValue4 & 1, z13)) {
                    final Shift shift2 = (Shift) this.red;
                    boolean india6 = c0585q4.india(shift2);
                    final Context context2 = (Context) this.silver;
                    boolean india7 = india6 | c0585q4.india(context2);
                    Object jade5 = c0585q4.jade();
                    Object obj3 = C0580l.alpha;
                    if (india7 || jade5 == obj3) {
                        final int i14 = 0;
                        jade5 = new Function0() { // from class: zc.e
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Float f5;
                                String longitude;
                                String latitude;
                                an anVar;
                                androidx.fragment.app.L supportFragmentManager;
                                switch (i14) {
                                    case 0:
                                        Shift shift3 = shift2;
                                        Shift.Branch branch = shift3.getBranch();
                                        Context context3 = context2;
                                        if (branch != null) {
                                            Intrinsics.checkNotNull(context3);
                                            Shift.Branch branch2 = shift3.getBranch();
                                            Float f10 = null;
                                            if (branch2 != null && (latitude = branch2.getLatitude()) != null) {
                                                f5 = kotlin.text.r.sierra(latitude);
                                            } else {
                                                f5 = null;
                                            }
                                            Shift.Branch branch3 = shift3.getBranch();
                                            if (branch3 != null && (longitude = branch3.getLongitude()) != null) {
                                                f10 = kotlin.text.r.sierra(longitude);
                                            }
                                            L9.d.bronze(context3, f5, f10);
                                        } else if (shift3.getZone() != null) {
                                            Bundle bundle = new Bundle();
                                            bundle.putString("zone", new com.google.gson.l().india(shift3.getZone()));
                                            Intent intent = new Intent(context3, (Class<?>) ZonesActivity.class);
                                            intent.putExtras(bundle);
                                            context3.startActivity(intent);
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        List<Shift.PricingRule> pricingRules = shift2.getPricingRules();
                                        if (pricingRules == null) {
                                            pricingRules = CollectionsKt.emptyList();
                                        }
                                        if (!pricingRules.isEmpty()) {
                                            Context context4 = context2;
                                            if (context4 instanceof an) {
                                                anVar = (an) context4;
                                            } else {
                                                anVar = null;
                                            }
                                            if (anVar != null && (supportFragmentManager = anVar.getSupportFragmentManager()) != null) {
                                                c cVar = new c();
                                                cVar.f14220u = pricingRules;
                                                cVar.f14101q = true;
                                                cVar.romeo(supportFragmentManager, "PricingRulesBottomSheet");
                                            }
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q4.f(jade5);
                    }
                    Function0 function03 = (Function0) jade5;
                    final zc.i iVar = (zc.i) this.teal;
                    boolean india8 = c0585q4.india(iVar);
                    final int i15 = this.purple;
                    boolean echo4 = india8 | c0585q4.echo(i15) | c0585q4.india(context2) | c0585q4.india(shift2);
                    final zc.h hVar = (zc.h) this.white;
                    boolean india9 = echo4 | c0585q4.india(hVar);
                    Object jade6 = c0585q4.jade();
                    if (india9 || jade6 == obj3) {
                        shift = shift2;
                        Object obj4 = new Function0() { // from class: zc.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                AlertDialog alertDialog;
                                final int i16 = i15;
                                if (i16 >= 0) {
                                    final i iVar2 = iVar;
                                    if (i16 < iVar2.alpha.size() && ((alertDialog = iVar2.charlie) == null || !alertDialog.isShowing())) {
                                        Context context3 = context2;
                                        AlertDialog.Builder message2 = new AlertDialog.Builder(context3).setTitle(context3.getString(R.string.book_shift)).setMessage(context3.getString(R.string.book_shift_alert));
                                        final Shift shift3 = shift;
                                        final h hVar2 = hVar;
                                        AlertDialog create = message2.setPositiveButton(R.string.book_shift, new DialogInterface.OnClickListener() { // from class: zc.g
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i17) {
                                                InterfaceC3312f interfaceC3312f = i.this.bravo;
                                                if (interfaceC3312f != null) {
                                                    interfaceC3312f.black(hVar2.alpha, i16, shift3);
                                                }
                                            }
                                        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).create();
                                        iVar2.charlie = create;
                                        if (create != null) {
                                            create.show();
                                        }
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c0585q4.f(obj4);
                        jade6 = obj4;
                    } else {
                        shift = shift2;
                    }
                    Function0 function04 = (Function0) jade6;
                    boolean india10 = c0585q4.india(shift) | c0585q4.india(context2);
                    Object jade7 = c0585q4.jade();
                    if (india10 || jade7 == obj3) {
                        final int i16 = 1;
                        jade7 = new Function0() { // from class: zc.e
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Float f5;
                                String longitude;
                                String latitude;
                                an anVar;
                                androidx.fragment.app.L supportFragmentManager;
                                switch (i16) {
                                    case 0:
                                        Shift shift3 = shift;
                                        Shift.Branch branch = shift3.getBranch();
                                        Context context3 = context2;
                                        if (branch != null) {
                                            Intrinsics.checkNotNull(context3);
                                            Shift.Branch branch2 = shift3.getBranch();
                                            Float f10 = null;
                                            if (branch2 != null && (latitude = branch2.getLatitude()) != null) {
                                                f5 = kotlin.text.r.sierra(latitude);
                                            } else {
                                                f5 = null;
                                            }
                                            Shift.Branch branch3 = shift3.getBranch();
                                            if (branch3 != null && (longitude = branch3.getLongitude()) != null) {
                                                f10 = kotlin.text.r.sierra(longitude);
                                            }
                                            L9.d.bronze(context3, f5, f10);
                                        } else if (shift3.getZone() != null) {
                                            Bundle bundle = new Bundle();
                                            bundle.putString("zone", new com.google.gson.l().india(shift3.getZone()));
                                            Intent intent = new Intent(context3, (Class<?>) ZonesActivity.class);
                                            intent.putExtras(bundle);
                                            context3.startActivity(intent);
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        List<Shift.PricingRule> pricingRules = shift.getPricingRules();
                                        if (pricingRules == null) {
                                            pricingRules = CollectionsKt.emptyList();
                                        }
                                        if (!pricingRules.isEmpty()) {
                                            Context context4 = context2;
                                            if (context4 instanceof an) {
                                                anVar = (an) context4;
                                            } else {
                                                anVar = null;
                                            }
                                            if (anVar != null && (supportFragmentManager = anVar.getSupportFragmentManager()) != null) {
                                                c cVar = new c();
                                                cVar.f14220u = pricingRules;
                                                cVar.f14101q = true;
                                                cVar.romeo(supportFragmentManager, "PricingRulesBottomSheet");
                                            }
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q4.f(jade7);
                    }
                    Ac.q.charlie(shift, function03, function04, (Function0) jade7, c0585q4, 0);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.silver = obj2;
        this.teal = obj3;
        this.white = obj4;
        this.purple = i4;
    }

    public /* synthetic */ j(String str, Context context, int i4, Integer num, ax axVar) {
        this.alpha = 7;
        this.red = str;
        this.silver = context;
        this.purple = i4;
        this.teal = num;
        this.white = axVar;
    }

    public /* synthetic */ j(String str, Function0 function0, T.s sVar, C2093f c2093f, int i4, int i5) {
        this.alpha = 6;
        this.red = str;
        this.silver = function0;
        this.teal = sVar;
        this.white = c2093f;
        this.purple = i4;
    }
}
