package qb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.A7;
import s6.B7;

/* renamed from: qb.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2450q implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ String teal;
    public final /* synthetic */ String white;
    public final /* synthetic */ boolean yellow;

    public /* synthetic */ C2450q(Function0 function0, T.s sVar, String str, String str2, String str3, boolean z2, int i4, int i5) {
        this.alpha = i5;
        this.purple = function0;
        this.red = sVar;
        this.silver = str;
        this.teal = str2;
        this.white = str3;
        this.yellow = z2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(49);
                String str = this.white;
                boolean z2 = this.yellow;
                A7.alpha(this.purple, this.red, this.silver, this.teal, str, z2, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(49);
                String str2 = this.white;
                boolean z10 = this.yellow;
                B7.bravo(this.purple, this.red, this.silver, this.teal, str2, z10, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
        }
    }
}
