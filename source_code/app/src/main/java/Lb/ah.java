package Lb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class ah implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ T.s purple;
    public final /* synthetic */ Function0 red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ String teal;
    public final /* synthetic */ int white;
    public final /* synthetic */ int yellow;

    public /* synthetic */ ah(T.s sVar, Function0 function0, String str, String str2, int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = sVar;
        this.red = function0;
        this.silver = str;
        this.teal = str2;
        this.white = i4;
        this.yellow = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.white | 1);
                String str = this.teal;
                AbstractC0220c.bravo(this.purple, this.red, this.silver, str, (InterfaceC0581m) obj, cyan, this.yellow);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.white | 1);
                String str2 = this.teal;
                AbstractC0220c.oscar(this.purple, this.red, this.silver, str2, (InterfaceC0581m) obj, cyan2, this.yellow);
                return Unit.INSTANCE;
        }
    }
}
