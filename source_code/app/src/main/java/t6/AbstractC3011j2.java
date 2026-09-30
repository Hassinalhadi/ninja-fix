package t6;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import sd.AbstractC2850a;

/* renamed from: t6.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3011j2 {
    public static ByteBuffer alpha(X8.a aVar) {
        Bitmap.Config config;
        boolean z2;
        int i4;
        int i5 = aVar.golf;
        int i10 = 0;
        if (i5 != -1) {
            if (i5 != 17) {
                if (i5 != 35) {
                    if (i5 == 842094169) {
                        ByteBuffer byteBuffer = aVar.bravo;
                        V5.x.hotel(byteBuffer);
                        byteBuffer.rewind();
                        int limit = byteBuffer.limit();
                        int i11 = limit / 6;
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(limit);
                        int i12 = 0;
                        while (true) {
                            i4 = i11 * 4;
                            if (i12 >= i4) {
                                break;
                            }
                            allocateDirect.put(i12, byteBuffer.get(i12));
                            i12++;
                        }
                        while (i10 < i11 + i11) {
                            allocateDirect.put(i4 + i10, byteBuffer.get((i10 / 2) + ((i10 % 2) * i11) + i4));
                            i10++;
                        }
                        return allocateDirect;
                    }
                    throw new MlKitException("Unsupported image format", 13);
                }
                Image.Plane[] alpha = aVar.alpha();
                V5.x.hotel(alpha);
                int i13 = aVar.delta;
                int i14 = aVar.echo;
                int i15 = i13 * i14;
                int i16 = i15 / 4;
                byte[] bArr = new byte[i16 + i16 + i15];
                ByteBuffer buffer = alpha[1].getBuffer();
                ByteBuffer buffer2 = alpha[2].getBuffer();
                int position = buffer2.position();
                int limit2 = buffer.limit();
                buffer2.position(position + 1);
                buffer.limit(limit2 - 1);
                int i17 = (i15 + i15) / 4;
                if (buffer2.remaining() == i17 - 2 && buffer2.compareTo(buffer) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                buffer2.position(position);
                buffer.limit(limit2);
                if (z2) {
                    alpha[0].getBuffer().get(bArr, 0, i15);
                    ByteBuffer buffer3 = alpha[1].getBuffer();
                    alpha[2].getBuffer().get(bArr, i15, 1);
                    buffer3.get(bArr, i15 + 1, i17 - 1);
                } else {
                    charlie(alpha[0], i13, i14, bArr, 0, 1);
                    charlie(alpha[1], i13, i14, bArr, i15 + 1, 2);
                    charlie(alpha[2], i13, i14, bArr, i15, 2);
                }
                return ByteBuffer.wrap(bArr);
            }
            ByteBuffer byteBuffer2 = aVar.bravo;
            V5.x.hotel(byteBuffer2);
            return byteBuffer2;
        }
        Bitmap bitmap = aVar.alpha;
        V5.x.hotel(bitmap);
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config2 = bitmap.getConfig();
            config = Bitmap.Config.HARDWARE;
            if (config2 == config) {
                bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, bitmap.isMutable());
            }
        }
        Bitmap bitmap2 = bitmap;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i18 = width * height;
        int[] iArr = new int[i18];
        bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
        int ceil = (int) Math.ceil(height / 2.0d);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(((ceil + ceil) * ((int) Math.ceil(width / 2.0d))) + i18);
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i19 < height) {
            int i22 = i10;
            while (i22 < width) {
                int i23 = iArr[i21];
                int i24 = i23 >> 16;
                int i25 = i23 >> 8;
                int i26 = i23 & 255;
                int i27 = i20 + 1;
                int i28 = i24 & 255;
                int i29 = i25 & 255;
                allocateDirect2.put(i20, (byte) Math.min(255, (A0.z.foxtrot(i26, 25, (i29 * 129) + (i28 * 66), 128) >> 8) + 16));
                if (i19 % 2 == 0 && i21 % 2 == 0) {
                    int i30 = ((((i28 * 112) - (i29 * 94)) - (i26 * 18)) + 128) >> 8;
                    int i31 = (((((i28 * (-38)) - (i29 * 74)) + (i26 * 112)) + 128) >> 8) + 128;
                    int i32 = i18 + 1;
                    allocateDirect2.put(i18, (byte) Math.min(255, i30 + 128));
                    i18 += 2;
                    allocateDirect2.put(i32, (byte) Math.min(255, i31));
                }
                i21++;
                i22++;
                i20 = i27;
            }
            i19++;
            i10 = 0;
        }
        return allocateDirect2;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [zd.r, sd.w] */
    public static final sd.w bravo(sd.x xVar) {
        int collectionSizeOrDefault;
        G3.a aVar = new G3.a(10);
        for (String str : xVar.names()) {
            List p4 = xVar.p(str);
            if (p4 == null) {
                p4 = CollectionsKt.emptyList();
            }
            String delta = AbstractC2850a.delta(0, 0, 15, str);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(p4, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = p4.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC2850a.delta(0, 0, 11, (String) it.next()));
            }
            aVar.indigo(delta, arrayList);
        }
        Map values = (Map) aVar.alpha;
        Intrinsics.echo(values, "values");
        return new zd.r(values);
    }

    public static final void charlie(Image.Plane plane, int i4, int i5, byte[] bArr, int i10, int i11) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int rowStride = ((plane.getRowStride() + buffer.limit()) - 1) / plane.getRowStride();
        if (rowStride != 0) {
            int i12 = i4 / (i5 / rowStride);
            int i13 = 0;
            for (int i14 = 0; i14 < rowStride; i14++) {
                int i15 = i13;
                for (int i16 = 0; i16 < i12; i16++) {
                    bArr[i10] = buffer.get(i15);
                    i10 += i11;
                    i15 += plane.getPixelStride();
                }
                i13 += plane.getRowStride();
            }
        }
    }
}
