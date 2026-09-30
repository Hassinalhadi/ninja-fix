package wb;

import T.p;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: wb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3250b implements l {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Function1 red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ p teal;
    public final /* synthetic */ int white;
    public final /* synthetic */ int yellow;

    public /* synthetic */ C3250b(boolean z2, Function1 function1, p pVar, boolean z10, int i4, int i5) {
        this.purple = z2;
        this.red = function1;
        this.teal = pVar;
        this.silver = z10;
        this.white = i4;
        this.yellow = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.white | 1);
                boolean z2 = this.silver;
                int i4 = this.yellow;
                boolean z10 = this.purple;
                AbstractC3253e.alpha(cyan, i4, this.teal, (InterfaceC0581m) obj, this.red, z10, z2);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.white | 1);
                p pVar = this.teal;
                int i5 = this.yellow;
                AbstractC3253e.delta(cyan2, i5, pVar, (InterfaceC0581m) obj, this.red, this.purple, this.silver);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C3250b(boolean z2, Function1 function1, boolean z10, p pVar, int i4, int i5) {
        this.purple = z2;
        this.red = function1;
        this.silver = z10;
        this.teal = pVar;
        this.white = i4;
        this.yellow = i5;
    }
}
