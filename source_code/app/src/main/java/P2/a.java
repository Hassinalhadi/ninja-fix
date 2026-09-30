package P2;

import Tf.ah;
import Tf.u;
import android.os.StatFs;
import java.io.File;
import s6.J4;

/* loaded from: classes3.dex */
public final class a {
    public ah alpha;
    public u bravo;
    public double charlie;
    public long delta;
    public long echo;
    public Cf.d foxtrot;

    public final i alpha() {
        long j5;
        ah ahVar = this.alpha;
        if (ahVar != null) {
            double d4 = this.charlie;
            if (d4 > 0.0d) {
                try {
                    File golf = ahVar.golf();
                    golf.mkdir();
                    StatFs statFs = new StatFs(golf.getAbsolutePath());
                    j5 = J4.echo((long) (d4 * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.delta, this.echo);
                } catch (Exception unused) {
                    j5 = this.delta;
                }
            } else {
                j5 = 0;
            }
            return new i(j5, this.foxtrot, this.bravo, ahVar);
        }
        throw new IllegalStateException("directory == null");
    }
}
