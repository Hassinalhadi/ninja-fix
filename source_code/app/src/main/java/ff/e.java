package ff;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class e extends j {
    public final /* synthetic */ int silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(l lVar, ConcurrentHashMap concurrentHashMap, Function1 function1, int i4) {
        super(lVar, concurrentHashMap, function1);
        this.silver = i4;
    }

    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 3) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 3) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    objArr[0] = "storageManager";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
                }
            } else {
                objArr[0] = "computation";
            }
        } else {
            objArr[0] = "map";
        }
        if (i4 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i4 != 2) {
            if (i4 != 3) {
                objArr[2] = "<init>";
            }
        } else {
            objArr[2] = "computeIfAbsent";
        }
        String format = String.format(str, objArr);
        if (i4 != 3) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // ff.j, kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        switch (this.silver) {
            case 1:
                Object invoke = super.invoke(obj);
                if (invoke != null) {
                    return invoke;
                }
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
            default:
                return super.invoke(obj);
        }
    }
}
