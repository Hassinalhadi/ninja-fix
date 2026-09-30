package Gb;

import Ac.g;
import af.C0437h;
import android.content.Intent;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import com.checkout.address.ui.view.AddressButtonViewKt;
import com.checkout.components.ui.model.InputFieldViewItem;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import f.InterfaceC1673j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1364a;
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
        this.white = obj5;
        this.yellow = obj6;
        this.f1364a = obj7;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        Unit a6;
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
                    String str = (String) this.yellow;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    final g gVar = (g) this.f1364a;
                    boolean india = c0585q.india(gVar);
                    Object jade = c0585q.jade();
                    Object obj3 = C0580l.alpha;
                    if (india || jade == obj3) {
                        final int i4 = 1;
                        jade = new Function0() { // from class: C9.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i4) {
                                    case 0:
                                        gVar.lima(false, false);
                                        return Unit.INSTANCE;
                                    case 1:
                                        a aVar = gVar.f1366u;
                                        if (aVar != null) {
                                            aVar.invoke();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        g gVar2 = gVar.f1365t;
                                        if (gVar2 != null) {
                                            gVar2.invoke();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q.f(jade);
                    }
                    Function0 function0 = (Function0) jade;
                    boolean india2 = c0585q.india(gVar);
                    Object jade2 = c0585q.jade();
                    if (india2 || jade2 == obj3) {
                        final int i5 = 2;
                        jade2 = new Function0() { // from class: C9.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i5) {
                                    case 0:
                                        gVar.lima(false, false);
                                        return Unit.INSTANCE;
                                    case 1:
                                        a aVar = gVar.f1366u;
                                        if (aVar != null) {
                                            aVar.invoke();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        g gVar2 = gVar.f1365t;
                                        if (gVar2 != null) {
                                            gVar2.invoke();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c0585q.f(jade2);
                    }
                    a.alpha((String) this.purple, (String) this.red, (String) this.silver, (String) this.teal, (String) this.white, str2, function0, (Function0) jade2, c0585q, 0, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                a6 = AddressButtonViewKt.a((InterfaceC1673j) this.purple, (C0437h) this.red, (Intent) this.silver, (InputFieldViewStyle) this.teal, (InputFieldViewItem) this.white, (ax) this.yellow, (TextLabelViewItem) this.f1364a, (InterfaceC0581m) obj, intValue2);
                return a6;
        }
    }
}
