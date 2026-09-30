package pa;

import T.s;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import wb.AbstractC3253e;

/* renamed from: pa.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2296b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13143a;
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ Function1 red;
    public final /* synthetic */ s silver;
    public final /* synthetic */ String teal;
    public final /* synthetic */ Function0 white;
    public final /* synthetic */ int yellow;

    public /* synthetic */ C2296b(String str, Function1 function1, s sVar, String str2, Function0 function0, int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = str;
        this.red = function1;
        this.silver = sVar;
        this.teal = str2;
        this.white = function0;
        this.yellow = i4;
        this.f13143a = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.yellow | 1);
                String str = this.teal;
                Function0 function0 = this.white;
                AbstractC2297c.delta(this.purple, this.red, this.silver, str, function0, (InterfaceC0581m) obj, cyan, this.f13143a);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.yellow | 1);
                Function0 function02 = this.white;
                AbstractC3253e.juliet(this.purple, this.red, this.silver, this.teal, function02, (InterfaceC0581m) obj, cyan2, this.f13143a);
                return Unit.INSTANCE;
        }
    }
}
