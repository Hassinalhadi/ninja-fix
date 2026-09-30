package Sc;

import T.s;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.H5;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Xd.l {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ String purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public /* synthetic */ h(int i4, int i5, long j5, s sVar, String str, String str2) {
        this.purple = str;
        this.teal = str2;
        this.white = sVar;
        this.red = j5;
        this.silver = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(1);
                long j5 = this.red;
                int i4 = this.silver;
                a.alpha(cyan, i4, j5, (s) this.white, (InterfaceC0581m) obj, this.purple, (String) this.teal);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.silver | 1);
                T.p pVar = (T.p) this.teal;
                Function0 function0 = (Function0) this.white;
                H5.alpha(this.purple, this.red, pVar, function0, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(String str, long j5, T.p pVar, Function0 function0, int i4) {
        this.purple = str;
        this.red = j5;
        this.teal = pVar;
        this.white = function0;
        this.silver = i4;
    }
}
