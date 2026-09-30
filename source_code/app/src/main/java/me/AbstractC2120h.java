package me;

import B9.K;
import Lb.W;
import av.ah;
import cf.C0853i;
import cf.InterfaceC0854j;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import df.C1622a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.B;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.as;
import kotlin.reflect.jvm.internal.impl.types.at;
import kotlin.reflect.jvm.internal.impl.types.az;
import kotlin.reflect.jvm.internal.impl.types.y;
import ne.C2177a;
import ne.EnumC2181e;
import pe.AbstractC2347w;
import pe.C2324ag;
import pe.InterfaceC2321ad;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import pe.InterfaceC2349y;
import pe.al;
import qe.C2471g;
import qe.InterfaceC2472h;
import re.C2517a;
import re.InterfaceC2518b;
import re.InterfaceC2520d;
import s6.AbstractC2826z0;
import se.ab;
import se.ai;
import se.aj;
import se.z;

/* renamed from: me.h */
/* loaded from: classes2.dex */
public abstract class AbstractC2120h {
    public static final Ne.f echo = Ne.f.golf("<built-ins module>");
    public z alpha;
    public final ff.i bravo;
    public final ff.e charlie;
    public final ff.l delta;

    public AbstractC2120h(ff.l lVar) {
        this.delta = lVar;
        lVar.bravo(new C2118f(this, 0));
        this.bravo = lVar.bravo(new C2118f(this, 1));
        this.charlie = lVar.charlie(new W(5, this));
    }

