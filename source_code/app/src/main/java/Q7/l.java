package Q7;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class l implements Closeable, AutoCloseable {
    public static final Logger yellow = Logger.getLogger(l.class.getName());
    public final RandomAccessFile alpha;
    public int purple;
    public int red;
    public i silver;
    public i teal;
    public final byte[] white;

    public l(File file) {
        byte[] bArr = new byte[16];
        this.white = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i4 = 0;
                for (int i5 = 0; i5 < 4; i5++) {
                    green(bArr2, i4, iArr[i5]);
                    i4 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.alpha = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int quebec = quebec(0, bArr);
        this.purple = quebec;
        if (quebec <= randomAccessFile2.length()) {
            this.red = quebec(4, bArr);
            int quebec2 = quebec(8, bArr);
            int quebec3 = quebec(12, bArr);
            this.silver = papa(quebec2);
            this.teal = papa(quebec3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.purple + ", Actual length: " + randomAccessFile2.length());
    }

    public static void green(byte[] bArr, int i4, int i5) {
        bArr[i4] = (byte) (i5 >> 24);
        bArr[i4 + 1] = (byte) (i5 >> 16);
        bArr[i4 + 2] = (byte) (i5 >> 8);
        bArr[i4 + 3] = (byte) i5;
    }

    public static int quebec(int i4, byte[] bArr) {
        return ((bArr[i4] & 255) << 24) + ((bArr[i4 + 1] & 255) << 16) + ((bArr[i4 + 2] & 255) << 8) + (bArr[i4 + 3] & 255);
    }

    public final void azure(int i4, int i5, int i10, byte[] bArr) {
        int crimson = crimson(i4);
        int i11 = crimson + i10;
        int i12 = this.purple;
        RandomAccessFile randomAccessFile = this.alpha;
        if (i11 <= i12) {
            randomAccessFile.seek(crimson);
            randomAccessFile.readFully(bArr, i5, i10);
            return;
        }
        int i13 = i12 - crimson;
        randomAccessFile.seek(crimson);
        randomAccessFile.readFully(bArr, i5, i13);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i5 + i13, i10 - i13);
    }

    public final void beige(byte[] bArr, int i4, int i5) {
        int crimson = crimson(i4);
        int i10 = crimson + i5;
        int i11 = this.purple;
        RandomAccessFile randomAccessFile = this.alpha;
        if (i10 <= i11) {
            randomAccessFile.seek(crimson);
            randomAccessFile.write(bArr, 0, i5);
            return;
        }
        int i12 = i11 - crimson;
        randomAccessFile.seek(crimson);
        randomAccessFile.write(bArr, 0, i12);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i12, i5 - i12);
    }

    public final int blue() {
        if (this.red == 0) {
            return 16;
        }
        i iVar = this.teal;
        int i4 = iVar.alpha;
        int i5 = this.silver.alpha;
        if (i4 >= i5) {
            return (i4 - i5) + 4 + iVar.bravo + 16;
        }
        return (((i4 + 4) + iVar.bravo) + this.purple) - i5;
    }

    public final void charlie(byte[] bArr) {
        int crimson;
        int i4;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    foxtrot(length);
                    boolean juliet = juliet();
                    if (juliet) {
                        crimson = 16;
                    } else {
                        i iVar = this.teal;
                        crimson = crimson(iVar.alpha + 4 + iVar.bravo);
                    }
                    i iVar2 = new i(crimson, length);
                    green(this.white, 0, length);
                    beige(this.white, crimson, 4);
                    beige(bArr, crimson + 4, length);
                    if (juliet) {
                        i4 = crimson;
                    } else {
                        i4 = this.silver.alpha;
                    }
                    gray(this.purple, this.red + 1, i4, crimson);
                    this.teal = iVar2;
                    this.red++;
                    if (juliet) {
                        this.silver = iVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.alpha.close();
    }

    public final int crimson(int i4) {
        int i5 = this.purple;
        if (i4 < i5) {
            return i4;
        }
        return (i4 + 16) - i5;
    }

    public final synchronized void echo() {
        gray(4096, 0, 0, 0);
        this.red = 0;
        i iVar = i.charlie;
        this.silver = iVar;
        this.teal = iVar;
        if (this.purple > 4096) {
            RandomAccessFile randomAccessFile = this.alpha;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.purple = 4096;
    }

    public final void foxtrot(int i4) {
        int i5 = i4 + 4;
        int blue = this.purple - blue();
        if (blue >= i5) {
            return;
        }
        int i10 = this.purple;
        do {
            blue += i10;
            i10 <<= 1;
        } while (blue < i5);
        RandomAccessFile randomAccessFile = this.alpha;
        randomAccessFile.setLength(i10);
        randomAccessFile.getChannel().force(true);
        i iVar = this.teal;
        int crimson = crimson(iVar.alpha + 4 + iVar.bravo);
        if (crimson < this.silver.alpha) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.purple);
            long j5 = crimson - 4;
            if (channel.transferTo(16L, j5, channel) != j5) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i11 = this.teal.alpha;
        int i12 = this.silver.alpha;
        if (i11 < i12) {
            int i13 = (this.purple + i11) - 16;
            gray(i10, this.red, i12, i13);
            this.teal = new i(i13, this.teal.bravo);
        } else {
            gray(i10, this.red, i12, i11);
        }
        this.purple = i10;
    }

    public final synchronized void golf(k kVar) {
        int i4 = this.silver.alpha;
        for (int i5 = 0; i5 < this.red; i5++) {
            i papa = papa(i4);
            kVar.alpha(new j(this, papa), papa.bravo);
            i4 = crimson(papa.alpha + 4 + papa.bravo);
        }
    }

    public final void gray(int i4, int i5, int i10, int i11) {
        int[] iArr = {i4, i5, i10, i11};
        byte[] bArr = this.white;
        int i12 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            green(bArr, i12, iArr[i13]);
            i12 += 4;
        }
        RandomAccessFile randomAccessFile = this.alpha;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    public final synchronized boolean juliet() {
        boolean z2;
        if (this.red == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    public final i papa(int i4) {
        if (i4 == 0) {
            return i.charlie;
        }
        RandomAccessFile randomAccessFile = this.alpha;
        randomAccessFile.seek(i4);
        return new i(i4, randomAccessFile.readInt());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.purple);
        sb2.append(", size=");
        sb2.append(this.red);
        sb2.append(", first=");
        sb2.append(this.silver);
        sb2.append(", last=");
        sb2.append(this.teal);
        sb2.append(", element lengths=[");
        try {
            golf(new Pf.j(1, sb2));
        } catch (IOException e) {
            yellow.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final synchronized void uniform() {
        try {
            if (!juliet()) {
                if (this.red == 1) {
                    echo();
                } else {
                    i iVar = this.silver;
                    int crimson = crimson(iVar.alpha + 4 + iVar.bravo);
                    azure(crimson, 0, 4, this.white);
                    int quebec = quebec(0, this.white);
                    gray(this.purple, this.red - 1, crimson, this.teal.alpha);
                    this.red--;
                    this.silver = new i(crimson, quebec);
                }
            } else {
                throw new NoSuchElementException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
