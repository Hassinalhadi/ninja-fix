package Ie;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class aj extends Oe.o implements Oe.w {

    /* renamed from: a, reason: collision with root package name */
    public static final aj f1458a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0181a f1459b = new C0181a(14);
    public final Oe.e alpha;
    public int purple;
    public int red;
    public int silver;
    public ai teal;
    public byte white;
    public int yellow;

    static {
        aj ajVar = new aj();
        f1458a = ajVar;
        ajVar.red = -1;
        ajVar.silver = 0;
        ajVar.teal = ai.PACKAGE;
    }

    public aj() {
        this.white = (byte) -1;
        this.yellow = -1;
        this.alpha = Oe.e.alpha;
    }

    @Override // Oe.w
    public final boolean alpha() {
        byte b2 = this.white;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.purple & 2) == 2) {
            this.white = (byte) 1;
            return true;
        }
        this.white = (byte) 0;
        return false;
    }

    @Override // Oe.v
    public final Oe.j charlie() {
        ah kilo = ah.kilo();
        kilo.lima(this);
        return kilo;
    }

    @Override // Oe.v
    public final int delta() {
        int i4;
        int i5 = this.yellow;
        if (i5 != -1) {
            return i5;
        }
        if ((this.purple & 1) == 1) {
            i4 = F0.e.charlie(1, this.red);
        } else {
            i4 = 0;
        }
        if ((this.purple & 2) == 2) {
            i4 += F0.e.charlie(2, this.silver);
        }
        if ((this.purple & 4) == 4) {
            i4 += F0.e.bravo(3, this.teal.alpha);
        }
        int size = this.alpha.size() + i4;
        this.yellow = size;
        return size;
    }

    @Override // Oe.v
    public final void echo(F0.e eVar) {
        delta();
        if ((this.purple & 1) == 1) {
            eVar.xray(1, this.red);
        }
        if ((this.purple & 2) == 2) {
            eVar.xray(2, this.silver);
        }
        if ((this.purple & 4) == 4) {
            eVar.whiskey(3, this.teal.alpha);
        }
        eVar.beige(this.alpha);
    }

    @Override // Oe.v
    public final Oe.j foxtrot() {
        return ah.kilo();
    }

    public aj(ah ahVar) {
        this.white = (byte) -1;
        this.yellow = -1;
        this.alpha = ahVar.alpha;
    }

    public aj(Oe.f fVar) {
        ai aiVar;
        this.white = (byte) -1;
        this.yellow = -1;
        this.red = -1;
        boolean z2 = false;
        this.silver = 0;
        ai aiVar2 = ai.PACKAGE;
        this.teal = aiVar2;
        Oe.d dVar = new Oe.d();
        F0.e romeo = F0.e.romeo(dVar, 1);
        while (!z2) {
            try {
                try {
                    int mike = fVar.mike();
                    if (mike != 0) {
                        if (mike == 8) {
                            this.purple |= 1;
                            this.red = fVar.juliet();
                        } else if (mike == 16) {
                            this.purple |= 2;
                            this.silver = fVar.juliet();
                        } else if (mike != 24) {
                            if (!fVar.papa(mike, romeo)) {
                            }
                        } else {
                            int juliet = fVar.juliet();
                            if (juliet == 0) {
                                aiVar = ai.CLASS;
                            } else if (juliet != 1) {
                                aiVar = juliet != 2 ? null : ai.LOCAL;
                            } else {
                                aiVar = aiVar2;
                            }
                            if (aiVar == null) {
                                romeo.coral(mike);
                                romeo.coral(juliet);
                            } else {
                                this.purple |= 4;
                                this.teal = aiVar;
                            }
                        }
                    }
                    z2 = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e4) {
                    throw new InvalidProtocolBufferException(e4.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                try {
                    romeo.juliet();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    throw th2;
                }
                throw th;
            }
        }
        try {
            romeo.juliet();
        } catch (IOException unused2) {
        } finally {
            this.alpha = dVar.foxtrot();
        }
    }
}
