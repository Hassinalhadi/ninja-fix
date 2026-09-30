package ff;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import of.AbstractC2262q;
import of.C2261p;

/* loaded from: classes2.dex */
public class j implements Function1 {
    public final l alpha;
    public final ConcurrentHashMap purple;
    public final Function1 red;

    public j(l lVar, ConcurrentHashMap concurrentHashMap, Function1 function1) {
        if (lVar != null) {
            this.alpha = lVar;
            this.purple = concurrentHashMap;
            this.red = function1;
            return;
        }
        alpha(0);
        throw null;
    }

    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 3 && i4 != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 3 && i4 != 4) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3 && i4 != 4) {
                    objArr[0] = "storageManager";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
                }
            } else {
                objArr[0] = "compute";
            }
        } else {
            objArr[0] = "map";
        }
        if (i4 != 3) {
            if (i4 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
        } else {
            objArr[1] = "recursionDetected";
        }
        if (i4 != 3 && i4 != 4) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 == 3 || i4 == 4) {
            throw new IllegalStateException(format);
        }
    }

    public final AssertionError delta(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.alpha);
        l.foxtrot(assertionError);
        return assertionError;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        ConcurrentHashMap concurrentHashMap = this.purple;
        Object obj2 = concurrentHashMap.get(obj);
        k kVar = k.purple;
        Object obj3 = AbstractC2262q.alpha;
        AssertionError assertionError = null;
        if (obj2 != null && obj2 != kVar) {
            AbstractC2262q.juliet(obj2);
            if (obj2 == obj3) {
                return null;
            }
            return obj2;
        }
        l lVar = this.alpha;
        n nVar = lVar.alpha;
        n nVar2 = lVar.alpha;
        nVar.lock();
        try {
            Object obj4 = concurrentHashMap.get(obj);
            k kVar2 = k.red;
            if (obj4 == kVar) {
                Pf.j echo = lVar.echo(obj, "");
                if (echo != null) {
                    if (!echo.purple) {
                        Object obj5 = echo.red;
                        nVar2.unlock();
                        return obj5;
                    }
                    obj4 = kVar2;
                } else {
                    alpha(3);
                    throw null;
                }
            }
            if (obj4 == kVar2) {
                Pf.j echo2 = lVar.echo(obj, "");
                if (echo2 != null) {
                    if (!echo2.purple) {
                        Object obj6 = echo2.red;
                        nVar2.unlock();
                        return obj6;
                    }
                } else {
                    alpha(3);
                    throw null;
                }
            }
            if (obj4 != null) {
                AbstractC2262q.juliet(obj4);
                if (obj4 != obj3) {
                    assertionError = obj4;
                }
                nVar2.unlock();
                return assertionError;
            }
            try {
                concurrentHashMap.put(obj, kVar);
                Object invoke = this.red.invoke(obj);
                if (invoke != null) {
                    obj3 = invoke;
                }
                Object put = concurrentHashMap.put(obj, obj3);
                if (put == kVar) {
                    nVar2.unlock();
                    return invoke;
                }
                assertionError = delta(obj, put);
                throw assertionError;
            } catch (Throwable th) {
                if (!AbstractC2262q.hotel(th)) {
                    C1716a c1716a = lVar.bravo;
                    if (th != assertionError) {
                        Object put2 = concurrentHashMap.put(obj, new C2261p(th));
                        if (put2 != kVar) {
                            throw delta(obj, put2);
                        }
                        c1716a.getClass();
                        throw th;
                    }
                    c1716a.getClass();
                    throw th;
                }
                concurrentHashMap.remove(obj);
                throw th;
            }
        } catch (Throwable th2) {
            nVar2.unlock();
            throw th2;
        }
    }
}
