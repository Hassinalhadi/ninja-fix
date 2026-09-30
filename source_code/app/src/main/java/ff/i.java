package ff;

/* loaded from: classes2.dex */
public class i extends h implements m {
    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 2) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 2) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 1) {
            if (i4 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
        } else {
            objArr[0] = "computable";
        }
        if (i4 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        } else {
            objArr[1] = "invoke";
        }
        if (i4 != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // ff.h, kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object invoke = super.invoke();
        if (invoke != null) {
            return invoke;
        }
        alpha(2);
        throw null;
    }
}
