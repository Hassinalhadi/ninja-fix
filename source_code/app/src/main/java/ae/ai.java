package ae;

import a7.C0408c;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ai {
    public final Runnable alpha;
    public final kotlin.collections.l bravo = new kotlin.collections.l();
    public ac charlie;
    public final OnBackInvokedCallback delta;
    public OnBackInvokedDispatcher echo;
    public boolean foxtrot;
    public boolean golf;

    public ai(Runnable runnable) {
        OnBackInvokedCallback c0408c;
        this.alpha = runnable;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            if (i4 >= 34) {
                c0408c = new af(new ad(this, 0), new ad(this, 1), new ae(this, 0), new ae(this, 1));
            } else {
                c0408c = new C0408c(1, new ae(this, 2));
            }
            this.delta = c0408c;
        }
    }

    public final void alpha(androidx.lifecycle.al owner, ac onBackPressedCallback) {
        Intrinsics.echo(owner, "owner");
        Intrinsics.echo(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.ac lifecycle = owner.getLifecycle();
        if (lifecycle.bravo() == androidx.lifecycle.ab.alpha) {
            return;
        }
        onBackPressedCallback.addCancellable(new ag(this, lifecycle, onBackPressedCallback));
        foxtrot();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new P7.c(0, this, ai.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 4));
    }

    public final ah bravo(ac onBackPressedCallback) {
        Intrinsics.echo(onBackPressedCallback, "onBackPressedCallback");
        this.bravo.addLast(onBackPressedCallback);
        ah ahVar = new ah(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(ahVar);
        foxtrot();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new P7.c(0, this, ai.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 5));
        return ahVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void charlie() {
        ac acVar;
        ac acVar2 = this.charlie;
        if (acVar2 == null) {
            kotlin.collections.l lVar = this.bravo;
            ListIterator listIterator = lVar.listIterator(lVar.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    acVar = listIterator.previous();
                    if (((ac) acVar).isEnabled()) {
                        break;
                    }
                } else {
                    acVar = 0;
                    break;
                }
            }
            acVar2 = acVar;
        }
        this.charlie = null;
        if (acVar2 != null) {
            acVar2.handleOnBackCancelled();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void delta() {
        ac acVar;
        ac acVar2 = this.charlie;
        if (acVar2 == null) {
            kotlin.collections.l lVar = this.bravo;
            ListIterator listIterator = lVar.listIterator(lVar.alpha());
            while (true) {
                if (listIterator.hasPrevious()) {
                    acVar = listIterator.previous();
                    if (((ac) acVar).isEnabled()) {
                        break;
                    }
                } else {
                    acVar = 0;
                    break;
                }
            }
            acVar2 = acVar;
        }
        this.charlie = null;
        if (acVar2 != null) {
            acVar2.handleOnBackPressed();
        } else {
            this.alpha.run();
        }
    }

    public final void echo(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.echo;
        OnBackInvokedCallback onBackInvokedCallback = this.delta;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z2 && !this.foxtrot) {
                U0.o.india(onBackInvokedDispatcher, onBackInvokedCallback);
                this.foxtrot = true;
            } else if (!z2 && this.foxtrot) {
                U0.o.juliet(onBackInvokedDispatcher, onBackInvokedCallback);
                this.foxtrot = false;
            }
        }
    }

    public final void foxtrot() {
        boolean z2;
        boolean z10 = this.golf;
        boolean z11 = false;
        kotlin.collections.l lVar = this.bravo;
        if (lVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !lVar.isEmpty()) {
            Iterator it = lVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ac) it.next()).isEnabled()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.golf = z11;
        if (z11 != z10 && Build.VERSION.SDK_INT >= 33) {
            echo(z11);
        }
    }
}
