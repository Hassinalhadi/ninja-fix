package ff;

import kotlin.jvm.functions.Function0;
import of.AbstractC2262q;
import of.C2261p;

/* loaded from: classes2.dex */
public class h implements Function0 {
    public final l alpha;
    public final Function0 purple;
    public volatile Object red;

    public h(l lVar, Function0 function0) {
        if (lVar != null) {
            if (function0 != null) {
                this.red = k.alpha;
                this.alpha = lVar;
                this.purple = function0;
                return;
            }
            alpha(1);
            throw null;
        }
        alpha(0);
        throw null;
    }

    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 2 && i4 != 3) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 2 && i4 != 3) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            }
        } else {
            objArr[0] = "computable";
        }
        if (i4 != 2) {
            if (i4 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
        } else {
            objArr[1] = "recursionDetected";
        }
        if (i4 != 2 && i4 != 3) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 == 2 || i4 == 3) {
            throw new IllegalStateException(format);
        }
    }

    public void delta(Object obj) {
    }

    public Pf.j foxtrot(boolean z2) {
        Pf.j echo = this.alpha.echo(null, "in a lazy value");
        if (echo != null) {
            return echo;
        }
        alpha(2);
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        Object obj = this.red;
        if (!(obj instanceof k)) {
            AbstractC2262q.juliet(obj);
            return obj;
        }
        this.alpha.alpha.lock();
        try {
            Object obj2 = this.red;
            if (!(obj2 instanceof k)) {
                AbstractC2262q.juliet(obj2);
            } else {
                k kVar = k.purple;
                k kVar2 = k.red;
                if (obj2 == kVar) {
                    this.red = kVar2;
                    Pf.j foxtrot = foxtrot(true);
                    if (!foxtrot.purple) {
                        obj2 = foxtrot.red;
                    }
                }
                if (obj2 == kVar2) {
                    Pf.j foxtrot2 = foxtrot(false);
                    if (!foxtrot2.purple) {
                        obj2 = foxtrot2.red;
                    }
                }
                this.red = kVar;
                try {
                    obj2 = this.purple.invoke();
                    delta(obj2);
                    this.red = obj2;
                } catch (Throwable th) {
                    if (!AbstractC2262q.hotel(th)) {
                        if (this.red == kVar) {
                            this.red = new C2261p(th);
                        }
                        this.alpha.bravo.getClass();
                        throw th;
                    }
                    this.red = k.alpha;
                    throw th;
                }
            }
            return obj2;
        } finally {
            this.alpha.alpha.unlock();
        }
    }
}
