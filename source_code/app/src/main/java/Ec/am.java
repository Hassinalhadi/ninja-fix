package Ec;

import a0.C0366t;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import s6.M6;

/* loaded from: classes2.dex */
public final /* synthetic */ class am implements Xd.l {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ String purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ T.s silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ am(String str, long j5, T.s sVar, C0366t c0366t, int i4) {
        this.purple = str;
        this.red = j5;
        this.silver = sVar;
        this.teal = c0366t;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(3121);
                long j5 = this.red;
                T.s sVar = this.silver;
                ap.india(this.purple, (String) this.teal, j5, sVar, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(385);
                String str = this.purple;
                T.s sVar2 = this.silver;
                C0366t c0366t = (C0366t) this.teal;
                M6.alpha(str, this.red, sVar2, c0366t, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ am(String str, String str2, long j5, T.s sVar, int i4) {
        this.purple = str;
        this.teal = str2;
        this.red = j5;
        this.silver = sVar;
    }
}
