package t9;

import C3.d;
import android.content.DialogInterface;
import android.view.KeyEvent;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import r9.C2509a;
import r9.C2510b;
import y5.j;
import y5.o;

/* renamed from: t9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnKeyListenerC3094c implements DialogInterface.OnKeyListener {
    public final /* synthetic */ d alpha;

    public DialogInterfaceOnKeyListenerC3094c(d dVar) {
        this.alpha = dVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent event) {
        Object obj;
        Intrinsics.bravo(event, "event");
        d dVar = this.alpha;
        dVar.getClass();
        if (i4 == 4 && event.getAction() == 1 && !event.isCanceled()) {
            u9.c cVar = (u9.c) dVar.purple;
            if (cVar.echo()) {
                C2510b c2510b = cVar.f13974f;
                if (c2510b != null) {
                    int currentPosition$imageviewer_release = cVar.getCurrentPosition$imageviewer_release();
                    Iterator it = c2510b.delta.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((C2509a) obj).alpha == currentPosition$imageviewer_release) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C2509a c2509a = (C2509a) obj;
                    if (c2509a != null) {
                        j resetScale = c2509a.delta;
                        Intrinsics.foxtrot(resetScale, "$this$resetScale");
                        float minimumScale = resetScale.getMinimumScale();
                        o oVar = resetScale.alpha;
                        j jVar = oVar.f14139a;
                        oVar.echo(minimumScale, jVar.getRight() / 2, jVar.getBottom() / 2, true);
                    }
                }
                return true;
            }
            cVar.delta();
            return true;
        }
        return false;
    }
}
