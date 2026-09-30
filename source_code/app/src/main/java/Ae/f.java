package Ae;

import A0.z;
import Qe.l;
import com.google.android.gms.internal.measurement.AbstractC1380u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ax;
import kotlin.reflect.jvm.internal.impl.types.y;
import kotlin.text.Regex;
import lf.AbstractC2081g;
import lf.C2080f;
import lf.C2085k;
import lf.InterfaceC2079e;
import lf.v;
import pe.C2339o;
import pe.InterfaceC2317a;
import pe.InterfaceC2335k;
import pe.InterfaceC2345u;
import pe.an;
import qe.C2471g;
import qe.InterfaceC2472h;
import se.AbstractC2870t;
import se.C2869s;
import se.C2871u;
import se.ak;

/* loaded from: classes2.dex */
public final class f extends ak implements a {

    /* renamed from: y, reason: collision with root package name */
    public static final e f59y = new Object();

    /* renamed from: z, reason: collision with root package name */
    public static final e f60z = new Object();

    /* renamed from: w, reason: collision with root package name */
    public int f61w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f62x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC2335k interfaceC2335k, ak akVar, InterfaceC2472h interfaceC2472h, Ne.f fVar, int i4, an anVar, boolean z2) {
        super(interfaceC2335k, akVar, interfaceC2472h, fVar, i4, anVar);
        if (interfaceC2335k != null) {
            if (interfaceC2472h != null) {
                if (fVar != null) {
                    if (i4 != 0) {
                        this.f61w = 0;
                        this.f62x = z2;
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
        if (i4 != 13 && i4 != 18 && i4 != 21) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 13 && i4 != 18 && i4 != 21) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i4 != 13) {
            if (i4 != 18) {
                if (i4 != 21) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                } else {
                    objArr[1] = "enhance";
                }
            } else {
                objArr[1] = "createSubstitutedCopy";
            }
        } else {
            objArr[1] = "initialize";
        }
        switch (i4) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 13 || i4 == 18 || i4 == 21) {
            throw new IllegalStateException(format);
        }
    }

    public static f o0(InterfaceC2335k interfaceC2335k, Be.c cVar, Ne.f fVar, ue.f fVar2, boolean z2) {
        if (interfaceC2335k != null) {
            if (fVar != null) {
                return new f(interfaceC2335k, null, cVar, fVar, 1, fVar2, z2);
            }
            D(7);
            throw null;
        }
        D(5);
        throw null;
    }

    @Override // se.ak, se.AbstractC2870t
    public final AbstractC2870t b0(int i4, Ne.f fVar, InterfaceC2335k interfaceC2335k, InterfaceC2345u interfaceC2345u, an anVar, InterfaceC2472h interfaceC2472h) {
        if (interfaceC2335k != null) {
            if (i4 != 0) {
                if (interfaceC2472h != null) {
                    ak akVar = (ak) interfaceC2345u;
                    if (fVar == null) {
                        fVar = getName();
                    }
                    f fVar2 = new f(interfaceC2335k, akVar, interfaceC2472h, fVar, i4, anVar, this.f62x);
                    int i5 = this.f61w;
                    boolean z2 = false;
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                if (i5 != 4) {
                                    throw null;
                                }
                            }
                        }
                        z2 = true;
                    }
                    fVar2.p0(z2, z.delta(i5));
                    return fVar2;
                }
                D(16);
                throw null;
            }
            D(15);
            throw null;
        }
        D(14);
        throw null;
    }

    @Override // se.AbstractC2870t, pe.InterfaceC2326b
    public final boolean blue() {
        return z.delta(this.f61w);
    }

    @Override // Ae.a
    public final a i(y yVar, ArrayList arrayList, y yVar2, Pair pair) {
        C2871u kilo;
        if (yVar2 != null) {
            ArrayList alpha = AbstractC1380u1.alpha(arrayList, peach(), this);
            if (yVar == null) {
                kilo = null;
            } else {
                kilo = l.kilo(this, yVar, C2471g.alpha);
            }
            C2869s f02 = f0(ax.bravo);
            f02.yellow = alpha;
            f02.f13763d = yVar2;
            f02.f13761b = kilo;
            f02.f13767i = true;
            f02.f13766h = true;
            f fVar = (f) f02.f13775q.c0(f02);
            if (pair != null) {
                fVar.g0((InterfaceC2317a) pair.getFirst(), pair.getSecond());
            }
            if (fVar != null) {
                return fVar;
            }
            D(21);
            throw null;
        }
        D(20);
        throw null;
    }

    @Override // se.ak
    public final ak n0(C2871u c2871u, C2871u c2871u2, List list, List list2, List list3, y yVar, int i4, C2339o c2339o, t tVar) {
        AbstractC2081g abstractC2081g;
        if (list != null) {
            if (list2 != null) {
                if (list3 != null) {
                    if (c2339o != null) {
                        super.n0(c2871u, c2871u2, list, list2, list3, yVar, i4, c2339o, tVar);
                        for (C2085k c2085k : v.bravo) {
                            c2085k.getClass();
                            Ne.f fVar = c2085k.alpha;
                            if (fVar == null || Intrinsics.areEqual(getName(), fVar)) {
                                Regex regex = c2085k.bravo;
                                if (regex != null) {
                                    String bravo = getName().bravo();
                                    Intrinsics.delta(bravo, "functionDescriptor.name.asString()");
                                    if (!regex.echo(bravo)) {
                                        continue;
                                    }
                                }
                                Collection collection = c2085k.charlie;
                                if (collection == null || collection.contains(getName())) {
                                    InterfaceC2079e[] interfaceC2079eArr = c2085k.echo;
                                    int length = interfaceC2079eArr.length;
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < length) {
                                            if (interfaceC2079eArr[i5].charlie(this) != null) {
                                                abstractC2081g = new AbstractC2081g(false);
                                                break;
                                            }
                                            i5++;
                                        } else if (((String) c2085k.delta.invoke(this)) != null) {
                                            abstractC2081g = new AbstractC2081g(false);
                                        } else {
                                            abstractC2081g = C2080f.charlie;
                                        }
                                    }
                                    this.f13780f = abstractC2081g.alpha;
                                    return this;
                                }
                            }
                        }
                        abstractC2081g = C2080f.bravo;
                        this.f13780f = abstractC2081g.alpha;
                        return this;
                    }
                    D(12);
                    throw null;
                }
                D(11);
                throw null;
            }
            D(10);
            throw null;
        }
        D(9);
        throw null;
    }

    public final void p0(boolean z2, boolean z10) {
        int i4;
        if (z2) {
            if (z10) {
                i4 = 4;
            } else {
                i4 = 2;
            }
        } else if (z10) {
            i4 = 3;
        } else {
            i4 = 1;
        }
        this.f61w = i4;
    }
}
