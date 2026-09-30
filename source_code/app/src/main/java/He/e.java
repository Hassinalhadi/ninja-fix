package He;

import Ge.l;
import Ge.m;
import com.clevertap.android.sdk.db.Column;

/* loaded from: classes2.dex */
public final class e implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ g purple;

    public /* synthetic */ e(g gVar, int i4) {
        this.alpha = i4;
        this.purple = gVar;
    }

    private final void alpha(Ne.f fVar, Se.f fVar2) {
    }

    private final void charlie(Ne.f fVar, Se.f fVar2) {
    }

    private final void delta() {
    }

    private final void foxtrot() {
    }

    private final void hotel(Ne.f fVar, Ne.b bVar, Ne.f fVar2) {
    }

    private final void india(Ne.f fVar, Ne.b bVar, Ne.f fVar2) {
    }

    @Override // Ge.l
    public final void bravo() {
        int i4 = this.alpha;
    }

    @Override // Ge.l
    public final void echo(Ne.f fVar, Object obj) {
        String str;
        switch (this.alpha) {
            case 0:
                String bravo = fVar.bravo();
                boolean equals = "k".equals(bravo);
                g gVar = this.purple;
                if (equals) {
                    if (obj instanceof Integer) {
                        a aVar = (a) a.purple.get((Integer) obj);
                        if (aVar == null) {
                            aVar = a.UNKNOWN;
                        }
                        gVar.golf = aVar;
                        return;
                    }
                    return;
                }
                if ("mv".equals(bravo)) {
                    if (obj instanceof int[]) {
                        gVar.alpha = (int[]) obj;
                        return;
                    }
                    return;
                }
                if ("xs".equals(bravo)) {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!str2.isEmpty()) {
                            gVar.bravo = str2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if ("xi".equals(bravo)) {
                    if (obj instanceof Integer) {
                        gVar.charlie = ((Integer) obj).intValue();
                        return;
                    }
                    return;
                } else {
                    if ("pn".equals(bravo) && (obj instanceof String) && !((String) obj).isEmpty()) {
                        gVar.getClass();
                        return;
                    }
                    return;
                }
            default:
                String bravo2 = fVar.bravo();
                boolean equals2 = "version".equals(bravo2);
                g gVar2 = this.purple;
                if (equals2) {
                    if (obj instanceof int[]) {
                        gVar2.alpha = (int[]) obj;
                        return;
                    }
                    return;
                } else {
                    if ("multifileClassName".equals(bravo2)) {
                        if (obj instanceof String) {
                            str = (String) obj;
                        } else {
                            str = null;
                        }
                        gVar2.bravo = str;
                        return;
                    }
                    return;
                }
        }
    }

    @Override // Ge.l
    public final m golf(Ne.f fVar) {
        switch (this.alpha) {
            case 0:
                String bravo = fVar.bravo();
                if ("d1".equals(bravo)) {
                    return new d(this, 0);
                }
                if ("d2".equals(bravo)) {
                    return new d(this, 1);
                }
                return null;
            default:
                String bravo2 = fVar.bravo();
                if (!Column.DATA.equals(bravo2) && !"filePartClassNames".equals(bravo2)) {
                    if ("strings".equals(bravo2)) {
                        return new f(this, 1);
                    }
                    return null;
                }
                return new f(this, 0);
        }
    }

    @Override // Ge.l
    public final void juliet(Ne.f fVar, Ne.b bVar, Ne.f fVar2) {
        int i4 = this.alpha;
    }

    @Override // Ge.l
    public final void kilo(Ne.f fVar, Se.f fVar2) {
        int i4 = this.alpha;
    }

    @Override // Ge.l
    public final l quebec(Ne.b bVar, Ne.f fVar) {
        switch (this.alpha) {
            case 0:
                return null;
            default:
                return null;
        }
    }
}
