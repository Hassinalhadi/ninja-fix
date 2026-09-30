package d;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public abstract class O0 {
    public static final ak alpha = new ak(3, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[LOOP:0: B:11:0x0049->B:12:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003c -> B:10:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(m0.af afVar, Pd.a aVar) {
        C1553r0 c1553r0;
        int i4;
        int size;
        int i5;
        int i10;
        int size2;
        if (aVar instanceof C1553r0) {
            C1553r0 c1553r02 = (C1553r0) aVar;
            int i11 = c1553r02.red;
            if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1553r02.red = i11 - RecyclerView.UNDEFINED_DURATION;
                c1553r0 = c1553r02;
                Object obj = c1553r0.purple;
                Od.a aVar2 = Od.a.alpha;
                i4 = c1553r0.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        afVar = c1553r0.alpha;
                        ResultKt.alpha(obj);
                        m0.k kVar = (m0.k) obj;
                        List list = kVar.alpha;
                        size = list.size();
                        i5 = 0;
                        for (i10 = 0; i10 < size; i10++) {
                            ((m0.r) list.get(i10)).alpha();
                        }
                        List list2 = kVar.alpha;
                        size2 = list2.size();
                        while (i5 < size2) {
                            if (((m0.r) list2.get(i5)).delta) {
                                c1553r0.alpha = afVar;
                                c1553r0.red = 1;
                                obj = afVar.charlie(m0.l.purple, c1553r0);
                                if (obj == aVar2) {
                                    return aVar2;
                                }
                                m0.k kVar2 = (m0.k) obj;
                                List list3 = kVar2.alpha;
                                size = list3.size();
                                i5 = 0;
                                while (i10 < size) {
                                }
                                List list22 = kVar2.alpha;
                                size2 = list22.size();
                                while (i5 < size2) {
                                }
                            } else {
                                i5++;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                c1553r0.alpha = afVar;
                c1553r0.red = 1;
                obj = afVar.charlie(m0.l.purple, c1553r0);
                if (obj == aVar2) {
                }
                m0.k kVar22 = (m0.k) obj;
                List list32 = kVar22.alpha;
                size = list32.size();
                i5 = 0;
                while (i10 < size) {
                }
                List list222 = kVar22.alpha;
                size2 = list222.size();
                while (i5 < size2) {
                }
                return Unit.INSTANCE;
            }
        }
        c1553r0 = new Pd.c(aVar);
        Object obj2 = c1553r0.purple;
        Od.a aVar22 = Od.a.alpha;
        i4 = c1553r0.red;
        if (i4 == 0) {
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object bravo(m0.af r5, boolean r6, m0.l r7, Pd.a r8) {
        /*
            boolean r0 = r8 instanceof d.C1550p0
            if (r0 == 0) goto L13
            r0 = r8
            d.p0 r0 = (d.C1550p0) r0
            int r1 = r0.teal
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.teal = r1
            goto L18
        L13:
            d.p0 r0 = new d.p0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.silver
            Od.a r1 = Od.a.alpha
            int r2 = r0.teal
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r5 = r0.red
            m0.l r6 = r0.purple
            m0.af r7 = r0.alpha
            kotlin.ResultKt.alpha(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4b
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.alpha(r8)
        L3c:
            r0.alpha = r5
            r0.purple = r7
            r0.red = r6
            r0.teal = r3
            java.lang.Object r8 = r5.charlie(r7, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            m0.k r8 = (m0.k) r8
            boolean r2 = echo(r8, r6)
            if (r2 == 0) goto L3c
            java.util.List r5 = r8.alpha
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d.O0.bravo(m0.af, boolean, m0.l, Pd.a):java.lang.Object");
    }

    public static /* synthetic */ Object charlie(m0.af afVar, Pd.h hVar, int i4) {
        boolean z2 = true;
        if ((i4 & 1) == 0) {
            z2 = false;
        }
        return bravo(afVar, z2, m0.l.purple, hVar);
    }

    public static Object delta(m0.u uVar, Function1 function1, Nd.c cVar) {
        Object mike = vf.ad.mike(new J0(uVar, alpha, null, null, function1, null), cVar);
        if (mike == Od.a.alpha) {
            return mike;
        }
        return Unit.INSTANCE;
    }

    public static boolean echo(m0.k kVar, boolean z2) {
        List list = kVar.alpha;
        int size = list.size();
        int i4 = 0;
        while (true) {
            boolean z10 = true;
            if (i4 >= size) {
                return true;
            }
            m0.r rVar = (m0.r) list.get(i4);
            if (z2) {
                if (rVar.bravo() || rVar.hotel || !rVar.delta) {
                    z10 = false;
                }
            } else {
                z10 = m0.q.alpha(rVar);
            }
            if (!z10) {
                return false;
            }
            i4++;
        }
    }

    public static vf.Y foxtrot(vf.ab abVar, vf.I i4, Xd.l lVar) {
        return vf.ad.zulu(abVar, null, vf.ac.silver, new K0(i4, lVar, null), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object golf(m0.af afVar, m0.l lVar, Pd.a aVar) {
        L0 l02;
        int i4;
        Ref.ObjectRef objectRef;
        try {
            if (aVar instanceof L0) {
                L0 l03 = (L0) aVar;
                int i5 = l03.red;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    l03.red = i5 - RecyclerView.UNDEFINED_DURATION;
                    l02 = l03;
                    Object obj = l02.purple;
                    Object obj2 = Od.a.alpha;
                    i4 = l02.red;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            objectRef = l02.alpha;
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                        objectRef2.alpha = at.alpha;
                        long bravo = afVar.golf().bravo();
                        Xd.l m02 = new M0(lVar, objectRef2, null);
                        l02.alpha = objectRef2;
                        l02.red = 1;
                        if (afVar.india(bravo, m02, l02) == obj2) {
                            return obj2;
                        }
                        objectRef = objectRef2;
                    }
                    return objectRef.alpha;
                }
            }
            if (i4 == 0) {
            }
            return objectRef.alpha;
        } catch (PointerEventTimeoutCancellationException unused) {
            return av.alpha;
        }
        l02 = new Pd.c(aVar);
        Object obj3 = l02.purple;
        Object obj22 = Od.a.alpha;
        i4 = l02.red;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        r0 = r11.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r8 >= r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        r9 = (m0.r) r11.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r9.bravo() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        if (m0.q.echo(r9, r7.white.f12964c, r7.foxtrot()) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        r0 = m0.l.red;
        r1.alpha = r7;
        r1.purple = r3;
        r1.silver = 2;
        r0 = r7.charlie(r0, r1);
        r1 = r1;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b0, code lost:
    
        if (r0 != r2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b0 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object hotel(m0.af afVar, m0.l lVar, Pd.a aVar) {
        N0 n02;
        int i4;
        m0.af afVar2;
        N0 n03;
        m0.l lVar2;
        m0.af afVar3;
        m0.l lVar3;
        N0 n04;
        m0.k kVar;
        int size;
        int i5;
        Object charlie;
        if (aVar instanceof N0) {
            N0 n05 = (N0) aVar;
            int i10 = n05.silver;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                n05.silver = i10 - RecyclerView.UNDEFINED_DURATION;
                n02 = n05;
                Object obj = n02.red;
                Od.a aVar2 = Od.a.alpha;
                i4 = n02.silver;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            lVar3 = n02.purple;
                            m0.af afVar4 = n02.alpha;
                            ResultKt.alpha(obj);
                            N0 n06 = n02;
                            m0.af afVar5 = afVar4;
                            m0.l lVar4 = lVar3;
                            n03 = n06;
                            lVar2 = lVar4;
                            List list = ((m0.k) obj).alpha;
                            int size2 = list.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                if (((m0.r) list.get(i11)).bravo()) {
                                    return null;
                                }
                            }
                            afVar2 = afVar5;
                            n03.alpha = afVar2;
                            n03.purple = lVar2;
                            n03.silver = 1;
                            charlie = afVar2.charlie(lVar2, n03);
                            if (charlie != aVar2) {
                                afVar3 = afVar2;
                                obj = charlie;
                                N0 n07 = n03;
                                lVar3 = lVar2;
                                n04 = n07;
                                kVar = (m0.k) obj;
                                List list2 = kVar.alpha;
                                size = list2.size();
                                i5 = 0;
                                while (true) {
                                    List list3 = kVar.alpha;
                                    if (i5 < size) {
                                        if (!m0.q.bravo((m0.r) list2.get(i5))) {
                                            break;
                                        }
                                        i5++;
                                    } else {
                                        return list3.get(0);
                                    }
                                }
                            }
                            return aVar2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lVar3 = n02.purple;
                    m0.af afVar6 = n02.alpha;
                    ResultKt.alpha(obj);
                    n04 = n02;
                    afVar3 = afVar6;
                    kVar = (m0.k) obj;
                    List list22 = kVar.alpha;
                    size = list22.size();
                    i5 = 0;
                    while (true) {
                        List list32 = kVar.alpha;
                        if (i5 < size) {
                        }
                        i5++;
                    }
                    return aVar2;
                }
                ResultKt.alpha(obj);
                afVar2 = afVar;
                n03 = n02;
                lVar2 = lVar;
                n03.alpha = afVar2;
                n03.purple = lVar2;
                n03.silver = 1;
                charlie = afVar2.charlie(lVar2, n03);
                if (charlie != aVar2) {
                }
                return aVar2;
            }
        }
        n02 = new Pd.c(aVar);
        Object obj2 = n02.red;
        Od.a aVar22 = Od.a.alpha;
        i4 = n02.silver;
        if (i4 == 0) {
        }
    }
}
