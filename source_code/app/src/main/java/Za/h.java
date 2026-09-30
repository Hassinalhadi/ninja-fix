package Za;

import T.p;
import T.s;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import f0.AbstractC1680b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import t6.T2;
import xb.AbstractC3318b;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2526a;
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ String purple;
    public final /* synthetic */ Function0 red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ h(AbstractC1680b abstractC1680b, String str, Function0 function0, s sVar, boolean z2, String str2, int i4) {
        this.white = abstractC1680b;
        this.purple = str;
        this.red = function0;
        this.f2526a = sVar;
        this.silver = z2;
        this.yellow = str2;
        this.teal = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.teal | 1);
                String str = this.purple;
                boolean z2 = this.silver;
                String str2 = (String) this.yellow;
                T2.bravo((AbstractC1680b) this.white, str, this.red, (s) this.f2526a, z2, str2, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.teal | 1);
                P.d dVar = (P.d) this.f2526a;
                AbstractC3318b.bravo(this.purple, this.red, this.silver, (p) this.white, (P.d) this.yellow, dVar, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(String str, Function0 function0, boolean z2, p pVar, P.d dVar, P.d dVar2, int i4) {
        this.purple = str;
        this.red = function0;
        this.silver = z2;
        this.white = pVar;
        this.yellow = dVar;
        this.f2526a = dVar2;
        this.teal = i4;
    }
}
