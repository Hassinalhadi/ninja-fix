package Le;

import Ie.ac;
import Ie.ag;
import Ie.aq;
import Ie.av;
import Ie.l;
import Ie.y;
import Oe.an;
import Oe.ap;
import Oe.n;
import Oe.o;

/* loaded from: classes2.dex */
public abstract class k {
    public static final n alpha;
    public static final n bravo;
    public static final n charlie;
    public static final n delta;
    public static final n echo;
    public static final n foxtrot;
    public static final n golf;
    public static final n hotel;
    public static final n india;
    public static final n juliet;
    public static final n kilo;
    public static final n lima;
    public static final n mike;
    public static final n november;

    static {
        l lVar = l.f1586b;
        c cVar = c.yellow;
        an anVar = ap.white;
        alpha = o.hotel(lVar, cVar, cVar, 100, anVar, c.class);
        y yVar = y.f1610n;
        bravo = o.hotel(yVar, cVar, cVar, 100, anVar, c.class);
        ap apVar = ap.red;
        charlie = o.hotel(yVar, 0, null, 101, apVar, Integer.class);
        ag agVar = ag.f1444n;
        e eVar = e.f1839c;
        delta = o.hotel(agVar, eVar, eVar, 100, anVar, e.class);
        echo = o.hotel(agVar, 0, null, 101, apVar, Integer.class);
        aq aqVar = aq.f1472m;
        Ie.g gVar = Ie.g.yellow;
        foxtrot = o.golf(aqVar, gVar, 100, anVar, Ie.g.class);
        golf = o.hotel(aqVar, Boolean.FALSE, null, 101, ap.silver, Boolean.class);
        hotel = o.golf(av.f1501f, gVar, 100, anVar, Ie.g.class);
        Ie.j jVar = Ie.j.C;
        india = o.hotel(jVar, 0, null, 101, apVar, Integer.class);
        juliet = o.golf(jVar, agVar, 102, anVar, ag.class);
        kilo = o.hotel(jVar, 0, null, 103, apVar, Integer.class);
        lima = o.hotel(jVar, 0, null, 104, apVar, Integer.class);
        ac acVar = ac.f1425d;
        mike = o.hotel(acVar, 0, null, 101, apVar, Integer.class);
        november = o.golf(acVar, agVar, 102, anVar, ag.class);
    }
}
