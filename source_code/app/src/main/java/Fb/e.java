package Fb;

import T.s;
import androidx.compose.foundation.layout.InterfaceC0539e;
import androidx.compose.foundation.layout.InterfaceC0541g;
import androidx.compose.foundation.layout.M;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import b.C0704t;
import d.C1543m;
import j.C1918a;
import j.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2786u5;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1289a;
    public final /* synthetic */ int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1291c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1292d;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, boolean z2, Object obj8, Object obj9, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.silver = obj2;
        this.teal = obj3;
        this.white = obj4;
        this.yellow = obj5;
        this.f1289a = obj6;
        this.f1290b = obj7;
        this.purple = z2;
        this.f1291c = obj8;
        this.f1292d = obj9;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(1);
                String str = (String) this.red;
                String str2 = (String) this.yellow;
                String str3 = (String) this.f1290b;
                Function0 function0 = (Function0) this.f1291c;
                T.p pVar = (T.p) this.f1292d;
                f.alpha(str, (String) this.silver, (String) this.teal, (String) this.white, str2, (String) this.f1289a, str3, this.purple, function0, pVar, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(1772593);
                C1918a c1918a = (C1918a) this.red;
                M m4 = (M) this.white;
                InterfaceC0541g interfaceC0541g = (InterfaceC0541g) this.yellow;
                InterfaceC0539e interfaceC0539e = (InterfaceC0539e) this.f1289a;
                C0704t c0704t = (C0704t) this.f1291c;
                Function1 function1 = (Function1) this.f1292d;
                AbstractC2786u5.alpha(c1918a, (s) this.silver, (t) this.teal, m4, interfaceC0541g, interfaceC0539e, (C1543m) this.f1290b, this.purple, c0704t, function1, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
        }
    }
}
