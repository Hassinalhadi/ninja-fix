package Lb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class aw implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1793a;
    public final /* synthetic */ int alpha;
    public final /* synthetic */ T.p purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ boolean teal;
    public final /* synthetic */ Function1 white;
    public final /* synthetic */ int yellow;

    public /* synthetic */ aw(T.p pVar, boolean z2, boolean z10, boolean z11, Function1 function1, int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = pVar;
        this.red = z2;
        this.silver = z10;
        this.teal = z11;
        this.white = function1;
        this.yellow = i4;
        this.f1793a = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.yellow | 1);
                Function1 function1 = this.white;
                AbstractC0220c.juliet(this.purple, this.red, this.silver, this.teal, function1, (InterfaceC0581m) obj, cyan, this.f1793a);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.yellow | 1);
                Function1 function12 = this.white;
                AbstractC0220c.kilo(this.purple, this.red, this.silver, this.teal, function12, (InterfaceC0581m) obj, cyan2, this.f1793a);
                return Unit.INSTANCE;
        }
    }
}
