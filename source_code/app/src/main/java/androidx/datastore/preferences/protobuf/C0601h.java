package androidx.datastore.preferences.protobuf;

import com.airbnb.lottie.compose.LottieConstants;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0601h {
    public final Pf.g alpha;
    public int bravo;
    public int charlie;
    public int delta = 0;

    public C0601h(Pf.g gVar) {
        Charset charset = u.alpha;
        this.alpha = gVar;
        gVar.purple = this;
    }

    public final int alpha() {
        int i4 = this.delta;
        if (i4 != 0) {
            this.bravo = i4;
            this.delta = 0;
        } else {
            this.bravo = this.alpha.yankee();
        }
        int i5 = this.bravo;
        if (i5 != 0 && i5 != this.charlie) {
            return i5 >>> 3;
        }
        return LottieConstants.IterateForever;
    }

    public final void bravo(Object obj, as asVar, C0604k c0604k) {
        int i4 = this.charlie;
        this.charlie = ((this.bravo >>> 3) << 3) | 4;
        try {
            asVar.india(obj, this, c0604k);
            if (this.bravo == this.charlie) {
            } else {
                throw InvalidProtocolBufferException.parseFailure();
            }
        } finally {
            this.charlie = i4;
        }
    }

    public final void charlie(Object obj, as asVar, C0604k c0604k) {
        Pf.g gVar = this.alpha;
        int zulu = gVar.zulu();
        if (gVar.alpha < 100) {
            int india = gVar.india(zulu);
            gVar.alpha++;
            asVar.india(obj, this, c0604k);
            gVar.alpha(0);
            gVar.alpha--;
            gVar.hotel(india);
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public final void delta(t tVar) {
        int yankee;
        int i4 = this.bravo & 7;
        Pf.g gVar = this.alpha;
        if (i4 != 0) {
            if (i4 == 2) {
                int bravo = gVar.bravo() + gVar.zulu();
                do {
                    ((aq) tVar).add(Boolean.valueOf(gVar.juliet()));
                } while (gVar.bravo() < bravo);
                victor(bravo);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            ((aq) tVar).add(Boolean.valueOf(gVar.juliet()));
            if (gVar.charlie()) {
                return;
            } else {
                yankee = gVar.yankee();
            }
        } while (yankee == this.bravo);
        this.delta = yankee;
    }

    public final C0599f echo() {
        whiskey(2);
        return this.alpha.kilo();
    }

    public final void foxtrot(t tVar) {
        int yankee;
        if ((this.bravo & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            ((aq) tVar).add(echo());
            Pf.g gVar = this.alpha;
            if (gVar.charlie()) {
                return;
            } else {
                yankee = gVar.yankee();
            }
        } while (yankee == this.bravo);
        this.delta = yankee;
    }

    public final void golf(t tVar) {
        int yankee;
        int i4 = this.bravo & 7;
        Pf.g gVar = this.alpha;
        if (i4 != 1) {
            if (i4 == 2) {
                int zulu = gVar.zulu();
                if ((zulu & 7) == 0) {
                    int bravo = gVar.bravo() + zulu;
                    do {
                        ((aq) tVar).add(Double.valueOf(gVar.lima()));
                    } while (gVar.bravo() < bravo);
                    return;
                }
                throw InvalidProtocolBufferException.parseFailure();
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            ((aq) tVar).add(Double.valueOf(gVar.lima()));
            if (gVar.charlie()) {
                return;
            } else {
                yankee = gVar.yankee();
            }
        } while (yankee == this.bravo);
        this.delta = yankee;
    }

    public final void hotel(t tVar) {
        int yankee;
        int i4 = this.bravo & 7;
        Pf.g gVar = this.alpha;
        if (i4 != 0) {
            if (i4 == 2) {
                int bravo = gVar.bravo() + gVar.zulu();
                do {
                    ((aq) tVar).add(Integer.valueOf(gVar.mike()));
                } while (gVar.bravo() < bravo);
                victor(bravo);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            ((aq) tVar).add(Integer.valueOf(gVar.mike()));
            if (gVar.charlie()) {
                return;
            } else {
                yankee = gVar.yankee();
            }
        } while (yankee == this.bravo);
        this.delta = yankee;
    }

    public final Object india(K k6, Class cls, C0604k c0604k) {
        int ordinal = k6.ordinal();
        Pf.g gVar = this.alpha;
        switch (ordinal) {
            case 0:
                whiskey(1);
                return Double.valueOf(gVar.lima());
            case 1:
                whiskey(5);
                return Float.valueOf(gVar.papa());
            case 2:
                whiskey(0);
                return Long.valueOf(gVar.romeo());
            case 3:
                whiskey(0);
                return Long.valueOf(gVar.amber());
            case 4:
                whiskey(0);
                return Integer.valueOf(gVar.quebec());
            case 5:
                whiskey(1);
                return Long.valueOf(gVar.oscar());
            case 6:
                whiskey(5);
                return Integer.valueOf(gVar.november());
            case 7:
                whiskey(0);
                return Boolean.valueOf(gVar.juliet());
            case 8:
                whiskey(2);
                return gVar.xray();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                whiskey(2);
                as alpha = ap.charlie.alpha(cls);
                s charlie = alpha.charlie();
                charlie(charlie, alpha, c0604k);
                alpha.alpha(charlie);
                return charlie;
            case 11:
                return echo();
            case 12:
                whiskey(0);
                return Integer.valueOf(gVar.zulu());
            case 13:
                whiskey(0);
                return Integer.valueOf(gVar.mike());
            case 14:
                whiskey(5);
                return Integer.valueOf(gVar.sierra());
            case 15:
                whiskey(1);
                return Long.valueOf(gVar.tango());
            case 16:
                whiskey(0);
                return Integer.valueOf(gVar.uniform());
            case 17:
                whiskey(0);
                return Long.valueOf(gVar.victor());
        }
    }

    public final void juliet(t tVar) {
        int yankee;
        int i4 = this.bravo & 7;
        Pf.g gVar = this.alpha;
        if (i4 != 2) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                ((aq) tVar).add(Integer.valueOf(gVar.november()));
                if (!gVar.charlie()) {
                    yankee = gVar.yankee();
                } else {
                    return;
                }
            } while (yankee == this.bravo);
            this.delta = yankee;
            return;
        }
        int zulu = gVar.zulu();
        if ((zulu & 3) == 0) {
            int bravo = gVar.bravo() + zulu;
            do {
                ((aq) tVar).add(Integer.valueOf(gVar.november()));
            } while (gVar.bravo() < bravo);
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    public final void kilo(t tVar) {
        int yankee;
        int i4 = this.bravo & 7;
        Pf.g gVar = this.alpha;
        if (i4 != 1) {
            if (i4 == 2) {
                int zulu = gVar.zulu();
                if ((zulu & 7) == 0) {
                    int bravo = gVar.bravo() + zulu;
                    do {
                        ((aq) tVar).add(Long.valueOf(gVar.oscar()));
                    } while (gVar.bravo() < bravo);
                    return;
                }
                throw InvalidProtocolBufferException.parseFailure();
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            ((aq) tVar).add(Long.valueOf(gVar.oscar()));
            if (gVar.charlie()) {
                return;
            } else {
                yankee = gVar.yankee();
            }
        } while (yankee == this.bravo);
        this.delta = yankee;
    }

    public final void lima(t tVar) {
        int yankee;
        int i4 = this.bravo & 7;
        Pf.g gVar = this.alpha;
        if (i4 != 2) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                ((aq) tVar).add(Float.valueOf(gVar.papa()));
                if (!gVar.charlie()) {
                    yankee = gVar.yankee();
                } else {
                    return;
                }
            } while (yankee == this.bravo);
            this.delta = yankee;
            return;
        }
        int zulu = gVar.zulu();
        if ((zulu & 3) == 0) {
            int bravo = gVar.bravo() + zulu;
            do {
                ((aq) tVar).add(Float.valueOf(gVar.papa()));
            } while (gVar.bravo() < bravo);
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    public final void mike(t tVar) {
        int yankee;
        int i4 = this.bravo & 7;
        Pf.g gVar = this.alpha;
        if (i4 != 0) {
            if (i4 == 2) {
                int bravo = gVar.bravo() + gVar.zulu();
                do {
                    ((aq) tVar).add(Integer.valueOf(gVar.quebec()));
                } while (gVar.bravo() < bravo);
                victor(bravo);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            ((aq) tVar).add(Integer.valueOf(gVar.quebec()));
            if (gVar.charlie()) {
                return;
            } else {
                yankee = gVar.yankee();
            }
        } while (yankee == this.bravo);
        this.delta = yankee;
    }

    public final void november(t tVar) {
        int yankee;
        int i4 = this.bravo & 7;
        Pf.g gVar = this.alpha;
        if (i4 != 0) {
            if (i4 == 2) {
                int bravo = gVar.bravo() + gVar.zulu();
                do {
                    ((aq) tVar).add(Long.valueOf(gVar.romeo()));
                } while (gVar.bravo() < bravo);
                victor(bravo);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            ((aq) tVar).add(Long.valueOf(gVar.romeo()));
            if (gVar.charlie()) {
                return;
            } else {
                yankee = gVar.yankee();
            }
        } while (yankee == this.bravo);
        this.delta = yankee;
    }

    public final void oscar(t tVar) {
        int yankee;
        int i4 = this.bravo & 7;
        Pf.g gVar = this.alpha;
        if (i4 != 2) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                ((aq) tVar).add(Integer.valueOf(gVar.sierra()));
                if (!gVar.charlie()) {
                    yankee = gVar.yankee();
                } else {
                    return;
                }
            } while (yankee == this.bravo);
            this.delta = yankee;
            return;
        }
        int zulu = gVar.zulu();
        if ((zulu & 3) == 0) {
            int bravo = gVar.bravo() + zulu;
            do {
                ((aq) tVar).add(Integer.valueOf(gVar.sierra()));
            } while (gVar.bravo() < bravo);
            return;
        }
        throw InvalidProtocolBufferException.parseFailure();
    }

    public final void papa(t tVar) {
        int yankee;
        int i4 = this.bravo & 7;
        Pf.g gVar = this.alpha;
        if (i4 != 1) {
            if (i4 == 2) {
                int zulu = gVar.zulu();
                if ((zulu & 7) == 0) {
                    int bravo = gVar.bravo() + zulu;
                    do {
                        ((aq) tVar).add(Long.valueOf(gVar.tango()));
                    } while (gVar.bravo() < bravo);
                    return;
                }
                throw InvalidProtocolBufferException.parseFailure();
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            ((aq) tVar).add(Long.valueOf(gVar.tango()));
            if (gVar.charlie()) {
                return;
            } else {
                yankee = gVar.yankee();
            }
        } while (yankee == this.bravo);
        this.delta = yankee;
    }

    public final void quebec(t tVar) {
        int yankee;
        int i4 = this.bravo & 7;
        Pf.g gVar = this.alpha;
        if (i4 != 0) {
            if (i4 == 2) {
                int bravo = gVar.bravo() + gVar.zulu();
                do {
                    ((aq) tVar).add(Integer.valueOf(gVar.uniform()));
                } while (gVar.bravo() < bravo);
                victor(bravo);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            ((aq) tVar).add(Integer.valueOf(gVar.uniform()));
            if (gVar.charlie()) {
                return;
            } else {
                yankee = gVar.yankee();
            }
        } while (yankee == this.bravo);
        this.delta = yankee;
    }

    public final void romeo(t tVar) {
        int yankee;
        int i4 = this.bravo & 7;
        Pf.g gVar = this.alpha;
        if (i4 != 0) {
            if (i4 == 2) {
                int bravo = gVar.bravo() + gVar.zulu();
                do {
                    ((aq) tVar).add(Long.valueOf(gVar.victor()));
                } while (gVar.bravo() < bravo);
                victor(bravo);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            ((aq) tVar).add(Long.valueOf(gVar.victor()));
            if (gVar.charlie()) {
                return;
            } else {
                yankee = gVar.yankee();
            }
        } while (yankee == this.bravo);
        this.delta = yankee;
    }

    public final void sierra(t tVar, boolean z2) {
        String whiskey;
        int yankee;
        if ((this.bravo & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            Pf.g gVar = this.alpha;
            if (z2) {
                whiskey(2);
                whiskey = gVar.xray();
            } else {
                whiskey(2);
                whiskey = gVar.whiskey();
            }
            ((aq) tVar).add(whiskey);
            if (gVar.charlie()) {
                return;
            } else {
                yankee = gVar.yankee();
            }
        } while (yankee == this.bravo);
        this.delta = yankee;
    }

    public final void tango(t tVar) {
        int yankee;
        int i4 = this.bravo & 7;
        Pf.g gVar = this.alpha;
        if (i4 != 0) {
            if (i4 == 2) {
                int bravo = gVar.bravo() + gVar.zulu();
                do {
                    ((aq) tVar).add(Integer.valueOf(gVar.zulu()));
                } while (gVar.bravo() < bravo);
                victor(bravo);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            ((aq) tVar).add(Integer.valueOf(gVar.zulu()));
            if (gVar.charlie()) {
                return;
            } else {
                yankee = gVar.yankee();
            }
        } while (yankee == this.bravo);
        this.delta = yankee;
    }

    public final void uniform(t tVar) {
        int yankee;
        int i4 = this.bravo & 7;
        Pf.g gVar = this.alpha;
        if (i4 != 0) {
            if (i4 == 2) {
                int bravo = gVar.bravo() + gVar.zulu();
                do {
                    ((aq) tVar).add(Long.valueOf(gVar.amber()));
                } while (gVar.bravo() < bravo);
                victor(bravo);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            ((aq) tVar).add(Long.valueOf(gVar.amber()));
            if (gVar.charlie()) {
                return;
            } else {
                yankee = gVar.yankee();
            }
        } while (yankee == this.bravo);
        this.delta = yankee;
    }

    public final void victor(int i4) {
        if (this.alpha.bravo() == i4) {
        } else {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void whiskey(int i4) {
        if ((this.bravo & 7) == i4) {
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public final boolean xray() {
        int i4;
        Pf.g gVar = this.alpha;
        if (!gVar.charlie() && (i4 = this.bravo) != this.charlie) {
            return gVar.azure(i4);
        }
        return false;
    }
}
