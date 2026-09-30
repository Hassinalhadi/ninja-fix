package h9;

import com.incognia.internal.AZ;
import com.incognia.internal.Me;
import com.incognia.internal.d7p;
import com.incognia.internal.gzW;
import com.incognia.internal.jNy;
import com.incognia.internal.rCM;
import com.incognia.internal.vC;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class ap implements d7p {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ boolean bravo;
    public final /* synthetic */ List charlie;
    public final /* synthetic */ Object delta;
    public final /* synthetic */ Object echo;
    public final /* synthetic */ Object foxtrot;

    public /* synthetic */ ap(List list, Function1 function1, boolean z2, gzW gzw, rCM rcm) {
        this.charlie = list;
        this.delta = function1;
        this.bravo = z2;
        this.echo = gzw;
        this.foxtrot = rcm;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                gzW.b(this.charlie, (Function1) this.delta, this.bravo, (gzW) this.echo, (rCM) this.foxtrot);
                return;
            default:
                vC.b(this.bravo, this.charlie, (Me) this.delta, (AZ) this.echo, (jNy) this.foxtrot);
                return;
        }
    }

    public /* synthetic */ ap(boolean z2, List list, Me me2, AZ az, jNy jny) {
        this.bravo = z2;
        this.charlie = list;
        this.delta = me2;
        this.echo = az;
        this.foxtrot = jny;
    }
}
