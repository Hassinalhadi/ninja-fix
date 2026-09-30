package h9;

import com.incognia.internal.APn;
import com.incognia.internal.b8P;
import com.incognia.internal.d7p;
import com.incognia.internal.e7L;
import com.incognia.internal.gzW;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class ae implements d7p {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ boolean bravo;
    public final /* synthetic */ Object charlie;
    public final /* synthetic */ Object delta;
    public final /* synthetic */ Object echo;
    public final /* synthetic */ Object foxtrot;
    public final /* synthetic */ Object golf;

    public /* synthetic */ ae(b8P b8p, e7L e7l, Map map, Object obj, boolean z2, APn aPn) {
        this.charlie = b8p;
        this.delta = e7l;
        this.echo = map;
        this.foxtrot = obj;
        this.bravo = z2;
        this.golf = aPn;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                b8P.b((b8P) this.charlie, (e7L) this.delta, (Map) this.echo, this.foxtrot, this.bravo, (APn) this.golf);
                return;
            default:
                gzW.b((Function1) this.charlie, this.bravo, (gzW) this.delta, (List) this.echo, (List) this.foxtrot, (List) this.golf);
                return;
        }
    }

    public /* synthetic */ ae(Function1 function1, boolean z2, gzW gzw, List list, List list2, List list3) {
        this.charlie = function1;
        this.bravo = z2;
        this.delta = gzw;
        this.echo = list;
        this.foxtrot = list2;
        this.golf = list3;
    }
}
