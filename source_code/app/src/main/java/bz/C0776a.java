package bz;

import androidx.compose.runtime.t0;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: bz.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0776a extends Pd.i implements Function1 {
    public C0788m alpha;
    public kotlin.jvm.internal.q purple;
    public int red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function1 f3454s;
    public final /* synthetic */ C0778c silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Q white;
    public final /* synthetic */ long yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0776a(C0778c c0778c, Object obj, Q q4, long j5, Function1 function1, Nd.c cVar) {
        super(1, cVar);
        this.silver = c0778c;
        this.teal = obj;
        this.white = q4;
        this.yellow = j5;
        this.f3454s = function1;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new C0776a(this.silver, this.teal, this.white, this.yellow, this.f3454s, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0776a) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.internal.q, java.lang.Object] */
    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.q qVar;
        C0788m c0788m;
        EnumC0784i enumC0784i;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        C0778c c0778c = this.silver;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    qVar = this.purple;
                    c0788m = this.alpha;
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                c0778c.charlie.red = (r) c0778c.alpha.alpha.invoke(this.teal);
                Q q4 = this.white;
                ((t0) c0778c.echo).setValue(q4.charlie);
                ((t0) c0778c.delta).setValue(Boolean.TRUE);
                C0788m c0788m2 = c0778c.charlie;
                C0788m c0788m3 = new C0788m(c0788m2.alpha, ((t0) c0788m2.purple).getValue(), AbstractC0779d.echo(c0788m2.red), c0788m2.silver, Long.MIN_VALUE, c0788m2.white);
                ?? obj2 = new Object();
                long j5 = this.yellow;
                X9.e eVar = new X9.e(c0778c, c0788m3, this.f3454s, (Object) obj2, 5);
                this.alpha = c0788m3;
                this.purple = obj2;
                this.red = 1;
                if (P.bravo(c0788m3, q4, j5, eVar, this) == aVar) {
                    return aVar;
                }
                qVar = obj2;
                c0788m = c0788m3;
            }
            if (qVar.alpha) {
                enumC0784i = EnumC0784i.alpha;
            } else {
                enumC0784i = EnumC0784i.purple;
            }
            C0778c.bravo(c0778c);
            return new C0785j(c0788m, enumC0784i);
        } catch (CancellationException e) {
            C0778c.bravo(c0778c);
            throw e;
        }
    }
}
