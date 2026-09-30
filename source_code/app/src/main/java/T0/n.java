package T0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o2.InterfaceC2196f;
import s0.al;

/* loaded from: classes3.dex */
public final class n extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public static final n purple = new n(2, 0);
    public static final n red = new n(2, 1);
    public static final n silver = new n(2, 2);
    public static final n teal = new n(2, 3);
    public static final n white = new n(2, 4);
    public static final n yellow = new n(2, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final n f2084c = new n(2, 6);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                androidx.compose.ui.viewinterop.a.charlie((al) obj).setUpdateBlock((Function1) obj2);
                return Unit.INSTANCE;
            case 1:
                androidx.compose.ui.viewinterop.a.charlie((al) obj).setReleaseBlock((Function1) obj2);
                return Unit.INSTANCE;
            case 2:
                androidx.compose.ui.viewinterop.a.charlie((al) obj).setModifier((T.s) obj2);
                return Unit.INSTANCE;
            case 3:
                androidx.compose.ui.viewinterop.a.charlie((al) obj).setDensity((Q0.d) obj2);
                return Unit.INSTANCE;
            case 4:
                androidx.compose.ui.viewinterop.a.charlie((al) obj).setLifecycleOwner((androidx.lifecycle.al) obj2);
                return Unit.INSTANCE;
            case 5:
                androidx.compose.ui.viewinterop.a.charlie((al) obj).setSavedStateRegistryOwner((InterfaceC2196f) obj2);
                return Unit.INSTANCE;
            default:
                t charlie = androidx.compose.ui.viewinterop.a.charlie((al) obj);
                int i4 = p.$EnumSwitchMapping$0[((Q0.n) obj2).ordinal()];
                int i5 = 1;
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i5 = 0;
                }
                charlie.setLayoutDirection(i5);
                return Unit.INSTANCE;
        }
    }
}
