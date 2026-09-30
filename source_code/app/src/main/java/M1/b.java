package M1;

import android.util.Log;
import av.q;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public class b extends InputStream implements DataInput {
    public final DataInputStream alpha;
    public int purple;
    public ByteOrder red;
    public byte[] silver;
    public final int teal;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.teal = bArr.length;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.alpha.available();
    }

    public final void charlie(int i4) {
        int i5 = 0;
        while (i5 < i4) {
            DataInputStream dataInputStream = this.alpha;
            int i10 = i4 - i5;
            int skip = (int) dataInputStream.skip(i10);
            if (skip <= 0) {
                if (this.silver == null) {
                    this.silver = new byte[8192];
                }
                skip = dataInputStream.read(this.silver, 0, Math.min(8192, i10));
                if (skip == -1) {
                    throw new EOFException(q.delta(i4, "Reached EOF while skipping ", " bytes."));
                }
            }
            i5 += skip;
        }
        this.purple += i5;
    }

    @Override // java.io.InputStream
    public final void mark(int i4) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.purple++;
        return this.alpha.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.purple++;
        return this.alpha.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.purple++;
        int read = this.alpha.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.purple += 2;
        return this.alpha.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i4, int i5) {
        this.purple += i5;
        this.alpha.readFully(bArr, i4, i5);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.purple += 4;
        DataInputStream dataInputStream = this.alpha;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.red;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.red);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j5;
        long j6;
        this.purple += 8;
        DataInputStream dataInputStream = this.alpha;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.red;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                j5 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
                j6 = read;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                j5 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
                j6 = read8;
            } else {
                throw new IOException("Invalid byte order: " + this.red);
            }
            return j5 + j6;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.purple += 2;
        DataInputStream dataInputStream = this.alpha;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.red;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.red);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.purple += 2;
        return this.alpha.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.purple++;
        return this.alpha.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.purple += 2;
        DataInputStream dataInputStream = this.alpha;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.red;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.red);
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i4) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i4, int i5) {
        int read = this.alpha.read(bArr, i4, i5);
        this.purple += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.purple += bArr.length;
        this.alpha.readFully(bArr);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.alpha = dataInputStream;
        dataInputStream.mark(0);
        this.purple = 0;
        this.red = byteOrder;
        this.teal = inputStream instanceof b ? ((b) inputStream).teal : -1;
    }
}
