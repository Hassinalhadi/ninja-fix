package yb;

import T.p;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import qb.EnumC2443j;

/* renamed from: yb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3411b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14157a;
    public final /* synthetic */ int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Enum f14158b;
    public final /* synthetic */ String purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ p teal;
    public final /* synthetic */ Function0 white;
    public final /* synthetic */ int yellow;

    public /* synthetic */ C3411b(String str, String str2, String str3, Enum r4, p pVar, Function0 function0, int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = str;
        this.red = str2;
        this.silver = str3;
        this.f14158b = r4;
        this.teal = pVar;
        this.white = function0;
        this.yellow = i4;
        this.f14157a = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.yellow | 1);
                String str = this.purple;
                String str2 = this.red;
                String str3 = this.silver;
                EnumC3414e enumC3414e = (EnumC3414e) this.f14158b;
                Function0 function0 = this.white;
                AbstractC3410a.delta(str, str2, str3, enumC3414e, this.teal, function0, (InterfaceC0581m) obj, cyan, this.f14157a);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.yellow | 1);
                String str4 = this.purple;
                String str5 = this.red;
                String str6 = this.silver;
                EnumC2443j enumC2443j = (EnumC2443j) this.f14158b;
                Function0 function02 = this.white;
                AbstractC3410a.bravo(str4, str5, str6, enumC2443j, this.teal, function02, (InterfaceC0581m) obj, cyan2, this.f14157a);
                return Unit.INSTANCE;
        }
    }
}
