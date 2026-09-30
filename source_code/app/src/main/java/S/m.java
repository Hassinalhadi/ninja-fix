package S;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;
    public final /* synthetic */ Function1 red;

    public /* synthetic */ m(Function1 function1, Function1 function12, int i4) {
        this.alpha = i4;
        this.purple = function1;
        this.red = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                this.purple.invoke(obj);
                this.red.invoke(obj);
                return Unit.INSTANCE;
            case 1:
                this.purple.invoke(obj);
                this.red.invoke(obj);
                return Unit.INSTANCE;
            default:
                Intrinsics.echo(obj, "<this>");
                Function1 function1 = this.purple;
                if (function1 != null) {
                    function1.invoke(obj);
                }
                this.red.invoke(obj);
                return Unit.INSTANCE;
        }
    }
}
