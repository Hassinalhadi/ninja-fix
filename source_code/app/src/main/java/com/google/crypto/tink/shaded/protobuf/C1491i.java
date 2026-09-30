package com.google.crypto.tink.shaded.protobuf;

import com.airbnb.lottie.compose.LottieConstants;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1491i extends AbstractC1492j {
    public final byte[] delta;
    public int echo;
    public int foxtrot;
    public int golf;
    public final int hotel;
    public int india;
    public int juliet;

    public C1491i(byte[] bArr, int i4, int i5, boolean z2) {
        this.bravo = 100;
        this.juliet = LottieConstants.IterateForever;
        this.delta = bArr;
        this.echo = i5 + i4;
        this.golf = i4;
        this.hotel = i4;
    }

    public final int charlie() {
        return this.golf - this.hotel;
    }

    public final boolean delta() {
        if (this.golf == this.echo) {
            return true;
        }
        return false;
    }

    public final int echo(int i4) {
        if (i4 >= 0) {
            int charlie = charlie() + i4;
            int i5 = this.juliet;
            if (charlie <= i5) {
                this.juliet = charlie;
                mike();
                return i5;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public final boolean foxtrot() {
        if (juliet() != 0) {
            return true;
        }
        return false;
    }

    public final int golf() {
        int i4 = this.golf;
        if (this.echo - i4 >= 4) {
            this.golf = i4 + 4;
            byte[] bArr = this.delta;
            return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public final long hotel() {
        int i4 = this.golf;
        if (this.echo - i4 >= 8) {
            this.golf = i4 + 8;
            byte[] bArr = this.delta;
            return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public final int india() {
        int i4;
        int i5 = this.golf;
        int i10 = this.echo;
        if (i10 != i5) {
            int i11 = i5 + 1;
            byte[] bArr = this.delta;
            byte b2 = bArr[i5];
            if (b2 >= 0) {
                this.golf = i11;
                return b2;
            }
            if (i10 - i11 >= 9) {
                int i12 = i5 + 2;
                int i13 = (bArr[i11] << 7) ^ b2;
                if (i13 < 0) {
                    i4 = i13 ^ (-128);
                } else {
                    int i14 = i5 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        i4 = i15 ^ 16256;
                    } else {
                        int i16 = i5 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            i4 = (-2080896) ^ i17;
                        } else {
                            i14 = i5 + 5;
                            byte b4 = bArr[i16];
                            int i18 = (i17 ^ (b4 << 28)) ^ 266354560;
                            if (b4 < 0) {
                                i16 = i5 + 6;
                                if (bArr[i14] < 0) {
                                    i14 = i5 + 7;
                                    if (bArr[i16] < 0) {
                                        i16 = i5 + 8;
                                        if (bArr[i14] < 0) {
                                            i14 = i5 + 9;
                                            if (bArr[i16] < 0) {
                                                int i19 = i5 + 10;
                                                if (bArr[i14] >= 0) {
                                                    i12 = i19;
                                                    i4 = i18;
                                                }
                                            }
                                        }
                                    }
                                }
                                i4 = i18;
                            }
                            i4 = i18;
                        }
                        i12 = i16;
                    }
                    i12 = i14;
                }
                this.golf = i12;
                return i4;
            }
        }
        return (int) kilo();
    }

    public final long juliet() {
        long j5;
        long j6;
        long j7;
        long j10;
        int i4 = this.golf;
        int i5 = this.echo;
        if (i5 != i4) {
            int i10 = i4 + 1;
            byte[] bArr = this.delta;
            byte b2 = bArr[i4];
            if (b2 >= 0) {
                this.golf = i10;
                return b2;
            }
            if (i5 - i10 >= 9) {
                int i11 = i4 + 2;
                int i12 = (bArr[i10] << 7) ^ b2;
                if (i12 < 0) {
                    j5 = i12 ^ (-128);
                } else {
                    int i13 = i4 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        j5 = i14 ^ 16256;
                        i11 = i13;
                    } else {
                        int i15 = i4 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            j10 = (-2080896) ^ i16;
                        } else {
                            long j11 = i16;
                            i11 = i4 + 5;
                            long j12 = j11 ^ (bArr[i15] << 28);
                            if (j12 >= 0) {
                                j7 = 266354560;
                            } else {
                                i15 = i4 + 6;
                                long j13 = j12 ^ (bArr[i11] << 35);
                                if (j13 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    i11 = i4 + 7;
                                    j12 = j13 ^ (bArr[i15] << 42);
                                    if (j12 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i15 = i4 + 8;
                                        j13 = j12 ^ (bArr[i11] << 49);
                                        if (j13 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            i11 = i4 + 9;
                                            long j14 = (j13 ^ (bArr[i15] << 56)) ^ 71499008037633920L;
                                            if (j14 < 0) {
                                                int i17 = i4 + 10;
                                                if (bArr[i11] >= 0) {
                                                    i11 = i17;
                                                }
                                            }
                                            j5 = j14;
                                        }
                                    }
                                }
                                j10 = j6 ^ j13;
                            }
                            j5 = j7 ^ j12;
                        }
                        i11 = i15;
                        j5 = j10;
                    }
                }
                this.golf = i11;
                return j5;
            }
        }
        return kilo();
    }

    public final long kilo() {
        long j5 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            int i5 = this.golf;
            if (i5 != this.echo) {
                this.golf = i5 + 1;
                j5 |= (r3 & Byte.MAX_VALUE) << i4;
                if ((this.delta[i5] & 128) == 0) {
                    return j5;
                }
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public final int lima() {
        if (delta()) {
            this.india = 0;
            return 0;
        }
        int india = india();
        this.india = india;
        if ((india >>> 3) != 0) {
            return india;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public final void mike() {
        int i4 = this.echo + this.foxtrot;
        this.echo = i4;
        int i5 = i4 - this.hotel;
        int i10 = this.juliet;
        if (i5 > i10) {
            int i11 = i5 - i10;
            this.foxtrot = i11;
            this.echo = i4 - i11;
            return;
        }
        this.foxtrot = 0;
    }
}
