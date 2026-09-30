package t6;

import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* loaded from: classes2.dex */
public abstract class ad {
    /* JADX WARN: Type inference failed for: r0v6, types: [E8.d, java.lang.Object] */
    public static E8.d alpha(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length();
        long j5 = length - 22;
        long j6 = 0;
        if (j5 >= 0) {
            long j7 = length - 65558;
            if (j7 >= 0) {
                j6 = j7;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(j5);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    ?? obj = new Object();
                    obj.bravo = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    obj.alpha = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    return obj;
                }
                j5--;
            } while (j5 >= j6);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    public static boolean bravo(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
