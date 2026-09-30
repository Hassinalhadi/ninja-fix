package je;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2345u;
import s6.AbstractC2607a5;
import ve.AbstractC3192d;

/* renamed from: je.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1963b extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public static final C1963b purple = new C1963b(1, 0);
    public static final C1963b red = new C1963b(1, 1);
    public static final C1963b silver = new C1963b(1, 2);
    public static final C1963b teal = new C1963b(1, 3);
    public static final C1963b white = new C1963b(1, 4);
    public static final C1963b yellow = new C1963b(1, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final C1963b f12908c = new C1963b(1, 6);

    /* renamed from: d, reason: collision with root package name */
    public static final C1963b f12909d = new C1963b(1, 7);
    public static final C1963b e = new C1963b(1, 8);

    /* renamed from: f, reason: collision with root package name */
    public static final C1963b f12910f = new C1963b(1, 9);

    /* renamed from: g, reason: collision with root package name */
    public static final C1963b f12911g = new C1963b(1, 10);

    /* renamed from: h, reason: collision with root package name */
    public static final C1963b f12912h = new C1963b(1, 11);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1963b(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                Class it = (Class) obj;
                Intrinsics.echo(it, "it");
                return AbstractC2607a5.alpha(AbstractC1964c.alpha(it), CollectionsKt.emptyList(), false, CollectionsKt.emptyList());
            case 1:
                Intrinsics.echo((Class) obj, "it");
                return new ConcurrentHashMap();
            case 2:
                Class it2 = (Class) obj;
                Intrinsics.echo(it2, "it");
                return AbstractC2607a5.alpha(AbstractC1964c.alpha(it2), CollectionsKt.emptyList(), true, CollectionsKt.emptyList());
            case 3:
                Class it3 = (Class) obj;
                Intrinsics.echo(it3, "it");
                return new C1986z(it3);
            case 4:
                Class it4 = (Class) obj;
                Intrinsics.echo(it4, "it");
                return new at(it4);
            case 5:
                Class<?> returnType = ((Method) obj).getReturnType();
                Intrinsics.delta(returnType, "it.returnType");
                return AbstractC3192d.bravo(returnType);
            case 6:
                Class it5 = (Class) obj;
                Intrinsics.delta(it5, "it");
                return AbstractC3192d.bravo(it5);
            case 7:
                InterfaceC2345u descriptor = (InterfaceC2345u) obj;
                Intrinsics.echo(descriptor, "descriptor");
                return Pe.o.charlie.whiskey(descriptor) + " | " + Y.charlie(descriptor).foxtrot();
            case 8:
                pe.al descriptor2 = (pe.al) obj;
                Intrinsics.echo(descriptor2, "descriptor");
                return Pe.o.charlie.whiskey(descriptor2) + " | " + Y.bravo(descriptor2).foxtrot();
            case 9:
                Pe.t tVar = X.alpha;
                kotlin.reflect.jvm.internal.impl.types.y type = ((se.aq) obj).getType();
                Intrinsics.delta(type, "it.type");
                return X.delta(type);
            case 10:
                Pe.t tVar2 = X.alpha;
                kotlin.reflect.jvm.internal.impl.types.y type2 = ((se.aq) obj).getType();
                Intrinsics.delta(type2, "it.type");
                return X.delta(type2);
            default:
                Class it6 = (Class) obj;
                Intrinsics.delta(it6, "it");
                return AbstractC3192d.bravo(it6);
        }
    }
}
