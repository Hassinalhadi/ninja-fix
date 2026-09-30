package h9;

import com.incognia.internal.G1;
import com.incognia.internal.WA;
import com.incognia.internal.d7p;
import com.incognia.internal.xIr;
import com.incognia.internal.yE;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final /* synthetic */ class y implements d7p {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ xIr bravo;
    public final /* synthetic */ List charlie;
    public final /* synthetic */ Ref.ObjectRef delta;
    public final /* synthetic */ Function1 echo;
    public final /* synthetic */ Object foxtrot;

    public /* synthetic */ y(xIr xir, Object obj, List list, Ref.ObjectRef objectRef, Function1 function1) {
        this.bravo = xir;
        this.foxtrot = obj;
        this.charlie = list;
        this.delta = objectRef;
        this.echo = function1;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                WA.b(this.bravo, this.foxtrot, this.charlie, this.delta, this.echo);
                return;
            default:
                yE.b(this.bravo, this.charlie, this.delta, (G1) this.foxtrot, this.echo);
                return;
        }
    }

    public /* synthetic */ y(xIr xir, List list, Ref.ObjectRef objectRef, G1 g12, Function1 function1) {
        this.bravo = xir;
        this.charlie = list;
        this.delta = objectRef;
        this.foxtrot = g12;
        this.echo = function1;
    }
}
