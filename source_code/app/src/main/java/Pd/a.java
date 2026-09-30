package Pd;

import J2.t;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public abstract class a implements Nd.c, d, Serializable {

    @Nullable
    private final Nd.c<Object> completion;

    public a(Nd.c cVar) {
        this.completion = cVar;
    }

    @NotNull
    public Nd.c<Unit> create(@NotNull Nd.c<?> completion) {
        Intrinsics.echo(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // Pd.d
    @Nullable
    public d getCallerFrame() {
        Nd.c<Object> cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    @Nullable
    public final Nd.c<Object> getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        int i4;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i5;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v4 = eVar.v();
        if (v4 <= 1) {
            int i10 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this);
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null) {
                    i5 = num.intValue();
                } else {
                    i5 = 0;
                }
                i4 = i5 - 1;
            } catch (Exception unused) {
                i4 = -1;
            }
            if (i4 >= 0) {
                i10 = eVar.l()[i4];
            }
            t tVar = f.bravo;
            t tVar2 = f.alpha;
            if (tVar == null) {
                try {
                    t tVar3 = new t(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    f.bravo = tVar3;
                    tVar = tVar3;
                } catch (Exception unused2) {
                    f.bravo = tVar2;
                    tVar = tVar2;
                }
            }
            if (tVar != tVar2 && (method = (Method) tVar.alpha) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) tVar.purple) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = (Method) tVar.red;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, null);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = (String) obj;
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i10);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v4 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Nd.c
    public final void resumeWith(@NotNull Object obj) {
        Object invokeSuspend;
        Nd.c cVar = this;
        while (true) {
            a frame = (a) cVar;
            Intrinsics.echo(frame, "frame");
            a aVar = (a) cVar;
            Nd.c cVar2 = aVar.completion;
            Intrinsics.checkNotNull(cVar2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                obj = Result.m206constructorimpl(ResultKt.createFailure(th));
            }
            if (invokeSuspend == Od.a.alpha) {
                return;
            }
            obj = Result.m206constructorimpl(invokeSuspend);
            aVar.releaseIntercepted();
            if (cVar2 instanceof a) {
                cVar = cVar2;
            } else {
                cVar2.resumeWith(obj);
                return;
            }
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    @NotNull
    public Nd.c<Unit> create(@Nullable Object obj, @NotNull Nd.c<?> completion) {
        Intrinsics.echo(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
