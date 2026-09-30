package androidx.datastore.preferences.protobuf;

import com.airbnb.lottie.compose.LottieConstants;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import t6.D3;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0600g extends Pf.g {

    /* renamed from: a, reason: collision with root package name */
    public int f3074a;

    /* renamed from: b, reason: collision with root package name */
    public int f3075b;

    /* renamed from: c, reason: collision with root package name */
    public int f3076c = LottieConstants.IterateForever;
    public final InputStream red;
    public final byte[] silver;
    public int teal;
    public int white;
    public int yellow;

    public C0600g(InputStream inputStream) {
        Charset charset = u.alpha;
        this.red = inputStream;
        this.silver = new byte[4096];
        this.teal = 0;
        this.yellow = 0;
        this.f3075b = 0;
    }

    @Override // Pf.g
    public final void alpha(int i4) {
        if (this.f3074a == i4) {
        } else {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    @Override // Pf.g
    public final long amber() {
        return cyan();
    }

    @Override // Pf.g
    public final boolean azure(int i4) {
        int yankee;
        int i5 = i4 & 7;
        int i10 = 0;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            return false;
                        }
                        if (i5 == 5) {
                            green(4);
                            return true;
                        }
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    do {
                        yankee = yankee();
                        if (yankee == 0) {
                            break;
                        }
                        int i11 = this.alpha;
                        if (i11 < 100) {
                            this.alpha = i11 + 1;
                            this.alpha--;
                        } else {
                            throw InvalidProtocolBufferException.recursionLimitExceeded();
                        }
                    } while (azure(yankee));
                    alpha(((i4 >>> 3) << 3) | 4);
                    return true;
                }
                green(crimson());
                return true;
            }
            green(8);
            return true;
        }
        int i12 = this.teal - this.yellow;
        byte[] bArr = this.silver;
        if (i12 >= 10) {
            while (i10 < 10) {
                int i13 = this.yellow;
                this.yellow = i13 + 1;
                if (bArr[i13] < 0) {
                    i10++;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }
        while (i10 < 10) {
            if (this.yellow == this.teal) {
                gray(1);
            }
            int i14 = this.yellow;
            this.yellow = i14 + 1;
            if (bArr[i14] < 0) {
                i10++;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
        return true;
    }

    public final byte[] beige(int i4) {
        byte[] black = black(i4);
        if (black != null) {
            return black;
        }
        int i5 = this.yellow;
        int i10 = this.teal;
        int i11 = i10 - i5;
        this.f3075b += i10;
        this.yellow = 0;
        this.teal = 0;
        ArrayList blue = blue(i4 - i11);
        byte[] bArr = new byte[i4];
        System.arraycopy(this.silver, i5, bArr, 0, i11);
        Iterator it = blue.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    public final byte[] black(int i4) {
        if (i4 == 0) {
            return u.bravo;
        }
        if (i4 >= 0) {
            int i5 = this.f3075b;
            int i10 = this.yellow;
            int i11 = i5 + i10 + i4;
            if (i11 - LottieConstants.IterateForever <= 0) {
                int i12 = this.f3076c;
                if (i11 <= i12) {
                    int i13 = this.teal - i10;
                    int i14 = i4 - i13;
                    InputStream inputStream = this.red;
                    if (i14 >= 4096) {
                        try {
                            if (i14 > inputStream.available()) {
                                return null;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            e.setThrownFromInputStream();
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i4];
                    System.arraycopy(this.silver, this.yellow, bArr, 0, i13);
                    this.f3075b += this.teal;
                    this.yellow = 0;
                    this.teal = 0;
                    while (i13 < i4) {
                        try {
                            int read = inputStream.read(bArr, i13, i4 - i13);
                            if (read != -1) {
                                this.f3075b += read;
                                i13 += read;
                            } else {
                                throw InvalidProtocolBufferException.truncatedMessage();
                            }
                        } catch (InvalidProtocolBufferException e4) {
                            e4.setThrownFromInputStream();
                            throw e4;
                        }
                    }
                    return bArr;
                }
                green((i12 - i5) - i10);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public final ArrayList blue(int i4) {
        ArrayList arrayList = new ArrayList();
        while (i4 > 0) {
            int min = Math.min(i4, 4096);
            byte[] bArr = new byte[min];
            int i5 = 0;
            while (i5 < min) {
                int read = this.red.read(bArr, i5, min - i5);
                if (read != -1) {
                    this.f3075b += read;
                    i5 += read;
                } else {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            }
            i4 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // Pf.g
    public final int bravo() {
        return this.f3075b + this.yellow;
    }

    public final int bronze() {
        int i4 = this.yellow;
        if (this.teal - i4 < 4) {
            gray(4);
            i4 = this.yellow;
        }
        this.yellow = i4 + 4;
        byte[] bArr = this.silver;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    @Override // Pf.g
    public final boolean charlie() {
        if (this.yellow == this.teal && !indigo(1)) {
            return true;
        }
        return false;
    }

    public final long coral() {
        int i4 = this.yellow;
        if (this.teal - i4 < 8) {
            gray(8);
            i4 = this.yellow;
        }
        this.yellow = i4 + 8;
        byte[] bArr = this.silver;
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    public final int crimson() {
        int i4;
        int i5 = this.yellow;
        int i10 = this.teal;
        if (i10 != i5) {
            int i11 = i5 + 1;
            byte[] bArr = this.silver;
            byte b2 = bArr[i5];
            if (b2 >= 0) {
                this.yellow = i11;
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
                this.yellow = i12;
                return i4;
            }
        }
        return (int) emerald();
    }

    public final long cyan() {
        long j5;
        long j6;
        long j7;
        long j10;
        int i4 = this.yellow;
        int i5 = this.teal;
        if (i5 != i4) {
            int i10 = i4 + 1;
            byte[] bArr = this.silver;
            byte b2 = bArr[i4];
            if (b2 >= 0) {
                this.yellow = i10;
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
                this.yellow = i11;
                return j5;
            }
        }
        return emerald();
    }

    public final long emerald() {
        long j5 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            if (this.yellow == this.teal) {
                gray(1);
            }
            int i5 = this.yellow;
            this.yellow = i5 + 1;
            j5 |= (r3 & Byte.MAX_VALUE) << i4;
            if ((this.silver[i5] & 128) == 0) {
                return j5;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public final void fuchsia() {
        int i4 = this.teal + this.white;
        this.teal = i4;
        int i5 = this.f3075b + i4;
        int i10 = this.f3076c;
        if (i5 > i10) {
            int i11 = i5 - i10;
            this.white = i11;
            this.teal = i4 - i11;
            return;
        }
        this.white = 0;
    }

    public final void gray(int i4) {
        if (!indigo(i4)) {
            if (i4 > (LottieConstants.IterateForever - this.f3075b) - this.yellow) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void green(int i4) {
        int i5 = this.teal;
        int i10 = this.yellow;
        if (i4 <= i5 - i10 && i4 >= 0) {
            this.yellow = i10 + i4;
            return;
        }
        InputStream inputStream = this.red;
        if (i4 >= 0) {
            int i11 = this.f3075b;
            int i12 = i11 + i10;
            int i13 = i12 + i4;
            int i14 = this.f3076c;
            if (i13 <= i14) {
                this.f3075b = i12;
                int i15 = i5 - i10;
                this.teal = 0;
                this.yellow = 0;
                while (i15 < i4) {
                    long j5 = i4 - i15;
                    try {
                        try {
                            long skip = inputStream.skip(j5);
                            if (skip >= 0 && skip <= j5) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i15 += (int) skip;
                                }
                            } else {
                                throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (InvalidProtocolBufferException e) {
                            e.setThrownFromInputStream();
                            throw e;
                        }
                    } catch (Throwable th) {
                        this.f3075b += i15;
                        fuchsia();
                        throw th;
                    }
                }
                this.f3075b += i15;
                fuchsia();
                if (i15 < i4) {
                    int i16 = this.teal;
                    int i17 = i16 - this.yellow;
                    this.yellow = i16;
                    gray(1);
                    while (true) {
                        int i18 = i4 - i17;
                        int i19 = this.teal;
                        if (i18 > i19) {
                            i17 += i19;
                            this.yellow = i19;
                            gray(1);
                        } else {
                            this.yellow = i18;
                            return;
                        }
                    }
                }
            } else {
                green((i14 - i11) - i10);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } else {
            throw InvalidProtocolBufferException.negativeSize();
        }
    }

    @Override // Pf.g
    public final void hotel(int i4) {
        this.f3076c = i4;
        fuchsia();
    }

    @Override // Pf.g
    public final int india(int i4) {
        if (i4 >= 0) {
            int i5 = this.f3075b + this.yellow + i4;
            if (i5 >= 0) {
                int i10 = this.f3076c;
                if (i5 <= i10) {
                    this.f3076c = i5;
                    fuchsia();
                    return i10;
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.parseFailure();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public final boolean indigo(int i4) {
        int i5 = this.yellow;
        int i10 = i5 + i4;
        int i11 = this.teal;
        if (i10 > i11) {
            int i12 = this.f3075b;
            if (i4 <= (LottieConstants.IterateForever - i12) - i5 && i12 + i5 + i4 <= this.f3076c) {
                byte[] bArr = this.silver;
                if (i5 > 0) {
                    if (i11 > i5) {
                        System.arraycopy(bArr, i5, bArr, 0, i11 - i5);
                    }
                    this.f3075b += i5;
                    this.teal -= i5;
                    this.yellow = 0;
                }
                int i13 = this.teal;
                int min = Math.min(bArr.length - i13, (LottieConstants.IterateForever - this.f3075b) - i13);
                InputStream inputStream = this.red;
                try {
                    int read = inputStream.read(bArr, i13, min);
                    if (read != 0 && read >= -1 && read <= bArr.length) {
                        if (read > 0) {
                            this.teal += read;
                            fuchsia();
                            if (this.teal >= i4) {
                                return true;
                            }
                            return indigo(i4);
                        }
                    } else {
                        throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.setThrownFromInputStream();
                    throw e;
                }
            }
            return false;
        }
        throw new IllegalStateException(av.q.delta(i4, "refillBuffer() called when ", " bytes were already available in buffer"));
    }

    @Override // Pf.g
    public final boolean juliet() {
        if (cyan() != 0) {
            return true;
        }
        return false;
    }

    @Override // Pf.g
    public final C0599f kilo() {
        int crimson = crimson();
        int i4 = this.teal;
        int i5 = this.yellow;
        int i10 = i4 - i5;
        byte[] bArr = this.silver;
        if (crimson <= i10 && crimson > 0) {
            C0599f delta = C0599f.delta(bArr, i5, crimson);
            this.yellow += crimson;
            return delta;
        }
        if (crimson == 0) {
            return C0599f.red;
        }
        if (crimson >= 0) {
            byte[] black = black(crimson);
            if (black != null) {
                return C0599f.delta(black, 0, black.length);
            }
            int i11 = this.yellow;
            int i12 = this.teal;
            int i13 = i12 - i11;
            this.f3075b += i12;
            this.yellow = 0;
            this.teal = 0;
            ArrayList blue = blue(crimson - i13);
            byte[] bArr2 = new byte[crimson];
            System.arraycopy(bArr, i11, bArr2, 0, i13);
            Iterator it = blue.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, i13, bArr3.length);
                i13 += bArr3.length;
            }
            C0599f c0599f = C0599f.red;
            return new C0599f(bArr2);
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    @Override // Pf.g
    public final double lima() {
        return Double.longBitsToDouble(coral());
    }

    @Override // Pf.g
    public final int mike() {
        return crimson();
    }

    @Override // Pf.g
    public final int november() {
        return bronze();
    }

    @Override // Pf.g
    public final long oscar() {
        return coral();
    }

    @Override // Pf.g
    public final float papa() {
        return Float.intBitsToFloat(bronze());
    }

    @Override // Pf.g
    public final int quebec() {
        return crimson();
    }

    @Override // Pf.g
    public final long romeo() {
        return cyan();
    }

    @Override // Pf.g
    public final int sierra() {
        return bronze();
    }

    @Override // Pf.g
    public final long tango() {
        return coral();
    }

    @Override // Pf.g
    public final int uniform() {
        int crimson = crimson();
        return (-(crimson & 1)) ^ (crimson >>> 1);
    }

    @Override // Pf.g
    public final long victor() {
        long cyan = cyan();
        return (-(cyan & 1)) ^ (cyan >>> 1);
    }

    @Override // Pf.g
    public final String whiskey() {
        int crimson = crimson();
        byte[] bArr = this.silver;
        if (crimson > 0) {
            int i4 = this.teal;
            int i5 = this.yellow;
            if (crimson <= i4 - i5) {
                String str = new String(bArr, i5, crimson, u.alpha);
                this.yellow += crimson;
                return str;
            }
        }
        if (crimson == 0) {
            return "";
        }
        if (crimson >= 0) {
            if (crimson <= this.teal) {
                gray(crimson);
                String str2 = new String(bArr, this.yellow, crimson, u.alpha);
                this.yellow += crimson;
                return str2;
            }
            return new String(beige(crimson), u.alpha);
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    @Override // Pf.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String xray() {
        int crimson = crimson();
        int i4 = this.yellow;
        int i5 = this.teal;
        int i10 = i5 - i4;
        byte[] bArr = this.silver;
        if (crimson <= i10 && crimson > 0) {
            this.yellow = i4 + crimson;
        } else {
            if (crimson == 0) {
                return "";
            }
            if (crimson >= 0) {
                if (crimson <= i5) {
                    gray(crimson);
                    this.yellow = crimson;
                } else {
                    bArr = beige(crimson);
                }
                i4 = 0;
            } else {
                throw InvalidProtocolBufferException.negativeSize();
            }
        }
        switch (F.alpha.alpha) {
            case 0:
                if ((i4 | crimson | ((bArr.length - i4) - crimson)) >= 0) {
                    int i11 = i4 + crimson;
                    char[] cArr = new char[crimson];
                    int i12 = 0;
                    while (i4 < i11) {
                        byte b2 = bArr[i4];
                        if (b2 >= 0) {
                            i4++;
                            cArr[i12] = (char) b2;
                            i12++;
                        } else {
                            while (i4 < i11) {
                                int i13 = i4 + 1;
                                byte b4 = bArr[i4];
                                if (b4 >= 0) {
                                    int i14 = i12 + 1;
                                    cArr[i12] = (char) b4;
                                    while (i13 < i11) {
                                        byte b6 = bArr[i13];
                                        if (b6 >= 0) {
                                            i13++;
                                            cArr[i14] = (char) b6;
                                            i14++;
                                        } else {
                                            i12 = i14;
                                            i4 = i13;
                                        }
                                    }
                                    i12 = i14;
                                    i4 = i13;
                                } else if (b4 < -32) {
                                    if (i13 < i11) {
                                        i4 += 2;
                                        byte b10 = bArr[i13];
                                        int i15 = i12 + 1;
                                        if (b4 >= -62 && !D3.alpha(b10)) {
                                            cArr[i12] = (char) ((b10 & 63) | ((b4 & 31) << 6));
                                            i12 = i15;
                                        } else {
                                            throw InvalidProtocolBufferException.invalidUtf8();
                                        }
                                    } else {
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    }
                                } else if (b4 < -16) {
                                    if (i13 < i11 - 1) {
                                        int i16 = i4 + 2;
                                        byte b11 = bArr[i13];
                                        i4 += 3;
                                        byte b12 = bArr[i16];
                                        int i17 = i12 + 1;
                                        if (!D3.alpha(b11) && ((b4 != -32 || b11 >= -96) && ((b4 != -19 || b11 < -96) && !D3.alpha(b12)))) {
                                            cArr[i12] = (char) (((b11 & 63) << 6) | ((b4 & 15) << 12) | (b12 & 63));
                                            i12 = i17;
                                        } else {
                                            throw InvalidProtocolBufferException.invalidUtf8();
                                        }
                                    } else {
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    }
                                } else if (i13 < i11 - 2) {
                                    byte b13 = bArr[i13];
                                    int i18 = i4 + 3;
                                    byte b14 = bArr[i4 + 2];
                                    i4 += 4;
                                    byte b15 = bArr[i18];
                                    int i19 = i12 + 1;
                                    if (!D3.alpha(b13) && (((b13 + 112) + (b4 << 28)) >> 30) == 0 && !D3.alpha(b14) && !D3.alpha(b15)) {
                                        int i20 = ((b13 & 63) << 12) | ((b4 & 7) << 18) | ((b14 & 63) << 6) | (b15 & 63);
                                        cArr[i12] = (char) ((i20 >>> 10) + 55232);
                                        cArr[i19] = (char) ((i20 & 1023) + 56320);
                                        i12 += 2;
                                    } else {
                                        throw InvalidProtocolBufferException.invalidUtf8();
                                    }
                                } else {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                            }
                            return new String(cArr, 0, i12);
                        }
                    }
                    while (i4 < i11) {
                    }
                    return new String(cArr, 0, i12);
                }
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(crimson)));
            default:
                Charset charset = u.alpha;
                String str = new String(bArr, i4, crimson, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i4, crimson + i4))) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                return str;
        }
    }

    @Override // Pf.g
    public final int yankee() {
        if (charlie()) {
            this.f3074a = 0;
            return 0;
        }
        int crimson = crimson();
        this.f3074a = crimson;
        if ((crimson >>> 3) != 0) {
            return crimson;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    @Override // Pf.g
    public final int zulu() {
        return crimson();
    }
}
