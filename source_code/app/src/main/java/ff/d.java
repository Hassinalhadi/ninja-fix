package ff;

import je.ab;

/* loaded from: classes2.dex */
public final class d extends h implements m {
    public volatile com.google.android.play.core.integrity.c silver;
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.g teal;
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.h white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, ab abVar, kotlin.reflect.jvm.internal.impl.types.g gVar, kotlin.reflect.jvm.internal.impl.types.h hVar) {
        super(lVar, abVar);
        this.teal = gVar;
        this.white = hVar;
        if (lVar != null) {
            this.silver = null;
        } else {
            hotel(0);
            throw null;
        }
    }

    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 2) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i4 != 2) {
            i5 = 2;
        } else {
            i5 = 3;
        }
        Object[] objArr = new Object[i5];
        if (i4 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i4 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i4 == 2) {
            objArr[2] = "doPostCompute";
        }
        String format = String.format(str, objArr);
        if (i4 != 2) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    public static /* synthetic */ void hotel(int i4) {
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
        } else {
            objArr[0] = "computable";
        }
        if (i4 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
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

    @Override // ff.h
    public final void delta(Object obj) {
        this.silver = new com.google.android.play.core.integrity.c(obj);
        try {
            if (obj != null) {
                this.white.invoke(obj);
            } else {
                alpha(2);
                throw null;
            }
        } finally {
            this.silver = null;
        }
    }

    @Override // ff.h
    public final Pf.j foxtrot(boolean z2) {
        kotlin.reflect.jvm.internal.impl.types.g gVar = this.teal;
        if (gVar == null) {
            return super.foxtrot(z2);
        }
        return new Pf.j(gVar.invoke(Boolean.valueOf(z2)), false, 8);
    }

    @Override // ff.h, kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object invoke;
        com.google.android.play.core.integrity.c cVar = this.silver;
        if (cVar != null && ((Thread) cVar.red) == Thread.currentThread()) {
            if (((Thread) cVar.red) == Thread.currentThread()) {
                invoke = cVar.purple;
            } else {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
        } else {
            invoke = super.invoke();
        }
        if (invoke != null) {
            return invoke;
        }
        hotel(2);
        throw null;
    }
}
