package tg;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public final class g implements rg.b {
    public final String alpha;
    public volatile rg.b purple;
    public Boolean red;
    public Method silver;
    public sg.a teal;
    public final LinkedBlockingQueue white;
    public final boolean yellow;

    public g(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z2) {
        this.alpha = str;
        this.white = linkedBlockingQueue;
        this.yellow = z2;
    }

    @Override // rg.b
    public final boolean alpha() {
        return juliet().alpha();
    }

    @Override // rg.b
    public final boolean bravo() {
        return juliet().bravo();
    }

    @Override // rg.b
    public final void charlie() {
        juliet().charlie();
    }

    @Override // rg.b
    public final boolean delta() {
        return juliet().delta();
    }

    @Override // rg.b
    public final boolean echo() {
        return juliet().echo();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass() && this.alpha.equals(((g) obj).alpha)) {
            return true;
        }
        return false;
    }

    @Override // rg.b
    public final boolean foxtrot() {
        return juliet().foxtrot();
    }

    @Override // rg.b
    public final String getName() {
        return this.alpha;
    }

    @Override // rg.b
    public final void golf(Throwable th) {
        juliet().golf(th);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // rg.b
    public final void hotel(String str) {
        juliet().hotel(str);
    }

    @Override // rg.b
    public final boolean india(int i4) {
        return juliet().india(i4);
    }

    @Override // rg.b
    public final void info(String str) {
        juliet().info(str);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [sg.a, java.lang.Object] */
    public final rg.b juliet() {
        if (this.purple != null) {
            return this.purple;
        }
        if (this.yellow) {
            return c.alpha;
        }
        if (this.teal == null) {
            ?? obj = new Object();
            obj.purple = this;
            obj.alpha = this.alpha;
            obj.red = this.white;
            this.teal = obj;
        }
        return this.teal;
    }

    public final boolean kilo() {
        Boolean bool = this.red;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.silver = this.purple.getClass().getMethod("log", sg.b.class);
            this.red = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.red = Boolean.FALSE;
        }
        return this.red.booleanValue();
    }
}
