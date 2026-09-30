package q;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class d extends b {
    public final String bravo;
    public final int charlie;
    public final Function1 delta;

    public d(Object obj, String str, int i4, Function1 function1) {
        super(obj);
        this.bravo = str;
        this.charlie = i4;
        this.delta = function1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuItem(key=");
        sb2.append(this.alpha);
        sb2.append(", label=\"");
        sb2.append(this.bravo);
        sb2.append("\", leadingIcon=");
        return Q0.c.quebec(sb2, this.charlie, ')');
    }
}
