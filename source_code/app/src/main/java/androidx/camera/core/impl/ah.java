package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;
import t6.AbstractC3003i;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public abstract class ah {
    public static final Size kilo = new Size(0, 0);
    public static final boolean lima = AbstractC3066u3.echo("DeferrableSurface");
    public static final AtomicInteger mike = new AtomicInteger(0);
    public static final AtomicInteger november = new AtomicInteger(0);
    public final Object alpha = new Object();
    public int bravo = 0;
    public boolean charlie = false;
    public V0.h delta;
    public final V0.k echo;
    public V0.h foxtrot;
    public final V0.k golf;
    public final Size hotel;
    public final int india;
    public Class juliet;

    public ah(Size size, int i4) {
        this.hotel = size;
        this.india = i4;
        final int i5 = 0;
        V0.k alpha = AbstractC3003i.alpha(new V0.i(this) { // from class: androidx.camera.core.impl.ag
            public final /* synthetic */ ah purple;

            {
                this.purple = this;
            }

            private final Object alpha(V0.h hVar) {
                ah ahVar = this.purple;
                synchronized (ahVar.alpha) {
                    ahVar.delta = hVar;
                }
                return "DeferrableSurface-termination(" + ahVar + ")";
            }

            @Override // V0.i
            public final Object black(V0.h hVar) {
                switch (i5) {
                    case 0:
                        return alpha(hVar);
                    default:
                        ah ahVar = this.purple;
                        synchronized (ahVar.alpha) {
                            ahVar.foxtrot = hVar;
                        }
                        return "DeferrableSurface-close(" + ahVar + ")";
                }
            }
        });
        this.echo = alpha;
        final int i10 = 1;
        this.golf = AbstractC3003i.alpha(new V0.i(this) { // from class: androidx.camera.core.impl.ag
            public final /* synthetic */ ah purple;

            {
                this.purple = this;
            }

            private final Object alpha(V0.h hVar) {
                ah ahVar = this.purple;
                synchronized (ahVar.alpha) {
                    ahVar.delta = hVar;
                }
                return "DeferrableSurface-termination(" + ahVar + ")";
            }

            @Override // V0.i
            public final Object black(V0.h hVar) {
                switch (i10) {
                    case 0:
                        return alpha(hVar);
                    default:
                        ah ahVar = this.purple;
                        synchronized (ahVar.alpha) {
                            ahVar.foxtrot = hVar;
                        }
                        return "DeferrableSurface-close(" + ahVar + ")";
                }
            }
        });
        if (AbstractC3066u3.echo("DeferrableSurface")) {
            echo(november.incrementAndGet(), mike.get(), "Surface created");
            alpha.purple.foxtrot(new A8.g(27, this, Log.getStackTraceString(new Exception())), tg.k.bravo());
        }
    }

    public void alpha() {
        V0.h hVar;
        synchronized (this.alpha) {
            try {
                if (!this.charlie) {
                    this.charlie = true;
                    this.foxtrot.bravo(null);
                    if (this.bravo == 0) {
                        hVar = this.delta;
                        this.delta = null;
                    } else {
                        hVar = null;
                    }
                    if (AbstractC3066u3.echo("DeferrableSurface")) {
                        AbstractC3066u3.bravo("DeferrableSurface", "surface closed,  useCount=" + this.bravo + " closed=true " + this);
                    }
                } else {
                    hVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hVar != null) {
            hVar.bravo(null);
        }
    }

    public final void bravo() {
        V0.h hVar;
        synchronized (this.alpha) {
            try {
                int i4 = this.bravo;
                if (i4 != 0) {
                    int i5 = i4 - 1;
                    this.bravo = i5;
                    if (i5 == 0 && this.charlie) {
                        hVar = this.delta;
                        this.delta = null;
                    } else {
                        hVar = null;
                    }
                    if (AbstractC3066u3.echo("DeferrableSurface")) {
                        AbstractC3066u3.bravo("DeferrableSurface", "use count-1,  useCount=" + this.bravo + " closed=" + this.charlie + " " + this);
                        if (this.bravo == 0) {
                            echo(november.get(), mike.decrementAndGet(), "Surface no longer in use");
                        }
                    }
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hVar != null) {
            hVar.bravo(null);
        }
    }

    public final com.google.common.util.concurrent.e charlie() {
        synchronized (this.alpha) {
            try {
                if (this.charlie) {
                    return new be.j(1, new DeferrableSurface$SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return foxtrot();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void delta() {
        synchronized (this.alpha) {
            try {
                int i4 = this.bravo;
                if (i4 == 0 && this.charlie) {
                    throw new DeferrableSurface$SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.bravo = i4 + 1;
                if (AbstractC3066u3.echo("DeferrableSurface")) {
                    if (this.bravo == 1) {
                        echo(november.get(), mike.incrementAndGet(), "New surface in use");
                    }
                    AbstractC3066u3.bravo("DeferrableSurface", "use count+1, useCount=" + this.bravo + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void echo(int i4, int i5, String str) {
        if (!lima && AbstractC3066u3.echo("DeferrableSurface")) {
            AbstractC3066u3.bravo("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        AbstractC3066u3.bravo("DeferrableSurface", str + "[total_surfaces=" + i4 + ", used_surfaces=" + i5 + "](" + this + "}");
    }

    public abstract com.google.common.util.concurrent.e foxtrot();
}
