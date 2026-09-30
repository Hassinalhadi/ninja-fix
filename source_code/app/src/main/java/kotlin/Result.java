package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0087@\u0018\u0000 \f*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\f\rB\u0013\b\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\n\u0088\u0001\u0005\u0092\u0001\u0004\u0018\u00010\u0004¨\u0006\u000e"}, d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "value", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "exceptionOrNull", "Companion", "kotlin/k", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Result<T> implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);
    public final Object alpha;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/Result$Companion;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(int i4) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ Result(Object obj) {
        this.alpha = obj;
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m206constructorimpl(@Nullable Object obj) {
        return obj;
    }

    @Nullable
    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m207exceptionOrNullimpl(Object obj) {
        if (obj instanceof k) {
            return ((k) obj).alpha;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Result) {
            if (!Intrinsics.areEqual(this.alpha, ((Result) obj).alpha)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.alpha;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.alpha;
        if (obj instanceof k) {
            return ((k) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
