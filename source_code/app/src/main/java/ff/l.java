package ff;

import androidx.appcompat.widget.P0;
import com.google.android.material.internal.s;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public class l implements o {
    public static final String delta = StringsKt.teal(l.class.getCanonicalName(), "");
    public static final C1717b echo = new l("NO_LOCKS", C1716a.alpha);
    public final n alpha;
    public final C1716a bravo;
    public final String charlie;

    public l(String str) {
        this(str, new s(6, new ReentrantLock()));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        String format;
        if (i4 != 10 && i4 != 13 && i4 != 20 && i4 != 37) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 10 && i4 != 13 && i4 != 20 && i4 != 37) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 1 && i4 != 3 && i4 != 5) {
            if (i4 != 6) {
                switch (i4) {
                    case 8:
                        break;
                    case 9:
                    case 11:
                    case 14:
                    case 16:
                    case 19:
                    case 21:
                        objArr[0] = "compute";
                        break;
                    case 10:
                    case 13:
                    case 20:
                    case 37:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                        break;
                    case 12:
                    case 17:
                    case 25:
                    case 27:
                        objArr[0] = "onRecursiveCall";
                        break;
                    case 15:
                    case 18:
                    case 22:
                        objArr[0] = "map";
                        break;
                    case 23:
                    case 24:
                    case 26:
                    case 28:
                    case 30:
                    case 31:
                    case 32:
                    case 34:
                        objArr[0] = "computable";
                        break;
                    case 29:
                    case 33:
                        objArr[0] = "postCompute";
                        break;
                    case 35:
                        objArr[0] = "source";
                        break;
                    case 36:
                        objArr[0] = "throwable";
                        break;
                    default:
                        objArr[0] = "debugText";
                        break;
                }
            } else {
                objArr[0] = "lock";
            }
            if (i4 == 10 && i4 != 13) {
                if (i4 != 20) {
                    if (i4 != 37) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    } else {
                        objArr[1] = "sanitizeStackTrace";
                    }
                } else {
                    objArr[1] = "createMemoizedFunctionWithNullableValues";
                }
            } else {
                objArr[1] = "createMemoizedFunction";
            }
            switch (i4) {
                case 4:
                case 5:
                case 6:
                    objArr[2] = "<init>";
                    break;
                case 7:
                case 8:
                    objArr[2] = "replaceExceptionHandling";
                    break;
                case 9:
                case 11:
                case 12:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    objArr[2] = "createMemoizedFunction";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    break;
                case 19:
                case 21:
                case 22:
                    objArr[2] = "createMemoizedFunctionWithNullableValues";
                    break;
                case 23:
                case 24:
                case 25:
                    objArr[2] = "createLazyValue";
                    break;
                case 26:
                case 27:
                    objArr[2] = "createRecursionTolerantLazyValue";
                    break;
                case 28:
                case 29:
                    objArr[2] = "createLazyValueWithPostCompute";
                    break;
                case 30:
                    objArr[2] = "createNullableLazyValue";
                    break;
                case 31:
                    objArr[2] = "createRecursionTolerantNullableLazyValue";
                    break;
                case 32:
                case 33:
                    objArr[2] = "createNullableLazyValueWithPostCompute";
                    break;
                case 34:
                    objArr[2] = "compute";
                    break;
                case 35:
                    objArr[2] = "recursionDetectedDefault";
                    break;
                case 36:
                    objArr[2] = "sanitizeStackTrace";
                    break;
                default:
                    objArr[2] = "createWithExceptionHandling";
                    break;
            }
            format = String.format(str, objArr);
            if (i4 != 10 || i4 == 13 || i4 == 20 || i4 == 37) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "exceptionHandlingStrategy";
        if (i4 == 10) {
        }
        objArr[1] = "createMemoizedFunction";
        switch (i4) {
        }
        format = String.format(str, objArr);
        if (i4 != 10) {
        }
        throw new IllegalStateException(format);
    }

    public static void foxtrot(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                if (!stackTrace[i4].getClassName().startsWith(delta)) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i4, length);
        assertionError.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ff.i, ff.h] */
    public final i bravo(Function0 function0) {
        if (function0 != null) {
            return new h(this, function0);
        }
        alpha(23);
        throw null;
    }

    public final e charlie(Function1 function1) {
        return new e(this, new ConcurrentHashMap(3, 1.0f, 2), function1, 1);
    }

    public final j delta(Function1 function1) {
        return new j(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    public Pf.j echo(Object obj, String str) {
        String bronze;
        StringBuilder sb2 = new StringBuilder("Recursion detected ");
        sb2.append(str);
        if (obj == null) {
            bronze = "";
        } else {
            bronze = P0.bronze(obj, "on input: ");
        }
        sb2.append(bronze);
        sb2.append(" under ");
        sb2.append(this);
        AssertionError assertionError = new AssertionError(sb2.toString());
        foxtrot(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(" (");
        return P0.gold(sb2, this.charlie, ")");
    }

    public l(String str, n nVar) {
        C1716a c1716a = C1716a.purple;
        this.alpha = nVar;
        this.bravo = c1716a;
        this.charlie = str;
    }
}
