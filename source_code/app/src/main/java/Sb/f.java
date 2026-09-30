package Sb;

import T.s;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import n.AbstractC2128c;
import y.InterfaceC3372l;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ s purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ f(Object obj, s sVar, long j5, int i4, int i5) {
        this.alpha = i5;
        this.silver = obj;
        this.purple = sVar;
        this.red = j5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(49);
                s sVar = this.purple;
                long j5 = this.red;
                d.hotel((Function0) this.silver, sVar, j5, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(1);
                s sVar2 = this.purple;
                long j6 = this.red;
                AbstractC2128c.alpha((InterfaceC3372l) this.silver, sVar2, j6, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
        }
    }
}
