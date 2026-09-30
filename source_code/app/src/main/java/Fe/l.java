package Fe;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class l extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ String red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, String str2, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = str;
        this.red = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = this.red;
        String str2 = this.purple;
        switch (this.alpha) {
            case 0:
                s function = (s) obj;
                Intrinsics.echo(function, "$this$function");
                f fVar = m.bravo;
                function.alpha(str2, fVar);
                f fVar2 = m.alpha;
                function.alpha(str, fVar, fVar, fVar2, fVar2);
                function.charlie(str2, fVar2);
                return Unit.INSTANCE;
            case 1:
                s function2 = (s) obj;
                Intrinsics.echo(function2, "$this$function");
                f fVar3 = m.bravo;
                function2.alpha(str2, fVar3);
                function2.alpha(str, fVar3, fVar3, fVar3);
                function2.charlie(str2, fVar3);
                return Unit.INSTANCE;
            case 2:
                s function3 = (s) obj;
                Intrinsics.echo(function3, "$this$function");
                f fVar4 = m.bravo;
                function3.alpha(str2, fVar4);
                f fVar5 = m.alpha;
                function3.alpha(str, fVar4, fVar4, m.charlie, fVar5);
                function3.charlie(str2, fVar5);
                return Unit.INSTANCE;
            case 3:
                s function4 = (s) obj;
                Intrinsics.echo(function4, "$this$function");
                f fVar6 = m.bravo;
                function4.alpha(str2, fVar6);
                f fVar7 = m.charlie;
                function4.alpha(str2, fVar7);
                f fVar8 = m.alpha;
                function4.alpha(str, fVar6, fVar7, fVar7, fVar8);
                function4.charlie(str2, fVar8);
                return Unit.INSTANCE;
            case 4:
                s function5 = (s) obj;
                Intrinsics.echo(function5, "$this$function");
                f fVar9 = m.charlie;
                function5.alpha(str2, fVar9);
                function5.charlie(str, m.bravo, fVar9);
                return Unit.INSTANCE;
            default:
                s function6 = (s) obj;
                Intrinsics.echo(function6, "$this$function");
                function6.alpha(str2, m.alpha);
                function6.charlie(str, m.bravo, m.charlie);
                return Unit.INSTANCE;
        }
    }
}
