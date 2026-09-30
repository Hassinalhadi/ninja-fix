package androidx.loader.app;

import J2.i;
import androidx.lifecycle.al;
import androidx.lifecycle.c0;
import bv.ax;
import ge.InterfaceC1772d;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3062u;

/* loaded from: classes3.dex */
public final class c extends a {
    public final Object alpha;
    public final LoaderManagerImpl$LoaderViewModel bravo;

    public c(al alVar, c0 store) {
        this.alpha = alVar;
        b bVar = LoaderManagerImpl$LoaderViewModel.bravo;
        Intrinsics.echo(store, "store");
        T1.a defaultCreationExtras = T1.a.bravo;
        Intrinsics.echo(defaultCreationExtras, "defaultCreationExtras");
        i iVar = new i(store, bVar, defaultCreationExtras);
        InterfaceC1772d echo = AbstractC3062u.echo(LoaderManagerImpl$LoaderViewModel.class);
        String juliet = echo.juliet();
        if (juliet != null) {
            this.bravo = (LoaderManagerImpl$LoaderViewModel) iVar.charlie(echo, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(juliet));
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final void bravo(String str, PrintWriter printWriter) {
        ax axVar = this.bravo.alpha;
        if (axVar.golf() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (axVar.golf() > 0) {
                if (axVar.hotel(0) == null) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(axVar.echo(0));
                    printWriter.print(": ");
                    throw null;
                }
                throw new ClassCastException();
            }
        }
    }

    public final void charlie() {
        ax axVar = this.bravo.alpha;
        if (axVar.golf() <= 0) {
            return;
        }
        axVar.hotel(0).getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Object obj = this.alpha;
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append("}}");
        return sb2.toString();
    }
}
