package Wf;

import java.io.InputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2707l6;

/* loaded from: classes2.dex */
public final class j extends Pd.i implements Function1 {
    public Function1 alpha;
    public int purple;
    public final /* synthetic */ Function1 red;
    public final /* synthetic */ x silver;
    public final /* synthetic */ String teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Function1 function1, x xVar, String str, Nd.c cVar) {
        super(1, cVar);
        this.red = function1;
        this.silver = xVar;
        this.teal = str;
    }

    @Override // Pd.a
    public final Nd.c create(Nd.c cVar) {
        return new j(this.red, this.silver, this.teal, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((j) create((Nd.c) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        if (i4 != 0) {
            if (i4 == 1) {
                function1 = this.alpha;
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            Function1 function12 = this.red;
            this.alpha = function12;
            this.purple = 1;
            InputStream alpha = this.silver.alpha(this.teal);
            try {
                Object foxtrot = AbstractC2707l6.foxtrot(alpha);
                alpha.close();
                if (foxtrot == aVar) {
                    return aVar;
                }
                function1 = function12;
                obj = foxtrot;
            } finally {
            }
        }
        return function1.invoke(obj);
    }
}
