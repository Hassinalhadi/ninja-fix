package q;

import android.view.textclassifier.TextClassification;

/* loaded from: classes3.dex */
public final class h extends b {
    public final TextClassification bravo;
    public final int charlie;

    public h(Object obj, TextClassification textClassification, int i4) {
        super(obj);
        this.bravo = textClassification;
        this.charlie = i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb2.append(this.alpha);
        sb2.append(", textClassification=");
        sb2.append(this.bravo);
        sb2.append(", index=");
        return Q0.c.quebec(sb2, this.charlie, ')');
    }
}
