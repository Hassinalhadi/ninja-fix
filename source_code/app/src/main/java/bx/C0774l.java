package bx;

import androidx.compose.runtime.t0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;

/* renamed from: bx.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0774l implements q0.ap {
    public final s alpha;

    public C0774l(s sVar) {
        this.alpha = sVar;
    }

    @Override // q0.ap
    public final int alpha(InterfaceC2402u interfaceC2402u, List list, int i4) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC2401t) list.get(0)).lima(i4));
            int ivory = CollectionsKt.ivory(list);
            int i5 = 1;
            if (1 <= ivory) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC2401t) list.get(i5)).lima(i4));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i5 == ivory) {
                        break;
                    }
                    i5++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // q0.ap
    public final int bravo(InterfaceC2402u interfaceC2402u, List list, int i4) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC2401t) list.get(0)).jade(i4));
            int ivory = CollectionsKt.ivory(list);
            int i5 = 1;
            if (1 <= ivory) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC2401t) list.get(i5)).jade(i4));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i5 == ivory) {
                        break;
                    }
                    i5++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // q0.ap
    public final q0.aq delta(q0.ar arVar, List list, long j5) {
        int i4;
        AbstractC2367C abstractC2367C;
        AbstractC2367C abstractC2367C2;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int size = list.size();
        AbstractC2367C[] abstractC2367CArr = new AbstractC2367C[size];
        int size2 = list.size();
        long j6 = 0;
        int i15 = 0;
        while (true) {
            i4 = 1;
            abstractC2367C = null;
            o oVar = null;
            if (i15 >= size2) {
                break;
            }
            q0.ao aoVar = (q0.ao) list.get(i15);
            Object yankee = aoVar.yankee();
            if (yankee instanceof o) {
                oVar = (o) yankee;
            }
            if (oVar != null && ((Boolean) ((t0) oVar.alpha).getValue()).booleanValue()) {
                abstractC2367CArr[i15] = aoVar.victor(j5);
                j6 = (r7.purple & 4294967295L) | (r7.alpha << 32);
            }
            i15++;
        }
        int size3 = list.size();
        for (int i16 = 0; i16 < size3; i16++) {
            q0.ao aoVar2 = (q0.ao) list.get(i16);
            if (abstractC2367CArr[i16] == null) {
                abstractC2367CArr[i16] = aoVar2.victor(j5);
            }
        }
        if (arVar.ivory()) {
            i11 = (int) (j6 >> 32);
        } else {
            if (size == 0) {
                abstractC2367C2 = null;
            } else {
                abstractC2367C2 = abstractC2367CArr[0];
                int i17 = size - 1;
                if (i17 != 0) {
                    if (abstractC2367C2 != null) {
                        i5 = abstractC2367C2.alpha;
                    } else {
                        i5 = 0;
                    }
                    if (1 <= i17) {
                        int i18 = 1;
                        while (true) {
                            AbstractC2367C abstractC2367C3 = abstractC2367CArr[i18];
                            if (abstractC2367C3 != null) {
                                i10 = abstractC2367C3.alpha;
                            } else {
                                i10 = 0;
                            }
                            if (i5 < i10) {
                                abstractC2367C2 = abstractC2367C3;
                                i5 = i10;
                            }
                            if (i18 == i17) {
                                break;
                            }
                            i18++;
                        }
                    }
                }
            }
            if (abstractC2367C2 != null) {
                i11 = abstractC2367C2.alpha;
            } else {
                i11 = 0;
            }
        }
        if (arVar.ivory()) {
            i12 = (int) (j6 & 4294967295L);
        } else {
            if (size != 0) {
                abstractC2367C = abstractC2367CArr[0];
                int i19 = size - 1;
                if (i19 != 0) {
                    if (abstractC2367C != null) {
                        i13 = abstractC2367C.purple;
                    } else {
                        i13 = 0;
                    }
                    if (1 <= i19) {
                        while (true) {
                            AbstractC2367C abstractC2367C4 = abstractC2367CArr[i4];
                            if (abstractC2367C4 != null) {
                                i14 = abstractC2367C4.purple;
                            } else {
                                i14 = 0;
                            }
                            if (i13 < i14) {
                                abstractC2367C = abstractC2367C4;
                                i13 = i14;
                            }
                            if (i4 == i19) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
            }
            if (abstractC2367C != null) {
                i12 = abstractC2367C.purple;
            } else {
                i12 = 0;
            }
        }
        if (!arVar.ivory()) {
            ((t0) this.alpha.charlie).setValue(new Q0.m((i11 << 32) | (i12 & 4294967295L)));
        }
        return arVar.papa(i11, i12, kotlin.collections.t.alpha, new C0773k(abstractC2367CArr, this, i11, i12));
    }

    @Override // q0.ap
    public final int golf(InterfaceC2402u interfaceC2402u, List list, int i4) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC2401t) list.get(0)).romeo(i4));
            int ivory = CollectionsKt.ivory(list);
            int i5 = 1;
            if (1 <= ivory) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC2401t) list.get(i5)).romeo(i4));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i5 == ivory) {
                        break;
                    }
                    i5++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    @Override // q0.ap
    public final int hotel(InterfaceC2402u interfaceC2402u, List list, int i4) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((InterfaceC2401t) list.get(0)).delta(i4));
            int ivory = CollectionsKt.ivory(list);
            int i5 = 1;
            if (1 <= ivory) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((InterfaceC2401t) list.get(i5)).delta(i4));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i5 == ivory) {
                        break;
                    }
                    i5++;
                }
            }
        }
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }
}
