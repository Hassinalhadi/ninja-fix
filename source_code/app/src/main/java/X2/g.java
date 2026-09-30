package X2;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import androidx.lifecycle.ac;
import androidx.lifecycle.al;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import okhttp3.Headers;
import t6.AbstractC2967a3;
import vf.AbstractC3220y;

/* loaded from: classes3.dex */
public final class g {
    public final Context alpha;
    public b bravo;
    public Object charlie;
    public Aa.m delta;
    public Y2.d echo;
    public final List foxtrot;
    public Z2.e golf;
    public final Headers.Builder hotel;
    public final LinkedHashMap india;
    public final boolean juliet;
    public final boolean kilo;
    public final A2.h lima;
    public Y2.i mike;
    public Y2.g november;
    public ac oscar;
    public Y2.i papa;
    public Y2.g quebec;

    public g(Context context) {
        this.alpha = context;
        this.bravo = a3.f.alpha;
        this.charlie = null;
        this.delta = null;
        this.echo = null;
        this.foxtrot = CollectionsKt.emptyList();
        this.golf = null;
        this.hotel = null;
        this.india = null;
        this.juliet = true;
        this.kilo = true;
        this.lima = null;
        this.mike = null;
        this.november = null;
        this.oscar = null;
        this.papa = null;
        this.quebec = null;
    }

    public final h alpha() {
        Headers headers;
        n nVar;
        ac acVar;
        Y2.i iVar;
        l lVar;
        ac lifecycle;
        Object obj = this.charlie;
        if (obj == null) {
            obj = j.alpha;
        }
        Object obj2 = obj;
        Aa.m mVar = this.delta;
        b bVar = this.bravo;
        Bitmap.Config config = bVar.golf;
        Y2.d dVar = this.echo;
        if (dVar == null) {
            dVar = bVar.foxtrot;
        }
        Y2.d dVar2 = dVar;
        Z2.e eVar = this.golf;
        if (eVar == null) {
            eVar = bVar.echo;
        }
        Z2.e eVar2 = eVar;
        Headers.Builder builder = this.hotel;
        if (builder != null) {
            headers = builder.build();
        } else {
            headers = null;
        }
        if (headers == null) {
            headers = a3.h.charlie;
        } else {
            Bitmap.Config[] configArr = a3.h.alpha;
        }
        Headers headers2 = headers;
        LinkedHashMap linkedHashMap = this.india;
        if (linkedHashMap != null) {
            nVar = new n(AbstractC2967a3.charlie(linkedHashMap));
        } else {
            nVar = null;
        }
        if (nVar == null) {
            nVar = n.bravo;
        }
        n nVar2 = nVar;
        b bVar2 = this.bravo;
        boolean z2 = bVar2.hotel;
        bVar2.getClass();
        b bVar3 = this.bravo;
        a aVar = bVar3.india;
        a aVar2 = bVar3.juliet;
        a aVar3 = bVar3.kilo;
        AbstractC3220y abstractC3220y = bVar3.alpha;
        AbstractC3220y abstractC3220y2 = bVar3.bravo;
        AbstractC3220y abstractC3220y3 = bVar3.charlie;
        AbstractC3220y abstractC3220y4 = bVar3.delta;
        ac acVar2 = this.oscar;
        Context context = this.alpha;
        if (acVar2 == null) {
            Object obj3 = context;
            while (true) {
                if (obj3 instanceof al) {
                    lifecycle = ((al) obj3).getLifecycle();
                    break;
                }
                if (!(obj3 instanceof ContextWrapper)) {
                    lifecycle = null;
                    break;
                }
                obj3 = ((ContextWrapper) obj3).getBaseContext();
            }
            if (lifecycle == null) {
                lifecycle = f.bravo;
            }
            acVar = lifecycle;
        } else {
            acVar = acVar2;
        }
        Y2.i iVar2 = this.mike;
        if (iVar2 == null) {
            Y2.i iVar3 = this.papa;
            if (iVar3 == null) {
                iVar3 = new Y2.c(context);
            }
            iVar = iVar3;
        } else {
            iVar = iVar2;
        }
        Y2.g gVar = this.november;
        if (gVar == null && (gVar = this.quebec) == null) {
            if (iVar2 instanceof Y2.f) {
            }
            gVar = Y2.g.purple;
        }
        Y2.g gVar2 = gVar;
        A2.h hVar = this.lima;
        if (hVar != null) {
            lVar = new l(AbstractC2967a3.charlie(hVar.alpha));
        } else {
            lVar = null;
        }
        if (lVar == null) {
            lVar = l.purple;
        }
        return new h(this.alpha, obj2, mVar, config, dVar2, this.foxtrot, eVar2, headers2, nVar2, this.juliet, z2, false, this.kilo, aVar, aVar2, aVar3, abstractC3220y, abstractC3220y2, abstractC3220y3, abstractC3220y4, acVar, iVar, gVar2, lVar, new c(this.mike, this.november, this.golf, this.echo), this.bravo);
    }

    public final void bravo() {
        this.golf = new Z2.a(100);
    }

    public g(h hVar, Context context) {
        this.alpha = context;
        this.bravo = hVar.zulu;
        this.charlie = hVar.bravo;
        this.delta = hVar.charlie;
        c cVar = hVar.yankee;
        this.echo = cVar.delta;
        this.foxtrot = hVar.foxtrot;
        this.golf = cVar.charlie;
        this.hotel = hVar.hotel.newBuilder();
        this.india = y.amber(hVar.india.alpha);
        this.juliet = hVar.juliet;
        this.kilo = hVar.mike;
        this.lima = new A2.h(hVar.xray);
        this.mike = cVar.alpha;
        this.november = cVar.bravo;
        if (hVar.alpha == context) {
            this.oscar = hVar.uniform;
            this.papa = hVar.victor;
            this.quebec = hVar.whiskey;
        } else {
            this.oscar = null;
            this.papa = null;
            this.quebec = null;
        }
    }
}
