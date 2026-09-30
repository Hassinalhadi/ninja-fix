package com.clevertap.android.sdk.gif;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.clevertap.android.sdk.Logger;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class GifDecoder {
    private static final int BYTES_PER_INTEGER = 4;
    private static final int DISPOSAL_BACKGROUND = 2;
    private static final int DISPOSAL_NONE = 1;
    private static final int DISPOSAL_PREVIOUS = 3;
    private static final int DISPOSAL_UNSPECIFIED = 0;
    private static final int INITIAL_FRAME_POINTER = -1;
    static final int LOOP_FOREVER = -1;
    private static final int MAX_STACK_SIZE = 4096;
    private static final int NULL_CODE = -1;
    static final int STATUS_FORMAT_ERROR = 1;
    static final int STATUS_OK = 0;
    static final int STATUS_OPEN_ERROR = 2;
    static final int STATUS_PARTIAL_DECODE = 3;
    private static final String TAG = "GifDecoder";
    private static final int WORK_BUFFER_SIZE = 16384;
    private int[] act;
    private final BitmapProvider bitmapProvider;
    private byte[] block;
    private int downsampledHeight;
    private int downsampledWidth;
    private int framePointer;
    private GifHeader header;
    private boolean isFirstFrameTransparent;
    private int loopIndex;
    private byte[] mainPixels;
    private int[] mainScratch;
    private GifHeaderParser parser;
    private final int[] pct;
    private byte[] pixelStack;
    private short[] prefix;
    private Bitmap previousImage;
    private ByteBuffer rawData;
    private int sampleSize;
    private boolean savePrevious;
    private int status;
    private byte[] suffix;
    private byte[] workBuffer;
    private int workBufferPosition;
    private int workBufferSize;

    /* loaded from: classes3.dex */
    public interface BitmapProvider {
        Bitmap obtain(int i4, int i5, Bitmap.Config config);

        byte[] obtainByteArray(int i4);

        int[] obtainIntArray(int i4);

        void release(Bitmap bitmap);

        void release(byte[] bArr);

        void release(int[] iArr);
    }

    public GifDecoder(BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer) {
        this(bitmapProvider, gifHeader, byteBuffer, 1);
    }

    private int averageColorsNear(int i4, int i5, int i10) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = i4; i16 < this.sampleSize + i4; i16++) {
            byte[] bArr = this.mainPixels;
            if (i16 >= bArr.length || i16 >= i5) {
                break;
            }
            int i17 = this.act[bArr[i16] & 255];
            if (i17 != 0) {
                i11 += (i17 >> 24) & 255;
                i12 += (i17 >> 16) & 255;
                i13 += (i17 >> 8) & 255;
                i14 += i17 & 255;
                i15++;
            }
        }
        int i18 = i4 + i10;
        for (int i19 = i18; i19 < this.sampleSize + i18; i19++) {
            byte[] bArr2 = this.mainPixels;
            if (i19 >= bArr2.length || i19 >= i5) {
                break;
            }
            int i20 = this.act[bArr2[i19] & 255];
            if (i20 != 0) {
                i11 += (i20 >> 24) & 255;
                i12 += (i20 >> 16) & 255;
                i13 += (i20 >> 8) & 255;
                i14 += i20 & 255;
                i15++;
            }
        }
        if (i15 == 0) {
            return 0;
        }
        return ((i11 / i15) << 24) | ((i12 / i15) << 16) | ((i13 / i15) << 8) | (i14 / i15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v43, types: [short] */
    /* JADX WARN: Type inference failed for: r1v47 */
    private void decodeBitmapData(GifFrame gifFrame) {
        int i4;
        int i5;
        byte b2;
        int i10;
        short s3;
        byte b4 = 0;
        this.workBufferSize = 0;
        this.workBufferPosition = 0;
        if (gifFrame != null) {
            this.rawData.position(gifFrame.bufferFrameStart);
        }
        if (gifFrame == null) {
            GifHeader gifHeader = this.header;
            i4 = gifHeader.width;
            i5 = gifHeader.height;
        } else {
            i4 = gifFrame.iw;
            i5 = gifFrame.ih;
        }
        int i11 = i4 * i5;
        byte[] bArr = this.mainPixels;
        if (bArr == null || bArr.length < i11) {
            this.mainPixels = this.bitmapProvider.obtainByteArray(i11);
        }
        if (this.prefix == null) {
            this.prefix = new short[4096];
        }
        if (this.suffix == null) {
            this.suffix = new byte[4096];
        }
        if (this.pixelStack == null) {
            this.pixelStack = new byte[4097];
        }
        int readByte = readByte();
        boolean z2 = true;
        int i12 = 1 << readByte;
        int i13 = i12 + 1;
        int i14 = i12 + 2;
        int i15 = readByte + 1;
        int i16 = (1 << i15) - 1;
        for (int i17 = 0; i17 < i12; i17++) {
            this.prefix[i17] = 0;
            this.suffix[i17] = (byte) i17;
        }
        int i18 = -1;
        int i19 = i15;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = i14;
        int i29 = i16;
        int i30 = -1;
        while (true) {
            b2 = b4;
            if (i20 >= i11) {
                break;
            }
            if (i21 == 0) {
                i21 = readBlock();
                if (i21 <= 0) {
                    this.status = 3;
                    break;
                }
                i24 = b2;
            }
            boolean z10 = z2;
            i23 += (this.block[i24] & 255) << i22;
            i22 += 8;
            i24++;
            i21 += i18;
            int i31 = i28;
            int i32 = i30;
            int i33 = i19;
            int i34 = i27;
            while (i22 >= i33) {
                int i35 = i23 & i29;
                i23 >>= i33;
                i22 -= i33;
                if (i35 == i12) {
                    i33 = i15;
                    i31 = i14;
                    i29 = i16;
                    i32 = -1;
                } else {
                    if (i35 > i31) {
                        i10 = i15;
                        this.status = 3;
                    } else {
                        i10 = i15;
                        if (i35 != i13) {
                            if (i32 == -1) {
                                this.pixelStack[i26] = this.suffix[i35];
                                i32 = i35;
                                i34 = i32;
                                i26++;
                                i15 = i10;
                            } else {
                                if (i35 >= i31) {
                                    this.pixelStack[i26] = (byte) i34;
                                    s3 = i32;
                                    i26++;
                                } else {
                                    s3 = i35;
                                }
                                while (s3 >= i12) {
                                    char c3 = s3;
                                    this.pixelStack[i26] = this.suffix[c3];
                                    s3 = this.prefix[c3];
                                    i26++;
                                }
                                char c4 = s3;
                                byte[] bArr2 = this.suffix;
                                int i36 = bArr2[c4] & 255;
                                int i37 = i26 + 1;
                                byte b6 = (byte) i36;
                                this.pixelStack[i26] = b6;
                                if (i31 < 4096) {
                                    this.prefix[i31] = (short) i32;
                                    bArr2[i31] = b6;
                                    i31++;
                                    if ((i31 & i29) == 0) {
                                        if (i31 < 4096) {
                                            i33++;
                                            i29 += i31;
                                        }
                                    }
                                }
                                while (i37 > 0) {
                                    i37--;
                                    this.mainPixels[i25] = this.pixelStack[i37];
                                    i20++;
                                    i25++;
                                }
                                i32 = i35;
                                i34 = i36;
                                i15 = i10;
                                i26 = i37;
                            }
                        }
                    }
                    i30 = i32;
                    i28 = i31;
                    i19 = i33;
                    i15 = i10;
                    b4 = b2;
                    i27 = i34;
                    break;
                }
            }
            i27 = i34;
            i15 = i15;
            i30 = i32;
            i28 = i31;
            i19 = i33;
            b4 = b2;
            i18 = -1;
            z2 = z10;
        }
        for (int i38 = i25; i38 < i11; i38++) {
            this.mainPixels[i38] = b2;
        }
    }

    private void fillRect(int[] iArr, GifFrame gifFrame, int i4) {
        int i5 = gifFrame.ih;
        int i10 = this.sampleSize;
        int i11 = i5 / i10;
        int i12 = gifFrame.iy / i10;
        int i13 = gifFrame.iw / i10;
        int i14 = gifFrame.ix / i10;
        int i15 = this.downsampledWidth;
        int i16 = (i12 * i15) + i14;
        int i17 = (i11 * i15) + i16;
        while (i16 < i17) {
            int i18 = i16 + i13;
            for (int i19 = i16; i19 < i18; i19++) {
                iArr[i19] = i4;
            }
            i16 += this.downsampledWidth;
        }
    }

    private GifHeaderParser getHeaderParser() {
        if (this.parser == null) {
            this.parser = new GifHeaderParser();
        }
        return this.parser;
    }

    private Bitmap getNextBitmap() {
        Bitmap.Config config;
        if (this.isFirstFrameTransparent) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap obtain = this.bitmapProvider.obtain(this.downsampledWidth, this.downsampledHeight, config);
        setAlpha(obtain);
        return obtain;
    }

    private int readBlock() {
        int readByte = readByte();
        if (readByte > 0) {
            try {
                if (this.block == null) {
                    this.block = this.bitmapProvider.obtainByteArray(255);
                }
                int i4 = this.workBufferSize;
                int i5 = this.workBufferPosition;
                int i10 = i4 - i5;
                if (i10 >= readByte) {
                    System.arraycopy(this.workBuffer, i5, this.block, 0, readByte);
                    this.workBufferPosition += readByte;
                    return readByte;
                }
                if (this.rawData.remaining() + i10 >= readByte) {
                    System.arraycopy(this.workBuffer, this.workBufferPosition, this.block, 0, i10);
                    this.workBufferPosition = this.workBufferSize;
                    readChunkIfNeeded();
                    int i11 = readByte - i10;
                    System.arraycopy(this.workBuffer, 0, this.block, i10, i11);
                    this.workBufferPosition += i11;
                    return readByte;
                }
                this.status = 1;
                return readByte;
            } catch (Exception e) {
                Logger.d(TAG, "Error Reading Block", e);
                this.status = 1;
            }
        }
        return readByte;
    }

    private int readByte() {
        try {
            readChunkIfNeeded();
            byte[] bArr = this.workBuffer;
            int i4 = this.workBufferPosition;
            this.workBufferPosition = i4 + 1;
            return bArr[i4] & 255;
        } catch (Exception unused) {
            this.status = 1;
            return 0;
        }
    }

    private void readChunkIfNeeded() {
        if (this.workBufferSize > this.workBufferPosition) {
            return;
        }
        if (this.workBuffer == null) {
            this.workBuffer = this.bitmapProvider.obtainByteArray(16384);
        }
        this.workBufferPosition = 0;
        int min = Math.min(this.rawData.remaining(), 16384);
        this.workBufferSize = min;
        this.rawData.get(this.workBuffer, 0, min);
    }

    @TargetApi(12)
    private static void setAlpha(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r4.bgIndex == r19.transIndex) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Bitmap setPixels(GifFrame gifFrame, GifFrame gifFrame2) {
        boolean z2;
        int[] iArr;
        int i4;
        int i5;
        int averageColorsNear;
        int i10;
        int i11;
        int[] iArr2 = this.mainScratch;
        int i12 = 0;
        if (gifFrame2 == null) {
            Arrays.fill(iArr2, 0);
        }
        int i13 = 3;
        int i14 = 2;
        int i15 = 1;
        if (gifFrame2 != null && (i10 = gifFrame2.dispose) > 0) {
            if (i10 == 2) {
                if (!gifFrame.transparency) {
                    GifHeader gifHeader = this.header;
                    i11 = gifHeader.bgColor;
                    if (gifFrame.lct != null) {
                    }
                    fillRect(iArr2, gifFrame2, i11);
                } else if (this.framePointer == 0) {
                    this.isFirstFrameTransparent = true;
                }
                i11 = 0;
                fillRect(iArr2, gifFrame2, i11);
            } else if (i10 == 3) {
                Bitmap bitmap = this.previousImage;
                if (bitmap == null) {
                    fillRect(iArr2, gifFrame2, 0);
                } else {
                    int i16 = gifFrame2.ih;
                    int i17 = this.sampleSize;
                    int i18 = i16 / i17;
                    int i19 = gifFrame2.iy / i17;
                    int i20 = gifFrame2.iw / i17;
                    int i21 = gifFrame2.ix / i17;
                    int i22 = this.downsampledWidth;
                    bitmap.getPixels(iArr2, (i19 * i22) + i21, i22, i21, i19, i20, i18);
                }
            }
        }
        int[] iArr3 = iArr2;
        decodeBitmapData(gifFrame);
        int i23 = gifFrame.ih;
        int i24 = this.sampleSize;
        int i25 = i23 / i24;
        int i26 = gifFrame.iy / i24;
        int i27 = gifFrame.iw / i24;
        int i28 = gifFrame.ix / i24;
        if (this.framePointer == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i29 = 8;
        int i30 = 0;
        int i31 = 1;
        while (i12 < i25) {
            if (gifFrame.interlace) {
                if (i30 >= i25) {
                    i31++;
                    if (i31 != i14) {
                        if (i31 != i13) {
                            if (i31 == 4) {
                                i29 = i14;
                                i30 = i15;
                            }
                        } else {
                            i30 = i14;
                            i29 = 4;
                        }
                    } else {
                        i30 = 4;
                    }
                }
                i5 = i30 + i29;
            } else {
                i5 = i30;
                i30 = i12;
            }
            int i32 = i30 + i26;
            if (i32 < this.downsampledHeight) {
                int i33 = this.downsampledWidth;
                int i34 = i32 * i33;
                int i35 = i34 + i28;
                int i36 = i35 + i27;
                if (i34 + i33 < i36) {
                    i36 = i34 + i33;
                }
                int i37 = this.sampleSize;
                int i38 = i12 * i37 * gifFrame.iw;
                int i39 = ((i36 - i35) * i37) + i38;
                int i40 = i35;
                while (i40 < i36) {
                    int[] iArr4 = iArr3;
                    int i41 = i25;
                    if (this.sampleSize == 1) {
                        averageColorsNear = this.act[this.mainPixels[i38] & 255];
                    } else {
                        averageColorsNear = averageColorsNear(i38, i39, gifFrame.iw);
                    }
                    if (averageColorsNear != 0) {
                        iArr4[i40] = averageColorsNear;
                    } else if (!this.isFirstFrameTransparent && z2) {
                        this.isFirstFrameTransparent = true;
                    }
                    i38 += this.sampleSize;
                    i40++;
                    iArr3 = iArr4;
                    i25 = i41;
                }
            }
            i12++;
            iArr3 = iArr3;
            i30 = i5;
            i25 = i25;
            i13 = 3;
            i14 = 2;
            i15 = 1;
        }
        int[] iArr5 = iArr3;
        if (!this.savePrevious || ((i4 = gifFrame.dispose) != 0 && i4 != 1)) {
            iArr = iArr5;
        } else {
            if (this.previousImage == null) {
                this.previousImage = getNextBitmap();
            }
            Bitmap bitmap2 = this.previousImage;
            int i42 = this.downsampledWidth;
            iArr = iArr5;
            bitmap2.setPixels(iArr, 0, i42, 0, 0, i42, this.downsampledHeight);
        }
        Bitmap nextBitmap = getNextBitmap();
        int i43 = this.downsampledWidth;
        nextBitmap.setPixels(iArr, 0, i43, 0, 0, i43, this.downsampledHeight);
        return nextBitmap;
    }

    public boolean advance() {
        if (this.header.frameCount <= 0) {
            return false;
        }
        if (this.framePointer == getFrameCount() - 1) {
            this.loopIndex++;
        }
        GifHeader gifHeader = this.header;
        int i4 = gifHeader.loopCount;
        if (i4 != -1 && this.loopIndex > i4) {
            return false;
        }
        this.framePointer = (this.framePointer + 1) % gifHeader.frameCount;
        return true;
    }

    public void clear() {
        this.header = null;
        byte[] bArr = this.mainPixels;
        if (bArr != null) {
            this.bitmapProvider.release(bArr);
        }
        int[] iArr = this.mainScratch;
        if (iArr != null) {
            this.bitmapProvider.release(iArr);
        }
        Bitmap bitmap = this.previousImage;
        if (bitmap != null) {
            this.bitmapProvider.release(bitmap);
        }
        this.previousImage = null;
        this.rawData = null;
        this.isFirstFrameTransparent = false;
        byte[] bArr2 = this.block;
        if (bArr2 != null) {
            this.bitmapProvider.release(bArr2);
        }
        byte[] bArr3 = this.workBuffer;
        if (bArr3 != null) {
            this.bitmapProvider.release(bArr3);
        }
    }

    public int getByteSize() {
        return (this.mainScratch.length * 4) + this.rawData.limit() + this.mainPixels.length;
    }

    public int getCurrentFrameIndex() {
        return this.framePointer;
    }

    public ByteBuffer getData() {
        return this.rawData;
    }

    public int getDelay(int i4) {
        if (i4 >= 0) {
            GifHeader gifHeader = this.header;
            if (i4 < gifHeader.frameCount) {
                return gifHeader.frames.get(i4).delay;
            }
            return -1;
        }
        return -1;
    }

    public int getFrameCount() {
        return this.header.frameCount;
    }

    public int getHeight() {
        return this.header.height;
    }

    public int getLoopCount() {
        return this.header.loopCount;
    }

    public int getLoopIndex() {
        return this.loopIndex;
    }

    public int getNextDelay() {
        int i4;
        if (this.header.frameCount > 0 && (i4 = this.framePointer) >= 0) {
            return getDelay(i4);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:4:0x0007, B:6:0x000e, B:9:0x0037, B:14:0x0040, B:16:0x0054, B:17:0x0060, B:20:0x0069, B:22:0x006d, B:26:0x0084, B:28:0x0088, B:29:0x0096, B:32:0x0065, B:34:0x009c, B:37:0x0016), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:4:0x0007, B:6:0x000e, B:9:0x0037, B:14:0x0040, B:16:0x0054, B:17:0x0060, B:20:0x0069, B:22:0x006d, B:26:0x0084, B:28:0x0088, B:29:0x0096, B:32:0x0065, B:34:0x009c, B:37:0x0016), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[Catch: all -> 0x0013, TRY_ENTER, TryCatch #0 {all -> 0x0013, blocks: (B:4:0x0007, B:6:0x000e, B:9:0x0037, B:14:0x0040, B:16:0x0054, B:17:0x0060, B:20:0x0069, B:22:0x006d, B:26:0x0084, B:28:0x0088, B:29:0x0096, B:32:0x0065, B:34:0x009c, B:37:0x0016), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:4:0x0007, B:6:0x000e, B:9:0x0037, B:14:0x0040, B:16:0x0054, B:17:0x0060, B:20:0x0069, B:22:0x006d, B:26:0x0084, B:28:0x0088, B:29:0x0096, B:32:0x0065, B:34:0x009c, B:37:0x0016), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized Bitmap getNextFrame() {
        int i4;
        int i5;
        GifFrame gifFrame;
        int[] iArr;
        try {
            if (this.header.frameCount > 0) {
                if (this.framePointer < 0) {
                }
                i4 = this.status;
                if (i4 != 1 && i4 != 2) {
                    this.status = 0;
                    GifFrame gifFrame2 = this.header.frames.get(this.framePointer);
                    i5 = this.framePointer - 1;
                    if (i5 < 0) {
                        gifFrame = this.header.frames.get(i5);
                    } else {
                        gifFrame = null;
                    }
                    iArr = gifFrame2.lct;
                    if (iArr != null) {
                        iArr = this.header.gct;
                    }
                    this.act = iArr;
                    if (iArr != null) {
                        Logger.d(TAG, "No Valid Color Table for frame #" + this.framePointer);
                        this.status = 1;
                        return null;
                    }
                    if (gifFrame2.transparency) {
                        System.arraycopy(iArr, 0, this.pct, 0, iArr.length);
                        int[] iArr2 = this.pct;
                        this.act = iArr2;
                        iArr2[gifFrame2.transIndex] = 0;
                    }
                    return setPixels(gifFrame2, gifFrame);
                }
                Logger.d(TAG, "Unable to decode frame, status=" + this.status);
                return null;
            }
            Logger.d(TAG, "unable to decode frame, frameCount=" + this.header.frameCount + " framePointer=" + this.framePointer);
            this.status = 1;
            i4 = this.status;
            if (i4 != 1) {
                this.status = 0;
                GifFrame gifFrame22 = this.header.frames.get(this.framePointer);
                i5 = this.framePointer - 1;
                if (i5 < 0) {
                }
                iArr = gifFrame22.lct;
                if (iArr != null) {
                }
                this.act = iArr;
                if (iArr != null) {
                }
            }
            Logger.d(TAG, "Unable to decode frame, status=" + this.status);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public int getStatus() {
        return this.status;
    }

    public int getWidth() {
        return this.header.width;
    }

    public int read(InputStream inputStream, int i4) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i4 > 0 ? i4 + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                Logger.d(TAG, "Error reading data from stream", e);
            }
        } else {
            this.status = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e4) {
                Logger.d(TAG, "Error closing stream", e4);
            }
        }
        return this.status;
    }

    public void resetFrameIndex() {
        this.framePointer = -1;
    }

    public void resetLoopIndex() {
        this.loopIndex = 0;
    }

    public synchronized void setData(GifHeader gifHeader, byte[] bArr) {
        setData(gifHeader, ByteBuffer.wrap(bArr));
    }

    public boolean setFrameIndex(int i4) {
        if (i4 >= -1 && i4 < getFrameCount()) {
            this.framePointer = i4;
            return true;
        }
        return false;
    }

    public GifDecoder(BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i4) {
        this(bitmapProvider);
        setData(gifHeader, byteBuffer, i4);
    }

    public synchronized void setData(GifHeader gifHeader, ByteBuffer byteBuffer) {
        setData(gifHeader, byteBuffer, 1);
    }

    public GifDecoder(BitmapProvider bitmapProvider) {
        this.pct = new int[Barcode.FORMAT_QR_CODE];
        this.workBufferPosition = 0;
        this.workBufferSize = 0;
        this.bitmapProvider = bitmapProvider;
        this.header = new GifHeader();
    }

    public synchronized void setData(GifHeader gifHeader, ByteBuffer byteBuffer, int i4) {
        try {
            if (i4 > 0) {
                int highestOneBit = Integer.highestOneBit(i4);
                this.status = 0;
                this.header = gifHeader;
                this.isFirstFrameTransparent = false;
                this.framePointer = -1;
                resetLoopIndex();
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.rawData = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.rawData.order(ByteOrder.LITTLE_ENDIAN);
                this.savePrevious = false;
                Iterator<GifFrame> it = gifHeader.frames.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().dispose == 3) {
                        this.savePrevious = true;
                        break;
                    }
                }
                this.sampleSize = highestOneBit;
                int i5 = gifHeader.width;
                this.downsampledWidth = i5 / highestOneBit;
                int i10 = gifHeader.height;
                this.downsampledHeight = i10 / highestOneBit;
                this.mainPixels = this.bitmapProvider.obtainByteArray(i5 * i10);
                this.mainScratch = this.bitmapProvider.obtainIntArray(this.downsampledWidth * this.downsampledHeight);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public GifDecoder() {
        this(new SimpleBitmapProvider());
    }

    public synchronized int read(byte[] bArr) {
        try {
            GifHeader parseHeader = getHeaderParser().setData(bArr).parseHeader();
            this.header = parseHeader;
            if (bArr != null) {
                setData(parseHeader, bArr);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.status;
    }
}
