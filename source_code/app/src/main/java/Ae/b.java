package Ae;

import Qe.l;
import com.google.android.gms.internal.measurement.AbstractC1380u1;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.AbstractC2327c;
import pe.InterfaceC2317a;
import pe.InterfaceC2330f;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import pe.an;
import qe.C2471g;
import qe.InterfaceC2472h;
import se.AbstractC2870t;
import se.C2859i;
import se.C2871u;

/* loaded from: classes2.dex */
public final class b extends C2859i implements a {

    /* renamed from: x, reason: collision with root package name */
    public Boolean f57x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f58y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC2330f interfaceC2330f, b bVar, InterfaceC2472h interfaceC2472h, boolean z2, int i4, an anVar) {
        super(interfaceC2330f, bVar, interfaceC2472h, z2, i4, anVar);
        if (interfaceC2330f != null) {
            if (interfaceC2472h != null) {
                if (i4 != 0) {
                    if (anVar != null) {
                        this.f57x = null;
                        this.f58y = null;
                        return;
                    }
                    D(3);
                    throw null;
                }
                D(2);
                throw null;
            }
            D(1);
            throw null;
        }
        D(0);
        throw null;
    }

    public static /* synthetic */ void D(int i4) {
        String str;
        int i5;
        if (i4 != 11 && i4 != 18) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 11 && i4 != 18) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i4 != 11) {
            if (i4 != 18) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
            } else {
                objArr[1] = "enhance";
            }
        } else {
            objArr[1] = "createSubstitutedCopy";
        }
        switch (i4) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 11 || i4 == 18) {
            throw new IllegalStateException(format);
        }
    }

    public static b q0(InterfaceC2330f interfaceC2330f, InterfaceC2472h interfaceC2472h, boolean z2, ue.f fVar) {
        if (interfaceC2330f != null) {
            return new b(interfaceC2330f, null, interfaceC2472h, z2, 1, fVar);
        }
        D(4);
        throw null;
    }

    @Override // se.C2859i, se.AbstractC2870t
    public final /* bridge */ /* synthetic */ AbstractC2870t b0(int i4, Ne.f fVar, InterfaceC2335k interfaceC2335k, InterfaceC2345u interfaceC2345u, an anVar, InterfaceC2472h interfaceC2472h) {
        return r0(interfaceC2335k, interfaceC2345u, i4, interfaceC2472h, anVar);
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2326b
    public final boolean blue() {
        return this.f58y.booleanValue();
    }

    @Override // se.AbstractC2870t
    public final void h0(boolean z2) {
        this.f57x = Boolean.valueOf(z2);
    }

    @Override // Ae.a
    public final a i(y yVar, ArrayList arrayList, y yVar2, Pair pair) {
        C2871u c2871u = null;
        if (yVar2 != null) {
            b r02 = r0(lima(), null, november(), getAnnotations(), echo());
            if (yVar != null) {
                c2871u = l.kilo(r02, yVar, C2471g.alpha);
            }
            r02.e0(c2871u, this.f13778c, CollectionsKt.emptyList(), getTypeParameters(), AbstractC1380u1.alpha(arrayList, peach(), r02), yVar2, golf(), getVisibility());
            if (pair != null) {
                r02.g0((InterfaceC2317a) pair.getFirst(), pair.getSecond());
            }
            return r02;
        }
        D(17);
        throw null;
    }

    @Override // se.AbstractC2870t
    public final void i0(boolean z2) {
        this.f58y = Boolean.valueOf(z2);
    }

    @Override // se.C2859i
    /* renamed from: k0 */
    public final /* bridge */ /* synthetic */ C2859i b0(int i4, Ne.f fVar, InterfaceC2335k interfaceC2335k, InterfaceC2345u interfaceC2345u, an anVar, InterfaceC2472h interfaceC2472h) {
        return r0(interfaceC2335k, interfaceC2345u, i4, interfaceC2472h, anVar);
    }

    public final b r0(InterfaceC2335k interfaceC2335k, InterfaceC2345u interfaceC2345u, int i4, InterfaceC2472h interfaceC2472h, an anVar) {
        if (interfaceC2335k != null) {
            if (i4 != 0) {
                if (interfaceC2472h != null) {
                    if (anVar != null) {
                        if (i4 != 1 && i4 != 4) {
                            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC2335k + "\nkind: " + AbstractC2327c.bronze(i4));
                        }
                        InterfaceC2330f interfaceC2330f = (InterfaceC2330f) interfaceC2335k;
                        b bVar = (b) interfaceC2345u;
                        if (i4 != 0) {
                            b bVar2 = new b(interfaceC2330f, bVar, interfaceC2472h, this.f13752w, i4, anVar);
                            Boolean bool = this.f57x;
                            bool.getClass();
                            bVar2.f57x = bool;
                            Boolean bool2 = this.f58y;
                            bool2.getClass();
                            bVar2.f58y = bool2;
                            return bVar2;
                        }
                        D(13);
                        throw null;
                    }
                    D(10);
                    throw null;
                }
                D(9);
                throw null;
            }
            D(8);
            throw null;
        }
        D(7);
        throw null;
    }
}
