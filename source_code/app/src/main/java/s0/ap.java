package s0;

import kotlin.jvm.internal.Intrinsics;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class ap {
    public final al alpha;
    public boolean bravo;
    public boolean charlie;
    public boolean echo;
    public boolean foxtrot;
    public boolean golf;
    public int hotel;
    public int india;
    public boolean juliet;
    public boolean kilo;
    public int lima;
    public boolean mike;
    public boolean november;
    public int oscar;
    public ay quebec;
    public ag delta = ag.teal;
    public final C papa = new C(this);

    public ap(al alVar) {
        this.alpha = alVar;
    }

    public final L alpha() {
        return (L) this.alpha.f13305x.foxtrot;
    }

    public final void bravo() {
        ag agVar = this.alpha.f13306y.delta;
        if (agVar == ag.red || agVar == ag.silver) {
            if (this.papa.f13234t) {
                golf(true);
            } else {
                foxtrot(true);
            }
        }
        if (agVar == ag.silver) {
            ay ayVar = this.quebec;
            if (ayVar != null && ayVar.f13333n) {
                india(true);
            } else {
                hotel(true);
            }
        }
    }

    public final void charlie(long j5) {
        ay ayVar = this.quebec;
        if (ayVar != null) {
            ag agVar = ag.purple;
            ap apVar = ayVar.white;
            apVar.delta = agVar;
            apVar.echo = false;
            al alVar = apVar.alpha;
            Y snapshotObserver = ((C2946x) ao.alpha(alVar)).getSnapshotObserver();
            aw awVar = new aw(ayVar, j5);
            snapshotObserver.getClass();
            if (alVar.yellow != null) {
                snapshotObserver.alpha(alVar, snapshotObserver.bravo, awVar);
            } else {
                snapshotObserver.alpha(alVar, snapshotObserver.charlie, awVar);
            }
            apVar.foxtrot = true;
            apVar.golf = true;
            boolean mike = AbstractC2557q.mike(alVar);
            C c3 = apVar.papa;
            if (mike) {
                c3.f13229o = true;
                c3.f13230p = true;
            } else {
                c3.f13228n = true;
            }
            apVar.delta = ag.teal;
        }
    }

    public final void delta(int i4) {
        boolean z2;
        ap apVar;
        int i5 = this.lima;
        this.lima = i4;
        boolean z10 = false;
        if (i5 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i4 == 0) {
            z10 = true;
        }
        if (z2 != z10) {
            al victor = this.alpha.victor();
            if (victor != null) {
                apVar = victor.f13306y;
            } else {
                apVar = null;
            }
            if (apVar != null) {
                if (i4 == 0) {
                    apVar.delta(apVar.lima - 1);
                } else {
                    apVar.delta(apVar.lima + 1);
                }
            }
        }
    }

    public final void echo(int i4) {
        boolean z2;
        ap apVar;
        int i5 = this.oscar;
        this.oscar = i4;
        boolean z10 = false;
        if (i5 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i4 == 0) {
            z10 = true;
        }
        if (z2 != z10) {
            al victor = this.alpha.victor();
            if (victor != null) {
                apVar = victor.f13306y;
            } else {
                apVar = null;
            }
            if (apVar != null) {
                if (i4 == 0) {
                    apVar.echo(apVar.oscar - 1);
                } else {
                    apVar.echo(apVar.oscar + 1);
                }
            }
        }
    }

    public final void foxtrot(boolean z2) {
        if (this.kilo != z2) {
            this.kilo = z2;
            if (z2 && !this.juliet) {
                delta(this.lima + 1);
            } else if (!z2 && !this.juliet) {
                delta(this.lima - 1);
            }
        }
    }

    public final void golf(boolean z2) {
        if (this.juliet != z2) {
            this.juliet = z2;
            if (z2 && !this.kilo) {
                delta(this.lima + 1);
            } else if (!z2 && !this.kilo) {
                delta(this.lima - 1);
            }
        }
    }

    public final void hotel(boolean z2) {
        if (this.november != z2) {
            this.november = z2;
            if (z2 && !this.mike) {
                echo(this.oscar + 1);
            } else if (!z2 && !this.mike) {
                echo(this.oscar - 1);
            }
        }
    }

    public final void india(boolean z2) {
        if (this.mike != z2) {
            this.mike = z2;
            if (z2 && !this.november) {
                echo(this.oscar + 1);
            } else if (!z2 && !this.november) {
                echo(this.oscar - 1);
            }
        }
    }

    public final void juliet() {
        C c3 = this.papa;
        Object obj = c3.f13225k;
        al alVar = this.alpha;
        ap apVar = c3.white;
        if ((obj != null || apVar.alpha().yankee() != null) && c3.f13224j) {
            c3.f13224j = false;
            c3.f13225k = apVar.alpha().yankee();
            al victor = alVar.victor();
            if (victor != null) {
                al.olive(victor, false, 7);
            }
        }
        ay ayVar = this.quebec;
        if (ayVar != null) {
            Object obj2 = ayVar.f13335p;
            ap apVar2 = ayVar.white;
            if (obj2 == null) {
                au y10 = apVar2.alpha().y();
                Intrinsics.checkNotNull(y10);
                if (y10.f13315i.yankee() == null) {
                    return;
                }
            }
            if (ayVar.f13334o) {
                ayVar.f13334o = false;
                au y11 = apVar2.alpha().y();
                Intrinsics.checkNotNull(y11);
                ayVar.f13335p = y11.f13315i.yankee();
                if (AbstractC2557q.mike(alVar)) {
                    al victor2 = alVar.victor();
                    if (victor2 != null) {
                        al.olive(victor2, false, 7);
                        return;
                    }
                    return;
                }
                al victor3 = alVar.victor();
                if (victor3 != null) {
                    al.navy(victor3, false, 7);
                }
            }
        }
    }
}
