package Lb;

import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class ar implements Xd.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ Function1 teal;

    public /* synthetic */ ar(int i4, Function1 function1, boolean z2, boolean z10, boolean z11) {
        this.alpha = i4;
        this.purple = z2;
        this.red = z10;
        this.silver = z11;
        this.teal = function1;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        boolean z10;
        int i4 = this.alpha;
        InterfaceC0555v Card = (InterfaceC0555v) obj;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i4) {
            case 0:
                Intrinsics.echo(Card, "$this$Card");
                if ((intValue & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    AbstractC0220c.kilo(null, this.purple, this.red, this.silver, this.teal, c0585q, 0, 1);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                Intrinsics.echo(Card, "$this$Card");
                if ((intValue & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                if (c0585q2.magenta(intValue & 1, z10)) {
                    AbstractC0220c.juliet(null, this.purple, this.red, this.silver, this.teal, c0585q2, 0, 1);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
