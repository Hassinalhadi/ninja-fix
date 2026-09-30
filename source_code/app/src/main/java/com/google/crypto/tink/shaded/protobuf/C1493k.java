package com.google.crypto.tink.shaded.protobuf;

import com.airbnb.lottie.compose.LottieConstants;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1493k implements az {
    public final C1491i alpha;
    public int bravo;
    public int charlie;
    public int delta = 0;

    public C1493k(C1491i c1491i) {
        Charset charset = ab.alpha;
        this.alpha = c1491i;
        c1491i.charlie = this;
    }

    public static void lavender(int i4) {
        if ((i4 & 3) == 0) {
        } else {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public static void lime(int i4) {
        if ((i4 & 7) == 0) {
        } else {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void alpha(List list) {
        int lima;
        int lima2;
        boolean z2 = list instanceof y;
        C1491i c1491i = this.alpha;
        if (z2) {
            y yVar = (y) list;
            int i4 = this.bravo & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int charlie = c1491i.charlie() + c1491i.india();
                    do {
                        yVar.bravo(AbstractC1492j.alpha(c1491i.india()));
                    } while (c1491i.charlie() < charlie);
                    ivory(charlie);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                yVar.bravo(AbstractC1492j.alpha(c1491i.india()));
                if (!c1491i.delta()) {
                    lima2 = c1491i.lima();
                } else {
                    return;
                }
            } while (lima2 == this.bravo);
            this.delta = lima2;
            return;
        }
        int i5 = this.bravo & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int charlie2 = c1491i.charlie() + c1491i.india();
                do {
                    list.add(Integer.valueOf(AbstractC1492j.alpha(c1491i.india())));
                } while (c1491i.charlie() < charlie2);
                ivory(charlie2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(AbstractC1492j.alpha(c1491i.india())));
            if (c1491i.delta()) {
                return;
            } else {
                lima = c1491i.lima();
            }
        } while (lima == this.bravo);
        this.delta = lima;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void amber(List list) {
        indigo(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void azure(List list) {
        indigo(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final C1489g beige() {
        byte[] bArr;
        jade(2);
        C1491i c1491i = this.alpha;
        int india = c1491i.india();
        byte[] bArr2 = c1491i.delta;
        if (india > 0) {
            int i4 = c1491i.echo;
            int i5 = c1491i.golf;
            if (india <= i4 - i5) {
                C1489g delta = AbstractC1490h.delta(bArr2, i5, india);
                c1491i.golf += india;
                return delta;
            }
        }
        if (india == 0) {
            return AbstractC1490h.purple;
        }
        if (india > 0) {
            int i10 = c1491i.echo;
            int i11 = c1491i.golf;
            if (india <= i10 - i11) {
                int i12 = india + i11;
                c1491i.golf = i12;
                bArr = Arrays.copyOfRange(bArr2, i11, i12);
                C1489g c1489g = AbstractC1490h.purple;
                return new C1489g(bArr);
            }
        }
        if (india <= 0) {
            if (india == 0) {
                bArr = ab.bravo;
                C1489g c1489g2 = AbstractC1490h.purple;
                return new C1489g(bArr);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void black(List list) {
        int lima;
        int lima2;
        boolean z2 = list instanceof t;
        C1491i c1491i = this.alpha;
        if (z2) {
            t tVar = (t) list;
            int i4 = this.bravo & 7;
            if (i4 != 2) {
                if (i4 != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    tVar.bravo(Float.intBitsToFloat(c1491i.golf()));
                    if (!c1491i.delta()) {
                        lima2 = c1491i.lima();
                    } else {
                        return;
                    }
                } while (lima2 == this.bravo);
                this.delta = lima2;
                return;
            }
            int india = c1491i.india();
            lavender(india);
            int charlie = c1491i.charlie() + india;
            do {
                tVar.bravo(Float.intBitsToFloat(c1491i.golf()));
            } while (c1491i.charlie() < charlie);
            return;
        }
        int i5 = this.bravo & 7;
        if (i5 != 2) {
            if (i5 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(Float.intBitsToFloat(c1491i.golf())));
                if (!c1491i.delta()) {
                    lima = c1491i.lima();
                } else {
                    return;
                }
            } while (lima == this.bravo);
            this.delta = lima;
            return;
        }
        int india2 = c1491i.india();
        lavender(india2);
        int charlie2 = c1491i.charlie() + india2;
        do {
            list.add(Float.valueOf(Float.intBitsToFloat(c1491i.golf())));
        } while (c1491i.charlie() < charlie2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final int blue() {
        jade(0);
        return this.alpha.india();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final long bravo() {
        jade(0);
        return this.alpha.juliet();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final int bronze() {
        jade(5);
        return this.alpha.golf();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final long charlie() {
        jade(1);
        return this.alpha.hotel();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void coral(List list) {
        int lima;
        if ((this.bravo & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(beige());
            C1491i c1491i = this.alpha;
            if (c1491i.delta()) {
                return;
            } else {
                lima = c1491i.lima();
            }
        } while (lima == this.bravo);
        this.delta = lima;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void crimson(List list) {
        int lima;
        int lima2;
        boolean z2 = list instanceof AbstractC1496n;
        C1491i c1491i = this.alpha;
        if (z2) {
            AbstractC1496n abstractC1496n = (AbstractC1496n) list;
            int i4 = this.bravo & 7;
            if (i4 != 1) {
                if (i4 == 2) {
                    int india = c1491i.india();
                    lime(india);
                    int charlie = c1491i.charlie() + india;
                    do {
                        abstractC1496n.bravo(Double.longBitsToDouble(c1491i.hotel()));
                    } while (c1491i.charlie() < charlie);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                abstractC1496n.bravo(Double.longBitsToDouble(c1491i.hotel()));
                if (!c1491i.delta()) {
                    lima2 = c1491i.lima();
                } else {
                    return;
                }
            } while (lima2 == this.bravo);
            this.delta = lima2;
            return;
        }
        int i5 = this.bravo & 7;
        if (i5 != 1) {
            if (i5 == 2) {
                int india2 = c1491i.india();
                lime(india2);
                int charlie2 = c1491i.charlie() + india2;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(c1491i.hotel())));
                } while (c1491i.charlie() < charlie2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Double.valueOf(Double.longBitsToDouble(c1491i.hotel())));
            if (c1491i.delta()) {
                return;
            } else {
                lima = c1491i.lima();
            }
        } while (lima == this.bravo);
        this.delta = lima;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void cyan(List list, A a6, p pVar) {
        int lima;
        int i4 = this.bravo;
        if ((i4 & 7) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(gray(a6, pVar));
            C1491i c1491i = this.alpha;
            if (!c1491i.delta() && this.delta == 0) {
                lima = c1491i.lima();
            } else {
                return;
            }
        } while (lima == i4);
        this.delta = lima;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void delta(List list) {
        int lima;
        int lima2;
        boolean z2 = list instanceof y;
        C1491i c1491i = this.alpha;
        if (z2) {
            y yVar = (y) list;
            int i4 = this.bravo & 7;
            if (i4 != 2) {
                if (i4 != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    yVar.bravo(c1491i.golf());
                    if (!c1491i.delta()) {
                        lima2 = c1491i.lima();
                    } else {
                        return;
                    }
                } while (lima2 == this.bravo);
                this.delta = lima2;
                return;
            }
            int india = c1491i.india();
            lavender(india);
            int charlie = c1491i.charlie() + india;
            do {
                yVar.bravo(c1491i.golf());
            } while (c1491i.charlie() < charlie);
            return;
        }
        int i5 = this.bravo & 7;
        if (i5 != 2) {
            if (i5 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(c1491i.golf()));
                if (!c1491i.delta()) {
                    lima = c1491i.lima();
                } else {
                    return;
                }
            } while (lima == this.bravo);
            this.delta = lima;
            return;
        }
        int india2 = c1491i.india();
        lavender(india2);
        int charlie2 = c1491i.charlie() + india2;
        do {
            list.add(Integer.valueOf(c1491i.golf()));
        } while (c1491i.charlie() < charlie2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void echo(List list) {
        int lima;
        int lima2;
        boolean z2 = list instanceof ai;
        C1491i c1491i = this.alpha;
        if (z2) {
            ai aiVar = (ai) list;
            int i4 = this.bravo & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int charlie = c1491i.charlie() + c1491i.india();
                    do {
                        aiVar.bravo(AbstractC1492j.bravo(c1491i.juliet()));
                    } while (c1491i.charlie() < charlie);
                    ivory(charlie);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                aiVar.bravo(AbstractC1492j.bravo(c1491i.juliet()));
                if (!c1491i.delta()) {
                    lima2 = c1491i.lima();
                } else {
                    return;
                }
            } while (lima2 == this.bravo);
            this.delta = lima2;
            return;
        }
        int i5 = this.bravo & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int charlie2 = c1491i.charlie() + c1491i.india();
                do {
                    list.add(Long.valueOf(AbstractC1492j.bravo(c1491i.juliet())));
                } while (c1491i.charlie() < charlie2);
                ivory(charlie2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(AbstractC1492j.bravo(c1491i.juliet())));
            if (c1491i.delta()) {
                return;
            } else {
                lima = c1491i.lima();
            }
        } while (lima == this.bravo);
        this.delta = lima;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final long emerald() {
        jade(0);
        return this.alpha.juliet();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void foxtrot(List list) {
        int lima;
        int lima2;
        boolean z2 = list instanceof y;
        C1491i c1491i = this.alpha;
        if (z2) {
            y yVar = (y) list;
            int i4 = this.bravo & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int charlie = c1491i.charlie() + c1491i.india();
                    do {
                        yVar.bravo(c1491i.india());
                    } while (c1491i.charlie() < charlie);
                    ivory(charlie);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                yVar.bravo(c1491i.india());
                if (!c1491i.delta()) {
                    lima2 = c1491i.lima();
                } else {
                    return;
                }
            } while (lima2 == this.bravo);
            this.delta = lima2;
            return;
        }
        int i5 = this.bravo & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int charlie2 = c1491i.charlie() + c1491i.india();
                do {
                    list.add(Integer.valueOf(c1491i.india()));
                } while (c1491i.charlie() < charlie2);
                ivory(charlie2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(c1491i.india()));
            if (c1491i.delta()) {
                return;
            } else {
                lima = c1491i.lima();
            }
        } while (lima == this.bravo);
        this.delta = lima;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final String fuchsia() {
        jade(2);
        C1491i c1491i = this.alpha;
        int india = c1491i.india();
        if (india > 0) {
            int i4 = c1491i.echo;
            int i5 = c1491i.golf;
            if (india <= i4 - i5) {
                String november = O.alpha.november(c1491i.delta, i5, india);
                c1491i.golf += india;
                return november;
            }
        }
        if (india == 0) {
            return "";
        }
        if (india <= 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void gold(List list) {
        int lima;
        int lima2;
        boolean z2 = list instanceof ai;
        C1491i c1491i = this.alpha;
        if (z2) {
            ai aiVar = (ai) list;
            int i4 = this.bravo & 7;
            if (i4 != 1) {
                if (i4 == 2) {
                    int india = c1491i.india();
                    lime(india);
                    int charlie = c1491i.charlie() + india;
                    do {
                        aiVar.bravo(c1491i.hotel());
                    } while (c1491i.charlie() < charlie);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                aiVar.bravo(c1491i.hotel());
                if (!c1491i.delta()) {
                    lima2 = c1491i.lima();
                } else {
                    return;
                }
            } while (lima2 == this.bravo);
            this.delta = lima2;
            return;
        }
        int i5 = this.bravo & 7;
        if (i5 != 1) {
            if (i5 == 2) {
                int india2 = c1491i.india();
                lime(india2);
                int charlie2 = c1491i.charlie() + india2;
                do {
                    list.add(Long.valueOf(c1491i.hotel()));
                } while (c1491i.charlie() < charlie2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(c1491i.hotel()));
            if (c1491i.delta()) {
                return;
            } else {
                lima = c1491i.lima();
            }
        } while (lima == this.bravo);
        this.delta = lima;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void golf(List list, A a6, p pVar) {
        int lima;
        int i4 = this.bravo;
        if ((i4 & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(green(a6, pVar));
            C1491i c1491i = this.alpha;
            if (!c1491i.delta() && this.delta == 0) {
                lima = c1491i.lima();
            } else {
                return;
            }
        } while (lima == i4);
        this.delta = lima;
    }

    public final Object gray(A a6, p pVar) {
        int i4 = this.charlie;
        this.charlie = ((this.bravo >>> 3) << 3) | 4;
        try {
            Object charlie = a6.charlie();
            a6.hotel(charlie, this, pVar);
            a6.alpha(charlie);
            if (this.bravo == this.charlie) {
                return charlie;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.charlie = i4;
        }
    }

    public final Object green(A a6, p pVar) {
        C1491i c1491i = this.alpha;
        int india = c1491i.india();
        if (c1491i.alpha < c1491i.bravo) {
            int echo = c1491i.echo(india);
            Object charlie = a6.charlie();
            c1491i.alpha++;
            a6.hotel(charlie, this, pVar);
            a6.alpha(charlie);
            if (c1491i.india == 0) {
                c1491i.alpha--;
                c1491i.juliet = echo;
                c1491i.mike();
                return charlie;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final int hotel() {
        jade(5);
        return this.alpha.golf();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final boolean india() {
        jade(0);
        return this.alpha.foxtrot();
    }

    public final void indigo(List list, boolean z2) {
        String yankee;
        int lima;
        int lima2;
        if ((this.bravo & 7) == 2) {
            boolean z10 = list instanceof ae;
            C1491i c1491i = this.alpha;
            if (z10 && !z2) {
                ae aeVar = (ae) list;
                do {
                    aeVar.pink(beige());
                    if (!c1491i.delta()) {
                        lima2 = c1491i.lima();
                    } else {
                        return;
                    }
                } while (lima2 == this.bravo);
                this.delta = lima2;
                return;
            }
            do {
                if (z2) {
                    yankee = fuchsia();
                } else {
                    yankee = yankee();
                }
                list.add(yankee);
                if (c1491i.delta()) {
                    return;
                } else {
                    lima = c1491i.lima();
                }
            } while (lima == this.bravo);
            this.delta = lima;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    public final void ivory(int i4) {
        if (this.alpha.charlie() == i4) {
        } else {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void jade(int i4) {
        if ((this.bravo & 7) == i4) {
        } else {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final long juliet() {
        jade(1);
        return this.alpha.hotel();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void kilo(List list) {
        int lima;
        int lima2;
        boolean z2 = list instanceof ai;
        C1491i c1491i = this.alpha;
        if (z2) {
            ai aiVar = (ai) list;
            int i4 = this.bravo & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int charlie = c1491i.charlie() + c1491i.india();
                    do {
                        aiVar.bravo(c1491i.juliet());
                    } while (c1491i.charlie() < charlie);
                    ivory(charlie);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                aiVar.bravo(c1491i.juliet());
                if (!c1491i.delta()) {
                    lima2 = c1491i.lima();
                } else {
                    return;
                }
            } while (lima2 == this.bravo);
            this.delta = lima2;
            return;
        }
        int i5 = this.bravo & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int charlie2 = c1491i.charlie() + c1491i.india();
                do {
                    list.add(Long.valueOf(c1491i.juliet()));
                } while (c1491i.charlie() < charlie2);
                ivory(charlie2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(c1491i.juliet()));
            if (c1491i.delta()) {
                return;
            } else {
                lima = c1491i.lima();
            }
        } while (lima == this.bravo);
        this.delta = lima;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final int lima() {
        jade(0);
        return this.alpha.india();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void mike(List list) {
        int lima;
        int lima2;
        boolean z2 = list instanceof ai;
        C1491i c1491i = this.alpha;
        if (z2) {
            ai aiVar = (ai) list;
            int i4 = this.bravo & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int charlie = c1491i.charlie() + c1491i.india();
                    do {
                        aiVar.bravo(c1491i.juliet());
                    } while (c1491i.charlie() < charlie);
                    ivory(charlie);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                aiVar.bravo(c1491i.juliet());
                if (!c1491i.delta()) {
                    lima2 = c1491i.lima();
                } else {
                    return;
                }
            } while (lima2 == this.bravo);
            this.delta = lima2;
            return;
        }
        int i5 = this.bravo & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int charlie2 = c1491i.charlie() + c1491i.india();
                do {
                    list.add(Long.valueOf(c1491i.juliet()));
                } while (c1491i.charlie() < charlie2);
                ivory(charlie2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(c1491i.juliet()));
            if (c1491i.delta()) {
                return;
            } else {
                lima = c1491i.lima();
            }
        } while (lima == this.bravo);
        this.delta = lima;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void november(List list) {
        int lima;
        int lima2;
        boolean z2 = list instanceof ai;
        C1491i c1491i = this.alpha;
        if (z2) {
            ai aiVar = (ai) list;
            int i4 = this.bravo & 7;
            if (i4 != 1) {
                if (i4 == 2) {
                    int india = c1491i.india();
                    lime(india);
                    int charlie = c1491i.charlie() + india;
                    do {
                        aiVar.bravo(c1491i.hotel());
                    } while (c1491i.charlie() < charlie);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                aiVar.bravo(c1491i.hotel());
                if (!c1491i.delta()) {
                    lima2 = c1491i.lima();
                } else {
                    return;
                }
            } while (lima2 == this.bravo);
            this.delta = lima2;
            return;
        }
        int i5 = this.bravo & 7;
        if (i5 != 1) {
            if (i5 == 2) {
                int india2 = c1491i.india();
                lime(india2);
                int charlie2 = c1491i.charlie() + india2;
                do {
                    list.add(Long.valueOf(c1491i.hotel()));
                } while (c1491i.charlie() < charlie2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Long.valueOf(c1491i.hotel()));
            if (c1491i.delta()) {
                return;
            } else {
                lima = c1491i.lima();
            }
        } while (lima == this.bravo);
        this.delta = lima;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void oscar(List list) {
        int lima;
        int lima2;
        boolean z2 = list instanceof y;
        C1491i c1491i = this.alpha;
        if (z2) {
            y yVar = (y) list;
            int i4 = this.bravo & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int charlie = c1491i.charlie() + c1491i.india();
                    do {
                        yVar.bravo(c1491i.india());
                    } while (c1491i.charlie() < charlie);
                    ivory(charlie);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                yVar.bravo(c1491i.india());
                if (!c1491i.delta()) {
                    lima2 = c1491i.lima();
                } else {
                    return;
                }
            } while (lima2 == this.bravo);
            this.delta = lima2;
            return;
        }
        int i5 = this.bravo & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int charlie2 = c1491i.charlie() + c1491i.india();
                do {
                    list.add(Integer.valueOf(c1491i.india()));
                } while (c1491i.charlie() < charlie2);
                ivory(charlie2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(c1491i.india()));
            if (c1491i.delta()) {
                return;
            } else {
                lima = c1491i.lima();
            }
        } while (lima == this.bravo);
        this.delta = lima;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void papa(List list) {
        int lima;
        int lima2;
        boolean z2 = list instanceof y;
        C1491i c1491i = this.alpha;
        if (z2) {
            y yVar = (y) list;
            int i4 = this.bravo & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int charlie = c1491i.charlie() + c1491i.india();
                    do {
                        yVar.bravo(c1491i.india());
                    } while (c1491i.charlie() < charlie);
                    ivory(charlie);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                yVar.bravo(c1491i.india());
                if (!c1491i.delta()) {
                    lima2 = c1491i.lima();
                } else {
                    return;
                }
            } while (lima2 == this.bravo);
            this.delta = lima2;
            return;
        }
        int i5 = this.bravo & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int charlie2 = c1491i.charlie() + c1491i.india();
                do {
                    list.add(Integer.valueOf(c1491i.india()));
                } while (c1491i.charlie() < charlie2);
                ivory(charlie2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Integer.valueOf(c1491i.india()));
            if (c1491i.delta()) {
                return;
            } else {
                lima = c1491i.lima();
            }
        } while (lima == this.bravo);
        this.delta = lima;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final Object quebec(A a6, p pVar) {
        jade(3);
        return gray(a6, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final double readDouble() {
        jade(1);
        return Double.longBitsToDouble(this.alpha.hotel());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final float readFloat() {
        jade(5);
        return Float.intBitsToFloat(this.alpha.golf());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final int romeo() {
        jade(0);
        return this.alpha.india();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final Object sierra(A a6, p pVar) {
        jade(2);
        return green(a6, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final int tango() {
        return this.bravo;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void uniform(List list) {
        int lima;
        int lima2;
        boolean z2 = list instanceof y;
        C1491i c1491i = this.alpha;
        if (z2) {
            y yVar = (y) list;
            int i4 = this.bravo & 7;
            if (i4 != 2) {
                if (i4 != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    yVar.bravo(c1491i.golf());
                    if (!c1491i.delta()) {
                        lima2 = c1491i.lima();
                    } else {
                        return;
                    }
                } while (lima2 == this.bravo);
                this.delta = lima2;
                return;
            }
            int india = c1491i.india();
            lavender(india);
            int charlie = c1491i.charlie() + india;
            do {
                yVar.bravo(c1491i.golf());
            } while (c1491i.charlie() < charlie);
            return;
        }
        int i5 = this.bravo & 7;
        if (i5 != 2) {
            if (i5 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(c1491i.golf()));
                if (!c1491i.delta()) {
                    lima = c1491i.lima();
                } else {
                    return;
                }
            } while (lima == this.bravo);
            this.delta = lima;
            return;
        }
        int india2 = c1491i.india();
        lavender(india2);
        int charlie2 = c1491i.charlie() + india2;
        do {
            list.add(Integer.valueOf(c1491i.golf()));
        } while (c1491i.charlie() < charlie2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final int victor() {
        jade(0);
        return AbstractC1492j.alpha(this.alpha.india());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final long whiskey() {
        jade(0);
        return AbstractC1492j.bravo(this.alpha.juliet());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final void xray(List list) {
        int lima;
        int lima2;
        boolean z2 = list instanceof AbstractC1486d;
        C1491i c1491i = this.alpha;
        if (z2) {
            AbstractC1486d abstractC1486d = (AbstractC1486d) list;
            int i4 = this.bravo & 7;
            if (i4 != 0) {
                if (i4 == 2) {
                    int charlie = c1491i.charlie() + c1491i.india();
                    do {
                        abstractC1486d.bravo(c1491i.foxtrot());
                    } while (c1491i.charlie() < charlie);
                    ivory(charlie);
                    return;
                }
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                abstractC1486d.bravo(c1491i.foxtrot());
                if (!c1491i.delta()) {
                    lima2 = c1491i.lima();
                } else {
                    return;
                }
            } while (lima2 == this.bravo);
            this.delta = lima2;
            return;
        }
        int i5 = this.bravo & 7;
        if (i5 != 0) {
            if (i5 == 2) {
                int charlie2 = c1491i.charlie() + c1491i.india();
                do {
                    list.add(Boolean.valueOf(c1491i.foxtrot()));
                } while (c1491i.charlie() < charlie2);
                ivory(charlie2);
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(Boolean.valueOf(c1491i.foxtrot()));
            if (c1491i.delta()) {
                return;
            } else {
                lima = c1491i.lima();
            }
        } while (lima == this.bravo);
        this.delta = lima;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final String yankee() {
        jade(2);
        C1491i c1491i = this.alpha;
        int india = c1491i.india();
        if (india > 0) {
            int i4 = c1491i.echo;
            int i5 = c1491i.golf;
            if (india <= i4 - i5) {
                String str = new String(c1491i.delta, i5, india, ab.alpha);
                c1491i.golf += india;
                return str;
            }
        }
        if (india == 0) {
            return "";
        }
        if (india < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.az
    public final int zulu() {
        int i4 = this.delta;
        if (i4 != 0) {
            this.bravo = i4;
            this.delta = 0;
        } else {
            this.bravo = this.alpha.lima();
        }
        int i5 = this.bravo;
        if (i5 != 0 && i5 != this.charlie) {
            return i5 >>> 3;
        }
        return LottieConstants.IterateForever;
    }
}
