package Ec;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import cb.C0841f;
import kb.AbstractC2030f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.D4;

/* loaded from: classes2.dex */
public final /* synthetic */ class z implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ Object white;

    public /* synthetic */ z(int i4, P.d dVar, T.s sVar, Function0 function0, boolean z2) {
        this.alpha = 5;
        this.red = function0;
        this.white = sVar;
        this.purple = z2;
        this.silver = dVar;
        this.teal = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.teal | 1);
                Function0 function0 = (Function0) this.red;
                Function0 function02 = (Function0) this.silver;
                ap.juliet((Dc.k) this.white, this.purple, function0, function02, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).intValue();
                Jc.o.foxtrot((Kc.e) this.white, this.purple, (Function0) this.red, (Function0) this.silver, (InterfaceC0581m) obj, C0564b.cyan(this.teal | 1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.teal | 1);
                Function0 function03 = (Function0) this.red;
                D4.alpha(cyan2, (T.s) this.white, (InterfaceC0581m) obj, (String) this.silver, function03, this.purple);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).intValue();
                ga.e.hotel((String) this.white, (String) this.silver, this.purple, (Function0) this.red, (InterfaceC0581m) obj, C0564b.cyan(this.teal | 1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(this.teal | 1);
                C0841f c0841f = (C0841f) this.white;
                boolean z2 = this.purple;
                Xd.l lVar = (Xd.l) this.silver;
                AbstractC2030f.alpha(c0841f, (T.s) this.red, z2, lVar, (InterfaceC0581m) obj, cyan3);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan4 = C0564b.cyan(this.teal | 1);
                P.d dVar = (P.d) this.silver;
                z.r.alpha(cyan4, dVar, (T.s) this.white, (InterfaceC0581m) obj, (Function0) this.red, this.purple);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ z(int i4, T.s sVar, String str, Function0 function0, boolean z2) {
        this.alpha = 2;
        this.red = function0;
        this.white = sVar;
        this.silver = str;
        this.purple = z2;
        this.teal = i4;
    }

    public /* synthetic */ z(C0841f c0841f, T.s sVar, boolean z2, Xd.l lVar, int i4) {
        this.alpha = 4;
        this.white = c0841f;
        this.red = sVar;
        this.purple = z2;
        this.silver = lVar;
        this.teal = i4;
    }

    public /* synthetic */ z(Object obj, boolean z2, Function0 function0, Function0 function02, int i4, int i5) {
        this.alpha = i5;
        this.white = obj;
        this.purple = z2;
        this.red = function0;
        this.silver = function02;
        this.teal = i4;
    }

    public /* synthetic */ z(String str, String str2, boolean z2, Function0 function0, int i4) {
        this.alpha = 3;
        this.white = str;
        this.silver = str2;
        this.purple = z2;
        this.red = function0;
        this.teal = i4;
    }
}
