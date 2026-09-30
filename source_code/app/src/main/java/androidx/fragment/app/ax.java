package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ax implements ah.a {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ L purple;

    public /* synthetic */ ax(L l10, int i4) {
        this.alpha = i4;
        this.purple = l10;
    }

    @Override // ah.a
    public final void charlie(Object obj) {
        int i4;
        switch (this.alpha) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    if (((Boolean) arrayList.get(i5)).booleanValue()) {
                        i4 = 0;
                    } else {
                        i4 = -1;
                    }
                    iArr[i5] = i4;
                }
                L l10 = this.purple;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) l10.coral.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                T t5 = l10.charlie;
                String str = fragmentManager$LaunchedFragmentInfo.alpha;
                ai charlie = t5.charlie(str);
                if (charlie == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                charlie.onRequestPermissionsResult(fragmentManager$LaunchedFragmentInfo.purple, strArr, iArr);
                return;
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                L l11 = this.purple;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) l11.coral.pollLast();
                if (fragmentManager$LaunchedFragmentInfo2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                T t10 = l11.charlie;
                String str2 = fragmentManager$LaunchedFragmentInfo2.alpha;
                ai charlie2 = t10.charlie(str2);
                if (charlie2 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    return;
                } else {
                    charlie2.onActivityResult(fragmentManager$LaunchedFragmentInfo2.purple, activityResult.alpha, activityResult.purple);
                    return;
                }
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                L l12 = this.purple;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) l12.coral.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                T t11 = l12.charlie;
                String str3 = fragmentManager$LaunchedFragmentInfo3.alpha;
                ai charlie3 = t11.charlie(str3);
                if (charlie3 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    return;
                } else {
                    charlie3.onActivityResult(fragmentManager$LaunchedFragmentInfo3.purple, activityResult2.alpha, activityResult2.purple);
                    return;
                }
        }
    }
}
