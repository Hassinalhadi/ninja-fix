package je;

import ge.EnumC1782n;
import ge.InterfaceC1771c;
import ge.InterfaceC1783o;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import ke.InterfaceC2037e;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.IllegalCallableAccessException;
import pe.AbstractC2340p;
import pe.C2339o;
import pe.InterfaceC2328d;
import s6.AbstractC2759r5;
import t6.AbstractC3062u;

/* loaded from: classes2.dex */
public abstract class r implements InterfaceC1771c, P {
    public final T alpha = V.kilo(null, new C1976o(this, 1));
    public final T purple = V.kilo(null, new C1976o(this, 2));
    public final T red = V.kilo(null, new C1976o(this, 4));
    public final T silver = V.kilo(null, new C1976o(this, 5));
    public final T teal = V.kilo(null, new C1976o(this, 0));

    public static Object papa(N n5) {
        Class bravo = AbstractC3062u.bravo(AbstractC2759r5.bravo(n5));
        if (bravo.isArray()) {
            Object newInstance = Array.newInstance(bravo.getComponentType(), 0);
            Intrinsics.delta(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        throw new Q("Cannot instantiate the default empty array of type " + bravo.getSimpleName() + ", because it is not an array type");
    }

    @Override // ge.InterfaceC1771c
    public final Object call(Object... args) {
        Intrinsics.echo(args, "args");
        try {
            return quebec().call(args);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    @Override // ge.InterfaceC1771c
    public final Object callBy(Map args) {
        Nd.c[] cVarArr;
        int collectionSizeOrDefault;
        Object papa;
        Intrinsics.echo(args, "args");
        boolean z2 = false;
        if (uniform()) {
            List<InterfaceC1783o> parameters = getParameters();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (InterfaceC1783o interfaceC1783o : parameters) {
                if (args.containsKey(interfaceC1783o)) {
                    papa = args.get(interfaceC1783o);
                    if (papa == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + interfaceC1783o + ')');
                    }
                } else {
                    av avVar = (av) interfaceC1783o;
                    if (avVar.papa()) {
                        papa = null;
                    } else if (avVar.quebec()) {
                        papa = papa(avVar.oscar());
                    } else {
                        throw new IllegalArgumentException("No argument provided for a required parameter: " + avVar);
                    }
                }
                arrayList.add(papa);
            }
            InterfaceC2037e sierra = sierra();
            if (sierra != null) {
                try {
                    return sierra.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e) {
                    throw new IllegalCallableAccessException(e);
                }
            }
            throw new Q("This callable does not support a default call: " + tango());
        }
        List<InterfaceC1783o> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                InterfaceC2037e quebec = quebec();
                if (isSuspend()) {
                    cVarArr = new Nd.c[]{null};
                } else {
                    cVarArr = new Nd.c[0];
                }
                return quebec.call(cVarArr);
            } catch (IllegalAccessException e4) {
                throw new IllegalCallableAccessException(e4);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.teal.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        int i4 = 0;
        for (InterfaceC1783o interfaceC1783o2 : parameters2) {
            if (args.containsKey(interfaceC1783o2)) {
                objArr[((av) interfaceC1783o2).purple] = args.get(interfaceC1783o2);
            } else {
                av avVar2 = (av) interfaceC1783o2;
                if (avVar2.papa()) {
                    int i5 = (i4 / 32) + size;
                    Object obj = objArr[i5];
                    Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Int");
                    objArr[i5] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i4 % 32)));
                    z2 = true;
                } else if (!avVar2.quebec()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + avVar2);
                }
            }
            if (((av) interfaceC1783o2).red == EnumC1782n.red) {
                i4++;
            }
        }
        if (!z2) {
            try {
                InterfaceC2037e quebec2 = quebec();
                Object[] copyOf = Arrays.copyOf(objArr, size);
                Intrinsics.delta(copyOf, "copyOf(this, newSize)");
                return quebec2.call(copyOf);
            } catch (IllegalAccessException e5) {
                throw new IllegalCallableAccessException(e5);
            }
        }
        InterfaceC2037e sierra2 = sierra();
        if (sierra2 != null) {
            try {
                return sierra2.call(objArr);
            } catch (IllegalAccessException e10) {
                throw new IllegalCallableAccessException(e10);
            }
        }
        throw new Q("This callable does not support a default call: " + tango());
    }

    @Override // ge.InterfaceC1770b
    public final List getAnnotations() {
        Object invoke = this.alpha.invoke();
        Intrinsics.delta(invoke, "_annotations()");
        return (List) invoke;
    }

    @Override // ge.InterfaceC1771c
    public final List getParameters() {
        Object invoke = this.purple.invoke();
        Intrinsics.delta(invoke, "_parameters()");
        return (List) invoke;
    }

    @Override // ge.InterfaceC1771c
    public final ge.w getReturnType() {
        Object invoke = this.red.invoke();
        Intrinsics.delta(invoke, "_returnType()");
        return (ge.w) invoke;
    }

    @Override // ge.InterfaceC1771c
    public final List getTypeParameters() {
        Object invoke = this.silver.invoke();
        Intrinsics.delta(invoke, "_typeParameters()");
        return (List) invoke;
    }

    @Override // ge.InterfaceC1771c
    public final ge.ab getVisibility() {
        boolean areEqual;
        C2339o visibility = tango().getVisibility();
        Intrinsics.delta(visibility, "descriptor.visibility");
        Ne.c cVar = a0.alpha;
        if (Intrinsics.areEqual(visibility, AbstractC2340p.echo)) {
            return ge.ab.alpha;
        }
        if (Intrinsics.areEqual(visibility, AbstractC2340p.charlie)) {
            return ge.ab.purple;
        }
        if (Intrinsics.areEqual(visibility, AbstractC2340p.delta)) {
            return ge.ab.red;
        }
        if (Intrinsics.areEqual(visibility, AbstractC2340p.alpha)) {
            areEqual = true;
        } else {
            areEqual = Intrinsics.areEqual(visibility, AbstractC2340p.bravo);
        }
        if (areEqual) {
            return ge.ab.silver;
        }
        return null;
    }

    @Override // ge.InterfaceC1771c
    public final boolean isAbstract() {
        if (tango().golf() == 4) {
            return true;
        }
        return false;
    }

    @Override // ge.InterfaceC1771c
    public final boolean isFinal() {
        if (tango().golf() == 1) {
            return true;
        }
        return false;
    }

    @Override // ge.InterfaceC1771c
    public final boolean isOpen() {
        if (tango().golf() == 3) {
            return true;
        }
        return false;
    }

    public abstract InterfaceC2037e quebec();

    public abstract af romeo();

    public abstract InterfaceC2037e sierra();

    public abstract InterfaceC2328d tango();

    public final boolean uniform() {
        if (Intrinsics.areEqual(getName(), "<init>") && romeo().golf().isAnnotation()) {
            return true;
        }
        return false;
    }

    public abstract boolean victor();
}
