package Ec;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import f0.AbstractC1680b;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class ak implements Xd.l {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ String purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ int white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ ak(int i4, int i5, long j5, T.s sVar, String str, String str2) {
        this.teal = i4;
        this.purple = str;
        this.yellow = str2;
        this.silver = j5;
        this.red = sVar;
        this.white = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.white | 1);
                long j5 = this.silver;
                T.s sVar = this.red;
                ap.lima(this.teal, cyan, j5, sVar, (InterfaceC0581m) obj, this.purple, (String) this.yellow);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.teal | 1);
                long j6 = this.silver;
                z.s.alpha((AbstractC1680b) this.yellow, this.purple, this.red, j6, (InterfaceC0581m) obj, cyan2, this.white);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ak(AbstractC1680b abstractC1680b, String str, T.s sVar, long j5, int i4, int i5) {
        this.yellow = abstractC1680b;
        this.purple = str;
        this.red = sVar;
        this.silver = j5;
        this.teal = i4;
        this.white = i5;
    }
}
