package Y;

import B9.C0058p;
import C1.av;
import T.r;
import Y.n;
import a0.ao;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import bv.ah;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import k0.AbstractC1996c;
import k0.InterfaceC1997d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p0.AbstractC2264a;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.F;
import s0.InterfaceC2554n;
import s0.al;
import s0.g0;
import t0.C2915g0;
import t0.C2946x;
import t0.W;
import t0.Y;

/* loaded from: classes3.dex */
public final class n implements k {
    public final C2946x alpha;
    public final C2946x bravo;
    public final h delta;
    public bv.ae foxtrot;
    public aa hotel;
    public final aa charlie = new aa(2, null, 6);
    public final FocusOwnerImpl$modifier$1 echo = new F() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // s0.F
        public final r create() {
            return n.this.charlie;
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return n.this.charlie.hashCode();
        }

        @Override // s0.F
        public final void inspectableProperties(C2915g0 c2915g0) {
            c2915g0.alpha = "RootFocusTarget";
        }

        @Override // s0.F
        public final /* bridge */ /* synthetic */ void update(r rVar) {
        }
    };
    public final ah golf = new ah(1);

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public n(C2946x c2946x, C2946x c2946x2) {
        this.alpha = c2946x;
        this.bravo = c2946x2;
        this.delta = new h(this, c2946x2);
    }

    public final boolean alpha(boolean z2) {
        C0058p c0058p;
        aa aaVar = this.hotel;
        if (aaVar != null) {
            golf(null);
            aaVar.b(x.alpha, x.silver);
            if (!aaVar.getNode().isAttached()) {
                AbstractC2264a.bravo("visitAncestors called on an unattached node");
            }
            T.r parent$ui_release = aaVar.getNode().getParent$ui_release();
            al golf = AbstractC2555o.golf(aaVar);
            while (golf != null) {
                if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                            J.e eVar = null;
                            T.r rVar = parent$ui_release;
                            while (rVar != null) {
                                if (rVar instanceof aa) {
                                    ((aa) rVar).b(x.purple, x.silver);
                                } else if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (rVar instanceof AbstractC2556p)) {
                                    int i4 = 0;
                                    for (T.r rVar2 = ((AbstractC2556p) rVar).purple; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                                        if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                rVar = rVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new J.e(new T.r[16]);
                                                }
                                                if (rVar != null) {
                                                    eVar.bravo(rVar);
                                                    rVar = null;
                                                }
                                                eVar.bravo(rVar2);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                rVar = AbstractC2555o.bravo(eVar);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                golf = golf.victor();
                if (golf != null && (c0058p = golf.f13305x) != null) {
                    parent$ui_release = (g0) c0058p.golf;
                } else {
                    parent$ui_release = null;
                }
            }
        }
        return true;
    }

    public final boolean bravo(int i4, boolean z2, boolean z10) {
        boolean z11 = true;
        if (!z2) {
            int ordinal = ab.bravo(this.charlie, i4).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                z11 = false;
            } else {
                alpha(z2);
            }
        } else {
            alpha(z2);
        }
        if (z11 && z10) {
            charlie();
        }
        return z11;
    }

    public final void charlie() {
        C2946x c2946x = this.alpha;
        if (!c2946x.isFocused() && !c2946x.hasFocus()) {
            if (c2946x.hasFocus()) {
                View findFocus = c2946x.findFocus();
                if (findFocus != null) {
                    findFocus.clearFocus();
                }
                c2946x.clearFocus();
                return;
            }
            return;
        }
        c2946x.clearFocus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b0 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x001c, B:13:0x0026, B:16:0x0033, B:18:0x003d, B:19:0x0043, B:21:0x004f, B:23:0x0056, B:25:0x005e, B:29:0x0068, B:34:0x01b0, B:36:0x01ba, B:37:0x01bd, B:39:0x01cc, B:42:0x01dc, B:46:0x01e8, B:81:0x01ee, B:82:0x01f3, B:75:0x0233, B:48:0x01f7, B:50:0x01ff, B:52:0x0203, B:54:0x020b, B:56:0x0213, B:62:0x021b, B:64:0x0224, B:65:0x0228, B:60:0x022b, B:84:0x0238, B:87:0x023d, B:89:0x0243, B:96:0x0247, B:101:0x0252, B:103:0x025a, B:111:0x0271, B:112:0x0281, B:114:0x0285, B:153:0x0289, B:148:0x02e6, B:116:0x0295, B:118:0x029f, B:120:0x02a5, B:122:0x02ac, B:124:0x02b4, B:126:0x02b8, B:129:0x02bb, B:131:0x02c1, B:132:0x02c8, B:134:0x02d0, B:135:0x02d5, B:137:0x02db, B:128:0x02de, B:159:0x02f1, B:163:0x0301, B:164:0x0311, B:166:0x0315, B:205:0x0319, B:200:0x0376, B:168:0x0325, B:170:0x032f, B:172:0x0335, B:174:0x033c, B:176:0x0344, B:178:0x0348, B:181:0x034b, B:183:0x0351, B:184:0x0358, B:186:0x0360, B:187:0x0365, B:189:0x036b, B:180:0x036e, B:212:0x0383, B:214:0x038a, B:227:0x0072, B:229:0x007c, B:230:0x007f, B:232:0x0089, B:235:0x0099, B:239:0x00a5, B:274:0x0102, B:276:0x0106, B:241:0x00aa, B:243:0x00b2, B:245:0x00b6, B:247:0x00be, B:249:0x00c6, B:255:0x00ce, B:257:0x00d7, B:258:0x00db, B:253:0x00de, B:264:0x00e6, B:278:0x00eb, B:281:0x00f0, B:283:0x00f6, B:290:0x00fa, B:295:0x010e, B:297:0x0118, B:298:0x011b, B:300:0x0129, B:303:0x0139, B:307:0x0145, B:342:0x01a2, B:344:0x01a6, B:309:0x014a, B:311:0x0152, B:313:0x0156, B:315:0x015e, B:317:0x0166, B:323:0x016e, B:325:0x0177, B:326:0x017b, B:321:0x017e, B:332:0x0186, B:347:0x018b, B:350:0x0190, B:352:0x0196, B:359:0x019a), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean delta(KeyEvent keyEvent, Function0 function0) {
        InterfaceC2554n interfaceC2554n;
        T.r rVar;
        C0058p c0058p;
        InterfaceC2554n interfaceC2554n2;
        C0058p c0058p2;
        int size;
        C0058p c0058p3;
        aa aaVar = this.charlie;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.delta.echo) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!hotel(keyEvent)) {
                return false;
            }
            aa charlie = g.charlie(aaVar);
            if (charlie != null) {
                if (!charlie.getNode().isAttached()) {
                    AbstractC2264a.bravo("visitLocalDescendants called on an unattached node");
                }
                T.r node = charlie.getNode();
                if ((node.getAggregateChildKindSet$ui_release() & 9216) != 0) {
                    rVar = null;
                    for (T.r child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                        if ((child$ui_release.getKindSet$ui_release() & 9216) != 0) {
                            if ((child$ui_release.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                break;
                            }
                            rVar = child$ui_release;
                        }
                    }
                } else {
                    rVar = null;
                }
            }
            if (charlie != null) {
                if (!charlie.getNode().isAttached()) {
                    AbstractC2264a.bravo("visitAncestors called on an unattached node");
                }
                T.r node2 = charlie.getNode();
                al golf = AbstractC2555o.golf(charlie);
                loop11: while (true) {
                    if (golf != null) {
                        if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & 8192) != 0) {
                            while (node2 != null) {
                                if ((node2.getKindSet$ui_release() & 8192) != 0) {
                                    J.e eVar = null;
                                    T.r rVar2 = node2;
                                    while (rVar2 != null) {
                                        if (rVar2 instanceof InterfaceC1997d) {
                                            interfaceC2554n2 = rVar2;
                                            break loop11;
                                        }
                                        if ((rVar2.getKindSet$ui_release() & 8192) != 0 && (rVar2 instanceof AbstractC2556p)) {
                                            T.r rVar3 = ((AbstractC2556p) rVar2).purple;
                                            int i4 = 0;
                                            rVar2 = rVar2;
                                            eVar = eVar;
                                            while (rVar3 != null) {
                                                if ((rVar3.getKindSet$ui_release() & 8192) != 0) {
                                                    i4++;
                                                    eVar = eVar;
                                                    if (i4 == 1) {
                                                        rVar2 = rVar3;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new J.e(new T.r[16]);
                                                        }
                                                        if (rVar2 != null) {
                                                            eVar.bravo(rVar2);
                                                            rVar2 = null;
                                                        }
                                                        eVar.bravo(rVar3);
                                                    }
                                                }
                                                rVar3 = rVar3.getChild$ui_release();
                                                rVar2 = rVar2;
                                                eVar = eVar;
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        rVar2 = AbstractC2555o.bravo(eVar);
                                    }
                                }
                                node2 = node2.getParent$ui_release();
                            }
                        }
                        golf = golf.victor();
                        if (golf != null && (c0058p2 = golf.f13305x) != null) {
                            node2 = (g0) c0058p2.golf;
                        } else {
                            node2 = null;
                        }
                    } else {
                        interfaceC2554n2 = null;
                        break;
                    }
                }
                InterfaceC2554n interfaceC2554n3 = (InterfaceC1997d) interfaceC2554n2;
                if (interfaceC2554n3 != null) {
                    rVar = ((T.r) interfaceC2554n3).getNode();
                    if (rVar != null) {
                        if (!rVar.getNode().isAttached()) {
                            AbstractC2264a.bravo("visitAncestors called on an unattached node");
                        }
                        T.r parent$ui_release = rVar.getNode().getParent$ui_release();
                        al golf2 = AbstractC2555o.golf(rVar);
                        ArrayList arrayList = null;
                        while (golf2 != null) {
                            if ((((T.r) golf2.f13305x.delta).getAggregateChildKindSet$ui_release() & 8192) != 0) {
                                while (parent$ui_release != null) {
                                    if ((parent$ui_release.getKindSet$ui_release() & 8192) != 0) {
                                        T.r rVar4 = parent$ui_release;
                                        J.e eVar2 = null;
                                        while (rVar4 != null) {
                                            if (rVar4 instanceof InterfaceC1997d) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(rVar4);
                                            } else if ((rVar4.getKindSet$ui_release() & 8192) != 0 && (rVar4 instanceof AbstractC2556p)) {
                                                int i5 = 0;
                                                for (T.r rVar5 = ((AbstractC2556p) rVar4).purple; rVar5 != null; rVar5 = rVar5.getChild$ui_release()) {
                                                    if ((rVar5.getKindSet$ui_release() & 8192) != 0) {
                                                        i5++;
                                                        if (i5 == 1) {
                                                            rVar4 = rVar5;
                                                        } else {
                                                            if (eVar2 == null) {
                                                                eVar2 = new J.e(new T.r[16]);
                                                            }
                                                            if (rVar4 != null) {
                                                                eVar2.bravo(rVar4);
                                                                rVar4 = null;
                                                            }
                                                            eVar2.bravo(rVar5);
                                                        }
                                                    }
                                                }
                                                if (i5 == 1) {
                                                }
                                            }
                                            rVar4 = AbstractC2555o.bravo(eVar2);
                                        }
                                    }
                                    parent$ui_release = parent$ui_release.getParent$ui_release();
                                }
                            }
                            golf2 = golf2.victor();
                            if (golf2 != null && (c0058p3 = golf2.f13305x) != null) {
                                parent$ui_release = (g0) c0058p3.golf;
                            } else {
                                parent$ui_release = null;
                            }
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i10 = size - 1;
                                if (((InterfaceC1997d) arrayList.get(size)).delta(keyEvent)) {
                                    return true;
                                }
                                if (i10 < 0) {
                                    break;
                                }
                                size = i10;
                            }
                        }
                        T.r node3 = rVar.getNode();
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                        objectRef2.alpha = node3;
                        while (true) {
                            Object obj = objectRef2.alpha;
                            if (obj != null) {
                                if (obj instanceof InterfaceC1997d) {
                                    if (((InterfaceC1997d) obj).delta(keyEvent)) {
                                        return true;
                                    }
                                } else if ((((T.r) obj).getKindSet$ui_release() & 8192) != 0) {
                                    Object obj2 = objectRef2.alpha;
                                    if (obj2 instanceof AbstractC2556p) {
                                        int i11 = 0;
                                        for (T.r rVar6 = ((AbstractC2556p) obj2).purple; rVar6 != null; rVar6 = rVar6.getChild$ui_release()) {
                                            if ((rVar6.getKindSet$ui_release() & 8192) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    objectRef2.alpha = rVar6;
                                                } else {
                                                    J.e eVar3 = (J.e) objectRef.alpha;
                                                    if (eVar3 == null) {
                                                        eVar3 = new J.e(new T.r[16]);
                                                    }
                                                    objectRef.alpha = eVar3;
                                                    T.r rVar7 = (T.r) objectRef2.alpha;
                                                    if (rVar7 != null) {
                                                        eVar3.bravo(rVar7);
                                                        objectRef2.alpha = null;
                                                    }
                                                    J.e eVar4 = (J.e) objectRef.alpha;
                                                    if (eVar4 != null) {
                                                        eVar4.bravo(rVar6);
                                                    }
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                }
                                objectRef2.alpha = AbstractC2555o.bravo((J.e) objectRef.alpha);
                            } else {
                                if (((Boolean) function0.invoke()).booleanValue()) {
                                    return true;
                                }
                                T.r node4 = rVar.getNode();
                                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                                Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
                                objectRef4.alpha = node4;
                                while (true) {
                                    Object obj3 = objectRef4.alpha;
                                    if (obj3 != null) {
                                        if (obj3 instanceof InterfaceC1997d) {
                                            if (((InterfaceC1997d) obj3).victor(keyEvent)) {
                                                return true;
                                            }
                                        } else if ((((T.r) obj3).getKindSet$ui_release() & 8192) != 0) {
                                            Object obj4 = objectRef4.alpha;
                                            if (obj4 instanceof AbstractC2556p) {
                                                int i12 = 0;
                                                for (T.r rVar8 = ((AbstractC2556p) obj4).purple; rVar8 != null; rVar8 = rVar8.getChild$ui_release()) {
                                                    if ((rVar8.getKindSet$ui_release() & 8192) != 0) {
                                                        i12++;
                                                        if (i12 == 1) {
                                                            objectRef4.alpha = rVar8;
                                                        } else {
                                                            J.e eVar5 = (J.e) objectRef3.alpha;
                                                            if (eVar5 == null) {
                                                                eVar5 = new J.e(new T.r[16]);
                                                            }
                                                            objectRef3.alpha = eVar5;
                                                            T.r rVar9 = (T.r) objectRef4.alpha;
                                                            if (rVar9 != null) {
                                                                eVar5.bravo(rVar9);
                                                                objectRef4.alpha = null;
                                                            }
                                                            J.e eVar6 = (J.e) objectRef3.alpha;
                                                            if (eVar6 != null) {
                                                                eVar6.bravo(rVar8);
                                                            }
                                                        }
                                                    }
                                                }
                                                if (i12 == 1) {
                                                }
                                            }
                                        }
                                        objectRef4.alpha = AbstractC2555o.bravo((J.e) objectRef3.alpha);
                                    } else if (arrayList != null) {
                                        int size2 = arrayList.size();
                                        for (int i13 = 0; i13 < size2; i13++) {
                                            if (((InterfaceC1997d) arrayList.get(i13)).victor(keyEvent)) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!aaVar.getNode().isAttached()) {
                AbstractC2264a.bravo("visitAncestors called on an unattached node");
            }
            T.r parent$ui_release2 = aaVar.getNode().getParent$ui_release();
            al golf3 = AbstractC2555o.golf(aaVar);
            loop15: while (true) {
                if (golf3 != null) {
                    if ((((T.r) golf3.f13305x.delta).getAggregateChildKindSet$ui_release() & 8192) != 0) {
                        while (parent$ui_release2 != null) {
                            if ((parent$ui_release2.getKindSet$ui_release() & 8192) != 0) {
                                T.r rVar10 = parent$ui_release2;
                                J.e eVar7 = null;
                                while (rVar10 != null) {
                                    if (rVar10 instanceof InterfaceC1997d) {
                                        interfaceC2554n = rVar10;
                                        break loop15;
                                    }
                                    if ((rVar10.getKindSet$ui_release() & 8192) != 0 && (rVar10 instanceof AbstractC2556p)) {
                                        T.r rVar11 = ((AbstractC2556p) rVar10).purple;
                                        int i14 = 0;
                                        rVar10 = rVar10;
                                        eVar7 = eVar7;
                                        while (rVar11 != null) {
                                            if ((rVar11.getKindSet$ui_release() & 8192) != 0) {
                                                i14++;
                                                eVar7 = eVar7;
                                                if (i14 == 1) {
                                                    rVar10 = rVar11;
                                                } else {
                                                    if (eVar7 == null) {
                                                        eVar7 = new J.e(new T.r[16]);
                                                    }
                                                    if (rVar10 != null) {
                                                        eVar7.bravo(rVar10);
                                                        rVar10 = null;
                                                    }
                                                    eVar7.bravo(rVar11);
                                                }
                                            }
                                            rVar11 = rVar11.getChild$ui_release();
                                            rVar10 = rVar10;
                                            eVar7 = eVar7;
                                        }
                                        if (i14 == 1) {
                                        }
                                    }
                                    rVar10 = AbstractC2555o.bravo(eVar7);
                                }
                            }
                            parent$ui_release2 = parent$ui_release2.getParent$ui_release();
                        }
                    }
                    golf3 = golf3.victor();
                    if (golf3 != null && (c0058p = golf3.f13305x) != null) {
                        parent$ui_release2 = (g0) c0058p.golf;
                    } else {
                        parent$ui_release2 = null;
                    }
                } else {
                    interfaceC2554n = null;
                    break;
                }
            }
            InterfaceC2554n interfaceC2554n4 = (InterfaceC1997d) interfaceC2554n;
            if (interfaceC2554n4 != null) {
                rVar = ((T.r) interfaceC2554n4).getNode();
            } else {
                rVar = null;
            }
            if (rVar != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r15v8, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13, types: [s0.g0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T.r] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [T.r] */
    /* JADX WARN: Type inference failed for: r5v12, types: [Y.aa] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [T.r] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [J.e] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [J.e] */
    public final Boolean echo(int i4, Z.c cVar, Function1 function1) {
        Boolean bool;
        boolean alpha;
        Boolean bool2;
        C0058p c0058p;
        s sVar;
        s sVar2;
        aa aaVar = this.charlie;
        aa charlie = g.charlie(aaVar);
        C2946x c2946x = this.bravo;
        int i5 = 4;
        if (charlie != null) {
            Q0.n layoutDirection = c2946x.getLayoutDirection();
            bool = null;
            q c3 = charlie.c();
            if (i4 == 1) {
                sVar = c3.bravo;
            } else if (i4 == 2) {
                sVar = c3.charlie;
            } else if (i4 == 5) {
                sVar = c3.delta;
            } else if (i4 == 6) {
                sVar = c3.echo;
            } else if (i4 == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        sVar2 = c3.india;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    sVar2 = c3.hotel;
                }
                if (sVar2 == s.bravo) {
                    sVar2 = null;
                }
                if (sVar2 == null) {
                    sVar = c3.foxtrot;
                }
                sVar = sVar2;
            } else if (i4 == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        sVar2 = c3.hotel;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    sVar2 = c3.india;
                }
                if (sVar2 == s.bravo) {
                    sVar2 = null;
                }
                if (sVar2 == null) {
                    sVar = c3.golf;
                }
                sVar = sVar2;
            } else if (i4 == 7 || i4 == 8) {
                a aVar = new a(i4);
                n nVar = (n) ((C2946x) AbstractC2555o.hotel(charlie)).getFocusOwner();
                aa aaVar2 = nVar.hotel;
                if (i4 == 7) {
                    c3.juliet.invoke(aVar);
                } else {
                    c3.kilo.invoke(aVar);
                }
                if (aVar.bravo) {
                    sVar = s.charlie;
                } else if (aaVar2 != nVar.hotel) {
                    sVar = s.delta;
                } else {
                    sVar = s.bravo;
                }
            } else {
                throw new IllegalStateException("invalid FocusDirection");
            }
            if (!Intrinsics.areEqual(sVar, s.charlie)) {
                if (Intrinsics.areEqual(sVar, s.delta)) {
                    aa charlie2 = g.charlie(aaVar);
                    if (charlie2 != null) {
                        return (Boolean) function1.invoke(charlie2);
                    }
                } else if (!Intrinsics.areEqual(sVar, s.bravo)) {
                    return Boolean.valueOf(sVar.alpha(function1));
                }
            }
            return bool;
        }
        bool = null;
        charlie = null;
        Q0.n layoutDirection2 = c2946x.getLayoutDirection();
        av avVar = new av(charlie, this, function1);
        if (i4 == 1 || i4 == 2) {
            if (i4 == 1) {
                alpha = g.echo(aaVar, avVar);
            } else if (i4 == 2) {
                alpha = g.alpha(aaVar, avVar);
            } else {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            return Boolean.valueOf(alpha);
        }
        if (i4 == 3 || i4 == 4 || i4 == 5 || i4 == 6) {
            return ae.kilo(i4, avVar, aaVar, cVar);
        }
        if (i4 == 7) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 == 1) {
                    i5 = 3;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            aa charlie3 = g.charlie(aaVar);
            if (charlie3 != null) {
                return ae.kilo(i5, avVar, charlie3, cVar);
            }
            return bool;
        }
        if (i4 == 8) {
            aa charlie4 = g.charlie(aaVar);
            boolean z2 = false;
            if (charlie4 != null) {
                if (!charlie4.getNode().isAttached()) {
                    AbstractC2264a.bravo("visitAncestors called on an unattached node");
                }
                ?? parent$ui_release = charlie4.getNode().getParent$ui_release();
                al golf = AbstractC2555o.golf(charlie4);
                loop0: while (golf != null) {
                    if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                        for (T.r rVar = parent$ui_release; rVar != null; rVar = rVar.getParent$ui_release()) {
                            if ((rVar.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                AbstractC2556p abstractC2556p = rVar;
                                ?? r62 = bool;
                                while (abstractC2556p != 0) {
                                    if (abstractC2556p instanceof aa) {
                                        ?? r5 = (aa) abstractC2556p;
                                        if (r5.c().alpha) {
                                            bool2 = r5;
                                            break loop0;
                                        }
                                    } else if ((abstractC2556p.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                        T.r rVar2 = abstractC2556p.purple;
                                        int i10 = 0;
                                        abstractC2556p = abstractC2556p;
                                        r62 = r62;
                                        while (rVar2 != null) {
                                            if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                                i10++;
                                                r62 = r62;
                                                if (i10 == 1) {
                                                    abstractC2556p = rVar2;
                                                } else {
                                                    if (r62 == 0) {
                                                        r62 = new J.e(new T.r[16]);
                                                    }
                                                    if (abstractC2556p != 0) {
                                                        r62.bravo(abstractC2556p);
                                                        abstractC2556p = bool;
                                                    }
                                                    r62.bravo(rVar2);
                                                }
                                            }
                                            rVar2 = rVar2.getChild$ui_release();
                                            abstractC2556p = abstractC2556p;
                                            r62 = r62;
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    abstractC2556p = AbstractC2555o.bravo(r62);
                                }
                            }
                        }
                    }
                    golf = golf.victor();
                    if (golf != null && (c0058p = golf.f13305x) != null) {
                        parent$ui_release = (g0) c0058p.golf;
                    } else {
                        parent$ui_release = bool;
                    }
                }
            }
            bool2 = bool;
            if (bool2 != null && !Intrinsics.areEqual(bool2, aaVar)) {
                z2 = ((Boolean) avVar.invoke(bool2)).booleanValue();
            }
            return Boolean.valueOf(z2);
        }
        throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) d.alpha(i4))).toString());
    }

    public final boolean foxtrot(int i4) {
        boolean z2;
        boolean z10;
        Rect rect;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.alpha = Boolean.FALSE;
        aa aaVar = this.hotel;
        C2946x c2946x = this.alpha;
        Boolean echo = echo(i4, c2946x.getEmbeddedViewFocusRect(), new l(objectRef, i4));
        if (!Intrinsics.areEqual(echo, Boolean.TRUE) || aaVar == this.hotel) {
            if (echo != null && objectRef.alpha != null) {
                if (!echo.booleanValue() || !((Boolean) objectRef.alpha).booleanValue()) {
                    View view = null;
                    if (i4 == 1 || i4 == 2) {
                        if (bravo(i4, false, false)) {
                            Boolean echo2 = echo(i4, null, new m(i4, 0));
                            if (echo2 != null) {
                                z2 = echo2.booleanValue();
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                            }
                        }
                    } else {
                        if (i4 != 7 && i4 != 8) {
                            Integer november = g.november(i4);
                            if (november != null) {
                                int intValue = november.intValue();
                                Z.c embeddedViewFocusRect = c2946x.getEmbeddedViewFocusRect();
                                if (embeddedViewFocusRect != null) {
                                    rect = ao.zulu(embeddedViewFocusRect);
                                } else {
                                    rect = null;
                                }
                                Object obj = Y.foxtrot.get();
                                Intrinsics.checkNotNull(obj);
                                Y y10 = (Y) obj;
                                if (rect == null) {
                                    view = y10.bravo(intValue, c2946x.findFocus(), c2946x);
                                } else {
                                    y10.alpha.set(rect);
                                    Rect rect2 = y10.alpha;
                                    ArrayList<View> arrayList = y10.echo;
                                    try {
                                        arrayList.clear();
                                        if (Build.VERSION.SDK_INT < 26) {
                                            W.charlie(c2946x, arrayList, c2946x.isInTouchMode());
                                        } else {
                                            c2946x.addFocusables(arrayList, intValue, c2946x.isInTouchMode() ? 1 : 0);
                                        }
                                        if (!arrayList.isEmpty()) {
                                            view = y10.alpha(intValue, rect2, null, c2946x, arrayList);
                                        }
                                        arrayList.clear();
                                    } catch (Throwable th) {
                                        arrayList.clear();
                                        throw th;
                                    }
                                }
                                if (view != null) {
                                    z10 = g.kilo(view, Integer.valueOf(intValue), rect);
                                    if (!z10) {
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Invalid focus direction");
                            }
                        }
                        z10 = false;
                        if (!z10) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void golf(aa aaVar) {
        al golf;
        A0.k xray;
        al golf2;
        A0.k xray2;
        aa aaVar2 = this.hotel;
        this.hotel = aaVar;
        ah ahVar = this.golf;
        Object[] objArr = ahVar.alpha;
        int i4 = ahVar.bravo;
        for (int i5 = 0; i5 < i4; i5++) {
            U.c cVar = (U.c) objArr[i5];
            cVar.getClass();
            if (aaVar2 != null && (golf2 = AbstractC2555o.golf(aaVar2)) != null && (xray2 = golf2.xray()) != null) {
                if (xray2.alpha.bravo(A0.j.golf)) {
                    ((AutofillManager) cVar.alpha.purple).notifyViewExited(cVar.charlie, golf2.purple);
                }
            }
            if (aaVar != null && (golf = AbstractC2555o.golf(aaVar)) != null && (xray = golf.xray()) != null) {
                if (xray.alpha.bravo(A0.j.golf)) {
                    int i10 = golf.purple;
                    cVar.delta.alpha.november(i10, new U.a(cVar, i10));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        r34 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        r3 = r4.bravo(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r4.echo != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        if (((r4.alpha[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        r3 = r4.charlie;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
    
        if (r3 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dd, code lost:
    
        if (java.lang.Long.compare((r4.delta * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
    
        r3 = r4.alpha;
        r5 = r4.charlie;
        r7 = r4.bravo;
        r8 = (r5 + 7) >> 3;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00eb, code lost:
    
        if (r9 >= r8) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
    
        r13 = r3[r9] & (-9187201950435737472L);
        r3[r9] = ((~r13) + (r13 >>> 7)) & (-72340172838076674L);
        r9 = r9 + 1;
        r7 = r7;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0106, code lost:
    
        r15 = r7;
        r7 = kotlin.collections.ArraysKt.green(r3);
        r8 = r7 - 1;
        r3[r8] = (r3[r8] & 72057594037927935L) | (-72057594037927936L);
        r3[r7] = r3[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0122, code lost:
    
        if (r7 == r5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0124, code lost:
    
        r8 = r7 >> 3;
        r9 = (r7 & 7) << 3;
        r13 = (r3[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0131, code lost:
    
        if (r13 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0138, code lost:
    
        if (r13 == 254) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013b, code lost:
    
        r13 = r15[r7];
        r13 = ((int) (r13 ^ (r13 >>> 32))) * (-862048943);
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r22 = r4.bravo(r14);
        r14 = r14 & r5;
        r35 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015b, code lost:
    
        if ((((r22 - r14) & r5) / 8) != (((r7 - r14) & r5) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x015d, code lost:
    
        r3[r8] = (r3[r8] & (~(255 << r9))) | ((r13 & 127) << r9);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017b, code lost:
    
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017e, code lost:
    
        r14 = r7;
        r7 = r22 >> 3;
        r36 = r3[r7];
        r8 = (r22 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018f, code lost:
    
        if (((r36 >> r8) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0191, code lost:
    
        r3[r7] = (r36 & (~(255 << r8))) | ((r13 & 127) << r8);
        r3[r8] = (r3[r8] & (~(255 << r9))) | (128 << r9);
        r15[r22] = r15[r14];
        r15[r14] = 0;
        r7 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d0, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b5, code lost:
    
        r3[r7] = ((r13 & 127) << r8) | (r36 & (~(255 << r8)));
        r7 = r15[r22];
        r15[r22] = r15[r14];
        r15[r14] = r7;
        r7 = r14 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0133, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01de, code lost:
    
        r4.echo = bv.au.alpha(r4.charlie) - r4.delta;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0260, code lost:
    
        r3 = r4.bravo(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0264, code lost:
    
        r15 = r3;
        r4.delta++;
        r3 = r4.echo;
        r5 = r4.alpha;
        r6 = r15 >> 3;
        r7 = r5[r6];
        r9 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027d, code lost:
    
        if (((r7 >> r9) & 255) != r20) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x027f, code lost:
    
        r25 = r34 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0281, code lost:
    
        r4.echo = r3 - r25;
        r3 = r4.charlie;
        r7 = (r7 & (~(255 << r9))) | (r10 << r9);
        r5[r6] = r7;
        r5[(((r15 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ed, code lost:
    
        r3 = bv.au.bravo(r4.charlie);
        r5 = r4.alpha;
        r7 = r4.bravo;
        r8 = r4.charlie;
        r4.charlie(r3);
        r3 = r4.alpha;
        r9 = r4.bravo;
        r12 = r4.charlie;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0204, code lost:
    
        if (r13 >= r8) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0214, code lost:
    
        if (((r5[r13 >> 3] >> ((r13 & 7) << 3)) & 255) >= r20) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0216, code lost:
    
        r14 = r7[r13];
        r18 = r7;
        r19 = r8;
        r7 = ((int) (r14 ^ (r14 >>> 32))) * (-862048943);
        r8 = r4.bravo((r7 ^ (r7 << 16)) >>> 7);
        r17 = r8 >> 3;
        r22 = (r8 & 7) << 3;
        r7 = (r3[r17] & (~(255 << r22))) | ((r7 & 127) << r22);
        r3[r17] = r7;
        r3[(((r8 - 7) & r12) + (r12 & 7)) >> 3] = r7;
        r9[r8] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0259, code lost:
    
        r13 = r13 + 1;
        r7 = r18;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0255, code lost:
    
        r18 = r7;
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01eb, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00bd, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x031f, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0321, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean hotel(KeyEvent keyEvent) {
        int i4;
        boolean z2;
        int i5;
        long delta = AbstractC1996c.delta(keyEvent);
        int foxtrot = AbstractC1996c.foxtrot(keyEvent);
        int i10 = 1;
        char c3 = '\b';
        int i11 = 0;
        if (foxtrot == 2) {
            bv.ae aeVar = this.foxtrot;
            if (aeVar == null) {
                aeVar = new bv.ae(3);
                this.foxtrot = aeVar;
            }
            bv.ae aeVar2 = aeVar;
            int i12 = ((int) (delta ^ (delta >>> 32))) * (-862048943);
            int i13 = i12 ^ (i12 << 16);
            int i14 = i13 >>> 7;
            int i15 = i13 & 127;
            int i16 = aeVar2.charlie;
            int i17 = i14 & i16;
            int i18 = 0;
            loop0: while (true) {
                long[] jArr = aeVar2.alpha;
                int i19 = i17 >> 3;
                int i20 = (i17 & 7) << 3;
                long j5 = (jArr[i19] >>> i20) | ((jArr[i19 + i10] << (64 - i20)) & ((-i20) >> 63));
                long j6 = i15;
                long j7 = j5 ^ (j6 * 72340172838076673L);
                long j10 = (j7 - 72340172838076673L) & (~j7) & (-9187201950435737472L);
                while (true) {
                    if (j10 == 0) {
                        break;
                    }
                    i5 = (i17 + (Long.numberOfTrailingZeros(j10) >> 3)) & i16;
                    z2 = i10;
                    if (aeVar2.bravo[i5] == delta) {
                        break loop0;
                    }
                    j10 &= j10 - 1;
                    i10 = z2 ? 1 : 0;
                }
                i18 += 8;
                i17 = (i17 + i18) & i16;
                i10 = z2 ? 1 : 0;
            }
            aeVar2.bravo[i5] = delta;
            return z2;
        }
        if (foxtrot != 1) {
            return true;
        }
        bv.ae aeVar3 = this.foxtrot;
        if (aeVar3 == null || !aeVar3.alpha(delta)) {
            return false;
        }
        bv.ae aeVar4 = this.foxtrot;
        if (aeVar4 != null) {
            int i21 = ((int) ((delta >>> 32) ^ delta)) * (-862048943);
            int i22 = i21 ^ (i21 << 16);
            int i23 = i22 & 127;
            int i24 = aeVar4.charlie;
            int i25 = i22 >>> 7;
            loop5: while (true) {
                int i26 = i25 & i24;
                long[] jArr2 = aeVar4.alpha;
                int i27 = i26 >> 3;
                int i28 = (i26 & 7) << 3;
                long j11 = ((jArr2[i27 + 1] << (64 - i28)) & ((-i28) >> 63)) | (jArr2[i27] >>> i28);
                long j12 = (i23 * 72340172838076673L) ^ j11;
                long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j13 == 0) {
                        break;
                    }
                    i4 = ((Long.numberOfTrailingZeros(j13) >> 3) + i26) & i24;
                    if (aeVar4.bravo[i4] == delta) {
                        break loop5;
                    }
                    j13 &= j13 - 1;
                }
                i11 += 8;
                i25 = i26 + i11;
            }
            if (i4 >= 0) {
                aeVar4.delta--;
                long[] jArr3 = aeVar4.alpha;
                int i29 = aeVar4.charlie;
                int i30 = i4 >> 3;
                int i31 = (i4 & 7) << 3;
                long j14 = (jArr3[i30] & (~(255 << i31))) | (254 << i31);
                jArr3[i30] = j14;
                jArr3[(((i4 - 7) & i29) + (i29 & 7)) >> 3] = j14;
                return true;
            }
        }
        return true;
    }
}
