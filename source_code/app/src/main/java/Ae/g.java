package Ae;

import Fe.x;
import Qe.l;
import gf.AbstractC1792g;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.az;
import kotlin.reflect.jvm.internal.impl.types.y;
import me.AbstractC2120h;
import me.r;
import pe.C2339o;
import pe.InterfaceC2317a;
import pe.InterfaceC2335k;
import pe.al;
import pe.an;
import pe.ao;
import qe.C2471g;
import qe.C2473i;
import qe.InterfaceC2472h;
import se.C2871u;
import se.ah;
import se.ai;
import se.aj;
import se.aq;
import ye.ab;

/* loaded from: classes2.dex */
public class g extends ah implements a {

    /* renamed from: t, reason: collision with root package name */
    public final boolean f63t;

    /* renamed from: u, reason: collision with root package name */
    public final Pair f64u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC2335k interfaceC2335k, InterfaceC2472h interfaceC2472h, int i4, C2339o c2339o, boolean z2, Ne.f fVar, an anVar, al alVar, int i5, boolean z10, Pair pair) {
        super(interfaceC2335k, alVar, interfaceC2472h, i4, c2339o, z2, fVar, i5, anVar, false, false, false, false, false);
        if (interfaceC2335k != null) {
            if (interfaceC2472h != null) {
                if (i4 != 0) {
                    if (c2339o != null) {
                        if (fVar != null) {
                            if (anVar != null) {
                                if (i5 != 0) {
                                    this.f63t = z10;
                                    this.f64u = pair;
                                    return;
                                }
                                D(6);
                                throw null;
                            }
                            D(5);
                            throw null;
                        }
                        D(4);
                        throw null;
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
        if (i4 != 21) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 21) {
            i5 = 3;
        } else {
            i5 = 2;
        }
        Object[] objArr = new Object[i5];
        switch (i4) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i4 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i4) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static g h0(InterfaceC2335k interfaceC2335k, Be.c cVar, C2339o c2339o, boolean z2, Ne.f fVar, ue.f fVar2, boolean z10) {
        if (interfaceC2335k != null) {
            if (fVar != null) {
                return new g(interfaceC2335k, cVar, 1, c2339o, z2, fVar, fVar2, null, 1, z10, null);
            }
            D(11);
            throw null;
        }
        D(7);
        throw null;
    }

    @Override // se.ah
    public final ah b0(InterfaceC2335k interfaceC2335k, int i4, C2339o c2339o, al alVar, int i5, Ne.f fVar) {
        ao aoVar = an.magenta;
        if (interfaceC2335k != null) {
            if (i4 != 0) {
                if (c2339o != null) {
                    if (i5 != 0) {
                        if (fVar != null) {
                            return new g(interfaceC2335k, getAnnotations(), i4, c2339o, this.white, fVar, aoVar, alVar, i5, this.f63t, this.f64u);
                        }
                        D(17);
                        throw null;
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
        D(13);
        throw null;
    }

    @Override // se.ar, pe.InterfaceC2326b
    public final boolean blue() {
        return false;
    }

    @Override // se.ah
    public final void f0(y yVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // Ae.a
    public final a i(y yVar, ArrayList arrayList, y yVar2, Pair pair) {
        al alpha;
        ai aiVar;
        aj ajVar;
        aj charlie;
        ai bravo;
        C2871u c2871u = null;
        if (yVar2 != null) {
            if (alpha() == this) {
                alpha = null;
            } else {
                alpha = alpha();
            }
            g gVar = new g(lima(), getAnnotations(), golf(), getVisibility(), this.white, getName(), echo(), alpha, november(), this.f63t, pair);
            ai aiVar2 = this.f13732p;
            if (aiVar2 != null) {
                InterfaceC2472h annotations = aiVar2.getAnnotations();
                int golf = aiVar2.golf();
                C2339o visibility = aiVar2.getVisibility();
                boolean z2 = aiVar2.teal;
                int november = november();
                if (alpha == null) {
                    bravo = null;
                } else {
                    bravo = alpha.bravo();
                }
                ai aiVar3 = new ai(gVar, annotations, golf, visibility, z2, aiVar2.white, aiVar2.f13715b, november, bravo, aiVar2.echo());
                aiVar3.e = aiVar2.e;
                aiVar3.f13736f = yVar2;
                aiVar = aiVar3;
            } else {
                aiVar = null;
            }
            aj ajVar2 = this.f13733q;
            if (ajVar2 != null) {
                InterfaceC2472h annotations2 = ajVar2.getAnnotations();
                int golf2 = ajVar2.golf();
                C2339o visibility2 = ajVar2.getVisibility();
                boolean z10 = ajVar2.teal;
                int november2 = november();
                if (alpha == null) {
                    charlie = null;
                } else {
                    charlie = alpha.charlie();
                }
                ajVar = new aj(gVar, annotations2, golf2, visibility2, z10, ajVar2.white, ajVar2.f13715b, november2, charlie, ajVar2.echo());
                ajVar.e = ajVar.e;
                aq aqVar = (aq) ajVar2.peach().get(0);
                if (aqVar != null) {
                    ajVar.f13738f = aqVar;
                } else {
                    aj.D(6);
                    throw null;
                }
            } else {
                ajVar = null;
            }
            gVar.d0(aiVar, ajVar, this.f13734r, this.f13735s);
            ?? r4 = this.f13718a;
            if (r4 != 0) {
                gVar.e0(this.yellow, r4);
            }
            gVar.r(mike());
            if (yVar != null) {
                c2871u = l.kilo(this, yVar, C2471g.alpha);
            }
            gVar.g0(yVar2, getTypeParameters(), this.f13729m, c2871u, CollectionsKt.emptyList());
            return gVar;
        }
        D(20);
        throw null;
    }

    @Override // se.ah, pe.InterfaceC2326b
    public final Object orange(InterfaceC2317a interfaceC2317a) {
        Pair pair = this.f64u;
        if (pair != null && ((InterfaceC2317a) pair.getFirst()).equals(interfaceC2317a)) {
            return pair.getSecond();
        }
        return null;
    }

    @Override // se.ah, pe.aw
    public final boolean whiskey() {
        y type = getType();
        if (this.f63t) {
            Intrinsics.echo(type, "type");
            if (((AbstractC2120h.blue(type) || r.alpha(type)) && !az.foxtrot(type)) || AbstractC2120h.bronze(type)) {
                C2473i c2473i = x.alpha;
                Ne.c ENHANCED_NULLABILITY_ANNOTATION = ab.papa;
                Intrinsics.delta(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
                if (!AbstractC1792g.uniform(type, ENHANCED_NULLABILITY_ANNOTATION) || AbstractC2120h.bronze(type)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
