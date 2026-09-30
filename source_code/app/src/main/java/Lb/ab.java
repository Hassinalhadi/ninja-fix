package Lb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import cb.EnumC0843h;
import gb.C1762a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s6.T4;
import t6.AbstractC3050r2;

/* loaded from: classes2.dex */
public final /* synthetic */ class ab implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1787a;
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ int purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ ab(int i4, int i5, Sb.e eVar, Function0 function0, Function0 function02, Function1 function1, int i10) {
        this.purple = i4;
        this.red = i5;
        this.teal = eVar;
        this.white = function0;
        this.yellow = function02;
        this.f1787a = function1;
        this.silver = i10;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.silver;
        Object obj3 = this.white;
        Object obj4 = this.teal;
        Object obj5 = this.f1787a;
        Object obj6 = this.yellow;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).intValue();
                int cyan = C0564b.cyan(i4 | 1);
                AbstractC0220c.mike(this.purple, this.red, (Sb.e) obj4, (Function0) obj3, (Function0) obj6, (Function1) obj5, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(i4 | 1);
                EnumC0843h enumC0843h = EnumC0843h.alpha;
                String str = (String) obj5;
                AbstractC3050r2.alpha((androidx.compose.runtime.ax) obj4, (androidx.compose.runtime.ax) obj3, this.purple, this.red, (Integer) obj6, str, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(this.red | 1);
                T.s sVar = (T.s) obj4;
                String str2 = (String) obj3;
                T4.alpha(sVar, str2, (String) obj6, (C1762a) obj5, this.purple, (InterfaceC0581m) obj, cyan3, this.silver);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ab(T.s sVar, String str, String str2, C1762a c1762a, int i4, int i5, int i10) {
        this.teal = sVar;
        this.white = str;
        this.yellow = str2;
        this.f1787a = c1762a;
        this.purple = i4;
        this.red = i5;
        this.silver = i10;
    }

    public /* synthetic */ ab(androidx.compose.runtime.ax axVar, androidx.compose.runtime.ax axVar2, int i4, int i5, Integer num, String str, int i10) {
        EnumC0843h enumC0843h = EnumC0843h.alpha;
        this.teal = axVar;
        this.white = axVar2;
        this.purple = i4;
        this.red = i5;
        this.yellow = num;
        this.f1787a = str;
        this.silver = i10;
    }
}
