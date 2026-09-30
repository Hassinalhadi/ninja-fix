package M1;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* loaded from: classes3.dex */
public abstract class h {
    public static void alpha(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor bravo(FileDescriptor fileDescriptor) throws ErrnoException {
        return Os.dup(fileDescriptor);
    }

    public static long charlie(FileDescriptor fileDescriptor, long j5, int i4) throws ErrnoException {
        return Os.lseek(fileDescriptor, j5, i4);
    }
}
