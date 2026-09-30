package U3;

import Y3.l;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import androidx.appcompat.widget.P0;
import ao.ad;
import com.bumptech.glide.load.engine.GlideException;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class e implements Future, V3.e, f {

    /* renamed from: a, reason: collision with root package name */
    public GlideException f2129a;
    public final int alpha;
    public final int purple;
    public Object red;
    public c silver;
    public boolean teal;
    public boolean white;
    public boolean yellow;

    public e(int i4, int i5) {
        this.alpha = i4;
        this.purple = i5;
    }

    @Override // R3.i
    public final void alpha() {
    }

    @Override // R3.i
    public final void bravo() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.teal = true;
                notifyAll();
                c cVar = null;
                if (z2) {
                    c cVar2 = this.silver;
                    this.silver = null;
                    cVar = cVar2;
                }
                if (cVar != null) {
                    cVar.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // R3.i
    public final void charlie() {
    }

    @Override // V3.e
    public final void delta(h hVar) {
    }

    @Override // V3.e
    public final synchronized void echo(c cVar) {
        this.silver = cVar;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return oscar(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // V3.e
    public final synchronized void golf(Object obj) {
    }

    @Override // U3.f
    public final synchronized boolean hotel(GlideException glideException, V3.e eVar) {
        this.yellow = true;
        this.f2129a = glideException;
        notifyAll();
        return false;
    }

    @Override // U3.f
    public final synchronized boolean india(Object obj, Object obj2, E3.a aVar) {
        this.white = true;
        this.red = obj;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.teal;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z2;
        if (!this.teal && !this.white) {
            if (!this.yellow) {
                z2 = false;
            }
        }
        z2 = true;
        return z2;
    }

    @Override // V3.e
    public final synchronized void juliet(Drawable drawable) {
    }

    @Override // V3.e
    public final void kilo(Drawable drawable) {
    }

    @Override // V3.e
    public final synchronized c lima() {
        return this.silver;
    }

    @Override // V3.e
    public final void mike(Drawable drawable) {
    }

    @Override // V3.e
    public final void november(h hVar) {
        hVar.kilo(this.alpha, this.purple);
    }

    public final synchronized Object oscar(Long l10) {
        boolean z2;
        if (!isDone()) {
            char[] cArr = l.alpha;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (!this.teal) {
            if (!this.yellow) {
                if (this.white) {
                    return this.red;
                }
                if (l10 == null) {
                    wait(0L);
                } else if (l10.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = l10.longValue() + currentTimeMillis;
                    while (!isDone() && currentTimeMillis < longValue) {
                        wait(longValue - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (!Thread.interrupted()) {
                    if (!this.yellow) {
                        if (!this.teal) {
                            if (this.white) {
                                return this.red;
                            }
                            throw new TimeoutException();
                        }
                        throw new CancellationException();
                    }
                    throw new ExecutionException(this.f2129a);
                }
                throw new InterruptedException();
            }
            throw new ExecutionException(this.f2129a);
        }
        throw new CancellationException();
    }

    public final String toString() {
        c cVar;
        String str;
        String gold = P0.gold(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                cVar = null;
                if (this.teal) {
                    str = "CANCELLED";
                } else if (this.yellow) {
                    str = "FAILURE";
                } else if (this.white) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    cVar = this.silver;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            return gold + str + ", request=[" + cVar + "]]";
        }
        return ad.amber(gold, str, Constants.AES_SUFFIX);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        return oscar(Long.valueOf(timeUnit.toMillis(j5)));
    }
}
