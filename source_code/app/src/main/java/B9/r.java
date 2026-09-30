package B9;

import android.os.Trace;
import androidx.compose.runtime.C0565b0;
import androidx.compose.runtime.InterfaceC0563a0;
import androidx.compose.runtime.InterfaceC0578j;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class r {
    public Object alpha;
    public Object bravo;
    public Object charlie;
    public Object delta;
    public Object echo;
    public Object foxtrot;
    public Object golf;
    public Object hotel;
    public Object india;
    public Object juliet;
    public Object kilo;

    public r() {
        J.e eVar = new J.e(new C0565b0[16]);
        this.charlie = eVar;
        bv.am amVar = bv.av.alpha;
        this.delta = new bv.am();
        this.echo = eVar;
        this.foxtrot = new J.e(new Object[16]);
        this.golf = new J.e(new Function0[16]);
    }

    public static final boolean foxtrot(C0565b0 c0565b0, J.e eVar) {
        Object[] objArr = eVar.alpha;
        int i4 = eVar.red;
        for (int i5 = 0; i5 < i4; i5++) {
            InterfaceC0563a0 interfaceC0563a0 = ((C0565b0) objArr[i5]).alpha;
            if (interfaceC0563a0 instanceof P.g) {
                J.e eVar2 = ((P.g) interfaceC0563a0).purple;
                if (eVar2.lima(c0565b0) || foxtrot(c0565b0, eVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void alpha() {
        this.alpha = null;
        this.bravo = null;
        J.e eVar = (J.e) this.charlie;
        eVar.india();
        ((bv.am) this.delta).bravo();
        this.echo = eVar;
        ((J.e) this.foxtrot).india();
        ((J.e) this.golf).india();
        this.hotel = null;
        this.india = null;
        this.juliet = null;
    }

    public void bravo() {
        Set set = (Set) this.alpha;
        if (set != null && !set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    InterfaceC0563a0 interfaceC0563a0 = (InterfaceC0563a0) it.next();
                    it.remove();
                    interfaceC0563a0.alpha();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public void charlie() {
        Set set = (Set) this.alpha;
        if (set != null) {
            this.kilo = null;
            J.e eVar = (J.e) this.foxtrot;
            if (eVar.red != 0) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    bv.am amVar = (bv.am) this.hotel;
                    int i4 = eVar.red;
                    while (true) {
                        i4--;
                        if (-1 >= i4) {
                            break;
                        }
                        Object obj = eVar.alpha[i4];
                        try {
                            if (obj instanceof C0565b0) {
                                InterfaceC0563a0 interfaceC0563a0 = ((C0565b0) obj).alpha;
                                set.remove(interfaceC0563a0);
                                interfaceC0563a0.bravo();
                            }
                            if (obj instanceof InterfaceC0578j) {
                                if (amVar != null && amVar.charlie(obj)) {
                                    ((InterfaceC0578j) obj).alpha();
                                } else {
                                    ((InterfaceC0578j) obj).bravo();
                                }
                            }
                        } catch (Throwable th) {
                            androidx.compose.runtime.tooling.c cVar = (androidx.compose.runtime.tooling.c) this.bravo;
                            if (cVar != null) {
                                androidx.compose.runtime.tooling.b.alpha(th, new Yb.F(7, cVar, obj));
                            }
                            throw th;
                        }
                    }
                } finally {
                    Trace.endSection();
                }
            }
            J.e eVar2 = (J.e) this.charlie;
            if (eVar2.red != 0) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    Set set2 = (Set) this.alpha;
                    if (set2 != null) {
                        Object[] objArr = eVar2.alpha;
                        int i5 = eVar2.red;
                        for (int i10 = 0; i10 < i5; i10++) {
                            C0565b0 c0565b0 = (C0565b0) objArr[i10];
                            InterfaceC0563a0 interfaceC0563a02 = c0565b0.alpha;
                            set2.remove(interfaceC0563a02);
                            try {
                                interfaceC0563a02.delta();
                            } catch (Throwable th2) {
                                androidx.compose.runtime.tooling.c cVar2 = (androidx.compose.runtime.tooling.c) this.bravo;
                                if (cVar2 != null) {
                                    androidx.compose.runtime.tooling.b.alpha(th2, new Yb.F(7, cVar2, c0565b0));
                                }
                                throw th2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    public void delta() {
        J.e eVar = (J.e) this.golf;
        if (eVar.red != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = eVar.alpha;
                int i4 = eVar.red;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((Function0) objArr[i5]).invoke();
                }
                eVar.india();
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public void echo(C0565b0 c0565b0) {
        if (((bv.am) this.delta).charlie(c0565b0)) {
            ((bv.am) this.delta).lima(c0565b0);
            if (!((J.e) this.echo).lima(c0565b0)) {
                J.e eVar = (J.e) this.charlie;
                if (!eVar.lima(c0565b0)) {
                    foxtrot(c0565b0, eVar);
                }
            }
            Set set = (Set) this.alpha;
            if (set != null) {
                set.add(c0565b0.alpha);
            } else {
                return;
            }
        }
        bv.am amVar = (bv.am) this.kilo;
        if (amVar != null && amVar.charlie(c0565b0)) {
            return;
        }
        ((J.e) this.foxtrot).bravo(c0565b0);
    }

    public void golf(Set set, androidx.compose.runtime.tooling.c cVar) {
        alpha();
        this.alpha = set;
        this.bravo = cVar;
    }
}
