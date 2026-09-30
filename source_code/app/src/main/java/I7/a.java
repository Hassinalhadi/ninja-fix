package I7;

import java.util.Collections;
import java.util.HashSet;
import s6.F5;

/* loaded from: classes2.dex */
public final class a {
    public String alpha = null;
    public final HashSet bravo;
    public final HashSet charlie;
    public int delta;
    public int echo;
    public e foxtrot;
    public final HashSet golf;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.bravo = hashSet;
        this.charlie = new HashSet();
        this.delta = 0;
        this.echo = 0;
        this.golf = new HashSet();
        hashSet.add(p.alpha(cls));
        for (Class cls2 : clsArr) {
            F5.bravo(cls2, "Null interface");
            this.bravo.add(p.alpha(cls2));
        }
    }

    public final void alpha(j jVar) {
        if (!this.bravo.contains(jVar.alpha)) {
            this.charlie.add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public final b bravo() {
        boolean z2;
        if (this.foxtrot != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return new b(this.alpha, new HashSet(this.bravo), new HashSet(this.charlie), this.delta, this.echo, this.foxtrot, this.golf);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void charlie(int i4) {
        boolean z2;
        if (this.delta == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.delta = i4;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }

    public a(p pVar, p[] pVarArr) {
        HashSet hashSet = new HashSet();
        this.bravo = hashSet;
        this.charlie = new HashSet();
        this.delta = 0;
        this.echo = 0;
        this.golf = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            F5.bravo(pVar2, "Null interface");
        }
        Collections.addAll(this.bravo, pVarArr);
    }
}
