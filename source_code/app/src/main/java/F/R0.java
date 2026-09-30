package F;

import fe.C1712d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class R0 extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R0(Function0 function0, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                this.purple.invoke();
                return Unit.INSTANCE;
            case 1:
                long j5 = ((Z.b) obj).alpha;
                this.purple.invoke();
                return Unit.INSTANCE;
            case 2:
                A0.aa.delta((A0.ad) obj, new A0.g(((Number) this.purple.invoke()).floatValue(), new C1712d(1.0f)));
                return Unit.INSTANCE;
            case 3:
                A0.aa.delta((A0.ad) obj, new A0.g(((Number) this.purple.invoke()).floatValue(), new C1712d(1.0f)));
                return Unit.INSTANCE;
            default:
                I6.a button = (I6.a) obj;
                Intrinsics.echo(button, "button");
                button.setAlpha(1.0f);
                button.setEnabled(true);
                button.setOnClickListener(new Z8.c(0, this.purple));
                return Unit.INSTANCE;
        }
    }
}
