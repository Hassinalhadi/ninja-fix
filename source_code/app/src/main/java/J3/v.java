package J3;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class v implements com.bumptech.glide.load.data.e, com.bumptech.glide.load.data.d {
    public final ArrayList alpha;
    public final J2.t purple;
    public int red;
    public com.bumptech.glide.g silver;
    public com.bumptech.glide.load.data.d teal;
    public List white;
    public boolean yellow;

    public v(ArrayList arrayList, J2.t tVar) {
        this.purple = tVar;
        if (!arrayList.isEmpty()) {
            this.alpha = arrayList;
            this.red = 0;
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class alpha() {
        return ((com.bumptech.glide.load.data.e) this.alpha.get(0)).alpha();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void bravo(Exception exc) {
        List list = this.white;
        Y3.f.charlie(list, "Argument must not be null");
        list.add(exc);
        foxtrot();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.yellow = true;
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final E3.a charlie() {
        return ((com.bumptech.glide.load.data.e) this.alpha.get(0)).charlie();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        List list = this.white;
        if (list != null) {
            this.purple.alpha(list);
        }
        this.white = null;
        Iterator it = this.alpha.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).cleanup();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void delta(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        this.silver = gVar;
        this.teal = dVar;
        this.white = (List) this.purple.charlie();
        ((com.bumptech.glide.load.data.e) this.alpha.get(this.red)).delta(gVar, this);
        if (this.yellow) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void echo(Object obj) {
        if (obj != null) {
            this.teal.echo(obj);
        } else {
            foxtrot();
        }
    }

    public final void foxtrot() {
        if (this.yellow) {
            return;
        }
        if (this.red < this.alpha.size() - 1) {
            this.red++;
            delta(this.silver, this.teal);
        } else {
            Y3.f.bravo(this.white);
            this.teal.bravo(new GlideException("Fetch failed", new ArrayList(this.white)));
        }
    }
}
