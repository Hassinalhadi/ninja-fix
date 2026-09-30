package Qe;

import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.AbstractC2340p;
import pe.InterfaceC2321ad;
import pe.InterfaceC2326b;
import pe.InterfaceC2328d;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.InterfaceC2336l;
import pe.InterfaceC2338n;
import pe.InterfaceC2349y;
import pe.ai;
import pe.ao;
import se.C2873w;
import se.ab;
import se.aj;

/* loaded from: classes2.dex */
public abstract class e {
    public static final /* synthetic */ int alpha = 0;

    static {
        new Ne.c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        switch (i4) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i5 = 2;
                break;
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = Constants.KEY_TYPE;
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case 92:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i4) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i4) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 92:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static void bravo(InterfaceC2326b interfaceC2326b, LinkedHashSet linkedHashSet) {
        if (interfaceC2326b != null) {
            if (!linkedHashSet.contains(interfaceC2326b)) {
                Iterator it = interfaceC2326b.alpha().mike().iterator();
                while (it.hasNext()) {
                    InterfaceC2326b alpha2 = ((InterfaceC2326b) it.next()).alpha();
                    bravo(alpha2, linkedHashSet);
                    linkedHashSet.add(alpha2);
                }
                return;
            }
            return;
        }
        alpha(73);
        throw null;
    }

    public static InterfaceC2330f charlie(y yVar) {
        if (yVar != null) {
            ap green = yVar.green();
            if (green != null) {
                InterfaceC2330f interfaceC2330f = (InterfaceC2330f) green.kilo();
                if (interfaceC2330f != null) {
                    return interfaceC2330f;
                }
                alpha(47);
                throw null;
            }
            alpha(46);
            throw null;
        }
        alpha(45);
        throw null;
    }

    public static InterfaceC2349y delta(InterfaceC2335k interfaceC2335k) {
        if (interfaceC2335k != null) {
            InterfaceC2349y echo = echo(interfaceC2335k);
            if (echo != null) {
                return echo;
            }
            alpha(22);
            throw null;
        }
        alpha(21);
        throw null;
    }

    public static InterfaceC2349y echo(InterfaceC2335k interfaceC2335k) {
        if (interfaceC2335k != null) {
            while (interfaceC2335k != null) {
                if (interfaceC2335k instanceof InterfaceC2349y) {
                    return (InterfaceC2349y) interfaceC2335k;
                }
                if (interfaceC2335k instanceof ai) {
                    return ((C2873w) ((ai) interfaceC2335k)).red;
                }
                interfaceC2335k = interfaceC2335k.lima();
            }
            return null;
        }
        alpha(23);
        throw null;
    }

    public static ao foxtrot(InterfaceC2335k interfaceC2335k) {
        if (interfaceC2335k != null) {
            if (interfaceC2335k instanceof aj) {
                interfaceC2335k = ((aj) interfaceC2335k).Z();
            }
            boolean z2 = interfaceC2335k instanceof InterfaceC2336l;
            ao aoVar = ao.purple;
            if (z2) {
                ((InterfaceC2336l) interfaceC2335k).echo().getClass();
            }
            return aoVar;
        }
        alpha(82);
        throw null;
    }

    public static Ne.e golf(InterfaceC2335k interfaceC2335k) {
        if (interfaceC2335k != null) {
            Ne.c hotel = hotel(interfaceC2335k);
            if (hotel != null) {
                return hotel.india();
            }
            return golf(interfaceC2335k.lima()).bravo(interfaceC2335k.getName());
        }
        alpha(2);
        throw null;
    }

    public static Ne.c hotel(InterfaceC2335k interfaceC2335k) {
        if (interfaceC2335k != null) {
            if (!(interfaceC2335k instanceof InterfaceC2349y) && !hf.i.foxtrot(interfaceC2335k)) {
                if (interfaceC2335k instanceof ai) {
                    return ((C2873w) ((ai) interfaceC2335k)).silver;
                }
                if (!(interfaceC2335k instanceof InterfaceC2321ad)) {
                    return null;
                }
                return ((ab) ((InterfaceC2321ad) interfaceC2335k)).teal;
            }
            return Ne.c.charlie;
        }
        alpha(5);
        throw null;
    }

    public static InterfaceC2335k india(InterfaceC2335k interfaceC2335k, Class cls, boolean z2) {
        if (interfaceC2335k != null) {
            if (z2) {
                interfaceC2335k = interfaceC2335k.lima();
            }
            while (interfaceC2335k != null) {
                if (cls.isInstance(interfaceC2335k)) {
                    return interfaceC2335k;
                }
                interfaceC2335k = interfaceC2335k.lima();
            }
            return null;
        }
        return null;
    }

    public static InterfaceC2330f juliet(InterfaceC2330f interfaceC2330f) {
        if (interfaceC2330f != null) {
            Iterator it = interfaceC2330f.tango().lima().iterator();
            while (it.hasNext()) {
                InterfaceC2330f charlie = charlie((y) it.next());
                if (charlie.c() != 2) {
                    return charlie;
                }
            }
            return null;
        }
        alpha(44);
        throw null;
    }

    public static boolean kilo(InterfaceC2335k interfaceC2335k) {
        if (interfaceC2335k != null) {
            if (november(interfaceC2335k, 1) && interfaceC2335k.getName().equals(Ne.h.alpha)) {
                return true;
            }
            return false;
        }
        alpha(34);
        throw null;
    }

    public static boolean lima(InterfaceC2335k interfaceC2335k) {
        if (november(interfaceC2335k, 6) && ((InterfaceC2330f) interfaceC2335k).uniform()) {
            return true;
        }
        return false;
    }

    public static boolean mike(InterfaceC2335k interfaceC2335k) {
        if (interfaceC2335k != null) {
            return november(interfaceC2335k, 4);
        }
        alpha(36);
        throw null;
    }

    public static boolean november(InterfaceC2335k interfaceC2335k, int i4) {
        if (i4 != 0) {
            if ((interfaceC2335k instanceof InterfaceC2330f) && ((InterfaceC2330f) interfaceC2335k).c() == i4) {
                return true;
            }
            return false;
        }
        alpha(37);
        throw null;
    }

    public static boolean oscar(InterfaceC2335k interfaceC2335k) {
        if (interfaceC2335k != null) {
            while (interfaceC2335k != null) {
                if (kilo(interfaceC2335k) || ((interfaceC2335k instanceof InterfaceC2338n) && ((InterfaceC2338n) interfaceC2335k).getVisibility() == AbstractC2340p.foxtrot)) {
                    return true;
                }
                interfaceC2335k = interfaceC2335k.lima();
            }
            return false;
        }
        alpha(1);
        throw null;
    }

    public static boolean papa(y yVar, InterfaceC2330f interfaceC2330f) {
        if (yVar != null) {
            if (interfaceC2330f != null) {
                InterfaceC2332h kilo = yVar.green().kilo();
                if (kilo != null) {
                    InterfaceC2335k alpha2 = kilo.alpha();
                    if ((alpha2 instanceof InterfaceC2332h) && interfaceC2330f.tango().equals(((InterfaceC2332h) alpha2).tango())) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            alpha(31);
            throw null;
        }
        alpha(30);
        throw null;
    }

    public static boolean quebec(InterfaceC2335k interfaceC2335k) {
        if ((november(interfaceC2335k, 1) || november(interfaceC2335k, 2)) && ((InterfaceC2330f) interfaceC2335k).golf() == 2) {
            return true;
        }
        return false;
    }

    public static boolean romeo(y yVar, InterfaceC2330f interfaceC2330f) {
        if (yVar != null) {
            if (interfaceC2330f != null) {
                if (!papa(yVar, interfaceC2330f)) {
                    Iterator it = yVar.green().lima().iterator();
                    while (it.hasNext()) {
                        if (romeo((y) it.next(), interfaceC2330f)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            alpha(33);
            throw null;
        }
        alpha(32);
        throw null;
    }

    public static boolean sierra(InterfaceC2335k interfaceC2335k) {
        if (interfaceC2335k != null && (interfaceC2335k.lima() instanceof InterfaceC2321ad)) {
            return true;
        }
        return false;
    }

    public static InterfaceC2328d tango(InterfaceC2328d interfaceC2328d) {
        if (interfaceC2328d != null) {
            while (interfaceC2328d.november() == 2) {
                Collection mike = interfaceC2328d.mike();
                if (!mike.isEmpty()) {
                    interfaceC2328d = (InterfaceC2328d) mike.iterator().next();
                } else {
                    throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + interfaceC2328d);
                }
            }
            return interfaceC2328d;
        }
        alpha(59);
        throw null;
    }
}
