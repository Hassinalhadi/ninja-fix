package ne;

import com.google.android.gms.measurement.internal.C1473v;
import me.n;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'white' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: ne.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC2181e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC2181e[] f13125a;
    public static final C1473v red;
    public static final EnumC2181e silver;
    public static final EnumC2181e teal;
    public static final EnumC2181e white;
    public static final EnumC2181e yellow;
    public final Ne.c alpha;
    public final String purple;

    static {
        EnumC2181e enumC2181e = new EnumC2181e("Function", 0, n.juliet, "Function");
        silver = enumC2181e;
        EnumC2181e enumC2181e2 = new EnumC2181e("SuspendFunction", 1, n.echo, "SuspendFunction");
        teal = enumC2181e2;
        Ne.c cVar = n.hotel;
        EnumC2181e enumC2181e3 = new EnumC2181e("KFunction", 2, cVar, "KFunction");
        white = enumC2181e3;
        EnumC2181e enumC2181e4 = new EnumC2181e("KSuspendFunction", 3, cVar, "KSuspendFunction");
        yellow = enumC2181e4;
        f13125a = new EnumC2181e[]{enumC2181e, enumC2181e2, enumC2181e3, enumC2181e4};
        red = new C1473v(12);
    }

    public EnumC2181e(String str, int i4, Ne.c cVar, String str2) {
        this.alpha = cVar;
        this.purple = str2;
    }

    public static EnumC2181e valueOf(String str) {
        return (EnumC2181e) Enum.valueOf(EnumC2181e.class, str);
    }

    public static EnumC2181e[] values() {
        return (EnumC2181e[]) f13125a.clone();
    }

    public final Ne.f alpha(int i4) {
        return Ne.f.echo(this.purple + i4);
    }
}
