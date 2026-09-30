package ke;

import fe.C1715g;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import je.Q;
import je.a0;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2330f;
import pe.InterfaceC2334j;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import s6.AbstractC2662g6;
import s6.AbstractC2671h6;
import s6.J4;
import se.C2871u;
import se.aq;

/* loaded from: classes2.dex */
public final class u implements InterfaceC2037e {
    public final InterfaceC2037e alpha;
    public final boolean bravo;
    public final com.bumptech.glide.load.engine.h charlie;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if ((r10 instanceof ke.InterfaceC2036d) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(InterfaceC2037e interfaceC2037e, InterfaceC2345u descriptor, boolean z2) {
        Method declaredMethod;
        kotlin.reflect.jvm.internal.impl.types.y yVar;
        int i4;
        com.bumptech.glide.load.engine.h hVar;
        Method method;
        Class foxtrot;
        Intrinsics.echo(descriptor, "descriptor");
        this.alpha = interfaceC2037e;
        this.bravo = z2;
        kotlin.reflect.jvm.internal.impl.types.y returnType = descriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        Class foxtrot2 = AbstractC2671h6.foxtrot(returnType);
        if (foxtrot2 != null) {
            try {
                declaredMethod = foxtrot2.getDeclaredMethod("box-impl", AbstractC2671h6.delta(foxtrot2, descriptor).getReturnType());
                Intrinsics.delta(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            } catch (NoSuchMethodException unused) {
                throw new Q("No box method found in inline class: " + foxtrot2 + " (calling " + descriptor + ')');
            }
        } else {
            declaredMethod = null;
        }
        if (Qe.g.alpha(descriptor)) {
            hVar = new com.bumptech.glide.load.engine.h(C1715g.silver, new Method[0], declaredMethod);
        } else {
            int i5 = -1;
            if (!(interfaceC2037e instanceof r)) {
                if (!(descriptor instanceof InterfaceC2334j)) {
                    if (descriptor.a() != null && !(interfaceC2037e instanceof InterfaceC2036d)) {
                        InterfaceC2335k lima = descriptor.lima();
                        Intrinsics.delta(lima, "descriptor.containingDeclaration");
                        if (!Qe.g.bravo(lima)) {
                            i5 = 1;
                        }
                    }
                    i5 = 0;
                }
            }
            ArrayList arrayList = new ArrayList();
            C2871u g2 = descriptor.g();
            if (g2 != null) {
                yVar = g2.getType();
            } else {
                yVar = null;
            }
            if (yVar != null) {
                arrayList.add(yVar);
            } else if (descriptor instanceof InterfaceC2334j) {
                InterfaceC2330f zulu = ((InterfaceC2334j) descriptor).zulu();
                Intrinsics.delta(zulu, "descriptor.constructedClass");
                if (zulu.india()) {
                    InterfaceC2335k lima2 = zulu.lima();
                    Intrinsics.charlie(lima2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList.add(((InterfaceC2330f) lima2).oscar());
                }
            } else {
                InterfaceC2335k lima3 = descriptor.lima();
                Intrinsics.delta(lima3, "descriptor.containingDeclaration");
                if ((lima3 instanceof InterfaceC2330f) && Qe.g.bravo(lima3)) {
                    arrayList.add(((InterfaceC2330f) lima3).oscar());
                }
            }
            List peach = descriptor.peach();
            Intrinsics.delta(peach, "descriptor.valueParameters");
            Iterator it = peach.iterator();
            while (it.hasNext()) {
                arrayList.add(((aq) it.next()).getType());
            }
            if (this.bravo) {
                i4 = ((arrayList.size() + 31) / 32) + 1;
            } else {
                i4 = 0;
            }
            int size = arrayList.size() + i5 + (descriptor.isSuspend() ? 1 : 0) + i4;
            if (AbstractC2662g6.alpha(this) == size) {
                C1715g hotel = J4.hotel(Math.max(i5, 0), arrayList.size() + i5);
                Method[] methodArr = new Method[size];
                for (int i10 = 0; i10 < size; i10++) {
                    int i11 = hotel.alpha;
                    if (i10 <= hotel.purple && i11 <= i10 && (foxtrot = AbstractC2671h6.foxtrot((kotlin.reflect.jvm.internal.impl.types.y) arrayList.get(i10 - i5))) != null) {
                        method = AbstractC2671h6.delta(foxtrot, descriptor);
                    } else {
                        method = null;
                    }
                    methodArr[i10] = method;
                }
                hVar = new com.bumptech.glide.load.engine.h(hotel, methodArr, declaredMethod);
            } else {
                throw new Q("Inconsistent number of parameters in the descriptor and Java reflection object: " + AbstractC2662g6.alpha(this) + " != " + size + "\nCalling: " + descriptor + "\nParameter types: " + this.alpha.alpha() + ")\nDefault: " + this.bravo);
            }
        }
        this.charlie = hVar;
    }

    @Override // ke.InterfaceC2037e
    public final List alpha() {
        return this.alpha.alpha();
    }

    @Override // ke.InterfaceC2037e
    public final Member bravo() {
        return this.alpha.bravo();
    }

    @Override // ke.InterfaceC2037e
    public final Object call(Object[] args) {
        Object invoke;
        Intrinsics.echo(args, "args");
        com.bumptech.glide.load.engine.h hVar = this.charlie;
        C1715g c1715g = (C1715g) hVar.purple;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        Intrinsics.delta(copyOf, "copyOf(this, size)");
        int i4 = c1715g.alpha;
        int i5 = c1715g.purple;
        if (i4 <= i5) {
            while (true) {
                Method method = ((Method[]) hVar.red)[i4];
                Object obj = args[i4];
                if (method != null) {
                    if (obj != null) {
                        obj = method.invoke(obj, null);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        Intrinsics.delta(returnType, "method.returnType");
                        obj = a0.echo(returnType);
                    }
                }
                copyOf[i4] = obj;
                if (i4 == i5) {
                    break;
                }
                i4++;
            }
        }
        Object call = this.alpha.call(copyOf);
        Method method2 = (Method) hVar.silver;
        if (method2 != null && (invoke = method2.invoke(null, call)) != null) {
            return invoke;
        }
        return call;
    }

    @Override // ke.InterfaceC2037e
    public final Type getReturnType() {
        return this.alpha.getReturnType();
    }
}
