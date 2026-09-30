package Za;

import T.s;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.AbstractC2833z7;
import s6.B7;
import t6.T2;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ s red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ String teal;

    public /* synthetic */ f(String str, Function0 function0, s sVar, boolean z2, int i4, int i5) {
        this.alpha = i5;
        this.teal = str;
        this.purple = function0;
        this.red = sVar;
        this.silver = z2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(1);
                boolean z2 = this.silver;
                String str = this.teal;
                Function0 function0 = this.purple;
                T2.charlie(cyan, this.red, (InterfaceC0581m) obj, str, function0, z2);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(1);
                boolean z10 = this.silver;
                String str2 = this.teal;
                Function0 function02 = this.purple;
                db.s.alpha(cyan2, this.red, (InterfaceC0581m) obj, str2, function02, z10);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC2833z7.bravo(C0564b.cyan(385), this.red, (InterfaceC0581m) obj, this.teal, this.purple, this.silver);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                B7.alpha(C0564b.cyan(385), this.red, (InterfaceC0581m) obj, this.teal, this.purple, this.silver);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(Function0 function0, s sVar, boolean z2, String str, int i4, int i5) {
        this.alpha = i5;
        this.purple = function0;
        this.red = sVar;
        this.silver = z2;
        this.teal = str;
    }
}
