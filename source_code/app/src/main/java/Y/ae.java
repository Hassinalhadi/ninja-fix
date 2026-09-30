package Y;

import C1.av;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import t0.C2946x;

/* loaded from: classes3.dex */
public abstract class ae {
    public static final boolean alpha(Z.c cVar, Z.c cVar2, Z.c cVar3, int i4) {
        float f5;
        float f10;
        if (!bravo(i4, cVar3, cVar) && bravo(i4, cVar2, cVar)) {
            float f11 = cVar3.bravo;
            float f12 = cVar3.delta;
            float f13 = cVar3.alpha;
            float f14 = cVar3.charlie;
            float f15 = cVar.delta;
            float f16 = cVar.bravo;
            float f17 = cVar.charlie;
            float f18 = cVar.alpha;
            if (i4 == 3) {
                if (f18 < f14) {
                    return true;
                }
            } else if (i4 == 4) {
                if (f17 > f13) {
                    return true;
                }
            } else if (i4 == 5) {
                if (f16 < f12) {
                    return true;
                }
            } else if (i4 == 6) {
                if (f15 > f11) {
                    return true;
                }
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (i4 != 3 && i4 != 4) {
                if (i4 == 3) {
                    f5 = f18 - cVar2.charlie;
                } else if (i4 == 4) {
                    f5 = cVar2.alpha - f17;
                } else if (i4 == 5) {
                    f5 = f16 - cVar2.delta;
                } else if (i4 == 6) {
                    f5 = cVar2.bravo - f15;
                } else {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                if (f5 < 0.0f) {
                    f5 = 0.0f;
                }
                if (i4 == 3) {
                    f10 = f18 - f13;
                } else if (i4 == 4) {
                    f10 = f14 - f17;
                } else if (i4 == 5) {
                    f10 = f16 - f11;
                } else if (i4 == 6) {
                    f10 = f12 - f15;
                } else {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                if (f10 < 1.0f) {
                    f10 = 1.0f;
                }
                if (f5 < f10) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean bravo(int i4, Z.c cVar, Z.c cVar2) {
        if (i4 == 3 || i4 == 4) {
            if (cVar.delta > cVar2.bravo && cVar.bravo < cVar2.delta) {
                return true;
            }
            return false;
        }
        if (i4 == 5 || i4 == 6) {
            if (cVar.charlie > cVar2.alpha && cVar.alpha < cVar2.charlie) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final void charlie(aa aaVar, J.e eVar) {
        if (!aaVar.getNode().isAttached()) {
            AbstractC2264a.bravo("visitChildren called on an unattached node");
        }
        J.e eVar2 = new J.e(new T.r[16]);
        T.r child$ui_release = aaVar.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            AbstractC2555o.alpha(eVar2, aaVar.getNode());
        } else {
            eVar2.bravo(child$ui_release);
        }
        while (true) {
            int i4 = eVar2.red;
            if (i4 != 0) {
                T.r rVar = (T.r) eVar2.mike(i4 - 1);
                if ((rVar.getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) == 0) {
                    AbstractC2555o.alpha(eVar2, rVar);
                } else {
                    while (true) {
                        if (rVar == null) {
                            break;
                        }
                        if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                            J.e eVar3 = null;
                            while (rVar != null) {
                                if (rVar instanceof aa) {
                                    aa aaVar2 = (aa) rVar;
                                    if (aaVar2.isAttached() && !AbstractC2555o.golf(aaVar2).f13282I) {
                                        if (aaVar2.c().alpha) {
                                            eVar.bravo(aaVar2);
                                        } else {
                                            charlie(aaVar2, eVar);
                                        }
                                    }
                                } else if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (rVar instanceof AbstractC2556p)) {
                                    int i5 = 0;
                                    for (T.r rVar2 = ((AbstractC2556p) rVar).purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                                        if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                rVar = rVar2;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new J.e(new T.r[16]);
                                                }
                                                if (rVar != null) {
                                                    eVar3.bravo(rVar);
                                                    rVar = null;
                                                }
                                                eVar3.bravo(rVar2);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                rVar = AbstractC2555o.bravo(eVar3);
                            }
                        } else {
                            rVar = rVar.getChild$ui_release();
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public static final aa delta(J.e eVar, Z.c cVar, int i4) {
        Z.c golf;
        if (i4 == 3) {
            golf = cVar.golf((cVar.charlie - cVar.alpha) + 1, 0.0f);
        } else if (i4 == 4) {
            golf = cVar.golf(-((cVar.charlie - cVar.alpha) + 1), 0.0f);
        } else if (i4 == 5) {
            golf = cVar.golf(0.0f, (cVar.delta - cVar.bravo) + 1);
        } else if (i4 == 6) {
            golf = cVar.golf(0.0f, -((cVar.delta - cVar.bravo) + 1));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        Object[] objArr = eVar.alpha;
        int i5 = eVar.red;
        aa aaVar = null;
        for (int i10 = 0; i10 < i5; i10++) {
            aa aaVar2 = (aa) objArr[i10];
            if (g.hotel(aaVar2)) {
                Z.c delta = g.delta(aaVar2);
                if (golf(delta, golf, cVar, i4)) {
                    aaVar = aaVar2;
                    golf = delta;
                }
            }
        }
        return aaVar;
    }

    public static final boolean echo(aa aaVar, int i4, Function1 function1) {
        Z.c cVar;
        Object obj;
        J.e eVar = new J.e(new aa[16]);
        charlie(aaVar, eVar);
        int i5 = eVar.red;
        if (i5 <= 1) {
            if (i5 == 0) {
                obj = null;
            } else {
                obj = eVar.alpha[0];
            }
            aa aaVar2 = (aa) obj;
            if (aaVar2 != null) {
                return ((Boolean) function1.invoke(aaVar2)).booleanValue();
            }
        } else {
            if (i4 == 7) {
                i4 = 4;
            }
            if (i4 == 4 || i4 == 6) {
                Z.c delta = g.delta(aaVar);
                float f5 = delta.bravo;
                float f10 = delta.alpha;
                cVar = new Z.c(f10, f5, f10, f5);
            } else if (i4 == 3 || i4 == 5) {
                Z.c delta2 = g.delta(aaVar);
                float f11 = delta2.delta;
                float f12 = delta2.charlie;
                cVar = new Z.c(f12, f11, f12, f11);
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            aa delta3 = delta(eVar, cVar, i4);
            if (delta3 != null) {
                return ((Boolean) function1.invoke(delta3)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean foxtrot(int i4, av avVar, aa aaVar, Z.c cVar) {
        if (juliet(i4, avVar, aaVar, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) g.lima(aaVar, i4, new ad(((n) ((C2946x) AbstractC2555o.hotel(aaVar)).getFocusOwner()).hotel, aaVar, cVar, i4, avVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean golf(Z.c cVar, Z.c cVar2, Z.c cVar3, int i4) {
        if (hotel(i4, cVar, cVar3)) {
            if (hotel(i4, cVar2, cVar3) && !alpha(cVar3, cVar, cVar2, i4)) {
                if (!alpha(cVar3, cVar2, cVar, i4) && india(i4, cVar3, cVar) < india(i4, cVar3, cVar2)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean hotel(int i4, Z.c cVar, Z.c cVar2) {
        float f5 = cVar.alpha;
        float f10 = cVar.charlie;
        if (i4 == 3) {
            float f11 = cVar2.charlie;
            float f12 = cVar2.alpha;
            if ((f11 > f10 || f12 >= f10) && f12 > f5) {
                return true;
            }
            return false;
        }
        if (i4 == 4) {
            float f13 = cVar2.alpha;
            float f14 = cVar2.charlie;
            if ((f13 < f5 || f14 <= f5) && f14 < f10) {
                return true;
            }
            return false;
        }
        float f15 = cVar.bravo;
        float f16 = cVar.delta;
        if (i4 == 5) {
            float f17 = cVar2.delta;
            float f18 = cVar2.bravo;
            if ((f17 > f16 || f18 >= f16) && f18 > f15) {
                return true;
            }
            return false;
        }
        if (i4 == 6) {
            float f19 = cVar2.bravo;
            float f20 = cVar2.delta;
            if ((f19 < f15 || f20 <= f15) && f20 < f16) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final long india(int i4, Z.c cVar, Z.c cVar2) {
        float f5;
        float f10;
        float f11 = cVar2.bravo;
        float f12 = cVar2.delta;
        float f13 = cVar2.alpha;
        float f14 = cVar2.charlie;
        if (i4 == 3) {
            f5 = cVar.alpha - f14;
        } else if (i4 == 4) {
            f5 = f13 - cVar.charlie;
        } else if (i4 == 5) {
            f5 = cVar.bravo - f12;
        } else if (i4 == 6) {
            f5 = f11 - cVar.delta;
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        long j5 = f5;
        if (i4 == 3 || i4 == 4) {
            float f15 = cVar.delta;
            float f16 = cVar.bravo;
            float f17 = 2;
            f10 = (((f15 - f16) / f17) + f16) - (((f12 - f11) / f17) + f11);
        } else if (i4 == 5 || i4 == 6) {
            float f18 = cVar.charlie;
            float f19 = cVar.alpha;
            float f20 = 2;
            f10 = (((f18 - f19) / f20) + f19) - (((f14 - f13) / f20) + f13);
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        long j6 = f10;
        return (j6 * j6) + (13 * j5 * j5);
    }

    public static final boolean juliet(int i4, av avVar, aa aaVar, Z.c cVar) {
        aa delta;
        J.e eVar = new J.e(new aa[16]);
        if (!aaVar.getNode().isAttached()) {
            AbstractC2264a.bravo("visitChildren called on an unattached node");
        }
        J.e eVar2 = new J.e(new T.r[16]);
        T.r child$ui_release = aaVar.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            AbstractC2555o.alpha(eVar2, aaVar.getNode());
        } else {
            eVar2.bravo(child$ui_release);
        }
        while (true) {
            int i5 = eVar2.red;
            if (i5 == 0) {
                break;
            }
            T.r rVar = (T.r) eVar2.mike(i5 - 1);
            if ((rVar.getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) == 0) {
                AbstractC2555o.alpha(eVar2, rVar);
            } else {
                while (true) {
                    if (rVar == null) {
                        break;
                    }
                    if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                        J.e eVar3 = null;
                        while (rVar != null) {
                            if (rVar instanceof aa) {
                                aa aaVar2 = (aa) rVar;
                                if (aaVar2.isAttached()) {
                                    eVar.bravo(aaVar2);
                                }
                            } else if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (rVar instanceof AbstractC2556p)) {
                                int i10 = 0;
                                for (T.r rVar2 = ((AbstractC2556p) rVar).purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                                    if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            rVar = rVar2;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new J.e(new T.r[16]);
                                            }
                                            if (rVar != null) {
                                                eVar3.bravo(rVar);
                                                rVar = null;
                                            }
                                            eVar3.bravo(rVar2);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            rVar = AbstractC2555o.bravo(eVar3);
                        }
                    } else {
                        rVar = rVar.getChild$ui_release();
                    }
                }
            }
        }
        while (eVar.red != 0 && (delta = delta(eVar, cVar, i4)) != null) {
            if (delta.c().alpha) {
                return ((Boolean) avVar.invoke(delta)).booleanValue();
            }
            if (foxtrot(i4, avVar, delta, cVar)) {
                return true;
            }
            eVar.lima(delta);
        }
        return false;
    }

    public static final Boolean kilo(int i4, av avVar, aa aaVar, Z.c cVar) {
        int ordinal = aaVar.d().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (aaVar.c().alpha) {
                            return (Boolean) avVar.invoke(aaVar);
                        }
                        if (cVar == null) {
                            return Boolean.valueOf(echo(aaVar, i4, avVar));
                        }
                        return Boolean.valueOf(juliet(i4, avVar, aaVar, cVar));
                    }
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                aa golf = g.golf(aaVar);
                if (golf != null) {
                    int ordinal2 = golf.d().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                        } else {
                            Boolean kilo = kilo(i4, avVar, golf, cVar);
                            if (!Intrinsics.areEqual(kilo, Boolean.FALSE)) {
                                return kilo;
                            }
                            if (cVar == null) {
                                if (golf.d() == x.purple) {
                                    aa charlie = g.charlie(golf);
                                    if (charlie != null) {
                                        cVar = g.delta(charlie);
                                    } else {
                                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                                    }
                                } else {
                                    throw new IllegalStateException("Searching for active node in inactive hierarchy");
                                }
                            }
                            return Boolean.valueOf(foxtrot(i4, avVar, aaVar, cVar));
                        }
                    }
                    if (cVar == null) {
                        cVar = g.delta(golf);
                    }
                    return Boolean.valueOf(foxtrot(i4, avVar, aaVar, cVar));
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        }
        return Boolean.valueOf(echo(aaVar, i4, avVar));
    }
}
