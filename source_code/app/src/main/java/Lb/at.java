package Lb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.AbstractC2706l5;
import s6.N6;

/* loaded from: classes2.dex */
public final /* synthetic */ class at implements Xd.l {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ String purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ T.s silver;
    public final /* synthetic */ Function0 teal;
    public final /* synthetic */ int white;

    public /* synthetic */ at(T.s sVar, String str, Function0 function0, int i4, int i5) {
        this.silver = sVar;
        this.purple = str;
        this.teal = function0;
        this.red = i4;
        this.white = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.red | 1);
                AbstractC0220c.xray(cyan, this.white, this.silver, (InterfaceC0581m) obj, this.purple, this.teal);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.white | 1);
                T.s sVar = this.silver;
                Function0 function0 = this.teal;
                N6.alpha(this.red, cyan2, sVar, (InterfaceC0581m) obj, this.purple, function0);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(this.white | 1);
                T.s sVar2 = this.silver;
                AbstractC2706l5.alpha(this.red, cyan3, sVar2, (InterfaceC0581m) obj, this.purple, this.teal);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ at(String str, int i4, T.s sVar, Function0 function0, int i5) {
        this.purple = str;
        this.red = i4;
        this.silver = sVar;
        this.teal = function0;
        this.white = i5;
    }

    public /* synthetic */ at(String str, Function0 function0, T.s sVar, int i4, int i5) {
        this.purple = str;
        this.teal = function0;
        this.silver = sVar;
        this.red = i4;
        this.white = i5;
    }
}
