package E5;

import java.util.Set;

/* loaded from: classes3.dex */
public final class q implements B5.f {
    public final Set alpha;
    public final i bravo;
    public final s charlie;

    public q(Set set, i iVar, s sVar) {
        this.alpha = set;
        this.bravo = iVar;
        this.charlie = sVar;
    }

    public final r alpha(String str, B5.c cVar, B5.e eVar) {
        Set set = this.alpha;
        if (set.contains(cVar)) {
            return new r(this.bravo, str, cVar, eVar, this.charlie);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
