package androidx.compose.foundation.text.contextmenu.modifier;

import T.s;
import k5.C2015h;
import n.C2149y;
import s1.C2576i;
import y.as;
import y.at;
import y.au;

/* loaded from: classes3.dex */
public abstract class a {
    public static final s alpha(s sVar, C2015h c2015h) {
        return sVar.then(new AddTextContextMenuDataComponentsWithContextElement(c2015h));
    }

    public static final s bravo(as asVar) {
        return new TextContextMenuGestureElement(asVar);
    }

    public static final s charlie(s sVar, C2576i c2576i, at atVar, au auVar, C2149y c2149y) {
        return sVar.then(new TextContextMenuToolbarHandlerElement(c2576i, atVar, auVar, c2149y));
    }
}