    public static /* synthetic */ void alpha(int i4) {
        String str;
        int i5;
        switch (i4) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i5 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i5 = 3;
                break;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case ModuleDescriptor.MODULE_VERSION /* 141 */:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 162:
                objArr[0] = Constants.KEY_TYPE;
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i4) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i4) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 141 */:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static boolean amber(y yVar, Ne.e eVar) {
        if (eVar != null) {
            if (zulu(yVar, eVar) && !yVar.indigo()) {
                return true;
            }
            return false;
        }
        alpha(135);
        throw null;
    }

    public static boolean azure(InterfaceC2345u interfaceC2345u) {
        if (!interfaceC2345u.alpha().getAnnotations().D(m.mike)) {
            if (interfaceC2345u instanceof al) {
                al alVar = (al) interfaceC2345u;
                boolean e = alVar.e();
                ai bravo = alVar.bravo();
                aj charlie = alVar.charlie();
                if (bravo != null && azure(bravo)) {
                    if (e) {
                        if (charlie != null && azure(charlie)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean beige(y yVar, Ne.e eVar) {
        if (yVar != null) {
            if (eVar != null) {
                if (!yVar.indigo() && zulu(yVar, eVar)) {
                    return true;
                }
                return false;
            }
            alpha(106);
            throw null;
        }
        alpha(105);
        throw null;
    }

    public static boolean black(y yVar) {
        if (yVar != null) {
            if (yVar != null) {
                if (zulu(yVar, m.bravo) && !az.foxtrot(yVar)) {
                    return true;
                }
                return false;
            }
            alpha(138);
            throw null;
        }
        alpha(136);
        throw null;
    }

    public static boolean blue(y yVar) {
        if (yVar != null) {
            if (!yVar.indigo()) {
                InterfaceC2332h kilo = yVar.green().kilo();
                if (kilo instanceof InterfaceC2330f) {
                    InterfaceC2330f interfaceC2330f = (InterfaceC2330f) kilo;
                    if (interfaceC2330f != null) {
                        if (sierra(interfaceC2330f) != null) {
                            return true;
                        }
                        return false;
                    }
                    alpha(96);
                    throw null;
                }
                return false;
            }
            return false;
        }
        alpha(94);
        throw null;
    }

    public static boolean bravo(InterfaceC2330f interfaceC2330f, Ne.e eVar) {
        if (interfaceC2330f != null) {
            if (eVar != null) {
                if (interfaceC2330f.getName().equals(eVar.foxtrot()) && eVar.equals(Qe.e.golf(interfaceC2330f))) {
                    return true;
                }
                return false;
            }
            alpha(104);
            throw null;
        }
        alpha(103);
        throw null;
    }

    public static boolean bronze(y yVar) {
        if (beige(yVar, m.foxtrot)) {
            return true;
        }
        return false;
    }

    public static boolean coral(ap apVar, Ne.e eVar) {
        if (apVar != null) {
            if (eVar != null) {
                InterfaceC2332h kilo = apVar.kilo();
                if ((kilo instanceof InterfaceC2330f) && bravo((InterfaceC2330f) kilo, eVar)) {
                    return true;
                }
                return false;
            }
            alpha(102);
            throw null;
        }
        alpha(101);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r1 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean crimson(InterfaceC2332h interfaceC2332h) {
        if (interfaceC2332h != null) {
            for (InterfaceC2332h interfaceC2332h2 = interfaceC2332h; interfaceC2332h2 != null; interfaceC2332h2 = interfaceC2332h2.lima()) {
                if (interfaceC2332h2 instanceof InterfaceC2321ad) {
                    return ((ab) ((InterfaceC2321ad) interfaceC2332h2)).teal.hotel(n.india);
                }
            }
            return false;
        }
        alpha(10);
        throw null;
    }

    public static j quebec(InterfaceC2332h interfaceC2332h) {
        if (interfaceC2332h != null) {
            if (!m.pink.contains(interfaceC2332h.getName())) {
                return null;
            }
            return (j) m.purple.get(Qe.e.golf(interfaceC2332h));
        }
        alpha(77);
        throw null;
    }

    public static j sierra(InterfaceC2330f interfaceC2330f) {
        if (interfaceC2330f != null) {
            if (!m.peach.contains(interfaceC2330f.getName())) {
                return null;
            }
            return (j) m.plum.get(Qe.e.golf(interfaceC2330f));
        }
        alpha(76);
        throw null;
    }

    public static boolean whiskey(y yVar) {
        if (yVar != null) {
            return zulu(yVar, m.alpha);
        }
        alpha(139);
        throw null;
    }

    public static boolean xray(y yVar) {
        if (yVar != null) {
            return zulu(yVar, m.golf);
        }
        alpha(88);
        throw null;
    }

    public static boolean yankee(InterfaceC2335k interfaceC2335k) {
        if (interfaceC2335k != null) {
            if (Qe.e.india(interfaceC2335k, df.c.class, false) == null) {
                return false;
            }
            return true;
        }
        alpha(9);
        throw null;
    }

    public static boolean zulu(y yVar, Ne.e eVar) {
        if (yVar != null) {
            if (eVar != null) {
                return coral(yVar.green(), eVar);
            }
            alpha(98);
            throw null;
        }
        alpha(97);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void charlie() {
        int collectionSizeOrDefault;
        Ne.f moduleName = echo;
        Intrinsics.echo(moduleName, "moduleName");
        ff.l lVar = this.delta;
        z zVar = new z(moduleName, lVar, this, 48);
        this.alpha = zVar;
        InterfaceC2115c.alpha.getClass();
        InterfaceC2115c interfaceC2115c = (InterfaceC2115c) C2114b.bravo.getValue();
        z builtInsModule = this.alpha;
        List classDescriptorFactories = lima();
        InterfaceC2520d platformDependentDeclarationFilter = oscar();
        InterfaceC2518b additionalClassPartsProvider = delta();
        df.b bVar = (df.b) interfaceC2115c;
        bVar.getClass();
        Intrinsics.echo(builtInsModule, "builtInsModule");
        Intrinsics.echo(classDescriptorFactories, "classDescriptorFactories");
        Intrinsics.echo(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.echo(additionalClassPartsProvider, "additionalClassPartsProvider");
        Set packageFqNames = n.oscar;
        Ce.l lVar2 = new Ce.l(1, bVar.bravo, 2);
        Intrinsics.echo(packageFqNames, "packageFqNames");
        Set<Ne.c> set = packageFqNames;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Ne.c cVar : set) {
            C1622a.mike.getClass();
            String alpha = C1622a.alpha(cVar);
            InputStream inputStream = (InputStream) lVar2.invoke(alpha);
            if (inputStream != null) {
                arrayList.add(AbstractC2826z0.charlie(cVar, lVar, builtInsModule, inputStream));
            } else {
                throw new IllegalStateException(av.q.echo("Resource not found in classpath: ", alpha));
            }
        }
        C2324ag c2324ag = new C2324ag(arrayList);
        J2.i iVar = new J2.i(lVar, builtInsModule);
        ah ahVar = new ah(13, c2324ag);
        C1622a c1622a = C1622a.mike;
        K k6 = new K(lVar, builtInsModule, ahVar, new w.o(builtInsModule, iVar, c1622a), c2324ag, InterfaceC0854j.alpha, C0853i.charlie, classDescriptorFactories, iVar, additionalClassPartsProvider, platformDependentDeclarationFilter, c1622a.alpha, null, new U8.a(lVar, CollectionsKt.emptyList()), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((df.c) it.next()).a0(k6);
        }
        zVar.f13798a = c2324ag;
        z zVar2 = this.alpha;
        zVar2.getClass();
        List descriptors = ArraysKt.b(new z[]{zVar2});
        Intrinsics.echo(descriptors, "descriptors");
        zVar2.yellow = new com.google.android.play.core.integrity.c(descriptors, CollectionsKt.emptyList());
    }

    public InterfaceC2518b delta() {
        return C2517a.bravo;
    }

    public final ae echo() {
        ae oscar = juliet("Any").oscar();
        if (oscar != null) {
            return oscar;
        }
        alpha(50);
        throw null;
    }

    public final y foxtrot(y yVar) {
        InterfaceC2349y echo2;
        Ne.b foxtrot;
        Ne.b bVar;
        InterfaceC2330f delta;
        ae aeVar = null;
        if (yVar != null) {
            if (xray(yVar)) {
                if (yVar.cyan().size() == 1) {
                    y bravo = ((as) yVar.cyan().get(0)).bravo();
                    if (bravo != null) {
                        return bravo;
                    }
                    alpha(68);
                    throw null;
                }
                throw new IllegalStateException();
            }
            B hotel = az.hotel(yVar, false);
            y yVar2 = (y) ((C2119g) this.bravo.invoke()).bravo.get(hotel);
            if (yVar2 != null) {
                return yVar2;
            }
            int i4 = Qe.e.alpha;
            InterfaceC2332h kilo = hotel.green().kilo();
            if (kilo == null) {
                echo2 = null;
            } else {
                echo2 = Qe.e.echo(kilo);
            }
            if (echo2 != null) {
                InterfaceC2332h kilo2 = hotel.green().kilo();
                if (kilo2 != null) {
                    Set set = r.alpha;
                    Ne.f name = kilo2.getName();
                    Intrinsics.echo(name, "name");
                    if (r.delta.contains(name) && (foxtrot = Ue.e.foxtrot(kilo2)) != null && (bVar = (Ne.b) r.bravo.get(foxtrot)) != null && (delta = AbstractC2347w.delta(echo2, bVar)) != null) {
                        aeVar = delta.oscar();
                    }
                }
                if (aeVar != null) {
                    return aeVar;
                }
            }
            throw new IllegalStateException("not array: " + yVar);
        }
        alpha(67);
        throw null;
    }

    public final ae golf(int i4, y yVar, InterfaceC2472h interfaceC2472h) {
        if (i4 != 0) {
            if (yVar != null) {
                return kotlin.reflect.jvm.internal.impl.types.ab.bravo(kotlin.reflect.jvm.internal.impl.types.c.whiskey(interfaceC2472h), juliet("Array"), Collections.singletonList(new at(i4, yVar)));
            }
            alpha(79);
            throw null;
        }
        alpha(78);
        throw null;
    }

    public final ae hotel(B b2) {
        if (b2 != null) {
            return golf(1, b2, C2471g.alpha);
        }
        alpha(83);
        throw null;
    }

    public final InterfaceC2330f india(Ne.c cVar) {
        if (cVar != null) {
            InterfaceC2330f juliet = AbstractC2347w.juliet(kilo(), cVar);
            if (juliet != null) {
                return juliet;
            }
            alpha(13);
            throw null;
        }
        alpha(12);
        throw null;
    }

    public final InterfaceC2330f juliet(String str) {
        if (str != null) {
            return (InterfaceC2330f) this.charlie.invoke(Ne.f.echo(str));
        }
        alpha(14);
        throw null;
    }

    public final z kilo() {
        this.alpha.getClass();
        z zVar = this.alpha;
        if (zVar != null) {
            return zVar;
        }
        alpha(7);
        throw null;
    }

    public List lima() {
        List singletonList = Collections.singletonList(new C2177a(this.delta, kilo()));
        if (singletonList != null) {
            return singletonList;
        }
        alpha(5);
        throw null;
    }

    public final ae mike() {
        ae oscar = juliet("Nothing").oscar();
        if (oscar != null) {
            return oscar;
        }
        alpha(48);
        throw null;
    }

    public final ae november() {
        ae pink = echo().pink(true);
        if (pink != null) {
            return pink;
        }
        alpha(51);
        throw null;
    }

    public InterfaceC2520d oscar() {
        return C2517a.delta;
    }

    public final ae papa(j jVar) {
        if (jVar != null) {
            ae aeVar = (ae) ((C2119g) this.bravo.invoke()).alpha.get(jVar);
            if (aeVar != null) {
                return aeVar;
            }
            alpha(74);
            throw null;
        }
        alpha(73);
        throw null;
    }

    public final ae romeo(j jVar) {
        if (jVar != null) {
            ae oscar = juliet(jVar.alpha.bravo()).oscar();
            if (oscar != null) {
                return oscar;
            }
            alpha(54);
            throw null;
        }
        alpha(53);
        throw null;
    }

    public final ae tango() {
        ae oscar = juliet("String").oscar();
        if (oscar != null) {
            return oscar;
        }
        alpha(65);
        throw null;
    }

    public final InterfaceC2330f uniform(int i4) {
        return india(n.echo.charlie(Ne.f.echo(EnumC2181e.teal.purple + i4)));
    }

    public final ae victor() {
        ae oscar = juliet("Unit").oscar();
        if (oscar != null) {
            return oscar;
        }
        alpha(64);
        throw null;
    }
}
