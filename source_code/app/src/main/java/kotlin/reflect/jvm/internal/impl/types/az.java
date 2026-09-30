package kotlin.reflect.jvm.internal.impl.types;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import of.C2259n;
import pe.InterfaceC2330f;

/* loaded from: classes2.dex */
public abstract class az {
    public static final hf.f alpha = hf.i.charlie(hf.h.e, new String[0]);
    public static final hf.f bravo = hf.i.charlie(hf.h.f12723b, new String[0]);
    public static final ay charlie = new ay("NO_EXPECTED_TYPE");
    public static final ay delta = new ay("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Removed duplicated region for block: B:107:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        if (i4 != 4 && i4 != 9 && i4 != 11 && i4 != 15 && i4 != 17 && i4 != 19 && i4 != 26 && i4 != 35 && i4 != 48 && i4 != 53 && i4 != 6 && i4 != 7) {
            switch (i4) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i4 != 4 && i4 != 9 && i4 != 11 && i4 != 15 && i4 != 17 && i4 != 19 && i4 != 26 && i4 != 35 && i4 != 48 && i4 != 53 && i4 != 6 && i4 != 7) {
                switch (i4) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    default:
                        i5 = 3;
                        break;
                }
                Object[] objArr = new Object[i5];
                switch (i4) {
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                    case 11:
                    case 15:
                    case 17:
                    case 19:
                    case 26:
                    case 35:
                    case 48:
                    case 53:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                    case 5:
                    case 8:
                    case 10:
                    case 18:
                    case 23:
                    case 25:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 38:
                    case 40:
                    default:
                        objArr[0] = Constants.KEY_TYPE;
                        break;
                    case 12:
                        objArr[0] = "typeConstructor";
                        break;
                    case 13:
                        objArr[0] = "unsubstitutedMemberScope";
                        break;
                    case 14:
                        objArr[0] = "refinedTypeFactory";
                        break;
                    case 16:
                        objArr[0] = "parameters";
                        break;
                    case 20:
                        objArr[0] = "subType";
                        break;
                    case 21:
                        objArr[0] = "superType";
                        break;
                    case 22:
                        objArr[0] = "substitutor";
                        break;
                    case 24:
                        objArr[0] = "result";
                        break;
                    case 31:
                    case 33:
                        objArr[0] = "clazz";
                        break;
                    case 32:
                        objArr[0] = "typeArguments";
                        break;
                    case 34:
                        objArr[0] = "projections";
                        break;
                    case 36:
                        objArr[0] = "a";
                        break;
                    case 37:
                        objArr[0] = "b";
                        break;
                    case 39:
                        objArr[0] = "typeParameters";
                        break;
                    case 41:
                        objArr[0] = "typeParameterConstructors";
                        break;
                    case 42:
                        objArr[0] = "specialType";
                        break;
                    case 43:
                    case 44:
                        objArr[0] = "isSpecialType";
                        break;
                    case 45:
                    case 46:
                        objArr[0] = "parameterDescriptor";
                        break;
                    case 47:
                    case 51:
                        objArr[0] = "numberValueTypeConstructor";
                        break;
                    case 49:
                    case 50:
                        objArr[0] = "supertypes";
                        break;
                    case 52:
                    case 55:
                        objArr[0] = "expectedType";
                        break;
                    case 54:
                        objArr[0] = "literalTypeConstructor";
                        break;
                }
                if (i4 == 4) {
                    if (i4 != 9) {
                        if (i4 == 11 || i4 == 15) {
                            objArr[1] = "makeUnsubstitutedType";
                        } else if (i4 == 17) {
                            objArr[1] = "getDefaultTypeProjections";
                        } else if (i4 == 19) {
                            objArr[1] = "getImmediateSupertypes";
                        } else if (i4 == 26) {
                            objArr[1] = "getAllSupertypes";
                        } else if (i4 == 35) {
                            objArr[1] = "substituteProjectionsForParameters";
                        } else if (i4 != 48) {
                            if (i4 != 53) {
                                if (i4 != 6 && i4 != 7) {
                                    switch (i4) {
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                            break;
                                    }
                                }
                            }
                            objArr[1] = "getPrimitiveNumberType";
                        } else {
                            objArr[1] = "getDefaultPrimitiveNumberType";
                        }
                    }
                    objArr[1] = "makeNullableIfNeeded";
                } else {
                    objArr[1] = "makeNullableAsSpecified";
                }
                switch (i4) {
                    case 1:
                        objArr[2] = "makeNullable";
                        break;
                    case 2:
                        objArr[2] = "makeNotNullable";
                        break;
                    case 3:
                        objArr[2] = "makeNullableAsSpecified";
                        break;
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                    case 11:
                    case 15:
                    case 17:
                    case 19:
                    case 26:
                    case 35:
                    case 48:
                    case 53:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    case 5:
                    case 8:
                        objArr[2] = "makeNullableIfNeeded";
                        break;
                    case 10:
                        objArr[2] = "canHaveSubtypes";
                        break;
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "makeUnsubstitutedType";
                        break;
                    case 16:
                        objArr[2] = "getDefaultTypeProjections";
                        break;
                    case 18:
                        objArr[2] = "getImmediateSupertypes";
                        break;
                    case 20:
                    case 21:
                    case 22:
                        objArr[2] = "createSubstitutedSupertype";
                        break;
                    case 23:
                    case 24:
                        objArr[2] = "collectAllSupertypes";
                        break;
                    case 25:
                        objArr[2] = "getAllSupertypes";
                        break;
                    case 27:
                        objArr[2] = "isNullableType";
                        break;
                    case 28:
                        objArr[2] = "acceptsNullable";
                        break;
                    case 29:
                        objArr[2] = "hasNullableSuperType";
                        break;
                    case 30:
                        objArr[2] = "getClassDescriptor";
                        break;
                    case 31:
                    case 32:
                        objArr[2] = "substituteParameters";
                        break;
                    case 33:
                    case 34:
                        objArr[2] = "substituteProjectionsForParameters";
                        break;
                    case 36:
                    case 37:
                        objArr[2] = "equalTypes";
                        break;
                    case 38:
                    case 39:
                        objArr[2] = "dependsOnTypeParameters";
                        break;
                    case 40:
                    case 41:
                        objArr[2] = "dependsOnTypeConstructors";
                        break;
                    case 42:
                    case 43:
                    case 44:
                        objArr[2] = "contains";
                        break;
                    case 45:
                    case 46:
                        objArr[2] = "makeStarProjection";
                        break;
                    case 47:
                    case 49:
                        objArr[2] = "getDefaultPrimitiveNumberType";
                        break;
                    case 50:
                        objArr[2] = "findByFqName";
                        break;
                    case 51:
                    case 52:
                    case 54:
                    case 55:
                        objArr[2] = "getPrimitiveNumberType";
                        break;
                    case 60:
                        objArr[2] = "isTypeParameter";
                        break;
                    case 61:
                        objArr[2] = "isReifiedTypeParameter";
                        break;
                    case 62:
                        objArr[2] = "isNonReifiedTypeParameter";
                        break;
                    case 63:
                        objArr[2] = "getTypeParameterDescriptorOrNull";
                        break;
                    default:
                        objArr[2] = "noExpectedType";
                        break;
                }
                String format = String.format(str, objArr);
                if (i4 != 4 && i4 != 9 && i4 != 11 && i4 != 15 && i4 != 17 && i4 != 19 && i4 != 26 && i4 != 35 && i4 != 48 && i4 != 53 && i4 != 6 && i4 != 7) {
                    switch (i4) {
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i5 = 2;
            Object[] objArr2 = new Object[i5];
            switch (i4) {
            }
            if (i4 == 4) {
            }
            switch (i4) {
            }
            String format2 = String.format(str, objArr2);
            if (i4 != 4) {
                switch (i4) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i4 != 4) {
            switch (i4) {
            }
            Object[] objArr22 = new Object[i5];
            switch (i4) {
            }
            if (i4 == 4) {
            }
            switch (i4) {
            }
            String format22 = String.format(str, objArr22);
            if (i4 != 4) {
            }
            throw new IllegalStateException(format22);
        }
        i5 = 2;
        Object[] objArr222 = new Object[i5];
        switch (i4) {
        }
        if (i4 == 4) {
        }
        switch (i4) {
        }
        String format222 = String.format(str, objArr222);
        if (i4 != 4) {
        }
        throw new IllegalStateException(format222);
    }

    public static boolean bravo(y yVar) {
        if (yVar != null) {
            if (!yVar.indigo()) {
                if (c.juliet(yVar) && bravo(((s) yVar.ochre()).red)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        alpha(28);
        throw null;
    }

    public static boolean charlie(y yVar, Function1 function1) {
        if (function1 != null) {
            return delta(yVar, function1, null);
        }
        alpha(43);
        throw null;
    }

    public static boolean delta(y yVar, Function1 function1, C2259n c2259n) {
        s sVar = null;
        if (function1 != null) {
            if (yVar != null) {
                B ochre = yVar.ochre();
                if (mike(yVar)) {
                    return ((Boolean) function1.invoke(ochre)).booleanValue();
                }
                if (c2259n == null || !c2259n.contains(yVar)) {
                    if (!((Boolean) function1.invoke(ochre)).booleanValue()) {
                        if (c2259n == null) {
                            c2259n = new C2259n();
                        }
                        c2259n.add(yVar);
                        if (ochre instanceof s) {
                            sVar = (s) ochre;
                        }
                        if (sVar == null || (!delta(sVar.purple, function1, c2259n) && !delta(sVar.red, function1, c2259n))) {
                            if (!(ochre instanceof o) || !delta(((o) ochre).purple, function1, c2259n)) {
                                ap green = yVar.green();
                                if (green instanceof x) {
                                    Iterator it = ((x) green).bravo.iterator();
                                    while (it.hasNext()) {
                                        if (delta((y) it.next(), function1, c2259n)) {
                                            return true;
                                        }
                                    }
                                    return false;
                                }
                                for (as asVar : yVar.cyan()) {
                                    if (!asVar.charlie()) {
                                        if (delta(asVar.bravo(), function1, c2259n)) {
                                            return true;
                                        }
                                    }
                                }
                                return false;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        alpha(44);
        throw null;
    }

    public static List echo(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new at(((pe.aq) it.next()).oscar()));
            }
            List z2 = CollectionsKt.z(arrayList);
            if (z2 != null) {
                return z2;
            }
            alpha(17);
            throw null;
        }
        alpha(16);
        throw null;
    }

    public static boolean foxtrot(y yVar) {
        y yVar2;
        if (yVar != null) {
            if (!yVar.indigo() && (!c.juliet(yVar) || !foxtrot(((s) yVar.ochre()).red))) {
                if (!(yVar.ochre() instanceof o)) {
                    if (golf(yVar)) {
                        if (!(yVar.green().kilo() instanceof InterfaceC2330f)) {
                            ax delta2 = ax.delta(yVar);
                            Collection<y> lima = yVar.green().lima();
                            ArrayList arrayList = new ArrayList(lima.size());
                            for (y yVar3 : lima) {
                                if (yVar3 != null) {
                                    y india = delta2.india(1, yVar3);
                                    if (india != null) {
                                        yVar2 = india(india, yVar.indigo());
                                    } else {
                                        yVar2 = null;
                                    }
                                    if (yVar2 != null) {
                                        arrayList.add(yVar2);
                                    }
                                } else {
                                    alpha(21);
                                    throw null;
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (foxtrot((y) it.next())) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    ap green = yVar.green();
                    if (green instanceof x) {
                        Iterator it2 = ((x) green).bravo.iterator();
                        while (it2.hasNext()) {
                            if (foxtrot((y) it2.next())) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }
        alpha(27);
        throw null;
    }

    public static boolean golf(y yVar) {
        pe.aq aqVar = null;
        if (yVar != null) {
            if (yVar.green().kilo() instanceof pe.aq) {
                aqVar = (pe.aq) yVar.green().kilo();
            }
            if (aqVar == null) {
                yVar.green();
                return false;
            }
            return true;
        }
        alpha(60);
        throw null;
    }

    public static B hotel(y yVar, boolean z2) {
        if (yVar != null) {
            B pink = yVar.ochre().pink(z2);
            if (pink != null) {
                return pink;
            }
            alpha(4);
            throw null;
        }
        alpha(3);
        throw null;
    }

    public static y india(y yVar, boolean z2) {
        if (yVar != null) {
            if (z2) {
                return hotel(yVar, true);
            }
            return yVar;
        }
        alpha(8);
        throw null;
    }

    public static ae juliet(ae aeVar, boolean z2) {
        if (aeVar != null) {
            if (z2) {
                ae pink = aeVar.pink(true);
                if (pink != null) {
                    return pink;
                }
                alpha(6);
                throw null;
            }
            return aeVar;
        }
        alpha(5);
        throw null;
    }

    public static aj kilo(pe.aq aqVar) {
        if (aqVar != null) {
            return new aj(aqVar);
        }
        alpha(45);
        throw null;
    }

    public static as lima(pe.aq aqVar, De.a aVar) {
        if (aqVar != null) {
            if (aVar.alpha == 1) {
                return new at(1, c.romeo(aqVar));
            }
            return new aj(aqVar);
        }
        alpha(46);
        throw null;
    }

    public static boolean mike(y yVar) {
        if (yVar != null) {
            if (yVar != charlie && yVar != delta) {
                return false;
            }
            return true;
        }
        alpha(0);
        throw null;
    }
}
