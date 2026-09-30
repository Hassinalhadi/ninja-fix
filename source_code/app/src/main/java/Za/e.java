package Za;

import T.s;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import cb.C0840e;
import g0.C1726f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.AbstractC2617b6;
import s6.AbstractC2806w7;
import t6.R2;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements l {
    public final /* synthetic */ int alpha = 2;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ kotlin.e red;
    public final /* synthetic */ s silver;
    public final /* synthetic */ boolean teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ int yellow;

    public /* synthetic */ e(C0840e c0840e, s sVar, boolean z2, C1726f c1726f, l lVar, int i4) {
        this.purple = c0840e;
        this.silver = sVar;
        this.teal = z2;
        this.white = c1726f;
        this.red = lVar;
        this.yellow = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.yellow | 1);
                Function0 function0 = (Function0) this.red;
                s sVar = this.silver;
                R2.alpha(cyan, sVar, (InterfaceC0581m) obj, (String) this.purple, (String) this.white, function0, this.teal);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.yellow | 1);
                boolean z2 = this.teal;
                String str = (String) this.white;
                AbstractC2806w7.charlie(cyan2, this.silver, (InterfaceC0581m) obj, (String) this.purple, str, (Function0) this.red, z2);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(this.yellow | 1);
                C1726f c1726f = (C1726f) this.white;
                l lVar = (l) this.red;
                AbstractC2617b6.bravo((C0840e) this.purple, this.silver, this.teal, c1726f, lVar, (InterfaceC0581m) obj, cyan3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(String str, Function0 function0, s sVar, boolean z2, String str2, int i4) {
        this.purple = str;
        this.red = function0;
        this.silver = sVar;
        this.teal = z2;
        this.white = str2;
        this.yellow = i4;
    }

    public /* synthetic */ e(String str, boolean z2, String str2, Function0 function0, s sVar, int i4) {
        this.purple = str;
        this.teal = z2;
        this.white = str2;
        this.red = function0;
        this.silver = sVar;
        this.yellow = i4;
    }
}
