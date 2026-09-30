package Ie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class m extends Oe.j implements Oe.w {
    public final /* synthetic */ int purple;
    public int red;
    public List silver;

    public /* synthetic */ m(int i4) {
        this.purple = i4;
    }

    public final Object clone() {
        switch (this.purple) {
            case 0:
                m mVar = new m(0);
                mVar.silver = Collections.EMPTY_LIST;
                mVar.november(juliet());
                return mVar;
            case 1:
                m mVar2 = new m(1);
                mVar2.silver = Collections.EMPTY_LIST;
                mVar2.oscar(kilo());
                return mVar2;
            case 2:
                m mVar3 = new m(2);
                mVar3.silver = Collections.EMPTY_LIST;
                mVar3.quebec(mike());
                return mVar3;
            default:
                m mVar4 = new m(3);
                mVar4.silver = Oe.r.purple;
                mVar4.papa(lima());
                return mVar4;
        }
    }

    @Override // Oe.j
    public final Oe.v golf() {
        switch (this.purple) {
            case 0:
                n juliet = juliet();
                if (juliet.alpha()) {
                    return juliet;
                }
                throw new UninitializedMessageException(juliet);
            case 1:
                ak kilo = kilo();
                if (kilo.alpha()) {
                    return kilo;
                }
                throw new UninitializedMessageException(kilo);
            case 2:
                D mike = mike();
                mike.alpha();
                return mike;
            default:
                al lima = lima();
                lima.alpha();
                return lima;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0085  */
    @Override // Oe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Oe.j hotel(Oe.f fVar, Oe.h hVar) {
        switch (this.purple) {
            case 0:
                n nVar = null;
                try {
                    try {
                        n.white.getClass();
                        november(new n(fVar, hVar));
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        n nVar2 = (n) e.getUnfinishedMessage();
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            nVar = nVar2;
                            if (nVar != null) {
                                november(nVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (nVar != null) {
                    }
                    throw th;
                }
            case 1:
                ak akVar = null;
                try {
                    try {
                        ak.white.getClass();
                        oscar(new ak(fVar, hVar));
                        return this;
                    } catch (InvalidProtocolBufferException e4) {
                        ak akVar2 = (ak) e4.getUnfinishedMessage();
                        try {
                            throw e4;
                        } catch (Throwable th3) {
                            th = th3;
                            akVar = akVar2;
                            if (akVar != null) {
                                oscar(akVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (akVar != null) {
                    }
                    throw th;
                }
            case 2:
                D d4 = null;
                try {
                    try {
                        D.white.getClass();
                        quebec(new D(fVar, hVar));
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        D d9 = (D) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th5) {
                            th = th5;
                            d4 = d9;
                            if (d4 != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (d4 != null) {
                        quebec(d4);
                    }
                    throw th;
                }
            default:
                al alVar = null;
                try {
                    try {
                        al.white.getClass();
                        papa(new al(fVar));
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        al alVar2 = (al) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th7) {
                            th = th7;
                            alVar = alVar2;
                            if (alVar != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (alVar != null) {
                        papa(alVar);
                    }
                    throw th;
                }
        }
    }

    @Override // Oe.j
    public final /* bridge */ /* synthetic */ Oe.j india(Oe.o oVar) {
        switch (this.purple) {
            case 0:
                november((n) oVar);
                return this;
            case 1:
                oscar((ak) oVar);
                return this;
            case 2:
                quebec((D) oVar);
                return this;
            default:
                papa((al) oVar);
                return this;
        }
    }

    public n juliet() {
        n nVar = new n(this);
        if ((this.red & 1) == 1) {
            this.silver = Collections.unmodifiableList(this.silver);
            this.red &= -2;
        }
        nVar.purple = this.silver;
        return nVar;
    }

    public ak kilo() {
        ak akVar = new ak(this);
        if ((this.red & 1) == 1) {
            this.silver = Collections.unmodifiableList(this.silver);
            this.red &= -2;
        }
        akVar.purple = this.silver;
        return akVar;
    }

    public al lima() {
        al alVar = new al(this);
        if ((this.red & 1) == 1) {
            this.silver = ((Oe.s) this.silver).echo();
            this.red &= -2;
        }
        alVar.purple = (Oe.s) this.silver;
        return alVar;
    }

    public D mike() {
        D d4 = new D(this);
        if ((this.red & 1) == 1) {
            this.silver = Collections.unmodifiableList(this.silver);
            this.red &= -2;
        }
        d4.purple = this.silver;
        return d4;
    }

    public void november(n nVar) {
        if (nVar == n.teal) {
            return;
        }
        if (!nVar.purple.isEmpty()) {
            if (this.silver.isEmpty()) {
                this.silver = nVar.purple;
                this.red &= -2;
            } else {
                if ((this.red & 1) != 1) {
                    this.silver = new ArrayList(this.silver);
                    this.red |= 1;
                }
                this.silver.addAll(nVar.purple);
            }
        }
        this.alpha = this.alpha.bravo(nVar.alpha);
    }

    public void oscar(ak akVar) {
        if (akVar == ak.teal) {
            return;
        }
        if (!akVar.purple.isEmpty()) {
            if (this.silver.isEmpty()) {
                this.silver = akVar.purple;
                this.red &= -2;
            } else {
                if ((this.red & 1) != 1) {
                    this.silver = new ArrayList(this.silver);
                    this.red |= 1;
                }
                this.silver.addAll(akVar.purple);
            }
        }
        this.alpha = this.alpha.bravo(akVar.alpha);
    }

    public void papa(al alVar) {
        if (alVar == al.teal) {
            return;
        }
        if (!alVar.purple.isEmpty()) {
            if (((Oe.s) this.silver).isEmpty()) {
                this.silver = alVar.purple;
                this.red &= -2;
            } else {
                if ((this.red & 1) != 1) {
                    this.silver = new Oe.r((Oe.s) this.silver);
                    this.red |= 1;
                }
                ((Oe.s) this.silver).addAll(alVar.purple);
            }
        }
        this.alpha = this.alpha.bravo(alVar.alpha);
    }

    public void quebec(D d4) {
        if (d4 == D.teal) {
            return;
        }
        if (!d4.purple.isEmpty()) {
            if (this.silver.isEmpty()) {
                this.silver = d4.purple;
                this.red &= -2;
            } else {
                if ((this.red & 1) != 1) {
                    this.silver = new ArrayList(this.silver);
                    this.red |= 1;
                }
                this.silver.addAll(d4.purple);
            }
        }
        this.alpha = this.alpha.bravo(d4.alpha);
    }
}
