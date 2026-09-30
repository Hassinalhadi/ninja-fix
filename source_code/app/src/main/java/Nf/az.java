package Nf;

import ge.InterfaceC1772d;
import ge.InterfaceC1773e;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pe.AbstractC2327c;
import s6.AbstractC2716m6;
import s6.J4;
import t6.AbstractC3062u;

/* loaded from: classes2.dex */
public abstract class az {
    public static final SerialDescriptor[] alpha = new SerialDescriptor[0];
    public static final KSerializer[] bravo = new KSerializer[0];
    public static final Object charlie = new Object();

    public static final af alpha(String str, KSerializer kSerializer) {
        return new af(str, new ag(kSerializer));
    }

    public static final Set bravo(SerialDescriptor serialDescriptor) {
        Intrinsics.echo(serialDescriptor, "<this>");
        if (serialDescriptor instanceof InterfaceC0254l) {
            return ((InterfaceC0254l) serialDescriptor).alpha();
        }
        HashSet hashSet = new HashSet(serialDescriptor.romeo());
        int romeo = serialDescriptor.romeo();
        for (int i4 = 0; i4 < romeo; i4++) {
            hashSet.add(serialDescriptor.sierra(i4));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] charlie(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list != null && (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) != null) {
            return serialDescriptorArr;
        }
        return alpha;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:58|(1:(2:60|(1:63)(1:62))(2:111|112))|(5:106|107|108|(8:80|81|(1:(3:83|(1:101)(1:(1:89)(2:86|87))|88)(2:102|(1:104)))|90|(1:100)(1:94)|95|(1:97)|99)|(1:79)(5:70|(4:72|(1:74)|76|77)|78|76|77))|65|(1:67)|80|81|(2:(0)(0)|88)|90|(1:92)|100|95|(0)|99|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0112, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00c8, code lost:
    
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ce, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1.bravo(r0), r1.bravo(Jf.b.class)) != false) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0178 A[Catch: NoSuchFieldException -> 0x01a7, TryCatch #0 {NoSuchFieldException -> 0x01a7, blocks: (B:81:0x016b, B:83:0x0178, B:92:0x0194, B:94:0x019a, B:95:0x01a0, B:97:0x01a4, B:88:0x018c), top: B:80:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a4 A[Catch: NoSuchFieldException -> 0x01a7, TRY_LEAVE, TryCatch #0 {NoSuchFieldException -> 0x01a7, blocks: (B:81:0x016b, B:83:0x0178, B:92:0x0194, B:94:0x019a, B:95:0x01a0, B:97:0x01a4, B:88:0x018c), top: B:80:0x016b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer delta(InterfaceC1772d interfaceC1772d, KSerializer... args) {
        Object obj;
        KSerializer foxtrot;
        KSerializer kSerializer;
        Class<?> cls;
        Object obj2;
        KSerializer kSerializer2;
        int length;
        Class<?> cls2;
        int i4;
        Object obj3;
        Field field;
        Intrinsics.echo(interfaceC1772d, "<this>");
        Intrinsics.echo(args, "args");
        Class bravo2 = AbstractC3062u.bravo(interfaceC1772d);
        KSerializer[] args2 = (KSerializer[]) Arrays.copyOf(args, args.length);
        Intrinsics.echo(args2, "args");
        if (bravo2.isEnum() && bravo2.getAnnotation(Jf.e.class) == null && bravo2.getAnnotation(Jf.a.class) == null) {
            Object[] enumConstants = bravo2.getEnumConstants();
            String canonicalName = bravo2.getCanonicalName();
            Intrinsics.delta(canonicalName, "getCanonicalName(...)");
            Intrinsics.charlie(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new C0266y(canonicalName, (Enum[]) enumConstants);
        }
        KSerializer[] kSerializerArr = (KSerializer[]) Arrays.copyOf(args2, args2.length);
        Jf.b bVar = null;
        try {
            Field declaredField = bravo2.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        if (obj == null) {
            foxtrot = null;
        } else {
            foxtrot = foxtrot(obj, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        }
        if (foxtrot != null) {
            return foxtrot;
        }
        String canonicalName2 = bravo2.getCanonicalName();
        if (canonicalName2 != null && !kotlin.text.r.quebec(canonicalName2, "java.", false) && !kotlin.text.r.quebec(canonicalName2, "kotlin.", false)) {
            Field[] declaredFields = bravo2.getDeclaredFields();
            Intrinsics.delta(declaredFields, "getDeclaredFields(...)");
            int length2 = declaredFields.length;
            int i5 = 0;
            boolean z2 = false;
            Field field2 = null;
            while (true) {
                if (i5 < length2) {
                    Field field3 = declaredFields[i5];
                    if (Intrinsics.areEqual(field3.getName(), "INSTANCE") && Intrinsics.areEqual(field3.getType(), bravo2) && Modifier.isStatic(field3.getModifiers())) {
                        if (z2) {
                            break;
                        }
                        z2 = true;
                        field2 = field3;
                    }
                    i5++;
                }
            }
            field2 = null;
            if (field2 != null) {
                Object obj4 = field2.get(null);
                Method[] methods = bravo2.getMethods();
                Intrinsics.delta(methods, "getMethods(...)");
                int length3 = methods.length;
                int i10 = 0;
                boolean z10 = false;
                Method method = null;
                while (true) {
                    if (i10 < length3) {
                        Method method2 = methods[i10];
                        if (Intrinsics.areEqual(method2.getName(), "serializer")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            Intrinsics.delta(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0 && Intrinsics.areEqual(method2.getReturnType(), KSerializer.class)) {
                                if (z10) {
                                    break;
                                }
                                z10 = true;
                                method = method2;
                            }
                        }
                        i10++;
                    }
                }
                method = null;
                if (method != null) {
                    Object invoke = method.invoke(obj4, null);
                    if (invoke instanceof KSerializer) {
                        kSerializer = (KSerializer) invoke;
                        if (kSerializer == null) {
                            return kSerializer;
                        }
                        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(args2, args2.length);
                        Class<?>[] declaredClasses = bravo2.getDeclaredClasses();
                        Intrinsics.delta(declaredClasses, "getDeclaredClasses(...)");
                        int length4 = declaredClasses.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length4) {
                                cls = declaredClasses[i11];
                                if (cls.getAnnotation(at.class) != null) {
                                    break;
                                }
                                i11++;
                            } else {
                                cls = null;
                                break;
                            }
                        }
                        if (cls != null) {
                            try {
                                Field declaredField2 = bravo2.getDeclaredField(cls.getSimpleName());
                                declaredField2.setAccessible(true);
                                obj2 = declaredField2.get(null);
                            } catch (Throwable unused2) {
                            }
                            if (obj2 != null || (kSerializer2 = foxtrot(obj2, (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length))) == null) {
                                Class<?>[] declaredClasses2 = bravo2.getDeclaredClasses();
                                Intrinsics.delta(declaredClasses2, "getDeclaredClasses(...)");
                                length = declaredClasses2.length;
                                cls2 = null;
                                i4 = 0;
                                boolean z11 = false;
                                while (true) {
                                    if (i4 >= length) {
                                        Class<?> cls3 = declaredClasses2[i4];
                                        if (Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                                            if (z11) {
                                                break;
                                            }
                                            z11 = true;
                                            cls2 = cls3;
                                        }
                                        i4++;
                                    } else if (!z11) {
                                    }
                                }
                                cls2 = null;
                                if (cls2 == null && (field = cls2.getField("INSTANCE")) != null) {
                                    obj3 = field.get(null);
                                } else {
                                    obj3 = null;
                                }
                                if (obj3 instanceof KSerializer) {
                                    kSerializer2 = (KSerializer) obj3;
                                }
                                kSerializer2 = null;
                            }
                            if (kSerializer2 != null) {
                                if (bravo2.getAnnotation(Jf.a.class) == null) {
                                    Jf.e eVar = (Jf.e) bravo2.getAnnotation(Jf.e.class);
                                    if (eVar != null) {
                                        Class with = eVar.with();
                                        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
                                    }
                                    return bVar;
                                }
                                bVar = new Jf.b(AbstractC3062u.echo(bravo2));
                                return bVar;
                            }
                            return kSerializer2;
                        }
                        obj2 = null;
                        if (obj2 != null) {
                        }
                        Class<?>[] declaredClasses22 = bravo2.getDeclaredClasses();
                        Intrinsics.delta(declaredClasses22, "getDeclaredClasses(...)");
                        length = declaredClasses22.length;
                        cls2 = null;
                        i4 = 0;
                        boolean z112 = false;
                        while (true) {
                            if (i4 >= length) {
                            }
                            i4++;
                        }
                        cls2 = null;
                        if (cls2 == null) {
                        }
                        obj3 = null;
                        if (obj3 instanceof KSerializer) {
                        }
                        kSerializer2 = null;
                        if (kSerializer2 != null) {
                        }
                    }
                }
            }
        }
        kSerializer = null;
        if (kSerializer == null) {
        }
    }

    public static final int echo(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        boolean z2;
        boolean z10;
        int i4;
        Intrinsics.echo(serialDescriptor, "<this>");
        Intrinsics.echo(typeParams, "typeParams");
        int hashCode = (serialDescriptor.oscar().hashCode() * 31) + Arrays.hashCode(typeParams);
        int romeo = serialDescriptor.romeo();
        int i5 = 1;
        while (true) {
            int i10 = 0;
            if (romeo > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            int i11 = romeo - 1;
            int i12 = i5 * 31;
            String oscar = serialDescriptor.uniform(serialDescriptor.romeo() - romeo).oscar();
            if (oscar != null) {
                i10 = oscar.hashCode();
            }
            i5 = i12 + i10;
            romeo = i11;
        }
        int romeo2 = serialDescriptor.romeo();
        int i13 = 1;
        while (true) {
            if (romeo2 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i14 = romeo2 - 1;
                int i15 = i13 * 31;
                AbstractC2716m6 november = serialDescriptor.uniform(serialDescriptor.romeo() - romeo2).november();
                if (november != null) {
                    i4 = november.hashCode();
                } else {
                    i4 = 0;
                }
                i13 = i15 + i4;
                romeo2 = i14;
            } else {
                return (((hashCode * 31) + i5) * 31) + i13;
            }
        }
    }

    public static final KSerializer foxtrot(Object obj, KSerializer... kSerializerArr) {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i4 = 0; i4 < length; i4++) {
                    clsArr2[i4] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e;
        }
    }

    public static final boolean golf(InterfaceC1772d interfaceC1772d) {
        Intrinsics.echo(interfaceC1772d, "<this>");
        return AbstractC3062u.bravo(interfaceC1772d).isInterface();
    }

    public static final InterfaceC1772d hotel(ge.w wVar) {
        InterfaceC1773e foxtrot = wVar.foxtrot();
        if (foxtrot instanceof InterfaceC1772d) {
            return (InterfaceC1772d) foxtrot;
        }
        if (foxtrot instanceof ge.x) {
            throw new IllegalArgumentException("Captured type parameter " + foxtrot + " from generic non-reified function. Such functionality cannot be supported because " + foxtrot + " is erased, either specify serializer explicitly or make calling function inline with reified " + foxtrot + '.');
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + foxtrot);
    }

    public static final void india(InterfaceC1772d interfaceC1772d) {
        Intrinsics.echo(interfaceC1772d, "<this>");
        String kilo = interfaceC1772d.kilo();
        if (kilo == null) {
            kilo = "<local class name not available>";
        }
        throw new SerializationException(ao.ad.gray("Serializer for class '", kilo, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final void juliet(int i4, int i5, SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i10 = (~i4) & i5;
        for (int i11 = 0; i11 < 32; i11++) {
            if ((i10 & 1) != 0) {
                arrayList.add(descriptor.sierra(i11));
            }
            i10 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.oscar());
    }

    public static final void kilo(InterfaceC1772d baseClass, String str) {
        String sb2;
        Intrinsics.echo(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.kilo() + '\'';
        if (str == null) {
            sb2 = AbstractC2327c.victor('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder india = av.q.india("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            Q0.c.azure(india, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            india.append(baseClass.kilo());
            india.append("' has to be sealed and '@Serializable'.");
            sb2 = india.toString();
        }
        throw new SerializationException(sb2);
    }

    public static final String lima(SerialDescriptor serialDescriptor) {
        return CollectionsKt.maroon(J4.hotel(0, serialDescriptor.romeo()), ", ", serialDescriptor.oscar() + '(', ")", new C(0, serialDescriptor), 24);
    }
}
