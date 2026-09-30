package t6;

import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.android.gms.measurement.internal.C1475w;
import ge.InterfaceC1772d;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t6.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3062u {
    public static ug.a alpha;

    public static final InterfaceC1772d alpha(Annotation annotation) {
        Intrinsics.echo(annotation, "<this>");
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Intrinsics.delta(annotationType, "annotationType(...)");
        return echo(annotationType);
    }

    public static final Class bravo(InterfaceC1772d interfaceC1772d) {
        Intrinsics.echo(interfaceC1772d, "<this>");
        Class golf = ((kotlin.jvm.internal.d) interfaceC1772d).golf();
        Intrinsics.charlie(golf, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return golf;
    }

    public static final Class charlie(InterfaceC1772d interfaceC1772d) {
        Intrinsics.echo(interfaceC1772d, "<this>");
        Class golf = ((kotlin.jvm.internal.d) interfaceC1772d).golf();
        if (!golf.isPrimitive()) {
            return golf;
        }
        String name = golf.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return golf;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return golf;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return golf;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return golf;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return golf;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return golf;
            case 64711720:
                if (name.equals(CTVariableUtils.BOOLEAN)) {
                    return Boolean.class;
                }
                return golf;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return golf;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return golf;
            default:
                return golf;
        }
    }

    public static final Class delta(InterfaceC1772d interfaceC1772d) {
        Intrinsics.echo(interfaceC1772d, "<this>");
        Class golf = ((kotlin.jvm.internal.d) interfaceC1772d).golf();
        if (golf.isPrimitive()) {
            return golf;
        }
        String name = golf.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (!name.equals("java.lang.Integer")) {
                    return null;
                }
                return Integer.TYPE;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final InterfaceC1772d echo(Class cls) {
        Intrinsics.echo(cls, "<this>");
        return kotlin.jvm.internal.u.alpha.bravo(cls);
    }

    public static ug.a foxtrot() {
        ug.a c1475w;
        if (alpha == null) {
            ug.b bravo = rg.d.bravo();
            if (bravo != null) {
                c1475w = bravo.alpha();
                if (bravo instanceof tg.i) {
                    tg.f.delta("Temporary mdcAdapter given by SubstituteServiceProvider.");
                    tg.f.delta("This mdcAdapter will be replaced after backend initialization has completed.");
                }
            } else {
                tg.f.alpha("Failed to find provider.");
                tg.f.alpha("Defaulting to no-operation MDCAdapter implementation.");
                c1475w = new C1475w(15);
            }
            alpha = c1475w;
        }
        return alpha;
    }
}
