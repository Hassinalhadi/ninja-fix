package h9;

import com.incognia.internal.Czx;
import com.incognia.internal.JMS;
import com.incognia.internal.K4F;
import com.incognia.internal.LoK;
import com.incognia.internal.MDG;
import com.incognia.internal.MP;
import com.incognia.internal.Me;
import com.incognia.internal.UZb;
import com.incognia.internal.br;
import com.incognia.internal.d7p;
import com.incognia.internal.hp;
import com.incognia.internal.qK;
import com.incognia.internal.rCM;
import com.incognia.internal.urQ;
import com.incognia.internal.zZG;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* renamed from: h9.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1834l implements d7p {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;
    public final /* synthetic */ Object charlie;
    public final /* synthetic */ Object delta;
    public final /* synthetic */ Object echo;

    public /* synthetic */ C1834l(Object obj, zZG zzg, Function1 function1, Function1 function12) {
        this.alpha = 2;
        this.charlie = obj;
        this.bravo = zzg;
        this.echo = function1;
        this.delta = function12;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        switch (this.alpha) {
            case 0:
                LoK.b((K4F) this.charlie, (List) this.bravo, (hp) this.delta, (Function1) this.echo);
                return;
            case 1:
                MDG.b((List) this.bravo, (Czx) this.charlie, (MDG) this.delta, (rCM) this.echo);
                return;
            case 2:
                UZb.b(this.charlie, (zZG) this.bravo, (Function1) this.echo, (Function1) this.delta);
                return;
            case 3:
                br.b((urQ) this.charlie, (JSONObject) this.bravo, (JMS) this.delta, (Function1) this.echo);
                return;
            default:
                qK.b(this.charlie, (Me) this.bravo, (MP) this.delta, (Function0) this.echo);
                return;
        }
    }

    public /* synthetic */ C1834l(Object obj, Object obj2, Object obj3, kotlin.e eVar, int i4) {
        this.alpha = i4;
        this.charlie = obj;
        this.bravo = obj2;
        this.delta = obj3;
        this.echo = eVar;
    }

    public /* synthetic */ C1834l(List list, Czx czx, MDG mdg, rCM rcm) {
        this.alpha = 1;
        this.bravo = list;
        this.charlie = czx;
        this.delta = mdg;
        this.echo = rcm;
    }
}
