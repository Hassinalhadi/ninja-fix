package Y;

import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function1;
import p0.AbstractC2264a;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.InterfaceC2554n;

/* loaded from: classes3.dex */
public final class s {
    public static final s bravo = new s();
    public static final s charlie = new s();
    public static final s delta = new s();
    public final J.e alpha = new J.e(new t[16]);

    public static void bravo(s sVar) {
        sVar.getClass();
        sVar.alpha(new p(1, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0056, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean alpha(Function1 function1) {
        boolean echo;
        boolean z2;
        boolean z10;
        if (this != bravo) {
            if (this != charlie) {
                J.e eVar = this.alpha;
                int i4 = eVar.red;
                if (i4 == 0) {
                    System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                    return false;
                }
                Object[] objArr = eVar.alpha;
                boolean z11 = false;
                for (int i5 = 0; i5 < i4; i5++) {
                    InterfaceC2554n interfaceC2554n = (t) objArr[i5];
                    if (!((T.r) interfaceC2554n).getNode().isAttached()) {
                        AbstractC2264a.bravo("visitChildren called on an unattached node");
                    }
                    J.e eVar2 = new J.e(new T.r[16]);
                    T.r rVar = (T.r) interfaceC2554n;
                    T.r child$ui_release = rVar.getNode().getChild$ui_release();
                    if (child$ui_release == null) {
                        AbstractC2555o.alpha(eVar2, rVar.getNode());
                    } else {
                        eVar2.bravo(child$ui_release);
                    }
                    while (true) {
                        int i10 = eVar2.red;
                        if (i10 != 0) {
                            T.r rVar2 = (T.r) eVar2.mike(i10 - 1);
                            if ((rVar2.getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) == 0) {
                                AbstractC2555o.alpha(eVar2, rVar2);
                            } else {
                                while (true) {
                                    if (rVar2 == null) {
                                        break;
                                    }
                                    if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                        J.e eVar3 = null;
                                        while (rVar2 != null) {
                                            if (rVar2 instanceof aa) {
                                                aa aaVar = (aa) rVar2;
                                                if (aaVar.c().alpha) {
                                                    echo = ((Boolean) function1.invoke(aaVar)).booleanValue();
                                                } else {
                                                    echo = ae.echo(aaVar, 7, function1);
                                                }
                                                if (echo) {
                                                    z11 = true;
                                                    break;
                                                }
                                            } else {
                                                if ((rVar2.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (z2 && (rVar2 instanceof AbstractC2556p)) {
                                                    int i11 = 0;
                                                    for (T.r rVar3 = ((AbstractC2556p) rVar2).purple; rVar3 != null; rVar3 = rVar3.getChild$ui_release()) {
                                                        if ((rVar3.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = false;
                                                        }
                                                        if (z10) {
                                                            i11++;
                                                            if (i11 == 1) {
                                                                rVar2 = rVar3;
                                                            } else {
                                                                if (eVar3 == null) {
                                                                    eVar3 = new J.e(new T.r[16]);
                                                                }
                                                                if (rVar2 != null) {
                                                                    eVar3.bravo(rVar2);
                                                                    rVar2 = null;
                                                                }
                                                                eVar3.bravo(rVar3);
                                                            }
                                                        }
                                                    }
                                                    if (i11 == 1) {
                                                    }
                                                }
                                            }
                                            rVar2 = AbstractC2555o.bravo(eVar3);
                                        }
                                    } else {
                                        rVar2 = rVar2.getChild$ui_release();
                                    }
                                }
                            }
                        }
                    }
                }
                return z11;
            }
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
    }
}
