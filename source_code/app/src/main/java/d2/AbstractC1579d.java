package d2;

import Ec.af;
import Lf.k;
import Lf.l;
import Y1.al;
import Y1.an;
import Y1.ap;
import Y1.aq;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.P0;
import av.q;
import com.google.firebase.messaging.o;
import ge.w;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.r;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pe.AbstractC2327c;
import s6.T5;

/* renamed from: d2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1579d {
    public static final C1584i alpha = new C1584i(5, true);
    public static final C1584i bravo = new C1584i(1, true);
    public static final C1584i charlie = new C1584i(3, false);
    public static final C1584i delta = new C1584i(2, true);
    public static final C1584i echo = new C1584i(4, true);
    public static final C1584i foxtrot = new C1584i(6, true);
    public static final C1584i golf = new C1584i(7, false);
    public static final C1578c hotel;
    public static final C1578c india;
    public static final C1578c juliet;
    public static final C1578c kilo;

    static {
        boolean z2 = true;
        hotel = new C1578c(2, z2);
        india = new C1578c(3, z2);
        juliet = new C1578c(0, z2);
        kilo = new C1578c(1, z2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
    
        if (r9 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final aq alpha(SerialDescriptor serialDescriptor, Map map) {
        Object obj;
        aq aqVar;
        boolean z2;
        aq aqVar2;
        boolean areEqual;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                w kType = (w) obj;
                Intrinsics.echo(serialDescriptor, "<this>");
                Intrinsics.echo(kType, "kType");
                if (serialDescriptor.papa() != kType.alpha()) {
                    areEqual = false;
                } else {
                    KSerializer charlie2 = T5.charlie(kotlinx.serialization.modules.a.alpha, kType);
                    if (charlie2 != null) {
                        areEqual = Intrinsics.areEqual(serialDescriptor, charlie2.getDescriptor());
                    } else {
                        throw new IllegalStateException(("Cannot find KSerializer for [" + serialDescriptor.oscar() + "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.").toString());
                    }
                }
                if (areEqual) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        w wVar = (w) obj;
        if (wVar != null) {
            aqVar = (aq) map.get(wVar);
        } else {
            aqVar = null;
        }
        if (aqVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            aqVar = null;
        }
        C1584i c1584i = C1584i.sierra;
        if (aqVar == null) {
            Intrinsics.echo(serialDescriptor, "<this>");
            switch (golf(serialDescriptor).ordinal()) {
                case 0:
                    aqVar2 = aq.bravo;
                    aqVar = aqVar2;
                    break;
                case 1:
                    aqVar2 = alpha;
                    aqVar = aqVar2;
                    break;
                case 2:
                    aqVar2 = aq.lima;
                    aqVar = aqVar2;
                    break;
                case 3:
                    aqVar2 = bravo;
                    aqVar = aqVar2;
                    break;
                case 4:
                    aqVar2 = charlie;
                    aqVar = aqVar2;
                    break;
                case 5:
                    aqVar2 = delta;
                    aqVar = aqVar2;
                    break;
                case 6:
                    aqVar2 = aq.india;
                    aqVar = aqVar2;
                    break;
                case 7:
                    aqVar2 = echo;
                    aqVar = aqVar2;
                    break;
                case 8:
                    aqVar2 = aq.foxtrot;
                    aqVar = aqVar2;
                    break;
                case 9:
                    aqVar2 = foxtrot;
                    aqVar = aqVar2;
                    break;
                case 10:
                    aqVar2 = golf;
                    aqVar = aqVar2;
                    break;
                case 11:
                    aqVar2 = aq.oscar;
                    aqVar = aqVar2;
                    break;
                case 12:
                    aqVar2 = aq.delta;
                    aqVar = aqVar2;
                    break;
                case 13:
                    aqVar2 = aq.mike;
                    aqVar = aqVar2;
                    break;
                case 14:
                    aqVar2 = juliet;
                    aqVar = aqVar2;
                    break;
                case 15:
                    aqVar2 = aq.juliet;
                    aqVar = aqVar2;
                    break;
                case 16:
                    aqVar2 = aq.golf;
                    aqVar = aqVar2;
                    break;
                case 17:
                    int ordinal = golf(serialDescriptor.uniform(0)).ordinal();
                    if (ordinal != 10) {
                        if (ordinal == 11) {
                            aqVar2 = hotel;
                        }
                        aqVar = c1584i;
                        break;
                    } else {
                        aqVar2 = aq.papa;
                    }
                    aqVar = aqVar2;
                    break;
                case 18:
                    int ordinal2 = golf(serialDescriptor.uniform(0)).ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 4) {
                                if (ordinal2 != 6) {
                                    if (ordinal2 != 8) {
                                        if (ordinal2 != 19) {
                                            if (ordinal2 != 10) {
                                                if (ordinal2 == 11) {
                                                    aqVar2 = india;
                                                }
                                                aqVar = c1584i;
                                                break;
                                            } else {
                                                aqVar2 = aq.quebec;
                                            }
                                        } else {
                                            aqVar = new C1576a(echo(serialDescriptor.uniform(0)));
                                            break;
                                        }
                                    } else {
                                        aqVar2 = aq.hotel;
                                    }
                                } else {
                                    aqVar2 = aq.kilo;
                                }
                            } else {
                                aqVar2 = kilo;
                            }
                        } else {
                            aqVar2 = aq.november;
                        }
                    } else {
                        aqVar2 = aq.echo;
                    }
                    aqVar = aqVar2;
                    break;
                case 19:
                    Class echo2 = echo(serialDescriptor);
                    if (Parcelable.class.isAssignableFrom(echo2)) {
                        aqVar = new an(echo2);
                        break;
                    } else if (Enum.class.isAssignableFrom(echo2)) {
                        aqVar = new al(echo2);
                        break;
                    } else if (Serializable.class.isAssignableFrom(echo2)) {
                        aqVar = new ap(echo2);
                        break;
                    } else {
                        aqVar = null;
                        break;
                    }
                case 20:
                    Class echo3 = echo(serialDescriptor);
                    if (Enum.class.isAssignableFrom(echo3)) {
                        aqVar = new C1577b(echo3);
                        break;
                    }
                    aqVar = c1584i;
                    break;
                default:
                    aqVar = c1584i;
                    break;
            }
        }
        if (Intrinsics.areEqual(aqVar, c1584i)) {
            return null;
        }
        return aqVar;
    }

    public static final Object bravo(KSerializer kSerializer, Bundle bundle, LinkedHashMap linkedHashMap) {
        Intrinsics.echo(kSerializer, "<this>");
        return kSerializer.deserialize(new C1582g(bundle, linkedHashMap));
    }

    public static final int charlie(KSerializer kSerializer) {
        int hashCode = kSerializer.getDescriptor().oscar().hashCode();
        int romeo = kSerializer.getDescriptor().romeo();
        for (int i4 = 0; i4 < romeo; i4++) {
            hashCode = (hashCode * 31) + kSerializer.getDescriptor().sierra(i4).hashCode();
        }
        return hashCode;
    }

    public static final String delta(Object route, LinkedHashMap linkedHashMap) {
        Intrinsics.echo(route, "route");
        KSerializer bravo2 = T5.bravo(u.alpha.bravo(route.getClass()));
        C1583h c1583h = new C1583h(bravo2, linkedHashMap);
        bravo2.serialize(c1583h, route);
        Map zulu = y.zulu(c1583h.echo);
        o oVar = new o(bravo2);
        af afVar = new af(9, zulu, oVar);
        int romeo = bravo2.getDescriptor().romeo();
        for (int i4 = 0; i4 < romeo; i4++) {
            String sierra = bravo2.getDescriptor().sierra(i4);
            aq aqVar = (aq) linkedHashMap.get(sierra);
            if (aqVar != null) {
                afVar.invoke(Integer.valueOf(i4), sierra, aqVar);
            } else {
                throw new IllegalStateException(AbstractC2327c.victor(']', "Cannot locate NavType for argument [", sierra).toString());
            }
        }
        return ((String) oVar.alpha) + ((String) oVar.charlie) + ((String) oVar.delta);
    }

    public static final Class echo(SerialDescriptor serialDescriptor) {
        String oscar = r.oscar(serialDescriptor.oscar(), "?", "");
        try {
            return Class.forName(oscar);
        } catch (ClassNotFoundException unused) {
            if (StringsKt.beige(oscar, ".", false)) {
                return Class.forName(new Regex("(\\.+)(?!.*\\.)").foxtrot(oscar, "\\$"));
            }
            String str = "Cannot find class with name \"" + serialDescriptor.oscar() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (serialDescriptor.november() instanceof k) {
                str = P0.crimson(str, ".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            throw new IllegalArgumentException(str);
        }
    }

    public static final boolean foxtrot(SerialDescriptor serialDescriptor) {
        Intrinsics.echo(serialDescriptor, "<this>");
        if (Intrinsics.areEqual(serialDescriptor.november(), l.bravo) && serialDescriptor.isInline() && serialDescriptor.romeo() == 1) {
            return true;
        }
        return false;
    }

    public static final EnumC1580e golf(SerialDescriptor serialDescriptor) {
        String oscar = r.oscar(serialDescriptor.oscar(), "?", "");
        if (Intrinsics.areEqual(serialDescriptor.november(), k.bravo)) {
            if (serialDescriptor.papa()) {
                return EnumC1580e.f12030n;
            }
            return EnumC1580e.f12029m;
        }
        if (Intrinsics.areEqual(oscar, "kotlin.Int")) {
            if (serialDescriptor.papa()) {
                return EnumC1580e.purple;
            }
            return EnumC1580e.alpha;
        }
        if (Intrinsics.areEqual(oscar, "kotlin.Boolean")) {
            if (serialDescriptor.papa()) {
                return EnumC1580e.silver;
            }
            return EnumC1580e.red;
        }
        if (Intrinsics.areEqual(oscar, "kotlin.Double")) {
            if (serialDescriptor.papa()) {
                return EnumC1580e.white;
            }
            return EnumC1580e.teal;
        }
        if (Intrinsics.areEqual(oscar, "kotlin.Float")) {
            if (serialDescriptor.papa()) {
                return EnumC1580e.f12018a;
            }
            return EnumC1580e.yellow;
        }
        if (Intrinsics.areEqual(oscar, "kotlin.Long")) {
            if (serialDescriptor.papa()) {
                return EnumC1580e.f12020c;
            }
            return EnumC1580e.f12019b;
        }
        if (Intrinsics.areEqual(oscar, "kotlin.String")) {
            if (serialDescriptor.papa()) {
                return EnumC1580e.e;
            }
            return EnumC1580e.f12021d;
        }
        if (Intrinsics.areEqual(oscar, "kotlin.IntArray")) {
            return EnumC1580e.f12022f;
        }
        if (Intrinsics.areEqual(oscar, "kotlin.DoubleArray")) {
            return EnumC1580e.f12024h;
        }
        if (Intrinsics.areEqual(oscar, "kotlin.BooleanArray")) {
            return EnumC1580e.f12023g;
        }
        if (Intrinsics.areEqual(oscar, "kotlin.FloatArray")) {
            return EnumC1580e.f12025i;
        }
        if (Intrinsics.areEqual(oscar, "kotlin.LongArray")) {
            return EnumC1580e.f12026j;
        }
        if (Intrinsics.areEqual(oscar, "kotlin.Array")) {
            return EnumC1580e.f12027k;
        }
        if (r.quebec(oscar, "kotlin.collections.ArrayList", false)) {
            return EnumC1580e.f12028l;
        }
        return EnumC1580e.f12031o;
    }

    public static final String hotel(String str, String str2, String str3, String str4) {
        StringBuilder india2 = q.india("Route ", str3, " could not find any NavType for argument ", str, " of type ");
        india2.append(str2);
        india2.append(" - typeMap received was ");
        india2.append(str4);
        return india2.toString();
    }
}
