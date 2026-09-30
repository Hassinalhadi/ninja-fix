package androidx.compose.foundation.lazy.layout;

import g.AbstractC1719b;
import java.util.List;

/* loaded from: classes3.dex */
public final class at {
    public final List alpha;
    public final List[] bravo;
    public int charlie;
    public int delta;
    public boolean echo;
    public final /* synthetic */ au foxtrot;

    public at(au auVar, List list) {
        this.foxtrot = auVar;
        this.alpha = list;
        this.bravo = new List[list.size()];
        if (list.isEmpty()) {
            AbstractC1719b.alpha("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
