package h9;

import com.incognia.internal.MDG;
import com.incognia.internal.d7p;
import com.incognia.internal.rCM;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ MDG bravo;
    public final /* synthetic */ String charlie;
    public final /* synthetic */ List delta;
    public final /* synthetic */ rCM echo;

    public /* synthetic */ o(MDG mdg, String str, List list, rCM rcm, int i4) {
        this.alpha = i4;
        this.bravo = mdg;
        this.charlie = str;
        this.delta = list;
        this.echo = rcm;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                MDG.b(this.bravo, this.charlie, this.delta, this.echo);
                return;
            default:
                MDG.W(this.bravo, this.charlie, this.delta, this.echo);
                return;
        }
    }
}
