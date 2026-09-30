package com.clevertap.android.sdk.gif;

import Q0.c;
import com.airbnb.lottie.compose.LottieConstants;
import com.clevertap.android.sdk.Logger;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes3.dex */
class GifHeaderParser {
    private static final int DEFAULT_FRAME_DELAY = 10;
    private static final int MAX_BLOCK_SIZE = 256;
    private static final int MIN_FRAME_DELAY = 2;
    private static final String TAG = "GifHeaderParser";
    private final byte[] block = new byte[256];
    private int blockSize = 0;
    private GifHeader header;
    private ByteBuffer rawData;

    private boolean err() {
        if (this.header.status != 0) {
            return true;
        }
        return false;
    }

    private int read() {
        try {
            return this.rawData.get() & 255;
        } catch (Exception unused) {
            this.header.status = 1;
            return 0;
        }
    }

    private void readBitmap() {
        boolean z2;
        this.header.currentFrame.ix = readShort();
        this.header.currentFrame.iy = readShort();
        this.header.currentFrame.iw = readShort();
        this.header.currentFrame.ih = readShort();
        int read = read();
        boolean z10 = false;
        if ((read & 128) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int pow = (int) Math.pow(2.0d, (read & 7) + 1);
        GifFrame gifFrame = this.header.currentFrame;
        if ((read & 64) != 0) {
            z10 = true;
        }
        gifFrame.interlace = z10;
        if (z2) {
            gifFrame.lct = readColorTable(pow);
        } else {
            gifFrame.lct = null;
        }
        this.header.currentFrame.bufferFrameStart = this.rawData.position();
        skipImageData();
        if (err()) {
            return;
        }
        GifHeader gifHeader = this.header;
        gifHeader.frameCount++;
        gifHeader.frames.add(gifHeader.currentFrame);
    }

    private int readBlock() {
        int read = read();
        this.blockSize = read;
        int i4 = 0;
        if (read > 0) {
            while (true) {
                try {
                    int i5 = this.blockSize;
                    if (i4 >= i5) {
                        break;
                    }
                    int i10 = i5 - i4;
                    this.rawData.get(this.block, i4, i10);
                    i4 += i10;
                } catch (Exception unused) {
                    this.header.status = 1;
                }
            }
        }
        return i4;
    }

    private int[] readColorTable(int i4) {
        byte[] bArr = new byte[i4 * 3];
        int[] iArr = null;
        try {
            this.rawData.get(bArr);
            iArr = new int[256];
            int i5 = 0;
            int i10 = 0;
            while (i5 < i4) {
                int i11 = bArr[i10] & 255;
                int i12 = i10 + 2;
                int i13 = bArr[i10 + 1] & 255;
                i10 += 3;
                int i14 = i5 + 1;
                iArr[i5] = (i13 << 8) | (i11 << 16) | ShapeBuilder.DEFAULT_SHAPE_COLOR | (bArr[i12] & 255);
                i5 = i14;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            Logger.d(TAG, "Format Error Reading Color Table", e);
            this.header.status = 1;
            return iArr;
        }
    }

    private void readContents() {
        readContents(LottieConstants.IterateForever);
    }

    private void readGraphicControlExt() {
        read();
        int read = read();
        GifFrame gifFrame = this.header.currentFrame;
        int i4 = (read & 28) >> 2;
        gifFrame.dispose = i4;
        boolean z2 = true;
        if (i4 == 0) {
            gifFrame.dispose = 1;
        }
        if ((read & 1) == 0) {
            z2 = false;
        }
        gifFrame.transparency = z2;
        int readShort = readShort();
        if (readShort < 2) {
            readShort = 10;
        }
        GifFrame gifFrame2 = this.header.currentFrame;
        gifFrame2.delay = readShort * 10;
        gifFrame2.transIndex = read();
        read();
    }

    private void readHeader() {
        String str = "";
        for (int i4 = 0; i4 < 6; i4++) {
            StringBuilder tango = c.tango(str);
            tango.append((char) read());
            str = tango.toString();
        }
        if (!str.startsWith("GIF")) {
            this.header.status = 1;
            return;
        }
        readLSD();
        if (this.header.gctFlag && !err()) {
            GifHeader gifHeader = this.header;
            gifHeader.gct = readColorTable(gifHeader.gctSize);
            GifHeader gifHeader2 = this.header;
            gifHeader2.bgColor = gifHeader2.gct[gifHeader2.bgIndex];
        }
    }

    private void readLSD() {
        boolean z2;
        this.header.width = readShort();
        this.header.height = readShort();
        int read = read();
        GifHeader gifHeader = this.header;
        if ((read & 128) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        gifHeader.gctFlag = z2;
        gifHeader.gctSize = 2 << (read & 7);
        gifHeader.bgIndex = read();
        this.header.pixelAspect = read();
    }

    private void readNetscapeExt() {
        do {
            readBlock();
            byte[] bArr = this.block;
            if (bArr[0] == 1) {
                int i4 = bArr[1] & 255;
                int i5 = bArr[2] & 255;
                GifHeader gifHeader = this.header;
                int i10 = (i5 << 8) | i4;
                gifHeader.loopCount = i10;
                if (i10 == 0) {
                    gifHeader.loopCount = -1;
                }
            }
            if (this.blockSize <= 0) {
                return;
            }
        } while (!err());
    }

    private int readShort() {
        return this.rawData.getShort();
    }

    private void reset() {
        this.rawData = null;
        Arrays.fill(this.block, (byte) 0);
        this.header = new GifHeader();
        this.blockSize = 0;
    }

    private void skip() {
        int read;
        do {
            try {
                read = read();
                ByteBuffer byteBuffer = this.rawData;
                byteBuffer.position(byteBuffer.position() + read);
            } catch (IllegalArgumentException unused) {
                return;
            }
        } while (read > 0);
    }

    private void skipImageData() {
        read();
        skip();
    }

    public void clear() {
        this.rawData = null;
        this.header = null;
    }

    public boolean isAnimated() {
        readHeader();
        if (!err()) {
            readContents(2);
        }
        if (this.header.frameCount > 1) {
            return true;
        }
        return false;
    }

    public GifHeader parseHeader() {
        if (this.rawData != null) {
            if (err()) {
                return this.header;
            }
            readHeader();
            if (!err()) {
                readContents();
                GifHeader gifHeader = this.header;
                if (gifHeader.frameCount < 0) {
                    gifHeader.status = 1;
                }
            }
            return this.header;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public GifHeaderParser setData(ByteBuffer byteBuffer) {
        reset();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.rawData = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.rawData.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    private void readContents(int i4) {
        boolean z2 = false;
        while (!z2 && !err() && this.header.frameCount <= i4) {
            int read = read();
            if (read == 33) {
                int read2 = read();
                if (read2 == 1) {
                    skip();
                } else if (read2 == 249) {
                    this.header.currentFrame = new GifFrame();
                    readGraphicControlExt();
                } else if (read2 == 254) {
                    skip();
                } else if (read2 != 255) {
                    skip();
                } else {
                    readBlock();
                    String str = "";
                    for (int i5 = 0; i5 < 11; i5++) {
                        StringBuilder tango = c.tango(str);
                        tango.append((char) this.block[i5]);
                        str = tango.toString();
                    }
                    if (str.equals("NETSCAPE2.0")) {
                        readNetscapeExt();
                    } else {
                        skip();
                    }
                }
            } else if (read == 44) {
                GifHeader gifHeader = this.header;
                if (gifHeader.currentFrame == null) {
                    gifHeader.currentFrame = new GifFrame();
                }
                readBitmap();
            } else if (read != 59) {
                this.header.status = 1;
            } else {
                z2 = true;
            }
        }
    }

    public GifHeaderParser setData(byte[] bArr) {
        if (bArr != null) {
            setData(ByteBuffer.wrap(bArr));
            return this;
        }
        this.rawData = null;
        this.header.status = 2;
        return this;
    }
}
