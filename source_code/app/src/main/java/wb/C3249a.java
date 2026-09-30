package wb;

import T.p;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p3.ah;
import vb.AbstractC3185a;

/* renamed from: wb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3249a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14037a;
    public final /* synthetic */ int alpha = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14038b;
    public final /* synthetic */ String purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ p silver;
    public final /* synthetic */ boolean teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ boolean yellow;

    public /* synthetic */ C3249a(String str, Function1 function1, p pVar, boolean z2, String str2, boolean z10, int i4, int i5) {
        this.purple = str;
        this.red = function1;
        this.silver = pVar;
        this.teal = z2;
        this.white = str2;
        this.yellow = z10;
        this.f14037a = i4;
        this.f14038b = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.f14037a | 1);
                String str = this.purple;
                String str2 = (String) this.white;
                int i4 = this.f14038b;
                boolean z2 = this.teal;
                AbstractC3253e.foxtrot(cyan, i4, this.silver, (InterfaceC0581m) obj, str, str2, (Function1) this.red, z2, this.yellow);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.f14037a | 1);
                boolean z10 = this.yellow;
                int i5 = this.f14038b;
                String str3 = this.purple;
                Function1 function1 = (Function1) this.red;
                p pVar = this.silver;
                AbstractC3253e.golf(cyan2, i5, pVar, (InterfaceC0581m) obj, str3, (String) this.white, function1, this.teal, z10);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(this.f14037a | 1);
                String str4 = this.purple;
                boolean z11 = this.yellow;
                AbstractC3185a.alpha((ah) this.red, str4, this.teal, this.silver, (Function0) this.white, z11, (InterfaceC0581m) obj, cyan3, this.f14038b);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C3249a(ah ahVar, String str, boolean z2, p pVar, Function0 function0, boolean z10, int i4, int i5) {
        this.red = ahVar;
        this.purple = str;
        this.teal = z2;
        this.silver = pVar;
        this.white = function0;
        this.yellow = z10;
        this.f14037a = i4;
        this.f14038b = i5;
    }

    public /* synthetic */ C3249a(boolean z2, Function1 function1, String str, p pVar, boolean z10, String str2, int i4, int i5) {
        this.teal = z2;
        this.red = function1;
        this.purple = str;
        this.silver = pVar;
        this.yellow = z10;
        this.white = str2;
        this.f14037a = i4;
        this.f14038b = i5;
    }
}
