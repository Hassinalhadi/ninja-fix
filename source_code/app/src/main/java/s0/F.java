package s0;

import java.lang.reflect.Field;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.InterfaceC2358h;
import t0.C2915g0;

/* loaded from: classes3.dex */
public abstract class F implements T.q {
    public static final int $stable = 0;

    @Nullable
    private C2915g0 _inspectorValues;

    @Override // T.s
    public /* synthetic */ boolean all(Function1 function1) {
        return Q0.c.alpha(this, function1);
    }

    public abstract T.r create();

    public final C2915g0 delta() {
        C2915g0 c2915g0 = this._inspectorValues;
        if (c2915g0 == null) {
            C2915g0 c2915g02 = new C2915g0();
            c2915g02.alpha = kotlin.jvm.internal.u.alpha.bravo(getClass()).kilo();
            inspectableProperties(c2915g02);
            this._inspectorValues = c2915g02;
            return c2915g02;
        }
        return c2915g0;
    }

    @Override // T.s
    public Object foldIn(Object obj, Xd.l lVar) {
        return lVar.invoke(obj, this);
    }

    @NotNull
    public final InterfaceC2358h getInspectableElements() {
        return delta().charlie;
    }

    @Nullable
    public final String getNameFallback() {
        return delta().alpha;
    }

    @Nullable
    public final Object getValueOverride() {
        return delta().bravo;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Comparator] */
    public void inspectableProperties(C2915g0 c2915g0) {
        List purple = ArraysKt.purple(getClass().getDeclaredFields(), new Object());
        int size = purple.size();
        for (int i4 = 0; i4 < size; i4++) {
            Field field = (Field) purple.get(i4);
            if (!field.getDeclaringClass().isAssignableFrom(F.class)) {
                try {
                    field.setAccessible(true);
                    c2915g0.charlie.bravo(field.get(this), field.getName());
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }

    @Override // T.s
    public /* synthetic */ T.s then(T.s sVar) {
        return Q0.c.charlie(this, sVar);
    }

    public abstract void update(T.r rVar);
}
