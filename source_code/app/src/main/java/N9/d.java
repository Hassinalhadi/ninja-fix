package N9;

import e3.InterfaceC1628b;
import java.util.LinkedHashMap;
import q3.C2407a;
import q3.C2409c;

/* loaded from: classes2.dex */
public final class d implements InterfaceC1628b {
    public final /* synthetic */ LinkedHashMap alpha;
    public final /* synthetic */ q3.g bravo;
    public final /* synthetic */ LinkedHashMap charlie;

    public d(LinkedHashMap linkedHashMap, q3.g gVar, LinkedHashMap linkedHashMap2) {
        this.alpha = linkedHashMap;
        this.bravo = gVar;
        this.charlie = linkedHashMap2;
    }

    public final boolean alpha(String str) {
        C2407a c2407a = (C2407a) this.alpha.get(str);
        if (c2407a != null) {
            return ((i) this.bravo).bravo(c2407a);
        }
        return false;
    }

    public final String bravo(String str) {
        C2409c c2409c = (C2409c) this.charlie.get(str);
        if (c2409c != null) {
            return (String) ((i) this.bravo).alpha(c2409c);
        }
        return "";
    }
}
