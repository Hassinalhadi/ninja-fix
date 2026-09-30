package S;

import bv.am;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends c {
    public final c oscar;
    public boolean papa;

    public d(long j5, l lVar, Function1 function1, Function1 function12, c cVar) {
        super(j5, lVar, function1, function12);
        this.oscar = cVar;
        cVar.kilo();
    }

    @Override // S.c, S.g
    public final void charlie() {
        if (!this.charlie) {
            super.charlie();
            if (!this.papa) {
                this.papa = true;
                this.oscar.lima();
            }
        }
    }

    @Override // S.c
    public final u whiskey() {
        HashMap hashMap;
        d dVar;
        c cVar = this.oscar;
        if (!cVar.mike && !cVar.charlie) {
            am amVar = this.hotel;
            long j5 = this.bravo;
            if (amVar != null) {
                hashMap = n.charlie(cVar.golf(), this, this.oscar.delta());
            } else {
                hashMap = null;
            }
            synchronized (n.charlie) {
                try {
                    n.delta(this);
                    try {
                        if (amVar == null || amVar.delta == 0) {
                            dVar = this;
                            alpha();
                        } else {
                            dVar = this;
                            u zulu = dVar.zulu(this.oscar.golf(), amVar, hashMap, this.oscar.delta());
                            if (!Intrinsics.areEqual(zulu, i.bravo)) {
                                return zulu;
                            }
                            am xray = dVar.oscar.xray();
                            if (xray != null) {
                                xray.juliet(amVar);
                            } else {
                                dVar.oscar.beige(amVar);
                                dVar.hotel = null;
                            }
                        }
                        if (Intrinsics.hotel(dVar.oscar.golf(), j5) < 0) {
                            dVar.oscar.victor();
                        }
                        c cVar2 = dVar.oscar;
                        cVar2.romeo(cVar2.delta().bravo(j5).alpha(dVar.juliet));
                        dVar.oscar.amber(j5);
                        c cVar3 = dVar.oscar;
                        int i4 = dVar.delta;
                        dVar.delta = -1;
                        if (i4 >= 0) {
                            int[] iArr = cVar3.kilo;
                            Intrinsics.echo(iArr, "<this>");
                            int length = iArr.length;
                            int[] copyOf = Arrays.copyOf(iArr, length + 1);
                            copyOf[length] = i4;
                            Intrinsics.checkNotNull(copyOf);
                            cVar3.kilo = copyOf;
                        } else {
                            cVar3.getClass();
                        }
                        dVar.oscar.azure(dVar.juliet);
                        c cVar4 = dVar.oscar;
                        int[] iArr2 = dVar.kilo;
                        cVar4.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = cVar4.kilo;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                                Intrinsics.checkNotNull(copyOf2);
                                iArr2 = copyOf2;
                            }
                            cVar4.kilo = iArr2;
                        }
                        dVar.mike = true;
                        if (!dVar.papa) {
                            dVar.papa = true;
                            dVar.oscar.lima();
                        }
                        return i.bravo;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } else {
            return new h(this);
        }
    }
}
