package Oe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public abstract class l extends o implements w {
    public final i alpha;

    public l() {
        this.alpha = new i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean india() {
        int i4 = 0;
        while (true) {
            ab abVar = this.alpha.alpha;
            if (i4 < abVar.purple.size()) {
                if (!i.echo((Map.Entry) abVar.purple.get(i4))) {
                    break;
                }
                i4++;
            } else {
                Iterator it = abVar.charlie().iterator();
                while (it.hasNext()) {
                    if (!i.echo((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
        }
    }

    public final int juliet() {
        ab abVar;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            abVar = this.alpha.alpha;
            if (i4 >= abVar.purple.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) abVar.purple.get(i4);
            i5 += i.delta((m) entry.getKey(), entry.getValue());
            i4++;
        }
        for (Map.Entry entry2 : abVar.charlie()) {
            i5 += i.delta((m) entry2.getKey(), entry2.getValue());
        }
        return i5;
    }

    public final Object kilo(n nVar) {
        oscar(nVar);
        ab abVar = this.alpha.alpha;
        m mVar = nVar.delta;
        Object obj = abVar.get(mVar);
        if (obj == null) {
            return nVar.bravo;
        }
        if (mVar.red) {
            if (mVar.purple.alpha == aq.f1884b) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(nVar.alpha(it.next()));
                }
                return arrayList;
            }
            return obj;
        }
        return nVar.alpha(obj);
    }

    public final boolean lima(n nVar) {
        oscar(nVar);
        i iVar = this.alpha;
        iVar.getClass();
        m mVar = nVar.delta;
        if (!mVar.red) {
            if (iVar.alpha.get(mVar) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public final void mike() {
        this.alpha.foxtrot();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean november(f fVar, F0.e eVar, h hVar, int i4) {
        boolean z2;
        Object golf;
        v vVar;
        v bravo = bravo();
        int i5 = i4 & 7;
        hVar.getClass();
        n nVar = (n) hVar.alpha.get(new g(i4 >>> 3, bravo));
        boolean z10 = false;
        if (nVar != null) {
            m mVar = nVar.delta;
            ap apVar = mVar.purple;
            i iVar = i.charlie;
            if (i5 == apVar.purple) {
                z2 = false;
            } else if (mVar.red && apVar.alpha() && i5 == 2) {
                z2 = true;
            }
            if (!z10) {
                return fVar.papa(i4, eVar);
            }
            j jVar = null;
            i iVar2 = this.alpha;
            if (z2) {
                int charlie = fVar.charlie(fVar.juliet());
                m mVar2 = nVar.delta;
                if (mVar2.purple == ap.yellow) {
                    if (fVar.alpha() > 0) {
                        fVar.juliet();
                        throw null;
                    }
                } else {
                    while (fVar.alpha() > 0) {
                        iVar2.alpha(mVar2, i.hotel(fVar, mVar2.purple));
                    }
                }
                fVar.bravo(charlie);
                return true;
            }
            int ordinal = nVar.delta.purple.alpha.ordinal();
            m mVar3 = nVar.delta;
            if (ordinal != 7) {
                if (ordinal != 8) {
                    golf = i.hotel(fVar, mVar3.purple);
                } else {
                    if (!mVar3.red && (vVar = (v) iVar2.alpha.get(mVar3)) != null) {
                        jVar = vVar.charlie();
                    }
                    if (jVar == null) {
                        jVar = nVar.charlie.foxtrot();
                    }
                    if (mVar3.purple == ap.teal) {
                        int i10 = fVar.india;
                        if (i10 < 64) {
                            fVar.india = i10 + 1;
                            jVar.hotel(fVar, hVar);
                            if (fVar.foxtrot == ((mVar3.alpha << 3) | 4)) {
                                fVar.india--;
                            } else {
                                throw InvalidProtocolBufferException.invalidEndTag();
                            }
                        } else {
                            throw InvalidProtocolBufferException.recursionLimitExceeded();
                        }
                    } else {
                        int juliet = fVar.juliet();
                        if (fVar.india < 64) {
                            int charlie2 = fVar.charlie(juliet);
                            fVar.india++;
                            jVar.hotel(fVar, hVar);
                            if (fVar.foxtrot == 0) {
                                fVar.india--;
                                fVar.bravo(charlie2);
                            } else {
                                throw InvalidProtocolBufferException.invalidEndTag();
                            }
                        } else {
                            throw InvalidProtocolBufferException.recursionLimitExceeded();
                        }
                    }
                    golf = jVar.golf();
                }
                if (mVar3.red) {
                    iVar2.alpha(mVar3, nVar.bravo(golf));
                    return true;
                }
                iVar2.india(mVar3, nVar.bravo(golf));
                return true;
            }
            fVar.juliet();
            mVar3.getClass();
            throw null;
        }
        z2 = false;
        z10 = true;
        if (!z10) {
        }
    }

    public final void oscar(n nVar) {
        if (nVar.alpha == bravo()) {
        } else {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public l(k kVar) {
        kVar.purple.foxtrot();
        kVar.red = false;
        this.alpha = kVar.purple;
    }
}
