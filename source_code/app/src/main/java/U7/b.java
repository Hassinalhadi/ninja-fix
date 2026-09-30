package U7;

import com.clevertap.android.sdk.cryption.DataMigrationRepository;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements FilenameFilter {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ b(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.alpha) {
            case 0:
                return str.startsWith((String) this.bravo);
            default:
                return DataMigrationRepository.alpha((DataMigrationRepository) this.bravo, file, str);
        }
    }
}
