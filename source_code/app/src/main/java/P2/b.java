package P2;

import Tf.ah;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b {
    public final String alpha;
    public final long[] bravo;
    public final ArrayList charlie;
    public final ArrayList delta;
    public boolean echo;
    public boolean foxtrot;
    public C3.d golf;
    public int hotel;
    public final /* synthetic */ f india;

    public b(f fVar, String str) {
        this.india = fVar;
        this.alpha = str;
        fVar.getClass();
        this.bravo = new long[2];
        fVar.getClass();
        this.charlie = new ArrayList(2);
        fVar.getClass();
        this.delta = new ArrayList(2);
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        fVar.getClass();
        for (int i4 = 0; i4 < 2; i4++) {
            sb2.append(i4);
            this.charlie.add(this.india.alpha.foxtrot(sb2.toString()));
            sb2.append(".tmp");
            this.delta.add(this.india.alpha.foxtrot(sb2.toString()));
            sb2.setLength(length);
        }
    }

    public final c alpha() {
        if (this.echo && this.golf == null && !this.foxtrot) {
            ArrayList arrayList = this.charlie;
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                f fVar = this.india;
                if (i4 < size) {
                    if (!fVar.f1895i.exists((ah) arrayList.get(i4))) {
                        try {
                            fVar.azure(this);
                            return null;
                        } catch (IOException unused) {
                        }
                    } else {
                        i4++;
                    }
                } else {
                    this.hotel++;
                    return new c(fVar, this);
                }
            }
        }
        return null;
    }
}
