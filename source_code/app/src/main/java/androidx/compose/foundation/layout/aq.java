package androidx.compose.foundation.layout;

import com.airbnb.lottie.compose.LottieConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import s6.X6;

/* loaded from: classes3.dex */
public final class aq implements O {
    public final InterfaceC0539e alpha;
    public final InterfaceC0541g bravo;
    public final float charlie;
    public final C0559z delta;
    public final float echo;
    public final ao foxtrot;

    public aq(InterfaceC0539e interfaceC0539e, InterfaceC0541g interfaceC0541g, float f5, C0559z c0559z, float f10, ao aoVar) {
        this.alpha = interfaceC0539e;
        this.bravo = interfaceC0541g;
        this.charlie = f5;
        this.delta = c0559z;
        this.echo = f10;
        this.foxtrot = aoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int alpha(List list, int i4, int i5, int i10, ao aoVar) {
        int i11;
        int i12;
        int i13;
        bv.k kVar;
        long alpha;
        int i14;
        int i15;
        int i16;
        bv.k kVar2;
        boolean z2;
        boolean z10;
        int i17;
        int i18 = 0;
        if (list.isEmpty()) {
            alpha = bv.k.alpha(0, 0);
        } else {
            int i19 = LottieConstants.IterateForever;
            ag agVar = new ag(aoVar, Q0.b.alpha(0, i4, 0, LottieConstants.IterateForever), i5, i10);
            InterfaceC2401t interfaceC2401t = (InterfaceC2401t) CollectionsKt.jade(0, list);
            if (interfaceC2401t != null) {
                i11 = interfaceC2401t.jade(i4);
            } else {
                i11 = 0;
            }
            if (interfaceC2401t != null) {
                i12 = interfaceC2401t.lima(i11);
            } else {
                i12 = 0;
            }
            boolean z11 = true;
            if (list.size() > 1) {
                i13 = 1;
            } else {
                i13 = 1;
                z11 = false;
            }
            long alpha2 = bv.k.alpha(i4, LottieConstants.IterateForever);
            if (interfaceC2401t == null) {
                kVar = null;
            } else {
                kVar = new bv.k(bv.k.alpha(i12, i11));
            }
            int i20 = 0;
            if (agVar.bravo(z11, 0, alpha2, kVar, 0, 0, 0, false, false).bravo) {
                if (interfaceC2401t != null) {
                    z10 = i13;
                } else {
                    z10 = 0;
                }
                bv.k alpha3 = aoVar.alpha(0, 0, z10);
                if (alpha3 != null) {
                    i17 = (int) (alpha3.alpha & 4294967295L);
                } else {
                    i17 = 0;
                }
                alpha = bv.k.alpha(i17, 0);
            } else {
                int size = list.size();
                int i21 = i4;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                while (true) {
                    if (i22 >= size) {
                        break;
                    }
                    int i27 = i21 - i12;
                    int i28 = i22 + 1;
                    int max = Math.max(i26, i11);
                    InterfaceC2401t interfaceC2401t2 = (InterfaceC2401t) CollectionsKt.jade(i28, list);
                    if (interfaceC2401t2 != null) {
                        i14 = interfaceC2401t2.jade(i4);
                    } else {
                        i14 = i18;
                    }
                    if (interfaceC2401t2 != null) {
                        i15 = interfaceC2401t2.lima(i14) + i5;
                    } else {
                        i15 = i18;
                    }
                    if (i22 + 2 < list.size()) {
                        i16 = i13;
                    } else {
                        i16 = i18;
                    }
                    int i29 = i28 - i24;
                    boolean z12 = i16;
                    int i30 = i25;
                    long alpha4 = bv.k.alpha(i27, i19);
                    if (interfaceC2401t2 == null) {
                        kVar2 = null;
                    } else {
                        kVar2 = new bv.k(bv.k.alpha(i15, i14));
                    }
                    int i31 = i14;
                    int i32 = i15;
                    af bravo = agVar.bravo(z12, i29, alpha4, kVar2, i30, i20, max, false, false);
                    if (bravo.alpha) {
                        int i33 = max + i10 + i20;
                        if (interfaceC2401t2 != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ae alpha5 = agVar.alpha(bravo, z2, i30, i33, i27, i29);
                        int i34 = i32 - i5;
                        i25 = i30 + 1;
                        if (bravo.bravo) {
                            if (alpha5 != null && !alpha5.delta) {
                                i33 += ((int) (alpha5.charlie & 4294967295L)) + i10;
                            }
                            i20 = i33;
                            i23 = i28;
                        } else {
                            i24 = i28;
                            i20 = i33;
                            i12 = i34;
                            i26 = 0;
                            i21 = i4;
                        }
                    } else {
                        i12 = i32;
                        i21 = i27;
                        i25 = i30;
                        i26 = max;
                    }
                    i22 = i28;
                    i23 = i22;
                    i11 = i31;
                    i19 = LottieConstants.IterateForever;
                    i18 = 0;
                    i13 = 1;
                }
                alpha = bv.k.alpha(i20 - i10, i23);
            }
        }
        return (int) (alpha >> 32);
    }

    @Override // androidx.compose.foundation.layout.O
    public final long charlie(int i4, int i5, int i10, boolean z2) {
        S s3 = Q.alpha;
        if (!z2) {
            return Q0.b.alpha(i4, i5, 0, i10);
        }
        return X6.bravo(i4, i5, 0, i10);
    }

    @Override // androidx.compose.foundation.layout.O
    public final void echo(int i4, int[] iArr, int[] iArr2, q0.ar arVar) {
        this.alpha.charlie(arVar, i4, iArr, arVar.getLayoutDirection(), iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        aqVar.getClass();
        return Intrinsics.areEqual(this.alpha, aqVar.alpha) && Intrinsics.areEqual(this.bravo, aqVar.bravo) && Q0.g.alpha(this.charlie, aqVar.charlie) && Intrinsics.areEqual(this.delta, aqVar.delta) && Q0.g.alpha(this.echo, aqVar.echo) && Intrinsics.areEqual(this.foxtrot, aqVar.foxtrot);
    }

    @Override // androidx.compose.foundation.layout.O
    public final int foxtrot(AbstractC2367C abstractC2367C) {
        return abstractC2367C.navy();
    }

    public final int hashCode() {
        return this.foxtrot.hashCode() + ((((((Float.floatToIntBits(this.echo) + ao.ad.sierra(-1.0f, ao.ad.sierra(this.charlie, (this.bravo.hashCode() + ((this.alpha.hashCode() + 38161) * 31)) * 31, 31), 31)) * 31) + LottieConstants.IterateForever) * 31) + LottieConstants.IterateForever) * 31);
    }

    @Override // androidx.compose.foundation.layout.O
    public final q0.aq india(final AbstractC2367C[] abstractC2367CArr, q0.ar arVar, final int[] iArr, int i4, final int i5, final int[] iArr2, final int i10, final int i11, final int i12) {
        final Q0.n nVar = Q0.n.alpha;
        return arVar.papa(i4, i5, kotlin.collections.t.alpha, new Function1() { // from class: androidx.compose.foundation.layout.ap
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13;
                P p4;
                AbstractC0538d abstractC0538d;
                AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
                int[] iArr3 = iArr2;
                if (iArr3 != null) {
                    i13 = iArr3[i10];
                } else {
                    i13 = 0;
                }
                int i14 = i11;
                for (int i15 = i14; i15 < i12; i15++) {
                    AbstractC2367C abstractC2367C = abstractC2367CArr[i15];
                    Intrinsics.checkNotNull(abstractC2367C);
                    aq aqVar = this;
                    aqVar.getClass();
                    Object yankee = abstractC2367C.yankee();
                    if (yankee instanceof P) {
                        p4 = (P) yankee;
                    } else {
                        p4 = null;
                    }
                    if (p4 == null || (abstractC0538d = p4.charlie) == null) {
                        abstractC0538d = aqVar.delta;
                    }
                    AbstractC2366B.hotel(abstractC2366B, abstractC2367C, iArr[i15 - i14], abstractC0538d.foxtrot(i5 - abstractC2367C.maroon(), nVar) + i13);
                }
                return Unit.INSTANCE;
            }
        });
    }

    @Override // androidx.compose.foundation.layout.O
    public final int juliet(AbstractC2367C abstractC2367C) {
        return abstractC2367C.maroon();
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.alpha + ", verticalArrangement=" + this.bravo + ", mainAxisSpacing=" + ((Object) Q0.g.bravo(this.charlie)) + ", crossAxisAlignment=" + this.delta + ", crossAxisArrangementSpacing=" + ((Object) Q0.g.bravo(this.echo)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.foxtrot + ')';
    }
}
