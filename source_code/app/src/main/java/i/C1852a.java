package i;

import d.K;
import kotlin.collections.CollectionsKt;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1852a {
    public int alpha;
    public boolean bravo;
    public int charlie;
    public float delta;
    public Object echo;

    public static int alpha(j.l lVar, boolean z2) {
        if (z2) {
            return ((j.m) CollectionsKt.ochre(lVar.mike)).alpha + 1;
        }
        return ((j.m) CollectionsKt.gold(lVar.mike)).alpha - 1;
    }

    public static int bravo(C1867p c1867p, boolean z2) {
        if (z2) {
            return ((C1868q) CollectionsKt.ochre(c1867p.kilo)).alpha + 1;
        }
        return ((C1868q) CollectionsKt.gold(c1867p.kilo)).alpha - 1;
    }

    public static int charlie(j.l lVar, boolean z2) {
        int i4;
        int i5;
        if (z2) {
            j.m mVar = (j.m) CollectionsKt.ochre(lVar.mike);
            if (lVar.quebec == K.alpha) {
                i5 = mVar.papa;
            } else {
                i5 = mVar.quebec;
            }
            return i5 + 1;
        }
        j.m mVar2 = (j.m) CollectionsKt.gold(lVar.mike);
        if (lVar.quebec == K.alpha) {
            i4 = mVar2.papa;
        } else {
            i4 = mVar2.quebec;
        }
        return i4 - 1;
    }
}
