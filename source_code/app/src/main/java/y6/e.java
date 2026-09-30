package y6;

import A2.ao;
import Ce.j;
import V0.k;
import V5.x;
import a4.u;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.camera.core.q;
import be.RunnableC0756b;
import cf.InterfaceC0854j;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2330f;
import se.C2859i;
import se.aq;
import t6.AbstractC3003i;
import ue.C3160d;
import ze.C3510a;

/* loaded from: classes2.dex */
public abstract class e {
    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 18) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 18) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i4 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i4) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static aq bravo(Ne.f fVar, InterfaceC2330f interfaceC2330f) {
        if (fVar != null) {
            if (interfaceC2330f != null) {
                Collection xray = interfaceC2330f.xray();
                if (xray.size() != 1) {
                    return null;
                }
                for (aq aqVar : ((C2859i) xray.iterator().next()).peach()) {
                    if (aqVar.getName().equals(fVar)) {
                        return aqVar;
                    }
                }
                return null;
            }
            alpha(20);
            throw null;
        }
        alpha(19);
        throw null;
    }

    public static RunnableC0756b charlie(Context context) {
        k kVar;
        Intrinsics.echo(context, "context");
        bo.e eVar = bo.e.golf;
        synchronized (eVar.alpha) {
            kVar = eVar.bravo;
            if (kVar == null) {
                kVar = AbstractC3003i.alpha(new ao(22, eVar, new q(context)));
                eVar.bravo = kVar;
            }
        }
        u uVar = new u(12, new bo.d(context, 0));
        return be.h.foxtrot(kVar, new androidx.core.widget.f(11, uVar), tg.k.bravo());
    }

    public static LinkedHashSet delta(Ne.f fVar, Collection collection, Collection collection2, InterfaceC2330f interfaceC2330f, InterfaceC0854j interfaceC0854j, Qe.k kVar, boolean z2) {
        if (fVar != null) {
            if (collection != null) {
                if (collection2 != null) {
                    if (interfaceC2330f != null) {
                        if (interfaceC0854j != null) {
                            if (kVar != null) {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                kVar.hotel(fVar, collection, collection2, interfaceC2330f, new C3510a(interfaceC0854j, linkedHashSet, z2));
                                return linkedHashSet;
                            }
                            alpha(17);
                            throw null;
                        }
                        alpha(16);
                        throw null;
                    }
                    alpha(15);
                    throw null;
                }
                alpha(14);
                throw null;
            }
            alpha(13);
            throw null;
        }
        alpha(12);
        throw null;
    }

    public static LinkedHashSet echo(Ne.f fVar, AbstractCollection abstractCollection, Collection collection, InterfaceC2330f interfaceC2330f, InterfaceC0854j interfaceC0854j, Qe.k kVar) {
        if (fVar != null) {
            if (collection != null) {
                if (interfaceC2330f != null) {
                    if (interfaceC0854j != null) {
                        if (kVar != null) {
                            return delta(fVar, abstractCollection, collection, interfaceC2330f, interfaceC0854j, kVar, false);
                        }
                        alpha(5);
                        throw null;
                    }
                    alpha(4);
                    throw null;
                }
                alpha(3);
                throw null;
            }
            alpha(2);
            throw null;
        }
        alpha(0);
        throw null;
    }

    public static LinkedHashSet foxtrot(Ne.f fVar, Collection collection, AbstractCollection abstractCollection, j jVar, C3160d c3160d, Qe.k kVar) {
        if (fVar != null) {
            if (collection != null) {
                if (jVar != null) {
                    if (c3160d != null) {
                        if (kVar != null) {
                            return delta(fVar, collection, abstractCollection, jVar, c3160d, kVar, true);
                        }
                        alpha(11);
                        throw null;
                    }
                    alpha(10);
                    throw null;
                }
                alpha(9);
                throw null;
            }
            alpha(7);
            throw null;
        }
        alpha(6);
        throw null;
    }

    public static Parcelable golf(Bundle bundle, String str) {
        ClassLoader classLoader = e.class.getClassLoader();
        x.hotel(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void hotel(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable golf = golf(bundle, "MapOptions");
            if (golf != null) {
                india(bundle2, "MapOptions", golf);
            }
            Parcelable golf2 = golf(bundle, "StreetViewPanoramaOptions");
            if (golf2 != null) {
                india(bundle2, "StreetViewPanoramaOptions", golf2);
            }
            Parcelable golf3 = golf(bundle, "camera");
            if (golf3 != null) {
                india(bundle2, "camera", golf3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static void india(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = e.class.getClassLoader();
        x.hotel(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
