package Oe;

import com.airbnb.lottie.compose.LottieConstants;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class f {
    public int charlie;
    public final InputStream echo;
    public int foxtrot;
    public int india;
    public int hotel = LottieConstants.IterateForever;
    public final byte[] alpha = new byte[4096];
    public int bravo = 0;
    public int delta = 0;
    public int golf = 0;

    public f(InputStream inputStream) {
        this.echo = inputStream;
    }

    public final int alpha() {
        int i4 = this.hotel;
        if (i4 == Integer.MAX_VALUE) {
            return -1;
        }
        return i4 - (this.golf + this.delta);
    }

    public final void bravo(int i4) {
        this.hotel = i4;
        november();
    }

    public final int charlie(int i4) {
        if (i4 >= 0) {
            int i5 = this.golf + this.delta + i4;
            int i10 = this.hotel;
            if (i5 <= i10) {
                this.hotel = i5;
                november();
                return i10;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public final u delta() {
        int juliet = juliet();
        int i4 = this.bravo;
        int i5 = this.delta;
        if (juliet <= i4 - i5 && juliet > 0) {
            byte[] bArr = new byte[juliet];
            System.arraycopy(this.alpha, i5, bArr, 0, juliet);
            u uVar = new u(bArr);
            this.delta += juliet;
            return uVar;
        }
        if (juliet == 0) {
            return e.alpha;
        }
        return new u(golf(juliet));
    }

    public final int echo() {
        return juliet();
    }

    public final v foxtrot(x xVar, h hVar) {
        int juliet = juliet();
        if (this.india < 64) {
            int charlie = charlie(juliet);
            this.india++;
            v vVar = (v) xVar.alpha(this, hVar);
            if (this.foxtrot == 0) {
                this.india--;
                bravo(charlie);
                return vVar;
            }
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public final byte[] golf(int i4) {
        int read;
        if (i4 <= 0) {
            if (i4 == 0) {
                return q.alpha;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i5 = this.golf;
        int i10 = this.delta;
        int i11 = i5 + i10 + i4;
        int i12 = this.hotel;
        if (i11 <= i12) {
            byte[] bArr = this.alpha;
            if (i4 < 4096) {
                byte[] bArr2 = new byte[i4];
                int i13 = this.bravo - i10;
                System.arraycopy(bArr, i10, bArr2, 0, i13);
                this.delta = this.bravo;
                int i14 = i4 - i13;
                if (i14 > 0) {
                    oscar(i14);
                }
                System.arraycopy(bArr, 0, bArr2, i13, i14);
                this.delta = i14;
                return bArr2;
            }
            int i15 = this.bravo;
            this.golf = i5 + i15;
            this.delta = 0;
            this.bravo = 0;
            int i16 = i15 - i10;
            int i17 = i4 - i16;
            ArrayList arrayList = new ArrayList();
            while (i17 > 0) {
                int min = Math.min(i17, 4096);
                byte[] bArr3 = new byte[min];
                int i18 = 0;
                while (i18 < min) {
                    InputStream inputStream = this.echo;
                    if (inputStream == null) {
                        read = -1;
                    } else {
                        read = inputStream.read(bArr3, i18, min - i18);
                    }
                    if (read != -1) {
                        this.golf += read;
                        i18 += read;
                    } else {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                }
                i17 -= min;
                arrayList.add(bArr3);
            }
            byte[] bArr4 = new byte[i4];
            System.arraycopy(bArr, i10, bArr4, 0, i16);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr5 = (byte[]) it.next();
                System.arraycopy(bArr5, 0, bArr4, i16, bArr5.length);
                i16 += bArr5.length;
            }
            return bArr4;
        }
        quebec((i12 - i5) - i10);
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public final int hotel() {
        int i4 = this.delta;
        if (this.bravo - i4 < 4) {
            oscar(4);
            i4 = this.delta;
        }
        this.delta = i4 + 4;
        byte[] bArr = this.alpha;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    public final long india() {
        int i4 = this.delta;
        if (this.bravo - i4 < 8) {
            oscar(8);
            i4 = this.delta;
        }
        this.delta = i4 + 8;
        byte[] bArr = this.alpha;
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    public final int juliet() {
        int i4;
        int i5 = this.delta;
        int i10 = this.bravo;
        if (i10 != i5) {
            int i11 = i5 + 1;
            byte[] bArr = this.alpha;
            byte b2 = bArr[i5];
            if (b2 >= 0) {
                this.delta = i11;
                return b2;
            }
            if (i10 - i11 >= 9) {
                int i12 = i5 + 2;
                int i13 = (bArr[i11] << 7) ^ b2;
                long j5 = i13;
                if (j5 < 0) {
                    i4 = (int) ((-128) ^ j5);
                } else {
                    int i14 = i5 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    long j6 = i15;
                    if (j6 >= 0) {
                        i4 = (int) (16256 ^ j6);
                    } else {
                        int i16 = i5 + 4;
                        long j7 = i15 ^ (bArr[i14] << 21);
                        if (j7 < 0) {
                            i4 = (int) ((-2080896) ^ j7);
                        } else {
                            i14 = i5 + 5;
                            int i17 = (int) ((r1 ^ (r2 << 28)) ^ 266354560);
                            if (bArr[i16] < 0) {
                                i16 = i5 + 6;
                                if (bArr[i14] < 0) {
                                    i14 = i5 + 7;
                                    if (bArr[i16] < 0) {
                                        i16 = i5 + 8;
                                        if (bArr[i14] < 0) {
                                            i14 = i5 + 9;
                                            if (bArr[i16] < 0) {
                                                int i18 = i5 + 10;
                                                if (bArr[i14] >= 0) {
                                                    i12 = i18;
                                                    i4 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i4 = i17;
                            }
                            i4 = i17;
                        }
                        i12 = i16;
                    }
                    i12 = i14;
                }
                this.delta = i12;
                return i4;
            }
        }
        return (int) lima();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long kilo() {
        long j5;
        long j6;
        long j7;
        int i4 = this.delta;
        int i5 = this.bravo;
        if (i5 != i4) {
            int i10 = i4 + 1;
            byte[] bArr = this.alpha;
            byte b2 = bArr[i4];
            if (b2 >= 0) {
                this.delta = i10;
                return b2;
            }
            if (i5 - i10 >= 9) {
                int i11 = i4 + 2;
                long j10 = (bArr[i10] << 7) ^ b2;
                if (j10 < 0) {
                    j6 = -128;
                } else {
                    int i12 = i4 + 3;
                    long j11 = j10 ^ (bArr[i11] << 14);
                    if (j11 >= 0) {
                        j7 = 16256;
                    } else {
                        i11 = i4 + 4;
                        j10 = j11 ^ (bArr[i12] << 21);
                        if (j10 < 0) {
                            j6 = -2080896;
                        } else {
                            i12 = i4 + 5;
                            j11 = j10 ^ (bArr[i11] << 28);
                            if (j11 >= 0) {
                                j7 = 266354560;
                            } else {
                                i11 = i4 + 6;
                                j10 = j11 ^ (bArr[i12] << 35);
                                if (j10 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    i12 = i4 + 7;
                                    j11 = j10 ^ (bArr[i11] << 42);
                                    if (j11 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i11 = i4 + 8;
                                        j10 = j11 ^ (bArr[i12] << 49);
                                        if (j10 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            int i13 = i4 + 9;
                                            long j12 = (j10 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j12 < 0) {
                                                i11 = i4 + 10;
                                            } else {
                                                i11 = i13;
                                            }
                                            j5 = j12;
                                            this.delta = i11;
                                            return j5;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i11 = i12;
                    j5 = j7 ^ j11;
                    this.delta = i11;
                    return j5;
                }
                j5 = j6 ^ j10;
                this.delta = i11;
                return j5;
            }
        }
        return lima();
    }

    public final long lima() {
        long j5 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            if (this.delta == this.bravo) {
                oscar(1);
            }
            int i5 = this.delta;
            this.delta = i5 + 1;
            j5 |= (r3 & Byte.MAX_VALUE) << i4;
            if ((this.alpha[i5] & 128) == 0) {
                return j5;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public final int mike() {
        if (this.delta == this.bravo && !romeo(1)) {
            this.foxtrot = 0;
            return 0;
        }
        int juliet = juliet();
        this.foxtrot = juliet;
        if ((juliet >>> 3) != 0) {
            return juliet;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public final void november() {
        int i4 = this.bravo + this.charlie;
        this.bravo = i4;
        int i5 = this.golf + i4;
        int i10 = this.hotel;
        if (i5 > i10) {
            int i11 = i5 - i10;
            this.charlie = i11;
            this.bravo = i4 - i11;
            return;
        }
        this.charlie = 0;
    }

    public final void oscar(int i4) {
        if (romeo(i4)) {
        } else {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final boolean papa(int i4, F0.e eVar) {
        int mike;
        int i5 = i4 & 7;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 == 5) {
                                int hotel = hotel();
                                eVar.coral(i4);
                                eVar.blue(hotel);
                                return true;
                            }
                            throw InvalidProtocolBufferException.invalidWireType();
                        }
                        return false;
                    }
                    eVar.coral(i4);
                    do {
                        mike = mike();
                        if (mike == 0) {
                            break;
                        }
                    } while (papa(mike, eVar));
                    int i10 = ((i4 >>> 3) << 3) | 4;
                    if (this.foxtrot == i10) {
                        eVar.coral(i10);
                        return true;
                    }
                    throw InvalidProtocolBufferException.invalidEndTag();
                }
                u delta = delta();
                eVar.coral(i4);
                eVar.coral(delta.size());
                eVar.beige(delta);
                return true;
            }
            long india = india();
            eVar.coral(i4);
            eVar.bronze(india);
            return true;
        }
        long kilo = kilo();
        eVar.coral(i4);
        eVar.crimson(kilo);
        return true;
    }

    public final void quebec(int i4) {
        int i5 = this.bravo;
        int i10 = this.delta;
        if (i4 <= i5 - i10 && i4 >= 0) {
            this.delta = i10 + i4;
            return;
        }
        if (i4 >= 0) {
            int i11 = this.golf;
            int i12 = i11 + i10 + i4;
            int i13 = this.hotel;
            if (i12 <= i13) {
                int i14 = i5 - i10;
                this.delta = i5;
                oscar(1);
                while (true) {
                    int i15 = i4 - i14;
                    int i16 = this.bravo;
                    if (i15 > i16) {
                        i14 += i16;
                        this.delta = i16;
                        oscar(1);
                    } else {
                        this.delta = i15;
                        return;
                    }
                }
            } else {
                quebec((i13 - i11) - i10);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } else {
            throw InvalidProtocolBufferException.negativeSize();
        }
    }

    public final boolean romeo(int i4) {
        InputStream inputStream;
        int i5 = this.delta;
        int i10 = i5 + i4;
        int i11 = this.bravo;
        if (i10 > i11) {
            if (this.golf + i5 + i4 <= this.hotel && (inputStream = this.echo) != null) {
                byte[] bArr = this.alpha;
                if (i5 > 0) {
                    if (i11 > i5) {
                        System.arraycopy(bArr, i5, bArr, 0, i11 - i5);
                    }
                    this.golf += i5;
                    this.bravo -= i5;
                    this.delta = 0;
                }
                int i12 = this.bravo;
                int read = inputStream.read(bArr, i12, bArr.length - i12);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read > 0) {
                        this.bravo += read;
                        if ((this.golf + i4) - 67108864 <= 0) {
                            november();
                            if (this.bravo >= i4) {
                                return true;
                            }
                            return romeo(i4);
                        }
                        throw InvalidProtocolBufferException.sizeLimitExceeded();
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(102);
                    sb2.append("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            return false;
        }
        StringBuilder sb3 = new StringBuilder(77);
        sb3.append("refillBuffer() called when ");
        sb3.append(i4);
        sb3.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb3.toString());
    }
}
