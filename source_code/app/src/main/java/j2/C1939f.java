package j2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: j2.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1939f {
    public final int alpha;
    public final int bravo;
    public final long charlie;
    public final long delta;

    public C1939f(int i4, int i5, long j5, long j6) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = j5;
        this.delta = j6;
    }

    public static C1939f alpha(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C1939f c1939f = new C1939f(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c1939f;
        } finally {
        }
    }

    public final void bravo(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.alpha);
            dataOutputStream.writeInt(this.bravo);
            dataOutputStream.writeLong(this.charlie);
            dataOutputStream.writeLong(this.delta);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1939f)) {
            C1939f c1939f = (C1939f) obj;
            if (this.bravo == c1939f.bravo && this.charlie == c1939f.charlie && this.alpha == c1939f.alpha && this.delta == c1939f.delta) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.bravo), Long.valueOf(this.charlie), Integer.valueOf(this.alpha), Long.valueOf(this.delta));
    }
}
