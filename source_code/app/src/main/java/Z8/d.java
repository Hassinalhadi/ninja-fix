package Z8;

import T.s;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import t6.O2;

/* loaded from: classes2.dex */
public final class d extends Lambda implements l {
    public final /* synthetic */ Function0 alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2517c;
    public final /* synthetic */ String purple;
    public final /* synthetic */ s red;
    public final /* synthetic */ a silver;
    public final /* synthetic */ b teal;
    public final /* synthetic */ float white;
    public final /* synthetic */ boolean yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Function0 function0, String str, s sVar, a aVar, b bVar, float f5, boolean z2, int i4) {
        super(2);
        this.alpha = function0;
        this.purple = str;
        this.red = sVar;
        this.silver = aVar;
        this.teal = bVar;
        this.white = f5;
        this.yellow = z2;
        this.f2517c = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f2517c | 1);
        Function0 function0 = this.alpha;
        String str = this.purple;
        a aVar = this.silver;
        b bVar = this.teal;
        O2.alpha(function0, str, this.red, aVar, bVar, this.white, this.yellow, (InterfaceC0581m) obj, cyan);
        return Unit.INSTANCE;
    }
}
